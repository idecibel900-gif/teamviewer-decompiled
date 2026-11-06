package o;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class lj6 {
    public static final kj6 Companion = new kj6();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ lj6(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            lq1.H(i, 7, jj6.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj6)) {
            return false;
        }
        lj6 lj6Var = (lj6) obj;
        return im3.n(this.a, lj6Var.a) && im3.n(this.b, lj6Var.b) && im3.n(this.c, lj6Var.c);
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
        return e41.l(e41.o("Scm(connection=", this.a, ", developerConnection=", this.b, ", url="), this.c, ")");
    }

    public lj6(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
