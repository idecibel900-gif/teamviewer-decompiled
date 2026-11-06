package o;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kt3 {
    public static final dg2 a;

    static {
        dg2 dg2Var = new dg2();
        dg2Var.a(jt3.a);
        dg2Var.a(jt3.b);
        dg2Var.a(jt3.c);
        dg2Var.a(jt3.d);
        dg2Var.a(jt3.e);
        dg2Var.a(jt3.f);
        dg2Var.a(jt3.g);
        dg2Var.a(jt3.h);
        dg2Var.a(jt3.i);
        dg2Var.a(jt3.j);
        dg2Var.a(jt3.k);
        dg2Var.a(jt3.l);
        dg2Var.a(jt3.m);
        dg2Var.a(jt3.n);
        a = dg2Var;
    }

    public static os3 a(vu5 vu5Var, ty4 ty4Var, d22 d22Var) {
        String strT0;
        ty4Var.getClass();
        d22Var.getClass();
        my2 my2Var = jt3.a;
        my2Var.getClass();
        bt3 bt3Var = (bt3) it1.C(vu5Var, my2Var);
        String string = (bt3Var == null || (bt3Var.n & 1) != 1) ? "<init>" : ty4Var.getString(bt3Var.f453o);
        if (bt3Var == null || (bt3Var.n & 2) != 2) {
            List<iw5> list = vu5Var.q;
            list.getClass();
            ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
            for (iw5 iw5Var : list) {
                iw5Var.getClass();
                String strE = e(zu1.U(iw5Var, d22Var), ty4Var);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strT0 = lv0.t0(arrayList, "", "(", ")V", null, 56);
        } else {
            strT0 = ty4Var.getString(bt3Var.p);
        }
        return new os3(string, strT0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0044: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0046 A[HIDDEN]
          (r4v2 java.lang.String) from 0x0047: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0044, B:20:0x0035] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static o.ns3 b(o.qv5 r4, o.ty4 r5, o.d22 r6, boolean r7) {
        /*
            r5.getClass()
            o.my2 r0 = o.jt3.d
            r0.getClass()
            java.lang.Object r0 = o.it1.C(r4, r0)
            o.dt3 r0 = (o.dt3) r0
            r1 = 0
            if (r0 != 0) goto L12
            goto L46
        L12:
            int r2 = r0.n
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L1b
            o.at3 r0 = r0.f653o
            goto L1c
        L1b:
            r0 = r1
        L1c:
            if (r0 != 0) goto L21
            if (r7 == 0) goto L21
            goto L46
        L21:
            if (r0 == 0) goto L2b
            int r7 = r0.n
            r7 = r7 & r3
            if (r7 != r3) goto L2b
            int r7 = r0.f360o
            goto L2d
        L2b:
            int r7 = r4.r
        L2d:
            if (r0 == 0) goto L3c
            int r2 = r0.n
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L3c
            int r4 = r0.p
            java.lang.String r4 = r5.getString(r4)
            goto L47
        L3c:
            o.aw5 r4 = o.zu1.S(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L47
        L46:
            return r1
        L47:
            o.ns3 r6 = new o.ns3
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.kt3.b(o.qv5, o.ty4, o.d22, boolean):o.ns3");
    }

    public static os3 c(iv5 iv5Var, ty4 ty4Var, d22 d22Var) {
        String strConcat;
        ty4Var.getClass();
        d22Var.getClass();
        my2 my2Var = jt3.b;
        my2Var.getClass();
        bt3 bt3Var = (bt3) it1.C(iv5Var, my2Var);
        int i = (bt3Var == null || (bt3Var.n & 1) != 1) ? iv5Var.r : bt3Var.f453o;
        if (bt3Var == null || (bt3Var.n & 2) != 2) {
            int i2 = iv5Var.f1108o;
            List listM = qf0.M((i2 & 32) == 32 ? iv5Var.v : (i2 & 64) == 64 ? d22Var.a(iv5Var.w) : null);
            List<iw5> list = iv5Var.A;
            list.getClass();
            ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
            for (iw5 iw5Var : list) {
                iw5Var.getClass();
                arrayList.add(zu1.U(iw5Var, d22Var));
            }
            ArrayList arrayListA0 = lv0.A0(listM, arrayList);
            ArrayList arrayList2 = new ArrayList(mv0.Z(arrayListA0, 10));
            Iterator it = arrayListA0.iterator();
            while (it.hasNext()) {
                String strE = e((aw5) it.next(), ty4Var);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(zu1.R(iv5Var, d22Var), ty4Var);
            if (strE2 != null) {
                strConcat = lv0.t0(arrayList2, "", "(", ")", null, 56).concat(strE2);
            }
            return null;
        }
        strConcat = ty4Var.getString(bt3Var.p);
        return new os3(ty4Var.getString(i), strConcat);
    }

    public static final boolean d(qv5 qv5Var) {
        fm2 fm2Var = hs3.a;
        Object objK = qv5Var.k(jt3.e);
        objK.getClass();
        return fm2Var.i(((Number) objK).intValue()).booleanValue();
    }

    public static String e(aw5 aw5Var, ty4 ty4Var) {
        if ((aw5Var.f368o & 16) == 16) {
            return os0.b(ty4Var.a(aw5Var.u));
        }
        return null;
    }

    public static final vd5 f(String[] strArr, String[] strArr2) throws rm3 {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(j70.a(strArr));
        qs3 qs3VarG = g(byteArrayInputStream, strArr2);
        ys3 ys3Var = tu5.W;
        ys3Var.getClass();
        vu0 vu0Var = new vu0(byteArrayInputStream);
        t1 t1Var = (t1) ys3Var.b(vu0Var, a);
        try {
            vu0Var.a(0);
            if (t1Var.a()) {
                return new vd5(qs3VarG, (tu5) t1Var);
            }
            rm3 rm3Var = new rm3(new z78().getMessage());
            rm3Var.m = t1Var;
            throw rm3Var;
        } catch (rm3 e) {
            e.m = t1Var;
            throw e;
        }
    }

    public static qs3 g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        it3 it3Var = (it3) it3.t.a(byteArrayInputStream, a);
        it3Var.getClass();
        return new qs3(it3Var, strArr);
    }

    public static final vd5 h(String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(j70.a(strArr));
        qs3 qs3VarG = g(byteArrayInputStream, strArr2);
        ys3 ys3Var = mv5.x;
        ys3Var.getClass();
        vu0 vu0Var = new vu0(byteArrayInputStream);
        t1 t1Var = (t1) ys3Var.b(vu0Var, a);
        try {
            vu0Var.a(0);
            if (t1Var.a()) {
                return new vd5(qs3VarG, (mv5) t1Var);
            }
            rm3 rm3Var = new rm3(new z78().getMessage());
            rm3Var.m = t1Var;
            throw rm3Var;
        } catch (rm3 e) {
            e.m = t1Var;
            throw e;
        }
    }
}
