package o;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class kl8 {
    public static final jx4 a;

    static {
        long[] jArr = ti6.a;
        a = new jx4();
    }

    public static final n01 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof n01) {
            return (n01) tag;
        }
        return null;
    }

    public static final p56 b(View view) {
        de1 de1Var;
        ml mlVar;
        if (!view.isAttachedToWindow()) {
            ki3.c("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objQ = i67.q(view);
        while (objQ instanceof View) {
            View view2 = (View) objQ;
            if (view2.getId() == 16908290) {
                break;
            }
            objQ = view2.getParent();
            view = view2;
        }
        n01 n01VarA = a(view);
        hc1 hc1Var = null;
        if (n01VarA != null) {
            if (n01VarA instanceof p56) {
                return (p56) n01VarA;
            }
            hk0.l("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((hl8) il8.a.get()).getClass();
        de1 de1Var2 = ba2.m;
        kh7 kh7Var = kl.y;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            de1Var = (de1) kl.y.getValue();
        } else {
            de1Var = (de1) kl.z.get();
            if (de1Var == null) {
                hk0.l("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        de1 de1VarH0 = de1Var.H0(de1Var2);
        ml mlVar2 = (ml) de1VarH0.l0(yl7.E);
        if (mlVar2 != null) {
            mlVar = new ml(mlVar2);
            io.sentry.z7 z7Var = (io.sentry.z7) mlVar.f1480o;
            synchronized (z7Var.b) {
                z7Var.a = false;
            }
        } else {
            mlVar = null;
        }
        k76 k76Var = new k76();
        de1 wt4Var = (ut4) de1VarH0.l0(jk0.D);
        if (wt4Var == null) {
            wt4Var = new wt4(view.getContext().getApplicationContext());
            k76Var.m = wt4Var;
        }
        if (mlVar != null) {
            de1Var2 = mlVar;
        }
        de1 de1VarH1 = de1VarH0.H0(de1Var2).H0(wt4Var);
        p56 p56Var = new p56(de1VarH1);
        synchronized (p56Var.c) {
            p56Var.t = true;
        }
        fc1 fc1VarC = hm3.c(de1VarH1);
        LifecycleOwner lifecycleOwnerL = n67.l(view);
        x84 r = lifecycleOwnerL != null ? lifecycleOwnerL.getR() : null;
        if (r == null) {
            ki3.d("ViewTreeLifecycleOwner not found from " + view);
            hk0.b();
            return null;
        }
        view.addOnAttachStateChangeListener(new eu2(view, p56Var));
        r.a(new lu2(fc1VarC, mlVar, p56Var, k76Var));
        view.setTag(R.id.androidx_compose_ui_view_composition_context, p56Var);
        iz2 iz2Var = iz2.m;
        Handler handler = view.getHandler();
        int i = r43.a;
        view.addOnAttachStateChangeListener(new a0(im3.R(iz2Var, new q43(handler, "windowRecomposer cleanup", false).r, null, new mf7(p56Var, view, hc1Var, (byte) 11), 2), (byte) 7));
        return p56Var;
    }
}
