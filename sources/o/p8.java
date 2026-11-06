package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class p8 implements rw2, Serializable {
    public final Object m;
    public final Class n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1711o;
    public final String p;
    public final boolean q = false;
    public final byte r;
    public final int s;

    /* JADX WARN: Multi-variable type inference failed */
    public p8(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.m = obj;
        this.n = cls;
        this.f1711o = str;
        this.p = str2;
        this.r = i;
        this.s = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return this.q == p8Var.q && this.r == p8Var.r && this.s == p8Var.s && im3.n(this.m, p8Var.m) && this.n.equals(p8Var.n) && this.f1711o.equals(p8Var.f1711o) && this.p.equals(p8Var.p);
    }

    @Override // o.rw2
    public final int getArity() {
        return this.r;
    }

    public final int hashCode() {
        Object obj = this.m;
        return ((((to7.e(to7.e((this.n.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.f1711o), 31, this.p) + (this.q ? 1231 : 1237)) * 31) + this.r) * 31) + this.s;
    }

    public final String toString() {
        return w86.a.i(this);
    }
}
