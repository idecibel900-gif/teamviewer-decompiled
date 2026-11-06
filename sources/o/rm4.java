package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rm4 {
    public static void a(Object obj, Object obj2) {
        pm4 pm4Var = (pm4) obj;
        if (obj2 != null) {
            io.sentry.h2.f();
            return;
        }
        if (pm4Var.isEmpty()) {
            return;
        }
        Iterator it = pm4Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static pm4 b(Object obj, Object obj2) {
        pm4 pm4VarC = (pm4) obj;
        pm4 pm4Var = (pm4) obj2;
        if (!pm4Var.isEmpty()) {
            if (!pm4VarC.m) {
                pm4VarC = pm4VarC.c();
            }
            pm4VarC.b();
            if (!pm4Var.isEmpty()) {
                pm4VarC.putAll(pm4Var);
            }
        }
        return pm4VarC;
    }
}
