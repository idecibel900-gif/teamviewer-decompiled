package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface do4 {
    default int a(bm3 bm3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new fk1((zn4) list.get(i2), cm3.m, fm3.m, b));
        }
        return c(new nm3(bm3Var, ((e45) bm3Var).G.M), arrayList, t61.b(0, 0, 0, i, 7)).b();
    }

    default int b(bm3 bm3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new fk1((zn4) list.get(i2), cm3.n, fm3.m, b));
        }
        return c(new nm3(bm3Var, ((e45) bm3Var).G.M), arrayList, t61.b(0, 0, 0, i, 7)).b();
    }

    eo4 c(fo4 fo4Var, List list, long j);

    default int d(bm3 bm3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new fk1((zn4) list.get(i2), cm3.n, fm3.n, b));
        }
        return c(new nm3(bm3Var, ((e45) bm3Var).G.M), arrayList, t61.b(0, i, 0, 0, 13)).a();
    }

    default int e(bm3 bm3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new fk1((zn4) list.get(i2), cm3.m, fm3.n, b));
        }
        return c(new nm3(bm3Var, ((e45) bm3Var).G.M), arrayList, t61.b(0, i, 0, 0, 13)).a();
    }
}
