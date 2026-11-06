package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nl6 {
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function0 d;
    public final Function0 e;
    public final Function1 f;
    public final Function1 g;
    public final Function0 h;

    public nl6(Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7) {
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function0.getClass();
        function1.getClass();
        function6.getClass();
        function7.getClass();
        function2.getClass();
        this.a = function3;
        this.b = function4;
        this.c = function5;
        this.d = function0;
        this.e = function1;
        this.f = function6;
        this.g = function7;
        this.h = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl6)) {
            return false;
        }
        nl6 nl6Var = (nl6) obj;
        return im3.n(this.a, nl6Var.a) && im3.n(this.b, nl6Var.b) && im3.n(this.c, nl6Var.c) && im3.n(this.d, nl6Var.d) && im3.n(this.e, nl6Var.e) && im3.n(this.f, nl6Var.f) && im3.n(this.g, nl6Var.g) && im3.n(this.h, nl6Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua5.d(ua5.d(e41.f(e41.f(ua5.d(ua5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "SearchScreenActions(setSearchValue=" + this.a + ", onSearchTabSelect=" + this.b + ", onSearchResultClick=" + this.c + ", onDismissSearchView=" + this.d + ", onDismissDetails=" + this.e + ", onRemoteControlClick=" + this.f + ", onFileTransferClick=" + this.g + ", onDismissChooseComputerOfContactClick=" + this.h + ")";
    }
}
