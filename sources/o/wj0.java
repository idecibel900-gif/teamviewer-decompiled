package o;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wj0 extends ck0 {
    public final /* synthetic */ byte e = 0;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public wj0(Field field, boolean z, boolean z2) {
        Class cls = Void.TYPE;
        cls.getClass();
        super(field, cls, z2 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
        this.f = z;
    }

    @Override // o.ck0
    public void c(Object[] objArr) {
        switch (this.e) {
            case 0:
                objArr.getClass();
                di1.o(this, objArr);
                if (this.f && cx.a1(objArr) == null) {
                    hk0.g("null is not allowed as a value for this property.");
                    break;
                }
                break;
            default:
                super.c(objArr);
                break;
        }
    }

    @Override // o.mj0
    public Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        c(objArr);
        ((Field) this.a).set(this.c != null ? cx.R0(objArr) : null, cx.a1(objArr));
        return f88.a;
    }

    public Object e(Object obj, Object[] objArr) {
        objArr.getClass();
        return this.f ? f88.a : ((Method) this.a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wj0(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.f = im3.n(genericReturnType, Void.TYPE);
    }

    public /* synthetic */ wj0(Method method, boolean z, int i) {
        this(method, (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z, method.getGenericParameterTypes());
    }
}
