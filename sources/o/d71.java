package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class d71 implements InvocationHandler {
    public final wt3 a;
    public final kg2 b;

    public d71(wt3 wt3Var, kg2 kg2Var) {
        wt3Var.getClass();
        this.a = wt3Var;
        this.b = kg2Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean zN = im3.n(method.getName(), "accept");
        kg2 kg2Var = this.b;
        if (zN && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            wt3 wt3Var = this.a;
            wt3Var.getClass();
            if (wt3Var.o(obj2)) {
                obj2.getClass();
                kg2Var.invoke(obj2);
                return f88.a;
            }
            throw new ClassCastException("Value cannot be cast to " + wt3Var.c());
        }
        if (im3.n(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (im3.n(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(kg2Var.hashCode());
        }
        if (im3.n(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return kg2Var.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
