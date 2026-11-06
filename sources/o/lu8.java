package o;

/* JADX INFO: loaded from: classes.dex */
public final class lu8 extends mu8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f1408o;
    public final int p;
    public final int q;

    public lu8(byte[] bArr, int i, int i2) {
        mu8.i(i, i + i2, bArr.length);
        this.f1408o = bArr;
        this.p = i;
        this.q = i2;
    }

    @Override // o.mu8
    public final byte a(int i) {
        return this.f1408o[this.p + i];
    }

    @Override // o.mu8
    public final int b(int i, int i2) {
        return zu8.a(i, this.p, i2, this.f1408o);
    }

    @Override // o.mu8
    public final int c() {
        return this.q;
    }

    @Override // o.mu8
    public final mu8 d(int i, int i2) {
        int i3 = mu8.i(i, i2, this.q);
        if (i3 == 0) {
            return mu8.n;
        }
        return new lu8(this.f1408o, this.p + i, i3);
    }

    @Override // o.mu8
    public final void f(byte[] bArr, int i) {
        System.arraycopy(this.f1408o, this.p, bArr, 0, i);
    }

    @Override // o.mu8
    public final void g(cv0 cv0Var) {
        cv0Var.K(this.f1408o, this.p, this.q);
    }

    @Override // o.mu8
    public final boolean h(mu8 mu8Var) {
        boolean z = mu8Var instanceof nu8;
        if (!z && !(mu8Var instanceof lu8)) {
            return mu8Var.h(this);
        }
        int iC = mu8Var.c();
        int i = this.q;
        if (i > iC) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > mu8Var.c()) {
            hk0.g(ua5.l("Ran off end of other: 0, ", i, mu8Var.c(), ", "));
            return false;
        }
        byte[] bArr = this.f1408o;
        int i2 = this.p;
        if (z) {
            return mu8.l(i2, 0, i, bArr, ((nu8) mu8Var).f1603o);
        }
        if (!(mu8Var instanceof lu8)) {
            return mu8Var.d(0, i).equals(d(i2, i + i2));
        }
        lu8 lu8Var = (lu8) mu8Var;
        return mu8.l(i2, lu8Var.p, i, bArr, lu8Var.f1408o);
    }
}
