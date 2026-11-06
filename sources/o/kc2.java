package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class kc2 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ lc2 n;

    public /* synthetic */ kc2(lc2 lc2Var, byte b) {
        this.m = b;
        this.n = lc2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        t35 t35Var = t35.r;
        lc2 lc2Var = this.n;
        switch (b) {
            case 0:
                sy4 sy4Var = (sy4) obj;
                if (sy4Var != null) {
                    return lc2Var.j(sy4Var, lc2Var.i().a(sy4Var, t35Var));
                }
                lc2.h(8);
                throw null;
            default:
                sy4 sy4Var2 = (sy4) obj;
                if (sy4Var2 != null) {
                    return lc2Var.j(sy4Var2, lc2Var.i().d(sy4Var2, t35Var));
                }
                lc2.h(4);
                throw null;
        }
    }
}
