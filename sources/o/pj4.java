package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pj4 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ qj4 n;

    public /* synthetic */ pj4(qj4 qj4Var, byte b) {
        this.m = b;
        this.n = qj4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        qj4 qj4Var = this.n;
        switch (b) {
            case 0:
                qj4Var.W0();
                return f88.a;
            case 1:
                return new t65(qj4Var.O);
            default:
                i04 i04Var = (i04) qj4Var.M.getValue();
                return new t65(i04Var != null ? i04Var.P(0L) : 9205357640488583168L);
        }
    }
}
