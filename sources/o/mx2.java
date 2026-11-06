package o;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class mx2 {
    public static final lx2 Companion = new lx2();
    public final String a;
    public final String b;

    public /* synthetic */ mx2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            lq1.H(i, 3, kx2.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx2)) {
            return false;
        }
        mx2 mx2Var = (mx2) obj;
        return im3.n(this.a, mx2Var.a) && im3.n(this.b, mx2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return fx3.h("Funding(platform=", this.a, ", url=", this.b, ")");
    }

    public mx2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
