package o;

/* JADX INFO: loaded from: classes.dex */
public final class p94 {
    public static final p94 d = new p94(m94.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public p94(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p94)) {
            return false;
        }
        p94 p94Var = (p94) obj;
        float f = p94Var.a;
        float f2 = m94.b;
        return Float.compare(this.a, f) == 0 && this.b == p94Var.b && this.c == p94Var.c;
    }

    public final int hashCode() {
        float f = m94.b;
        return Integer.hashCode(this.c) + fx3.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        String strB = m94.b(this.a);
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        return e41.l(e41.o("LineHeightStyle(alignment=", strB, ", trim=", str, ",mode="), str2, ")");
    }
}
