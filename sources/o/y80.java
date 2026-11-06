package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y80 implements Function1 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2586o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ y80(v56 v56Var, nb5 nb5Var, sb0 sb0Var, float f, rj rjVar) {
        this.f2586o = v56Var;
        this.p = nb5Var;
        this.q = sb0Var;
        this.n = f;
        this.r = rjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.f2586o;
        switch (b) {
            case 0:
                v56 v56Var = (v56) obj5;
                nb5 nb5Var = (nb5) obj4;
                sb0 sb0Var = (sb0) obj3;
                float f = this.n;
                rj rjVar = (rj) obj2;
                u52 u52Var = (u52) obj;
                float f2 = -v56Var.a;
                float f3 = -v56Var.b;
                ((xc0) u52Var.h0().f1103o).V(f2, f3);
                try {
                    u52.H0(u52Var, nb5Var.e, sb0Var, 0.0f, new cc7(f * 2.0f, 0.0f, 0, 0, 30), null, 52);
                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (u52Var.d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (u52Var.d() >> 32));
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (u52Var.d() & 4294967295L));
                    long jT0 = u52Var.t0();
                    iu iuVarH0 = u52Var.h0();
                    long jD = iuVarH0.D();
                    iuVarH0.x().g();
                    try {
                        ((xc0) iuVarH0.f1103o).U(fIntBitsToFloat, fIntBitsToFloat2, jT0);
                        u52.H0(u52Var, rjVar, sb0Var, 0.0f, null, null, 28);
                        iuVarH0.x().p();
                        iuVarH0.S(jD);
                        ((xc0) u52Var.h0().f1103o).V(-f2, -f3);
                        return f88Var;
                    } catch (Throwable th) {
                        iuVarH0.x().p();
                        iuVarH0.S(jD);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ((xc0) u52Var.h0().f1103o).V(-f2, -f3);
                    throw th2;
                }
            default:
                long jLongValue = ((Long) obj).longValue();
                Object obj6 = ((k76) obj5).m;
                obj6.getClass();
                i67.n((io) obj6, jLongValue, this.n, (eo) obj4, (ko) obj3, (Function1) obj2);
                return f88Var;
        }
    }

    public /* synthetic */ y80(k76 k76Var, float f, eo eoVar, ko koVar, Function1 function1) {
        this.f2586o = k76Var;
        this.n = f;
        this.p = eoVar;
        this.q = koVar;
        this.r = function1;
    }
}
