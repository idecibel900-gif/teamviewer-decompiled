package o;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ci6 {
    public static final List a = qf0.L(Application.class, rh6.class);
    public static final List b = qf0.K(rh6.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listG1 = cx.g1(parameterTypes);
            if (list.equals(listG1)) {
                return constructor;
            }
            if (list.size() == listG1.size() && listG1.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final oe8 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (oe8) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            an4.m("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            an4.n("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
