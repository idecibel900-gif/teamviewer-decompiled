package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y8 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ n9 n;

    public /* synthetic */ y8(n9 n9Var, byte b) {
        this.m = b;
        this.n = n9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        n9 n9Var = this.n;
        switch (b) {
            case 0:
                n9Var.b.invoke(ea0.n);
                break;
            default:
                n9Var.b.invoke(ea0.m);
                break;
        }
        return f88Var;
    }
}
