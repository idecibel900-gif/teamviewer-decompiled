package o;

/* JADX INFO: loaded from: classes.dex */
public final class q00 {
    public final long a;
    public final u00 b;
    public final k00 c;

    public q00(long j, u00 u00Var, k00 k00Var) {
        this.a = j;
        this.b = u00Var;
        this.c = k00Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        return this.a == q00Var.a && this.b.equals(q00Var.b) && this.c.equals(q00Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
