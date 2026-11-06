package o;

/* JADX INFO: loaded from: classes2.dex */
public final class xr0 {
    public final ty4 a;
    public final tu5 b;
    public final h60 c;
    public final s67 d;

    public xr0(ty4 ty4Var, tu5 tu5Var, h60 h60Var, s67 s67Var) {
        ty4Var.getClass();
        tu5Var.getClass();
        s67Var.getClass();
        this.a = ty4Var;
        this.b = tu5Var;
        this.c = h60Var;
        this.d = s67Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0)) {
            return false;
        }
        xr0 xr0Var = (xr0) obj;
        return im3.n(this.a, xr0Var.a) && im3.n(this.b, xr0Var.b) && this.c.equals(xr0Var.c) && im3.n(this.d, xr0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
