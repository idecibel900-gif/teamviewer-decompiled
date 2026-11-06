package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class pz1 extends vs1 {
    public final ur e;
    public final boolean f;
    public final Function0 g;
    public final Function0 h;

    public pz1(ur urVar, boolean z, Function0 function0, Function0 function1) {
        function0.getClass();
        this.e = urVar;
        this.f = z;
        this.g = function0;
        this.h = function1;
    }

    @Override // o.vs1
    public final ka0 A() {
        return this.e;
    }

    @Override // o.vs1
    public final boolean F() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz1)) {
            return false;
        }
        pz1 pz1Var = (pz1) obj;
        return this.e.equals(pz1Var.e) && this.f == pz1Var.f && im3.n(this.g, pz1Var.g) && im3.n(this.h, pz1Var.h);
    }

    public final int hashCode() {
        int iF = e41.f(to7.f(this.e.z.hashCode() * 31, 31, this.f), 31, this.g);
        Function0 function0 = this.h;
        return iF + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        return "Device(title=" + this.e + ", isNavigationIconVisible=" + this.f + ", onNavigationClick=" + this.g + ", onAction=" + this.h + ")";
    }

    @Override // o.vs1
    public final Function0 y() {
        return this.g;
    }
}
