package o;

/* JADX INFO: loaded from: classes.dex */
public final class bt7 {
    public final c77 a;
    public final c77 b;
    public final c77 c;
    public final c77 d;

    public bt7(c77 c77Var, c77 c77Var2, c77 c77Var3, c77 c77Var4) {
        this.a = c77Var;
        this.b = c77Var2;
        this.c = c77Var3;
        this.d = c77Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bt7)) {
            return false;
        }
        bt7 bt7Var = (bt7) obj;
        return im3.n(this.a, bt7Var.a) && im3.n(this.b, bt7Var.b) && im3.n(this.c, bt7Var.c) && im3.n(this.d, bt7Var.d);
    }

    public final int hashCode() {
        c77 c77Var = this.a;
        int iHashCode = (c77Var != null ? c77Var.hashCode() : 0) * 31;
        c77 c77Var2 = this.b;
        int iHashCode2 = (iHashCode + (c77Var2 != null ? c77Var2.hashCode() : 0)) * 31;
        c77 c77Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (c77Var3 != null ? c77Var3.hashCode() : 0)) * 31;
        c77 c77Var4 = this.d;
        return iHashCode3 + (c77Var4 != null ? c77Var4.hashCode() : 0);
    }
}
