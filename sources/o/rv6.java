package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rv6 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1958o;
    public final /* synthetic */ boolean p;

    public /* synthetic */ rv6(boolean z, Function1 function1, Function1 function2, int i) {
        this.m = (byte) 6;
        this.p = z;
        this.n = function1;
        this.f1958o = function2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        aw awVar = e01.a;
        fs4 fs4VarS = cs4.b;
        byte b2 = 2;
        byte b3 = 0;
        f88 f88Var = f88.a;
        Object obj3 = this.f1958o;
        Function1 function1 = this.n;
        boolean z = this.p;
        switch (b) {
            case 0:
                px4 px4Var = (px4) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    boolean zF = ux2Var.f(function1) | ux2Var.f(px4Var);
                    Object objK = ux2Var.K();
                    if (zF || objK == awVar) {
                        objK = new pv6(function1, px4Var, b2);
                        ux2Var.g0(objK);
                    }
                    Function0 function0 = (Function0) objK;
                    if (im3.n(px4Var.getValue(), "LOGFILE") && z) {
                        ux2Var.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(-2071965915);
                        ux2Var.p(false);
                    }
                    xo1.o(0, null, function0, ux2Var, fs4VarS);
                }
                break;
            case 1:
                px4 px4Var2 = (px4) obj3;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    if (im3.n(px4Var2.getValue(), "EULA_WEB") && z) {
                        ux2Var2.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var2.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-2071965915);
                        ux2Var2.p(false);
                    }
                    boolean zF2 = ux2Var2.f(function1) | ux2Var2.f(px4Var2);
                    Object objK2 = ux2Var2.K();
                    if (zF2 || objK2 == awVar) {
                        objK2 = new pv6(function1, px4Var2, (byte) 13);
                        ux2Var2.g0(objK2);
                    }
                    vs1.c(0, null, (Function0) objK2, ux2Var2, fs4VarS);
                }
                break;
            case 2:
                px4 px4Var3 = (px4) obj3;
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    if (im3.n(px4Var3.getValue(), "PRIVACY_POLICY_WEB") && z) {
                        ux2Var3.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var3.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var3.p(false);
                    } else {
                        ux2Var3.W(-2071965915);
                        ux2Var3.p(false);
                    }
                    boolean zF3 = ux2Var3.f(function1) | ux2Var3.f(px4Var3);
                    Object objK3 = ux2Var3.K();
                    if (zF3 || objK3 == awVar) {
                        objK3 = new pv6(function1, px4Var3, b3);
                        ux2Var3.g0(objK3);
                    }
                    ds1.v(0, null, (Function0) objK3, ux2Var3, fs4VarS);
                }
                break;
            case 3:
                px4 px4Var4 = (px4) obj3;
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else {
                    if (im3.n(px4Var4.getValue(), "COPYRIGHT") && z) {
                        ux2Var4.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var4.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var4.p(false);
                    } else {
                        ux2Var4.W(-2071965915);
                        ux2Var4.p(false);
                    }
                    boolean zF4 = ux2Var4.f(function1) | ux2Var4.f(px4Var4);
                    Object objK4 = ux2Var4.K();
                    if (zF4 || objK4 == awVar) {
                        objK4 = new pv6(function1, px4Var4, (byte) 3);
                        ux2Var4.g0(objK4);
                    }
                    kh.e(0, null, (Function0) objK4, ux2Var4, fs4VarS);
                }
                break;
            case 4:
                px4 px4Var5 = (px4) obj3;
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!ux2Var5.N(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    ux2Var5.Q();
                } else {
                    boolean zF5 = ux2Var5.f(function1) | ux2Var5.f(px4Var5);
                    Object objK5 = ux2Var5.K();
                    if (zF5 || objK5 == awVar) {
                        objK5 = new pv6(function1, px4Var5, (byte) 7);
                        ux2Var5.g0(objK5);
                    }
                    Function0 function2 = (Function0) objK5;
                    if (im3.n(px4Var5.getValue(), "PERMISSIONS") && z) {
                        ux2Var5.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var5.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var5.p(false);
                    } else {
                        ux2Var5.W(-2071965915);
                        ux2Var5.p(false);
                    }
                    vt1.g(0, null, function2, ux2Var5, fs4VarS);
                }
                break;
            case 5:
                px4 px4Var6 = (px4) obj3;
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ux2Var6.N(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    ux2Var6.Q();
                } else {
                    boolean zF6 = ux2Var6.f(function1) | ux2Var6.f(px4Var6);
                    Object objK6 = ux2Var6.K();
                    if (zF6 || objK6 == awVar) {
                        objK6 = new pv6(function1, px4Var6, (byte) 11);
                        ux2Var6.g0(objK6);
                    }
                    Function0 function3 = (Function0) objK6;
                    if (im3.n(px4Var6.getValue(), "FEEDBACK") && z) {
                        ux2Var6.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var6.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var6.p(false);
                    } else {
                        ux2Var6.W(-2071965915);
                        ux2Var6.p(false);
                    }
                    wo1.f(0, null, function3, ux2Var6, fs4VarS);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                xo1.j(z, function1, (Function1) obj3, (ux2) obj, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ rv6(Function1 function1, px4 px4Var, boolean z, byte b) {
        this.m = b;
        this.n = function1;
        this.f1958o = px4Var;
        this.p = z;
    }
}
