package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t40 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ at7 n;

    public /* synthetic */ t40(at7 at7Var, byte b) {
        this.m = b;
        this.n = at7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        us7 us7Var;
        byte b = this.m;
        byte b2 = 2;
        at7 at7Var = this.n;
        switch (b) {
            case 0:
                return Boolean.valueOf(at7Var != null ? ((Boolean) new t40(at7Var, b2).a()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(at7Var != null ? ((Boolean) new t40(at7Var, b2).a()).booleanValue() : false);
            default:
                xo xoVar = at7Var.b;
                vs7 vs7Var = (vs7) at7Var.a.getValue();
                return Boolean.valueOf(im3.n(xoVar, (vs7Var == null || (us7Var = vs7Var.a) == null) ? null : us7Var.a));
        }
    }
}
