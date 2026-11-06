package o;

/* JADX INFO: loaded from: classes2.dex */
public final class d97 {
    public final long a;
    public final long b;

    public d97(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            gk0.h(to7.j(j, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        gk0.h(to7.j(j2, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d97)) {
            return false;
        }
        d97 d97Var = (d97) obj;
        return this.a == d97Var.a && this.b == d97Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        sa4 sa4Var = new sa4(2);
        long j = this.a;
        if (j > 0) {
            sa4Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            sa4Var.add("replayExpiration=" + j2 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + lv0.t0(qf0.r(sa4Var), null, null, null, null, 63) + ')';
    }
}
