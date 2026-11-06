package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s64 extends g2 {
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jb f1987o;
    public final boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s64(String str, jb jbVar, boolean z) {
        super(jbVar);
        str.getClass();
        this.n = str;
        this.f1987o = jbVar;
        this.p = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s64) {
            s64 s64Var = (s64) obj;
            if (im3.n(this.n, s64Var.n) && this.f1987o == s64Var.f1987o && this.p == s64Var.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + ((this.f1987o.hashCode() + (this.n.hashCode() * 31)) * 31);
    }

    @Override // o.g2
    public final Function1 q0() {
        return this.f1987o;
    }

    @Override // o.g2
    public final String s0() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersonalDataConsent(text=");
        sb.append(this.n);
        sb.append(", onChecked=");
        sb.append(this.f1987o);
        sb.append(", isChecked=");
        return ua5.n(")", sb, this.p);
    }

    @Override // o.g2
    public final boolean u0() {
        return this.p;
    }
}
