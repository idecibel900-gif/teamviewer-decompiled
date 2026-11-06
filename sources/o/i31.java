package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i31 {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;
    public final Function1 d;
    public final Function0 e;
    public final Function1 f;
    public final Function1 g;
    public final Function1 h;
    public final Function1 i;
    public final Function0 j;
    public final Function0 k;
    public final Function0 l;
    public final Function0 m;

    public i31(Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function0 function7, Function0 function8, Function0 function9, Function0 function10) {
        h31 h31Var = new h31((byte) 0);
        y01 y01Var = new y01((byte) 11);
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
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = h31Var;
        this.e = y01Var;
        this.f = function3;
        this.g = function4;
        this.h = function5;
        this.i = function6;
        this.j = function7;
        this.k = function8;
        this.l = function9;
        this.m = function10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i31)) {
            return false;
        }
        i31 i31Var = (i31) obj;
        return this.a.equals(i31Var.a) && this.b.equals(i31Var.b) && this.c.equals(i31Var.c) && this.d.equals(i31Var.d) && this.e.equals(i31Var.e) && this.f.equals(i31Var.f) && this.g.equals(i31Var.g) && this.h.equals(i31Var.h) && this.i.equals(i31Var.i) && this.j.equals(i31Var.j) && this.k.equals(i31Var.k) && this.l.equals(i31Var.l) && im3.n(this.m, i31Var.m);
    }

    public final int hashCode() {
        int iF = e41.f(e41.f(e41.f(ua5.d(ua5.d(ua5.d(ua5.d(e41.f(ua5.d(e41.f(e41.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        Function0 function0 = this.m;
        return iF + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        return "ConnectScreenActions(onDismissQuickSupportAppCard=" + this.a + ", onSessionsTileStateChange=" + this.b + ", onRecentConnectionsTileStateChange=" + this.c + ", setSearchValue=" + this.d + ", onSessionClick=" + this.e + ", onRemoteControlClick=" + this.f + ", onFileTransferClick=" + this.g + ", onShowSessionDetails=" + this.h + ", onStartSessionShortcutClick=" + this.i + ", onStartSessionClick=" + this.j + ", onSearchViewClick=" + this.k + ", onDismissSearchView=" + this.l + ", redirectToQuickSupportApp=" + this.m + ")";
    }
}
