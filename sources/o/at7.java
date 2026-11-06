package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class at7 {
    public final bg5 a = h57.p(null);
    public xo b;
    public final j57 c;

    public at7(xo xoVar) {
        yr7 yr7Var = new yr7((byte) 6);
        xoVar.getClass();
        vo voVar = new vo(xoVar);
        ArrayList arrayList = voVar.f2333o;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) yr7Var.invoke(((uo) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                wo woVar = (wo) list.get(i2);
                arrayList3.add(new uo(woVar.a, woVar.b, woVar.c, woVar.d));
            }
            qv0.c0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = voVar.g();
        this.c = new j57();
    }

    public static wo c(wo woVar, vs7 vs7Var) {
        xu4 xu4Var = vs7Var.b;
        int iC = xu4Var.c(xu4Var.f - 1, false);
        if (woVar.b < iC) {
            return wo.a(woVar, null, Math.min(woVar.c, iC), 11);
        }
        return null;
    }

    public final void a(int i, ux2 ux2Var) {
        boolean z;
        Object objS;
        ux2Var.Y(1154651354);
        char c = 2;
        int i2 = (ux2Var.h(this) ? 4 : 2) | i;
        boolean z2 = false;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            nl nlVar = (nl) ux2Var.j(b11.s);
            xo xoVar = this.b;
            List listA = xoVar.a(xoVar.n.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                wo woVar = (wo) listA.get(i3);
                int i4 = woVar.b;
                Object obj = woVar.a;
                if (i4 != woVar.c) {
                    ux2Var.W(725478935);
                    Object objK = ux2Var.K();
                    Object obj2 = e01.a;
                    if (objK == obj2) {
                        objS = objK;
                        objS = ua5.s(ux2Var);
                    }
                    objS = objK;
                    mw4 mw4Var = (mw4) objS;
                    fs4 fs4VarT = di1.t(cs4.b, new py5((Object) this, (Object) woVar, (byte) 21));
                    Object objK2 = ux2Var.K();
                    Object obj3 = objK2;
                    if (objK2 == obj2) {
                        Object yr7Var = new yr7((byte) 7);
                        ux2Var.g0(yr7Var);
                        obj3 = yr7Var;
                    }
                    fs4 fs4VarS = hm3.s(cp6.a(fs4VarT, z2, (Function1) obj3).f(new ht7(new io.sentry.q7(this, woVar, (byte) 26))), mw4Var);
                    gn5.a.getClass();
                    fs4 fs4VarM = us1.M(fs4VarS, e8.s);
                    boolean zH = ux2Var.h(this) | ux2Var.f(woVar) | ux2Var.h(nlVar);
                    Object objK3 = ux2Var.K();
                    Object obj4 = objK3;
                    if (zH || objK3 == obj2) {
                        Object a26Var = new a26(this, woVar, nlVar);
                        ux2Var.g0(a26Var);
                        obj4 = a26Var;
                    }
                    ua0.a(androidx.compose.foundation.b.c(fs4VarM, mw4Var, (Function0) obj4), ux2Var, 0);
                    ga4 ga4Var = (ga4) obj;
                    bt7 bt7VarB = ga4Var.b();
                    if (bt7VarB == null || (bt7VarB.a == null && bt7VarB.b == null && bt7VarB.c == null && bt7VarB.d == null)) {
                        z = false;
                        ux2Var.W(728331710);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(726303039);
                        Object objK4 = ux2Var.K();
                        Object obj5 = objK4;
                        if (objK4 == obj2) {
                            Object ha4Var = new ha4(mw4Var);
                            ux2Var.g0(ha4Var);
                            obj5 = ha4Var;
                        }
                        ha4 ha4Var2 = (ha4) obj5;
                        Object objK5 = ux2Var.K();
                        boolean z3 = false;
                        Object obj6 = objK5;
                        if (objK5 == obj2) {
                            Object ys7Var = new ys7((Object) ha4Var2, (hc1) (z3 ? 1 : 0), (byte) 0);
                            ux2Var.g0(ys7Var);
                            obj6 = ys7Var;
                        }
                        ck3.i(f88.a, (hw2) obj6, ux2Var);
                        yf5 yf5Var = ha4Var2.b;
                        yf5 yf5Var2 = ha4Var2.b;
                        Boolean boolValueOf = Boolean.valueOf((yf5Var.z() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((yf5Var2.z() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((yf5Var2.z() & 4) != 0);
                        bt7 bt7VarB2 = ga4Var.b();
                        c77 c77Var = bt7VarB2 != null ? bt7VarB2.a : null;
                        bt7 bt7VarB3 = ga4Var.b();
                        c77 c77Var2 = bt7VarB3 != null ? bt7VarB3.b : null;
                        bt7 bt7VarB4 = ga4Var.b();
                        c77 c77Var3 = bt7VarB4 != null ? bt7VarB4.c : null;
                        bt7 bt7VarB5 = ga4Var.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, c77Var, c77Var2, c77Var3, bt7VarB5 != null ? bt7VarB5.d : null};
                        boolean zH2 = ux2Var.h(this) | ux2Var.f(woVar);
                        Object objK6 = ux2Var.K();
                        Object obj7 = objK6;
                        if (zH2 || objK6 == obj2) {
                            Object py5Var = new py5(this, woVar, ha4Var2);
                            ux2Var.g0(py5Var);
                            obj7 = py5Var;
                        }
                        b(objArr, (Function1) obj7, ux2Var, (i2 << 6) & 896);
                        z = false;
                        ux2Var.p(false);
                    }
                    ux2Var.p(z);
                } else {
                    z = z2;
                    ux2Var.W(728345598);
                    ux2Var.p(z);
                }
                i3++;
                z2 = z;
                c = c;
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gg4((byte) 26, i, this);
        }
    }

    public final void b(Object[] objArr, Function1 function1, ux2 ux2Var, int i) {
        ux2Var.Y(-2083052099);
        int i2 = (i & 48) == 0 ? (ux2Var.h(function1) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(this) ? 256 : 128;
        }
        ux2Var.U(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (ux2Var.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= ux2Var.h(obj) ? 4 : 0;
        }
        ux2Var.p(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        byte b = 1;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            nm nmVar = new nm(2);
            nmVar.g(function1);
            nmVar.i(objArr);
            ArrayList arrayList = nmVar.a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zH = ux2Var.h(this) | ((i3 & 112) == 32);
            Object objK = ux2Var.K();
            if (zH || objK == e01.a) {
                objK = new s40(this, function1, b);
                ux2Var.g0(objK);
            }
            ck3.f(array, (Function1) objK, ux2Var);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) this, (Object) objArr, (Object) function1, i, (byte) 26);
        }
    }
}
