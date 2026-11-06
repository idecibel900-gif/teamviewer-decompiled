package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f17 {
    public final Function1 a;
    public final rl2 b;

    public f17(Function1 function1, rl2 rl2Var) {
        this.a = function1;
        this.b = rl2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f17)) {
            return false;
        }
        f17 f17Var = (f17) obj;
        return im3.n(this.a, f17Var.a) && im3.n(this.b, f17Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
