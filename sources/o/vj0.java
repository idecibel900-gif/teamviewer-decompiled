package o;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class vj0 extends wj0 {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj0(Field field, boolean z, boolean z2, byte b) {
        super(field, z, z2);
        this.g = b;
    }

    @Override // o.wj0, o.ck0
    public void c(Object[] objArr) {
        switch (this.g) {
            case 1:
                objArr.getClass();
                super.c(objArr);
                d(cx.S0(objArr));
                break;
            default:
                super.c(objArr);
                break;
        }
    }
}
