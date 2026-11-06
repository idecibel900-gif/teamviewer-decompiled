package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hl6 implements kl6 {
    public final zl6 a;
    public final List b;
    public final int c;
    public final String d;

    public hl6(zl6 zl6Var, List list) {
        zl6Var.getClass();
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
        return false;
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
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl6)) {
            return false;
        }
        hl6 hl6Var = (hl6) obj;
        return this.a == hl6Var.a && im3.n(this.b, hl6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExpandedTab(tab=" + this.a + ", entries=" + this.b + ")";
    }
}
