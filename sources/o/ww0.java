package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ww0 extends yw0 {
    @Override // o.td2
    public final boolean b(o82 o82Var, o82 o82Var2) {
        for (int i = 0; i < this.c; i++) {
            if (!((td2) this.b.get(i)).b(o82Var, o82Var2)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.td2
    public final boolean c(o82 o82Var, q54 q54Var) {
        for (int i = 0; i < this.c; i++) {
            if (!((td2) this.b.get(i)).c(o82Var, q54Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return lb7.j("", this.a);
    }
}
