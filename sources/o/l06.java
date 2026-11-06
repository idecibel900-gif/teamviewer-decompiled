package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l06 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ i97 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i97 f1318o;

    public /* synthetic */ l06(i97 i97Var, i97 i97Var2, byte b) {
        this.m = b;
        this.n = i97Var;
        this.f1318o = i97Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        i97 i97Var = this.f1318o;
        i97 i97Var2 = this.n;
        switch (b) {
            case 0:
                u52 u52Var = (u52) obj;
                float fD0 = u52Var.d0(2.0f);
                float f = fD0 / 2.0f;
                u52.t(u52Var, ((rv0) i97Var2.getValue()).a, u52Var.d0(au8.O0 / 2.0f) - f, 0L, new cc7(fD0, 0.0f, 0, 0, 30), 108);
                if (w32.a(((w32) i97Var.getValue()).m, 0.0f) > 0) {
                    u52.t(u52Var, ((rv0) i97Var2.getValue()).a, u52Var.d0(((w32) i97Var.getValue()).m) - f, 0L, zk2.a, 108);
                }
                break;
            default:
                jd6 jd6Var = (jd6) obj;
                jd6Var.k(((Number) i97Var2.getValue()).floatValue());
                jd6Var.l(((Number) i97Var2.getValue()).floatValue());
                jd6Var.b(((Number) i97Var.getValue()).floatValue());
                break;
        }
        return f88Var;
    }
}
