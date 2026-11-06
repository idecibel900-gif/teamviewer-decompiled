package o;

/* JADX INFO: loaded from: classes.dex */
public final class tx6 {
    public final qf6 a;
    public final qf6 b;
    public final qf6 c;
    public final qf6 d;
    public final qf6 e;
    public final qf6 f;
    public final qf6 g;
    public final qf6 h;

    public tx6() {
        qf6 qf6Var = vw6.a;
        qf6 qf6Var2 = vw6.b;
        qf6 qf6Var3 = vw6.c;
        qf6 qf6Var4 = vw6.d;
        qf6 qf6Var5 = vw6.f;
        qf6 qf6Var6 = vw6.e;
        qf6 qf6Var7 = vw6.g;
        qf6 qf6Var8 = vw6.h;
        this.a = qf6Var;
        this.b = qf6Var2;
        this.c = qf6Var3;
        this.d = qf6Var4;
        this.e = qf6Var5;
        this.f = qf6Var6;
        this.g = qf6Var7;
        this.h = qf6Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx6)) {
            return false;
        }
        tx6 tx6Var = (tx6) obj;
        return im3.n(this.a, tx6Var.a) && im3.n(this.b, tx6Var.b) && im3.n(this.c, tx6Var.c) && im3.n(this.d, tx6Var.d) && im3.n(this.e, tx6Var.e) && im3.n(this.f, tx6Var.f) && im3.n(this.g, tx6Var.g) && im3.n(this.h, tx6Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ")";
    }
}
