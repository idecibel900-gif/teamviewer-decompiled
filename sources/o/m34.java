package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m34 {
    public final jx4 a;
    public ae b;
    public int c;
    public final kx4 d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public n22 j;

    public m34() {
        long[] jArr = ti6.a;
        this.a = new jx4();
        kx4 kx4Var = ui6.a;
        this.d = new kx4();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public static void b(p44 p44Var, int i, k34 k34Var) {
        int i2 = 0;
        long jB = p44Var.b(0);
        int i3 = true & true ? (int) (jB >> 32) : 0;
        if ((1 & 2) != 0) {
            i = (int) (jB & 4294967295L);
        }
        long j = (((long) i3) << 32) | (((long) i) & 4294967295L);
        i34[] i34VarArr = k34Var.a;
        int length = i34VarArr.length;
        int i4 = 0;
        while (i2 < length) {
            i34 i34Var = i34VarArr[i2];
            int i5 = i4 + 1;
            if (i34Var != null) {
                i34Var.l = vk3.c(j, vk3.b(p44Var.b(i4), jB));
            }
            i2++;
            i4 = i5;
        }
    }

    public static int g(int[] iArr, p44 p44Var) {
        p44Var.getClass();
        int i = p44Var.f1705o + p44Var.p + iArr[0];
        iArr[0] = i;
        return Math.max(0, i);
    }

    public final long a() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            i34 i34Var = (i34) arrayList.get(i);
            l03 l03Var = i34Var.f1031o;
            if (l03Var != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (i34Var.l >> 32)) + ((int) (l03Var.u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (i34Var.l & 4294967295L)) + ((int) (l03Var.u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:170:0x0405  */
    /* JADX WARN: Code duplicated, block: B:172:0x040a  */
    /* JADX WARN: Code duplicated, block: B:242:0x00c2 A[EDGE_INSN: B:242:0x00c2->B:45:0x00c2 BREAK  A[LOOP:2: B:32:0x0088->B:44:0x00bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[LOOP:2: B:32:0x0088->B:44:0x00bf, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not found block with instruction: 0x037d: MOVE (r12v8 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v20, types: [o.de1, o.hc1, o.pe1] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r3v25, types: [o.i34[]] */
    /* JADX WARN: Type inference failed for: r6v29, types: [o.i34[]] */
    public final void c(int i, int i2, int i3, ArrayList arrayList, ae aeVar, m44 m44Var, boolean z, boolean z2, int i4, int i5, me1 me1Var, k03 k03Var) {
        jx4 jx4Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr;
        ArrayList arrayList5;
        ArrayList arrayList6;
        kx4 kx4Var;
        jx4 jx4Var2;
        ArrayList arrayList7;
        ae aeVar2;
        int[] iArr2;
        jx4 jx4Var3;
        byte b;
        Object[] objArr;
        long[] jArr;
        ArrayList arrayList8;
        int i6;
        ?? r19;
        kx4 kx4Var2;
        ArrayList arrayList9;
        ?? r110;
        i34[] i34VarArr;
        ?? r13;
        ArrayList arrayList10;
        ArrayList arrayList11;
        k34 k34Var;
        ?? r14;
        boolean z3;
        n22 n22Var;
        int i7;
        byte b2;
        ArrayList arrayList12 = arrayList;
        ae aeVar3 = this.b;
        this.b = aeVar;
        int size = arrayList12.size();
        int i8 = 0;
        loop0: while (true) {
            jx4Var = this.a;
            if (i8 >= size) {
                if (!jx4Var.i()) {
                    break;
                }
                d();
                return;
            }
            p44 p44Var = (p44) arrayList12.get(i8);
            int size2 = p44Var.b.size();
            for (int i9 = 0; i9 < size2; i9++) {
                Object objE = ((jl5) p44Var.b.get(i9)).E();
                if ((objE instanceof z24 ? (z24) objE : null) != null) {
                    break loop0;
                }
            }
            i8++;
        }
        int i10 = this.c;
        p44 p44Var2 = (p44) lv0.o0(arrayList12);
        this.c = p44Var2 != null ? p44Var2.a : 0;
        long j = ((long) i) & 4294967295L;
        boolean z4 = z || !z2;
        Object[] objArr2 = jx4Var.b;
        long[] jArr2 = jx4Var.a;
        boolean z5 = false;
        int length = jArr2.length - 2;
        kx4 kx4Var3 = this.d;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j2 = jArr2[i11];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j2 & 255) < 128) {
                            kx4Var3.a(objArr2[(i11 << 3) + i13]);
                        }
                        j2 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        int size3 = arrayList12.size();
        int i14 = 0;
        while (true) {
            arrayList2 = this.i;
            arrayList3 = this.f;
            arrayList4 = this.e;
            if (i14 >= size3) {
                break;
            }
            p44 p44Var3 = (p44) arrayList12.get(i14);
            Object obj = p44Var3.i;
            int i15 = size3;
            List list = p44Var3.b;
            kx4Var3.l(obj);
            int i16 = i14;
            int size4 = list.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size4) {
                    e(obj);
                    break;
                }
                List list2 = list;
                Object objE2 = ((jl5) list.get(i17)).E();
                int i18 = size4;
                if ((objE2 instanceof z24 ? (z24) objE2 : null) != null) {
                    k34 k34Var2 = (k34) jx4Var.g(obj);
                    int iG = aeVar3 != null ? aeVar3.g(obj) : -1;
                    boolean z6 = iG == -1 && aeVar3 != null;
                    if (k34Var2 != null) {
                        if (!z4) {
                            break;
                        }
                        k34.b(k34Var2, p44Var3, me1Var, k03Var, i4, i5);
                        i34[] i34VarArr2 = k34Var2.a;
                        int length2 = i34VarArr2.length;
                        int i19 = 0;
                        while (i19 < length2) {
                            boolean z7 = z6;
                            i34 i34Var = i34VarArr2[i19];
                            i34[] i34VarArr3 = i34VarArr2;
                            int i20 = length2;
                            if (i34Var != null && !vk3.a(i34Var.l, 9223372034707292159L)) {
                                i34Var.l = vk3.c(i34Var.l, j);
                            }
                            i19++;
                            z6 = z7;
                            i34VarArr2 = i34VarArr3;
                            length2 = i20;
                        }
                        if (z6) {
                            for (i34 i34Var2 : k34Var2.a) {
                                if (i34Var2 != null) {
                                    if (i34Var2.b()) {
                                        arrayList2.remove(i34Var2);
                                        n22 n22Var2 = this.j;
                                        if (n22Var2 != null) {
                                            yo1.H(n22Var2);
                                        }
                                    }
                                    i34Var2.a();
                                }
                            }
                        }
                        f(p44Var3, false);
                        break;
                    }
                    k34 k34Var3 = new k34(this);
                    k34.b(k34Var3, p44Var3, me1Var, k03Var, i4, i5);
                    jx4Var.m(obj, k34Var3);
                    if (p44Var3.a != iG && iG != -1) {
                        if (iG < i10) {
                            arrayList4.add(p44Var3);
                            break;
                        } else {
                            arrayList3.add(p44Var3);
                            break;
                        }
                    }
                    b(p44Var3, (int) (p44Var3.b(0) & 4294967295L), k34Var3);
                    if (!z6) {
                        break;
                    }
                    i34[] i34VarArr4 = k34Var3.a;
                    for (i34 i34Var3 : i34VarArr4) {
                        if (i34Var3 != null) {
                            i34Var3.a();
                        }
                    }
                    break;
                }
                i17++;
                size4 = i18;
                list = list2;
            }
            i14 = i16 + 1;
            arrayList12 = arrayList;
            size3 = i15;
        }
        int[] iArr3 = new int[1];
        if (z4 && aeVar3 != null) {
            if (arrayList4.isEmpty()) {
                i7 = 1;
                b2 = 0;
            } else {
                if (arrayList4.size() > 1) {
                    pv0.b0(arrayList4, new l34(aeVar3, (byte) 2));
                }
                int size5 = arrayList4.size();
                for (int i21 = 0; i21 < size5; i21++) {
                    p44 p44Var4 = (p44) arrayList4.get(i21);
                    int iG2 = i4 - g(iArr3, p44Var4);
                    Object objG = jx4Var.g(p44Var4.i);
                    objG.getClass();
                    b(p44Var4, iG2, (k34) objG);
                    f(p44Var4, false);
                }
                i7 = 1;
                b2 = 0;
                Arrays.fill(iArr3, 0, 1, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > i7) {
                    pv0.b0(arrayList3, new l34(aeVar3, b2));
                }
                int size6 = arrayList3.size();
                for (int i22 = 0; i22 < size6; i22++) {
                    p44 p44Var5 = (p44) arrayList3.get(i22);
                    int iG3 = (g(iArr3, p44Var5) + i5) - (p44Var5.f1705o + p44Var5.p);
                    Object objG2 = jx4Var.g(p44Var5.i);
                    objG2.getClass();
                    b(p44Var5, iG3, (k34) objG2);
                    f(p44Var5, false);
                }
                Arrays.fill(iArr3, 0, 1, 0);
            }
        }
        Object[] objArr3 = kx4Var3.b;
        long[] jArr3 = kx4Var3.a;
        int length3 = jArr3.length - 2;
        ArrayList arrayList13 = this.h;
        ArrayList arrayList14 = this.g;
        if (length3 >= 0) {
            ArrayList arrayList15 = arrayList2;
            int i23 = 0;
            while (true) {
                long j3 = jArr3[i23];
                ArrayList arrayList16 = arrayList14;
                int i24 = i23;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i25 = 8;
                    int i26 = 8 - ((~(i24 - length3)) >>> 31);
                    int i27 = 0;
                    while (i27 < i26) {
                        if ((j3 & 255) < 128) {
                            kx4Var2 = kx4Var3;
                            Object obj2 = objArr3[(i24 << 3) + i27];
                            ArrayList arrayList17 = arrayList16;
                            k34 k34Var4 = (k34) jx4Var.g(obj2);
                            if (k34Var4 == null) {
                                r19 = z5;
                                arrayList9 = arrayList17;
                            } else {
                                objArr3 = objArr3;
                                jArr3 = jArr3;
                                int iG4 = aeVar.g(obj2);
                                j3 = j3;
                                int iMin = Math.min(1, k34Var4.e);
                                k34Var4.e = iMin;
                                k34Var4.d = Math.min(1 - iMin, k34Var4.d);
                                if (iG4 == -1) {
                                    i34[] i34VarArr5 = k34Var4.a;
                                    int length4 = i34VarArr5.length;
                                    int i28 = 0;
                                    boolean z8 = false;
                                    int i29 = 0;
                                    while (i28 < length4) {
                                        int i30 = i27;
                                        i34 i34Var4 = i34VarArr5[i28];
                                        int i31 = i29 + 1;
                                        if (i34Var4 != null) {
                                            if (i34Var4.b()) {
                                                r19 = z5;
                                                r110 = r19;
                                                i34VarArr = i34VarArr5;
                                                arrayList10 = arrayList15;
                                                z3 = true;
                                            } else {
                                                i34VarArr = i34VarArr5;
                                                if (((Boolean) i34Var4.k.getValue()).booleanValue()) {
                                                    i34Var4.c();
                                                    k34Var4.a[i29] = r110;
                                                    arrayList10 = arrayList15;
                                                    arrayList10.remove(i34Var4);
                                                    n22 n22Var3 = this.j;
                                                    if (n22Var3 != null) {
                                                        r19 = z5;
                                                        r110 = r19;
                                                        yo1.H(n22Var3);
                                                    }
                                                    r19 = z5;
                                                    r110 = r19;
                                                    z3 = z8;
                                                } else {
                                                    arrayList10 = arrayList15;
                                                    l03 l03Var = i34Var4.f1031o;
                                                    if (l03Var != null) {
                                                        ArrayList arrayList18 = arrayList3;
                                                        rl2 rl2Var = i34Var4.f;
                                                        if (i34Var4.b() || rl2Var == null) {
                                                            r19 = z5;
                                                            r110 = r19;
                                                            arrayList11 = arrayList18;
                                                        } else {
                                                            i28 = i28;
                                                            length4 = length4;
                                                            i34Var4.j.setValue(Boolean.TRUE);
                                                            i26 = i26;
                                                            obj2 = obj2;
                                                            ?? r15 = r110;
                                                            i25 = i25;
                                                            i24 = i24;
                                                            i30 = i30;
                                                            arrayList11 = arrayList18;
                                                            iArr3 = iArr3;
                                                            k34Var = k34Var4;
                                                            jx4Var = jx4Var;
                                                            arrayList17 = arrayList17;
                                                            im3.R(i34Var4.a, r15, r15, new ko2((Object) i34Var4, (Object) rl2Var, (Object) l03Var, (hc1) r15, (byte) 8), 3);
                                                            r14 = r15;
                                                        }
                                                        if (i34Var4.b()) {
                                                            arrayList10.add(i34Var4);
                                                            n22Var = this.j;
                                                            if (n22Var != null) {
                                                                yo1.H(n22Var);
                                                            }
                                                            z3 = true;
                                                            r13 = r14;
                                                        } else {
                                                            i34Var4.c();
                                                            k34Var.a[i29] = r14;
                                                            z3 = z8;
                                                            r13 = r14;
                                                        }
                                                    } else {
                                                        r19 = z5;
                                                        r110 = r19;
                                                        arrayList11 = arrayList3;
                                                    }
                                                    k34Var = k34Var4;
                                                    r14 = r110;
                                                    if (i34Var4.b()) {
                                                        arrayList10.add(i34Var4);
                                                        n22Var = this.j;
                                                        if (n22Var != null) {
                                                            yo1.H(n22Var);
                                                        }
                                                        z3 = true;
                                                        r13 = r14;
                                                    } else {
                                                        i34Var4.c();
                                                        k34Var.a[i29] = r14;
                                                        z3 = z8;
                                                        r13 = r14;
                                                    }
                                                }
                                                z8 = z3;
                                            }
                                            iArr3 = iArr3;
                                            arrayList11 = arrayList3;
                                            k34Var = k34Var4;
                                            r13 = r110;
                                            z8 = z3;
                                        } else {
                                            r19 = z5;
                                            r110 = r19;
                                            i34VarArr = i34VarArr5;
                                            i28 = i28;
                                            length4 = length4;
                                            i26 = i26;
                                            obj2 = obj2;
                                            jx4Var = jx4Var;
                                            r13 = r110;
                                            i25 = i25;
                                            arrayList10 = arrayList15;
                                            i24 = i24;
                                            arrayList17 = arrayList17;
                                            i30 = i30;
                                            iArr3 = iArr3;
                                            arrayList11 = arrayList3;
                                            arrayList4 = arrayList4;
                                            k34Var = k34Var4;
                                        }
                                        i28++;
                                        k34Var4 = k34Var;
                                        arrayList15 = arrayList10;
                                        i27 = i30;
                                        iArr3 = iArr3;
                                        arrayList3 = arrayList11;
                                        arrayList4 = arrayList4;
                                        i29 = i31;
                                        i34VarArr5 = i34VarArr;
                                        i24 = i24;
                                        i26 = i26;
                                        i25 = i25;
                                        r110 = r13;
                                        arrayList17 = arrayList17;
                                        jx4Var = jx4Var;
                                        obj2 = obj2;
                                        length4 = length4;
                                    }
                                    r19 = z5;
                                    r110 = r19;
                                    i26 = i26;
                                    Object obj3 = obj2;
                                    jx4Var = jx4Var;
                                    int i32 = i25;
                                    ArrayList arrayList19 = arrayList15;
                                    i24 = i24;
                                    arrayList9 = arrayList17;
                                    iArr3 = iArr3;
                                    i27 = i27;
                                    arrayList3 = arrayList3;
                                    arrayList4 = arrayList4;
                                    if (!z8) {
                                        e(obj3);
                                    }
                                    i25 = i32;
                                    arrayList15 = arrayList19;
                                } else {
                                    arrayList15 = arrayList15;
                                    i26 = i26;
                                    jx4Var = jx4Var;
                                    int i33 = i25;
                                    i24 = i24;
                                    arrayList9 = arrayList17;
                                    iArr3 = iArr3;
                                    i27 = i27;
                                    arrayList3 = arrayList3;
                                    arrayList4 = arrayList4;
                                    r61 r61Var = k34Var4.b;
                                    r61Var.getClass();
                                    p44 p44VarA = m44Var.a(iG4, r61Var.a);
                                    boolean z9 = true;
                                    p44VarA.r = true;
                                    i34[] i34VarArr6 = k34Var4.a;
                                    int length5 = i34VarArr6.length;
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 < length5) {
                                            i25 = i33;
                                            i34 i34Var5 = i34VarArr6[i34];
                                            if (i34Var5 == null || ((Boolean) i34Var5.h.getValue()).booleanValue() != z9) {
                                                r19 = z5;
                                                i34++;
                                                i33 = i25;
                                                z9 = true;
                                            } else {
                                                r19 = z5;
                                            }
                                        } else {
                                            r19 = z5;
                                            i25 = i33;
                                            if (aeVar3 != null && iG4 == aeVar3.g(obj2)) {
                                                e(obj2);
                                            }
                                        }
                                        k34Var4.a(p44VarA, me1Var, k03Var, i4, i5, k34Var4.c);
                                        if (iG4 < this.c) {
                                            arrayList9.add(p44VarA);
                                        } else {
                                            arrayList13.add(p44VarA);
                                        }
                                    }
                                }
                            }
                            i27++;
                            arrayList15 = arrayList15;
                            arrayList16 = arrayList9;
                            arrayList3 = arrayList3;
                            kx4Var3 = kx4Var2;
                            arrayList4 = arrayList4;
                            jArr3 = jArr3;
                            jx4Var = jx4Var;
                            i24 = i24;
                            i26 = i26;
                            r19 = 0;
                            j3 >>= i25;
                            iArr3 = iArr3;
                            objArr3 = objArr3;
                            i25 = i25;
                        } else {
                            r19 = z5;
                            kx4Var2 = kx4Var3;
                            arrayList9 = arrayList16;
                        }
                        i27++;
                        arrayList15 = arrayList15;
                        arrayList16 = arrayList9;
                        arrayList3 = arrayList3;
                        kx4Var3 = kx4Var2;
                        arrayList4 = arrayList4;
                        jArr3 = jArr3;
                        jx4Var = jx4Var;
                        i24 = i24;
                        i26 = i26;
                        r19 = 0;
                        j3 >>= i25;
                        iArr3 = iArr3;
                        objArr3 = objArr3;
                        i25 = i25;
                    }
                    r19 = z5;
                    objArr = objArr3;
                    jArr = jArr3;
                    arrayList6 = arrayList4;
                    kx4Var = kx4Var3;
                    jx4Var2 = jx4Var;
                    int i35 = i25;
                    arrayList8 = arrayList15;
                    i6 = i24;
                    iArr = iArr3;
                    arrayList5 = arrayList3;
                    arrayList7 = arrayList16;
                    if (i26 != i35) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                    iArr = iArr3;
                    jArr = jArr3;
                    arrayList6 = arrayList4;
                    kx4Var = kx4Var3;
                    jx4Var2 = jx4Var;
                    arrayList8 = arrayList15;
                    i6 = i24;
                    arrayList5 = arrayList3;
                    arrayList7 = arrayList16;
                }
                int i36 = i6;
                if (i36 == length3) {
                    break;
                }
                i23 = i36 + 1;
                arrayList15 = arrayList8;
                arrayList14 = arrayList7;
                iArr3 = iArr;
                arrayList3 = arrayList5;
                objArr3 = objArr;
                kx4Var3 = kx4Var;
                arrayList4 = arrayList6;
                jArr3 = jArr;
                jx4Var = jx4Var2;
                z5 = false;
            }
        } else {
            iArr = iArr3;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            kx4Var = kx4Var3;
            jx4Var2 = jx4Var;
            arrayList7 = arrayList14;
        }
        if (arrayList7.isEmpty()) {
            aeVar2 = aeVar;
            iArr2 = iArr;
            jx4Var3 = jx4Var2;
            b = 1;
        } else {
            if (arrayList7.size() > 1) {
                aeVar2 = aeVar;
                pv0.b0(arrayList7, new l34(aeVar2, (byte) 3));
            } else {
                aeVar2 = aeVar;
            }
            int size7 = arrayList7.size();
            int i37 = 0;
            while (i37 < size7) {
                p44 p44Var6 = (p44) arrayList7.get(i37);
                jx4 jx4Var4 = jx4Var2;
                Object objG3 = jx4Var4.g(p44Var6.i);
                objG3.getClass();
                int[] iArr4 = iArr;
                p44Var6.d((z ? (int) (((p44) lv0.m0(arrayList)).b(0) & 4294967295L) : ((k34) objG3).f) - g(iArr4, p44Var6), i2, i3);
                if (z4) {
                    f(p44Var6, true);
                }
                i37++;
                jx4Var2 = jx4Var4;
                iArr = iArr4;
            }
            iArr2 = iArr;
            jx4Var3 = jx4Var2;
            b = 1;
            Arrays.fill(iArr2, 0, 1, 0);
        }
        if (!arrayList13.isEmpty()) {
            if (arrayList13.size() > b) {
                pv0.b0(arrayList13, new l34(aeVar2, b));
            }
            int size8 = arrayList13.size();
            for (int i38 = 0; i38 < size8; i38++) {
                p44 p44Var7 = (p44) arrayList13.get(i38);
                Object objG4 = jx4Var3.g(p44Var7.i);
                objG4.getClass();
                p44Var7.d((((k34) objG4).g - (p44Var7.f1705o + p44Var7.p)) + g(iArr2, p44Var7), i2, i3);
                if (z4) {
                    f(p44Var7, true);
                }
            }
        }
        Collections.reverse(arrayList7);
        arrayList.addAll(0, arrayList7);
        arrayList.addAll(arrayList13);
        arrayList6.clear();
        arrayList5.clear();
        arrayList7.clear();
        arrayList13.clear();
        kx4Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    public final void d() {
        jx4 jx4Var = this.a;
        if (jx4Var.j()) {
            Object[] objArr = jx4Var.c;
            long[] jArr = jx4Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (i34 i34Var : ((k34) objArr[(i << 3) + i3]).a) {
                                    if (i34Var != null) {
                                        i34Var.c();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            jx4Var.a();
        }
    }

    public final void e(Object obj) {
        k34 k34Var = (k34) this.a.k(obj);
        if (k34Var != null) {
            for (i34 i34Var : k34Var.a) {
                if (i34Var != null) {
                    i34Var.c();
                }
            }
        }
    }

    public final void f(p44 p44Var, boolean z) {
        Object objG = this.a.g(p44Var.i);
        objG.getClass();
        i34[] i34VarArr = ((k34) objG).a;
        int length = i34VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            i34 i34Var = i34VarArr[i];
            int i3 = i2 + 1;
            if (i34Var != null) {
                long jB = p44Var.b(i2);
                long j = i34Var.l;
                if (!vk3.a(j, 9223372034707292159L) && !vk3.a(j, jB)) {
                    long jB2 = vk3.b(jB, j);
                    rl2 rl2Var = i34Var.e;
                    if (rl2Var != null) {
                        long jB3 = vk3.b(((vk3) i34Var.r.getValue()).a, jB2);
                        i34Var.d(jB3);
                        i34Var.h.setValue(Boolean.TRUE);
                        i34Var.g = z;
                        im3.R(i34Var.a, null, null, new k0(i34Var, rl2Var, jB3, null), 3);
                    }
                }
                i34Var.l = jB;
            }
            i++;
            i2 = i3;
        }
    }
}
