package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f67 {
    public final Function0 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;

    public f67(Function0 function0, Function1 function1, Function1 function2, Function1 function3) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = function3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f67)) {
            return false;
        }
        f67 f67Var = (f67) obj;
        return im3.n(this.a, f67Var.a) && im3.n(this.b, f67Var.b) && im3.n(this.c, f67Var.c) && im3.n(this.d, f67Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua5.d(ua5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "SolutionsScreenActions(onNoBrowserAvailable=" + this.a + ", reportEvent=" + this.b + ", getMainIntentUrl=" + this.c + ", getFallbackIntentUrl=" + this.d + ")";
    }
}
