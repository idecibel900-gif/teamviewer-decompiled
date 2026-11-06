package o;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class yc8 implements Comparable {
    public static final yc8 r;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2599o;
    public final String p;
    public final kh7 q = new kh7(new ks7(this, (byte) 6));

    static {
        new yc8("", 0, 0, 0);
        r = new yc8("", 0, 1, 0);
        new yc8("", 1, 0, 0);
    }

    public yc8(String str, int i, int i2, int i3) {
        this.m = i;
        this.n = i2;
        this.f2599o = i3;
        this.p = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yc8 yc8Var = (yc8) obj;
        yc8Var.getClass();
        Object value = this.q.getValue();
        value.getClass();
        Object value2 = yc8Var.q.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yc8)) {
            return false;
        }
        yc8 yc8Var = (yc8) obj;
        return this.m == yc8Var.m && this.n == yc8Var.n && this.f2599o == yc8Var.f2599o;
    }

    public final int hashCode() {
        return ((((527 + this.m) * 31) + this.n) * 31) + this.f2599o;
    }

    public final String toString() {
        String str = this.p;
        String strConcat = !ub7.b0(str) ? "-".concat(str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append('.');
        sb.append(this.n);
        sb.append('.');
        return to7.l(sb, this.f2599o, strConcat);
    }
}
