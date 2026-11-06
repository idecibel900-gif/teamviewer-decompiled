package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class of2 {
    public final sg1 a;
    public final sg1 b;
    public final jl2 c;

    public of2(sg1 sg1Var, sg1 sg1Var2, jl2 jl2Var) {
        this.a = sg1Var;
        this.b = sg1Var2;
        this.c = jl2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof of2)) {
            return false;
        }
        of2 of2Var = (of2) obj;
        return Objects.equals(this.a, of2Var.a) && Objects.equals(this.b, of2Var.b) && Objects.equals(this.c, of2Var.c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.c) ^ (Objects.hashCode(this.a) ^ Objects.hashCode(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.a);
        sb.append(" , ");
        sb.append(this.b);
        sb.append(" : ");
        jl2 jl2Var = this.c;
        sb.append(jl2Var == null ? "null" : Integer.valueOf(jl2Var.a));
        sb.append(" ]");
        return sb.toString();
    }
}
