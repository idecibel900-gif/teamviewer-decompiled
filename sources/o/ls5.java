package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ls5 implements fq6 {
    public final String a;
    public final is5 b;

    public ls5(String str, is5 is5Var) {
        is5Var.getClass();
        this.a = str;
        this.b = is5Var;
    }

    @Override // o.fq6
    public final String a() {
        return this.a;
    }

    public final void b() {
        throw new IllegalStateException(e41.l(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // o.fq6
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // o.fq6
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls5)) {
            return false;
        }
        ls5 ls5Var = (ls5) obj;
        return this.a.equals(ls5Var.a) && im3.n(this.b, ls5Var.b);
    }

    @Override // o.fq6
    public final String f(int i) {
        b();
        throw null;
    }

    @Override // o.fq6
    public final List g(int i) {
        b();
        throw null;
    }

    @Override // o.fq6
    public final fq6 h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // o.fq6
    public final boolean i(int i) {
        b();
        throw null;
    }

    @Override // o.fq6
    public final it1 k() {
        return this.b;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.a + ')';
    }
}
