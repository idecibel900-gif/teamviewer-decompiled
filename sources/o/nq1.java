package o;

/* JADX INFO: loaded from: classes.dex */
public final class nq1 extends wk0 {
    public final boolean p;

    public nq1(la0 la0Var, boolean z) {
        super(la0Var);
        this.p = z;
    }

    public final w20 L() {
        w20[] w20VarArr = (w20[]) this.f2420o;
        y20 y20Var = new y20();
        y20 y20Var2 = new y20();
        y20 y20Var3 = new y20();
        y20 y20Var4 = new y20();
        for (w20 w20Var : w20VarArr) {
            if (w20Var != null) {
                w20Var.c();
                int i = w20Var.e % 30;
                int i2 = w20Var.f;
                if (!this.p) {
                    i2 += 2;
                }
                int i3 = i2 % 3;
                if (i3 == 0) {
                    y20Var2.b((i * 3) + 1);
                } else if (i3 == 1) {
                    y20Var4.b(i / 3);
                    y20Var3.b(i % 3);
                } else if (i3 == 2) {
                    y20Var.b(i + 1);
                }
            }
        }
        if (y20Var.a().length == 0 || y20Var2.a().length == 0 || y20Var3.a().length == 0 || y20Var4.a().length == 0 || y20Var.a()[0] < 1 || y20Var2.a()[0] + y20Var3.a()[0] < 3 || y20Var2.a()[0] + y20Var3.a()[0] > 90) {
            return null;
        }
        w20 w20Var2 = new w20(y20Var.a()[0], y20Var2.a()[0], y20Var3.a()[0], y20Var4.a()[0], (byte) 0);
        M(w20VarArr, w20Var2);
        return w20Var2;
    }

    public final void M(w20[] w20VarArr, w20 w20Var) {
        for (int i = 0; i < w20VarArr.length; i++) {
            w20 w20Var2 = w20VarArr[i];
            if (w20Var2 != null) {
                int i2 = w20Var2.e % 30;
                int i3 = w20Var2.f;
                if (i3 > w20Var.f) {
                    w20VarArr[i] = null;
                } else {
                    if (!this.p) {
                        i3 += 2;
                    }
                    int i4 = i3 % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2 && i2 + 1 != w20Var.b) {
                                w20VarArr[i] = null;
                            }
                        } else if (i2 / 3 != w20Var.c || i2 % 3 != w20Var.e) {
                            w20VarArr[i] = null;
                        }
                    } else if ((i2 * 3) + 1 != w20Var.d) {
                        w20VarArr[i] = null;
                    }
                }
            }
        }
    }

    @Override // o.wk0
    public final String toString() {
        return "IsLeft: " + this.p + '\n' + super.toString();
    }
}
