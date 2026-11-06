package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i06 extends f2 {
    public static final int[] k = {7, 5, 4, 3, 1};
    public static final int[] l = {4, 20, 52, 104, 204};
    public static final int[] m = {0, 348, 1388, 2948, 3988};
    public static final int[][] n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f1023o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    public static final int[][] p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    public final ArrayList g = new ArrayList(11);
    public final ArrayList h = new ArrayList();
    public final int[] i = new int[2];
    public boolean j;

    public static uc6 m(List list) {
        io.sentry.l6 dVar;
        byte b = 2;
        int size = list.size() * 2;
        int i = size - 1;
        byte b2 = 1;
        if (((of2) list.get(list.size() - 1)).b == null) {
            i = size - 2;
        }
        i70 i70Var = new i70(i * 12);
        byte b3 = 0;
        int i2 = ((of2) list.get(0)).b.a;
        int i3 = 0;
        for (int i4 = 11; i4 >= 0; i4--) {
            if (((1 << i4) & i2) != 0) {
                i70Var.g(i3);
            }
            i3++;
        }
        for (int i5 = 1; i5 < list.size(); i5++) {
            of2 of2Var = (of2) list.get(i5);
            int i6 = of2Var.a.a;
            for (int i7 = 11; i7 >= 0; i7--) {
                if (((1 << i7) & i6) != 0) {
                    i70Var.g(i3);
                }
                i3++;
            }
            sg1 sg1Var = of2Var.b;
            if (sg1Var != null) {
                int i8 = sg1Var.a;
                for (int i9 = 11; i9 >= 0; i9--) {
                    if (((1 << i9) & i8) != 0) {
                        i70Var.g(i3);
                    }
                    i3++;
                }
            }
        }
        if (i70Var.a(1)) {
            dVar = new e(i70Var, b);
        } else if (i70Var.a(2)) {
            int iQ = iu.q(1, 4, i70Var);
            if (iQ == 4) {
                dVar = new d(i70Var, (byte) 0);
            } else if (iQ != 5) {
                int iQ2 = iu.q(1, 5, i70Var);
                if (iQ2 == 12) {
                    dVar = new e(i70Var, b3);
                } else if (iQ2 != 13) {
                    switch (iu.q(1, 7, i70Var)) {
                        case 56:
                            dVar = new f(i70Var, "310", "11");
                            break;
                        case 57:
                            dVar = new f(i70Var, "320", "11");
                            break;
                        case 58:
                            dVar = new f(i70Var, "310", "13");
                            break;
                        case 59:
                            dVar = new f(i70Var, "320", "13");
                            break;
                        case 60:
                            dVar = new f(i70Var, "310", "15");
                            break;
                        case 61:
                            dVar = new f(i70Var, "320", "15");
                            break;
                        case 62:
                            dVar = new f(i70Var, "310", "17");
                            break;
                        case 63:
                            dVar = new f(i70Var, "320", "17");
                            break;
                        default:
                            yq4.t(i70Var, "unknown decoder: ");
                            return null;
                    }
                } else {
                    dVar = new e(i70Var, b2);
                }
            } else {
                dVar = new d(i70Var, (byte) 1);
            }
        } else {
            dVar = new zp(i70Var);
        }
        String strT = dVar.t();
        wc6[] wc6VarArr = ((of2) list.get(0)).c.c;
        wc6[] wc6VarArr2 = ((of2) list.get(list.size() - 1)).c.c;
        uc6 uc6Var = new uc6(strT, null, new wc6[]{wc6VarArr[0], wc6VarArr[1], wc6VarArr2[0], wc6VarArr2[1]}, v20.z);
        uc6Var.b(vc6.y, "]e0");
        return uc6Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c A[LOOP:1: B:11:0x0017->B:16:0x002c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0031 A[SYNTHETIC] */
    public static boolean p(ArrayList arrayList, boolean z) {
        int i;
        for (int i2 = 0; i2 < 10; i2++) {
            int[] iArr = p[i2];
            int size = arrayList.size();
            int length = iArr.length;
            if (z) {
                if (size == length) {
                    for (i = 0; i < arrayList.size(); i++) {
                        if (((of2) arrayList.get(i)).c.a != iArr[i]) {
                        }
                    }
                    return true;
                }
                continue;
            } else {
                if (size <= length) {
                    while (i < arrayList.size()) {
                        if (((of2) arrayList.get(i)).c.a != iArr[i]) {
                        }
                    }
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    @Override // o.a95
    public final uc6 b(int i, i70 i70Var, Map map) {
        this.j = false;
        try {
            return m(o(i70Var, i));
        } catch (d55 unused) {
            this.j = true;
            return m(o(i70Var, i));
        }
    }

    public final boolean j() {
        ArrayList arrayList = this.g;
        of2 of2Var = (of2) arrayList.get(0);
        sg1 sg1Var = of2Var.a;
        sg1 sg1Var2 = of2Var.b;
        if (sg1Var2 != null) {
            int i = sg1Var2.b;
            int i2 = 2;
            for (int i3 = 1; i3 < arrayList.size(); i3++) {
                of2 of2Var2 = (of2) arrayList.get(i3);
                i += of2Var2.a.b;
                int i4 = i2 + 1;
                sg1 sg1Var3 = of2Var2.b;
                if (sg1Var3 != null) {
                    i += sg1Var3.b;
                    i2 += 2;
                } else {
                    i2 = i4;
                }
            }
            if (((i2 - 4) * 211) + (i % 211) == sg1Var.a) {
                return true;
            }
        }
        return false;
    }

    public final List k(int i, ArrayList arrayList) throws d55 {
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i >= arrayList2.size()) {
                throw d55.a();
            }
            pf2 pf2Var = (pf2) arrayList2.get(i);
            ArrayList arrayList3 = pf2Var.a;
            ArrayList arrayList4 = this.g;
            arrayList4.addAll(arrayList3);
            int size = pf2Var.a.size();
            if (!p(arrayList4, false)) {
                arrayList4.subList(arrayList4.size() - size, arrayList4.size()).clear();
            } else {
                if (this.j()) {
                    return arrayList4;
                }
                arrayList.add(pf2Var);
                try {
                    return this.k(i + 1, arrayList);
                } catch (d55 unused) {
                    arrayList.remove(arrayList.size() - 1);
                    arrayList4.subList(arrayList4.size() - size, arrayList4.size()).clear();
                }
            }
            i++;
        }
    }

    public final List l(boolean z) {
        ArrayList arrayList = this.h;
        List listK = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.g.clear();
        if (z) {
            Collections.reverse(arrayList);
        }
        try {
            listK = k(0, new ArrayList());
        } catch (d55 unused) {
        }
        if (z) {
            Collections.reverse(arrayList);
        }
        return listK;
    }

    public final sg1 n(i70 i70Var, jl2 jl2Var, boolean z, boolean z2) throws d55 {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int[][] iArr;
        int[] iArr2 = this.b;
        Arrays.fill(iArr2, 0);
        if (z2) {
            a95.f(jl2Var.b[0], i70Var, iArr2);
        } else {
            a95.e(jl2Var.b[1], i70Var, iArr2);
            int i = 0;
            for (int length = iArr2.length - 1; i < length; length--) {
                int i2 = iArr2[i];
                iArr2[i] = iArr2[length];
                iArr2[length] = i2;
                i++;
            }
        }
        float fX = xs1.X(iArr2) / 17.0f;
        int[] iArr3 = jl2Var.b;
        int i3 = jl2Var.a;
        float f = (iArr3[1] - iArr3[0]) / 15.0f;
        if (Math.abs(fX - f) / f > 0.3f) {
            throw d55.a();
        }
        int i4 = 0;
        while (true) {
            int length2 = iArr2.length;
            float[] fArr = this.d;
            float[] fArr2 = this.c;
            int[] iArr4 = this.f;
            int[] iArr5 = this.e;
            if (i4 >= length2) {
                int iX = xs1.X(iArr5);
                int iX2 = xs1.X(iArr4);
                if (iX > 13) {
                    z3 = false;
                    z4 = true;
                } else if (iX < 4) {
                    z4 = false;
                    z3 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                if (iX2 > 13) {
                    z5 = false;
                    z6 = true;
                } else if (iX2 < 4) {
                    z6 = false;
                    z5 = true;
                } else {
                    z5 = false;
                    z6 = false;
                }
                int i5 = (iX + iX2) - 17;
                boolean z7 = (iX & 1) == 1;
                boolean z8 = (iX2 & 1) == 0;
                boolean z9 = z3;
                boolean z10 = z4;
                boolean z11 = z5;
                boolean z12 = z6;
                if (i5 != -1) {
                    if (i5 != 0) {
                        if (i5 != 1) {
                            throw d55.a();
                        }
                        if (z7) {
                            if (z8) {
                                throw d55.a();
                            }
                            z10 = true;
                        } else {
                            if (!z8) {
                                throw d55.a();
                            }
                            z12 = true;
                        }
                    } else if (z7) {
                        if (!z8) {
                            throw d55.a();
                        }
                        if (iX < iX2) {
                            z9 = true;
                            z12 = true;
                        } else {
                            z10 = true;
                            z11 = true;
                        }
                    } else if (z8) {
                        throw d55.a();
                    }
                } else if (z7) {
                    if (z8) {
                        throw d55.a();
                    }
                    z9 = true;
                } else {
                    if (!z8) {
                        throw d55.a();
                    }
                    z11 = true;
                }
                if (z9) {
                    if (z10) {
                        throw d55.a();
                    }
                    f2.h(fArr2, iArr5);
                }
                if (z10) {
                    f2.g(fArr2, iArr5);
                }
                if (z11) {
                    if (z12) {
                        throw d55.a();
                    }
                    f2.h(fArr2, iArr4);
                }
                if (z12) {
                    f2.g(fArr, iArr4);
                }
                int i6 = (((i3 * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
                int length3 = iArr5.length - 1;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    iArr = f1023o;
                    if (length3 < 0) {
                        break;
                    }
                    if (i3 != 0 || !z || !z2) {
                        i7 += iArr5[length3] * iArr[i6][length3 * 2];
                    }
                    i8 += iArr5[length3];
                    length3--;
                }
                int i9 = 0;
                for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                    if (i3 != 0 || !z || !z2) {
                        i9 += iArr4[length4] * iArr[i6][(length4 * 2) + 1];
                    }
                }
                int i10 = i7 + i9;
                if ((i8 & 1) != 0 || i8 > 13 || i8 < 4) {
                    throw d55.a();
                }
                int i11 = (13 - i8) / 2;
                int i12 = k[i11];
                return new sg1((vs1.z(iArr5, i12, true) * l[i11]) + vs1.z(iArr4, 9 - i12, false) + m[i11], i10);
            }
            float f2 = (iArr2[i4] * 1.0f) / fX;
            int i13 = (int) (0.5f + f2);
            if (i13 < 1) {
                if (f2 < 0.3f) {
                    throw d55.a();
                }
                i13 = 1;
            } else if (i13 > 8) {
                if (f2 > 8.7f) {
                    throw d55.a();
                }
                i13 = 8;
            }
            int i14 = i4 / 2;
            if ((i4 & 1) == 0) {
                iArr5[i14] = i13;
                fArr2[i14] = f2 - i13;
            } else {
                iArr4[i14] = i13;
                fArr[i14] = f2 - i13;
            }
            i4++;
        }
    }

    public final List o(i70 i70Var, int i) throws d55 {
        boolean zEquals;
        ArrayList arrayList = this.g;
        arrayList.clear();
        boolean z = false;
        while (!z) {
            try {
                arrayList.add(q(i70Var, arrayList, i));
            } catch (d55 e) {
                if (arrayList.isEmpty()) {
                    throw e;
                }
                z = true;
            }
        }
        if (j() && p(arrayList, true)) {
            return arrayList;
        }
        ArrayList arrayList2 = this.h;
        boolean zIsEmpty = arrayList2.isEmpty();
        int i2 = 0;
        boolean zEquals2 = false;
        while (true) {
            if (i2 >= arrayList2.size()) {
                zEquals = false;
                break;
            }
            pf2 pf2Var = (pf2) arrayList2.get(i2);
            int i3 = pf2Var.b;
            ArrayList arrayList3 = pf2Var.a;
            if (i3 > i) {
                zEquals = arrayList3.equals(arrayList);
                break;
            }
            zEquals2 = arrayList3.equals(arrayList);
            i2++;
        }
        if (!zEquals && !zEquals2) {
            Iterator it = arrayList2.iterator();
            loop2: while (true) {
                if (!it.hasNext()) {
                    arrayList2.add(i2, new pf2(i, arrayList));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        pf2 pf2Var2 = (pf2) it2.next();
                        if (pf2Var2.a.size() != arrayList.size()) {
                            Iterator it3 = pf2Var2.a.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    it2.remove();
                                    break;
                                }
                            } while (arrayList.contains((of2) it3.next()));
                        }
                    }
                    break;
                }
                pf2 pf2Var3 = (pf2) it.next();
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break loop2;
                    }
                    of2 of2Var = (of2) it4.next();
                    Iterator it5 = pf2Var3.a.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            if (of2Var.equals((of2) it5.next())) {
                            }
                        }
                    }
                }
            }
        }
        if (!zIsEmpty) {
            List listL = l(false);
            if (listL != null) {
                return listL;
            }
            List listL2 = l(true);
            if (listL2 != null) {
                return listL2;
            }
        }
        throw d55.a();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:114:0x0221  */
    /* JADX WARN: Code duplicated, block: B:124:0x023f A[LOOP:0: B:10:0x001c->B:124:0x023f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d9  */
    public final of2 q(i70 i70Var, ArrayList arrayList, int i) throws d55 {
        int i2;
        int i3;
        int i4;
        int iC;
        int i5;
        int[] iArr;
        jl2 jl2Var;
        int iB;
        sg1 sg1VarN;
        int i6;
        int[] iArr2;
        int i7 = 2;
        int i8 = 0;
        int i9 = 1;
        boolean z = arrayList.size() % 2 == 0;
        if (this.j) {
            z = !z;
        }
        int i10 = -1;
        boolean z2 = true;
        sg1 sg1VarN2 = null;
        while (true) {
            int[] iArr3 = this.a;
            iArr3[i8] = i8;
            iArr3[i9] = i8;
            iArr3[i7] = i8;
            int i11 = 3;
            iArr3[3] = i8;
            int i12 = i70Var.n;
            int i13 = i10 >= 0 ? i10 : arrayList.isEmpty() ? i8 : ((of2) ua5.j(i9, arrayList)).c.b[i9];
            int i14 = arrayList.size() % i7 != 0 ? i9 : i8;
            int i15 = i7;
            if (this.j) {
                i14 ^= 1;
            }
            int i16 = i8;
            while (i13 < i12) {
                boolean zA = i70Var.a(i13);
                int i17 = !zA;
                if (zA) {
                    i16 = i17;
                    break;
                }
                i13++;
                i16 = i17;
            }
            int i18 = i8;
            int i19 = i13;
            while (true) {
                if (i13 >= i12) {
                    throw d55.a();
                }
                i2 = i8;
                if (i70Var.a(i13) != i16) {
                    iArr3[i18] = iArr3[i18] + i9;
                    i3 = i9;
                    i11 = i11;
                } else {
                    if (i18 == i11) {
                        if (i14 != 0) {
                            int length = iArr3.length;
                            int i20 = i2;
                            while (true) {
                                i4 = i9;
                                if (i20 >= length / 2) {
                                    break;
                                }
                                int i21 = iArr3[i20];
                                int i22 = (length - i20) - 1;
                                iArr3[i20] = iArr3[i22];
                                iArr3[i22] = i21;
                                i20++;
                                i9 = i4;
                            }
                        } else {
                            i4 = i9;
                        }
                        if (f2.i(iArr3)) {
                            break;
                        }
                        if (i14 != 0) {
                            int length2 = iArr3.length;
                            for (int i23 = 0; i23 < length2 / 2; i23++) {
                                int i24 = iArr3[i23];
                                int i25 = (length2 - i23) - 1;
                                iArr3[i23] = iArr3[i25];
                                iArr3[i25] = i24;
                            }
                        }
                        i3 = 1;
                        i2 = 0;
                        i19 = iArr3[0] + iArr3[1] + i19;
                        iArr3[0] = iArr3[i15];
                        iArr3[1] = iArr3[i11];
                        iArr3[i15] = 0;
                        iArr3[i11] = 0;
                        i18--;
                    } else {
                        i3 = i9;
                        i11 = i11;
                        i18++;
                    }
                    iArr3[i18] = i3;
                    i16 ^= 1;
                }
                i13++;
                i8 = i2;
                i11 = i11;
                i9 = i3;
            }
            int[] iArr4 = this.i;
            iArr4[i2] = i19;
            iArr4[i4] = i13;
            if (z) {
                int i26 = i19 - 1;
                while (i26 >= 0 && !i70Var.a(i26)) {
                    i26--;
                }
                i19 = i26 + 1;
                i5 = iArr4[i2] - i19;
                iC = iArr4[i4];
            } else {
                iC = i70Var.c(i13 + 1);
                i5 = iC - iArr4[i4];
            }
            int i27 = i19;
            System.arraycopy(iArr3, i2, iArr3, i4, iArr3.length - 1);
            iArr3[i2] = i5;
            try {
                int[][] iArr5 = n;
                int i28 = 0;
                while (true) {
                    if (i28 >= 6) {
                        iArr = iArr4;
                        try {
                            throw d55.a();
                        } catch (d55 unused) {
                        }
                    } else if (a95.d(iArr3, iArr5[i28], 0.45f) < 0.2f) {
                        if (!arrayList.isEmpty()) {
                            int i29 = 0;
                            while (true) {
                                if (i29 < 10) {
                                    int[] iArr6 = p[i29];
                                    if (arrayList.size() + 1 <= iArr6.length) {
                                        int size = arrayList.size();
                                        while (true) {
                                            if (size < iArr6.length) {
                                                if (iArr6[size] == i28) {
                                                    int i30 = 0;
                                                    while (true) {
                                                        if (i30 < arrayList.size()) {
                                                            iArr2 = iArr4;
                                                            if (iArr6[(size - i30) - 1] == ((of2) arrayList.get((arrayList.size() - i30) - 1)).c.a) {
                                                                i30++;
                                                                iArr4 = iArr2;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iArr2 = iArr4;
                                                }
                                                size++;
                                                iArr4 = iArr2;
                                                i28 = i28;
                                                i27 = i27;
                                                iC = iC;
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    i29++;
                                    iArr4 = iArr4;
                                    i28 = i28;
                                    i27 = i27;
                                    iC = iC;
                                } else {
                                    iArr = iArr4;
                                }
                            }
                        }
                        iArr = iArr4;
                        if (!arrayList.isEmpty()) {
                            int[] iArr7 = ((of2) ua5.j(1, arrayList)).c.b;
                            int i31 = iArr7[0];
                            int i32 = iArr7[1];
                            float f = ((i32 - i31) / 15.0f) * 17.0f;
                            float f2 = i32;
                            float f3 = f * 2.0f;
                            float f4 = (0.9f * f3) + f2;
                            float f5 = (f3 * 1.1f) + f2;
                            float f6 = i27;
                            if (f6 < f4 || f6 > f5) {
                            }
                            if (jl2Var == null) {
                                i6 = iArr[0];
                                if (i70Var.a(i6)) {
                                    iB = i70Var.b(i70Var.c(i6));
                                } else {
                                    iB = i70Var.c(i70Var.b(i6));
                                }
                            } else {
                                try {
                                    sg1VarN2 = n(i70Var, jl2Var, z, true);
                                    z2 = false;
                                } catch (d55 unused2) {
                                    int i33 = iArr[0];
                                    iB = i70Var.a(i33) ? i70Var.b(i70Var.c(i33)) : i70Var.c(i70Var.b(i33));
                                    i10 = iB;
                                }
                                if (!z2) {
                                    if (arrayList.isEmpty() && ((of2) ua5.j(1, arrayList)).b == null) {
                                        throw d55.a();
                                    }
                                    try {
                                        sg1VarN = n(i70Var, jl2Var, z, false);
                                    } catch (d55 unused3) {
                                        sg1VarN = null;
                                    }
                                    return new of2(sg1VarN2, sg1VarN, jl2Var);
                                }
                                i7 = i15;
                                i8 = 0;
                                i9 = 1;
                            }
                            i10 = iB;
                            if (!z2) {
                                if (arrayList.isEmpty()) {
                                }
                                sg1VarN = n(i70Var, jl2Var, z, false);
                                return new of2(sg1VarN2, sg1VarN, jl2Var);
                            }
                            i7 = i15;
                            i8 = 0;
                            i9 = 1;
                        }
                        jl2Var = new jl2(i28, i27, iC, i, new int[]{i27, iC});
                        if (jl2Var == null) {
                            i6 = iArr[0];
                            if (i70Var.a(i6)) {
                                iB = i70Var.b(i70Var.c(i6));
                            } else {
                                iB = i70Var.c(i70Var.b(i6));
                            }
                        } else {
                            sg1VarN2 = n(i70Var, jl2Var, z, true);
                            z2 = false;
                            if (!z2) {
                                if (arrayList.isEmpty()) {
                                }
                                sg1VarN = n(i70Var, jl2Var, z, false);
                                return new of2(sg1VarN2, sg1VarN, jl2Var);
                            }
                            i7 = i15;
                            i8 = 0;
                            i9 = 1;
                        }
                        i10 = iB;
                        if (!z2) {
                            if (arrayList.isEmpty()) {
                            }
                            sg1VarN = n(i70Var, jl2Var, z, false);
                            return new of2(sg1VarN2, sg1VarN, jl2Var);
                        }
                        i7 = i15;
                        i8 = 0;
                        i9 = 1;
                    } else {
                        i28++;
                    }
                    jl2Var = null;
                    if (jl2Var == null) {
                        i6 = iArr[0];
                        if (i70Var.a(i6)) {
                            iB = i70Var.b(i70Var.c(i6));
                        } else {
                            iB = i70Var.c(i70Var.b(i6));
                        }
                    } else {
                        sg1VarN2 = n(i70Var, jl2Var, z, true);
                        z2 = false;
                        if (!z2) {
                            if (arrayList.isEmpty()) {
                            }
                            sg1VarN = n(i70Var, jl2Var, z, false);
                            return new of2(sg1VarN2, sg1VarN, jl2Var);
                        }
                        i7 = i15;
                        i8 = 0;
                        i9 = 1;
                    }
                    i10 = iB;
                    if (!z2) {
                        if (arrayList.isEmpty()) {
                        }
                        sg1VarN = n(i70Var, jl2Var, z, false);
                        return new of2(sg1VarN2, sg1VarN, jl2Var);
                    }
                    i7 = i15;
                    i8 = 0;
                    i9 = 1;
                }
            } catch (d55 unused4) {
            }
        }
    }

    @Override // o.a95, o.n36
    public final void reset() {
        this.g.clear();
        this.h.clear();
    }
}
