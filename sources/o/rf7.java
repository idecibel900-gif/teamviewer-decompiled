package o;

/* JADX INFO: loaded from: classes.dex */
public final class rf7 {
    public final String a;
    public final long b;
    public final int c;
    public final long d;

    public rf7(long j, long j2, int i, String str) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf7)) {
            return false;
        }
        rf7 rf7Var = (rf7) obj;
        if (!im3.n(this.a, rf7Var.a)) {
            return false;
        }
        long j = rf7Var.b;
        int i = rv0.i;
        return z68.a(this.b, j) && this.c == rf7Var.c && z68.a(this.d, rf7Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = rv0.i;
        return Long.hashCode(this.d) + fx3.a(this.c, fx3.c(iHashCode, 31, this.b), 31);
    }

    public final String toString() {
        String strH = rv0.h(this.b);
        String strH2 = rv0.h(this.d);
        StringBuilder sbO = e41.o("SupportSessionRecipientStatusItem(text=", this.a, ", backgroundColor=", strH, ", iconRes=");
        sbO.append(this.c);
        sbO.append(", iconTint=");
        sbO.append(strH2);
        sbO.append(")");
        return sbO.toString();
    }
}
