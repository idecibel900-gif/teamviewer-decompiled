package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class mj4 {
    public static final Map a;
    public static final Map b;
    public static final Map c;

    static {
        Map mapR = xm4.R(new vd5("Apache-2.0", new rv0(j51.j(4290157823L))), new vd5("MIT", new rv0(j51.j(4286234879L))), new vd5("EPL-2.0", new rv0(j51.j(4293174634L))), new vd5("EPL-1.0", new rv0(j51.j(4293174634L))), new vd5("BSD-3-Clause", new rv0(j51.j(4287288484L))), new vd5("BSD-2-Clause", new rv0(j51.j(4287288484L))), new vd5("GPL-3.0", new rv0(j51.j(4294938254L))), new vd5("GPL-3.0-only", new rv0(j51.j(4294938254L))), new vd5("GPL-3.0-or-later", new rv0(j51.j(4294938254L))), new vd5("GPL-2.0", new rv0(j51.j(4294938254L))), new vd5("LGPL-2.1", new rv0(j51.j(4294946952L))), new vd5("LGPL-3.0", new rv0(j51.j(4294946952L))), new vd5("MPL-2.0", new rv0(j51.j(4294955642L))), new vd5("ISC", new rv0(j51.j(4286234879L))), new vd5("Unlicense", new rv0(j51.j(4290230199L))), new vd5("CC0-1.0", new rv0(j51.j(4290230199L))));
        a = mapR;
        b = xm4.R(new vd5("Apache-2.0", new rv0(j51.j(4283445435L))), new vd5("MIT", new rv0(j51.j(4279591080L))), new vd5("EPL-2.0", new rv0(j51.j(4287581194L))), new vd5("EPL-1.0", new rv0(j51.j(4287581194L))), new vd5("BSD-3-Clause", new rv0(j51.j(4280183613L))), new vd5("BSD-2-Clause", new rv0(j51.j(4280183613L))), new vd5("GPL-3.0", new rv0(j51.j(4290454050L))), new vd5("GPL-3.0-only", new rv0(j51.j(4290454050L))), new vd5("GPL-3.0-or-later", new rv0(j51.j(4290454050L))), new vd5("GPL-2.0", new rv0(j51.j(4290454050L))), new vd5("LGPL-2.1", new rv0(j51.j(4288036632L))), new vd5("LGPL-3.0", new rv0(j51.j(4288036632L))), new vd5("MPL-2.0", new rv0(j51.j(4286206976L))), new vd5("ISC", new rv0(j51.j(4279591080L))), new vd5("Unlicense", new rv0(j51.j(4284111450L))), new vd5("CC0-1.0", new rv0(j51.j(4284111450L))));
        vd5 vd5Var = new vd5("Apache-2.0", Float.valueOf(-60.0f));
        Float fValueOf = Float.valueOf(-130.0f);
        vd5 vd5Var2 = new vd5("MIT", fValueOf);
        Float fValueOf2 = Float.valueOf(60.0f);
        vd5 vd5Var3 = new vd5("EPL-2.0", fValueOf2);
        vd5 vd5Var4 = new vd5("EPL-1.0", fValueOf2);
        Float fValueOf3 = Float.valueOf(170.0f);
        vd5 vd5Var5 = new vd5("BSD-3-Clause", fValueOf3);
        vd5 vd5Var6 = new vd5("BSD-2-Clause", fValueOf3);
        Float fValueOf4 = Float.valueOf(30.0f);
        vd5 vd5Var7 = new vd5("GPL-3.0", fValueOf4);
        vd5 vd5Var8 = new vd5("GPL-3.0-only", fValueOf4);
        vd5 vd5Var9 = new vd5("GPL-3.0-or-later", fValueOf4);
        vd5 vd5Var10 = new vd5("GPL-2.0", fValueOf4);
        Float fValueOf5 = Float.valueOf(50.0f);
        c = xm4.R(vd5Var, vd5Var2, vd5Var3, vd5Var4, vd5Var5, vd5Var6, vd5Var7, vd5Var8, vd5Var9, vd5Var10, new vd5("LGPL-2.1", fValueOf5), new vd5("LGPL-3.0", fValueOf5), new vd5("MPL-2.0", Float.valueOf(75.0f)), new vd5("ISC", fValueOf), new vd5("Unlicense", null), new vd5("CC0-1.0", null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(xm4.Q(mapR.size()));
        for (Map.Entry entry : mapR.entrySet()) {
            String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashMap.put(lowerCase, entry.getValue());
        }
    }

    public static final xl1 a(long j, long j2, ux2 ux2Var, int i) {
        float f;
        Object obj;
        long j3;
        long j4;
        long jH;
        zw5 zw5Var = un4.a;
        long j5 = ((rn4) ux2Var.j(zw5Var)).a.F;
        long j6 = ((rn4) ux2Var.j(zw5Var)).a.q;
        ux2Var.W(836953631);
        long j7 = ((rn4) ux2Var.j(zw5Var)).a.s;
        ux2Var.p(false);
        long j8 = ((rn4) ux2Var.j(zw5Var)).a.B;
        long j9 = ((rn4) ux2Var.j(zw5Var)).a.p;
        long j10 = ((rn4) ux2Var.j(zw5Var)).a.I;
        long j11 = ((rn4) ux2Var.j(zw5Var)).a.q;
        ux2Var.W(836968575);
        long j12 = ((rn4) ux2Var.j(zw5Var)).a.s;
        ux2Var.p(false);
        long j13 = ((rn4) ux2Var.j(zw5Var)).a.B;
        long j14 = (i & 1024) != 0 ? ((rn4) ux2Var.j(zw5Var)).a.a : j;
        long j15 = (i & 2048) != 0 ? ((rn4) ux2Var.j(zw5Var)).a.b : j2;
        long j16 = ((rn4) ux2Var.j(zw5Var)).a.A;
        long j17 = ((rn4) ux2Var.j(zw5Var)).a.q;
        long j18 = ((rn4) ux2Var.j(zw5Var)).a.a;
        long j19 = ((rn4) ux2Var.j(zw5Var)).a.H;
        long j20 = ((rn4) ux2Var.j(zw5Var)).a.s;
        long jX = j51.x(rv0.b(0.22f, ((rn4) ux2Var.j(zw5Var)).a.a), ((rn4) ux2Var.j(zw5Var)).a.F);
        long j21 = ((rn4) ux2Var.j(zw5Var)).a.a;
        long j22 = ((rn4) ux2Var.j(zw5Var)).a.a;
        long jB = rv0.b(0.4f, ((rn4) ux2Var.j(zw5Var)).a.C);
        long j23 = ((rn4) ux2Var.j(zw5Var)).a.G;
        long j24 = ((rn4) ux2Var.j(zw5Var)).a.H;
        long jB2 = rv0.b(0.5f, ((rn4) ux2Var.j(zw5Var)).a.A);
        boolean zX = ka0.x(ux2Var);
        long j25 = ((rn4) ux2Var.j(zw5Var)).a.a;
        boolean zE = ux2Var.e(j25) | ux2Var.g(zX);
        lc1 lc1Var = lc1.m;
        boolean zD = zE | ux2Var.d(lc1Var.ordinal());
        Object objK = ux2Var.K();
        Object obj2 = e01.a;
        if (zD || objK == obj2) {
            long jA = rv0.a(j25, ew0.e);
            float fG = rv0.g(jA);
            float f2 = rv0.f(jA);
            float fD = rv0.d(jA);
            float fMax = Math.max(fG, Math.max(f2, fD));
            float fMin = fMax - Math.min(fG, Math.min(f2, fD));
            if (fMin == 0.0f) {
                f = 0.0f;
            } else {
                f = (fMax == fG ? ((f2 - fD) / fMin) % 6.0f : fMax == f2 ? ((fD - fG) / fMin) + 2.0f : ((fG - f2) / fMin) + 4.0f) * 60.0f;
                if (f < 0.0f) {
                    f += 360.0f;
                }
            }
            float f3 = zX ? 0.4f : 0.75f;
            float f4 = zX ? 0.97f : 0.45f;
            long j26 = zX ? j51.j(4290230199L) : j51.j(4284111450L);
            Map map = c;
            float f5 = f;
            LinkedHashMap linkedHashMap = new LinkedHashMap(xm4.Q(map.size()));
            for (Iterator it = map.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put((String) entry.getKey(), entry.getValue());
                obj2 = obj2;
            }
            obj = obj2;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(xm4.Q(linkedHashMap.size()));
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                Iterator it3 = it2;
                Object key = entry2.getKey();
                Float f6 = (Float) entry2.getValue();
                if (f6 == null) {
                    j8 = j8;
                    jH = j26;
                } else {
                    int i2 = rv0.i;
                    float fFloatValue = (((f6.floatValue() + f5) % 360.0f) + 360.0f) % 360.0f;
                    td6 td6Var = ew0.e;
                    if (0.0f > fFloatValue || fFloatValue > 360.0f || 0.0f > f3 || f3 > 1.0f || 0.0f > f4 || f4 > 1.0f) {
                        StringBuilder sbN = e41.n("HSV (", fFloatValue, ", ", f3, ", ");
                        sbN.append(f4);
                        sbN.append(") must be in range (0..360, 0..1, 0..1)");
                        ji3.a(sbN.toString());
                    }
                    jH = j51.h(ju.v(fFloatValue, f3, f4, 5), ju.v(fFloatValue, f3, f4, 3), ju.v(fFloatValue, f3, f4, 1), 1.0f, td6Var);
                }
                linkedHashMap2.put(key, new rv0(jH));
                it2 = it3;
                jX = jX;
                j8 = j8;
            }
            j3 = j8;
            j4 = jX;
            vm4 vm4Var = new vm4(linkedHashMap2);
            List list = i84.a;
            List list2 = zX ? i84.c : i84.a;
            list2.getClass();
            objK = new xd5(vm4Var, list2);
            ux2Var.g0(objK);
        } else {
            j3 = j8;
            j4 = jX;
            obj = obj2;
        }
        h84 h84Var = (h84) objK;
        long j27 = rv0.h;
        boolean zE2 = ux2Var.e(j5) | ux2Var.e(j6) | ux2Var.e(j7) | ux2Var.e(j3) | ux2Var.e(j9) | ux2Var.e(j10) | ux2Var.e(j11) | ux2Var.e(j12) | ux2Var.e(j13);
        long j28 = j14;
        boolean zE3 = ux2Var.e(j19) | zE2 | ux2Var.e(j28) | ux2Var.e(j15) | ux2Var.e(j16) | ux2Var.e(j17) | ux2Var.e(j18) | ux2Var.e(j20) | ux2Var.e(j4) | ux2Var.e(j21) | ux2Var.e(j22) | ux2Var.e(jB) | ux2Var.e(j23) | ux2Var.e(j24) | ux2Var.e(jB2) | ux2Var.f(h84Var) | ux2Var.d(lc1Var.ordinal()) | ux2Var.e(j27) | ux2Var.e(j27);
        Object objK2 = ux2Var.K();
        if (zE3 || objK2 == obj) {
            Object xl1Var = new xl1(j9, j10, j11, j12, j28, j15, j16, j17, j18, jB, j23, j24, jB2, h84Var, j27, j27);
            ux2Var.g0(xl1Var);
            objK2 = xl1Var;
        }
        return (xl1) objK2;
    }

    public static final bm1 b(ux2 ux2Var) {
        zw5 zw5Var = un4.a;
        ot7 ot7Var = ((rn4) ux2Var.j(zw5Var)).b.i;
        long jK = h67.k(14);
        ms2 ms2Var = ms2.p;
        ot7 ot7VarA = ot7.a(ot7Var, 0L, jK, ms2Var, null, 0L, h67.h(1.2d), null, 16646137);
        ot7 ot7VarA2 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.l, 0L, h67.k(11), null, null, 0L, h67.h(1.25d), null, 16646141);
        ot7 ot7VarA3 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.f952o, 0L, h67.k(11), null, null, 0L, 0L, null, 16777213);
        ot7 ot7VarA4 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.f952o, 0L, h67.k(11), ms2Var, null, 0L, 0L, null, 16777209);
        ot7 ot7VarA5 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.l, 0L, h67.k(12), null, null, 0L, h67.h(1.5d), null, 16646141);
        ot7 ot7VarA6 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.g, 0L, h67.k(20), ms2Var, null, h67.j(-0.2d), h67.h(1.1d), null, 16646009);
        ot7 ot7VarA7 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.k, 0L, h67.k(13), null, null, 0L, 0L, null, 16777213);
        ot7 ot7VarA8 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.n, 0L, h67.k(11), ms2Var, null, 0L, 0L, null, 16777209);
        ot7 ot7VarA9 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.f952o, 0L, h67.k(10), null, null, 0L, 0L, null, 16777213);
        ot7 ot7VarA10 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.g, 0L, h67.k(22), ms2.q, null, 0L, 0L, p94.d, 15728633);
        ot7 ot7VarA11 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.k, 0L, h67.k(13), null, null, 0L, 0L, null, 16777213);
        ot7 ot7VarA12 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.k, 0L, h67.k(14), null, null, 0L, h67.h(1.5d), null, 16646141);
        ot7 ot7VarA13 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.m, 0L, h67.k(12), ms2Var, null, 0L, 0L, null, 16777209);
        ot7 ot7VarA14 = ot7.a(((rn4) ux2Var.j(zw5Var)).b.m, 0L, h67.k(12), ms2Var, null, 0L, 0L, null, 16777209);
        boolean zF = ux2Var.f(ot7VarA) | ux2Var.f(ot7VarA2) | ux2Var.f(ot7VarA3) | ux2Var.f(ot7VarA4) | ux2Var.f(ot7VarA5) | ux2Var.f(ot7VarA6) | ux2Var.f(ot7VarA7) | ux2Var.f(ot7VarA8) | ux2Var.f(ot7VarA9) | ux2Var.f(ot7VarA10) | ux2Var.f(ot7VarA11) | ux2Var.f(ot7VarA12) | ux2Var.f(ot7VarA13) | ux2Var.f(ot7VarA14);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            objK = new bm1(ot7VarA, ot7VarA2, ot7VarA3, ot7VarA4, ot7VarA5, ot7VarA6, ot7VarA7, ot7VarA8, ot7VarA9, ot7VarA10, ot7VarA11, ot7VarA12, ot7VarA13, ot7VarA14);
            ux2Var.g0(objK);
        }
        return (bm1) objK;
    }
}
