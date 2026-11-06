package o;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class va7 {
    static {
        rc[] rcVarArr = {new rc((byte) 0)};
        HashMap map = new HashMap();
        rc rcVar = rcVarArr[0];
        rcVar.getClass();
        if (map.containsKey(ua7.class)) {
            io.sentry.h2.h(ua7.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map.put(ua7.class, rcVar);
        rcVarArr[0].getClass();
        Collections.unmodifiableMap(map);
        rc[] rcVarArr2 = {new rc((byte) 1)};
        HashMap map2 = new HashMap();
        rc rcVar2 = rcVarArr2[0];
        rcVar2.getClass();
        if (map2.containsKey(ua7.class)) {
            io.sentry.h2.h(ua7.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map2.put(ua7.class, rcVar2);
        rcVarArr2[0].getClass();
        Collections.unmodifiableMap(map2);
        int i = k96.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        j96.d(new tc(oc.class, new rc[]{new rc((byte) 0)}, (byte) 0));
        j96.d(new tc(yc.class, new rc[]{new rc((byte) 1)}, (byte) 1));
        za7 za7Var = new za7();
        synchronized (j96.class) {
            try {
                ConcurrentHashMap concurrentHashMap = j96.e;
                if (concurrentHashMap.containsKey(ua7.class) && !za7.class.equals(((za7) concurrentHashMap.get(ua7.class)).getClass())) {
                    j96.a.warning("Attempted overwrite of a registered SetWrapper for type " + ua7.class);
                    throw new GeneralSecurityException("SetWrapper for primitive (" + ua7.class.getName() + ") is already registered to be " + za7.class.getName() + ", cannot be re-registered with " + za7.class.getName());
                }
                concurrentHashMap.put(ua7.class, za7Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
