package o;

import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class w21 extends og7 implements hw2 {
    public /* synthetic */ Object m;
    public final /* synthetic */ y31 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f2367o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ ComposeView q;
    public final /* synthetic */ y21 r;
    public final /* synthetic */ au0 s;
    public final /* synthetic */ me1 t;
    public final /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w21(y31 y31Var, Function1 function1, Function0 function0, ComposeView composeView, y21 y21Var, au0 au0Var, me1 me1Var, Function1 function2, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = y31Var;
        this.f2367o = function1;
        this.p = function0;
        this.q = composeView;
        this.r = y21Var;
        this.s = au0Var;
        this.t = me1Var;
        this.u = function2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        w21 w21Var = new w21(this.n, this.f2367o, this.p, this.q, this.r, this.s, this.t, this.u, hc1Var);
        w21Var.m = obj;
        return w21Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        w21 w21Var = (w21) create((me1) obj, (hc1) obj2);
        f88 f88Var = f88.a;
        w21Var.invokeSuspend(f88Var);
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        me1 me1Var = (me1) this.m;
        ct1.a0(obj);
        y31 y31Var = this.n;
        Function1 function1 = this.f2367o;
        Function0 function0 = this.p;
        ComposeView composeView = this.q;
        im3.R(me1Var, null, null, new bj(y31Var, function1, function0, composeView, null, (byte) 4), 3);
        hc1 hc1Var = null;
        y21 y21Var = this.r;
        im3.R(me1Var, null, null, new um(y31Var, y21Var, this.f2367o, this.p, this.s, this.t, hc1Var, (byte) 1), 3);
        im3.R(me1Var, null, null, new um(y31Var, y21Var, this.f2367o, this.p, composeView, this.u, hc1Var, (byte) 2), 3);
        return f88.a;
    }
}
