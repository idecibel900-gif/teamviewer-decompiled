package o;

/* JADX INFO: loaded from: classes.dex */
public final class rc4 extends nr2 {
    public final df6 f;

    public rc4(df6 df6Var) {
        this.f = df6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rc4) {
            return this.f == ((rc4) obj).f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f + ")";
    }
}
