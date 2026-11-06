package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ja1 {
    public final Function0 a;
    public final Function1 b;
    public final Function0 c;
    public final Function1 d;
    public final hw2 e;

    public ja1(Function0 function0, Function1 function1, Function0 function2, Function1 function3, hw2 hw2Var) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        hw2Var.getClass();
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = function3;
        this.e = hw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja1)) {
            return false;
        }
        ja1 ja1Var = (ja1) obj;
        return im3.n(this.a, ja1Var.a) && im3.n(this.b, ja1Var.b) && im3.n(this.c, ja1Var.c) && im3.n(this.d, ja1Var.d) && im3.n(this.e, ja1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua5.d(e41.f(ua5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ContactsScreenUiActions(toggleSorting=" + this.a + ", changeSortOrder=" + this.b + ", toggleFiltering=" + this.c + ", changeSelectedFilter=" + this.d + ", saveScrollPosition=" + this.e + ")";
    }
}
