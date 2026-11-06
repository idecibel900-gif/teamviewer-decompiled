package o;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class tj0 extends wj0 implements ia0 {
    public final Object g;

    public tj0(Field field, boolean z, Object obj) {
        super(field, z, false);
        this.g = obj;
    }

    @Override // o.wj0, o.mj0
    public final Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        c(objArr);
        ((Field) this.a).set(this.g, cx.R0(objArr));
        return f88.a;
    }
}
