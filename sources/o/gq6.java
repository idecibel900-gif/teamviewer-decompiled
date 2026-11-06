package o;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class gq6 implements fq6, mi0 {
    public final fq6 a;
    public final String b;
    public final Set c;

    public gq6(fq6 fq6Var) {
        fq6Var.getClass();
        this.a = fq6Var;
        this.b = fq6Var.a() + '?';
        this.c = im3.q(fq6Var);
    }

    @Override // o.fq6
    public final String a() {
        return this.b;
    }

    @Override // o.mi0
    public final Set b() {
        return this.c;
    }

    @Override // o.fq6
    public final boolean c() {
        return true;
    }

    @Override // o.fq6
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // o.fq6
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gq6) {
            return im3.n(this.a, ((gq6) obj).a);
        }
        return false;
    }

    @Override // o.fq6
    public final String f(int i) {
        return this.a.f(i);
    }

    @Override // o.fq6
    public final List g(int i) {
        return this.a.g(i);
    }

    @Override // o.fq6
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // o.fq6
    public final fq6 h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // o.fq6
    public final boolean i(int i) {
        return this.a.i(i);
    }

    @Override // o.fq6
    public final it1 k() {
        return this.a.k();
    }

    @Override // o.fq6
    public final boolean m() {
        return this.a.m();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
