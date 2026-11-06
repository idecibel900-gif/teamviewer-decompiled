package o;

/* JADX INFO: loaded from: classes.dex */
public final class m92 implements l92 {
    public final int m;
    public int n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1450o = -1;

    public m92(int i) {
        this.m = i;
    }

    @Override // o.l92
    public final boolean g(CharSequence charSequence, int i, int i2, z58 z58Var) {
        int i3 = this.m;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.n = i;
        this.f1450o = i2;
        return false;
    }

    @Override // o.l92
    public final Object k() {
        return this;
    }
}
