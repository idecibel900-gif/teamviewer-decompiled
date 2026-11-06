package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t04 implements eo4 {
    public final /* synthetic */ eo4 a;
    public final int b;
    public final int c;

    public t04(eo4 eo4Var, u04 u04Var) {
        this.a = eo4Var;
        s04 s04Var = u04Var.s0;
        s04Var.getClass();
        this.b = s04Var.m;
        s04 s04Var2 = u04Var.s0;
        s04Var2.getClass();
        this.c = s04Var2.n;
    }

    @Override // o.eo4
    public final int a() {
        return this.c;
    }

    @Override // o.eo4
    public final int b() {
        return this.b;
    }

    @Override // o.eo4
    public final Map c() {
        return this.a.c();
    }

    @Override // o.eo4
    public final void d() {
        this.a.d();
    }

    @Override // o.eo4
    public final Function1 e() {
        return this.a.e();
    }

    @Override // o.eo4
    public final hw2 f() {
        return this.a.f();
    }

    @Override // o.eo4
    public final Function1 g() {
        return this.a.g();
    }
}
