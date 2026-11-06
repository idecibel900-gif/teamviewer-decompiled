package o;

/* JADX INFO: loaded from: classes2.dex */
public final class c93 extends e93 {
    public final /* synthetic */ byte d;
    public final si0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c93(kb6 kb6Var, pi0 pi0Var, vc1 vc1Var, si0 si0Var, byte b) {
        super(kb6Var, pi0Var, vc1Var);
        this.d = b;
        this.e = si0Var;
    }

    @Override // o.e93
    public final Object a(a75 a75Var, Object[] objArr) {
        byte b = this.d;
        si0 si0Var = this.e;
        switch (b) {
            case 0:
                return si0Var.a(a75Var);
            default:
                qi0 qi0Var = (qi0) si0Var.a(a75Var);
                hc1 hc1Var = (hc1) objArr[objArr.length - 1];
                try {
                    gl0 gl0Var = new gl0(1, vt1.A(hc1Var));
                    gl0Var.t();
                    gl0Var.v(new zy3(qi0Var, (byte) 2));
                    qi0Var.b0(new ek0(gl0Var, (byte) 3));
                    return gl0Var.q();
                } catch (Exception e) {
                    xs1.Y(e, hc1Var);
                    return ne1.m;
                }
        }
    }
}
