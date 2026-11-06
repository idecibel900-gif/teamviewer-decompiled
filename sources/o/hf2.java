package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hf2 {
    public static final hf2 b;
    public static final hf2 c;
    public final t18 a;

    static {
        LinkedHashMap linkedHashMap = null;
        ih2 ih2Var = null;
        f17 f17Var = null;
        um0 um0Var = null;
        pi6 pi6Var = null;
        b = new hf2(new t18(ih2Var, f17Var, um0Var, pi6Var, linkedHashMap, 127));
        c = new hf2(new t18(ih2Var, f17Var, um0Var, pi6Var, linkedHashMap, 95));
    }

    public hf2(t18 t18Var) {
        this.a = t18Var;
    }

    public final hf2 a(hf2 hf2Var) {
        t18 t18Var = hf2Var.a;
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
        return new hf2(new t18(ih2Var, f17Var, um0Var, pi6Var, t18Var.e || t18Var2.e, xm4.S(t18Var2.f, t18Var.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hf2) && ((hf2) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        t18 t18Var = this.a;
        ih2 ih2Var = t18Var.a;
        String string = ih2Var != null ? ih2Var.toString() : null;
        f17 f17Var = t18Var.b;
        String string2 = f17Var != null ? f17Var.toString() : null;
        um0 um0Var = t18Var.c;
        String string3 = um0Var != null ? um0Var.toString() : null;
        pi6 pi6Var = t18Var.d;
        String string4 = pi6Var != null ? pi6Var.toString() : null;
        boolean z = t18Var.e;
        StringBuilder sbO = e41.o("ExitTransition:  Fade - ", string, ",  Slide - ", string2, ",  Shrink - ");
        e41.t(sbO, string3, ",  Scale - ", string4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        sbO.append(z);
        return sbO.toString();
    }
}
