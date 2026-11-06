package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hf3 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ jf3 n;

    public /* synthetic */ hf3(jf3 jf3Var, byte b) {
        this.m = b;
        this.n = jf3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        hc1 hc1Var = null;
        f88 f88Var = f88.a;
        jf3 jf3Var = this.n;
        switch (b) {
            case 0:
                im3.R(e8.n(jf3Var), null, null, new if3(jf3Var, hc1Var, (byte) 2), 3);
                break;
            case 1:
                im3.R(e8.n(jf3Var), null, null, new if3(jf3Var, hc1Var, (byte) 1), 3);
                break;
            default:
                jf3Var.V0();
                break;
        }
        return f88Var;
    }
}
