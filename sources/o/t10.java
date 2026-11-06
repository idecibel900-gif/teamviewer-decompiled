package o;

/* JADX INFO: loaded from: classes.dex */
public final class t10 extends zu1 {
    public final Object d;
    public final long e;

    public t10(long j, Object obj) {
        this.d = obj;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t10)) {
            return false;
        }
        t10 t10Var = (t10) obj;
        return this.d.equals(t10Var.d) && this.e == t10Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.d + ", compositeKey=" + this.e + ')';
    }
}
