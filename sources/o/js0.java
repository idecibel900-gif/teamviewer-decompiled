package o;

/* JADX INFO: loaded from: classes2.dex */
public final class js0 {
    public final ht2 a;
    public final ht2 b;
    public final boolean c;

    public js0(ht2 ht2Var, ht2 ht2Var2, boolean z) {
        ht2Var.getClass();
        this.a = ht2Var;
        this.b = ht2Var2;
        this.c = z;
        ht2Var2.d();
    }

    public static final String c(ht2 ht2Var) {
        String strB = ht2Var.b();
        return ub7.R(strB, '/') ? to7.i('`', "`", strB) : strB;
    }

    public final ht2 a() {
        ht2 ht2Var = this.a;
        boolean zD = ht2Var.d();
        ht2 ht2Var2 = this.b;
        if (zD) {
            return ht2Var2;
        }
        return new ht2(ht2Var.b() + '.' + ht2Var2.b());
    }

    public final String b() {
        ht2 ht2Var = this.a;
        boolean zD = ht2Var.d();
        ht2 ht2Var2 = this.b;
        if (zD) {
            return c(ht2Var2);
        }
        String strReplace = ht2Var.b().replace('.', '/');
        strReplace.getClass();
        return strReplace + "/" + c(ht2Var2);
    }

    public final js0 d(sy4 sy4Var) {
        sy4Var.getClass();
        return new js0(this.a, this.b.c(sy4Var), this.c);
    }

    public final js0 e() {
        ht2 ht2VarE = this.b.e();
        if (ht2VarE.d()) {
            return null;
        }
        return new js0(this.a, ht2VarE, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js0)) {
            return false;
        }
        js0 js0Var = (js0) obj;
        return im3.n(this.a, js0Var.a) && im3.n(this.b, js0Var.b) && this.c == js0Var.c;
    }

    public final sy4 f() {
        sy4 sy4VarF = this.b.f();
        sy4VarF.getClass();
        return sy4VarF;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        boolean zD = this.a.d();
        String strB = b();
        return zD ? "/".concat(strB) : strB;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public js0(ht2 ht2Var, sy4 sy4Var) {
        this(ht2Var, ht2.j(sy4Var), false);
        ht2Var.getClass();
        sy4Var.getClass();
    }
}
