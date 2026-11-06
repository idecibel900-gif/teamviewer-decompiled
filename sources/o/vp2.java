package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vp2 extends es4 implements xp2 {
    public Function1 A;
    public wq2 B;

    @Override // o.xp2
    public final void D(wq2 wq2Var) {
        if (im3.n(this.B, wq2Var)) {
            return;
        }
        this.B = wq2Var;
        this.A.invoke(wq2Var);
    }
}
