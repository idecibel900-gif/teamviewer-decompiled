package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class pp6 {
    public static final Comparator[] a;
    public static final jp6 b;

    static {
        byte b2 = 2;
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new ix0(new ix0(i == 0 ? gj2.s : gj2.p, b2), (byte) 3);
            i++;
        }
        a = comparatorArr;
        b = new jp6((byte) 14);
    }

    public static final void a(fp6 fp6Var, ArrayList arrayList, q0 q0Var, q0 q0Var2, kw4 kw4Var) {
        ap6 ap6Var = fp6Var.d;
        Object objG = ap6Var.m.g(kp6.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) q0Var2.invoke(fp6Var)).booleanValue()) && ((Boolean) q0Var.invoke(fp6Var)).booleanValue()) {
            arrayList.add(fp6Var);
        }
        if (zBooleanValue) {
            kw4Var.i(fp6Var.f, b(fp6Var, q0Var, q0Var2, fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0)));
            return;
        }
        List listI = fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0);
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            a((fp6) listI.get(i), arrayList, q0Var, q0Var2, kw4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    public static final ArrayList b(fp6 fp6Var, q0 q0Var, q0 q0Var2, List list) {
        int i;
        kw4 kw4Var = uk3.a;
        kw4 kw4Var2 = new kw4();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((fp6) list.get(i2), arrayList, q0Var, q0Var2, kw4Var2);
        }
        int i3 = 1;
        char c = fp6Var.c.M == j04.n ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                fp6 fp6Var2 = (fp6) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new vd5(fp6Var2.h(), qf0.N(fp6Var2)));
                    break;
                }
                float f = fp6Var2.h().b;
                float f2 = fp6Var2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        v56 v56Var = (v56) ((vd5) arrayList2.get(i6)).m;
                        float f3 = v56Var.b;
                        i = i3;
                        float f4 = v56Var.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new vd5(new v56(Math.max(v56Var.a, 0.0f), Math.max(v56Var.b, f), Math.min(v56Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((vd5) arrayList2.get(i6)).n));
                            ((List) ((vd5) arrayList2.get(i6)).n).add(fp6Var2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new vd5(fp6Var2.h(), qf0.N(fp6Var2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        pv0.b0(arrayList2, gj2.t);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            vd5 vd5Var = (vd5) arrayList2.get(i8);
            pv0.b0((List) vd5Var.n, comparator);
            arrayList3.addAll((Collection) vd5Var.n);
        }
        pv0.b0(arrayList3, new hk((byte) 9));
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) kw4Var2.b(((fp6) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) q0Var2.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
