package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class vv7 implements iw2 {
    public final /* synthetic */ xg3 m;
    public final /* synthetic */ xv7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2353o;
    public final /* synthetic */ pe6 p;
    public final /* synthetic */ Function0 q;

    public vv7(xg3 xg3Var, xv7 xv7Var, boolean z, pe6 pe6Var, Function0 function0) {
        this.m = xg3Var;
        this.n = xv7Var;
        this.f2353o = z;
        this.p = pe6Var;
        this.q = function0;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        ux2 ux2Var = (ux2) obj2;
        ((Number) obj3).intValue();
        ux2Var.W(-1525724089);
        Object objK = ux2Var.K();
        if (objK == e01.a) {
            objK = ua5.s(ux2Var);
        }
        mw4 mw4Var = (mw4) objK;
        fs4 fs4VarF = ug3.a(cs4.b, mw4Var, this.m).f(new p28(this.n, mw4Var, null, this.f2353o, this.p, this.q));
        ux2Var.p(false);
        return fs4VarF;
    }
}
