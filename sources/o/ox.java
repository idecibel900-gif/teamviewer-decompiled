package o;

/* JADX INFO: loaded from: classes.dex */
public final class ox {
    public static final ox a = new ox();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof ke3) || !(obj2 instanceof ke3)) {
            return im3.n(obj, obj2);
        }
        ke3 ke3Var = (ke3) obj;
        ke3 ke3Var2 = (ke3) obj2;
        return im3.n(ke3Var.a, ke3Var2.a) && ke3Var.b.equals(ke3Var2.b) && ke3Var.e.equals(ke3Var2.e) && im3.n(ke3Var.p, ke3Var2.p) && ke3Var.q == ke3Var2.q && ke3Var.r == ke3Var2.r;
    }

    public final int b(Object obj) {
        if (!(obj instanceof ke3)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        ke3 ke3Var = (ke3) obj;
        return ke3Var.r.hashCode() + ((ke3Var.q.hashCode() + ((ke3Var.p.hashCode() + ((ke3Var.e.hashCode() + ((ke3Var.b.hashCode() + (ke3Var.a.hashCode() * 31)) * 961)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
