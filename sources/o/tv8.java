package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tv8 {
    public static final tv8 f = new tv8(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public tv8(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static tv8 b() {
        return new tv8(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iW;
        int iX;
        int iW2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        mu8 mu8Var = (mu8) this.c[i2];
                        int iW3 = cv0.W(i6);
                        int iC = mu8Var.c();
                        iD = to7.d(iC, iC, iW3, iD);
                    } else if (i5 == 3) {
                        int iW4 = cv0.W(i4 << 3);
                        iW = iW4 + iW4;
                        iX = ((tv8) this.c[i2]).a();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new dv8());
                        }
                        ((Integer) this.c[i2]).getClass();
                        iW2 = cv0.W(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iW2 = cv0.W(i4 << 3) + 8;
                }
                iD = iW2 + iD;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iW = cv0.W(i7);
                iX = cv0.X(jLongValue);
            }
            iD = iX + iW + iD;
        }
        this.d = iD;
        return iD;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            gk0.u();
            return;
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(hj8 hj8Var) throws ou8 {
        cv0 cv0Var = (cv0) hj8Var.n;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    cv0Var.U(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    cv0Var.N(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    mu8 mu8Var = (mu8) obj;
                    cv0Var.T((i3 << 3) | 2);
                    cv0Var.T(mu8Var.c());
                    mu8Var.g(cv0Var);
                } else if (i4 == 3) {
                    cv0Var.R(i3, 3);
                    ((tv8) obj).d(hj8Var);
                    cv0Var.R(i3, 4);
                } else {
                    if (i4 != 5) {
                        gk0.r(new dv8());
                        return;
                    }
                    cv0Var.L(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof tv8)) {
            tv8 tv8Var = (tv8) obj;
            int i = this.a;
            if (i == tv8Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = tv8Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.c;
                Object[] objArr2 = tv8Var.c;
                int i3 = this.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
