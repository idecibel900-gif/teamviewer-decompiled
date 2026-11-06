package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class op {
    public static final LinkedHashMap c;
    public final ro3 a;
    public final ConcurrentHashMap b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (lp lpVar : lp.values()) {
            String str = lpVar.m;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, lpVar);
            }
        }
        c = linkedHashMap;
    }

    public op(ro3 ro3Var) {
        ro3Var.getClass();
        this.a = ro3Var;
        this.b = new ConcurrentHashMap();
    }

    public static ArrayList a(Object obj, boolean z) {
        hp hpVar = (hp) obj;
        hpVar.getClass();
        Map mapE = hpVar.e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapE.entrySet()) {
            qv0.c0(arrayList, (!z || im3.n((sy4) entry.getKey(), tr3.b)) ? j((u51) entry.getValue()) : ea2.m);
        }
        return arrayList;
    }

    public static Object c(Object obj, ht2 ht2Var) {
        for (Object obj2 : e(obj)) {
            if (im3.n(d(obj2), ht2Var)) {
                return obj2;
            }
        }
        return null;
    }

    public static ht2 d(Object obj) {
        hp hpVar = (hp) obj;
        hpVar.getClass();
        return hpVar.d();
    }

    public static Iterable e(Object obj) {
        up annotations;
        hp hpVar = (hp) obj;
        hpVar.getClass();
        ns4 ns4VarD = bp1.d(hpVar);
        return (ns4VarD == null || (annotations = ns4VarD.getAnnotations()) == null) ? ea2.m : annotations;
    }

    public static boolean f(Object obj, ht2 ht2Var) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (im3.n(d(it.next()), ht2Var)) {
                return true;
            }
        }
        return false;
    }

    public static List j(u51 u51Var) {
        if (!(u51Var instanceof bx)) {
            return u51Var instanceof oc2 ? qf0.K(((oc2) u51Var).c.c()) : ea2.m;
        }
        Iterable iterable = (Iterable) ((bx) u51Var).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qv0.c0(arrayList, j((u51) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:93:0x014a  */
    /* JADX WARN: Code duplicated, block: B:95:0x014e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final vo3 b(vo3 vo3Var, up upVar) {
        Object[] objArr;
        xn3 xn3Var;
        za6 za6VarH;
        xn3 xn3Var2;
        Object objC;
        Object next;
        vd5 vd5Var;
        int i;
        c65 c65VarA;
        ro3 ro3Var = this.a;
        boolean z = ro3Var.b;
        if (!z) {
            ArrayList<xn3> arrayList = new ArrayList();
            Iterator it = upVar.iterator();
            while (true) {
                objArr = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                za6 za6Var = za6.IGNORE;
                za6 za6Var2 = za6.WARN;
                xn3 xn3Var3 = null;
                if (z || (xn3Var = (xn3) yn3.e.get(d(next2))) == null) {
                    xn3Var2 = null;
                } else {
                    ht2 ht2VarD = d(next2);
                    if (ht2VarD == null || !yn3.c.containsKey(ht2VarD)) {
                        za6VarH = h(next2);
                        if (za6VarH == null) {
                            za6VarH = ro3Var.a.a;
                        }
                    } else {
                        za6VarH = (za6) qo3.n.invoke(ht2VarD);
                    }
                    if (za6VarH == za6Var) {
                        za6VarH = null;
                    }
                    if (za6VarH == null) {
                        xn3Var2 = null;
                    } else {
                        c65 c65VarA2 = c65.a(xn3Var.a, null, za6VarH == za6Var2, 1);
                        Collection collection = xn3Var.b;
                        boolean z2 = xn3Var.c;
                        collection.getClass();
                        xn3Var2 = new xn3(c65VarA2, collection, z2);
                    }
                }
                if (xn3Var2 != null) {
                    xn3Var3 = xn3Var2;
                } else {
                    if (ro3Var.a.d || (objC = c(next2, ur3.f)) == null) {
                        vd5Var = null;
                    } else {
                        Iterator it2 = e(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (i(next) == null);
                        if (next == null) {
                            vd5Var = null;
                        } else {
                            ArrayList arrayListA = a(objC, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = arrayListA.iterator();
                            while (it3.hasNext()) {
                                lp lpVar = (lp) c.get((String) it3.next());
                                if (lpVar != null) {
                                    linkedHashSet.add(lpVar);
                                }
                            }
                            if (linkedHashSet.contains(lp.TYPE_USE)) {
                                linkedHashSet = fv6.a0(fv6.Y(cx.h1(lp.values()), lp.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                            }
                            vd5Var = new vd5(next, linkedHashSet);
                        }
                    }
                    if (vd5Var != null) {
                        Object obj = vd5Var.m;
                        Set set = (Set) vd5Var.n;
                        za6 za6VarH2 = h(next2);
                        if (za6VarH2 == null && (za6VarH2 = h(obj)) == null) {
                            za6VarH2 = ro3Var.a.a;
                        }
                        if (za6VarH2 != za6Var) {
                            obj.getClass();
                            c65 c65VarG = g(obj, false);
                            if (c65VarG != null) {
                                c65VarA = c65VarG;
                            } else {
                                Object objI = i(obj);
                                if (objI != null) {
                                    za6 za6VarH3 = h(obj);
                                    if (za6VarH3 == null) {
                                        za6VarH3 = ro3Var.a.a;
                                    }
                                    if (za6VarH3 != za6Var) {
                                        c65 c65VarG2 = g(objI, false);
                                        if (c65VarG2 != null) {
                                            i = 1;
                                            c65VarA = c65.a(c65VarG2, null, za6VarH3 == za6Var2, 1);
                                        } else {
                                            i = 1;
                                            c65VarA = null;
                                        }
                                    }
                                    if (c65VarA != null) {
                                        xn3Var3 = new xn3(c65.a(c65VarA, null, za6VarH2 == za6Var2 ? i : 0, i), set);
                                    }
                                }
                                c65VarA = null;
                            }
                            i = 1;
                            if (c65VarA != null) {
                                xn3Var3 = new xn3(c65.a(c65VarA, null, za6VarH2 == za6Var2 ? i : 0, i), set);
                            }
                        }
                    }
                }
                if (xn3Var3 != null) {
                    arrayList.add(xn3Var3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(lp.class);
                for (xn3 xn3Var4 : arrayList) {
                    for (lp lpVar2 : xn3Var4.b) {
                        enumMap.containsKey(lpVar2);
                        enumMap.put(lpVar2, xn3Var4);
                    }
                }
                EnumMap enumMap2 = vo3Var != null ? new EnumMap(vo3Var.a) : new EnumMap(lp.class);
                for (Map.Entry entry : enumMap.entrySet()) {
                    lp lpVar3 = (lp) entry.getKey();
                    xn3 xn3Var5 = (xn3) entry.getValue();
                    if (xn3Var5 != null) {
                        enumMap2.put(lpVar3, xn3Var5);
                        objArr = 1;
                    }
                }
                if (objArr != 0) {
                    return new vo3(enumMap2);
                }
            }
        }
        return vo3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r7.equals("ALWAYS") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r7.equals("UNKNOWN") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r7.equals("NEVER") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r7.equals("MAYBE") == false) goto L43;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.c65 g(java.lang.Object r8, boolean r9) {
        /*
            r7 = this;
            o.ht2 r7 = d(r8)
            r0 = 0
            if (r7 != 0) goto L9
            goto L8b
        L9:
            o.qo3 r1 = o.qo3.n
            java.lang.Object r1 = r1.invoke(r7)
            o.za6 r1 = (o.za6) r1
            r1.getClass()
            o.za6 r2 = o.za6.IGNORE
            if (r1 != r2) goto L19
            return r0
        L19:
            java.util.Set r2 = o.ur3.k
            boolean r2 = r2.contains(r7)
            o.b65 r3 = o.b65.f402o
            r4 = 0
            if (r2 == 0) goto L25
            goto L7d
        L25:
            java.util.Set r2 = o.ur3.l
            boolean r2 = r2.contains(r7)
            o.b65 r5 = o.b65.n
            if (r2 == 0) goto L31
        L2f:
            r3 = r5
            goto L7d
        L31:
            java.util.Set r2 = o.ur3.m
            boolean r2 = r2.contains(r7)
            o.b65 r6 = o.b65.m
            if (r2 == 0) goto L3d
        L3b:
            r3 = r6
            goto L7d
        L3d:
            o.ht2 r2 = o.ur3.g
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L8b
            java.util.ArrayList r7 = a(r8, r4)
            java.lang.Object r7 = o.lv0.n0(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L7d
            int r8 = r7.hashCode()
            switch(r8) {
                case 73135176: goto L74;
                case 74175084: goto L6b;
                case 433141802: goto L62;
                case 1933739535: goto L59;
                default: goto L58;
            }
        L58:
            goto L8b
        L59:
            java.lang.String r8 = "ALWAYS"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L8b
            goto L7d
        L62:
            java.lang.String r8 = "UNKNOWN"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L3b
            goto L8b
        L6b:
            java.lang.String r8 = "NEVER"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L2f
            goto L8b
        L74:
            java.lang.String r8 = "MAYBE"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L2f
            goto L8b
        L7d:
            o.c65 r7 = new o.c65
            o.za6 r8 = o.za6.WARN
            if (r1 != r8) goto L84
            goto L86
        L84:
            if (r9 == 0) goto L87
        L86:
            r4 = 1
        L87:
            r7.<init>(r3, r4)
            return r7
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.op.g(java.lang.Object, boolean):o.c65");
    }

    public final za6 h(Object obj) {
        String str;
        rr3 rr3Var = this.a.a;
        za6 za6Var = (za6) rr3Var.c.get(d(obj));
        if (za6Var != null) {
            return za6Var;
        }
        Object objC = c(obj, ur3.q);
        if (objC == null || (str = (String) lv0.n0(a(objC, false))) == null) {
            return null;
        }
        za6 za6Var2 = rr3Var.b;
        if (za6Var2 != null) {
            return za6Var2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return za6.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return za6.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return za6.WARN;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object objI;
        obj.getClass();
        if (!this.a.a.d) {
            if (lv0.h0(ur3.j, d(obj)) || f(obj, ur3.d)) {
                return obj;
            }
            if (f(obj, ur3.e)) {
                ns4 ns4VarD = bp1.d((hp) obj);
                ns4VarD.getClass();
                ConcurrentHashMap concurrentHashMap = this.b;
                Object obj2 = concurrentHashMap.get(ns4VarD);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = e(obj).iterator();
                do {
                    if (!it.hasNext()) {
                        objI = null;
                        break;
                    }
                    objI = i(it.next());
                } while (objI == null);
                if (objI != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(ns4VarD, objI);
                    return objPutIfAbsent == null ? objI : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
