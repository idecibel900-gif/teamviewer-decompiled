package o;

/* JADX INFO: loaded from: classes.dex */
public final class p00 extends o25 {
    public final n25 a;
    public final m25 b;

    public p00(n25 n25Var, m25 m25Var) {
        this.a = n25Var;
        this.b = m25Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o25) {
            o25 o25Var = (o25) obj;
            n25 n25Var = this.a;
            if (n25Var != null ? n25Var.equals(((p00) o25Var).a) : ((p00) o25Var).a == null) {
                m25 m25Var = this.b;
                if (m25Var != null ? m25Var.equals(((p00) o25Var).b) : ((p00) o25Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        n25 n25Var = this.a;
        int iHashCode = ((n25Var == null ? 0 : n25Var.hashCode()) ^ 1000003) * 1000003;
        m25 m25Var = this.b;
        return iHashCode ^ (m25Var != null ? m25Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
