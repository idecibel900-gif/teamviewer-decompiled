package o;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class dm0 implements Runnable {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f635o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public dm0(xc0 xc0Var, em0 em0Var, pp4 pp4Var, jp4 jp4Var) {
        this.q = xc0Var;
        this.n = em0Var;
        this.f635o = pp4Var;
        this.p = jp4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Object obj = this.q;
        Object obj2 = this.p;
        Object obj3 = this.f635o;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                fm0 fm0Var = (fm0) ((xc0) obj).n;
                pp4 pp4Var = (pp4) obj3;
                em0 em0Var = (em0) obj4;
                if (em0Var != null) {
                    fm0Var.L = true;
                    em0Var.b.c(false);
                    fm0Var.L = false;
                }
                if (pp4Var.isEnabled() && pp4Var.hasSubMenu()) {
                    ((jp4) obj2).s(pp4Var, null, 4);
                    break;
                }
                break;
            default:
                tj8.i((View) obj4, (xj8) obj3, (lh7) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public dm0(View view, xj8 xj8Var, lh7 lh7Var, ValueAnimator valueAnimator) {
        this.n = view;
        this.f635o = xj8Var;
        this.p = lh7Var;
        this.q = valueAnimator;
    }
}
