package o;

/* JADX INFO: loaded from: classes.dex */
public final class sc8 implements to {
    public final String a;

    public sc8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sc8) {
            return this.a.equals(((sc8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fx3.g("VerbatimTtsAnnotation(verbatim=", this.a, ")");
    }
}
