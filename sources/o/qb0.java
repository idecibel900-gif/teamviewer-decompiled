package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qb0 extends e10 {
    public gl0 a;
    public Function1 b;

    @Override // o.e10
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // o.e10
    public final void b(Throwable th) {
        gl0 gl0Var = this.a;
        if (gl0Var != null) {
            gl0Var.resumeWith(ct1.A(th));
        }
    }
}
