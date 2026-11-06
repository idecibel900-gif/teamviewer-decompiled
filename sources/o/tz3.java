package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class tz3 {
    public static final tz3 a = new tz3();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.zl3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.zl3] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [o.d58] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static g07 b(g07 g07Var) {
        oz3 oz3VarB;
        k48 k48VarO0 = g07Var.o0();
        ?? r4 = 0;
        m98 m98VarG = null;
        if (k48VarO0 instanceof yl0) {
            yl0 yl0Var = (yl0) k48VarO0;
            h58 h58Var = yl0Var.a;
            h58 h58Var2 = h58Var.a() == ub8.p ? h58Var : null;
            m98 m98VarR0 = (h58Var2 == null || (oz3VarB = h58Var2.b()) == null) ? null : oz3VarB.r0();
            i35 i35Var = yl0Var.b;
            if (i35Var == null) {
                Collection collectionB = yl0Var.b();
                ArrayList arrayList = new ArrayList(mv0.Z(collectionB, 10));
                Iterator it = collectionB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((oz3) it.next()).r0());
                }
                i35Var = new i35(h58Var, new kp1(arrayList, (byte) 1), (d58) r4, 8);
                yl0Var.b = i35Var;
            }
            return new h35(ul0.m, i35Var, m98VarR0, g07Var.n0(), g07Var.p0(), 32);
        }
        if (!(k48VarO0 instanceof zl3) || !g07Var.p0()) {
            return g07Var;
        }
        ?? r0 = (zl3) k48VarO0;
        LinkedHashSet<oz3> linkedHashSet = r0.b;
        ArrayList arrayList2 = new ArrayList(mv0.Z(linkedHashSet, 10));
        boolean z = false;
        for (oz3 oz3Var : linkedHashSet) {
            oz3Var.getClass();
            m98 m98VarG2 = p58.g(oz3Var);
            m98VarG2.getClass();
            arrayList2.add(m98VarG2);
            z = true;
        }
        if (z) {
            oz3 oz3Var2 = r0.a;
            if (oz3Var2 != null) {
                m98VarG = p58.g(oz3Var2);
                m98VarG.getClass();
            }
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            zl3 zl3Var = new zl3(linkedHashSet2);
            zl3Var.a = m98VarG;
            r4 = zl3Var;
        }
        if (r4 != 0) {
            r0 = r4;
        }
        return r0.e();
    }

    public final m98 a(sz3 sz3Var) {
        m98 m98VarV;
        sz3Var.getClass();
        if (!(sz3Var instanceof oz3)) {
            hk0.g("Failed requirement.");
            return null;
        }
        m98 m98VarR0 = ((oz3) sz3Var).r0();
        if (m98VarR0 instanceof g07) {
            m98VarV = b((g07) m98VarR0);
        } else {
            if (!(m98VarR0 instanceof um2)) {
                gk0.s();
                return null;
            }
            um2 um2Var = (um2) m98VarR0;
            g07 g07Var = um2Var.f2226o;
            g07 g07Var2 = um2Var.n;
            g07 g07VarB = b(g07Var2);
            g07 g07VarB2 = b(g07Var);
            m98VarV = (g07VarB == g07Var2 && g07VarB2 == g07Var) ? m98VarR0 : bt1.v(g07VarB, g07VarB2);
        }
        cg0 cg0Var = new cg0((byte) 4, 1, this);
        oz3 oz3VarJ = x37.j(m98VarR0);
        return x37.u(m98VarV, oz3VarJ != null ? (oz3) cg0Var.invoke(oz3VarJ) : null);
    }
}
