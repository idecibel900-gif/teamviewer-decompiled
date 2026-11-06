package o;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class pg1 {
    public static final pg1 b;
    public final HashMap a;

    static {
        pg1 pg1Var = new pg1(new LinkedHashMap());
        qf0.V(pg1Var);
        b = pg1Var;
    }

    public pg1(pg1 pg1Var) {
        pg1Var.getClass();
        this.a = new HashMap(pg1Var.a);
    }

    public final boolean a(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && pg1.class.equals(obj.getClass())) {
                HashMap map = ((pg1) obj).a;
                HashMap map2 = this.a;
                Set<String> setKeySet = map2.keySet();
                if (im3.n(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = cx.D0(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return e41.l(new StringBuilder("Data {"), lv0.t0(this.a.entrySet(), null, null, null, new h31((byte) 14), 31), "}");
    }

    public pg1(LinkedHashMap linkedHashMap) {
        this.a = new HashMap(linkedHashMap);
    }
}
