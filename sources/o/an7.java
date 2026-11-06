package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class an7 implements qu4 {
    public final /* synthetic */ bn7 a;

    public an7(bn7 bn7Var) {
        this.a = bn7Var;
    }

    @Override // o.qu4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        int i = r61.i(j);
        int size = list2.size();
        i76 i76Var = new i76();
        if (size > 0) {
            i76Var.m = i / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            numValueOf = Integer.valueOf(Math.max(((zn4) list2.get(i2)).a(i76Var.m), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            w32 w32Var = new w32(fo4Var.O(Math.min(((zn4) list2.get(i3)).o(iIntValue), i76Var.m)) - (nm7.b * 2.0f));
            w32 w32Var2 = new w32(24.0f);
            if (w32Var.compareTo(w32Var2) < 0) {
                w32Var = w32Var2;
            }
            arrayList2.add(new wm7(fo4Var.O(i76Var.m) * i3, fo4Var.O(i76Var.m), w32Var.m));
        }
        this.a.a.setValue(arrayList2);
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            zn4 zn4Var = (zn4) list2.get(i4);
            int i5 = i76Var.m;
            arrayList3.add(zn4Var.C(r61.a(i5, i5, iIntValue, iIntValue)));
        }
        ArrayList arrayList4 = new ArrayList(list3.size());
        int i6 = 0;
        for (int size4 = list3.size(); i6 < size4; size4 = size4) {
            arrayList4.add(((zn4) list3.get(i6)).C(r61.b(j, 0, 0, 0, 0, 11)));
            i6++;
        }
        ArrayList arrayList5 = new ArrayList(list4.size());
        int size5 = list4.size();
        for (int i7 = 0; i7 < size5; i7++) {
            zn4 zn4Var2 = (zn4) list4.get(i7);
            int i8 = i76Var.m;
            arrayList5.add(zn4Var2.C(r61.a(i8, i8, 0, iIntValue)));
        }
        return fo4Var.u(i, iIntValue, fa2.m, new jw0(arrayList3, arrayList4, arrayList5, i76Var, iIntValue));
    }
}
