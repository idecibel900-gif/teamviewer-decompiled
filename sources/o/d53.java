package o;

/* JADX INFO: loaded from: classes2.dex */
public final class d53 {
    public static final ai0 d;
    public static final ai0 e;
    public static final ai0 f;
    public static final ai0 g;
    public static final ai0 h;
    public static final ai0 i;
    public final ai0 a;
    public final ai0 b;
    public final int c;

    static {
        ai0 ai0Var = ai0.p;
        d = ju.s(":");
        e = ju.s(":status");
        f = ju.s(":method");
        g = ju.s(":path");
        h = ju.s(":scheme");
        i = ju.s(":authority");
    }

    public d53(ai0 ai0Var, ai0 ai0Var2) {
        ai0Var.getClass();
        ai0Var2.getClass();
        this.a = ai0Var;
        this.b = ai0Var2;
        this.c = ai0Var2.d() + ai0Var.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d53)) {
            return false;
        }
        d53 d53Var = (d53) obj;
        return im3.n(this.a, d53Var.a) && im3.n(this.b, d53Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.s() + ": " + this.b.s();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d53(String str, String str2) {
        this(ju.s(str), ju.s(str2));
        ai0 ai0Var = ai0.p;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d53(String str, ai0 ai0Var) {
        this(ai0Var, ju.s(str));
        ai0Var.getClass();
        str.getClass();
        ai0 ai0Var2 = ai0.p;
    }
}
