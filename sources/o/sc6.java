package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class sc6 implements Serializable {
    public final Throwable m;

    public sc6(Throwable th) {
        th.getClass();
        this.m = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sc6) {
            return im3.n(this.m, ((sc6) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.m + ')';
    }
}
