package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class il6 implements kl6 {
    public final zl6 a;
    public final List b;
    public final int c;
    public final String d;

    public il6(zl6 zl6Var, List list) {
        list.getClass();
        this.a = zl6Var;
        this.b = list;
        this.c = zl6Var.m;
        this.d = xs1.O(zl6Var);
    }

    @Override // o.kl6
    public final int a() {
        return this.c;
    }

    @Override // o.kl6
    public final boolean b() {
        return true;
    }

    @Override // o.kl6
    public final List c() {
        return this.b;
    }

    @Override // o.kl6
    public final String d() {
        return this.d;
    }

    @Override // o.kl6
    public final List e() {
        return lv0.K0(this.b, 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il6)) {
            return false;
        }
        il6 il6Var = (il6) obj;
        return this.a == il6Var.a && im3.n(this.b, il6Var.b);
    }

    @Override // o.kl6
    public final zl6 f() {
        if (this.b.size() > 20) {
            return this.a;
        }
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preview(tab=" + this.a + ", entries=" + this.b + ")";
    }
}
