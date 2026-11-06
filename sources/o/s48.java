package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s48 {
    public final LinkedHashMap a;

    public s48(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final s48 a() {
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(xm4.Q(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            uo3 uo3Var = (uo3) entry.getValue();
            linkedHashMap2.put(key, new uo3(uo3Var.a, uo3Var.b, uo3Var.c, true));
        }
        return new s48(linkedHashMap2);
    }
}
