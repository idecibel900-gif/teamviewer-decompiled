package o;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class vl3 extends xl3 implements ia0 {
    public final Object d;

    public vl3(Method method, Object obj) {
        super(method, ea2.m);
        this.d = obj;
    }

    @Override // o.mj0
    public final Object call(Object[] objArr) {
        objArr.getClass();
        di1.o(this, objArr);
        return this.a.invoke(this.d, Arrays.copyOf(objArr, objArr.length));
    }
}
