package o;

/* JADX INFO: loaded from: classes.dex */
public final class hx1 implements lx1 {
    public final long a;

    public hx1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx1) && this.a == ((hx1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return to7.j(this.a, "ToDeviceDetailPane(deviceId=", ")");
    }
}
