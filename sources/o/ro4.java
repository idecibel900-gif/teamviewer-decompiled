package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class ro4 implements Function0 {
    public final /* synthetic */ byte m;
    public final vo4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qv5 f1939o;
    public final cq1 p;

    public /* synthetic */ ro4(vo4 vo4Var, qv5 qv5Var, cq1 cq1Var, byte b) {
        this.m = b;
        this.n = vo4Var;
        this.f1939o = qv5Var;
        this.p = cq1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        cq1 cq1Var = this.p;
        qv5 qv5Var = this.f1939o;
        vo4 vo4Var = this.n;
        switch (b) {
            case 0:
                xd4 xd4Var = (xd4) ((io.sentry.android.replay.screenshot.k) vo4Var.a.a).a;
                ro4 ro4Var = new ro4(vo4Var, qv5Var, cq1Var, (byte) 2);
                xd4Var.getClass();
                return new ud4(xd4Var, ro4Var);
            case 1:
                xd4 xd4Var2 = (xd4) ((io.sentry.android.replay.screenshot.k) vo4Var.a.a).a;
                ro4 ro4Var2 = new ro4(vo4Var, qv5Var, cq1Var, (byte) 3);
                xd4Var2.getClass();
                return new ud4(xd4Var2, ro4Var2);
            case 2:
                fp1 fp1Var = vo4Var.a;
                sx3 sx3VarA = vo4Var.a((fi1) fp1Var.c);
                sx3VarA.getClass();
                ap apVar = (ap) ((io.sentry.android.replay.screenshot.k) fp1Var.a).e;
                oz3 returnType = cq1Var.getReturnType();
                returnType.getClass();
                return (u51) apVar.g(sx3VarA, qv5Var, returnType);
            default:
                fp1 fp1Var2 = vo4Var.a;
                sx3 sx3VarA2 = vo4Var.a((fi1) fp1Var2.c);
                sx3VarA2.getClass();
                ap apVar2 = (ap) ((io.sentry.android.replay.screenshot.k) fp1Var2.a).e;
                oz3 returnType2 = cq1Var.getReturnType();
                returnType2.getClass();
                return (u51) apVar2.u(sx3VarA2, qv5Var, returnType2);
        }
    }
}
