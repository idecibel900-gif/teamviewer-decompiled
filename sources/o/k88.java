package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k88 {
    public static final k88 f = new k88(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public k88(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static k88 b() {
        return new k88(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iH;
        int iJ;
        int iD;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iD = yu0.d(i5);
                } else if (i6 == 2) {
                    iD = yu0.a(i5, (yh0) this.c[i3]);
                } else if (i6 == 3) {
                    iH = yu0.h(i5) * 2;
                    iJ = ((k88) this.c[i3]).a();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(qm3.b());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iD = yu0.c(i5);
                }
                i2 = iD + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iH = yu0.h(i5);
                iJ = yu0.j(jLongValue);
            }
            i2 = iJ + iH + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            gk0.u();
            return;
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final void d(df6 df6Var) {
        if (this.a == 0) {
            return;
        }
        df6Var.getClass();
        yu0 yu0Var = (yu0) df6Var.n;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                long jLongValue = ((Long) obj).longValue();
                yu0Var.p(i3, 0);
                yu0Var.r(jLongValue);
            } else if (i4 == 1) {
                long jLongValue2 = ((Long) obj).longValue();
                yu0Var.p(i3, 1);
                yu0Var.n(jLongValue2);
            } else if (i4 == 2) {
                df6Var.w(i3, (yh0) obj);
            } else if (i4 == 3) {
                yu0Var.p(i3, 3);
                ((k88) obj).d(df6Var);
                yu0Var.p(i3, 4);
            } else if (i4 != 5) {
                gk0.r(qm3.b());
                return;
            } else {
                int iIntValue = ((Integer) obj).intValue();
                yu0Var.p(i3, 5);
                yu0Var.m(iIntValue);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k88)) {
            return false;
        }
        k88 k88Var = (k88) obj;
        int i = this.a;
        if (i == k88Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = k88Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = k88Var.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
