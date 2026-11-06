package o;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class pj0 extends sj0 implements ia0 {
    public final Object e;

    public pj0(Field field, Object obj) {
        super(field, false);
        this.e = obj;
    }

    @Override // o.sj0, o.mj0
    public final Object call(Object[] objArr) {
        objArr.getClass();
        di1.o(this, objArr);
        return ((Field) this.a).get(this.e);
    }
}
