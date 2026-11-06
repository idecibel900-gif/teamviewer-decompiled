package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i70 implements Cloneable {
    public int[] m;
    public int n;

    public i70(int i) {
        this.n = i;
        this.m = new int[(i + 31) / 32];
    }

    public final boolean a(int i) {
        return (this.m[i / 32] & (1 << (i & 31))) != 0;
    }

    public final int b(int i) {
        int i2 = this.n;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & this.m[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.m;
            if (i3 == iArr.length) {
                return i2;
            }
            i4 = iArr[i3];
        }
        return Math.min(Integer.numberOfTrailingZeros(i4) + (i3 * 32), i2);
    }

    public final int c(int i) {
        int i2 = this.n;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & (~this.m[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.m;
            if (i3 == iArr.length) {
                return i2;
            }
            i4 = ~iArr[i3];
        }
        return Math.min(Integer.numberOfTrailingZeros(i4) + (i3 * 32), i2);
    }

    public final Object clone() {
        int[] iArr = (int[]) this.m.clone();
        int i = this.n;
        i70 i70Var = new i70();
        i70Var.m = iArr;
        i70Var.n = i;
        return i70Var;
    }

    public final boolean d(int i, int i2) {
        if (i2 < i || i < 0 || i2 > this.n) {
            yq4.f();
            return false;
        }
        if (i2 != i) {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                if ((((2 << (i6 >= i5 ? 31 & i3 : 31)) - (1 << (i6 > i4 ? 0 : i & 31))) & this.m[i6]) != 0) {
                    return false;
                }
                i6++;
            }
        }
        return true;
    }

    public final void e() {
        int[] iArr = new int[this.m.length];
        int i = this.n;
        int i2 = (i - 1) / 32;
        int i3 = i2 + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 - i4] = Integer.reverse(this.m[i4]);
        }
        int i5 = i3 * 32;
        if (i != i5) {
            int i6 = i5 - i;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i3; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2] = i7;
        }
        this.m = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i70)) {
            return false;
        }
        i70 i70Var = (i70) obj;
        return this.n == i70Var.n && Arrays.equals(this.m, i70Var.m);
    }

    public final void g(int i) {
        int[] iArr = this.m;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.m) + (this.n * 31);
    }

    public final String toString() {
        int i = this.n;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < i; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(a(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
