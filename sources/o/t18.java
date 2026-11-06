package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t18 {
    public final ih2 a;
    public final f17 b;
    public final um0 c;
    public final pi6 d;
    public final boolean e;
    public final Map f;

    public /* synthetic */ t18(ih2 ih2Var, f17 f17Var, um0 um0Var, pi6 pi6Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : ih2Var, (i & 2) != 0 ? null : f17Var, (i & 4) != 0 ? null : um0Var, (i & 8) != 0 ? null : pi6Var, (i & 32) == 0, (i & 64) != 0 ? fa2.m : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t18)) {
            return false;
        }
        t18 t18Var = (t18) obj;
        return im3.n(this.a, t18Var.a) && im3.n(this.b, t18Var.b) && im3.n(this.c, t18Var.c) && im3.n(this.d, t18Var.d) && this.e == t18Var.e && im3.n(this.f, t18Var.f);
    }

    public final int hashCode() {
        ih2 ih2Var = this.a;
        int iHashCode = (ih2Var == null ? 0 : ih2Var.hashCode()) * 31;
        f17 f17Var = this.b;
        int iHashCode2 = (iHashCode + (f17Var == null ? 0 : f17Var.hashCode())) * 31;
        um0 um0Var = this.c;
        int iHashCode3 = (iHashCode2 + (um0Var == null ? 0 : um0Var.hashCode())) * 31;
        pi6 pi6Var = this.d;
        return this.f.hashCode() + to7.f((iHashCode3 + (pi6Var != null ? pi6Var.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ")";
    }

    public t18(ih2 ih2Var, f17 f17Var, um0 um0Var, pi6 pi6Var, boolean z, Map map) {
        this.a = ih2Var;
        this.b = f17Var;
        this.c = um0Var;
        this.d = pi6Var;
        this.e = z;
        this.f = map;
    }
}
