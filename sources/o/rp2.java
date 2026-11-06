package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rp2 implements qu4, ag6 {
    public final dw a;
    public final gw b;
    public final float c;
    public final df1 d;
    public final float e;
    public final pp2 f;

    public rp2(dw dwVar, gw gwVar, float f, df1 df1Var, float f2, pp2 pp2Var) {
        this.a = dwVar;
        this.b = gwVar;
        this.c = f;
        this.d = df1Var;
        this.e = f2;
        this.f = pp2Var;
    }

    public static int k(List list, int i, int i2, int i3, pp2 pp2Var) {
        long jA = rk3.a(0, 0);
        if (!list.isEmpty()) {
            int i4 = Integer.MAX_VALUE;
            lp2 lp2Var = new lp2(pp2Var, t61.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            zn4 zn4Var = (zn4) lv0.p0(0, list);
            int iV = zn4Var != null ? zn4Var.V(i) : 0;
            int iK = zn4Var != null ? zn4Var.k(iV) : 0;
            boolean z = true;
            if (list.size() <= 1) {
                z = false;
            }
            int i5 = 0;
            if (lp2Var.b(z, 0, rk3.a(i, Integer.MAX_VALUE), zn4Var == null ? null : new rk3(rk3.a(iK, iV)), 0, 0, 0, false, false).b) {
                pp2Var.getClass();
                jA = jA;
            } else {
                int size = list.size();
                int i6 = i;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i9 < size) {
                    int i12 = i6 - iK;
                    i9++;
                    int iMax = Math.max(i8, iV);
                    zn4 zn4Var2 = (zn4) lv0.p0(i9, list);
                    iV = zn4Var2 != null ? zn4Var2.V(i) : 0;
                    int iK2 = zn4Var2 != null ? zn4Var2.k(iV) + i2 : 0;
                    int i13 = i9 - i11;
                    int i14 = i7;
                    int i15 = iK2;
                    ig5 ig5VarB = lp2Var.b(i9 + 2 < list.size() ? z : false, i13, rk3.a(i12, i4), zn4Var2 == null ? null : new rk3(rk3.a(iK2, iV)), i14, i5, iMax, false, false);
                    if (ig5VarB.a) {
                        int i16 = iMax + i3 + i5;
                        lp2Var.a(ig5VarB, zn4Var2 != null, i14, i16, i12, i13);
                        int i17 = i15 - i2;
                        i7 = i14 + 1;
                        if (ig5VarB.b) {
                            i10 = i9;
                            i5 = i16;
                            break;
                        }
                        i6 = i;
                        i11 = i9;
                        iK = i17;
                        i5 = i16;
                        i8 = 0;
                    } else {
                        iK = i15;
                        i6 = i12;
                        i7 = i14;
                        i8 = iMax;
                    }
                    i10 = i9;
                    i4 = Integer.MAX_VALUE;
                    z = true;
                }
                jA = rk3.a(i5 - i3, i10);
            }
        }
        return (int) (jA >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.qu4
    public final int a(bm3 bm3Var, List list, int i) {
        int[] iArr;
        pp2 pp2Var;
        List list2;
        long jA;
        int i2;
        int i3 = i;
        int i4 = 1;
        List list3 = (List) lv0.p0(1, list);
        zn4 zn4Var = list3 != null ? (zn4) lv0.o0(list3) : null;
        char c = 2;
        List list4 = (List) lv0.p0(2, list);
        int i5 = 0;
        this.f.a(zn4Var, list4 != null ? (zn4) lv0.o0(list4) : null, t61.b(0, 0, 0, i3, 7));
        List list5 = (List) lv0.o0(list);
        if (list5 == null) {
            list5 = ea2.m;
        }
        int iQ0 = bm3Var.q0(this.c);
        int iQ1 = bm3Var.q0(this.e);
        long jA2 = rk3.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        int i6 = 0;
        while (i6 < size3) {
            zn4 zn4Var2 = (zn4) list5.get(i6);
            char c2 = c;
            int iK = zn4Var2.k(i3);
            iArr2[i6] = iK;
            iArr3[i6] = zn4Var2.V(iK);
            i6++;
            c = c2;
        }
        int size4 = list5.size();
        pp2 pp2Var2 = this.f;
        if (Integer.MAX_VALUE < size4) {
            pp2Var2.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            pp2Var2.getClass();
        }
        int iMin = Math.min(Integer.MAX_VALUE, list5.size());
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += iArr2[i8];
        }
        int size5 = ((list5.size() - 1) * iQ0) + i7;
        if (size2 == 0) {
            yq4.p();
            return 0;
        }
        int i9 = iArr3[0];
        int i10 = size2 - 1;
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                int i12 = iArr3[i11];
                if (i9 < i12) {
                    i9 = i12;
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        if (size == 0) {
            yq4.p();
            return 0;
        }
        int i13 = iArr2[i5];
        int i14 = size - 1;
        if (1 <= i14) {
            int i15 = 1;
            while (true) {
                int i16 = iArr2[i15];
                if (i13 < i16) {
                    i13 = i16;
                }
                if (i15 == i14) {
                    break;
                }
                i15++;
            }
        }
        int i17 = size5;
        while (i13 <= i17 && i9 != i3) {
            int i18 = (i13 + i17) / 2;
            if (list5.isEmpty()) {
                list2 = list5;
                iArr2 = iArr2;
                jA = jA2;
                iArr = iArr3;
                pp2Var = pp2Var2;
            } else {
                int i19 = i5;
                iArr = iArr3;
                pp2Var = pp2Var2;
                lp2 lp2Var = new lp2(pp2Var, t61.a(i19, i18, i19, Integer.MAX_VALUE), iQ0, iQ1);
                zn4 zn4Var3 = (zn4) lv0.p0(i19, list5);
                int i20 = zn4Var3 != null ? iArr[i19] : i19;
                int i21 = zn4Var3 != null ? iArr2[i19] : 0;
                int i22 = 0;
                if (lp2Var.b(list5.size() > i4 ? i4 : 0, 0, rk3.a(i18, Integer.MAX_VALUE), zn4Var3 == null ? null : new rk3(rk3.a(i21, i20)), 0, 0, 0, false, false).b) {
                    pp2Var.getClass();
                    list2 = list5;
                    jA = jA2;
                } else {
                    int size6 = list5.size();
                    int i23 = i18;
                    int i24 = i21;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = i20;
                    int i30 = 0;
                    while (true) {
                        if (i28 >= size6) {
                            list2 = list5;
                            break;
                        }
                        int i31 = i23 - i24;
                        int i32 = size6;
                        int i33 = i28 + 1;
                        int iMax = Math.max(i26, i29);
                        zn4 zn4Var4 = (zn4) lv0.p0(i33, list5);
                        i29 = zn4Var4 != null ? iArr[i33] : 0;
                        int i34 = zn4Var4 != null ? iArr2[i33] + iQ0 : 0;
                        list2 = list5;
                        int i35 = i33 - i27;
                        int i36 = i25;
                        ig5 ig5VarB = lp2Var.b(i28 + 2 < list2.size(), i35, rk3.a(i31, Integer.MAX_VALUE), zn4Var4 == null ? null : new rk3(rk3.a(i34, i29)), i36, i22, iMax, false, false);
                        if (ig5VarB.a) {
                            int i37 = iMax + iQ1 + i22;
                            lp2Var.a(ig5VarB, zn4Var4 != null, i36, i37, i31, i35);
                            int i38 = i34 - iQ0;
                            i25 = i36 + 1;
                            if (ig5VarB.b) {
                                i22 = i37;
                                i30 = i33;
                                break;
                            }
                            i24 = i38;
                            i23 = i18;
                            i22 = i37;
                            i2 = i33;
                            i26 = 0;
                        } else {
                            i24 = i34;
                            i23 = i31;
                            i25 = i36;
                            i26 = iMax;
                            i2 = i27;
                        }
                        i27 = i2;
                        size6 = i32;
                        i28 = i33;
                        i30 = i28;
                        list5 = list2;
                    }
                    jA = rk3.a(i22 - iQ1, i30);
                }
            }
            i9 = (int) (jA >> 32);
            int i39 = (int) (jA & 4294967295L);
            i3 = i;
            if (i9 > i3 || i39 < iMin) {
                i13 = i18 + 1;
                if (i13 > i17) {
                    return i13;
                }
            } else {
                if (i9 >= i3) {
                    return i18;
                }
                i17 = i18 - 1;
            }
            size5 = i18;
            iArr2 = iArr2;
            pp2Var2 = pp2Var;
            iArr3 = iArr;
            list5 = list2;
            i4 = 1;
            i5 = 0;
        }
        return size5;
    }

    @Override // o.qu4
    public final int b(bm3 bm3Var, List list, int i) {
        List list2 = (List) lv0.p0(1, list);
        zn4 zn4Var = list2 != null ? (zn4) lv0.o0(list2) : null;
        List list3 = (List) lv0.p0(2, list);
        this.f.a(zn4Var, list3 != null ? (zn4) lv0.o0(list3) : null, t61.b(0, 0, 0, i, 7));
        List list4 = (List) lv0.o0(list);
        if (list4 == null) {
            list4 = ea2.m;
        }
        int iQ0 = bm3Var.q0(this.c);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iO = ((zn4) list4.get(i2)).o(i) + iQ0;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iO) - iQ0);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iO;
            }
            i2 = i5;
        }
        return iMax;
    }

    @Override // o.qu4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        zn4 zn4Var;
        jl5 jl5Var;
        rk3 rk3Var;
        ig5 ig5Var;
        int i;
        int i2;
        char c;
        zn4 zn4Var2;
        zn4 zn4Var3;
        rk3 rk3Var2;
        jl5 jl5Var2;
        rk3 rk3Var3;
        ig5 ig5Var2;
        Integer numValueOf;
        long jA;
        long jA2;
        jl5 jl5VarC;
        boolean zIsEmpty = ((ArrayList) list).isEmpty();
        fa2 fa2Var = fa2.m;
        if (!zIsEmpty) {
            int iH = r61.h(j);
            pp2 pp2Var = this.f;
            if (iH != 0) {
                List list2 = (List) lv0.m0(list);
                if (list2.isEmpty()) {
                    return fo4Var.u(0, 0, fa2Var, new ji2((byte) 5));
                }
                List list3 = (List) lv0.p0(1, list);
                zn4 zn4Var4 = list3 != null ? (zn4) lv0.o0(list3) : null;
                List list4 = (List) lv0.p0(2, list);
                zn4 zn4Var5 = list4 != null ? (zn4) lv0.o0(list4) : null;
                list2.size();
                pp2Var.getClass();
                q14 q14Var = q14.m;
                long jQ = us1.Q(us1.w(10, us1.v(j, q14Var)));
                if (zn4Var4 != null) {
                    if (yo1.G(yo1.C(zn4Var4)) == 0.0f) {
                        yo1.C(zn4Var4);
                        jl5 jl5VarC2 = zn4Var4.C(jQ);
                        jl5VarC2.Y();
                        jl5VarC2.X();
                        jl5VarC2.Y();
                        jl5VarC2.X();
                    } else {
                        zn4Var4.V(zn4Var4.k(Integer.MAX_VALUE));
                    }
                }
                if (zn4Var5 != null) {
                    if (yo1.G(yo1.C(zn4Var5)) == 0.0f) {
                        yo1.C(zn4Var5);
                        jl5 jl5VarC3 = zn4Var5.C(jQ);
                        jl5VarC3.Y();
                        jl5VarC3.X();
                        jl5VarC3.Y();
                        jl5VarC3.X();
                    } else {
                        zn4Var5.V(zn4Var5.k(Integer.MAX_VALUE));
                    }
                }
                Iterator it = list2.iterator();
                long jV = us1.v(j, q14Var);
                xx4 xx4Var = new xx4(new eo4[16]);
                int i3 = r61.i(jV);
                int iK = r61.k(jV);
                int iH2 = r61.h(jV);
                kw4 kw4Var = uk3.a;
                kw4 kw4Var2 = new kw4();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(fo4Var.d0(this.c));
                int iCeil2 = (int) Math.ceil(fo4Var.d0(this.e));
                long jA3 = t61.a(0, i3, 0, iH2);
                long jQ2 = us1.Q(us1.w(14, jA3));
                if (it.hasNext()) {
                    try {
                        zn4Var = (zn4) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        zn4Var = null;
                    }
                } else {
                    zn4Var = null;
                }
                if (zn4Var != null) {
                    if (yo1.G(yo1.C(zn4Var)) == 0.0f) {
                        yo1.C(zn4Var);
                        jl5VarC = zn4Var.C(jQ2);
                        jA2 = rk3.a(jl5VarC.Y(), jl5VarC.X());
                    } else {
                        int iK2 = zn4Var.k(Integer.MAX_VALUE);
                        zn4 zn4Var6 = zn4Var;
                        jA2 = rk3.a(iK2, zn4Var6.V(iK2));
                        zn4Var = zn4Var6;
                        jl5VarC = null;
                    }
                    rk3Var = new rk3(jA2);
                    jl5Var = jl5VarC;
                } else {
                    it = it;
                    jl5Var = null;
                    rk3Var = null;
                }
                jl5 jl5Var3 = jl5Var;
                Integer numValueOf2 = rk3Var != null ? Integer.valueOf((int) (rk3Var.a >> 32)) : null;
                Integer numValueOf3 = rk3Var != null ? Integer.valueOf((int) (rk3Var.a & 4294967295L)) : null;
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                zn4 zn4Var7 = zn4Var;
                lw4 lw4Var = new lw4();
                pp2 pp2Var2 = this.f;
                lp2 lp2Var = new lp2(pp2Var2, jV, iCeil, iCeil2);
                rk3 rk3Var4 = rk3Var;
                ig5 ig5VarB = lp2Var.b(it.hasNext(), 0, rk3.a(i3, iH2), rk3Var4, 0, 0, 0, false, false);
                if (ig5VarB.b) {
                    ig5Var = ig5VarB;
                    lp2Var.a(ig5Var, rk3Var4 != null, -1, 0, i3, 0);
                } else {
                    ig5Var = ig5VarB;
                }
                int i4 = iK;
                ig5 ig5Var3 = ig5Var;
                int[] iArrCopyOf = iArr2;
                int i5 = i3;
                lw4 lw4Var2 = lw4Var;
                jl5 jl5Var4 = jl5Var3;
                Integer num = numValueOf2;
                zn4 zn4Var8 = zn4Var7;
                int[] iArrCopyOf2 = iArr;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = iH2;
                while (!ig5Var3.b && zn4Var8 != null) {
                    num.getClass();
                    int iIntValue = num.intValue();
                    numValueOf3.getClass();
                    int iIntValue2 = numValueOf3.intValue();
                    int i15 = i7;
                    int i16 = i8 + iIntValue;
                    int iMax = Math.max(i12, iIntValue2);
                    int i17 = i5 - iIntValue;
                    i6++;
                    pp2Var2.getClass();
                    arrayList.add(zn4Var8);
                    kw4Var2.i(i6, jl5Var4);
                    zn4Var8.E();
                    int i18 = i6 - i9;
                    if (it.hasNext()) {
                        try {
                            zn4Var2 = (zn4) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            zn4Var2 = null;
                        }
                        zn4Var3 = zn4Var2;
                    } else {
                        zn4Var3 = null;
                    }
                    if (zn4Var3 != null) {
                        if (yo1.G(yo1.C(zn4Var3)) == 0.0f) {
                            yo1.C(zn4Var3);
                            jl5 jl5VarC4 = zn4Var3.C(jQ2);
                            jA = rk3.a(jl5VarC4.Y(), jl5VarC4.X());
                            jl5Var2 = jl5VarC4;
                        } else {
                            int iK3 = zn4Var3.k(Integer.MAX_VALUE);
                            jA = rk3.a(iK3, zn4Var3.V(iK3));
                            jl5Var2 = null;
                        }
                        rk3Var2 = new rk3(jA);
                    } else {
                        zn4Var3 = zn4Var3;
                        i6 = i6;
                        rk3Var2 = null;
                        jl5Var2 = null;
                    }
                    Integer numValueOf4 = rk3Var2 != null ? Integer.valueOf(((int) (rk3Var2.a >> 32)) + iCeil) : null;
                    Integer numValueOf5 = rk3Var2 != null ? Integer.valueOf((int) (rk3Var2.a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    int i19 = i10;
                    long jA4 = rk3.a(i17, i14);
                    if (rk3Var2 == null) {
                        rk3Var3 = null;
                    } else {
                        numValueOf4.getClass();
                        int iIntValue3 = numValueOf4.intValue();
                        numValueOf5.getClass();
                        rk3Var3 = new rk3(rk3.a(iIntValue3, numValueOf5.intValue()));
                    }
                    ig5 ig5VarB2 = lp2Var.b(zHasNext, i18, jA4, rk3Var3, i19, i11, iMax, false, false);
                    if (ig5VarB2.a) {
                        int iMin = Math.min(Math.max(i4, i16), i3);
                        int i20 = i11 + iMax;
                        ig5Var2 = ig5VarB2;
                        lp2Var.a(ig5Var2, rk3Var2 != null, i19, i20, i17, i18);
                        int i21 = i15 + 1;
                        if (iArrCopyOf.length < i21) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i21, (iArrCopyOf.length * 3) / 2));
                        }
                        iArrCopyOf[i15] = iMax;
                        i7 = i15 + 1;
                        i14 = (iH2 - i20) - iCeil2;
                        int i22 = i13 + 1;
                        if (iArrCopyOf2.length < i22) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i22, (iArrCopyOf2.length * 3) / 2));
                        }
                        iArrCopyOf2[i13] = i6;
                        i13++;
                        numValueOf = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - iCeil) : null;
                        i10 = i19 + 1;
                        i11 = i20 + iCeil2;
                        i4 = iMin;
                        i17 = i3;
                        i9 = i6;
                        i12 = 0;
                        i8 = 0;
                    } else {
                        ig5Var2 = ig5VarB2;
                        numValueOf = numValueOf4;
                        i10 = i19;
                        i12 = iMax;
                        i8 = i16;
                        i7 = i15;
                    }
                    numValueOf3 = numValueOf5;
                    zn4Var8 = zn4Var3;
                    jl5Var4 = jl5Var2;
                    i5 = i17;
                    num = numValueOf;
                    ig5Var3 = ig5Var2;
                }
                int i23 = i7;
                int size = arrayList.size();
                Object[] objArr = new jl5[size];
                for (int i24 = 0; i24 < size; i24++) {
                    objArr[i24] = kw4Var2.b(i24);
                }
                int[] iArr3 = new int[i13];
                int[] iArr4 = new int[i13];
                int iMax2 = i4;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i25 < i13) {
                    int i28 = iArrCopyOf2[i25];
                    if (i25 < 0 || i25 >= (i2 = i23)) {
                        hk0.r("Index must be between 0 and size");
                        return null;
                    }
                    int iH3 = iArrCopyOf[i25];
                    lw4 lw4Var3 = lw4Var2;
                    if (lw4Var3.b(i25)) {
                        c = 65535;
                    } else if (r61.h(jA3) == Integer.MAX_VALUE) {
                        iH3 = Integer.MAX_VALUE;
                        c = 65535;
                    } else {
                        iH3 = r61.h(jA3) - i27;
                        c = 65535;
                    }
                    int[] iArr5 = iArrCopyOf2;
                    lw4Var2 = lw4Var3;
                    int i29 = i13;
                    int i30 = i25;
                    eo4 eo4VarX = ep1.x(this, iMax2, r61.j(jA3), r61.i(jA3), iH3, iCeil, fo4Var, arrayList, objArr, i26, i28, iArr3, i30);
                    int iB = eo4VarX.b();
                    int iA = eo4VarX.a();
                    iArr4[i30] = iA;
                    iMax2 = Math.max(iMax2, iB);
                    xx4Var.b(eo4VarX);
                    int i31 = i30 + 1;
                    i26 = i28;
                    i23 = i2;
                    i13 = i29;
                    iArrCopyOf = iArrCopyOf;
                    iArrCopyOf2 = iArr5;
                    i27 += iA;
                    i25 = i31;
                    objArr = objArr;
                }
                int i32 = i27;
                if (xx4Var.f2559o == 0) {
                    iMax2 = 0;
                    i = 0;
                } else {
                    i = i32;
                }
                gw gwVar = this.b;
                int iQ0 = ((xx4Var.f2559o - 1) * fo4Var.q0(gwVar.a())) + i;
                int iJ = r61.j(jV);
                int iH4 = r61.h(jV);
                if (iQ0 < iJ) {
                    iQ0 = iJ;
                }
                if (iQ0 <= iH4) {
                    iH4 = iQ0;
                }
                gwVar.b(fo4Var, iH4, iArr4, iArr3);
                int iK4 = r61.k(jV);
                int i33 = r61.i(jV);
                if (iMax2 < iK4) {
                    iMax2 = iK4;
                }
                if (iMax2 <= i33) {
                    i33 = iMax2;
                }
                return fo4Var.u(i33, iH4, fa2Var, new a81(xx4Var, (byte) 18));
            }
            pp2Var.getClass();
        }
        return fo4Var.u(0, 0, fa2Var, new ji2((byte) 4));
    }

    @Override // o.qu4
    public final int d(bm3 bm3Var, List list, int i) {
        List list2 = (List) lv0.p0(1, list);
        zn4 zn4Var = list2 != null ? (zn4) lv0.o0(list2) : null;
        List list3 = (List) lv0.p0(2, list);
        zn4 zn4Var2 = list3 != null ? (zn4) lv0.o0(list3) : null;
        long jB = t61.b(0, i, 0, 0, 13);
        pp2 pp2Var = this.f;
        pp2Var.a(zn4Var, zn4Var2, jB);
        List list4 = (List) lv0.o0(list);
        if (list4 == null) {
            list4 = ea2.m;
        }
        return k(list4, i, bm3Var.q0(this.c), bm3Var.q0(this.e), pp2Var);
    }

    @Override // o.qu4
    public final int e(bm3 bm3Var, List list, int i) {
        List list2 = (List) lv0.p0(1, list);
        zn4 zn4Var = list2 != null ? (zn4) lv0.o0(list2) : null;
        List list3 = (List) lv0.p0(2, list);
        zn4 zn4Var2 = list3 != null ? (zn4) lv0.o0(list3) : null;
        long jB = t61.b(0, i, 0, 0, 13);
        pp2 pp2Var = this.f;
        pp2Var.a(zn4Var, zn4Var2, jB);
        List list4 = (List) lv0.o0(list);
        if (list4 == null) {
            list4 = ea2.m;
        }
        return k(list4, i, bm3Var.q0(this.c), bm3Var.q0(this.e), pp2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp2)) {
            return false;
        }
        rp2 rp2Var = (rp2) obj;
        return this.a.equals(rp2Var.a) && this.b.equals(rp2Var.b) && w32.b(this.c, rp2Var.c) && this.d.equals(rp2Var.d) && w32.b(this.e, rp2Var.e) && im3.n(this.f, rp2Var.f);
    }

    @Override // o.ag6
    public final int f(jl5 jl5Var) {
        return jl5Var.X();
    }

    @Override // o.ag6
    public final void g(int i, int[] iArr, int[] iArr2, fo4 fo4Var) {
        this.a.h(fo4Var, i, iArr, fo4Var.getLayoutDirection(), iArr2);
    }

    @Override // o.ag6
    public final long h(int i, int i2, int i3, boolean z) {
        dg6 dg6Var = cg6.a;
        return !z ? t61.a(i, i2, 0, i3) : kh.t(i, i2, 0, i3);
    }

    public final int hashCode() {
        return this.f.hashCode() + fx3.a(Integer.MAX_VALUE, fx3.a(Integer.MAX_VALUE, e41.e(this.e, (this.d.hashCode() + e41.e(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // o.ag6
    public final int i(jl5 jl5Var) {
        return jl5Var.Y();
    }

    @Override // o.ag6
    public final eo4 j(final jl5[] jl5VarArr, fo4 fo4Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final j04 j04Var = j04.m;
        return fo4Var.u(i, i2, fa2.m, new Function1() { // from class: o.qp2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vn4 vn4Var;
                il5 il5Var = (il5) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    jl5 jl5Var = jl5VarArr[i8];
                    jl5Var.getClass();
                    Object objE = jl5Var.E();
                    bg6 bg6Var = objE instanceof bg6 ? (bg6) objE : null;
                    if (bg6Var == null || (vn4Var = bg6Var.c) == null) {
                        vn4Var = this.d;
                    }
                    il5Var.g(jl5Var, iArr[i8 - i7], vn4Var.W(i2, jl5Var.X(), j04Var) + i6, 0.0f);
                }
                return f88.a;
            }
        });
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + w32.c(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + w32.c(this.e) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ")";
    }
}
