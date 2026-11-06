package o;

/* JADX INFO: loaded from: classes.dex */
public final class gf5 implements to {
    public final int a;
    public final int b;
    public final long c;
    public final es7 d;
    public final gm5 e;
    public final p94 f;
    public final int g;
    public final int h;
    public final dt7 i;

    public gf5(int i, int i2, long j, es7 es7Var, gm5 gm5Var, p94 p94Var, int i3, int i4, dt7 dt7Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = es7Var;
        this.e = gm5Var;
        this.f = p94Var;
        this.g = i3;
        this.h = i4;
        this.i = dt7Var;
        rt7[] rt7VarArr = qt7.b;
        if (qt7.a(j, qt7.c)) {
            return;
        }
        if (qt7.c(j) >= 0.0f) {
            return;
        }
        li3.b("lineHeight can't be negative (" + qt7.c(j) + ")");
    }

    public final gf5 a(gf5 gf5Var) {
        return gf5Var == null ? this : hf5.a(this, gf5Var.a, gf5Var.b, gf5Var.c, gf5Var.d, gf5Var.e, gf5Var.f, gf5Var.g, gf5Var.h, gf5Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5)) {
            return false;
        }
        gf5 gf5Var = (gf5) obj;
        return this.a == gf5Var.a && this.b == gf5Var.b && qt7.a(this.c, gf5Var.c) && im3.n(this.d, gf5Var.d) && im3.n(this.e, gf5Var.e) && im3.n(this.f, gf5Var.f) && this.g == gf5Var.g && this.h == gf5Var.h && im3.n(this.i, gf5Var.i);
    }

    public final int hashCode() {
        int iA = fx3.a(this.b, Integer.hashCode(this.a) * 31, 31);
        rt7[] rt7VarArr = qt7.b;
        int iC = fx3.c(iA, 31, this.c);
        es7 es7Var = this.d;
        int iHashCode = (iC + (es7Var != null ? es7Var.hashCode() : 0)) * 31;
        gm5 gm5Var = this.e;
        int iHashCode2 = (iHashCode + (gm5Var != null ? gm5Var.hashCode() : 0)) * 31;
        p94 p94Var = this.f;
        int iA2 = fx3.a(this.h, fx3.a(this.g, (iHashCode2 + (p94Var != null ? p94Var.hashCode() : 0)) * 31, 31), 31);
        dt7 dt7Var = this.i;
        return iA2 + (dt7Var != null ? dt7Var.hashCode() : 0);
    }

    public final String toString() {
        String strA = qo7.a(this.a);
        String strA2 = xp7.a(this.b);
        String strD = qt7.d(this.c);
        String strA3 = k94.a(this.g);
        String strA4 = k93.a(this.h);
        StringBuilder sbO = e41.o("ParagraphStyle(textAlign=", strA, ", textDirection=", strA2, ", lineHeight=");
        sbO.append(strD);
        sbO.append(", textIndent=");
        sbO.append(this.d);
        sbO.append(", platformStyle=");
        sbO.append(this.e);
        sbO.append(", lineHeightStyle=");
        sbO.append(this.f);
        sbO.append(", lineBreak=");
        e41.t(sbO, strA3, ", hyphens=", strA4, ", textMotion=");
        sbO.append(this.i);
        sbO.append(")");
        return sbO.toString();
    }

    public gf5(int i, es7 es7Var, int i2) {
        this((i2 & 1) != 0 ? 0 : i, 0, qt7.c, (i2 & 8) != 0 ? null : es7Var, null, null, 0, 0, null);
    }
}
