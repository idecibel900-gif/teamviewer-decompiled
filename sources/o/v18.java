package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v18 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ u18 n;

    public /* synthetic */ v18(u18 u18Var, byte b) {
        this.m = b;
        this.n = u18Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        u18 u18Var = this.n;
        switch (b) {
            case 0:
                return new x18(u18Var, (byte) 0);
            default:
                return new x18(u18Var, (byte) 1);
        }
    }
}
