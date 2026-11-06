package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class xg8 {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;

    public xg8(Function0 function0, Function0 function1, Function0 function2) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        this.a = function0;
        this.b = function1;
        this.c = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg8)) {
            return false;
        }
        xg8 xg8Var = (xg8) obj;
        return im3.n(this.a, xg8Var.a) && im3.n(this.b, xg8Var.b) && im3.n(this.c, xg8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + e41.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WaitingRoomActions(onDismissWaitingRoom=" + this.a + ", onCopySessionLinkClick=" + this.b + ", onCopySessionCodeClick=" + this.c + ")";
    }
}
