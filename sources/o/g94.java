package o;

import android.graphics.LightingColorFilter;

/* JADX INFO: loaded from: classes.dex */
public final class g94 extends tv0 {
    public final long b;
    public final long c;

    public g94(long j, long j2) {
        super(new LightingColorFilter(j51.U(j), j51.U(j2)));
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g94)) {
            return false;
        }
        g94 g94Var = (g94) obj;
        long j = g94Var.b;
        int i = rv0.i;
        return z68.a(this.b, j) && z68.a(this.c, g94Var.c);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return fx3.h("LightingColorFilter(multiply=", rv0.h(this.b), ", add=", rv0.h(this.c), ")");
    }
}
