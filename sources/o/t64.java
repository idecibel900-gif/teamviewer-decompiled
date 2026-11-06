package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t64 extends g2 {
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jb f2086o;
    public final boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t64(String str, jb jbVar, boolean z) {
        super(jbVar);
        str.getClass();
        this.n = str;
        this.f2086o = jbVar;
        this.p = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t64) {
            t64 t64Var = (t64) obj;
            if (im3.n(this.n, t64Var.n) && this.f2086o == t64Var.f2086o && this.p == t64Var.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + ((this.f2086o.hashCode() + (this.n.hashCode() * 31)) * 31);
    }

    @Override // o.g2
    public final Function1 q0() {
        return this.f2086o;
    }

    @Override // o.g2
    public final String s0() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersonalDataMarketingConsent(text=");
        sb.append(this.n);
        sb.append(", onChecked=");
        sb.append(this.f2086o);
        sb.append(", isChecked=");
        return ua5.n(")", sb, this.p);
    }

    @Override // o.g2
    public final boolean u0() {
        return this.p;
    }
}
