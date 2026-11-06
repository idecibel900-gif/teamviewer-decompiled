package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class tv3 implements Function0 {
    public final /* synthetic */ byte m;
    public final vv3 n;

    public /* synthetic */ tv3(vv3 vv3Var, byte b) {
        this.m = b;
        this.n = vv3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws wd3 {
        byte b = this.m;
        vv3 vv3Var = this.n;
        switch (b) {
            case 0:
                return new uv3(vv3Var);
            default:
                Object objA = vv3Var.A();
                try {
                    Object obj = mw3.x;
                    Object objB = vv3Var.z() ? vv3Var.B() : null;
                    if (objB == obj) {
                        objB = null;
                    }
                    vv3Var.z();
                    AccessibleObject accessibleObject = objA != null ? (AccessibleObject) objA : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(nv1.B(vv3Var));
                    }
                    if (objA == null) {
                        return null;
                    }
                    if (objA instanceof Field) {
                        return ((Field) objA).get(objB);
                    }
                    if (!(objA instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objA + " neither field nor method");
                    }
                    int length = ((Method) objA).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objA).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objA;
                        if (objB == null) {
                            Class<?> cls = ((Method) objA).getParameterTypes()[0];
                            cls.getClass();
                            objB = pa8.e(cls);
                        }
                        return method.invoke(null, objB);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objA;
                        Class<?> cls2 = ((Method) objA).getParameterTypes()[1];
                        cls2.getClass();
                        return method2.invoke(null, objB, pa8.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objA + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e) {
                    throw new wd3("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
                }
        }
    }
}
