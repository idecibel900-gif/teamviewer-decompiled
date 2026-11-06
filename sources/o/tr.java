package o;

/* JADX INFO: loaded from: classes.dex */
public final class tr extends ka0 {
    public final int z;

    public tr(int i) {
        this.z = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tr) && this.z == ((tr) obj).z;
    }

    public final int hashCode() {
        return Integer.hashCode(this.z);
    }

    public final String toString() {
        return fx3.f(this.z, "Resource(resId=", ")");
    }
}
