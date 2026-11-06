package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class t06 {
    public static final r94 d = new r94((byte) 0);
    public static final int[] e = new int[0];
    public static final r06 f = new r06(-1, -1, -1);
    public static final t06 g = new t06();
    public final r94 a;
    public final int b;
    public final int c;

    public t06(r94 r94Var, int i, int i2) {
        this.a = r94Var;
        if (i < 0 || i2 < 0) {
            hk0.g("Range positions must be non-negative");
            throw null;
        }
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t06.class == obj.getClass()) {
            t06 t06Var = (t06) obj;
            if (this.b == t06Var.b && this.c == t06Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }

    public final String toString() {
        r06 r06Var;
        int i;
        int i2;
        int i3;
        StringBuilder sbB = lb7.b();
        r94 r94Var = this.a;
        r06 r06Var2 = f;
        int i4 = this.b;
        int i5 = -1;
        if (i4 == -1) {
            r06Var = r06Var2;
        } else {
            if (i4 < 0) {
                r94Var.getClass();
                i = -1;
            } else {
                int iBinarySearch = Arrays.binarySearch(r94Var.a, 0, r94Var.b, i4);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                i = iBinarySearch + 2;
            }
            if (i4 < 0) {
                i2 = -1;
            } else {
                int iBinarySearch2 = Arrays.binarySearch(r94Var.a, 0, r94Var.b, i4);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-iBinarySearch2) - 2;
                }
                i2 = iBinarySearch2 == -1 ? i4 + 1 : (i4 - r94Var.a[iBinarySearch2]) + 1;
            }
            r06Var = new r06(i4, i, i2);
        }
        sbB.append(r06Var);
        sbB.append('-');
        int i6 = this.c;
        if (i6 != -1) {
            if (i6 < 0) {
                r94Var.getClass();
                i3 = -1;
            } else {
                int iBinarySearch3 = Arrays.binarySearch(r94Var.a, 0, r94Var.b, i6);
                if (iBinarySearch3 < 0) {
                    iBinarySearch3 = (-iBinarySearch3) - 2;
                }
                i3 = iBinarySearch3 + 2;
            }
            if (i6 >= 0) {
                int iBinarySearch4 = Arrays.binarySearch(r94Var.a, 0, r94Var.b, i6);
                if (iBinarySearch4 < 0) {
                    iBinarySearch4 = (-iBinarySearch4) - 2;
                }
                i5 = iBinarySearch4 == -1 ? i6 + 1 : (i6 - r94Var.a[iBinarySearch4]) + 1;
            }
            r06Var2 = new r06(i6, i3, i5);
        }
        sbB.append(r06Var2);
        return lb7.k(sbB);
    }

    public t06() {
        this.a = d;
        this.b = -1;
        this.c = -1;
    }
}
