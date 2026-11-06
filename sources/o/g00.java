package o;

/* JADX INFO: loaded from: classes.dex */
public final class g00 extends nt0 {
    public final d00 a;

    public g00(d00 d00Var) {
        this.a = d00Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nt0)) {
            return false;
        }
        nt0 nt0Var = (nt0) obj;
        Object obj2 = mt0.m;
        if (obj2.equals(obj2)) {
            return this.a.equals(((g00) nt0Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((mt0.m.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + mt0.m + ", androidClientInfo=" + this.a + "}";
    }
}
