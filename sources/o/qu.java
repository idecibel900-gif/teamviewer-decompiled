package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qu implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    public /* synthetic */ qu(byte b, boolean z) {
        this.m = b;
        this.n = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        boolean z = this.n;
        switch (b) {
            case 0:
                ((yy6) obj).getClass();
                return Boolean.valueOf(!z);
            default:
                mq2 mq2Var = (mq2) obj;
                if (!z) {
                    mq2Var.d(false);
                    mq2Var.e(new le5((byte) 0));
                }
                return f88.a;
        }
    }
}
