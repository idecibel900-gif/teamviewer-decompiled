package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class v8 {
    public final Type a;
    public final Set b;
    public final Object c;
    public final Method d;
    public final byte e;
    public final vp3[] f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public v8(Type type, Set set, Object obj, Method method, int i, int i2, boolean z) {
        this.a = ma8.a(type);
        this.b = set;
        this.c = obj;
        this.d = method;
        this.e = i2;
        this.f = new vp3[i - i2];
        this.g = z;
    }

    public void a(pt4 pt4Var, w8 w8Var) {
        vp3[] vp3VarArr = this.f;
        if (vp3VarArr.length > 0) {
            Method method = this.d;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = genericParameterTypes.length;
            byte b = this.e;
            for (int i = b; i < length; i++) {
                Type type = ((ParameterizedType) genericParameterTypes[i]).getActualTypeArguments()[0];
                Set setF = ma8.f(parameterAnnotations[i]);
                vp3VarArr[i - b] = (f57.h(this.a, type) && this.b.equals(setF)) ? pt4Var.b(w8Var, type, setF) : pt4Var.a(type, setF, null);
            }
        }
    }

    public Object b(nr3 nr3Var) {
        throw new AssertionError();
    }

    public final Object c(Object obj) {
        vp3[] vp3VarArr = this.f;
        Object[] objArr = new Object[vp3VarArr.length + 1];
        objArr[0] = obj;
        System.arraycopy(vp3VarArr, 0, objArr, 1, vp3VarArr.length);
        try {
            return this.d.invoke(this.c, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public void d(pr3 pr3Var, Object obj) {
        throw new AssertionError();
    }
}
