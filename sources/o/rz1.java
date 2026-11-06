package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class rz1 extends vs1 {
    public final ur e;
    public final boolean f;
    public final Function0 g;
    public final boolean h;
    public final Function0 i;
    public final hw2 j;
    public final boolean k;
    public final boolean l;
    public final Function0 m;

    public rz1(ur urVar, boolean z, Function0 function0, boolean z2, Function0 function1, yy0 yy0Var, boolean z3, boolean z4, Function0 function2) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        this.e = urVar;
        this.f = z;
        this.g = function0;
        this.h = z2;
        this.i = function1;
        this.j = yy0Var;
        this.k = z3;
        this.l = z4;
        this.m = function2;
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
        if (!(obj instanceof rz1)) {
            return false;
        }
        rz1 rz1Var = (rz1) obj;
        return this.e.equals(rz1Var.e) && this.f == rz1Var.f && im3.n(this.g, rz1Var.g) && this.h == rz1Var.h && im3.n(this.i, rz1Var.i) && im3.n(this.j, rz1Var.j) && this.k == rz1Var.k && this.l == rz1Var.l && im3.n(this.m, rz1Var.m);
    }

    public final int hashCode() {
        int iF = e41.f(to7.f(e41.f(to7.f(this.e.z.hashCode() * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        hw2 hw2Var = this.j;
        return this.m.hashCode() + to7.f(to7.f((iF + (hw2Var == null ? 0 : hw2Var.hashCode())) * 31, 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Group(title=");
        sb.append(this.e);
        sb.append(", isNavigationIconVisible=");
        sb.append(this.f);
        sb.append(", onNavigationClick=");
        sb.append(this.g);
        sb.append(", isSearchVisible=");
        sb.append(this.h);
        sb.append(", onSearchClick=");
        sb.append(this.i);
        sb.append(", dropDownMenuActionsContent=");
        sb.append(this.j);
        sb.append(", isSortVisible=");
        fx3.s(sb, this.k, ", isSortLoading=", this.l, ", onSortClick=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }

    @Override // o.vs1
    public final Function0 y() {
        return this.g;
    }
}
