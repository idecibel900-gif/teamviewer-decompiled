package o;

/* JADX INFO: loaded from: classes.dex */
public final class oh4 extends es4 implements r04 {
    public int A;
    public int B;

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        long jA;
        zn4Var.getClass();
        long jD = t61.d(j, (((long) this.A) << 32) | (((long) this.B) & 4294967295L));
        if (r61.h(j) == Integer.MAX_VALUE && r61.i(j) != Integer.MAX_VALUE) {
            int i = (int) (jD >> 32);
            int i2 = (this.B * i) / this.A;
            jA = t61.a(i, i, i2, i2);
        } else if (r61.i(j) != Integer.MAX_VALUE || r61.h(j) == Integer.MAX_VALUE) {
            int i3 = (int) (jD >> 32);
            int i4 = (int) (jD & 4294967295L);
            jA = t61.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (jD & 4294967295L);
            int i6 = (this.A * i5) / this.B;
            jA = t61.a(i6, i6, i5, i5);
        }
        jl5 jl5VarC = zn4Var.C(jA);
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new xn(jl5VarC, (byte) 3));
    }
}
