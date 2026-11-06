package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wl3 extends xl3 {
    @Override // o.mj0
    public final Object call(Object[] objArr) {
        objArr.getClass();
        di1.o(this, objArr);
        Object obj = objArr[0];
        Object[] objArrL0 = objArr.length <= 1 ? new Object[0] : cx.L0(objArr, 1, objArr.length);
        return this.a.invoke(obj, Arrays.copyOf(objArrL0, objArrL0.length));
    }
}
