package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ic7 extends kc7 {
    @Override // o.td2
    public final int a() {
        return this.a.a() + 2;
    }

    @Override // o.kc7
    public final boolean g(o82 o82Var, x35 x35Var) {
        x35 x35VarI;
        if (o82Var == x35Var) {
            return false;
        }
        if (!this.b) {
            x35Var.getClass();
            while (true) {
                x35Var = x35Var.I();
                if (x35Var == null) {
                    x35VarI = null;
                    break;
                }
                if (x35Var instanceof o82) {
                    x35VarI = (o82) x35Var;
                    break;
                }
            }
        } else {
            x35VarI = x35Var.I();
        }
        return x35VarI != null && h(o82Var, x35VarI);
    }

    public final String toString() {
        return String.format("%s + ", this.a);
    }
}
