package o;

import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ts0 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public ts0(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            l84 l84Var = (l84) entry.getValue();
            List arrayList = (List) this.a.get(l84Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(l84Var, arrayList);
            }
            arrayList.add((us0) entry.getKey());
        }
    }

    public static void a(List list, LifecycleOwner lifecycleOwner, l84 l84Var, u84 u84Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                us0 us0Var = (us0) list.get(size);
                Method method = us0Var.b;
                try {
                    int i = us0Var.a;
                    if (i == 0) {
                        method.invoke(u84Var, null);
                    } else if (i == 1) {
                        method.invoke(u84Var, lifecycleOwner);
                    } else if (i == 2) {
                        method.invoke(u84Var, lifecycleOwner, l84Var);
                    }
                } catch (IllegalAccessException e) {
                    gk0.r(e);
                    return;
                } catch (InvocationTargetException e2) {
                    an4.n("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
