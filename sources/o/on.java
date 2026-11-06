package o;

/* JADX INFO: loaded from: classes.dex */
public final class on extends v04 {
    public n18 A;
    public px4 B;
    public pn C;
    public jl5 D;
    public jl5 E;
    public long F = 0;
    public long G = 0;
    public final nn H = new nn(this, (byte) 1);
    public final nn I = new nn(this, (byte) 0);
    public long J = -9223372034707292160L;

    public on(n18 n18Var, px4 px4Var, pn pnVar) {
        this.A = n18Var;
        this.B = px4Var;
        this.C = pnVar;
    }

    @Override // o.es4
    public final void O0() {
        this.J = -9223372034707292160L;
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        long j2;
        jl5 jl5VarC = zn4Var.C(j);
        if (fo4Var.b0()) {
            j2 = (((long) jl5VarC.m) << 32) | (((long) jl5VarC.n) & 4294967295L);
        } else {
            n18 n18Var = this.A;
            int i = jl5VarC.m;
            if (n18Var == null) {
                j2 = (((long) i) << 32) | (((long) jl5VarC.n) & 4294967295L);
                this.J = j2;
            } else {
                long j3 = (((long) jl5VarC.n) & 4294967295L) | (((long) i) << 32);
                m18 m18VarA = n18Var.a(new nn(this, j3), null, null, new yb2(this, j3, (byte) 3));
                j2 = ((dl3) m18VarA.getValue()).a;
                this.J = ((dl3) m18VarA.getValue()).a;
            }
        }
        boolean zB0 = fo4Var.b0();
        fa2 fa2Var = fa2.m;
        if (zB0) {
            this.D = jl5VarC;
            this.F = j2;
            return fo4Var.u((int) (j2 >> 32), (int) (j2 & 4294967295L), fa2Var, this.H);
        }
        this.E = jl5VarC;
        this.G = j2;
        return fo4Var.u((int) (j2 >> 32), (int) (j2 & 4294967295L), fa2Var, this.I);
    }
}
