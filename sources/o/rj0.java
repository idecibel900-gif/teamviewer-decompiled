package o;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class rj0 extends sj0 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj0(Field field, boolean z, byte b) {
        super(field, z);
        this.e = b;
    }

    @Override // o.ck0
    public void c(Object[] objArr) {
        switch (this.e) {
            case 1:
                objArr.getClass();
                di1.o(this, objArr);
                d(cx.S0(objArr));
                break;
            default:
                super.c(objArr);
                break;
        }
    }
}
