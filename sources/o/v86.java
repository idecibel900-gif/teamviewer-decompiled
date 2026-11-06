package o;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes2.dex */
public final class v86 extends yi5 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v86(byte b) {
        super((byte) 4);
        this.n = b;
    }

    @Override // o.yi5
    public String f(Method method, int i) {
        switch (this.n) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                    return super.f(method, i);
                }
                return "parameter '" + parameter.getName() + '\'';
            default:
                return super.f(method, i);
        }
    }

    @Override // o.yi5
    public final Object j(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.n) {
            case 0:
                break;
        }
        return hm3.t(method, cls, obj, objArr);
    }

    @Override // o.yi5
    public final boolean k(Method method) {
        switch (this.n) {
            case 0:
                break;
        }
        return method.isDefault();
    }
}
