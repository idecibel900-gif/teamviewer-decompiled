package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ds0 {
    public final js0 a;
    public final xr0 b;

    public ds0(js0 js0Var, xr0 xr0Var) {
        js0Var.getClass();
        this.a = js0Var;
        this.b = xr0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ds0) {
            return im3.n(this.a, ((ds0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
