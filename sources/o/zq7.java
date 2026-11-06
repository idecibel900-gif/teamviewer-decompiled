package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zq7 implements do4 {
    public final boolean a;
    public final n37 b;
    public final rq7 c;
    public final rq7 d;
    public final rq7 e;
    public final nd5 f;
    public final float g;

    public zq7(boolean z, n37 n37Var, rq7 rq7Var, rq7 rq7Var2, rq7 rq7Var3, nd5 nd5Var, float f) {
        this.a = z;
        this.b = n37Var;
        this.c = rq7Var;
        this.d = rq7Var2;
        this.e = rq7Var3;
        this.f = nd5Var;
        this.g = f;
    }

    public static int h(List list, int i, hw2 hw2Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (im3.n(wo1.L((zn4) obj7), "TextField")) {
                int iIntValue = ((Number) hw2Var.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (im3.n(wo1.L((zn4) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                zn4 zn4Var = (zn4) obj2;
                int iIntValue2 = zn4Var != null ? ((Number) hw2Var.invoke(zn4Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (im3.n(wo1.L((zn4) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                zn4 zn4Var2 = (zn4) obj3;
                int iIntValue3 = zn4Var2 != null ? ((Number) hw2Var.invoke(zn4Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (im3.n(wo1.L((zn4) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                zn4 zn4Var3 = (zn4) obj4;
                int iIntValue4 = zn4Var3 != null ? ((Number) hw2Var.invoke(zn4Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (im3.n(wo1.L((zn4) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                zn4 zn4Var4 = (zn4) obj5;
                int iIntValue5 = zn4Var4 != null ? ((Number) hw2Var.invoke(zn4Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (im3.n(wo1.L((zn4) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                zn4 zn4Var5 = (zn4) obj6;
                int iIntValue6 = zn4Var5 != null ? ((Number) hw2Var.invoke(zn4Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (im3.n(wo1.L((zn4) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                zn4 zn4Var6 = (zn4) obj;
                int i9 = iIntValue4 + iIntValue5;
                return t61.g(Math.max(iIntValue + i9, Math.max((zn4Var6 != null ? ((Number) hw2Var.invoke(zn4Var6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, t61.b(0, 0, 0, 0, 15));
            }
        }
        gc4.b("Collection contains no element matching the predicate.");
        hk0.b();
        return 0;
    }

    public static final int i(zq7 zq7Var, int i, int i2, jl5 jl5Var) {
        return zq7Var.a ? Math.round(((i - jl5Var.n) / 2.0f) * 1.0f) : i2;
    }

    @Override // o.do4
    public final int a(bm3 bm3Var, List list, int i) {
        return h(list, i, new jp6((byte) 24));
    }

    @Override // o.do4
    public final int b(bm3 bm3Var, List list, int i) {
        return h(list, i, new jp6((byte) 25));
    }

    @Override // o.do4
    public final eo4 c(final fo4 fo4Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        jl5 jl5Var;
        int i2;
        jl5 jl5Var2;
        int i3;
        float f;
        int i4;
        int i5;
        float fA = this.c.a();
        nd5 nd5Var = this.f;
        final int iQ0 = fo4Var.q0(nd5Var.d());
        int iQ1 = fo4Var.q0(nd5Var.c());
        long jB = r61.b(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i6);
            if (im3.n(hm3.p((zn4) obj), "Leading")) {
                break;
            }
            i6++;
        }
        zn4 zn4Var = (zn4) obj;
        jl5 jl5VarC = zn4Var != null ? zn4Var.C(jB) : null;
        int i7 = jl5VarC != null ? jl5VarC.m : 0;
        int iMax = Math.max(0, jl5VarC != null ? jl5VarC.n : 0);
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i8);
            if (im3.n(hm3.p((zn4) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        zn4 zn4Var2 = (zn4) obj2;
        jl5 jl5VarC2 = zn4Var2 != null ? zn4Var2.C(t61.j(-i7, 0, 2, jB)) : null;
        int i9 = i7 + (jl5VarC2 != null ? jl5VarC2.m : 0);
        int iMax2 = Math.max(iMax, jl5VarC2 != null ? jl5VarC2.n : 0);
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (im3.n(hm3.p((zn4) obj3), "Prefix")) {
                break;
            }
            i10++;
        }
        zn4 zn4Var3 = (zn4) obj3;
        jl5 jl5VarC3 = zn4Var3 != null ? zn4Var3.C(t61.j(-i9, 0, 2, jB)) : null;
        int i11 = (jl5VarC3 != null ? jl5VarC3.m : 0) + i9;
        int iMax3 = Math.max(iMax2, jl5VarC3 != null ? jl5VarC3.n : 0);
        int size4 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i12);
            if (im3.n(hm3.p((zn4) obj4), "Suffix")) {
                break;
            }
            i12++;
        }
        zn4 zn4Var4 = (zn4) obj4;
        jl5 jl5VarC4 = zn4Var4 != null ? zn4Var4.C(t61.j(-i11, 0, 2, jB)) : null;
        int i13 = i11 + (jl5VarC4 != null ? jl5VarC4.m : 0);
        int iMax4 = Math.max(iMax3, jl5VarC4 != null ? jl5VarC4.n : 0);
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i14);
            int i15 = size5;
            if (im3.n(hm3.p((zn4) obj5), "Label")) {
                break;
            }
            i14++;
            size5 = i15;
        }
        zn4 zn4Var5 = (zn4) obj5;
        final k76 k76Var = new k76();
        int i16 = -i13;
        k76Var.m = zn4Var5 != null ? zn4Var5.C(t61.i(i16, -iQ1, jB)) : null;
        int size6 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size6) {
                i = iQ1;
                obj6 = null;
                break;
            }
            obj6 = list.get(i17);
            i = iQ1;
            if (im3.n(hm3.p((zn4) obj6), "Supporting")) {
                break;
            }
            i17++;
            iQ1 = i;
        }
        zn4 zn4Var6 = (zn4) obj6;
        int iV = zn4Var6 != null ? zn4Var6.V(r61.k(j)) : 0;
        jl5 jl5Var3 = (jl5) k76Var.m;
        int i18 = iQ0 + (jl5Var3 != null ? jl5Var3.n : 0);
        long jI = t61.i(i16, ((-i18) - i) - iV, r61.b(j, 0, 0, 0, 0, 11));
        int size7 = list.size();
        int i19 = 0;
        while (i19 < size7) {
            int i20 = i18;
            zn4 zn4Var7 = (zn4) list.get(i19);
            int i21 = size7;
            float f2 = fA;
            if (im3.n(hm3.p(zn4Var7), "TextField")) {
                final jl5 jl5VarC5 = zn4Var7.C(jI);
                long jB2 = r61.b(jI, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i22);
                    int i23 = size8;
                    int i24 = i22;
                    if (im3.n(hm3.p((zn4) obj7), "Hint")) {
                        break;
                    }
                    i22 = i24 + 1;
                    size8 = i23;
                }
                zn4 zn4Var8 = (zn4) obj7;
                jl5 jl5VarC6 = zn4Var8 != null ? zn4Var8.C(jB2) : null;
                int iMax5 = Math.max(iMax4, Math.max(jl5VarC5.n, jl5VarC6 != null ? jl5VarC6.n : 0) + i20 + i);
                int i25 = jl5VarC != null ? jl5VarC.m : 0;
                int i26 = jl5VarC2 != null ? jl5VarC2.m : 0;
                int i27 = jl5VarC3 != null ? jl5VarC3.m : 0;
                int i28 = jl5VarC4 != null ? jl5VarC4.m : 0;
                int i29 = i26;
                int i30 = jl5VarC5.m;
                jl5 jl5Var4 = (jl5) k76Var.m;
                int i31 = i27 + i28;
                final int iG = t61.g(Math.max(i30 + i31, Math.max((jl5VarC6 != null ? jl5VarC6.m : 0) + i31, jl5Var4 != null ? jl5Var4.m : 0)) + i25 + i29, j);
                jl5 jl5VarC7 = zn4Var6 != null ? zn4Var6.C(r61.b(t61.j(0, -iMax5, 1, jB), 0, iG, 0, 0, 9)) : null;
                int i32 = jl5VarC7 != null ? jl5VarC7.n : 0;
                int i33 = jl5VarC5.n;
                jl5 jl5Var5 = (jl5) k76Var.m;
                int i34 = jl5Var5 != null ? jl5Var5.n : 0;
                int i35 = jl5VarC != null ? jl5VarC.n : 0;
                int i36 = jl5VarC2 != null ? jl5VarC2.n : 0;
                int i37 = jl5VarC3 != null ? jl5VarC3.n : 0;
                final jl5 jl5Var6 = jl5VarC2;
                if (jl5VarC4 != null) {
                    jl5 jl5Var7 = jl5VarC3;
                    i2 = jl5VarC4.n;
                    jl5Var = jl5Var7;
                } else {
                    jl5Var = jl5VarC3;
                    i2 = 0;
                }
                final jl5 jl5Var8 = jl5Var;
                if (jl5VarC6 != null) {
                    i3 = jl5VarC6.n;
                    jl5Var2 = jl5VarC;
                } else {
                    jl5Var2 = jl5VarC;
                    i3 = 0;
                }
                if (jl5VarC7 != null) {
                    f = f2;
                    i4 = jl5VarC7.n;
                    i5 = 0;
                } else {
                    f = f2;
                    i4 = 0;
                    i5 = 0;
                }
                final int iF = f(fo4Var, i33, i34, i35, i36, i37, i2, i3, i4, j, f);
                final int i38 = iF - i32;
                int size9 = list.size();
                int i39 = i5;
                while (i39 < size9) {
                    zn4 zn4Var9 = (zn4) list.get(i39);
                    if (im3.n(hm3.p(zn4Var9), "Container")) {
                        final jl5 jl5VarC8 = zn4Var9.C(t61.a(iG != 2147483647 ? iG : i5, iG, i38 != Integer.MAX_VALUE ? i38 : i5, i38));
                        final jl5 jl5Var9 = jl5Var2;
                        final jl5 jl5Var10 = jl5VarC6;
                        final jl5 jl5Var11 = jl5VarC7;
                        final float f3 = f;
                        final jl5 jl5Var12 = jl5VarC4;
                        return fo4Var.u(iG, iF, fa2.m, new Function1() { // from class: o.yq7
                            /* JADX WARN: Code duplicated, block: B:20:0x009a  */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i40;
                                int iQ2;
                                int i41;
                                jl5 jl5Var13;
                                int i42;
                                zq7 zq7Var = this;
                                rq7 rq7Var = zq7Var.e;
                                rq7 rq7Var2 = zq7Var.d;
                                il5 il5Var = (il5) obj8;
                                k76 k76Var2 = k76Var;
                                Object obj9 = k76Var2.m;
                                int i43 = iG;
                                int i44 = iF;
                                jl5 jl5Var14 = jl5VarC5;
                                jl5 jl5Var15 = jl5Var10;
                                jl5 jl5Var16 = jl5Var9;
                                jl5 jl5Var17 = jl5Var6;
                                jl5 jl5Var18 = jl5Var8;
                                jl5 jl5Var19 = jl5Var12;
                                jl5 jl5Var20 = jl5VarC8;
                                jl5 jl5Var21 = jl5Var11;
                                if (obj9 != null) {
                                    boolean z = zq7Var.a;
                                    int i45 = iQ0;
                                    if (z) {
                                        iQ2 = Math.round(((i38 - ((jl5) obj9).n) / 2.0f) * 1.0f);
                                    } else {
                                        iQ2 = il5Var.q0(zq7Var.g) + i45;
                                    }
                                    jl5 jl5Var22 = (jl5) k76Var2.m;
                                    int i46 = jl5Var22.n + i45;
                                    j04 layoutDirection = fo4Var.getLayoutDirection();
                                    n37 n37Var = zq7Var.b;
                                    il5Var.g(jl5Var20, 0, 0, 0.0f);
                                    int i47 = i44 - (jl5Var21 != null ? jl5Var21.n : 0);
                                    if (jl5Var16 != null) {
                                        il5.k(il5Var, jl5Var16, 0, Math.round(((i47 - jl5Var16.n) / 2.0f) * 1.0f));
                                    }
                                    float f4 = f3;
                                    int iH = vs1.H(f4, iQ2, i45);
                                    if (layoutDirection == j04.m) {
                                        if (jl5Var16 != null) {
                                            i41 = jl5Var16.m;
                                        } else {
                                            i41 = 0;
                                        }
                                    } else if (jl5Var17 != null) {
                                        i41 = jl5Var17.m;
                                    } else {
                                        i41 = 0;
                                    }
                                    int i48 = i41;
                                    il5Var.g(jl5Var22, vs1.H(f4, ((w50) m77.q(n37Var)).a(jl5Var22.m, (i43 - (jl5Var16 != null ? jl5Var16.m : 0)) - (jl5Var17 != null ? jl5Var17.m : 0), layoutDirection) + i48, ((w50) m77.r(n37Var)).a(jl5Var22.m, (i43 - (jl5Var16 != null ? jl5Var16.m : 0)) - (jl5Var17 != null ? jl5Var17.m : 0), layoutDirection) + i48), iH, 0.0f);
                                    if (jl5Var18 != null) {
                                        jl5Var13 = jl5Var18;
                                        i42 = i46;
                                        il5.l(il5Var, jl5Var13, jl5Var16 != null ? jl5Var16.m : 0, i42, new bc5(rq7Var, (byte) 7), 4);
                                    } else {
                                        jl5Var13 = jl5Var18;
                                        i42 = i46;
                                    }
                                    int i49 = (jl5Var16 != null ? jl5Var16.m : 0) + (jl5Var13 != null ? jl5Var13.m : 0);
                                    il5.k(il5Var, jl5Var14, i49, i42);
                                    if (jl5Var15 != null) {
                                        il5.l(il5Var, jl5Var15, i49, i42, new bc5(rq7Var2, (byte) 8), 4);
                                    }
                                    if (jl5Var19 != null) {
                                        il5.l(il5Var, jl5Var19, (i43 - (jl5Var17 != null ? jl5Var17.m : 0)) - jl5Var19.m, i42, new bc5(rq7Var, (byte) 3), 4);
                                    }
                                    if (jl5Var17 != null) {
                                        il5.k(il5Var, jl5Var17, i43 - jl5Var17.m, Math.round(((i47 - jl5Var17.n) / 2.0f) * 1.0f));
                                    }
                                    if (jl5Var21 != null) {
                                        il5.k(il5Var, jl5Var21, 0, i47);
                                    }
                                } else {
                                    float density = il5Var.getDensity();
                                    il5.j(il5Var, jl5Var20, 0L);
                                    int i50 = i44 - (jl5Var21 != null ? jl5Var21.n : 0);
                                    int iS0 = vn4.s0(zq7Var.f.d() * density);
                                    if (jl5Var16 != null) {
                                        il5.k(il5Var, jl5Var16, 0, Math.round(((i50 - jl5Var16.n) / 2.0f) * 1.0f));
                                    }
                                    if (jl5Var18 != null) {
                                        i40 = iS0;
                                        il5Var = il5Var;
                                        il5.l(il5Var, jl5Var18, jl5Var16 != null ? jl5Var16.m : 0, zq7.i(zq7Var, i50, iS0, jl5Var18), new bc5(rq7Var, (byte) 4), 4);
                                    } else {
                                        i40 = iS0;
                                    }
                                    int i51 = (jl5Var16 != null ? jl5Var16.m : 0) + (jl5Var18 != null ? jl5Var18.m : 0);
                                    il5.k(il5Var, jl5Var14, i51, zq7.i(zq7Var, i50, i40, jl5Var14));
                                    if (jl5Var15 != null) {
                                        il5.l(il5Var, jl5Var15, i51, zq7.i(zq7Var, i50, i40, jl5Var15), new bc5(rq7Var2, (byte) 5), 4);
                                    }
                                    if (jl5Var19 != null) {
                                        il5.l(il5Var, jl5Var19, (i43 - (jl5Var17 != null ? jl5Var17.m : 0)) - jl5Var19.m, zq7.i(zq7Var, i50, i40, jl5Var19), new bc5(rq7Var, (byte) 6), 4);
                                    }
                                    if (jl5Var17 != null) {
                                        il5.k(il5Var, jl5Var17, i43 - jl5Var17.m, Math.round(((i50 - jl5Var17.n) / 2.0f) * 1.0f));
                                    }
                                    if (jl5Var21 != 0) {
                                        il5.k(il5Var, jl5Var21, 0, i50);
                                    }
                                }
                                return f88.a;
                            }
                        });
                    }
                    i39++;
                    i38 = i38;
                }
                gc4.b("Collection contains no element matching the predicate.");
                hk0.b();
                return null;
            }
            fA = f2;
            i19++;
            size7 = i21;
            i18 = i20;
            jl5VarC = jl5VarC;
            jI = jI;
        }
        gc4.b("Collection contains no element matching the predicate.");
        hk0.b();
        return null;
    }

    @Override // o.do4
    public final int d(bm3 bm3Var, List list, int i) {
        return g(bm3Var, list, i, new jp6((byte) 22));
    }

    @Override // o.do4
    public final int e(bm3 bm3Var, List list, int i) {
        return g(bm3Var, list, i, new jp6((byte) 23));
    }

    public final int f(in1 in1Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        nd5 nd5Var = this.f;
        return t61.f(Math.max(i3, Math.max(i4, in1Var.q0(nd5Var.c() + nd5Var.d()) + (i2 > 0 ? Math.max(in1Var.q0(this.g * 2.0f), vs1.H(gu4.a.b(f), 0, i2)) : 0) + db8.k0(new int[]{i7, i5, i6, vs1.H(f, i2, 0)}, i))) + i8, j);
    }

    public final int g(bm3 bm3Var, List list, int i, hw2 hw2Var) {
        Object obj;
        int i2;
        int iIntValue;
        int iY;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (im3.n(wo1.L((zn4) obj), "Leading")) {
                break;
            }
            i5++;
        }
        zn4 zn4Var = (zn4) obj;
        if (zn4Var != null) {
            i2 = i;
            iY = wo1.Y(i2, zn4Var.o(Integer.MAX_VALUE));
            iIntValue = ((Number) hw2Var.invoke(zn4Var, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iY = i2;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (im3.n(wo1.L((zn4) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        zn4 zn4Var2 = (zn4) obj2;
        if (zn4Var2 != null) {
            iY = wo1.Y(iY, zn4Var2.o(Integer.MAX_VALUE));
            iIntValue2 = ((Number) hw2Var.invoke(zn4Var2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (im3.n(wo1.L((zn4) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (zn4) obj3;
        int iIntValue3 = obj8 != null ? ((Number) hw2Var.invoke(obj8, Integer.valueOf(iY))).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (im3.n(wo1.L((zn4) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        zn4 zn4Var3 = (zn4) obj4;
        if (zn4Var3 != null) {
            int iIntValue4 = ((Number) hw2Var.invoke(zn4Var3, Integer.valueOf(iY))).intValue();
            iY = wo1.Y(iY, zn4Var3.o(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (im3.n(wo1.L((zn4) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        zn4 zn4Var4 = (zn4) obj5;
        if (zn4Var4 != null) {
            int iIntValue5 = ((Number) hw2Var.invoke(zn4Var4, Integer.valueOf(iY))).intValue();
            iY = wo1.Y(iY, zn4Var4.o(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (im3.n(wo1.L((zn4) obj9), "TextField")) {
                int iIntValue6 = ((Number) hw2Var.invoke(obj9, Integer.valueOf(iY))).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (im3.n(wo1.L((zn4) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (zn4) obj6;
                int iIntValue7 = obj10 != null ? ((Number) hw2Var.invoke(obj10, Integer.valueOf(iY))).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i12);
                    if (im3.n(wo1.L((zn4) obj7), "Supporting")) {
                        break;
                    }
                    i12++;
                }
                Object obj11 = (zn4) obj7;
                return f(bm3Var, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj11 != null ? ((Number) hw2Var.invoke(obj11, Integer.valueOf(i2))).intValue() : 0, t61.b(0, 0, 0, 0, 15), this.c.a());
            }
        }
        gc4.b("Collection contains no element matching the predicate.");
        hk0.b();
        return 0;
    }
}
