package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ik7 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final List b = Collections.synchronizedList(new ArrayList());
    public static int c = 10000;

    public static x02 a() {
        int i = c + 1;
        c = i;
        return new x02(i, 0);
    }

    public static void b(hk7 hk7Var, r02 r02Var) {
        hk7Var.getClass();
        ConcurrentHashMap concurrentHashMap = a;
        List arrayList = (List) concurrentHashMap.get(r02Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            concurrentHashMap.put(r02Var, arrayList);
        }
        if (arrayList.contains(hk7Var)) {
            return;
        }
        arrayList.add(hk7Var);
    }
}
