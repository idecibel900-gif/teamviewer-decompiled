package o;

/* JADX INFO: loaded from: classes.dex */
public final class bd2 implements se3 {
    public final xd3 a;
    public final ke3 b;
    public final Throwable c;

    public bd2(xd3 xd3Var, ke3 ke3Var, Throwable th) {
        this.a = xd3Var;
        this.b = ke3Var;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd2)) {
            return false;
        }
        bd2 bd2Var = (bd2) obj;
        return im3.n(this.a, bd2Var.a) && im3.n(this.b, bd2Var.b) && this.c.equals(bd2Var.c);
    }

    public final int hashCode() {
        xd3 xd3Var = this.a;
        int iHashCode = xd3Var == null ? 0 : xd3Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // o.se3
    public final ke3 p() {
        return this.b;
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }
}
