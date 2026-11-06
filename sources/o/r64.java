package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r64 extends g2 {
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jb f1895o;
    public final boolean p;
    public final String q;
    public final String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r64(String str, jb jbVar, boolean z, String str2, String str3) {
        super(jbVar);
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.n = str;
        this.f1895o = jbVar;
        this.p = z;
        this.q = str2;
        this.r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r64) {
            r64 r64Var = (r64) obj;
            if (im3.n(this.n, r64Var.n) && this.f1895o == r64Var.f1895o && this.p == r64Var.p && im3.n(this.q, r64Var.q) && im3.n(this.r, r64Var.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode() + to7.e(to7.f((this.f1895o.hashCode() + (this.n.hashCode() * 31)) * 31, 31, this.p), 31, this.q);
    }

    @Override // o.g2
    public final Function1 q0() {
        return this.f1895o;
    }

    @Override // o.g2
    public final String s0() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EulaAndDpa(text=");
        sb.append(this.n);
        sb.append(", onChecked=");
        sb.append(this.f1895o);
        sb.append(", isChecked=");
        sb.append(this.p);
        sb.append(", eulaClickableText=");
        sb.append(this.q);
        sb.append(", dpaClickableText=");
        return e41.l(sb, this.r, ")");
    }

    @Override // o.g2
    public final boolean u0() {
        return this.p;
    }
}
