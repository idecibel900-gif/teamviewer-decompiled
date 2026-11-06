package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qn5 implements ds4 {
    public rl b;
    public h16 c;
    public boolean d;
    public final pn5 e;

    public qn5() {
        pn5 pn5Var = new pn5();
        pn5Var.p = this;
        pn5Var.n = on5.m;
        this.e = pn5Var;
    }

    public final Function1 e() {
        rl rlVar = this.b;
        if (rlVar != null) {
            return rlVar;
        }
        im3.e0("onTouchEvent");
        throw null;
    }
}
