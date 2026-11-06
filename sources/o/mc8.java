package o;

/* JADX INFO: loaded from: classes.dex */
public final class mc8 extends es4 implements t52 {
    public n18 A;
    public bc2 B;
    public hf2 C;
    public dy6 D;

    @Override // o.t52
    public final void j(d14 d14Var) {
        d14Var.a();
        n18 n18Var = this.A;
        lc8 lc8Var = new lc8(this, (byte) 0);
        dy6 dy6Var = this.D;
        m18 m18VarA = n18Var.a(lc8Var, dy6Var.a() ? new rv0(dy6Var.e) : null, null, new lc8(this, (byte) 1));
        dy6 dy6Var2 = this.D;
        long j = ((rv0) m18VarA.getValue()).a;
        cg3 cg3Var = dy6Var2.c;
        if (dy6Var2.b() && ((Boolean) ((bg5) cg3Var.g).getValue()).booleanValue()) {
            j = ((rv0) ((bg5) cg3Var.h).getValue()).a;
        }
        long j2 = j;
        if (dy6Var2.b()) {
            dy6Var2.e = j2;
        }
        if (rv0.c(j2) == 0.0f) {
            return;
        }
        t18 t18Var = this.B.a;
        t18 t18Var2 = this.C.a;
        u52.k0(d14Var, j2, 0L, 0.0f, 126);
    }
}
