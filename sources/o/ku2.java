package o;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class ku2 {
    public static final a07 b = new a07(0);
    public final /* synthetic */ su2 a;

    public ku2(su2 su2Var) {
        this.a = su2Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        a07 a07Var = b;
        a07 a07Var2 = (a07) a07Var.get(classLoader);
        if (a07Var2 == null) {
            a07Var2 = new a07(0);
            a07Var.put(classLoader, a07Var2);
        }
        Class cls = (Class) a07Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        a07Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new st2(fx3.g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new st2(fx3.g("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final ut2 a(String str) {
        try {
            return (ut2) c(this.a.x.t.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new st2(fx3.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new st2(fx3.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new st2(fx3.g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new st2(fx3.g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
