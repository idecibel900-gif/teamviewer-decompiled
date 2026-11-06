package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nu8 extends mu8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f1603o;

    public nu8(byte[] bArr) {
        this.f1603o = bArr;
    }

    @Override // o.mu8
    public final byte a(int i) {
        return this.f1603o[i];
    }

    @Override // o.mu8
    public final int b(int i, int i2) {
        return zu8.a(i, 0, i2, this.f1603o);
    }

    @Override // o.mu8
    public final int c() {
        return this.f1603o.length;
    }

    @Override // o.mu8
    public final mu8 d(int i, int i2) {
        byte[] bArr = this.f1603o;
        int i3 = mu8.i(0, i2, bArr.length);
        return i3 == 0 ? mu8.n : new lu8(bArr, 0, i3);
    }

    @Override // o.mu8
    public final void f(byte[] bArr, int i) {
        System.arraycopy(this.f1603o, 0, bArr, 0, i);
    }

    @Override // o.mu8
    public final void g(cv0 cv0Var) {
        byte[] bArr = this.f1603o;
        cv0Var.K(bArr, 0, bArr.length);
    }

    @Override // o.mu8
    public final boolean h(mu8 mu8Var) {
        boolean z = mu8Var instanceof nu8;
        byte[] bArr = this.f1603o;
        if (z) {
            return Arrays.equals(bArr, ((nu8) mu8Var).f1603o);
        }
        boolean z2 = mu8Var instanceof lu8;
        if (!z2) {
            return mu8Var.h(this);
        }
        lu8 lu8Var = (lu8) mu8Var;
        int i = lu8Var.q;
        int length = bArr.length;
        if (length > i) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > i) {
            hk0.g(ua5.l("Ran off end of other: 0, ", length, i, ", "));
            return false;
        }
        if (z) {
            return mu8.l(0, 0, length, bArr, ((nu8) mu8Var).f1603o);
        }
        if (!z2) {
            return mu8Var.d(0, length).equals(d(0, length));
        }
        return mu8.l(0, lu8Var.p, length, bArr, lu8Var.f1408o);
    }
}
