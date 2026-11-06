package o;

/* JADX INFO: loaded from: classes.dex */
public final class zq0 implements dw {
    public final float m;
    public final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f2727o;

    public zq0(float f) {
        this.m = f;
        this.n = f;
        this.f2727o = (f + f) / 2.0f;
    }

    @Override // o.dw, o.gw
    public final float a() {
        return this.f2727o;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    @Override // o.dw
    public final void h(in1 in1Var, int i, int[] iArr, j04 j04Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iQ0 = in1Var.q0(this.m);
        int iQ1 = in1Var.q0(this.n);
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            int i6 = i4 + 1;
            if (i4 == 0) {
                i2 = 0;
            } else if (i4 == 1) {
                int i7 = iArr[0];
                i2 = i7 + (i7 > 0 ? iQ0 : iQ1);
            } else if (i4 != 2) {
                i2 = 0;
            } else {
                i2 = i - i5;
            }
            if (j04Var != j04.m) {
                i2 = (i - i2) - i5;
            }
            iArr2[i4] = i2;
            i3++;
            i4 = i6;
        }
    }
}
