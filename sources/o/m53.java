package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m53 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ n53 n;

    public /* synthetic */ m53(n53 n53Var, byte b) {
        this.m = b;
        this.n = n53Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        n53 n53Var = this.n;
        switch (b) {
            case 0:
                if (n53Var.H != null) {
                    return f88Var;
                }
                throw fx3.l("Font resolution state is not set.");
            default:
                if (n53Var.H != null) {
                    return f88Var;
                }
                throw fx3.l("Font resolution state is not set.");
        }
    }
}
