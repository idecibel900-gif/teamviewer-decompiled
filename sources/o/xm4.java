package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class xm4 extends nv1 {
    public static Object P(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int Q(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map R(vd5... vd5VarArr) {
        if (vd5VarArr.length <= 0) {
            return fa2.m;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q(vd5VarArr.length));
        T(linkedHashMap, vd5VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap S(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void T(HashMap map, vd5[] vd5VarArr) {
        for (vd5 vd5Var : vd5VarArr) {
            map.put(vd5Var.m, vd5Var.n);
        }
    }

    public static Map U(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return fa2.m;
        }
        if (size == 1) {
            vd5 vd5Var = (vd5) arrayList.get(0);
            vd5Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(vd5Var.m, vd5Var.n);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vd5 vd5Var2 = (vd5) it.next();
            linkedHashMap.put(vd5Var2.m, vd5Var2.n);
        }
        return linkedHashMap;
    }

    public static Map V(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return fa2.m;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
