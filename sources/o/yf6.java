package o;

/* JADX INFO: loaded from: classes2.dex */
public final class yf6 {
    public final zf6 a;
    public final zf6 b;
    public final Throwable c;

    public /* synthetic */ yf6(zf6 zf6Var, Throwable th, int i) {
        this(zf6Var, (f31) null, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf6)) {
            return false;
        }
        yf6 yf6Var = (yf6) obj;
        return im3.n(this.a, yf6Var.a) && im3.n(this.b, yf6Var.b) && im3.n(this.c, yf6Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zf6 zf6Var = this.b;
        int iHashCode2 = (iHashCode + (zf6Var == null ? 0 : zf6Var.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public yf6(zf6 zf6Var, f31 f31Var, Throwable th) {
        this.a = zf6Var;
        this.b = f31Var;
        this.c = th;
    }
}
