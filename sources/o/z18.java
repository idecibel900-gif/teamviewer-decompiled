package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z18 extends y18 {
    public final /* synthetic */ vw a;
    public final /* synthetic */ a28 b;

    public z18(a28 a28Var, vw vwVar) {
        this.b = a28Var;
        this.a = vwVar;
    }

    @Override // o.r18
    public final void c(s18 s18Var) {
        ((ArrayList) this.a.get(this.b.n)).remove(s18Var);
        s18Var.v(this);
    }
}
