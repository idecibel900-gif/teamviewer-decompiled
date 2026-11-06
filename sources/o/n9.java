package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n9 {
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final Function0 f;
    public final Function0 g;

    public n9(Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function0 function0, Function0 function6) {
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function0.getClass();
        function6.getClass();
        this.a = function1;
        this.b = function2;
        this.c = function3;
        this.d = function4;
        this.e = function5;
        this.f = function0;
        this.g = function6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return im3.n(this.a, n9Var.a) && im3.n(this.b, n9Var.b) && im3.n(this.c, n9Var.c) && im3.n(this.d, n9Var.d) && im3.n(this.e, n9Var.e) && im3.n(this.f, n9Var.f) && im3.n(this.g, n9Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + e41.f(ua5.d(ua5.d(ua5.d(ua5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "AddContactUiActions(updateEmail=" + this.a + ", show=" + this.b + ", updateGroup=" + this.c + ", setPreSelectedGroup=" + this.d + ", updateDescription=" + this.e + ", clearInputFields=" + this.f + ", sendInvitation=" + this.g + ")";
    }
}
