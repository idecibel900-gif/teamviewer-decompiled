package o;

/* JADX INFO: loaded from: classes.dex */
public final class z98 implements to {
    public final String a;

    public z98(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z98) {
            return this.a.equals(((z98) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fx3.g("UrlAnnotation(url=", this.a, ")");
    }
}
