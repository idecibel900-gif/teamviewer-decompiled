package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class xj0 extends wj0 implements ia0 {
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj0(Method method, Object obj) {
        super(method, false, 4);
        method.getClass();
        this.g = obj;
    }

    @Override // o.wj0, o.mj0
    public final Object call(Object[] objArr) {
        objArr.getClass();
        di1.o(this, objArr);
        return e(this.g, objArr);
    }
}
