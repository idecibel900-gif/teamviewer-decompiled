package o;

/* JADX INFO: loaded from: classes2.dex */
public final class jc7 extends kc7 {
    @Override // o.td2
    public final int a() {
        return this.a.a() * 3;
    }

    @Override // o.kc7
    public final boolean g(o82 o82Var, x35 x35Var) {
        if (o82Var == x35Var) {
            return false;
        }
        o82 o82Var2 = x35Var.m;
        for (x35 x35VarP = o82Var2 != null ? o82Var2.p() : x35Var; x35VarP != null && x35VarP != x35Var; x35VarP = x35VarP.w()) {
            if (h(o82Var, x35VarP)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", this.a);
    }
}
