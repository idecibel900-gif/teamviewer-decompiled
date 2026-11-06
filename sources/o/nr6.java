package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nr6 {
    public final Function0 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;
    public final Function1 g;
    public final Function1 h;
    public final Function1 i;
    public final Function1 j;
    public final Function1 k;
    public final Function1 l;
    public final hw2 m;

    public /* synthetic */ nr6() {
        this(new oq6((byte) 18), new fk6((byte) 20), new fk6((byte) 21), new fk6((byte) 22), new fk6((byte) 23), new fk6((byte) 24), new fk6((byte) 25), new fk6((byte) 15), new fk6((byte) 16), new fk6((byte) 17), new fk6((byte) 18), new fk6((byte) 19), new jp6((byte) 16));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr6)) {
            return false;
        }
        nr6 nr6Var = (nr6) obj;
        return im3.n(this.a, nr6Var.a) && im3.n(this.b, nr6Var.b) && im3.n(this.c, nr6Var.c) && im3.n(this.d, nr6Var.d) && im3.n(this.e, nr6Var.e) && im3.n(this.f, nr6Var.f) && im3.n(this.g, nr6Var.g) && im3.n(this.h, nr6Var.h) && im3.n(this.i, nr6Var.i) && im3.n(this.j, nr6Var.j) && im3.n(this.k, nr6Var.k) && im3.n(this.l, nr6Var.l) && im3.n(this.m, nr6Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        return "ServiceQueueScreenUiActions(toggleSorting=" + this.a + ", changeSortOrder=" + this.b + ", onSessionClick=" + this.c + ", onConnectSessionClick=" + this.d + ", onSessionMoreActionsClick=" + this.e + ", onSessionMoreActionsDismiss=" + this.f + ", onAssignSupportSessionToMeClick=" + this.g + ", onUnassignSupportSessionClick=" + this.h + ", onShowSessionDetailsClick=" + this.i + ", onEditSessionClick=" + this.j + ", onShareSession=" + this.k + ", onDeleteSupportSessionClick=" + this.l + ", saveScrollPosition=" + this.m + ")";
    }

    public nr6(Function0 function0, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, Function1 function9, Function1 function10, Function1 function11, hw2 hw2Var) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        function9.getClass();
        function10.getClass();
        function11.getClass();
        hw2Var.getClass();
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = function3;
        this.e = function4;
        this.f = function5;
        this.g = function6;
        this.h = function7;
        this.i = function8;
        this.j = function9;
        this.k = function10;
        this.l = function11;
        this.m = hw2Var;
    }
}
