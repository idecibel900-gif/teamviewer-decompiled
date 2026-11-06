package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s00 {
    public final du0 a;
    public final HashMap b;

    public s00(du0 du0Var, HashMap map) {
        this.a = du0Var;
        this.b = map;
    }

    public final long a(ss5 ss5Var, long j, int i) {
        long jA = j - this.a.a();
        t00 t00Var = (t00) this.b.get(ss5Var);
        long j2 = t00Var.a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jA), t00Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s00)) {
            return false;
        }
        s00 s00Var = (s00) obj;
        return this.a.equals(s00Var.a) && this.b.equals(s00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
