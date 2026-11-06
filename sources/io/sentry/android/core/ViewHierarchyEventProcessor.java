package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.f6;
import io.sentry.v5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.iq8;

/* JADX INFO: loaded from: classes.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.j0 {
    public final SentryAndroidOptions a;
    public final io.sentry.android.core.internal.util.i b = new io.sentry.android.core.internal.util.i(3, 2000);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.b.a("ViewHierarchy");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(View view, io.sentry.protocol.k0 k0Var, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComposeViewHierarchyExporter composeViewHierarchyExporter = (ComposeViewHierarchyExporter) it.next();
                composeViewHierarchyExporter.getClass();
                if (view instanceof Owner) {
                    if (composeViewHierarchyExporter.b == null) {
                        io.sentry.util.a aVar = composeViewHierarchyExporter.c;
                        aVar.e();
                        try {
                            if (composeViewHierarchyExporter.b == null) {
                                composeViewHierarchyExporter.b = new io.sentry.internal.debugmeta.c(composeViewHierarchyExporter.a, (byte) 14);
                            }
                            iq8.l(aVar, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                iq8.l(aVar, th);
                                throw th2;
                            }
                        }
                    }
                    LayoutNode root = ((Owner) view).getRoot();
                    io.sentry.internal.debugmeta.c cVar = composeViewHierarchyExporter.b;
                    cVar.getClass();
                    ComposeViewHierarchyExporter.a(cVar, k0Var, root);
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.protocol.k0 k0VarF = f(childAt);
                    arrayList.add(k0VarF);
                    e(childAt, k0VarF, list);
                }
            }
            k0Var.w = arrayList;
        }
    }

    public static io.sentry.protocol.k0 f(View view) {
        io.sentry.protocol.k0 k0Var = new io.sentry.protocol.k0();
        k0Var.n = io.sentry.config.a.o(view);
        try {
            String strU = io.sentry.config.a.u(view);
            if (strU != null) {
                k0Var.f235o = strU;
            }
        } catch (Throwable unused) {
        }
        k0Var.s = Double.valueOf(view.getX());
        k0Var.t = Double.valueOf(view.getY());
        k0Var.q = Double.valueOf(view.getWidth());
        k0Var.r = Double.valueOf(view.getHeight());
        k0Var.v = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            k0Var.u = "visible";
        } else if (visibility == 4) {
            k0Var.u = "invisible";
        } else if (visibility == 8) {
            k0Var.u = "gone";
        }
        return k0Var;
    }

    @Override // io.sentry.j0
    public final v5 b(v5 v5Var, io.sentry.p0 p0Var) {
        if (v5Var.g()) {
            SentryAndroidOptions sentryAndroidOptions = this.a;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return v5Var;
            }
            if (!io.sentry.util.b.n(p0Var)) {
                boolean zA = this.b.a();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!zA) {
                    WeakReference weakReference = (WeakReference) w0.b.a;
                    io.sentry.protocol.j0 j0Var = null;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    List<ComposeViewHierarchyExporter> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    io.sentry.util.thread.a threadChecker = sentryAndroidOptions.getThreadChecker();
                    io.sentry.g1 logger = sentryAndroidOptions.getLogger();
                    if (activity == null) {
                        logger.g(f6.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = activity.getWindow();
                        if (window == null) {
                            logger.g(f6.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            View viewPeekDecorView = window.peekDecorView();
                            if (viewPeekDecorView == null) {
                                logger.g(f6.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.c()) {
                                        ArrayList arrayList = new ArrayList(1);
                                        io.sentry.protocol.j0 j0Var2 = new io.sentry.protocol.j0("android_view_system", arrayList);
                                        io.sentry.protocol.k0 k0VarF = f(viewPeekDecorView);
                                        arrayList.add(k0VarF);
                                        e(viewPeekDecorView, k0VarF, viewHierarchyExporters);
                                        j0Var = j0Var2;
                                    } else {
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        AtomicReference atomicReference = new AtomicReference(null);
                                        activity.runOnUiThread(new y2(atomicReference, viewPeekDecorView, viewHierarchyExporters, countDownLatch, logger));
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            j0Var = (io.sentry.protocol.j0) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th) {
                                    logger.d(f6.ERROR, "Failed to process view hierarchy.", th);
                                }
                            }
                        }
                    }
                    if (j0Var != null) {
                        p0Var.e = new io.sentry.a(j0Var);
                    }
                }
            }
        }
        return v5Var;
    }

    @Override // io.sentry.j0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, io.sentry.p0 p0Var) {
        return f0Var;
    }
}
