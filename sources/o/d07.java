package o;

/* JADX INFO: loaded from: classes.dex */
public final class d07 extends es4 implements r04, dp6 {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public long G;
    public pw6 H;
    public boolean I;
    public long J;
    public long K;
    public byte L;
    public d04 M;
    public y46 N;

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        jl5 jl5VarC = zn4Var.C(j);
        return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new py5((Object) jl5VarC, (Object) this, (byte) 15));
    }

    @Override // o.dp6
    public final boolean f() {
        return false;
    }

    public final String toString() {
        float f = this.A;
        float f2 = this.B;
        float f3 = this.C;
        float f4 = this.D;
        float f5 = this.E;
        float f6 = this.F;
        String strD = d18.d(this.G);
        pw6 pw6Var = this.H;
        boolean z = this.I;
        String strH = rv0.h(this.J);
        String strH2 = rv0.h(this.K);
        String strF = iq8.F(this.L);
        d04 d04Var = this.M;
        StringBuilder sbN = e41.n("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        sbN.append(f3);
        sbN.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sbN.append(f4);
        sbN.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sbN.append(f5);
        sbN.append(", cameraDistance=");
        sbN.append(f6);
        sbN.append(", transformOrigin=");
        sbN.append(strD);
        sbN.append(", shape=");
        sbN.append(pw6Var);
        sbN.append(", clip=");
        sbN.append(z);
        sbN.append(", renderEffect=null, ambientShadowColor=");
        sbN.append(strH);
        sbN.append(", spotShadowColor=");
        e41.t(sbN, strH2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", strF, ", colorFilter=nulloutsets=");
        sbN.append(d04Var);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        if (this.I) {
            lp6.j(op6Var, this.H);
        }
    }
}
