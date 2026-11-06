package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u51 {
    public final Object a;

    public u51(Object obj) {
        this.a = obj;
    }

    public oz3 a(ps4 ps4Var) {
        ps4Var.getClass();
        return ((hp) this.a).getType();
    }

    public Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        u51 u51Var = obj instanceof u51 ? (u51) obj : null;
        return im3.n(objB, u51Var != null ? u51Var.b() : null);
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
