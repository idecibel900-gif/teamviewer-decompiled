package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl6 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ql6 n;

    public /* synthetic */ sl6(ql6 ql6Var, byte b) {
        this.m = b;
        this.n = ql6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        ql6 ql6Var = this.n;
        switch (b) {
            case 0:
                bt1.m(ql6Var, new sl6(ql6Var, (byte) 1));
                break;
            default:
                if (ql6Var instanceof pl6) {
                    ((pl6) ql6Var).a.a();
                }
                break;
        }
        return f88Var;
    }
}
