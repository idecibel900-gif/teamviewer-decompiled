package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bi implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ d12 n;

    public /* synthetic */ bi(d12 d12Var, byte b) {
        this.m = b;
        this.n = d12Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        d12 d12Var = this.n;
        switch (b) {
            case 0:
                d12Var.show();
                return new m8(d12Var, (byte) 1);
            default:
                if (d12Var.r.a) {
                    d12Var.q.a();
                }
                return f88.a;
        }
    }
}
