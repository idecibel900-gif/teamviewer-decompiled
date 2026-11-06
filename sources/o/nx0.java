package o;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class nx0 {
    public static final LinkedHashSet a;

    static {
        Set<ps5> set = ps5.q;
        ArrayList arrayList = new ArrayList(mv0.Z(set, 10));
        for (ps5 ps5Var : set) {
            ps5Var.getClass();
            arrayList.add(t87.l.c(ps5Var.m));
        }
        ArrayList<ht2> arrayListB0 = lv0.B0(lv0.B0(lv0.B0(arrayList, s87.f.g()), s87.h.g()), s87.j.g());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ht2 ht2Var : arrayListB0) {
            ht2Var.getClass();
            ht2 ht2VarE = ht2Var.e();
            sy4 sy4VarF = ht2Var.f();
            sy4VarF.getClass();
            linkedHashSet.add(new js0(ht2VarE, sy4VarF));
        }
        a = linkedHashSet;
    }
}
