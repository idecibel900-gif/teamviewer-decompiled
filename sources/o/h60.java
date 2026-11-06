package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h60 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public h60(int... iArr) {
        List listP0;
        this.a = iArr;
        Integer numU0 = cx.U0(iArr, 0);
        this.b = numU0 != null ? numU0.intValue() : -1;
        Integer numU1 = cx.U0(iArr, 1);
        this.c = numU1 != null ? numU1.intValue() : -1;
        Integer numU2 = cx.U0(iArr, 2);
        this.d = numU2 != null ? numU2.intValue() : -1;
        if (iArr.length <= 3) {
            listP0 = ea2.m;
        } else {
            if (iArr.length > 1024) {
                hk0.g(e41.j(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            listP0 = lv0.P0(new l1(new dx(iArr), 3, iArr.length));
        }
        this.e = listP0;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        h60 h60Var = (h60) obj;
        return this.b == h60Var.b && this.c == h60Var.c && this.d == h60Var.d && this.e.equals(h60Var.e);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : lv0.t0(arrayList, ".", null, null, null, 62);
    }
}
