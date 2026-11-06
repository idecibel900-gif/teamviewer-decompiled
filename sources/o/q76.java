package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q76 extends e86 {
    public final Annotation a;

    public q76(Annotation annotation) {
        annotation.getClass();
        this.a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        r76 b86Var;
        Annotation annotation = this.a;
        Method[] declaredMethods = et1.z(et1.x(annotation)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            objInvoke.getClass();
            sy4 sy4VarE = sy4.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = p76.a;
            if (Enum.class.isAssignableFrom(cls)) {
                b86Var = new f86(sy4VarE, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                b86Var = new s76(sy4VarE, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                b86Var = new t76(sy4VarE, (Object[]) objInvoke);
            } else {
                b86Var = objInvoke instanceof Class ? new b86(sy4VarE, (Class) objInvoke) : new h86(sy4VarE, objInvoke);
            }
            arrayList.add(b86Var);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q76) {
            return this.a == ((q76) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return q76.class.getName() + ": " + this.a;
    }
}
