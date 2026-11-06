package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.a8;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.e8;
import io.sentry.f6;
import io.sentry.f8;
import io.sentry.g1;
import io.sentry.h2;
import io.sentry.n1;
import io.sentry.p0;
import io.sentry.p7;
import io.sentry.protocol.h0;
import io.sentry.q7;
import io.sentry.x1;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import o.e41;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements GestureDetector.OnGestureListener {
    public final WeakReference a;
    public final n1 b;
    public final SentryAndroidOptions c;
    public io.sentry.internal.gestures.c d = null;
    public x1 e = null;
    public e f;
    public final f g;

    public g(Activity activity, n1 n1Var, SentryAndroidOptions sentryAndroidOptions) {
        e eVar = e.Unknown;
        this.f = eVar;
        f fVar = new f();
        fVar.a = eVar;
        fVar.c = 0.0f;
        fVar.d = 0.0f;
        this.g = fVar;
        this.a = new WeakReference(activity);
        this.b = n1Var;
        this.c = sentryAndroidOptions;
    }

    public final void a(io.sentry.internal.gestures.c cVar, e eVar, Map map, MotionEvent motionEvent) {
        String str;
        if (this.c.isEnableUserInteractionBreadcrumbs()) {
            int i = d.a[eVar.ordinal()];
            if (i == 1) {
                str = "click";
            } else if (i != 2) {
                str = i != 3 ? "unknown" : "swipe";
            } else {
                str = "scroll";
            }
            p0 p0Var = new p0();
            p0Var.d(motionEvent, "android:motionEvent");
            p0Var.d(cVar.a.get(), "android:view");
            String str2 = cVar.c;
            String str3 = cVar.b;
            String str4 = cVar.d;
            io.sentry.h hVar = new io.sentry.h();
            hVar.q = "user";
            hVar.s = "ui.".concat(str);
            if (str2 != null) {
                hVar.d(str2, "view.id");
            }
            if (str3 != null) {
                hVar.d(str3, "view.class");
            }
            if (str4 != null) {
                hVar.d(str4, "view.tag");
            }
            for (Map.Entry entry : map.entrySet()) {
                hVar.d(entry.getValue(), (String) entry.getKey());
            }
            hVar.u = f6.INFO;
            this.b.f(hVar, p0Var);
        }
    }

    public final View b(String str) {
        Activity activity = (Activity) this.a.get();
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, fx3.g("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, fx3.g("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            return viewPeekDecorView;
        }
        sentryAndroidOptions.getLogger().g(f6.DEBUG, fx3.g("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void c(io.sentry.internal.gestures.c cVar, e eVar) {
        String str;
        boolean z = eVar == e.Click || !(eVar == this.f && cVar.equals(this.d));
        SentryAndroidOptions sentryAndroidOptions = this.c;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        n1 n1Var = this.b;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    n1Var.r(new h2((byte) 29));
                }
                this.d = cVar;
                this.f = eVar;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str2 = cVar.c;
        if (str2 == null) {
            str2 = cVar.d;
            io.sentry.util.b.v(str2, "UiElement.tag can't be null");
        }
        x1 x1Var = this.e;
        if (x1Var != null) {
            if (!z && !x1Var.d()) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, fx3.g("The view with id: ", str2, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.e.t();
                    return;
                }
                return;
            }
            d(a8.OK);
        }
        x1[] x1VarArr = {null};
        n1Var.r(new p7(x1VarArr, (byte) 8));
        if (x1VarArr[0] != null) {
            sentryAndroidOptions.getLogger().g(f6.DEBUG, "Transaction won't be created for view with id: %s since there's already a transaction bound to the Scope.", str2);
            return;
        }
        String strL = e41.l(new StringBuilder(activity.getClass().getSimpleName()), ".", str2);
        int i = d.a[eVar.ordinal()];
        if (i == 1) {
            str = "click";
        } else if (i != 2) {
            str = i != 3 ? "unknown" : "swipe";
        } else {
            str = "scroll";
        }
        String strConcat = "ui.action.".concat(str);
        f8 f8Var = new f8();
        f8Var.f = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        f8Var.h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        f8Var.g = sentryAndroidOptions.getIdleTimeout();
        f8Var.a = true;
        f8Var.d = "auto.ui.gesture_listener.".concat(cVar.e);
        x1 x1VarP = n1Var.p(new e8(strL, h0.COMPONENT, strConcat, null), f8Var);
        n1Var.r(new q7(this, x1VarP, (byte) 5));
        this.e = x1VarP;
        this.d = cVar;
        this.f = eVar;
    }

    public final void d(a8 a8Var) {
        x1 x1Var = this.e;
        if (x1Var != null) {
            a8 status = x1Var.getStatus();
            x1 x1Var2 = this.e;
            if (status == null) {
                x1Var2.h(a8Var);
            } else {
                x1Var2.l();
            }
        }
        this.b.r(new p7(this, (byte) 7));
        this.e = null;
        if (this.d != null) {
            this.d = null;
        }
        this.f = e.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        f fVar = this.g;
        fVar.b = null;
        fVar.a = e.Unknown;
        fVar.c = 0.0f;
        fVar.d = 0.0f;
        fVar.c = motionEvent.getX();
        fVar.d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.g.a = e.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View viewB = b("onScroll");
        if (viewB != null && motionEvent != null) {
            f fVar = this.g;
            if (fVar.a == e.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                io.sentry.internal.gestures.b bVar = io.sentry.internal.gestures.b.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.c;
                io.sentry.internal.gestures.c cVarK = io.sentry.config.a.k(sentryAndroidOptions, viewB, x, y, bVar);
                if (cVarK == null) {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    fVar.a = e.Scroll;
                    return false;
                }
                g1 logger = sentryAndroidOptions.getLogger();
                f6 f6Var = f6.DEBUG;
                String str = cVarK.c;
                if (str == null) {
                    str = cVarK.d;
                    io.sentry.util.b.v(str, "UiElement.tag can't be null");
                }
                logger.g(f6Var, "Scroll target found: ".concat(str), new Object[0]);
                fVar.b = cVarK;
                fVar.a = e.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewB = b("onSingleTapUp");
        if (viewB != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            io.sentry.internal.gestures.b bVar = io.sentry.internal.gestures.b.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            io.sentry.internal.gestures.c cVarK = io.sentry.config.a.k(sentryAndroidOptions, viewB, x, y, bVar);
            if (cVarK == null) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            e eVar = e.Click;
            a(cVarK, eVar, Collections.EMPTY_MAP, motionEvent);
            c(cVarK, eVar);
        }
        return false;
    }
}
