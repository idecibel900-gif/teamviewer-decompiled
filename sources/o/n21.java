package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n21 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ y31 n;

    public /* synthetic */ n21(y31 y31Var, byte b) {
        this.m = b;
        this.n = y31Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Object value;
        p31 p31Var;
        Object value2;
        p31 p31Var2;
        byte b = this.m;
        byte b2 = 3;
        hc1 hc1Var = null;
        f88 f88Var = f88.a;
        y31 y31Var = this.n;
        switch (b) {
            case 0:
                y31Var.X0();
                break;
            case 1:
                l97 l97Var = y31Var.P;
                do {
                    value = l97Var.getValue();
                    p31Var = (p31) value;
                    p31Var.getClass();
                } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 8388575)));
                break;
            case 2:
                y31Var.a1();
                y31Var.i1(null);
                break;
            case 3:
                l97 l97Var2 = y31Var.P;
                do {
                    value2 = l97Var2.getValue();
                    p31Var2 = (p31) value2;
                    p31Var2.getClass();
                } while (!l97Var2.j(value2, p31.a(p31Var2, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 4194303)));
                y31Var.b1();
                y31Var.i1(null);
                break;
            case 4:
                y31Var.Z0();
                break;
            case 5:
                y31Var.b1();
                y31Var.i1(null);
                break;
            case 6:
                im3.R(e8.n(y31Var), null, null, new v31(y31Var, hc1Var, (byte) 10), 3);
                break;
            case 7:
                y31Var.g1(ci3.m);
                break;
            case 8:
                im3.R(e8.n(y31Var), null, null, new v31(y31Var, hc1Var, (byte) 4), 3);
                break;
            case ep1.b /* 9 */:
                im3.R(e8.n(y31Var), null, null, new v31(y31Var, hc1Var, (byte) 2), 3);
                break;
            default:
                im3.R(e8.n(y31Var), null, null, new v31(y31Var, hc1Var, b2), 3);
                break;
        }
        return f88Var;
    }
}
