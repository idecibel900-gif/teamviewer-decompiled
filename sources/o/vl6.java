package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vl6 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ bn6 n;

    public /* synthetic */ vl6(bn6 bn6Var, byte b) {
        this.m = b;
        this.n = bn6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Object value;
        yl6 yl6Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        bn6 bn6Var = this.n;
        switch (b) {
            case 0:
                l97 l97Var = bn6Var.u;
                do {
                    value = l97Var.getValue();
                    yl6Var = (yl6) value;
                    yl6Var.getClass();
                } while (!l97Var.j(value, yl6.a(yl6Var, null, null, null, false, null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, 2064383)));
                break;
            case 1:
                bn6Var.f1();
                break;
            default:
                bn6Var.f1();
                break;
        }
        return f88Var;
    }
}
