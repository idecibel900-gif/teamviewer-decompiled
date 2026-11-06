package o;

/* JADX INFO: loaded from: classes.dex */
public final class qh3 implements jo {
    public final d72 a;
    public final ra6 b;

    public qh3(d72 d72Var, ra6 ra6Var) {
        this.a = d72Var;
        this.b = ra6Var;
        if (d72Var instanceof z38) {
            z38 z38Var = (z38) d72Var;
            if (z38Var.a != 0 || z38Var.b != 0) {
                return;
            }
        } else if (d72Var instanceof m47) {
            if (((m47) d72Var).a != 0) {
                return;
            }
        } else if (!(d72Var instanceof jy3) || ((jy3) d72Var).a.a != 0) {
            return;
        }
        hk0.g("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // o.jo
    public final ec8 a(yn1 yn1Var) {
        return new io.sentry.android.replay.gestures.c(this.a.a(yn1Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qh3)) {
            return false;
        }
        qh3 qh3Var = (qh3) obj;
        return qh3Var.a.equals(this.a) && qh3Var.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
