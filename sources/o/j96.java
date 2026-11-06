package o;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class j96 {
    public static final Logger a = Logger.getLogger(j96.class.getName());
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e;

    static {
        new ConcurrentHashMap();
        e = new ConcurrentHashMap();
    }

    public static synchronized void a(Class cls, String str) {
        try {
            ConcurrentHashMap concurrentHashMap = b;
            if (concurrentHashMap.containsKey(str)) {
                i96 i96Var = (i96) concurrentHashMap.get(str);
                if (i96Var.a.getClass().equals(cls)) {
                    if (((Boolean) d.get(str)).booleanValue()) {
                        return;
                    }
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
                a.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + i96Var.a.getClass().getName() + ", cannot be re-registered with " + cls.getName());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized i96 b(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = b;
        if (!concurrentHashMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (i96) concurrentHashMap.get(str);
    }

    public static synchronized cx3 c(qx3 qx3Var) {
        nx3 nx3Var;
        sx3 sx3Var = b(qx3Var.n()).a;
        nx3Var = new nx3(sx3Var, (Class) sx3Var.c);
        if (!((Boolean) d.get(qx3Var.n())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + qx3Var.n());
        }
        return nx3Var.G(qx3Var.o());
    }

    public static synchronized void d(sx3 sx3Var) {
        try {
            String strB = sx3Var.b();
            a(sx3Var.getClass(), strB);
            ConcurrentHashMap concurrentHashMap = b;
            if (!concurrentHashMap.containsKey(strB)) {
                concurrentHashMap.put(strB, new i96(sx3Var));
                c.put(strB, new el5((byte) 4));
            }
            d.put(strB, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }
}
