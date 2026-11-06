package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xb2 extends yz3 implements Function1 {
    public final /* synthetic */ ac2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i97 f2502o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ jl5 r;
    public final /* synthetic */ long s;
    public final /* synthetic */ sb2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(ac2 ac2Var, m18 m18Var, long j, long j2, long j3, jl5 jl5Var, long j4, sb2 sb2Var) {
        super(1);
        this.n = ac2Var;
        this.f2502o = m18Var;
        this.p = j2;
        this.q = j3;
        this.r = jl5Var;
        this.s = j4;
        this.t = sb2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        il5 il5Var = (il5) obj;
        ac2 ac2Var = this.n;
        dy6 dy6Var = ac2Var.G;
        long jA = 0;
        i97 i97Var = this.f2502o;
        long j = i97Var != null ? ((vk3) i97Var.getValue()).a : 0L;
        dy6Var.b();
        dy6Var.b();
        long jC = vk3.c(j, 0L);
        if (dy6Var.b()) {
            dy6Var.i = jC;
        }
        he heVar = ac2Var.K;
        if (heVar != null) {
            jA = heVar.a(this.p, this.q, j04.m);
        }
        long jC2 = vk3.c(jA, jC);
        long j2 = this.s;
        jl5 jl5Var = this.r;
        il5Var.f(jl5Var);
        jl5Var.c0(vk3.c((((long) (((int) (jC2 >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (jC2 & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), jl5Var.q), 0.0f, this.t);
        return f88.a;
    }
}
