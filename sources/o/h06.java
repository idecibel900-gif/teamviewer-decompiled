package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h06 extends f2 {
    public static final int[] i = {1, 10, 34, 70, 126};
    public static final int[] j = {4, 20, 48, 81};
    public static final int[] k = {0, 161, 961, 2015, 2715};
    public static final int[] l = {0, 336, 1036, 1516};
    public static final int[] m = {8, 6, 4, 3, 1};
    public static final int[] n = {2, 4, 6, 8};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f937o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public static void j(ArrayList arrayList, wd5 wd5Var) {
        if (wd5Var == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wd5 wd5Var2 = (wd5) it.next();
            if (wd5Var2.a == wd5Var.a) {
                wd5Var2.d++;
                return;
            }
        }
        arrayList.add(wd5Var);
    }

    @Override // o.a95
    public final uc6 b(int i2, i70 i70Var, Map map) throws d55 {
        wd5 wd5VarL = l(i70Var, false, i2, map);
        ArrayList<wd5> arrayList = this.g;
        j(arrayList, wd5VarL);
        i70Var.e();
        wd5 wd5VarL2 = l(i70Var, true, i2, map);
        ArrayList<wd5> arrayList2 = this.h;
        j(arrayList2, wd5VarL2);
        i70Var.e();
        for (wd5 wd5Var : arrayList) {
            int i3 = wd5Var.d;
            jl2 jl2Var = wd5Var.c;
            if (i3 > 1) {
                for (wd5 wd5Var2 : arrayList2) {
                    int i4 = wd5Var2.d;
                    jl2 jl2Var2 = wd5Var2.c;
                    if (i4 > 1) {
                        int i5 = ((wd5Var2.b * 16) + wd5Var.b) % 79;
                        int i6 = (jl2Var.a * 9) + jl2Var2.a;
                        if (i6 > 72) {
                            i6--;
                        }
                        if (i6 > 8) {
                            i6--;
                        }
                        if (i5 == i6) {
                            String strValueOf = String.valueOf((((long) wd5Var.a) * 4537077) + ((long) wd5Var2.a));
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - strValueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(strValueOf);
                            int i7 = 0;
                            for (int i8 = 0; i8 < 13; i8++) {
                                int iCharAt = sb.charAt(i8) - '0';
                                if ((i8 & 1) == 0) {
                                    iCharAt *= 3;
                                }
                                i7 += iCharAt;
                            }
                            int i9 = 10 - (i7 % 10);
                            if (i9 == 10) {
                                i9 = 0;
                            }
                            sb.append(i9);
                            wc6[] wc6VarArr = jl2Var.c;
                            wc6[] wc6VarArr2 = jl2Var2.c;
                            uc6 uc6Var = new uc6(sb.toString(), null, new wc6[]{wc6VarArr[0], wc6VarArr[1], wc6VarArr2[0], wc6VarArr2[1]}, v20.y);
                            uc6Var.b(vc6.y, "]e0");
                            return uc6Var;
                        }
                    }
                }
            }
        }
        throw d55.a();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e A[PHI: r13 r14
      0x008e: PHI (r13v12 boolean) = (r13v4 boolean), (r13v15 boolean) binds: [B:44:0x00ab, B:32:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r14v10 boolean) = (r14v2 boolean), (r14v13 boolean) binds: [B:44:0x00ab, B:32:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0094 A[PHI: r13 r14
      0x0094: PHI (r13v7 boolean) = (r13v4 boolean), (r13v15 boolean) binds: [B:46:0x00ae, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r14v5 boolean) = (r14v2 boolean), (r14v13 boolean) binds: [B:46:0x00ae, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0098 A[PHI: r13 r14
      0x0098: PHI (r13v6 boolean) = (r13v4 boolean), (r13v15 boolean) binds: [B:46:0x00ae, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r14v4 boolean) = (r14v2 boolean), (r14v13 boolean) binds: [B:46:0x00ae, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    public final sg1 k(i70 i70Var, jl2 jl2Var, boolean z) throws d55 {
        float[] fArr;
        float[] fArr2;
        int[] iArr;
        int[] iArr2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int[] iArr3 = this.b;
        Arrays.fill(iArr3, 0);
        int[] iArr4 = jl2Var.b;
        if (z) {
            a95.f(iArr4[0], i70Var, iArr3);
        } else {
            a95.e(iArr4[1], i70Var, iArr3);
            int i2 = 0;
            for (int length = iArr3.length - 1; i2 < length; length--) {
                int i3 = iArr3[i2];
                iArr3[i2] = iArr3[length];
                iArr3[length] = i3;
                i2++;
            }
        }
        int i4 = z ? 16 : 15;
        float fX = xs1.X(iArr3) / i4;
        int i5 = 0;
        while (true) {
            int length2 = iArr3.length;
            fArr = this.d;
            fArr2 = this.c;
            iArr = this.f;
            iArr2 = this.e;
            if (i5 >= length2) {
                break;
            }
            float f = iArr3[i5] / fX;
            int i6 = (int) (0.5f + f);
            if (i6 < 1) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                iArr2[i7] = i6;
                fArr2[i7] = f - i6;
            } else {
                iArr[i7] = i6;
                fArr[i7] = f - i6;
            }
            i5++;
        }
        int iX = xs1.X(iArr2);
        int iX2 = xs1.X(iArr);
        if (z) {
            if (iX > 12) {
                z2 = false;
                z3 = true;
            } else if (iX < 4) {
                z3 = false;
                z2 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            if (iX2 > 12) {
                z4 = false;
                z5 = true;
            } else if (iX2 < 4) {
                z5 = false;
                z4 = true;
            } else {
                z4 = false;
                z5 = false;
            }
        } else {
            if (iX > 11) {
                z2 = false;
                z3 = true;
            } else if (iX < 5) {
                z3 = false;
                z2 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            if (iX2 > 10) {
                z4 = false;
                z5 = true;
            } else if (iX2 < 4) {
                z5 = false;
                z4 = true;
            } else {
                z4 = false;
                z5 = false;
            }
        }
        int i8 = (iX + iX2) - i4;
        boolean z6 = (iX & 1) == z;
        boolean z7 = (iX2 & 1) == 1;
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 != 1) {
                    throw d55.a();
                }
                if (z6) {
                    if (z7) {
                        throw d55.a();
                    }
                    z3 = true;
                } else {
                    if (!z7) {
                        throw d55.a();
                    }
                    z5 = true;
                }
            } else if (z6) {
                if (!z7) {
                    throw d55.a();
                }
                if (iX < iX2) {
                    z2 = true;
                    z5 = true;
                } else {
                    z3 = true;
                    z4 = true;
                }
            } else if (z7) {
                throw d55.a();
            }
        } else if (z6) {
            if (z7) {
                throw d55.a();
            }
            z2 = true;
        } else {
            if (!z7) {
                throw d55.a();
            }
            z4 = true;
        }
        if (z2) {
            if (z3) {
                throw d55.a();
            }
            f2.h(fArr2, iArr2);
        }
        if (z3) {
            f2.g(fArr2, iArr2);
        }
        if (z4) {
            if (z5) {
                throw d55.a();
            }
            f2.h(fArr2, iArr);
        }
        if (z5) {
            f2.g(fArr, iArr);
        }
        int i9 = 0;
        int i10 = 0;
        for (int length3 = iArr2.length - 1; length3 >= 0; length3--) {
            int i11 = iArr2[length3];
            i9 = (i9 * 9) + i11;
            i10 += i11;
        }
        int i12 = 0;
        int i13 = 0;
        for (int length4 = iArr.length - 1; length4 >= 0; length4--) {
            int i14 = iArr[length4];
            i12 = (i12 * 9) + i14;
            i13 += i14;
        }
        int i15 = (i12 * 3) + i9;
        if (!z) {
            if ((i13 & 1) != 0 || i13 > 10 || i13 < 4) {
                throw d55.a();
            }
            int i16 = (10 - i13) / 2;
            int i17 = n[i16];
            return new sg1((vs1.z(iArr, 9 - i17, false) * j[i16]) + vs1.z(iArr2, i17, true) + l[i16], i15);
        }
        if ((i10 & 1) != 0 || i10 > 12 || i10 < 4) {
            throw d55.a();
        }
        int i18 = (12 - i10) / 2;
        int i19 = m[i18];
        return new sg1((vs1.z(iArr2, i19, false) * i[i18]) + vs1.z(iArr, 9 - i19, true) + k[i18], i15);
    }

    public final wd5 l(i70 i70Var, boolean z, int i2, Map map) {
        try {
            jl2 jl2VarN = n(i70Var, i2, z, m(i70Var, z));
            xc6 xc6Var = map == null ? null : (xc6) map.get(pi1.NEED_RESULT_POINT_CALLBACK);
            if (xc6Var != null) {
                int[] iArr = jl2VarN.b;
                float f = ((iArr[0] + iArr[1]) - 1) / 2.0f;
                if (z) {
                    f = (i70Var.n - 1) - f;
                }
                xc6Var.a(new wc6(f, i2));
            }
            sg1 sg1VarK = k(i70Var, jl2VarN, true);
            sg1 sg1VarK2 = k(i70Var, jl2VarN, false);
            return new wd5((sg1VarK.a * 1597) + sg1VarK2.a, (sg1VarK2.b * 4) + sg1VarK.b, jl2VarN);
        } catch (d55 unused) {
            return null;
        }
    }

    public final int[] m(i70 i70Var, boolean z) throws d55 {
        int[] iArr = this.a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i2 = i70Var.n;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            z2 = !i70Var.a(i3);
            if (z == z2) {
                break;
            }
            i3++;
        }
        int i4 = 0;
        int i5 = i3;
        while (i3 < i2) {
            if (i70Var.a(i3) != z2) {
                iArr[i4] = iArr[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else {
                    if (f2.i(iArr)) {
                        return new int[]{i5, i3};
                    }
                    i5 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i4--;
                }
                iArr[i4] = 1;
                z2 = !z2;
            }
            i3++;
        }
        throw d55.a();
    }

    public final jl2 n(i70 i70Var, int i2, boolean z, int[] iArr) throws d55 {
        int i3;
        int i4;
        boolean zA = i70Var.a(iArr[0]);
        int i5 = iArr[0] - 1;
        while (i5 >= 0 && zA != i70Var.a(i5)) {
            i5--;
        }
        int i6 = i5 + 1;
        int i7 = iArr[0] - i6;
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = i7;
        for (int i8 = 0; i8 < 9; i8++) {
            if (a95.d(iArr2, f937o[i8], 0.45f) < 0.2f) {
                int i9 = iArr[1];
                if (z) {
                    int i10 = i70Var.n - 1;
                    i3 = i10 - i9;
                    i4 = i10 - i6;
                } else {
                    i3 = i9;
                    i4 = i6;
                }
                return new jl2(i8, i4, i3, i2, new int[]{i6, i9});
            }
        }
        throw d55.a();
    }

    @Override // o.a95, o.n36
    public final void reset() {
        this.g.clear();
        this.h.clear();
    }
}
