package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class el1 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ll1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q77 f722o;

    public /* synthetic */ el1(ll1 ll1Var, q77 q77Var, byte b) {
        this.m = b;
        this.n = ll1Var;
        this.f722o = q77Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        q77 q77Var = this.f722o;
        ll1 ll1Var = this.n;
        switch (b) {
            case 0:
                ll1Var.a(q77Var);
                break;
            case 1:
                if (ll1Var.b.contains(q77Var)) {
                    s77 s77Var = q77Var.a;
                    View view = q77Var.c.U;
                    view.getClass();
                    s77Var.a(view, ll1Var.a);
                }
                break;
            default:
                ll1Var.b.remove(q77Var);
                ll1Var.c.remove(q77Var);
                break;
        }
    }
}
