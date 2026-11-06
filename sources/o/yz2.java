package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yz2 {
    public final float[] a;
    public final int[] b;

    public yz2(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(yz2 yz2Var) {
        int i = 0;
        while (true) {
            int[] iArr = yz2Var.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = yz2Var.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final yz2 b(float[] fArr) {
        int iA;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iA = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iA = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iA = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iA = yo1.A((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iA;
        }
        return new yz2(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yz2.class != obj.getClass()) {
            return false;
        }
        yz2 yz2Var = (yz2) obj;
        return Arrays.equals(this.a, yz2Var.a) && Arrays.equals(this.b, yz2Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
