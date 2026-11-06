package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj4 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ z60 n;

    public /* synthetic */ fj4(z60 z60Var, byte b) {
        this.m = b;
        this.n = z60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        z60 z60Var = this.n;
        switch (b) {
            case 0:
                aj4 aj4Var = (aj4) ((na3) ((fp1) z60Var.n).d);
                return Boolean.valueOf(aj4Var != null ? aj4Var.v() : false);
            case 1:
                boolean zN = im3.n(((qf2) z60Var.q).getValue(), Boolean.valueOf(z60Var.m));
                kv4 kv4Var = (kv4) ((zb3) ((fp1) z60Var.n).f);
                if (kv4Var != null) {
                    kv4Var.r = zN;
                }
                return zN ? nb3.n : nb3.m;
            default:
                qf2 qf2Var = (qf2) z60Var.q;
                qf2Var.setValue(qf2Var.a.a());
                qf2 qf2Var2 = (qf2) z60Var.r;
                qf2Var2.setValue(qf2Var2.a.a());
                return f88.a;
        }
    }
}
