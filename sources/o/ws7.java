package o;

/* JADX INFO: loaded from: classes.dex */
public final class ws7 {
    public final vs7 a;
    public i04 b = null;
    public i04 c;

    public ws7(vs7 vs7Var, i04 i04Var) {
        this.a = vs7Var;
        this.c = i04Var;
    }

    public final long a(long j) {
        v56 v56VarB;
        i04 i04Var = this.b;
        v56 v56Var = v56.e;
        if (i04Var != null) {
            if (i04Var.m()) {
                i04 i04Var2 = this.c;
                v56VarB = i04Var2 != null ? i04Var2.b(i04Var, true) : null;
            } else {
                v56VarB = v56Var;
            }
            if (v56VarB != null) {
                v56Var = v56VarB;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = v56Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = v56Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = v56Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = v56Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        vs7 vs7Var = this.a;
        int iE = vs7Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= vs7Var.e(iE) && Float.intBitsToFloat(i) <= vs7Var.f(iE);
    }

    public final long d(long j) {
        i04 i04Var;
        i04 i04Var2 = this.b;
        if (i04Var2 != null) {
            if (!i04Var2.m()) {
                i04Var2 = null;
            }
            if (i04Var2 != null && (i04Var = this.c) != null) {
                i04 i04Var3 = i04Var.m() ? i04Var : null;
                if (i04Var3 != null) {
                    return i04Var2.K(i04Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        i04 i04Var;
        i04 i04Var2 = this.b;
        if (i04Var2 != null) {
            if (!i04Var2.m()) {
                i04Var2 = null;
            }
            if (i04Var2 != null && (i04Var = this.c) != null) {
                i04 i04Var3 = i04Var.m() ? i04Var : null;
                if (i04Var3 != null) {
                    return i04Var3.K(i04Var2, j);
                }
            }
        }
        return j;
    }
}
