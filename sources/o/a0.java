package o;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.teamviewer.commonuilib.view.OpenGLView;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ a0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                view.getClass();
                b0 b0Var = (b0) obj;
                ArrayList arrayList = b0Var.H;
                if (!arrayList.isEmpty() && !((VoidSignalCallback) arrayList.get(0)).IsConnected()) {
                    Object obj2 = b0Var.G;
                    VoidSignalCallback[] voidSignalCallbackArr = (VoidSignalCallback[]) arrayList.toArray(new VoidSignalCallback[0]);
                    b0Var.t(obj2, (VoidSignalCallback[]) Arrays.copyOf(voidSignalCallbackArr, voidSignalCallbackArr.length));
                    b0Var.s(b0Var.G, false);
                    break;
                }
                break;
            case 1:
                ui uiVar = (ui) obj;
                Context context = view.getContext();
                if (!uiVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(uiVar.f);
                    uiVar.d = true;
                }
                break;
            case 2:
                view.getClass();
                nd ndVar = (nd) obj;
                OpenGLView openGLView = (OpenGLView) ndVar.f1562o;
                int i = ndVar.n;
                ndVar.n = i;
                if (i == 0) {
                    Object parent = openGLView.getParent();
                    while (parent != null) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getVisibility() == 0) {
                                parent = view2.getParent();
                            }
                            break;
                        }
                    }
                }
                openGLView.setVisibility(ndVar.n);
                break;
            case 4:
                View view3 = (View) obj;
                view3.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = be8.a;
                view3.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                view.getClass();
                Iterator it = ((b0) obj).H.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    ((VoidSignalCallback) next).Disconnect();
                }
                break;
            case 1:
                ui uiVar = (ui) obj;
                Context context = view.getContext();
                if (uiVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(uiVar.f);
                    uiVar.d = false;
                }
                uiVar.d();
                break;
            case 2:
                view.getClass();
                break;
            case 3:
                fm0 fm0Var = (fm0) obj;
                ViewTreeObserver viewTreeObserver = fm0Var.J;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fm0Var.J = view.getViewTreeObserver();
                    }
                    fm0Var.J.removeGlobalOnLayoutListener(fm0Var.u);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                break;
            case 5:
                r87 r87Var = (r87) obj;
                ViewTreeObserver viewTreeObserver2 = r87Var.A;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        r87Var.A = view.getViewTreeObserver();
                    }
                    r87Var.A.removeGlobalOnLayoutListener(r87Var.u);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                u0 u0Var = (u0) obj;
                for (Object obj2 : bq6.h0(u0Var.getParent(), ke8.n)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                u0Var.e();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((n87) obj).j(null);
                break;
        }
    }
}
