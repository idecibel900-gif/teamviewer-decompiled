package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class cu5 {
    public fi1 a;
    public as4 b;
    public cp1 c;
    public int e;
    public final v14 h;
    public final sy4 i;
    public final oz3 j;
    public final /* synthetic */ du5 k;
    public bu5 d = null;
    public k58 f = k58.a;
    public boolean g = true;

    public cu5(du5 du5Var) {
        this.k = du5Var;
        this.a = du5Var.i();
        this.b = du5Var.r();
        this.c = du5Var.e();
        this.e = du5Var.k();
        this.h = du5Var.F;
        this.i = du5Var.getName();
        this.j = du5Var.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [o.ju5, o.xw2, o.zt5] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [o.eu5] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [o.ju5] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20, types: [o.eu5, o.zt5] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r4v10, types: [o.xi2] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [o.oz3] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r6v12, types: [o.xi2] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.bu5, o.du5, o.fi1, o.xi0] */
    public final du5 a() {
        v14 v14Var;
        v14 v14Var2;
        ?? eu5Var;
        ?? ju5Var;
        m58 m58Var;
        Function0 function0;
        v14 v14Var3;
        v14 v14Var4;
        oz3 oz3VarH;
        fi1 fi1Var = this.a;
        as4 as4Var = this.b;
        cp1 cp1Var = this.c;
        bu5 bu5Var = this.d;
        int i = this.e;
        sy4 sy4Var = this.i;
        du5 du5Var = this.k;
        ?? F0 = du5Var.F0(fi1Var, as4Var, cp1Var, bu5Var, i, sy4Var);
        List typeParameters = du5Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        m58 m58VarY = xo1.Y(typeParameters, this.f, F0, arrayList);
        oz3 oz3Var = this.j;
        ub8 ub8Var = ub8.q;
        oz3 oz3VarH2 = m58VarY.h(oz3Var, ub8Var);
        v14 v14Var5 = null;
        if (oz3VarH2 != null) {
            ub8 ub8Var2 = ub8.p;
            oz3 oz3VarH3 = m58VarY.h(oz3Var, ub8Var2);
            if (oz3VarH3 != null) {
                F0.J0(oz3VarH3);
            }
            v14 v14Var6 = this.h;
            if (v14Var6 != null) {
                v14 v14VarD = v14Var6.d(m58VarY);
                if (v14VarD != null) {
                    v14Var = v14VarD;
                }
            } else {
                v14Var = null;
            }
            v14 v14Var7 = du5Var.G;
            if (v14Var7 == null || (oz3VarH = m58VarY.h(v14Var7.getType(), ub8Var2)) == null) {
                v14Var2 = null;
            } else {
                v14Var7.D0();
                v14Var2 = new v14(F0, new yf2(F0, oz3VarH), v14Var7.getAnnotations());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = du5Var.E.iterator();
            while (it.hasNext()) {
                v14 v14Var8 = (v14) it.next();
                oz3 oz3VarH4 = m58VarY.h(v14Var8.getType(), ub8Var2);
                if (oz3VarH4 == null) {
                    v14Var3 = v14Var5;
                    v14Var4 = v14Var3;
                } else {
                    v14Var4 = v14Var5;
                    sy4 sy4VarB0 = ((xb1) v14Var8.D0()).B0();
                    v14Var8.D0();
                    v14Var3 = new v14(F0, new xb1((xi0) F0, oz3VarH4, sy4VarB0), v14Var8.getAnnotations());
                }
                if (v14Var3 != null) {
                    arrayList2.add(v14Var3);
                }
                it = it;
                v14Var5 = v14Var4;
            }
            ?? r19 = v14Var5;
            F0.K0(oz3VarH2, arrayList, v14Var, v14Var2, arrayList2);
            eu5 eu5Var2 = du5Var.I;
            ol5 ol5Var = s67.h;
            if (eu5Var2 == null) {
                eu5Var = r19;
            } else {
                up annotations = eu5Var2.getAnnotations();
                as4 as4Var2 = this.b;
                cp1 cp1VarE = du5Var.I.e();
                if (this.e == 2 && dp1.e(dp1.f(cp1VarE.a.m()))) {
                    cp1VarE = dp1.h;
                }
                cp1 cp1Var2 = cp1VarE;
                eu5 eu5Var3 = du5Var.I;
                boolean z = eu5Var3.q;
                boolean z2 = eu5Var3.r;
                boolean z3 = eu5Var3.u;
                int i2 = this.e;
                bu5 bu5Var2 = this.d;
                eu5Var = new eu5(F0, annotations, as4Var2, cp1Var2, z, z2, z3, i2, bu5Var2 == null ? r19 : bu5Var2.getGetter(), ol5Var);
            }
            if (eu5Var != 0) {
                eu5 eu5Var4 = du5Var.I;
                oz3 oz3Var2 = eu5Var4.y;
                eu5Var.x = du5.G0(m58VarY, eu5Var4);
                eu5Var.F0(oz3Var2 != null ? m58VarY.h(oz3Var2, ub8Var) : r19);
            }
            ju5 ju5Var2 = du5Var.J;
            if (ju5Var2 == null) {
                ju5Var = r19;
            } else {
                up annotations2 = ju5Var2.getAnnotations();
                as4 as4Var3 = this.b;
                cp1 cp1VarE2 = du5Var.J.e();
                if (this.e == 2 && dp1.e(dp1.f(cp1VarE2.a.m()))) {
                    cp1VarE2 = dp1.h;
                }
                cp1 cp1Var3 = cp1VarE2;
                ju5 ju5Var3 = du5Var.J;
                boolean z4 = ju5Var3.q;
                boolean z5 = ju5Var3.r;
                boolean z6 = ju5Var3.u;
                int i3 = this.e;
                bu5 bu5Var3 = this.d;
                ju5Var = new ju5(F0, annotations2, as4Var3, cp1Var3, z4, z5, z6, i3, bu5Var3 == null ? r19 : bu5Var3.b(), ol5Var);
            }
            if (ju5Var != 0) {
                m58Var = m58VarY;
                List listG0 = zw2.G0(ju5Var, du5Var.J.J(), m58Var, false, false, null);
                if (listG0 == null) {
                    listG0 = Collections.singletonList(ju5.E0(ju5Var, bp1.e(this.a).n(), ((qb8) du5Var.J.J().get(0)).getAnnotations()));
                }
                if (listG0.size() != 1) {
                    throw new IllegalStateException();
                }
                ju5Var.x = du5.G0(m58Var, du5Var.J);
                qb8 qb8Var = (qb8) listG0.get(0);
                if (qb8Var == null) {
                    ju5.z(6);
                    throw r19;
                }
                ju5Var.y = qb8Var;
            } else {
                m58Var = m58VarY;
            }
            xi2 xi2Var = du5Var.K;
            ?? xi2Var2 = xi2Var == null ? r19 : new xi2(xi2Var.getAnnotations(), F0);
            xi2 xi2Var3 = du5Var.L;
            F0.H0(eu5Var, ju5Var, xi2Var2, xi2Var3 == null ? r19 : new xi2(xi2Var3.getAnnotations(), F0));
            if (this.g) {
                v17 v17Var = new v17();
                Iterator it2 = du5Var.j().iterator();
                while (it2.hasNext()) {
                    v17Var.add(((bu5) it2.next()).d(m58Var));
                }
                F0.w = v17Var;
            }
            if (du5Var.s() && (function0 = du5Var.t) != null) {
                F0.I0(du5Var.s, function0);
            }
            return F0;
        }
        return null;
    }
}
