package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ud implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yy0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ hw2 f2199o;

    public /* synthetic */ ud(yy0 yy0Var, hw2 hw2Var, byte b) {
        this.m = b;
        this.n = yy0Var;
        this.f2199o = hw2Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        hw2 hw2Var = this.f2199o;
        yy0 yy0Var = this.n;
        byte b2 = 1;
        ux2 ux2Var = (ux2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = ((w32) ux2Var.j(ml3.c)).m;
                    if (Float.isNaN(f)) {
                        f = 0.0f;
                    }
                    pd5 pd5Var = og0.a;
                    w32 w32Var = new w32(8.0f - (f - (((Boolean) qp5.a.getValue()).booleanValue() ? 36.0f : 40.0f)));
                    w32 w32Var2 = new w32(0.0f);
                    w32 w32Var3 = new w32(8.0f);
                    if (w32Var2.compareTo(w32Var3) > 0) {
                        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + w32Var3 + " is less than minimum " + w32Var2 + '.');
                    }
                    if (w32Var.compareTo(w32Var2) < 0) {
                        w32Var = w32Var2;
                    } else if (w32Var.compareTo(w32Var3) > 0) {
                        w32Var = w32Var3;
                    }
                    yd.b(w32Var.m, au8.O(-459506658, new ud(yy0Var, hw2Var, b2), ux2Var), ux2Var, 390);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            default:
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yy0Var.invoke(ux2Var, 0);
                    if (hw2Var == null) {
                        ux2Var.W(-1102003461);
                    } else {
                        ux2Var.W(795735494);
                        hw2Var.invoke(ux2Var, 0);
                    }
                    ux2Var.p(false);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
        }
    }
}
