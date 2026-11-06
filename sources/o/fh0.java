package o;

/* JADX INFO: loaded from: classes.dex */
public final class fh0 {
    public final String a;

    public fh0(String str) {
        ju juVar = ze4.n;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh0)) {
            return false;
        }
        ju juVar = ze4.n;
        return this.a.equals(((fh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (ze4.AuthDenied.hashCode() * 31);
    }

    public final String toString() {
        return "Deny(result=" + ze4.AuthDenied + ", logMessage=" + this.a + ")";
    }
}
