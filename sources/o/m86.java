package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class m86 extends i86 {
    public final Object a;

    public m86(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // o.i86
    public final Member b() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        obj.getClass();
        on3 on3Var = io1.b;
        Method method = null;
        if (on3Var == null) {
            Class<?> cls = obj.getClass();
            try {
                on3Var = new on3(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                on3Var = new on3(null, null);
            }
            io1.b = on3Var;
        }
        Method method2 = on3Var.b;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            objInvoke.getClass();
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final n86 f() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        obj.getClass();
        on3 on3Var = io1.b;
        Class cls = null;
        if (on3Var == null) {
            Class<?> cls2 = obj.getClass();
            try {
                on3Var = new on3(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                on3Var = new on3(null, null);
            }
            io1.b = on3Var;
        }
        Method method = on3Var.a;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            objInvoke.getClass();
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new c86(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
