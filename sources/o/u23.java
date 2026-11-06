package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u23 {
    public final Function1 a;
    public final Function0 b;
    public final Function0 c;
    public final Function1 d;
    public final Function0 e;
    public final Function0 f;
    public final Function0 g;
    public final Function1 h;
    public final hw2 i;
    public final hw2 j;

    public u23(Function1 function1, Function0 function0, Function0 function2, Function1 function3, Function0 function4, Function0 function5, Function0 function6, Function1 function7, hw2 hw2Var, hw2 hw2Var2) {
        this.a = function1;
        this.b = function0;
        this.c = function2;
        this.d = function3;
        this.e = function4;
        this.f = function5;
        this.g = function6;
        this.h = function7;
        this.i = hw2Var;
        this.j = hw2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u23)) {
            return false;
        }
        u23 u23Var = (u23) obj;
        return this.a.equals(u23Var.a) && this.b.equals(u23Var.b) && this.c.equals(u23Var.c) && this.d.equals(u23Var.d) && this.e.equals(u23Var.e) && this.f.equals(u23Var.f) && this.g.equals(u23Var.g) && this.h.equals(u23Var.h) && this.i.equals(u23Var.i) && this.j.equals(u23Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ua5.d(e41.f(e41.f(e41.f(ua5.d(e41.f(e41.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        return "GroupDevicesScreenUiActions(onSearchTermChange=" + this.a + ", openSearch=" + this.b + ", closeSearch=" + this.c + ", connectToDevice=" + this.d + ", loadMoreDevices=" + this.e + ", retryLegacyDevices=" + this.f + ", toggleSorting=" + this.g + ", changeSortOrder=" + this.h + ", saveScrollPosition=" + this.i + ", updateGroupSelection=" + this.j + ")";
    }
}
