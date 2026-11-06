package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yb1 implements fq6 {
    public final hq6 a;
    public final wt3 b;
    public final String c;

    public yb1(hq6 hq6Var, wt3 wt3Var) {
        wt3Var.getClass();
        this.a = hq6Var;
        this.b = wt3Var;
        this.c = hq6Var.a + '<' + wt3Var.f() + '>';
    }

    @Override // o.fq6
    public final String a() {
        return this.c;
    }

    @Override // o.fq6
    public final boolean c() {
        return false;
    }

    @Override // o.fq6
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // o.fq6
    public final int e() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        yb1 yb1Var = obj instanceof yb1 ? (yb1) obj : null;
        return yb1Var != null && this.a.equals(yb1Var.a) && im3.n(yb1Var.b, this.b);
    }

    @Override // o.fq6
    public final String f(int i) {
        return this.a.e[i];
    }

    @Override // o.fq6
    public final List g(int i) {
        return this.a.g[i];
    }

    @Override // o.fq6
    public final List getAnnotations() {
        return ea2.m;
    }

    @Override // o.fq6
    public final fq6 h(int i) {
        return this.a.f[i];
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // o.fq6
    public final boolean i(int i) {
        return this.a.h[i];
    }

    @Override // o.fq6
    public final it1 k() {
        return this.a.b;
    }

    @Override // o.fq6
    public final boolean m() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
