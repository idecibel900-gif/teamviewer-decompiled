package o;

/* JADX INFO: loaded from: classes.dex */
public final class j00 {
    public final Object a;
    public final r00 b;

    public j00(Object obj, r00 r00Var) {
        if (obj == null) {
            yq4.l("Null payload");
            throw null;
        }
        this.a = obj;
        this.b = r00Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j00)) {
            return false;
        }
        j00 j00Var = (j00) obj;
        if (!this.a.equals(j00Var.a)) {
            return false;
        }
        Object obj2 = ss5.m;
        if (!obj2.equals(obj2)) {
            return false;
        }
        r00 r00Var = j00Var.b;
        r00 r00Var2 = this.b;
        if (r00Var2 == null) {
            return r00Var == null;
        }
        return r00Var2.equals(r00Var);
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ ss5.m.hashCode()) * 1000003;
        r00 r00Var = this.b;
        return (r00Var == null ? 0 : r00Var.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + ss5.m + ", productData=" + this.b + "}";
    }
}
