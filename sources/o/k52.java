package o;

/* JADX INFO: loaded from: classes.dex */
public final class k52 extends es4 implements r04 {
    public nf A;
    public hw2 B;
    public gb5 C;
    public boolean D;

    @Override // o.es4
    public final void N0() {
        this.D = false;
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        jl5 jl5VarC = zn4Var.C(j);
        boolean z = true;
        if (!fo4Var.b0() || !this.D) {
            vd5 vd5Var = (vd5) this.B.invoke(new dl3((((long) jl5VarC.m) << 32) | (((long) jl5VarC.n) & 4294967295L)), new r61(j));
            uj1 uj1Var = (uj1) vd5Var.m;
            Object obj = vd5Var.n;
            nf nfVar = this.A;
            uj1 uj1VarE = nfVar.e();
            bg5 bg5Var = (bg5) nfVar.f;
            if (!im3.n(uj1VarE, uj1Var)) {
                ((bg5) nfVar.g).setValue(uj1Var);
                iy4 iy4Var = (iy4) nfVar.c;
                my4 my4Var = iy4Var.b;
                my4 my4Var2 = iy4Var.b;
                boolean zF = my4Var.f();
                if (zF) {
                    try {
                        mf mfVar = (mf) nfVar.k;
                        float f = nfVar.e().f(obj);
                        if (!Float.isNaN(f)) {
                            mfVar.a(f, 0.0f);
                            bg5Var.setValue(null);
                        }
                        ((bg5) nfVar.d).setValue(obj);
                        ((bg5) nfVar.e).setValue(obj);
                        my4Var2.j(null);
                    } catch (Throwable th) {
                        my4Var2.j(null);
                        throw th;
                    }
                }
                if (!zF) {
                    bg5Var.setValue(obj);
                }
            }
            this.D = true;
        }
        if (!fo4Var.b0() && !this.D) {
            z = false;
        }
        this.D = z;
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new m5(fo4Var, this, jl5VarC, (byte) 19));
    }
}
