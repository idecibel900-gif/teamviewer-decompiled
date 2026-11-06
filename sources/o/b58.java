package o;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b58 {
    public static final b58 a = new b58();

    public static ArrayList a(AbstractCollection abstractCollection, hw2 hw2Var) {
        ArrayList<g07> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            g07 g07Var = (g07) it.next();
            if (!arrayList.isEmpty()) {
                for (g07 g07Var2 : arrayList) {
                    if (g07Var2 != g07Var) {
                        g07Var2.getClass();
                        g07Var.getClass();
                        if (((Boolean) hw2Var.invoke(g07Var2, g07Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, o.g48] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [o.g48] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v15, types: [o.g07] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, o.g07, o.oz3] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Set] */
    public final g07 b(ArrayList arrayList) {
        g07 g07VarE;
        arrayList.size();
        ArrayList<g07> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g07 g07Var = (g07) it.next();
            if (g07Var.o0() instanceof zl3) {
                Collection collectionB = g07Var.o0().b();
                collectionB.getClass();
                Collection<oz3> collection = collectionB;
                ArrayList arrayList3 = new ArrayList(mv0.Z(collection, 10));
                for (oz3 oz3Var : collection) {
                    oz3Var.getClass();
                    g07 g07VarV = bt1.V(oz3Var);
                    if (g07Var.p0()) {
                        g07VarV = g07VarV.s0(true);
                    }
                    arrayList3.add(g07VarV);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(g07Var);
            }
        }
        Iterator it2 = arrayList2.iterator();
        z48 z48VarA = z48.m;
        while (it2.hasNext()) {
            z48VarA = z48VarA.a((m98) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (g07 g07VarS0 : arrayList2) {
            if (z48VarA == z48.p) {
                if (g07VarS0 instanceof h35) {
                    h35 h35Var = (h35) g07VarS0;
                    g07VarS0 = new h35(h35Var.n, h35Var.f947o, h35Var.p, h35Var.q, h35Var.r, true);
                }
                g07VarS0.getClass();
                g07 g07VarL = cr.l(g07VarS0, false);
                g07VarS0 = (g07VarL == null && (g07VarL = x37.r(g07VarS0)) == null) ? g07VarS0.s0(false) : g07VarL;
            }
            linkedHashSet.add(g07VarS0);
        }
        ArrayList arrayList4 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((g07) it3.next()).n0());
        }
        Iterator it4 = arrayList4.iterator();
        g07 g07Var2 = null;
        if (!it4.hasNext()) {
            yq4.r("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it4.next();
        while (it4.hasNext()) {
            g48 g48Var = (g48) it4.next();
            next = (g48) next;
            next.getClass();
            lh7 lh7Var = g48.n;
            g48Var.getClass();
            if (!next.isEmpty() || !g48Var.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) lh7Var.n).values();
                collectionValues.getClass();
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    xp xpVar = (xp) next.m.get(iIntValue);
                    xp xpVar2 = (xp) g48Var.m.get(iIntValue);
                    if (xpVar != null) {
                        if (!im3.n(xpVar2, xpVar)) {
                            xpVar = null;
                        }
                        xpVar2 = xpVar;
                    } else if (xpVar2 == null || !im3.n(xpVar, xpVar2)) {
                        xpVar2 = null;
                    }
                    if (xpVar2 != null) {
                        arrayList5.add(xpVar2);
                    }
                }
                next = lh7.n(arrayList5);
            }
        }
        g48 g48Var2 = (g48) next;
        if (linkedHashSet.size() == 1) {
            g07VarE = (g07) lv0.E0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new a58((byte) 0, 2, this));
            arrayListA.isEmpty();
            if (!arrayListA.isEmpty()) {
                Iterator it6 = arrayListA.iterator();
                if (!it6.hasNext()) {
                    yq4.r("Empty collection can't be reduced.");
                    return null;
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    g07 g07Var3 = (g07) it6.next();
                    next2 = (g07) next2;
                    if (next2 != 0 && g07Var3 != null) {
                        k48 k48VarO0 = next2.o0();
                        k48 k48VarO1 = g07Var3.o0();
                        boolean z = k48VarO0 instanceof gl3;
                        if (z && (k48VarO1 instanceof gl3)) {
                            Set set = ((gl3) k48VarO0).a;
                            Set set2 = ((gl3) k48VarO1).a;
                            set.getClass();
                            set2.getClass();
                            Set setS0 = lv0.S0(set);
                            qv0.c0(setS0, set2);
                            gl3 gl3Var = new gl3(setS0);
                            g48.n.getClass();
                            g48 g48Var3 = g48.f858o;
                            g48Var3.getClass();
                            next2 = bt1.Q(ea2.m, hd2.a(dd2.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), g48Var3, gl3Var, false);
                        } else if (z) {
                            if (((gl3) k48VarO0).a.contains(g07Var3)) {
                                next2 = g07Var3;
                            }
                        } else if (!(k48VarO1 instanceof gl3) || !((gl3) k48VarO1).a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                g07Var2 = (g07) next2;
            }
            if (g07Var2 != null) {
                g07VarE = g07Var2;
            } else {
                p35.b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new a58((byte) 1, 2, o35.b));
                arrayListA2.isEmpty();
                g07VarE = arrayListA2.size() < 2 ? (g07) lv0.E0(arrayListA2) : new zl3(linkedHashSet).e();
            }
        }
        return g07VarE.u0(g48Var2);
    }
}
