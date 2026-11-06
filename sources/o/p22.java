package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p22 implements t96 {
    public final Function1 m;
    public q22 n;

    public p22(Function1 function1) {
        this.m = function1;
    }

    @Override // o.t96
    public final void a() {
    }

    @Override // o.t96
    public final void b() {
        q22 q22Var = this.n;
        if (q22Var != null) {
            q22Var.a();
        }
        this.n = null;
    }

    @Override // o.t96
    public final void c() {
        this.n = (q22) this.m.invoke(ck3.B);
    }
}
