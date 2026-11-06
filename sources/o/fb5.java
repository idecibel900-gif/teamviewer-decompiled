package o;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class fb5 {
    public static final eb5 Companion = new eb5();
    public final String a;
    public final String b;

    public /* synthetic */ fb5(int i, String str, String str2) {
        if (3 != (i & 3)) {
            lq1.H(i, 3, db5.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb5)) {
            return false;
        }
        fb5 fb5Var = (fb5) obj;
        return im3.n(this.a, fb5Var.a) && im3.n(this.b, fb5Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return fx3.h("Organization(name=", this.a, ", url=", this.b, ")");
    }

    public fb5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
