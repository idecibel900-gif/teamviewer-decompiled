package o;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ak0 extends wj0 implements ia0 {
    public final Object[] g;

    /* JADX WARN: Illegal instructions before constructor call */
    public ak0(Method method, Object[] objArr) {
        method.getClass();
        objArr.getClass();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        super(method, false, (Type[]) cx.M0(objArr.length, genericParameterTypes).toArray(new Type[0]));
        this.g = objArr;
    }

    @Override // o.wj0, o.mj0
    public final Object call(Object[] objArr) {
        objArr.getClass();
        di1.o(this, objArr);
        nm nmVar = new nm(2);
        nmVar.i(this.g);
        nmVar.i(objArr);
        ArrayList arrayList = nmVar.a;
        return e(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
