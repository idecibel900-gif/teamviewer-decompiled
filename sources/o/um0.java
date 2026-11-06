package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class um0 {
    public final he a;
    public final Function1 b;
    public final rl2 c;
    public final boolean d;

    public um0(he heVar, Function1 function1, rl2 rl2Var, boolean z) {
        this.a = heVar;
        this.b = function1;
        this.c = rl2Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um0)) {
            return false;
        }
        um0 um0Var = (um0) obj;
        return im3.n(this.a, um0Var.a) && im3.n(this.b, um0Var.b) && im3.n(this.c, um0Var.c) && this.d == um0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ua5.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ")";
    }
}
