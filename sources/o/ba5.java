package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ba5 extends hm2 {
    public static final ba5 d = new ba5(1, 0, 2);

    @Override // o.hm2
    public final void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        int[] iArr;
        px2 px2Var;
        int iC;
        int iG = rr0Var.g(0);
        if (k17Var.n != 0) {
            i01.a("Cannot move a group while inserting");
        }
        if (iG < 0) {
            i01.a("Parameter offset is out of bounds");
        }
        if (iG == 0) {
            return;
        }
        int i = k17Var.t;
        int i2 = k17Var.v;
        int i3 = k17Var.u;
        int i4 = i;
        while (true) {
            iArr = k17Var.b;
            if (iG <= 0) {
                break;
            }
            i4 += iArr[(k17Var.q(i4) * 5) + 3];
            if (i4 > i3) {
                i01.a("Parameter offset is out of bounds");
            }
            iG--;
        }
        int i5 = iArr[(k17Var.q(i4) * 5) + 3];
        int iF = k17Var.f(k17Var.b, k17Var.q(k17Var.t));
        int iF2 = k17Var.f(k17Var.b, k17Var.q(i4));
        int i6 = i4 + i5;
        int iF3 = k17Var.f(k17Var.b, k17Var.q(i6));
        int i7 = iF3 - iF2;
        k17Var.w(i7, Math.max(k17Var.t - 1, 0));
        k17Var.v(i5);
        int[] iArr2 = k17Var.b;
        int iQ = k17Var.q(i6) * 5;
        cx.F0(k17Var.q(i) * 5, iQ, (i5 * 5) + iQ, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = k17Var.c;
            int iG2 = k17Var.g(iF2 + i7);
            System.arraycopy(objArr, iG2, objArr, iF, k17Var.g(iF3 + i7) - iG2);
        }
        int i8 = iF2 + i7;
        int i9 = i8 - iF;
        int i10 = k17Var.k;
        int i11 = k17Var.l;
        int length = k17Var.c.length;
        int i12 = k17Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iQ2 = k17Var.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iQ2 * 5) + 4] = k17.h(k17.h(k17Var.f(iArr2, iQ2) - i15, i12 < iQ2 ? 0 : i10, i11, length), k17Var.k, k17Var.l, k17Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iO = k17Var.o();
        int iB = j17.b(k17Var.d, i6, iO);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < k17Var.d.size() && (iC = k17Var.c((px2Var = (px2) k17Var.d.get(iB)))) >= i6 && iC < i16) {
                arrayList.add(px2Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            px2 px2Var2 = (px2) arrayList.get(i18);
            int iC2 = k17Var.c(px2Var2) + i17;
            if (iC2 >= k17Var.g) {
                px2Var2.a = -(iO - iC2);
            } else {
                px2Var2.a = iC2;
            }
            k17Var.d.add(j17.b(k17Var.d, iC2, iO), px2Var2);
        }
        if (k17Var.H(i6, i5)) {
            i01.a("Unexpectedly removed anchors");
        }
        k17Var.l(i2, k17Var.u, i);
        if (i7 > 0) {
            k17Var.I(i8, i7, i6 - 1);
        }
    }
}
