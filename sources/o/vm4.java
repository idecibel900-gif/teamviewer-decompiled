package o;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vm4 implements h84 {
    public final LinkedHashMap a;

    public vm4(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(xm4.Q(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        this.a = linkedHashMap;
    }

    @Override // o.h84
    public final rv0 a(String str) {
        if (str == null || ub7.b0(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return (rv0) this.a.get(lowerCase);
    }
}
