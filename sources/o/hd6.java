package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hd6 implements zp0 {
    public final Function1 a;
    public final String b;

    public hd6(String str, Function1 function1) {
        this.a = function1;
        this.b = "must return ".concat(str);
    }

    @Override // o.zp0
    public final String a(eo3 eo3Var) {
        return uf0.q(this, eo3Var);
    }

    @Override // o.zp0
    public final boolean b(eo3 eo3Var) {
        return im3.n(eo3Var.s, this.a.invoke(bp1.e(eo3Var)));
    }

    @Override // o.zp0
    public final String getDescription() {
        return this.b;
    }
}
