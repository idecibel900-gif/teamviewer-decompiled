package o;

/* JADX INFO: loaded from: classes.dex */
public final class lp2 {
    public int a;
    public long b;
    public int c;
    public Object d;

    public lp2(pp2 pp2Var, long j, int i, int i2) {
        this.d = pp2Var;
        this.b = j;
        this.a = i;
        this.c = i2;
    }

    public ep1 a(ig5 ig5Var, boolean z, int i, int i2, int i3, int i4) {
        if (!ig5Var.b) {
            return null;
        }
        ((pp2) this.d).getClass();
        return null;
    }

    public ig5 b(boolean z, int i, long j, rk3 rk3Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = this.a;
        int i6 = this.c;
        long j2 = this.b;
        pp2 pp2Var = (pp2) this.d;
        int i7 = i3 + i4;
        boolean z4 = true;
        if (rk3Var == null) {
            return new ig5(z4, z4);
        }
        long j3 = rk3Var.a;
        pp2Var.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) < 0) {
            return new ig5(z4, z4);
        }
        if (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j3 >> 32)) < 0)) {
            return z2 ? new ig5(z4, z4) : new ig5(z4, b(z, 0, rk3.a(r61.i(j2), (((int) (j & 4294967295L)) - i6) - i4), new rk3(rk3.a(((int) (j3 >> 32)) - i5, (int) (j3 & 4294967295L))), i2 + 1, i7, 0, true, false).b);
        }
        boolean z5 = false;
        return new ig5(z5, z5);
    }
}
