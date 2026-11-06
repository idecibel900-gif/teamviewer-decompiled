package o;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class sq1 {
    public static final rq1 Companion = new rq1();
    public final String a;
    public final String b;

    public /* synthetic */ sq1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            lq1.H(i, 3, qq1.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq1)) {
            return false;
        }
        sq1 sq1Var = (sq1) obj;
        return im3.n(this.a, sq1Var.a) && im3.n(this.b, sq1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return fx3.h("Developer(name=", this.a, ", organisationUrl=", this.b, ")");
    }

    public sq1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
