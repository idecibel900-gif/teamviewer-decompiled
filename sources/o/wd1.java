package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wd1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yd1 n;

    public /* synthetic */ wd1(yd1 yd1Var, byte b) {
        this.m = b;
        this.n = yd1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        q57 q57Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        yd1 yd1Var = this.n;
        switch (b) {
            case 0:
                vn4.m0(yd1Var);
                return f88Var;
            case 1:
                yd1Var.J.e(true);
                break;
            case 2:
                yd1Var.J.a(true);
                break;
            case 3:
                yd1Var.J.c();
                break;
            case 4:
                vn4.m0(yd1Var);
                return f88Var;
            case 5:
                yd1Var.J.o();
                break;
            case 6:
                yd1Var.E.w.n.r.b(yd1Var.K.e);
                break;
            default:
                j64 j64Var = yd1Var.E;
                sq2 sq2Var = yd1Var.L;
                boolean z = yd1Var.F;
                if (!j64Var.b()) {
                    sq2.a(sq2Var);
                } else if (!z && (q57Var = j64Var.c) != null) {
                    ((zm1) q57Var).b();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
