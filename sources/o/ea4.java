package o;

/* JADX INFO: loaded from: classes.dex */
public final class ea4 extends ga4 {
    public final String a;
    public final bt7 b;
    public final di7 c;

    public ea4(String str, bt7 bt7Var, di7 di7Var) {
        this.a = str;
        this.b = bt7Var;
        this.c = di7Var;
    }

    @Override // o.ga4
    public final di7 a() {
        return this.c;
    }

    @Override // o.ga4
    public final bt7 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea4)) {
            return false;
        }
        ea4 ea4Var = (ea4) obj;
        return im3.n(this.a, ea4Var.a) && im3.n(this.b, ea4Var.b) && im3.n(this.c, ea4Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bt7 bt7Var = this.b;
        int iHashCode2 = (iHashCode + (bt7Var != null ? bt7Var.hashCode() : 0)) * 31;
        di7 di7Var = this.c;
        return iHashCode2 + (di7Var != null ? di7Var.hashCode() : 0);
    }

    public final String toString() {
        return fx3.g("LinkAnnotation.Clickable(tag=", this.a, ")");
    }
}
