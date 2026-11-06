package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class bk0 extends wj0 {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk0(byte b, int i, Method method, boolean z) {
        super(method, z, i);
        this.g = b;
    }

    @Override // o.wj0, o.mj0
    public final Object call(Object[] objArr) {
        byte b = this.g;
        objArr.getClass();
        switch (b) {
            case 0:
                di1.o(this, objArr);
                return e(objArr[0], objArr.length <= 1 ? new Object[0] : cx.L0(objArr, 1, objArr.length));
            case 1:
                di1.o(this, objArr);
                d(cx.S0(objArr));
                return e(null, objArr.length <= 1 ? new Object[0] : cx.L0(objArr, 1, objArr.length));
            default:
                di1.o(this, objArr);
                return e(null, objArr);
        }
    }
}
