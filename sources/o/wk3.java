package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class wk3 implements Iterable, su3 {
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2422o;

    public wk3(int i, int i2, int i3) {
        if (i3 == 0) {
            hk0.g("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            hk0.g("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.m = i;
        this.n = bt1.E(i, i2, i3);
        this.f2422o = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wk3)) {
            return false;
        }
        if (isEmpty() && ((wk3) obj).isEmpty()) {
            return true;
        }
        wk3 wk3Var = (wk3) obj;
        return this.m == wk3Var.m && this.n == wk3Var.n && this.f2422o == wk3Var.f2422o;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.m * 31) + this.n) * 31) + this.f2422o;
    }

    public boolean isEmpty() {
        int i = this.n;
        int i2 = this.f2422o;
        int i3 = this.m;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xk3(this.m, this.n, this.f2422o);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.n;
        int i2 = this.f2422o;
        int i3 = this.m;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
