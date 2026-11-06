package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ff3 implements v46 {
    public final ns4 m;

    public ff3(ns4 ns4Var) {
        this.m = ns4Var;
    }

    public final boolean equals(Object obj) {
        ff3 ff3Var = obj instanceof ff3 ? (ff3) obj : null;
        return this.m.equals(ff3Var != null ? ff3Var.m : null);
    }

    @Override // o.v46
    public final oz3 getType() {
        g07 g07VarW = this.m.W();
        g07VarW.getClass();
        return g07VarW;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        g07 g07VarW = this.m.W();
        g07VarW.getClass();
        sb.append(g07VarW);
        sb.append('}');
        return sb.toString();
    }
}
