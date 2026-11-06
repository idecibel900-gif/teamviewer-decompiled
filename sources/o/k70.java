package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k70 implements Cloneable {
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1233o;
    public int[] p;

    public k70(int i, int i2) {
        if (i < 1 || i2 < 1) {
            hk0.g("Both dimensions must be greater than 0");
            throw null;
        }
        this.m = i;
        this.n = i2;
        int i3 = (i + 31) / 32;
        this.f1233o = i3;
        this.p = new int[i3 * i2];
    }

    public final void a(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f1233o);
        int[] iArr = this.p;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public final boolean b(int i, int i2) {
        return ((this.p[(i / 32) + (i2 * this.f1233o)] >>> (i & 31)) & 1) != 0;
    }

    public final int[] c() {
        int length = this.p.length - 1;
        while (length >= 0 && this.p[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f1233o;
        int i2 = length / i;
        int i3 = (length % i) * 32;
        int i4 = this.p[length];
        int i5 = 31;
        while ((i4 >>> i5) == 0) {
            i5--;
        }
        return new int[]{i3 + i5, i2};
    }

    public final Object clone() {
        int i = this.m;
        int i2 = this.n;
        int i3 = this.f1233o;
        int[] iArr = (int[]) this.p.clone();
        k70 k70Var = new k70();
        k70Var.m = i;
        k70Var.n = i2;
        k70Var.f1233o = i3;
        k70Var.p = iArr;
        return k70Var;
    }

    public final i70 d(i70 i70Var, int i) {
        int i2 = i70Var.n;
        int i3 = this.m;
        if (i2 < i3) {
            i70Var = new i70(i3);
        } else {
            int length = i70Var.m.length;
            for (int i4 = 0; i4 < length; i4++) {
                i70Var.m[i4] = 0;
            }
        }
        int i5 = i * this.f1233o;
        for (int i6 = 0; i6 < this.f1233o; i6++) {
            i70Var.m[(i6 * 32) / 32] = this.p[i5 + i6];
        }
        return i70Var;
    }

    public final int[] e() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.p;
            if (i2 >= iArr.length || iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.f1233o;
        int i4 = i2 / i3;
        int i5 = (i2 % i3) * 32;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{i5 + i, i4};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k70)) {
            return false;
        }
        k70 k70Var = (k70) obj;
        return this.m == k70Var.m && this.n == k70Var.n && this.f1233o == k70Var.f1233o && Arrays.equals(this.p, k70Var.p);
    }

    public final void g() {
        i70 i70Var = new i70(this.m);
        i70 i70Var2 = new i70(this.m);
        int i = (this.n + 1) / 2;
        for (int i2 = 0; i2 < i; i2++) {
            i70Var = d(i70Var, i2);
            int i3 = (this.n - 1) - i2;
            i70Var2 = d(i70Var2, i3);
            i70Var.e();
            i70Var2.e();
            int[] iArr = i70Var2.m;
            int[] iArr2 = this.p;
            int i4 = this.f1233o;
            System.arraycopy(iArr, 0, iArr2, i2 * i4, i4);
            int[] iArr3 = i70Var.m;
            int[] iArr4 = this.p;
            int i5 = this.f1233o;
            System.arraycopy(iArr3, 0, iArr4, i3 * i5, i5);
        }
    }

    public final void h() {
        int i = this.n;
        int i2 = this.m;
        int i3 = (i + 31) / 32;
        int[] iArr = new int[i3 * i2];
        for (int i4 = 0; i4 < this.n; i4++) {
            for (int i5 = 0; i5 < this.m; i5++) {
                if (((this.p[(i5 / 32) + (this.f1233o * i4)] >>> (i5 & 31)) & 1) != 0) {
                    int i6 = (i4 / 32) + (((i2 - 1) - i5) * i3);
                    iArr[i6] = iArr[i6] | (1 << (i4 & 31));
                }
            }
        }
        this.m = i;
        this.n = i2;
        this.f1233o = i3;
        this.p = iArr;
    }

    public final int hashCode() {
        int i = this.m;
        return Arrays.hashCode(this.p) + (((((((i * 31) + i) * 31) + this.n) * 31) + this.f1233o) * 31);
    }

    public final void i(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f1233o);
        int[] iArr = this.p;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final void j(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            hk0.g("Left and top must be nonnegative");
            return;
        }
        if (i4 < 1 || i3 < 1) {
            hk0.g("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.n || i5 > this.m) {
            hk0.g("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.f1233o * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.p;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.m + 1) * this.n);
        for (int i = 0; i < this.n; i++) {
            for (int i2 = 0; i2 < this.m; i2++) {
                sb.append(b(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
