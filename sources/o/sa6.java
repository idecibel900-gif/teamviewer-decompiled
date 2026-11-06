package o;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class sa6 implements s84 {
    public final /* synthetic */ l84 m;
    public final /* synthetic */ k76 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ me1 f2000o;
    public final /* synthetic */ l84 p;
    public final /* synthetic */ gl0 q;
    public final /* synthetic */ my4 r;
    public final /* synthetic */ hw2 s;

    public sa6(l84 l84Var, k76 k76Var, me1 me1Var, l84 l84Var2, gl0 gl0Var, my4 my4Var, hw2 hw2Var) {
        this.m = l84Var;
        this.n = k76Var;
        this.f2000o = me1Var;
        this.p = l84Var2;
        this.q = gl0Var;
        this.r = my4Var;
        this.s = hw2Var;
    }

    @Override // o.s84
    public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
        l84 l84Var2 = this.m;
        k76 k76Var = this.n;
        if (l84Var == l84Var2) {
            k76Var.m = im3.R(this.f2000o, null, null, new tb(this.r, this.s, null, (byte) 7), 3);
            return;
        }
        if (l84Var == this.p) {
            bp3 bp3Var = (bp3) k76Var.m;
            if (bp3Var != null) {
                bp3Var.j(null);
            }
            k76Var.m = null;
        }
        if (l84Var == l84.ON_DESTROY) {
            this.q.resumeWith(f88.a);
        }
    }
}
