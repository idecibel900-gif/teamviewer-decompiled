package o;

/* JADX INFO: loaded from: classes.dex */
public final class rx1 implements tx1 {
    public final long a;
    public final k33 b;

    public rx1(long j, k33 k33Var) {
        this.a = j;
        this.b = k33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx1)) {
            return false;
        }
        rx1 rx1Var = (rx1) obj;
        return this.a == rx1Var.a && im3.n(this.b, rx1Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        k33 k33Var = this.b;
        return iHashCode + (k33Var == null ? 0 : k33Var.hashCode());
    }

    public final String toString() {
        return "Device(deviceId=" + this.a + ", groupId=" + this.b + ")";
    }
}
