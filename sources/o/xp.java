package o;

/* JADX INFO: loaded from: classes2.dex */
public final class xp {
    public final up a;

    public xp(up upVar) {
        upVar.getClass();
        this.a = upVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xp) {
            return im3.n(((xp) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
