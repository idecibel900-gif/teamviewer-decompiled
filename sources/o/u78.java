package o;

/* JADX INFO: loaded from: classes.dex */
public final class u78 {
    public lh7 a;
    public lh7 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    public final void a(zr7 zr7Var) {
        lh7 lh7Var;
        zr7 zr7Var2;
        this.e = false;
        lh7 lh7Var2 = this.a;
        if (im3.n(zr7Var, lh7Var2 != null ? (zr7) lh7Var2.f1364o : null)) {
            return;
        }
        String str = zr7Var.a.n;
        lh7 lh7Var3 = this.a;
        boolean zN = im3.n(str, (lh7Var3 == null || (zr7Var2 = (zr7) lh7Var3.f1364o) == null) ? null : zr7Var2.a.n);
        lh7 lh7Var4 = this.a;
        if (zN) {
            if (lh7Var4 != null) {
                lh7Var4.f1364o = zr7Var;
                return;
            }
            return;
        }
        this.a = new lh7(lh7Var4, zr7Var, (byte) 7);
        this.b = null;
        int length = zr7Var.a.n.length() + this.c;
        this.c = length;
        if (length > 100000) {
            lh7 lh7Var5 = this.a;
            if ((lh7Var5 != null ? (lh7) lh7Var5.n : null) == null) {
                return;
            }
            while (true) {
                if (lh7Var5 == null) {
                    lh7Var = null;
                } else {
                    lh7 lh7Var6 = (lh7) lh7Var5.n;
                    if (lh7Var6 != null) {
                        lh7Var = (lh7) lh7Var6.n;
                    } else {
                        lh7Var = null;
                    }
                }
                if (lh7Var == null) {
                    break;
                } else {
                    lh7Var5 = (lh7) lh7Var5.n;
                }
            }
            if (lh7Var5 != null) {
                lh7Var5.n = null;
            }
        }
    }
}
