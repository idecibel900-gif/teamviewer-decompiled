package o;

/* JADX INFO: loaded from: classes.dex */
public final class w57 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public w57(int i, int i2, int i3, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w57)) {
            return false;
        }
        w57 w57Var = (w57) obj;
        return this.a == w57Var.a && this.b == w57Var.b && this.c == w57Var.c && this.d.equals(w57Var.d) && this.e.equals(w57Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + to7.e(fx3.a(this.c, fx3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbJ = fx3.j(this.a, this.b, "SolutionCardStaticItem(solutionTitle=", ", solutionDescription=", ", solutionLogo=");
        sbJ.append(this.c);
        sbJ.append(", packageName=");
        sbJ.append(this.d);
        sbJ.append(", analyticsEventID=");
        return e41.l(sbJ, this.e, ")");
    }
}
