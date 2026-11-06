package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wb6 {
    public static final ub6 a = new ub6();
    public static final h72 b = new h72(new w26((byte) 9), (byte) 1);

    static {
        int i = vb6.n;
    }

    public static final ArrayList a(ArrayList arrayList, my5 my5Var) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Set set = ((zb6) obj).a;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (im3.n((my5) it.next(), my5Var)) {
                        arrayList2.add(obj);
                        break;
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            Set set2 = ((zb6) obj2).a;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (((my5) it2.next()).getClass() != my5Var.getClass());
            }
            arrayList3.add(obj2);
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f3 A[PHI: r0
      0x00f3: PHI (r0v18 java.util.ArrayList) = (r0v12 java.util.ArrayList), (r0v14 java.util.ArrayList), (r0v17 java.util.ArrayList) binds: [B:53:0x00f1, B:71:0x013e, B:76:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Iterable, java.util.List] */
    public static final zb6 b(f62 f62Var, tb6 tb6Var) {
        my5 my5Var;
        f62Var.getClass();
        tb6Var.getClass();
        List listP0 = lv0.P0(f62Var.b);
        zz3 zz3Var = tb6Var.a;
        qj6 qj6Var = tb6Var.b;
        f96 f96Var = tb6Var.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP0) {
            Set set = ((zb6) obj).a;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                do {
                    if (it.hasNext()) {
                        my5Var = (my5) it.next();
                        if ((my5Var instanceof zz3) || (my5Var instanceof qj6)) {
                            break;
                        }
                    }
                } while (!(my5Var instanceof f96));
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listP0) {
            Set set2 = ((zb6) obj2).a;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (im3.n((my5) it2.next(), zz3Var)) {
                        arrayList2.add(obj2);
                        break;
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                Set set3 = ((zb6) obj3).a;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator it3 = set3.iterator();
                    while (it3.hasNext()) {
                        if (im3.n((my5) it3.next(), qj6Var)) {
                            arrayList3.add(obj3);
                            break;
                        }
                    }
                }
            }
            ArrayList arrayListA = a(arrayList3, f96Var);
            if (arrayListA.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    Set set4 = ((zb6) obj4).a;
                    if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                        Iterator it4 = set4.iterator();
                        do {
                            if (it4.hasNext()) {
                            }
                        } while (!(((my5) it4.next()) instanceof qj6));
                    }
                    arrayList4.add(obj4);
                }
                arrayListA = a(arrayList4, f96Var);
                if (!arrayListA.isEmpty()) {
                    arrayList = arrayListA;
                } else if (qj6Var.m.length() == 0) {
                    arrayListA = a(arrayList2, f96Var);
                    if (!arrayListA.isEmpty()) {
                        arrayList = arrayListA;
                    }
                }
            } else {
                arrayList = arrayListA;
            }
        }
        if (arrayList.size() == 1) {
            return (zb6) lv0.m0(arrayList);
        }
        ArrayList arrayListA2 = a(arrayList, tb6Var.d);
        if (arrayListA2.size() == 1) {
            return (zb6) lv0.m0(arrayListA2);
        }
        short s = tb6Var.e.m;
        ArrayList arrayList5 = new ArrayList();
        jc2 jc2Var = mn1.v;
        for (Object obj5 : jc2Var) {
            if (((mn1) obj5).m >= s) {
                arrayList5.add(obj5);
            }
        }
        ?? arrayList6 = ea2.m;
        for (mn1 mn1Var : lv0.J0(arrayList5, new gj2((byte) 27))) {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj6 : arrayListA2) {
                Set set5 = ((zb6) obj6).a;
                if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                    Iterator it5 = set5.iterator();
                    while (it5.hasNext()) {
                        if (((my5) it5.next()) == mn1Var) {
                            arrayList7.add(obj6);
                            break;
                        }
                    }
                }
            }
            if (!arrayList7.isEmpty()) {
                arrayList6 = arrayList7;
                break;
            }
            arrayList6 = arrayList7;
        }
        if (arrayList6.isEmpty()) {
            mn1 mn1Var2 = mn1.LDPI;
            ArrayList arrayListX0 = lv0.x0(mn1Var2, jc2Var);
            ArrayList arrayList8 = new ArrayList();
            for (Object obj7 : arrayListX0) {
                if (((mn1) obj7).m < s) {
                    arrayList8.add(obj7);
                }
            }
            for (mn1 mn1Var3 : lv0.J0(arrayList8, new gj2((byte) 28))) {
                arrayList6 = new ArrayList();
                for (Object obj8 : arrayListA2) {
                    Set set6 = ((zb6) obj8).a;
                    if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                        Iterator it6 = set6.iterator();
                        while (it6.hasNext()) {
                            if (((my5) it6.next()) == mn1Var3) {
                                arrayList6.add(obj8);
                                break;
                            }
                        }
                    }
                }
                if (!arrayList6.isEmpty()) {
                    break;
                }
            }
            if (arrayList6.isEmpty()) {
                arrayList6 = new ArrayList();
                for (Object obj9 : arrayListA2) {
                    Set set7 = ((zb6) obj9).a;
                    if (!(set7 instanceof Collection) || !set7.isEmpty()) {
                        Iterator it7 = set7.iterator();
                        do {
                            if (it7.hasNext()) {
                            }
                        } while (!(((my5) it7.next()) instanceof mn1));
                    }
                    arrayList6.add(obj9);
                }
                if (arrayList6.isEmpty()) {
                    arrayList6 = new ArrayList();
                    for (Object obj10 : arrayListA2) {
                        Set set8 = ((zb6) obj10).a;
                        if (!(set8 instanceof Collection) || !set8.isEmpty()) {
                            Iterator it8 = set8.iterator();
                            while (it8.hasNext()) {
                                if (((my5) it8.next()) == mn1Var2) {
                                    arrayList6.add(obj10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        ?? r6 = arrayList6;
        if (r6.size() == 1) {
            return (zb6) lv0.m0(r6);
        }
        boolean zIsEmpty = r6.isEmpty();
        String str = f62Var.a;
        if (zIsEmpty) {
            an4.h(str, "' not found", "Resource with ID='");
            return null;
        }
        an4.v("Resource with ID='", str, "' has more than one file: ", lv0.t0(r6, null, null, null, new le5((byte) 14), 31));
        return null;
    }
}
