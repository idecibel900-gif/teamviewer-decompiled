package o;

/* JADX INFO: loaded from: classes.dex */
public final class d5 {
    public final String a;
    public final String b;
    public final String c;

    public d5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return im3.n(this.a, d5Var.a) && im3.n(this.b, d5Var.b) && im3.n(this.c, d5Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return e41.l(e41.o("AccountPreferenceState(name=", this.a, ", license=", this.b, ", avatarUrl="), this.c, ")");
    }
}
