package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t8 extends v8 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8(Type type, Set set, Object obj, Method method, int i, int i2, boolean z, byte b) {
        super(type, set, obj, method, i, i2, z);
        this.h = b;
    }

    @Override // o.v8
    public Object b(nr3 nr3Var) {
        switch (this.h) {
            case 1:
                return c(nr3Var);
            default:
                return super.b(nr3Var);
        }
    }

    @Override // o.v8
    public void d(pr3 pr3Var, Object obj) throws InvocationTargetException {
        switch (this.h) {
            case 0:
                vp3[] vp3VarArr = this.f;
                Object[] objArr = new Object[vp3VarArr.length + 2];
                objArr[0] = pr3Var;
                objArr[1] = obj;
                System.arraycopy(vp3VarArr, 0, objArr, 2, vp3VarArr.length);
                try {
                    this.d.invoke(this.c, objArr);
                    return;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                }
            default:
                super.d(pr3Var, obj);
                return;
        }
    }
}
