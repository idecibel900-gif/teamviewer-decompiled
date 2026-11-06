package o;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ax4 extends ab5 {
    public final void a(h00 h00Var, Object obj) {
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(h00Var);
        d21 d21Var = d21.m;
        if (map != null) {
            Objects.equals(map.get((d21) Collections.min(map.keySet())), obj);
            map.put(d21Var, obj);
        } else {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(h00Var, arrayMap);
            arrayMap.put(d21Var, obj);
        }
    }
}
