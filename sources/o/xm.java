package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xm extends es4 implements r04 {
    public Function0 A;
    public Function1 B;
    public xu7 C;
    public boolean D;
    public final yc4 E;

    public xm(Function0 function0, rl2 rl2Var, Function1 function1, xu7 xu7Var, boolean z) {
        this.A = function0;
        this.B = function1;
        this.C = xu7Var;
        this.D = z;
        yc4 yc4Var = new yc4();
        yc4Var.m = rl2Var;
        yc4Var.n = new na0();
        yc4Var.f2598o = new na0();
        yc4Var.p = hm3.a;
        this.E = yc4Var;
    }

    public final eo4 U0(ov ovVar, zn4 zn4Var, long j) {
        boolean z = this.D;
        byte b = 2;
        fa2 fa2Var = fa2.m;
        if (!z) {
            jl5 jl5VarC = zn4Var.C(j);
            return ovVar.u(jl5VarC.m, jl5VarC.n, fa2Var, new v0(jl5VarC, (byte) 2));
        }
        zk3 zk3VarB0 = this.E.b0(((Number) this.A.a()).floatValue());
        int iF = zk3VarB0.f();
        int iC = zk3VarB0.c();
        if (!((iC >= 0) & (iF >= 0))) {
            mi3.a("width and height must be >= 0");
        }
        jl5 jl5VarC2 = zn4Var.C(t61.h(iF, iF, iC, iC));
        return ovVar.u(jl5VarC2.m, jl5VarC2.n, fa2Var, new m5(this, zk3VarB0, jl5VarC2, b));
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        jl5 jl5VarC = zn4Var.C(j);
        long j2 = (((long) jl5VarC.n) & 4294967295L) | (((long) jl5VarC.m) << 32);
        yc4 yc4Var = this.E;
        na0 na0Var = (na0) yc4Var.f2598o;
        if (!dl3.b(na0Var.b, j2)) {
            ((na0) yc4Var.n).b = !((zk3) yc4Var.p).equals(hm3.a) ? ((zk3) yc4Var.p).d() : j2;
            na0Var.b = j2;
        }
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new g0(this, jl5VarC, (byte) 10));
    }
}
