package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uv1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ me1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nx4 f2252o;

    public /* synthetic */ uv1(me1 me1Var, nx4 nx4Var, byte b) {
        this.m = b;
        this.n = me1Var;
        this.f2252o = nx4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        nx4 nx4Var = this.f2252o;
        me1 me1Var = this.n;
        f02 f02Var = (f02) obj;
        switch (b) {
            case 0:
                f02Var.getClass();
                im3.R(me1Var, null, null, new wv1(nx4Var, f02Var, null, (byte) 0), 3);
                break;
            default:
                f02Var.getClass();
                im3.R(me1Var, null, null, new wv1(nx4Var, f02Var, null, (byte) 1), 3);
                break;
        }
        return f88Var;
    }
}
