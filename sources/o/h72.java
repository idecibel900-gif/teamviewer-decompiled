package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class h72 extends zw5 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h72(Function0 function0, byte b) {
        super(function0);
        this.b = b;
    }

    @Override // o.zw5
    public final dx5 a(Object obj) {
        switch (this.b) {
            case 0:
                return new dx5(this, obj, obj == null, yl7.X, null, true);
            default:
                return new dx5(this, obj, obj == null, null, null, false);
        }
    }
}
