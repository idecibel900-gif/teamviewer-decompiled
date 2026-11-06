package o;

/* JADX INFO: loaded from: classes2.dex */
public final class f96 implements my5 {
    public final String m;

    public f96(String str) {
        str.getClass();
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f96.class != obj.getClass()) {
            return false;
        }
        return im3.n(this.m, ((f96) obj).m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return fx3.g("RegionQualifier(region='", this.m, "')");
    }
}
