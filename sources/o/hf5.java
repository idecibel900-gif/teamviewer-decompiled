package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class hf5 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        rt7[] rt7VarArr = qt7.b;
        a = qt7.c;
    }

    public static final gf5 a(gf5 gf5Var, int i, int i2, long j, es7 es7Var, gm5 gm5Var, p94 p94Var, int i3, int i4, dt7 dt7Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        es7 es7Var2 = es7Var;
        gm5 gm5Var2 = gm5Var;
        p94 p94Var2 = p94Var;
        int i7 = i3;
        int i8 = i4;
        dt7 dt7Var2 = dt7Var;
        if (i5 == 0 || i5 == gf5Var.a) {
            rt7[] rt7VarArr = qt7.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (qt7.a(j3, gf5Var.c)) {
                }
            }
            if ((es7Var2 == null || es7Var2.equals(gf5Var.d)) && ((i6 == 0 || i6 == gf5Var.b) && ((gm5Var2 == null || gm5Var2.equals(gf5Var.e)) && ((p94Var2 == null || p94Var2.equals(gf5Var.f)) && ((i7 == 0 || i7 == gf5Var.g) && ((i8 == 0 || i8 == gf5Var.h) && (dt7Var2 == null || dt7Var2.equals(gf5Var.i)))))))) {
                return gf5Var;
            }
        } else {
            j2 = 0;
        }
        rt7[] rt7VarArr2 = qt7.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = gf5Var.c;
        }
        if (es7Var2 == null) {
            es7Var2 = gf5Var.d;
        }
        if (i5 == 0) {
            i5 = gf5Var.a;
        }
        if (i6 == 0) {
            i6 = gf5Var.b;
        }
        gm5 gm5Var3 = gf5Var.e;
        if (gm5Var3 != null && gm5Var2 == null) {
            gm5Var2 = gm5Var3;
        }
        if (p94Var2 == null) {
            p94Var2 = gf5Var.f;
        }
        if (i7 == 0) {
            i7 = gf5Var.g;
        }
        if (i8 == 0) {
            i8 = gf5Var.h;
        }
        if (dt7Var2 == null) {
            dt7Var2 = gf5Var.i;
        }
        return new gf5(i5, i6, j3, es7Var2, gm5Var2, p94Var2, i7, i8, dt7Var2);
    }
}
