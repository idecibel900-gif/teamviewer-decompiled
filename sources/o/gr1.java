package o;

/* JADX INFO: loaded from: classes.dex */
public final class gr1 implements pm7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zb0 b;

    public /* synthetic */ gr1(zb0 zb0Var, byte b) {
        this.a = b;
        this.b = zb0Var;
    }

    private final void d(tm7 tm7Var) {
    }

    private final void e(tm7 tm7Var) {
    }

    @Override // o.om7
    public final void a(tm7 tm7Var) {
        byte b = this.a;
    }

    @Override // o.om7
    public final void b(tm7 tm7Var) {
        byte b = this.a;
        dd ddVar = dd.m;
        dd ddVar2 = dd.n;
        dd ddVar3 = dd.f610o;
        zb0 zb0Var = this.b;
        switch (b) {
            case 0:
                hr1 hr1Var = (hr1) zb0Var;
                int i = tm7Var.a;
                if (i == 0) {
                    int i2 = hr1.u0;
                    hr1Var.I0(ddVar);
                } else if (i == 1) {
                    int i3 = hr1.u0;
                    hr1Var.I0(ddVar2);
                } else if (i == 2) {
                    int i4 = hr1.u0;
                    hr1Var.I0(ddVar3);
                }
                ra3 ra3Var = hr1Var.s0;
                if (ra3Var != null) {
                    ((kr1) ra3Var).q = tm7Var.a;
                }
                break;
            default:
                ht4 ht4Var = (ht4) zb0Var;
                int i5 = tm7Var.a;
                if (i5 == 0) {
                    int i6 = ht4.u0;
                    ht4Var.J0(ddVar);
                } else if (i5 == 1) {
                    int i7 = ht4.u0;
                    ht4Var.J0(ddVar2);
                } else if (i5 == 2) {
                    int i8 = ht4.u0;
                    ht4Var.J0(ddVar3);
                }
                tb3 tb3Var = ht4Var.s0;
                if (tb3Var != null) {
                    ((it4) tb3Var).q = tm7Var.a;
                }
                break;
        }
    }

    @Override // o.om7
    public final void c(tm7 tm7Var) {
        byte b = this.a;
        tm7Var.getClass();
    }
}
