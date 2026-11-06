package o;

/* JADX INFO: loaded from: classes2.dex */
public final class vx0 {
    public final Object a;
    public final bl0 b;
    public final iw2 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ vx0(Object obj, bl0 bl0Var, iw2 iw2Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : bl0Var, (i & 4) != 0 ? null : iw2Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static vx0 a(vx0 vx0Var, bl0 bl0Var, Throwable th, int i) {
        Object obj = vx0Var.a;
        if ((i & 2) != 0) {
            bl0Var = vx0Var.b;
        }
        bl0 bl0Var2 = bl0Var;
        iw2 iw2Var = vx0Var.c;
        Object obj2 = vx0Var.d;
        if ((i & 16) != 0) {
            th = vx0Var.e;
        }
        return new vx0(obj, bl0Var2, iw2Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx0)) {
            return false;
        }
        vx0 vx0Var = (vx0) obj;
        return im3.n(this.a, vx0Var.a) && im3.n(this.b, vx0Var.b) && im3.n(this.c, vx0Var.c) && im3.n(this.d, vx0Var.d) && im3.n(this.e, vx0Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        bl0 bl0Var = this.b;
        int iHashCode2 = (iHashCode + (bl0Var == null ? 0 : bl0Var.hashCode())) * 31;
        iw2 iw2Var = this.c;
        int iHashCode3 = (iHashCode2 + (iw2Var == null ? 0 : iw2Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public vx0(Object obj, bl0 bl0Var, iw2 iw2Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = bl0Var;
        this.c = iw2Var;
        this.d = obj2;
        this.e = th;
    }
}
