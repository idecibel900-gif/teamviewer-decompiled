package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ub4 implements qu4 {
    public static int f(bm3 bm3Var, ArrayList arrayList, int i, hw2 hw2Var) {
        int iIntValue;
        int iIntValue2;
        int i2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        float f = pb4.a;
        int iY = wo1.Y(i, bm3Var.q0(32.0f));
        zn4 zn4Var = (zn4) lv0.o0(list4);
        if (zn4Var != null) {
            iIntValue = ((Number) hw2Var.invoke(zn4Var, Integer.valueOf(iY))).intValue();
            iY = wo1.Y(iY, zn4Var.o(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        zn4 zn4Var2 = (zn4) lv0.o0(list5);
        if (zn4Var2 != null) {
            iIntValue2 = ((Number) hw2Var.invoke(zn4Var2, Integer.valueOf(iY))).intValue();
            iY = wo1.Y(iY, zn4Var2.o(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (zn4) lv0.o0(list2);
        int iIntValue3 = obj != null ? ((Number) hw2Var.invoke(obj, Integer.valueOf(iY))).intValue() : 0;
        Object obj2 = (zn4) lv0.o0(list);
        int iIntValue4 = obj2 != null ? ((Number) hw2Var.invoke(obj2, Integer.valueOf(iY))).intValue() : 0;
        Object obj3 = (zn4) lv0.o0(list3);
        int iIntValue5 = obj3 != null ? ((Number) hw2Var.invoke(obj3, Integer.valueOf(iY))).intValue() : 0;
        boolean z = iIntValue5 > bm3Var.l0(h67.k(30));
        boolean z2 = iIntValue3 > 0;
        boolean z3 = iIntValue5 > 0;
        if ((z2 && z3) || z) {
            i2 = 3;
        } else {
            i2 = (z2 || z3) ? 2 : 1;
        }
        return pb4.d(bm3Var, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i2, bm3Var.q0((i2 == 3 ? 12.0f : 8.0f) * 2.0f), t61.b(0, 0, 0, 0, 15));
    }

    public static int g(bm3 bm3Var, ArrayList arrayList, int i, hw2 hw2Var) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        zn4 zn4Var = (zn4) lv0.o0(list4);
        int iIntValue = zn4Var != null ? ((Number) hw2Var.invoke(zn4Var, Integer.valueOf(i))).intValue() : 0;
        zn4 zn4Var2 = (zn4) lv0.o0(list5);
        int iIntValue2 = zn4Var2 != null ? ((Number) hw2Var.invoke(zn4Var2, Integer.valueOf(i))).intValue() : 0;
        zn4 zn4Var3 = (zn4) lv0.o0(list);
        int iIntValue3 = zn4Var3 != null ? ((Number) hw2Var.invoke(zn4Var3, Integer.valueOf(i))).intValue() : 0;
        zn4 zn4Var4 = (zn4) lv0.o0(list2);
        int iIntValue4 = zn4Var4 != null ? ((Number) hw2Var.invoke(zn4Var4, Integer.valueOf(i))).intValue() : 0;
        zn4 zn4Var5 = (zn4) lv0.o0(list3);
        int iIntValue5 = zn4Var5 != null ? ((Number) hw2Var.invoke(zn4Var5, Integer.valueOf(i))).intValue() : 0;
        float f = pb4.a;
        int iQ0 = bm3Var.q0(32.0f);
        long jB = t61.b(0, 0, 0, 0, 15);
        if (r61.e(jB)) {
            return r61.i(jB);
        }
        return iQ0 + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }

    @Override // o.qu4
    public final int a(bm3 bm3Var, List list, int i) {
        return g(bm3Var, (ArrayList) list, i, tb4.n);
    }

    @Override // o.qu4
    public final int b(bm3 bm3Var, List list, int i) {
        return g(bm3Var, (ArrayList) list, i, rb4.n);
    }

    @Override // o.qu4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        int i;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long jB = r61.b(j, 0, 0, 0, 0, 10);
        float f = pb4.a;
        int iQ0 = fo4Var.q0(32.0f);
        zn4 zn4Var = (zn4) lv0.o0(list5);
        int iK = zn4Var != null ? zn4Var.k(r61.h(j)) : 0;
        zn4 zn4Var2 = (zn4) lv0.o0(list6);
        int iY = wo1.Y(r61.i(jB), iK + (zn4Var2 != null ? zn4Var2.k(r61.h(j)) : 0) + iQ0);
        zn4 zn4Var3 = (zn4) lv0.o0(list4);
        long jI = t61.i(-iQ0, -fo4Var.q0(((((lv0.o0(list3) != null) && (lv0.o0(list4) != null)) || ((zn4Var3 != null ? zn4Var3.V(iY) : 0) > fo4Var.l0(h67.k(30)))) ? 12.0f : 8.0f) * 2.0f), jB);
        zn4 zn4Var4 = (zn4) lv0.o0(list5);
        jl5 jl5VarC = zn4Var4 != null ? zn4Var4.C(jI) : null;
        int i2 = jl5VarC != null ? jl5VarC.m : 0;
        zn4 zn4Var5 = (zn4) lv0.o0(list6);
        jl5 jl5VarC2 = zn4Var5 != null ? zn4Var5.C(t61.j(-i2, 0, 2, jI)) : null;
        int i3 = i2 + (jl5VarC2 != null ? jl5VarC2.m : 0);
        zn4 zn4Var6 = (zn4) lv0.o0(list2);
        jl5 jl5VarC3 = zn4Var6 != null ? zn4Var6.C(t61.j(-i3, 0, 2, jI)) : null;
        int i4 = jl5VarC3 != null ? jl5VarC3.n : 0;
        zn4 zn4Var7 = (zn4) lv0.o0(list4);
        jl5 jl5VarC4 = zn4Var7 != null ? zn4Var7.C(t61.i(-i3, -i4, jI)) : null;
        int i5 = i4 + (jl5VarC4 != null ? jl5VarC4.n : 0);
        boolean z = (jl5VarC4 == null || jl5VarC4.W(le.a) == jl5VarC4.W(le.b)) ? false : true;
        zn4 zn4Var8 = (zn4) lv0.o0(list3);
        jl5 jl5VarC5 = zn4Var8 != null ? zn4Var8.C(t61.i(-i3, -i5, jI)) : null;
        boolean z2 = jl5VarC5 != null;
        boolean z3 = jl5VarC4 != null;
        if ((z2 && z3) || z) {
            i = 3;
        } else {
            i = (z2 || z3) ? 2 : 1;
        }
        float f2 = i == 3 ? 12.0f : 8.0f;
        float f3 = f2 * 2.0f;
        final int i6 = r61.e(j) ? r61.i(j) : iQ0 + (jl5VarC != null ? jl5VarC.m : 0) + Math.max(jl5VarC3 != null ? jl5VarC3.m : 0, Math.max(jl5VarC5 != null ? jl5VarC5.m : 0, jl5VarC4 != null ? jl5VarC4.m : 0)) + (jl5VarC2 != null ? jl5VarC2.m : 0);
        final jl5 jl5Var = jl5VarC5;
        float f4 = f2;
        final int iD = pb4.d(fo4Var, jl5VarC != null ? jl5VarC.n : 0, jl5VarC2 != null ? jl5VarC2.n : 0, jl5VarC3 != null ? jl5VarC3.n : 0, jl5VarC5 != null ? jl5VarC5.n : 0, jl5VarC4 != null ? jl5VarC4.n : 0, i, fo4Var.q0(f3), j);
        final boolean z4 = i == 3;
        final int iQ1 = fo4Var.q0(16.0f);
        final int iQ2 = fo4Var.q0(16.0f);
        final int iQ3 = fo4Var.q0(f4);
        final jl5 jl5Var2 = jl5VarC2;
        final jl5 jl5Var3 = jl5VarC3;
        final jl5 jl5Var4 = jl5VarC4;
        final jl5 jl5Var5 = jl5VarC;
        return fo4Var.u(i6, iD, fa2.m, new Function1() { // from class: o.ob4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iRound;
                il5 il5Var = (il5) obj;
                jl5 jl5Var6 = jl5Var5;
                int i7 = iQ1;
                boolean z5 = z4;
                int iRound2 = iQ3;
                int i8 = iD;
                if (jl5Var6 != null) {
                    il5.k(il5Var, jl5Var6, i7, z5 ? iRound2 : Math.round(((i8 - jl5Var6.n) / 2.0f) * 1.0f));
                }
                int i9 = i7 + (jl5Var6 != null ? jl5Var6.m : 0);
                jl5 jl5Var7 = jl5Var3;
                jl5 jl5Var8 = jl5Var;
                jl5 jl5Var9 = jl5Var4;
                if (z5) {
                    iRound = iRound2;
                } else {
                    iRound = Math.round(((i8 - (((jl5Var7 != null ? jl5Var7.n : 0) + (jl5Var8 != null ? jl5Var8.n : 0)) + (jl5Var9 != null ? jl5Var9.n : 0))) / 2.0f) * 1.0f);
                }
                if (jl5Var8 != null) {
                    il5.k(il5Var, jl5Var8, i9, iRound);
                }
                int i10 = iRound + (jl5Var8 != null ? jl5Var8.n : 0);
                if (jl5Var7 != null) {
                    il5.k(il5Var, jl5Var7, i9, i10);
                }
                int i11 = i10 + (jl5Var7 != null ? jl5Var7.n : 0);
                if (jl5Var9 != null) {
                    il5.k(il5Var, jl5Var9, i9, i11);
                }
                jl5 jl5Var10 = jl5Var2;
                if (jl5Var10 != null) {
                    int i12 = (i6 - iQ2) - jl5Var10.m;
                    if (!z5) {
                        iRound2 = Math.round(((i8 - jl5Var10.n) / 2.0f) * 1.0f);
                    }
                    il5.k(il5Var, jl5Var10, i12, iRound2);
                }
                return f88.a;
            }
        });
    }

    @Override // o.qu4
    public final int d(bm3 bm3Var, List list, int i) {
        return f(bm3Var, (ArrayList) list, i, qb4.n);
    }

    @Override // o.qu4
    public final int e(bm3 bm3Var, List list, int i) {
        return f(bm3Var, (ArrayList) list, i, sb4.n);
    }
}
