package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import o.cs4;
import o.e01;
import o.fs4;
import o.iw2;
import o.mw4;
import o.pe6;
import o.ua5;
import o.ug3;
import o.ux2;
import o.xg3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements iw2 {
    public final /* synthetic */ xg3 m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pe6 f12o;
    public final /* synthetic */ Function0 p;

    public a(xg3 xg3Var, boolean z, pe6 pe6Var, Function0 function0) {
        this.m = xg3Var;
        this.n = z;
        this.f12o = pe6Var;
        this.p = function0;
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
        fs4 fs4VarF = ug3.a(cs4.b, mw4Var, this.m).f(new ClickableElement(mw4Var, null, false, this.n, null, this.f12o, this.p));
        ux2Var.p(false);
        return fs4VarF;
    }
}
