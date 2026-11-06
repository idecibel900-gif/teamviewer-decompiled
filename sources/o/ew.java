package o;

/* JADX INFO: loaded from: classes.dex */
public final class ew implements dw, gw {
    public final float m;
    public final fw n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f745o;

    public ew(float f, fw fwVar) {
        this.m = f;
        this.n = fwVar;
        this.f745o = f;
    }

    @Override // o.dw, o.gw
    public final float a() {
        return this.f745o;
    }

    @Override // o.gw
    public final void b(in1 in1Var, int i, int[] iArr, int[] iArr2) {
        h(in1Var, i, iArr, j04.m, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew)) {
            return false;
        }
        ew ewVar = (ew) obj;
        return w32.b(this.m, ewVar.m) && this.n.equals(ewVar.n);
    }

    @Override // o.dw
    public final void h(in1 in1Var, int i, int[] iArr, j04 j04Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iQ0 = in1Var.q0(this.m);
        boolean z = j04Var == j04.n;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iQ0, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iQ0, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        if (i2 > 0) {
            int iC = this.n.c(i2, j04Var);
            if (z) {
                iC -= i2;
            }
            if (iC != 0) {
                int length3 = iArr2.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    iArr2[i11] = iArr2[i11] + iC;
                }
            }
        }
    }

    public final int hashCode() {
        return this.n.hashCode() + to7.f(Float.hashCode(this.m) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + w32.c(this.m) + ", " + this.n + ")";
    }
}
