package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class eo6 implements iw2 {
    public final /* synthetic */ xg3 m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f730o;
    public final /* synthetic */ pe6 p;
    public final /* synthetic */ Function0 q;

    public eo6(xg3 xg3Var, boolean z, boolean z2, pe6 pe6Var, Function0 function0) {
        this.m = xg3Var;
        this.n = z;
        this.f730o = z2;
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
        fs4 fs4VarF = ug3.a(cs4.b, mw4Var, this.m).f(new do6(this.n, mw4Var, null, false, this.f730o, this.p, this.q));
        ux2Var.p(false);
        return fs4VarF;
    }
}
