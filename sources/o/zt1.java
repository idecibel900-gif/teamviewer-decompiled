package o;

/* JADX INFO: loaded from: classes.dex */
public final class zt1 implements du1 {
    public final int a;

    public zt1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt1) && this.a == ((zt1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fx3.f(this.a, "Legacy(legacyDeviceId=", ")");
    }
}
