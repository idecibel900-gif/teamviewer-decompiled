package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class zd6 {
    public static final h72 a = new h72(new w26((byte) 11), (byte) 0);
    public static final e11 b = new e11(new le5((byte) 16));
    public static final androidx.compose.material3.c c;
    public static final androidx.compose.material3.c d;

    static {
        long j = rv0.h;
        c = new androidx.compose.material3.c(true, Float.NaN, j, null, true);
        d = new androidx.compose.material3.c(false, Float.NaN, j, null, true);
    }

    public static androidx.compose.material3.c a(boolean z, float f, long j, pw6 pw6Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        float f2 = (i & 2) != 0 ? Float.NaN : f;
        if ((i & 4) != 0) {
            j = rv0.h;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            pw6Var = null;
        }
        pw6 pw6Var2 = pw6Var;
        if (w32.b(f2, Float.NaN) && z68.a(j2, rv0.h) && pw6Var2 == null) {
            return z2 ? c : d;
        }
        return new androidx.compose.material3.c(z2, f2, j2, pw6Var2, true);
    }
}
