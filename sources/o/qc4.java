package o;

/* JADX INFO: loaded from: classes.dex */
public final class qc4 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof qc4) {
            return this.a == ((qc4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.a;
        if (z) {
            return z ? "Assertive" : "Unknown";
        }
        return "Polite";
    }
}
