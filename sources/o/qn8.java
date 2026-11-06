package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qn8 extends es4 implements r04 {
    public r12 A;
    public hw2 B;

    @Override // o.r04
    public final eo4 a(final fo4 fo4Var, zn4 zn4Var, long j) {
        final jl5 jl5VarC = zn4Var.C(t61.a(this.A != r12.m ? 0 : r61.k(j), r61.i(j), this.A == r12.n ? r61.j(j) : 0, r61.h(j)));
        final int iV = ct1.v(jl5VarC.m, r61.k(j), r61.i(j));
        final int iV2 = ct1.v(jl5VarC.n, r61.j(j), r61.h(j));
        return fo4Var.u(iV, iV2, fa2.m, new Function1() { // from class: o.pn8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hw2 hw2Var = this.m.B;
                jl5 jl5Var = jl5VarC;
                il5.j((il5) obj, jl5Var, ((vk3) hw2Var.invoke(new dl3((((long) (iV - jl5Var.m)) << 32) | (((long) (iV2 - jl5Var.n)) & 4294967295L)), fo4Var.getLayoutDirection())).a);
                return f88.a;
            }
        });
    }
}
