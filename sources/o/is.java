package o;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class is implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ qs n;

    public /* synthetic */ is(qs qsVar, byte b) {
        this.m = b;
        this.n = qsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.m;
        qs qsVar = this.n;
        switch (b) {
            case 0:
                if ((qsVar.j0 & 1) != 0) {
                    qsVar.v(0);
                }
                if ((qsVar.j0 & 4096) != 0) {
                    qsVar.v(108);
                }
                qsVar.i0 = false;
                qsVar.j0 = 0;
                break;
            default:
                qsVar.H.showAtLocation(qsVar.G, 55, 0, 0);
                bf8 bf8Var = qsVar.J;
                if (bf8Var != null) {
                    bf8Var.b();
                }
                if (qsVar.K && (viewGroup = qsVar.L) != null && viewGroup.isLaidOut()) {
                    qsVar.G.setAlpha(0.0f);
                    bf8 bf8VarA = be8.a(qsVar.G);
                    bf8VarA.a(1.0f);
                    qsVar.J = bf8VarA;
                    bf8VarA.d(new ks(this, (byte) 0));
                } else {
                    qsVar.G.setAlpha(1.0f);
                    qsVar.G.setVisibility(0);
                }
                break;
        }
    }
}
