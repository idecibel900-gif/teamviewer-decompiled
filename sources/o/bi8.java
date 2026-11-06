package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bi8 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ hi8 n;

    public /* synthetic */ bi8(hi8 hi8Var, byte b) {
        this.m = b;
        this.n = hi8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        hc1 hc1Var = null;
        hi8 hi8Var = this.n;
        String str = (String) obj;
        switch (b) {
            case 0:
                str.getClass();
                im3.R(e8.n(hi8Var), null, null, new mf7(str, hi8Var, hc1Var, (byte) 10), 3);
                break;
            case 1:
                str.getClass();
                ye4.a("WebLoginViewModel", "OnGenericError");
                l97 l97Var = hi8Var.u;
                Boolean bool = Boolean.FALSE;
                l97Var.getClass();
                l97Var.l(null, bool);
                im3.R(e8.n(hi8Var), null, null, new gi8(hi8Var, hc1Var, (byte) 2), 3);
                break;
            default:
                str.getClass();
                ye4.a("WebLoginViewModel", "OnActivationExpired");
                l97 l97Var2 = hi8Var.u;
                Boolean bool2 = Boolean.FALSE;
                l97Var2.getClass();
                l97Var2.l(null, bool2);
                im3.R(e8.n(hi8Var), null, null, new gi8(hi8Var, hc1Var, (byte) 4), 3);
                break;
        }
        return f88Var;
    }
}
