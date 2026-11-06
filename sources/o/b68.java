package o;

/* JADX INFO: loaded from: classes.dex */
public final class b68 {
    public final nr2 a;
    public final ms2 b;
    public final int c;
    public final int d;
    public final Object e;

    public b68(nr2 nr2Var, ms2 ms2Var, int i, int i2, Object obj) {
        this.a = nr2Var;
        this.b = ms2Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b68)) {
            return false;
        }
        b68 b68Var = (b68) obj;
        return im3.n(this.a, b68Var.a) && im3.n(this.b, b68Var.b) && this.c == b68Var.c && this.d == b68Var.d && im3.n(this.e, b68Var.e);
    }

    public final int hashCode() {
        nr2 nr2Var = this.a;
        int iA = fx3.a(this.d, fx3.a(this.c, (((nr2Var == null ? 0 : nr2Var.hashCode()) * 31) + this.b.m) * 31, 31), 31);
        Object obj = this.e;
        return iA + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        e41.t(sb, str, ", fontSynthesis=", str2, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
