package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ci2 {
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;
    public final Function1 g;
    public final Function0 h;
    public final iw2 i;

    public ci2(Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function0 function0, iw2 iw2Var) {
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function0.getClass();
        iw2Var.getClass();
        this.a = function1;
        this.b = function2;
        this.c = function3;
        this.d = function4;
        this.e = function5;
        this.f = function6;
        this.g = function7;
        this.h = function0;
        this.i = iw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci2)) {
            return false;
        }
        ci2 ci2Var = (ci2) obj;
        return im3.n(this.a, ci2Var.a) && im3.n(this.b, ci2Var.b) && im3.n(this.c, ci2Var.c) && im3.n(this.d, ci2Var.d) && im3.n(this.e, ci2Var.e) && im3.n(this.f, ci2Var.f) && im3.n(this.g, ci2Var.g) && im3.n(this.h, ci2Var.h) && im3.n(this.i, ci2Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + e41.f(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(ua5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        return "FeedbackActionHandler(setFeedbackRating=" + this.a + ", setFeedbackComment=" + this.b + ", setEmail=" + this.c + ", setCategory=" + this.d + ", setSubcategory=" + this.e + ", onLogFileAttachChanged=" + this.f + ", reportActionEvent=" + this.g + ", clearForm=" + this.h + ", upload=" + this.i + ")";
    }
}
