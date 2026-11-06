package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b45 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ e45 n;

    public /* synthetic */ b45(e45 e45Var, byte b) {
        this.m = b;
        this.n = e45Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        e45 e45Var = this.n;
        switch (b) {
            case 0:
                ll0 ll0Var = e45Var.d0;
                ll0Var.getClass();
                e45Var.U0(ll0Var, e45Var.c0);
                break;
            default:
                e45 e45Var2 = e45Var.K;
                if (e45Var2 != null) {
                    e45Var2.i1();
                }
                break;
        }
        return f88Var;
    }
}
