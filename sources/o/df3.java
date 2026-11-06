package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class df3 extends m1 {
    public final c2 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f617o;

    public df3(c2 c2Var, int i, int i2) {
        this.m = c2Var;
        this.n = i;
        it1.t(i, i2, c2Var.a());
        this.f617o = i2 - i;
    }

    @Override // o.r0
    public final int a() {
        return this.f617o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        it1.r(i, this.f617o);
        return this.m.get(this.n + i);
    }

    @Override // o.m1, java.util.List
    public final List subList(int i, int i2) {
        it1.t(i, i2, this.f617o);
        int i3 = this.n;
        return new df3(this.m, i + i3, i3 + i2);
    }
}
