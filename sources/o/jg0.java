package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jg0 {
    public static final Map a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    static {
        it2 it2Var = s87.j;
        vd5 vd5Var = new vd5(it2Var.b(sy4.e("name")).g(), t87.d);
        vd5 vd5Var2 = new vd5(it2Var.b(sy4.e("ordinal")).g(), sy4.e("ordinal"));
        vd5 vd5Var3 = new vd5(s87.C.c(sy4.e("size")), sy4.e("size"));
        ht2 ht2Var = s87.G;
        Map mapR = xm4.R(vd5Var, vd5Var2, vd5Var3, new vd5(ht2Var.c(sy4.e("size")), sy4.e("size")), new vd5(s87.e.b(sy4.e("length")).g(), sy4.e("length")), new vd5(ht2Var.c(sy4.e("keys")), sy4.e("keySet")), new vd5(ht2Var.c(sy4.e("values")), sy4.e("values")), new vd5(ht2Var.c(sy4.e("entries")), sy4.e("entrySet")));
        a = mapR;
        Set<Map.Entry> setEntrySet = mapR.entrySet();
        ArrayList<vd5> arrayList = new ArrayList(mv0.Z(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new vd5(((ht2) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (vd5 vd5Var4 : arrayList) {
            sy4 sy4Var = (sy4) vd5Var4.n;
            Object arrayList2 = linkedHashMap.get(sy4Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(sy4Var, arrayList2);
            }
            ((List) arrayList2).add((sy4) vd5Var4.m);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(xm4.Q(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), lv0.i0((Iterable) entry2.getValue()));
        }
        b = linkedHashMap2;
        Map map = a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str = mo3.a;
            it2 it2VarI = ((ht2) entry3.getKey()).e().i();
            it2VarI.getClass();
            js0 js0VarG = mo3.g(it2VarI);
            js0VarG.getClass();
            linkedHashSet.add(js0VarG.a().c((sy4) entry3.getValue()));
        }
        Set setKeySet = a.keySet();
        c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(mv0.Z(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ht2) it.next()).f());
        }
        d = lv0.T0(arrayList3);
    }
}
