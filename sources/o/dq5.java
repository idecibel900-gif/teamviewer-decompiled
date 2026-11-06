package o;

/* JADX INFO: loaded from: classes.dex */
public final class dq5 extends zu1 {
    public final Object d;
    public final long e;

    public dq5(long j, Object obj) {
        this.d = obj;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq5)) {
            return false;
        }
        dq5 dq5Var = (dq5) obj;
        return this.d.equals(dq5Var.d) && this.e == dq5Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.d + ", compositeKey=" + this.e + ')';
    }
}
