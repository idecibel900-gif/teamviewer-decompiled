package o;

import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m21 implements iw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a06 f1429o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ i97 q;
    public final /* synthetic */ i97 r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ m21(y31 y31Var, Function1 function1, Function0 function0, a06 a06Var, i31 i31Var, xg8 xg8Var, px4 px4Var, i97 i97Var, i97 i97Var2, i97 i97Var3) {
        this.s = y31Var;
        this.n = function1;
        this.p = function0;
        this.f1429o = a06Var;
        this.t = i31Var;
        this.u = xg8Var;
        this.v = px4Var;
        this.q = i97Var;
        this.r = i97Var2;
        this.w = i97Var3;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        ux2 ux2Var;
        byte b = this.m;
        aw awVar = e01.a;
        f88 f88Var = f88.a;
        i97 i97Var = this.r;
        i97 i97Var2 = this.q;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.u;
        Object obj7 = this.t;
        Object obj8 = this.s;
        switch (b) {
            case 0:
                y31 y31Var = (y31) obj8;
                i31 i31Var = (i31) obj7;
                xg8 xg8Var = (xg8) obj6;
                px4 px4Var = (px4) obj5;
                i97 i97Var3 = (i97) obj4;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((nd5) obj).getClass();
                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var2.Q();
                } else if (((p31) px4Var.getValue()).a) {
                    ux2Var2.W(-850254490);
                    boolean zBooleanValue = ((Boolean) i97Var2.getValue()).booleanValue();
                    boolean zH = ux2Var2.h(y31Var);
                    Object objK = ux2Var2.K();
                    if (zH || objK == awVar) {
                        objK = new n21(y31Var, (byte) 4);
                        ux2Var2.g0(objK);
                    }
                    bt1.k(zBooleanValue, (Function0) objK, this.n, this.p, ol6.a, null, new bl6(((p31) px4Var.getValue()).n, (List) i97Var3.getValue(), ((p31) px4Var.getValue()).g || ((Boolean) i97Var.getValue()).booleanValue()), null, null, ux2Var2, 27648, 416);
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-849403354);
                    e8.d(this.f1429o, (p31) px4Var.getValue(), i31Var, xg8Var, null, ux2Var2, 0);
                    ux2Var2.p(false);
                }
                return f88Var;
            default:
                th8 th8Var = (th8) obj8;
                ComposeView composeView = (ComposeView) obj7;
                Function0 function0 = (Function0) obj6;
                String str = (String) obj5;
                Function0 function1 = (Function0) obj4;
                nd5 nd5Var = (nd5) obj;
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                nd5Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ux2Var3.f(nd5Var) ? 4 : 2;
                }
                if (ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zH2 = ux2Var3.h(th8Var);
                    Function1 function2 = this.n;
                    boolean zF = zH2 | ux2Var3.f(function2) | ux2Var3.h(composeView);
                    Object objK2 = ux2Var3.K();
                    if (zF || objK2 == awVar) {
                        objK2 = new t5(th8Var, function2, composeView, function1, (hc1) null, (byte) 8);
                        ux2Var3.g0(objK2);
                    }
                    ck3.i(f88Var, (hw2) objK2, ux2Var3);
                    boolean z = this.f1429o.c;
                    cs4 cs4Var = cs4.b;
                    Function0 function3 = this.p;
                    if (z) {
                        ux2Var3.W(-390351078);
                        g57.d(((Boolean) i97Var2.getValue()).booleanValue(), function3, function0, str, ka0.A(cs4Var, nd5Var), ux2Var3, 0);
                        ux2Var = ux2Var3;
                        ux2Var.p(false);
                    } else {
                        ux2Var = ux2Var3;
                        ux2Var.W(-389888093);
                        f57.e(((Boolean) i97Var2.getValue()).booleanValue(), function3, function0, str, ka0.A(cs4Var, nd5Var), false, false, ux2Var, 0, 96);
                        ux2Var.p(false);
                    }
                    vh3 vh3Var = (vh3) i97Var.getValue();
                    if (vh3Var == null) {
                        ux2Var.W(-389427496);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(-389427495);
                        boolean zH3 = ux2Var.h(vh3Var);
                        Object objK3 = ux2Var.K();
                        if (zH3 || objK3 == awVar) {
                            objK3 = new j85(vh3Var, (byte) 2);
                            ux2Var.g0(objK3);
                        }
                        Function0 function4 = (Function0) objK3;
                        vh8 vh8Var = th8Var.q0;
                        if (vh8Var == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        boolean zH4 = ux2Var.h(vh8Var);
                        Object objK4 = ux2Var.K();
                        if (zH4 || objK4 == awVar) {
                            mr6 mr6Var = new mr6(0, vh8Var, vh8.class, "dismissDialog", "dismissDialog()V", 0, (byte) 19);
                            ux2Var.g0(mr6Var);
                            objK4 = mr6Var;
                        }
                        io1.j(vh3Var, function4, (Function0) ((pu3) objK4), null, null, ux2Var, 0, 24);
                        ux2Var.p(false);
                    }
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
        }
    }

    public /* synthetic */ m21(th8 th8Var, Function1 function1, ComposeView composeView, a06 a06Var, Function0 function0, Function0 function2, String str, Function0 function3, i97 i97Var, i97 i97Var2) {
        this.s = th8Var;
        this.n = function1;
        this.t = composeView;
        this.f1429o = a06Var;
        this.p = function0;
        this.u = function2;
        this.v = str;
        this.w = function3;
        this.q = i97Var;
        this.r = i97Var2;
    }
}
