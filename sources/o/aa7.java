package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class aa7 implements Function0 {
    public final /* synthetic */ byte m;
    public final ba7 n;

    public /* synthetic */ aa7(ba7 ba7Var, byte b) {
        this.m = b;
        this.n = ba7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        ba7 ba7Var = this.n;
        switch (b) {
            case 0:
                pp1 pp1Var = ba7Var.b;
                return qf0.L(io1.M(pp1Var), io1.N(pp1Var));
            default:
                return ba7Var.c ? qf0.M(io1.L(ba7Var.b)) : ea2.m;
        }
    }
}
