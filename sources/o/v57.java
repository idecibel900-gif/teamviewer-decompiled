package o;

/* JADX INFO: loaded from: classes.dex */
public final class v57 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public v57(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v57)) {
            return false;
        }
        v57 v57Var = (v57) obj;
        return this.a.equals(v57Var.a) && this.b.equals(v57Var.b) && this.c.equals(v57Var.c) && this.d.equals(v57Var.d) && im3.n(this.e, v57Var.e);
    }

    public final int hashCode() {
        int iE = to7.e(to7.e(to7.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = e41.o("SolutionCardDynamicItem(solutionTitle=", this.a, ", solutionDescription=", this.b, ", solutionLogoUrl=");
        e41.t(sbO, this.c, ", packageName=", this.d, ", analyticsEventID=");
        return e41.l(sbO, this.e, ")");
    }
}
