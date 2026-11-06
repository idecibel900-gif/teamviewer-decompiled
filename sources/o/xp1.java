package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class xp1 implements Function0 {
    public final /* synthetic */ byte m;
    public final zp1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final aq1 f2543o;

    public /* synthetic */ xp1(zp1 zp1Var, aq1 aq1Var, byte b) {
        this.m = b;
        this.n = zp1Var;
        this.f2543o = aq1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        aq1 aq1Var = this.f2543o;
        zp1 zp1Var = this.n;
        switch (b) {
            case 0:
                return fv6.a0(zp1Var.a.keySet(), aq1Var.o());
            default:
                return fv6.a0(zp1Var.b.keySet(), aq1Var.p());
        }
    }
}
