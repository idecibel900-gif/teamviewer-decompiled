package o;

/* JADX INFO: loaded from: classes.dex */
public final class th3 {
    public final xx4 a = new xx4(new rh3[16]);
    public final bg5 b = h57.p(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final bg5 d = h57.p(Boolean.TRUE);

    public final void a(int i, ux2 ux2Var) {
        ux2Var.Y(-318043801);
        byte b = 4;
        int i2 = (ux2Var.h(this) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            Object objK = ux2Var.K();
            hc1 hc1Var = null;
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(null);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) objK;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                ux2Var.W(-144841960);
                boolean zH = ux2Var.h(this);
                Object objK2 = ux2Var.K();
                if (zH || objK2 == awVar) {
                    objK2 = new tb(px4Var, this, hc1Var, b);
                    ux2Var.g0(objK2);
                }
                ck3.i(this, (hw2) objK2, ux2Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(-143455237);
                ux2Var.p(false);
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new t0((byte) 27, i, this);
        }
    }
}
