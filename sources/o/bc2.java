package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bc2 {
    public static final bc2 b = new bc2(new t18((ih2) null, (f17) null, (um0) null, (pi6) null, (LinkedHashMap) null, 127));
    public final t18 a;

    public bc2(t18 t18Var) {
        this.a = t18Var;
    }

    public final bc2 a(bc2 bc2Var) {
        t18 t18Var = bc2Var.a;
        ih2 ih2Var = t18Var.a;
        t18 t18Var2 = this.a;
        if (ih2Var == null) {
            ih2Var = t18Var2.a;
        }
        f17 f17Var = t18Var.b;
        if (f17Var == null) {
            f17Var = t18Var2.b;
        }
        um0 um0Var = t18Var.c;
        if (um0Var == null) {
            um0Var = t18Var2.c;
        }
        pi6 pi6Var = t18Var.d;
        if (pi6Var == null) {
            pi6Var = t18Var2.d;
        }
        return new bc2(new t18(ih2Var, f17Var, um0Var, pi6Var, xm4.S(t18Var2.f, t18Var.f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bc2) && ((bc2) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        t18 t18Var = this.a;
        ih2 ih2Var = t18Var.a;
        String string = ih2Var != null ? ih2Var.toString() : null;
        f17 f17Var = t18Var.b;
        String string2 = f17Var != null ? f17Var.toString() : null;
        um0 um0Var = t18Var.c;
        String string3 = um0Var != null ? um0Var.toString() : null;
        pi6 pi6Var = t18Var.d;
        return e41.m(e41.o("EnterTransition: Fade - ", string, ", Slide - ", string2, ", Shrink - "), string3, ", Scale - ", pi6Var != null ? pi6Var.toString() : null, ", Veil - null");
    }
}
