package o;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends m1 implements RandomAccess {
    public final m1 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1319o;

    public l1(m1 m1Var, int i, int i2) {
        this.m = m1Var;
        this.n = i;
        g68.k(i, i2, m1Var.a());
        this.f1319o = i2 - i;
    }

    @Override // o.r0
    public final int a() {
        return this.f1319o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f1319o;
        if (i < 0 || i >= i2) {
            hk0.r(ua5.l("index: ", i, i2, ", size: "));
            return null;
        }
        return this.m.get(this.n + i);
    }

    @Override // o.m1, java.util.List
    public final List subList(int i, int i2) {
        g68.k(i, i2, this.f1319o);
        int i3 = this.n;
        return new l1(this.m, i + i3, i3 + i2);
    }
}
