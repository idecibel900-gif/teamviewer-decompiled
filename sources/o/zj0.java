package o;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zj0 extends wj0 implements ia0 {
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    public zj0(Method method, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : cx.L0(genericParameterTypes, 1, genericParameterTypes.length)));
        this.g = obj;
    }

    @Override // o.wj0, o.mj0
    public final Object call(Object[] objArr) {
        objArr.getClass();
        di1.o(this, objArr);
        nm nmVar = new nm(2);
        nmVar.g(this.g);
        nmVar.i(objArr);
        ArrayList arrayList = nmVar.a;
        return e(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
