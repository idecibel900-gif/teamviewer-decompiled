package o;

/* JADX INFO: loaded from: classes.dex */
public final class dm4 implements pq4 {
    public pq4[] a;

    @Override // o.pq4
    public final v06 a(Class cls) {
        for (pq4 pq4Var : this.a) {
            if (pq4Var.b(cls)) {
                return pq4Var.a(cls);
            }
        }
        yq4.r("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // o.pq4
    public final boolean b(Class cls) {
        for (pq4 pq4Var : this.a) {
            if (pq4Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
