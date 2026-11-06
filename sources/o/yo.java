package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class yo {
    public static final xo a = new xo("");

    public static final List a(xo xoVar, int i, int i2, t2 t2Var) {
        List list;
        if (i == i2 || (list = xoVar.m) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= xoVar.n.length()) {
            if (t2Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) t2Var.invoke(((wo) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            wo woVar = (wo) list.get(i3);
            if (t2Var != null ? ((Boolean) t2Var.invoke(woVar.a)).booleanValue() : true) {
                int i4 = woVar.b;
                int i5 = woVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new wo((to) woVar.a, ct1.v(woVar.b, i, i2) - i, ct1.v(i5, i, i2) - i, woVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
