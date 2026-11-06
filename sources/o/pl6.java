package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pl6 implements ql6 {
    public final Function0 a;
    public final tx1 b;
    public final Function1 c;
    public final Function1 d;

    public pl6(Function0 function0, tx1 tx1Var, Function1 function1, Function1 function2) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        this.a = function0;
        this.b = tx1Var;
        this.c = function1;
        this.d = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl6)) {
            return false;
        }
        pl6 pl6Var = (pl6) obj;
        return im3.n(this.a, pl6Var.a) && im3.n(this.b, pl6Var.b) && im3.n(this.c, pl6Var.c) && im3.n(this.d, pl6Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tx1 tx1Var = this.b;
        return this.d.hashCode() + ua5.d((iHashCode + (tx1Var == null ? 0 : tx1Var.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "ClickAndOpenDetails(onDismissDetails=" + this.a + ", searchSelection=" + this.b + ", onRequestNavigation=" + this.c + ", onOpenDetailsClick=" + this.d + ")";
    }
}
