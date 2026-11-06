package o;

/* JADX INFO: loaded from: classes2.dex */
public final class hn0 extends in0 {
    public final Throwable a;

    public hn0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hn0) {
            return im3.n(this.a, ((hn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // o.in0
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
