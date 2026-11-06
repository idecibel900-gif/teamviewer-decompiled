package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i17 implements p01, Iterable, su3 {
    public final h17 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1026o;

    public i17(h17 h17Var, int i, int i2) {
        this.m = h17Var;
        this.n = i;
        this.f1026o = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i17)) {
            return false;
        }
        i17 i17Var = (i17) obj;
        return i17Var.n == this.n && i17Var.f1026o == this.f1026o && i17Var.m == this.m;
    }

    public final int hashCode() {
        return (this.m.hashCode() * 31) + this.n;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        h17 h17Var = this.m;
        if (h17Var.t != this.f1026o) {
            j17.e();
        }
        int i = this.n;
        h17Var.g(i);
        return new n33(h17Var, i + 1, h17Var.m[(i * 5) + 3] + i);
    }
}
