package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class cc5 implements do4 {
    public final Function1 a;
    public final boolean b;
    public final wq7 c;
    public final rq7 d;
    public final rq7 e;
    public final rq7 f;
    public final nd5 g;
    public final float h;

    public cc5(Function1 function1, boolean z, wq7 wq7Var, rq7 rq7Var, rq7 rq7Var2, rq7 rq7Var3, nd5 nd5Var, float f) {
        this.a = function1;
        this.b = z;
        this.c = wq7Var;
        this.d = rq7Var;
        this.e = rq7Var2;
        this.f = rq7Var3;
        this.g = nd5Var;
        this.h = f;
    }

    public static final int j(int i, cc5 cc5Var, int i2, int i3, jl5 jl5Var, jl5 jl5Var2) {
        if (cc5Var.b) {
            i3 = Math.round(((i2 - jl5Var2.n) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (jl5Var != null ? jl5Var.n : 0) / 2);
    }

    @Override // o.do4
    public final int a(bm3 bm3Var, List list, int i) {
        return i(bm3Var, list, i, new qo2((byte) 11));
    }

    @Override // o.do4
    public final int b(bm3 bm3Var, List list, int i) {
        return i(bm3Var, list, i, new qo2((byte) 12));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v17 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // o.do4
    public final o.eo4 c(o.fo4 r44, java.util.List r45, long r46) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cc5.c(o.fo4, java.util.List, long):o.eo4");
    }

    @Override // o.do4
    public final int d(bm3 bm3Var, List list, int i) {
        return h(bm3Var, list, i, new qo2((byte) 14));
    }

    @Override // o.do4
    public final int e(bm3 bm3Var, List list, int i) {
        return h(bm3Var, list, i, new qo2((byte) 13));
    }

    public final int f(in1 in1Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int iK0 = db8.k0(new int[]{i7, i3, i4, vs1.H(f, i6, 0)}, i5);
        nd5 nd5Var = this.g;
        float fD0 = in1Var.d0(nd5Var.d());
        return t61.f(Math.max(i, Math.max(i2, vn4.s0(vs1.G(fD0, Math.max(fD0, i6 / 2.0f), f) + iK0 + in1Var.d0(nd5Var.c())))) + i8, j);
    }

    public final int g(in1 in1Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, vs1.H(f, i6, 0))) + i + i2;
        nd5 nd5Var = this.g;
        j04 j04Var = j04.m;
        return t61.g(Math.max(iMax, vn4.s0((i6 + in1Var.d0(nd5Var.b(j04Var) + nd5Var.a(j04Var))) * f)), j);
    }

    public final int h(bm3 bm3Var, List list, int i, hw2 hw2Var) {
        Object obj;
        int iY;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        cc5 cc5Var = this;
        float fA = cc5Var.d.a();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (im3.n(wo1.L((zn4) obj), "Leading")) {
                break;
            }
            i2++;
        }
        zn4 zn4Var = (zn4) obj;
        if (zn4Var != null) {
            iY = wo1.Y(i, zn4Var.o(Integer.MAX_VALUE));
            iIntValue = ((Number) hw2Var.invoke(zn4Var, Integer.valueOf(i))).intValue();
        } else {
            iY = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (im3.n(wo1.L((zn4) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        zn4 zn4Var2 = (zn4) obj2;
        if (zn4Var2 != null) {
            iY = wo1.Y(iY, zn4Var2.o(Integer.MAX_VALUE));
            iIntValue2 = ((Number) hw2Var.invoke(zn4Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (im3.n(wo1.L((zn4) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (zn4) obj3;
        int iIntValue5 = obj8 != null ? ((Number) hw2Var.invoke(obj8, Integer.valueOf(vs1.H(fA, iY, i)))).intValue() : 0;
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
        if (zn4Var3 != null) {
            iIntValue3 = ((Number) hw2Var.invoke(zn4Var3, Integer.valueOf(iY))).intValue();
            iY = wo1.Y(iY, zn4Var3.o(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
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
        if (zn4Var4 != null) {
            iIntValue4 = ((Number) hw2Var.invoke(zn4Var4, Integer.valueOf(iY))).intValue();
            iY = wo1.Y(iY, zn4Var4.o(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (im3.n(wo1.L((zn4) obj9), "TextField")) {
                int iIntValue6 = ((Number) hw2Var.invoke(obj9, Integer.valueOf(iY))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (im3.n(wo1.L((zn4) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (zn4) obj6;
                int iIntValue7 = obj10 != null ? ((Number) hw2Var.invoke(obj10, Integer.valueOf(iY))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (im3.n(wo1.L((zn4) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (zn4) obj7;
                return cc5Var.f(bm3Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) hw2Var.invoke(obj11, Integer.valueOf(i))).intValue() : 0, t61.b(0, 0, 0, 0, 15), fA);
            }
            i7++;
            iIntValue4 = iIntValue4;
            cc5Var = this;
            iIntValue3 = iIntValue3;
        }
        gc4.b("Collection contains no element matching the predicate.");
        hk0.b();
        return 0;
    }

    public final int i(bm3 bm3Var, List list, int i, hw2 hw2Var) {
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
                    if (im3.n(wo1.L((zn4) obj4), "Leading")) {
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
                    if (im3.n(wo1.L((zn4) obj5), "Prefix")) {
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
                    if (im3.n(wo1.L((zn4) obj6), "Suffix")) {
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
                return g(bm3Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, zn4Var6 != null ? ((Number) hw2Var.invoke(zn4Var6, Integer.valueOf(i))).intValue() : 0, t61.b(0, 0, 0, 0, 15), this.d.a());
            }
        }
        gc4.b("Collection contains no element matching the predicate.");
        hk0.b();
        return 0;
    }
}
