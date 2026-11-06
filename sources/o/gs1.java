package o;

/* JADX INFO: loaded from: classes.dex */
public final class gs1 {
    public final long a;
    public final long b;
    public final vl7 c;
    public final int d;

    public gs1(long j, long j2, vl7 vl7Var, int i) {
        this.a = j;
        this.b = j2;
        this.c = vl7Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs1)) {
            return false;
        }
        gs1 gs1Var = (gs1) obj;
        long j = gs1Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.b, gs1Var.b) && this.c == gs1Var.c && this.d == gs1Var.d;
    }

    public final int hashCode() {
        int i = rv0.i;
        int iC = fx3.c(Long.hashCode(this.a) * 31, 31, this.b);
        vl7 vl7Var = this.c;
        return Integer.hashCode(this.d) + ((iC + (vl7Var == null ? 0 : vl7Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("DeviceAvatarUiData(backgroundColor=", rv0.h(this.a), ", iconColor=", rv0.h(this.b), ", statusIndicatorType=");
        sbO.append(this.c);
        sbO.append(", contentDescriptionResource=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
