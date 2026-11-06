package o;

/* JADX INFO: loaded from: classes.dex */
public final class h95 {
    public final String a;

    public h95(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h95) && this.a.equals(((h95) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fx3.g("OpaqueKey(key=", this.a, ")");
    }
}
