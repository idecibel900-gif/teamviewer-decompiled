package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ia4 implements fq6 {
    public final fq6 a;
    public final fq6 b;

    public ia4(fq6 fq6Var, fq6 fq6Var2) {
        fq6Var.getClass();
        fq6Var2.getClass();
        this.a = fq6Var;
        this.b = fq6Var2;
    }

    @Override // o.fq6
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // o.fq6
    public final int d(String str) {
        str.getClass();
        Integer numO = bc7.O(str);
        if (numO != null) {
            return numO.intValue();
        }
        hk0.g(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // o.fq6
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia4)) {
            return false;
        }
        ia4 ia4Var = (ia4) obj;
        return im3.n(this.a, ia4Var.a) && im3.n(this.b, ia4Var.b);
    }

    @Override // o.fq6
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // o.fq6
    public final List g(int i) {
        if (i >= 0) {
            return ea2.m;
        }
        gk0.h(fx3.f(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    @Override // o.fq6
    public final fq6 h(int i) {
        if (i < 0) {
            gk0.h(fx3.f(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        hk0.l("Unreached");
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // o.fq6
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        gk0.h(fx3.f(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return false;
    }

    @Override // o.fq6
    public final it1 k() {
        return lc7.f;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
