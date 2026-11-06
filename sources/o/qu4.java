package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface qu4 {
    default int a(bm3 bm3Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new fk1((zn4) list2.get(i3), cm3.m, fm3.m, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new nm3(bm3Var, bm3Var.getLayoutDirection()), arrayList2, t61.b(0, 0, 0, i, 7)).b();
    }

    default int b(bm3 bm3Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new fk1((zn4) list2.get(i3), cm3.n, fm3.m, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new nm3(bm3Var, bm3Var.getLayoutDirection()), arrayList2, t61.b(0, 0, 0, i, 7)).b();
    }

    eo4 c(fo4 fo4Var, List list, long j);

    default int d(bm3 bm3Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new fk1((zn4) list2.get(i3), cm3.n, fm3.n, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new nm3(bm3Var, bm3Var.getLayoutDirection()), arrayList2, t61.b(0, i, 0, 0, 13)).a();
    }

    default int e(bm3 bm3Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new fk1((zn4) list2.get(i3), cm3.m, fm3.n, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new nm3(bm3Var, bm3Var.getLayoutDirection()), arrayList2, t61.b(0, i, 0, 0, 13)).a();
    }
}
