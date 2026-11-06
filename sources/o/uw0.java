package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class uw0 implements fs4 {
    public final fs4 b;
    public final fs4 c;

    public uw0(fs4 fs4Var, fs4 fs4Var2) {
        this.b = fs4Var;
        this.c = fs4Var2;
    }

    @Override // o.fs4
    public final boolean b(Function1 function1) {
        return this.b.b(function1) && this.c.b(function1);
    }

    @Override // o.fs4
    public final Object c(Object obj, hw2 hw2Var) {
        return this.c.c(this.b.c(obj, hw2Var), hw2Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uw0)) {
            return false;
        }
        uw0 uw0Var = (uw0) obj;
        return im3.n(this.b, uw0Var.b) && im3.n(this.c, uw0Var.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) c(new StringBuilder("["), new g9((byte) 11));
        sb.append("]");
        return sb.toString();
    }
}
