package o;

import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vs0 {
    public static final vs0 c = new vs0();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, us0 us0Var, l84 l84Var, Class cls) {
        l84 l84Var2 = (l84) map.get(us0Var);
        if (l84Var2 == null || l84Var == l84Var2) {
            if (l84Var2 == null) {
                map.put(us0Var, l84Var);
                return;
            }
            return;
        }
        String name = us0Var.b.getName();
        String name2 = cls.getName();
        String strValueOf = String.valueOf(l84Var2);
        String strValueOf2 = String.valueOf(l84Var);
        StringBuilder sbO = e41.o("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value ");
        sbO.append(strValueOf);
        sbO.append(", new value ");
        sbO.append(strValueOf2);
        throw new IllegalArgumentException(sbO.toString());
    }

    public final ts0 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            ts0 ts0VarA = (ts0) map2.get(superclass);
            if (ts0VarA == null) {
                ts0VarA = a(superclass, null);
            }
            map.putAll(ts0VarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            ts0 ts0VarA2 = (ts0) map2.get(cls2);
            if (ts0VarA2 == null) {
                ts0VarA2 = a(cls2, null);
            }
            for (Map.Entry entry : ts0VarA2.b.entrySet()) {
                b(map, (us0) entry.getKey(), (l84) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            a85 a85Var = (a85) method.getAnnotation(a85.class);
            if (a85Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        hk0.g("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                l84 l84VarValue = a85Var.value();
                if (parameterTypes.length > 1) {
                    if (!l84.class.isAssignableFrom(parameterTypes[1])) {
                        hk0.g("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (l84VarValue != l84.ON_ANY) {
                        hk0.g("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    hk0.g("cannot have more than 2 params");
                    return null;
                }
                b(map, new us0(method, i), l84VarValue, cls);
                z = true;
            }
        }
        ts0 ts0Var = new ts0(map);
        map2.put(cls, ts0Var);
        this.b.put(cls, Boolean.valueOf(z));
        return ts0Var;
    }
}
