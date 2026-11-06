package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1555o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ na(int i, Function0 function0, Function0 function1, fs4 fs4Var, boolean z) {
        this.m = (byte) 6;
        this.f1555o = z;
        this.n = function0;
        this.p = function1;
        this.q = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        boolean z = this.f1555o;
        fs4 fs4VarS = cs4.b;
        aw awVar = e01.a;
        boolean z2 = false;
        f88 f88Var = f88.a;
        Object obj3 = this.q;
        Object obj4 = this.n;
        Object obj5 = this.p;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                iq8.b((ea0) obj5, this.f1555o, (Function0) obj4, (fs4) obj3, (ux2) obj, yo1.Y(3073));
                break;
            case 1:
                hb3 hb3Var = (hb3) obj5;
                Function0 function0 = (Function0) obj4;
                i97 i97Var = (i97) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    z64 z64Var = (z64) hb3Var;
                    boolean zV0 = z64Var.V0();
                    j97 j97Var = z64Var.q.m;
                    if (!zV0) {
                        z2 = ((v64) j97Var.getValue()).a;
                    } else if (((v64) j97Var.getValue()).a && ((v64) j97Var.getValue()).d && ((v64) j97Var.getValue()).b && ((v64) j97Var.getValue()).c) {
                        z2 = true;
                    }
                    boolean zH = ux2Var.h(hb3Var);
                    Object objK = ux2Var.K();
                    if (zH || objK == awVar) {
                        ax1 ax1Var = new ax1(0, hb3Var, hb3.class, "onLegalAgreementAccepted", "onLegalAgreementAccepted()V", 0, (byte) 17);
                        ux2Var.g0(ax1Var);
                        objK = ax1Var;
                    }
                    v64 v64Var = (v64) i97Var.getValue();
                    Function0 function1 = (Function0) ((pu3) objK);
                    boolean zH2 = ux2Var.h(hb3Var);
                    Object objK2 = ux2Var.K();
                    if (zH2 || objK2 == awVar) {
                        objK2 = new t0(hb3Var, (byte) 29);
                        ux2Var.g0(objK2);
                    }
                    zu1.g(function0, function1, z2, v64Var, (hw2) objK2, this.f1555o, null, ux2Var, 0);
                }
                break;
            case 2:
                hw2 hw2Var = (hw2) obj5;
                np4 np4Var = (np4) obj4;
                hw2 hw2Var2 = (hw2) obj3;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    if (hw2Var != null) {
                        ux2Var2.W(-864613344);
                        j51.l(wa1.a.a(new rv0(z ? np4Var.b : np4Var.e)), au8.O(1241781204, new xd(hw2Var, (byte) 3), ux2Var2), ux2Var2, 56);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-864297175);
                        ux2Var2.p(false);
                    }
                    j51.l(wa1.a.a(new rv0(z ? np4Var.a : np4Var.d)), au8.O(-893579015, new l64(hw2Var, hw2Var2, (byte) 5), ux2Var2), ux2Var2, 56);
                    ux2Var2.W(-863079991);
                    ux2Var2.p(false);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                io1.t(this.f1555o, (rr6) obj5, (fs4) obj3, (Function0) obj4, (ux2) obj, yo1.Y(385));
                break;
            case 4:
                Context context = (Context) obj5;
                Function1 function2 = (Function1) obj4;
                px4 px4Var = (px4) obj3;
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else if (rz2.d.b(context, sz2.a) != 0) {
                    ux2Var3.W(-565789101);
                    ux2Var3.p(false);
                } else {
                    ux2Var3.W(-566212902);
                    boolean zF = ux2Var3.f(function2) | ux2Var3.f(px4Var);
                    Object objK3 = ux2Var3.K();
                    if (zF || objK3 == awVar) {
                        objK3 = new pv6(function2, px4Var, (byte) 8);
                        ux2Var3.g0(objK3);
                    }
                    Function0 function3 = (Function0) objK3;
                    if (im3.n(px4Var.getValue(), "TFA") && z) {
                        ux2Var3.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var3.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var3.p(false);
                    } else {
                        ux2Var3.W(-2071965915);
                        ux2Var3.p(false);
                    }
                    h67.d(0, null, function3, ux2Var3, fs4VarS);
                    ux2Var3.p(false);
                }
                break;
            case 5:
                dw6 dw6Var = (dw6) obj5;
                Function1 function4 = (Function1) obj4;
                px4 px4Var2 = (px4) obj3;
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else if (!dw6Var.k) {
                    ux2Var4.W(1370230384);
                    ux2Var4.p(false);
                } else {
                    ux2Var4.W(1369733950);
                    int i = dw6Var.g ? R.string.settings_biometric_preferences_subtitle_enabled : R.string.settings_biometric_preferences_subtitle_disabled;
                    if (im3.n(px4Var2.getValue(), "BIOMETRICS") && z) {
                        ux2Var4.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var4.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var4.p(false);
                    } else {
                        ux2Var4.W(-2071965915);
                        ux2Var4.p(false);
                    }
                    fs4 fs4Var = fs4VarS;
                    boolean zF2 = ux2Var4.f(function4) | ux2Var4.f(px4Var2);
                    Object objK4 = ux2Var4.K();
                    if (zF2 || objK4 == awVar) {
                        objK4 = new pv6(function4, px4Var2, (byte) 10);
                        ux2Var4.g0(objK4);
                    }
                    e8.b(i, 0, null, (Function0) objK4, ux2Var4, fs4Var);
                    ux2Var4.p(false);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                of7.a(yo1.Y(3073), (Function0) obj4, (Function0) obj5, (ux2) obj, (fs4) obj3, this.f1555o);
                break;
            case 7:
                Function1 function5 = (Function1) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ux2Var5.Q();
                } else {
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(fs4VarS, str.concat("-TVListItemSwitch"));
                    boolean zF3 = ux2Var5.f(str2);
                    Object objK5 = ux2Var5.K();
                    if (zF3 || objK5 == awVar) {
                        objK5 = new fy(str2, (byte) 21);
                        ux2Var5.g0(objK5);
                    }
                    hh7.a(this.f1555o, function5, cp6.a(fs4VarA, false, (Function1) objK5), false, null, ux2Var5, 0);
                }
                break;
            default:
                mw4 mw4Var = (mw4) obj5;
                cq7 cq7Var = (cq7) obj4;
                pw6 pw6Var = (pw6) obj3;
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ux2Var6.Q();
                } else {
                    jk0.P.b(this.f1555o, mw4Var, cq7Var, pw6Var, ux2Var6, 114822144);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ na(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.m = b;
        this.p = obj;
        this.n = obj2;
        this.f1555o = z;
        this.q = obj3;
    }

    public /* synthetic */ na(Object obj, Function1 function1, px4 px4Var, boolean z, byte b) {
        this.m = b;
        this.p = obj;
        this.n = function1;
        this.q = px4Var;
        this.f1555o = z;
    }

    public /* synthetic */ na(ea0 ea0Var, boolean z, Function0 function0, fs4 fs4Var, int i) {
        this.m = (byte) 0;
        this.p = ea0Var;
        this.f1555o = z;
        this.n = function0;
        this.q = fs4Var;
    }

    public /* synthetic */ na(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.f1555o = z;
        this.p = obj;
        this.n = obj2;
        this.q = obj3;
    }

    public /* synthetic */ na(boolean z, rr6 rr6Var, fs4 fs4Var, Function0 function0, int i) {
        this.m = (byte) 3;
        this.f1555o = z;
        this.p = rr6Var;
        this.q = fs4Var;
        this.n = function0;
    }
}
