package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xx2 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final kw4 e;
    public final kh7 f;

    public xx2(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            up5.a("Invalid start index");
        }
        this.d = new ArrayList();
        kw4 kw4Var = new kw4();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ix3 ix3Var = (ix3) this.a.get(i3);
            int i4 = ix3Var.c;
            int i5 = ix3Var.d;
            kw4Var.i(i4, new m33(i3, i2, i5));
            i2 += i5;
        }
        this.e = kw4Var;
        this.f = new kh7(new a3(this, (byte) 14));
    }

    public final boolean a(int i, int i2) {
        m33 m33Var;
        int i3;
        int i4;
        kw4 kw4Var = this.e;
        m33 m33Var2 = (m33) kw4Var.b(i);
        if (m33Var2 == null) {
            return false;
        }
        int i5 = m33Var2.b;
        int i6 = i2 - m33Var2.c;
        m33Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = kw4Var.c;
        long[] jArr = kw4Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (m33Var = (m33) objArr[(i7 << 3) + i9]).b) >= i5 && m33Var != m33Var2 && (i4 = i3 + i6) >= 0) {
                        m33Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
