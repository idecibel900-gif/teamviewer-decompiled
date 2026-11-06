package o;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sj0 extends ck0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public sj0(Field field, boolean z) {
        Type genericType = field.getGenericType();
        genericType.getClass();
        super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // o.mj0
    public Object call(Object[] objArr) {
        objArr.getClass();
        c(objArr);
        return ((Field) this.a).get(this.c != null ? cx.R0(objArr) : null);
    }
}
