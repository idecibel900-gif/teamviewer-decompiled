package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hd4 {
    public static final zw5 a;

    static {
        Object sc6Var;
        try {
            ClassLoader classLoader = ai6.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("o.lh").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof zw5) {
                        sc6Var = (zw5) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof un1)) {
                    i++;
                }
                sc6Var = null;
                break;
            }
        } catch (Throwable th) {
            sc6Var = new sc6(th);
        }
        zw5 h72Var = (zw5) (sc6Var instanceof sc6 ? null : sc6Var);
        if (h72Var == null) {
            h72Var = new h72(new tg3((byte) 26), (byte) 1);
        }
        a = h72Var;
    }
}
