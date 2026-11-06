package o;

import android.app.Activity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class f71 {
    public final ClassLoader a;

    public f71(ClassLoader classLoader) {
        classLoader.getClass();
        this.a = classLoader;
    }

    public e71 a(Object obj, wt3 wt3Var, Activity activity, kg2 kg2Var) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        wt3Var.getClass();
        d71 d71Var = new d71(wt3Var, kg2Var);
        ClassLoader classLoader = this.a;
        Class<?> clsLoadClass = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{clsLoadClass}, d71Var);
        objNewProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> clsLoadClass2 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass2).invoke(obj, activity, objNewProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> clsLoadClass3 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass3.getClass();
        return new e71(cls2.getMethod("removeWindowLayoutInfoListener", clsLoadClass3), obj, objNewProxyInstance);
    }

    public nx3 b(String str) {
        Class<?> cls;
        r86 r86VarY;
        try {
            cls = Class.forName(str, false, this.a);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || (r86VarY = ct1.y(cls)) == null) {
            return null;
        }
        return new nx3((Object) r86VarY, (byte) 6);
    }
}
