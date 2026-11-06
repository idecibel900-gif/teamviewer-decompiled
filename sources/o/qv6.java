package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qv6 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ dw6 f1872o;
    public final /* synthetic */ iv6 p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ px4 r;

    public /* synthetic */ qv6(dw6 dw6Var, iv6 iv6Var, Function1 function1, px4 px4Var, boolean z) {
        this.m = (byte) 2;
        this.f1872o = dw6Var;
        this.p = iv6Var;
        this.q = function1;
        this.r = px4Var;
        this.n = z;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        byte b2 = 9;
        byte b3 = 12;
        f88 f88Var = f88.a;
        aw awVar = e01.a;
        px4 px4Var = this.r;
        Function1 function1 = this.q;
        iv6 iv6Var = this.p;
        dw6 dw6Var = this.f1872o;
        fs4 fs4VarS = cs4.b;
        byte b4 = 1;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    boolean z = dw6Var.c;
                    boolean zF = ux2Var.f(iv6Var);
                    Object objK = ux2Var.K();
                    if (zF || objK == awVar) {
                        objK = new lv6(iv6Var, (byte) 10);
                        ux2Var.g0(objK);
                    }
                    Function1 function2 = (Function1) objK;
                    int i = dw6Var.c ? R.string.settings_preferences_subtitle_enabled : R.string.settings_preferences_subtitle_disabled;
                    boolean zF2 = ux2Var.f(function1) | ux2Var.f(px4Var);
                    Object objK2 = ux2Var.K();
                    if (zF2 || objK2 == awVar) {
                        objK2 = new pv6(function1, px4Var, (byte) 6);
                        ux2Var.g0(objK2);
                    }
                    Function0 function0 = (Function0) objK2;
                    boolean zN = im3.n(px4Var.getValue(), "PASSWORDS");
                    boolean z2 = this.n;
                    if (zN && z2) {
                        ux2Var.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(-2071965915);
                        ux2Var.p(false);
                    }
                    it1.f(z2, z, function2, i, function0, fs4VarS, null, ux2Var, 0);
                }
                break;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    boolean z3 = dw6Var.i;
                    Function1 function3 = iv6Var.g;
                    int i2 = z3 ? R.string.settings_preferences_subtitle_enabled : R.string.settings_preferences_subtitle_disabled;
                    boolean zF3 = ux2Var2.f(function1) | ux2Var2.f(px4Var);
                    Object objK3 = ux2Var2.K();
                    if (zF3 || objK3 == awVar) {
                        objK3 = new pv6(function1, px4Var, b3);
                        ux2Var2.g0(objK3);
                    }
                    Function0 function4 = (Function0) objK3;
                    boolean zN2 = im3.n(px4Var.getValue(), "ADVANCED_LOGGING");
                    boolean z4 = this.n;
                    if (zN2 && z4) {
                        ux2Var2.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var2.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-2071965915);
                        ux2Var2.p(false);
                    }
                    ka0.b(z4, z3, function3, i2, function4, fs4VarS, null, ux2Var2, 0);
                }
                break;
            case 2:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    boolean z5 = dw6Var.a;
                    g2 g2Var = z5 ? tv6.n : uv6.n;
                    Function0 function5 = iv6Var.m;
                    if (im3.n(px4Var.getValue(), (String) g2Var.m) && this.n) {
                        ux2Var3.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var3.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var3.p(false);
                    } else {
                        ux2Var3.W(-2071965915);
                        ux2Var3.p(false);
                    }
                    fs4 fs4Var = fs4VarS;
                    boolean zF4 = ux2Var3.f(function1) | ux2Var3.f(px4Var) | ux2Var3.h(g2Var);
                    Object objK4 = ux2Var3.K();
                    if (zF4 || objK4 == awVar) {
                        objK4 = new n5(g2Var, function1, px4Var, (byte) 29);
                        ux2Var3.g0(objK4);
                    }
                    qf0.a(z5, function5, (Function0) objK4, fs4Var, null, null, ux2Var3, 0);
                }
                break;
            case 3:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else {
                    boolean z6 = dw6Var.b;
                    boolean zF5 = ux2Var4.f(iv6Var);
                    Object objK5 = ux2Var4.K();
                    if (zF5 || objK5 == awVar) {
                        objK5 = new lv6(iv6Var, (byte) 8);
                        ux2Var4.g0(objK5);
                    }
                    Function1 function6 = (Function1) objK5;
                    int i3 = dw6Var.b ? R.string.settings_preferences_subtitle_enabled : R.string.settings_preferences_subtitle_disabled;
                    boolean zF6 = ux2Var4.f(function1) | ux2Var4.f(px4Var);
                    Object objK6 = ux2Var4.K();
                    if (zF6 || objK6 == awVar) {
                        objK6 = new pv6(function1, px4Var, (byte) 4);
                        ux2Var4.g0(objK6);
                    }
                    Function0 function7 = (Function0) objK6;
                    boolean zN3 = im3.n(px4Var.getValue(), "REMOTE_CURSOR");
                    boolean z7 = this.n;
                    if (zN3 && z7) {
                        ux2Var4.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var4.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var4.p(false);
                    } else {
                        ux2Var4.W(-2071965915);
                        ux2Var4.p(false);
                    }
                    io1.q(z7, z6, function6, i3, function7, fs4VarS, null, ux2Var4, 0);
                }
                break;
            case 4:
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ux2Var5.Q();
                } else {
                    boolean z8 = dw6Var.e;
                    boolean zF7 = ux2Var5.f(iv6Var);
                    Object objK7 = ux2Var5.K();
                    if (zF7 || objK7 == awVar) {
                        objK7 = new lv6(iv6Var, (byte) 9);
                        ux2Var5.g0(objK7);
                    }
                    Function1 function8 = (Function1) objK7;
                    int i4 = dw6Var.e ? R.string.settings_preferences_subtitle_enabled : R.string.settings_preferences_subtitle_disabled;
                    boolean zF8 = ux2Var5.f(function1) | ux2Var5.f(px4Var);
                    Object objK8 = ux2Var5.K();
                    if (zF8 || objK8 == awVar) {
                        objK8 = new pv6(function1, px4Var, (byte) 5);
                        ux2Var5.g0(objK8);
                    }
                    Function0 function9 = (Function0) objK8;
                    boolean zN4 = im3.n(px4Var.getValue(), "WALLPAPER");
                    boolean z9 = this.n;
                    if (zN4 && z9) {
                        ux2Var5.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var5.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var5.p(false);
                    } else {
                        ux2Var5.W(-2071965915);
                        ux2Var5.p(false);
                    }
                    o77.d(z9, z8, function8, i4, function9, fs4VarS, null, ux2Var5, 0);
                }
                break;
            case 5:
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ux2Var6.Q();
                } else {
                    boolean z10 = dw6Var.d;
                    boolean zF9 = ux2Var6.f(iv6Var);
                    Object objK9 = ux2Var6.K();
                    if (zF9 || objK9 == awVar) {
                        objK9 = new lv6(iv6Var, (byte) 11);
                        ux2Var6.g0(objK9);
                    }
                    Function1 function10 = (Function1) objK9;
                    int i5 = dw6Var.d ? R.string.settings_preferences_subtitle_enabled : R.string.settings_preferences_subtitle_disabled;
                    boolean zF10 = ux2Var6.f(function1) | ux2Var6.f(px4Var);
                    Object objK10 = ux2Var6.K();
                    if (zF10 || objK10 == awVar) {
                        objK10 = new pv6(function1, px4Var, b2);
                        ux2Var6.g0(objK10);
                    }
                    Function0 function11 = (Function0) objK10;
                    boolean zN5 = im3.n(px4Var.getValue(), "UDP");
                    boolean z11 = this.n;
                    if (zN5 && z11) {
                        ux2Var6.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var6.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var6.p(false);
                    } else {
                        ux2Var6.W(-2071965915);
                        ux2Var6.p(false);
                    }
                    xo1.f(z11, z10, function10, i5, function11, fs4VarS, null, ux2Var6, 0);
                }
                break;
            default:
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ux2Var7.Q();
                } else {
                    boolean z12 = dw6Var.f;
                    boolean zF11 = ux2Var7.f(iv6Var);
                    Object objK11 = ux2Var7.K();
                    if (zF11 || objK11 == awVar) {
                        objK11 = new lv6(iv6Var, (byte) 12);
                        ux2Var7.g0(objK11);
                    }
                    Function1 function12 = (Function1) objK11;
                    int i6 = dw6Var.f ? R.string.settings_preferences_subtitle_enabled : R.string.settings_preferences_subtitle_disabled;
                    boolean zF12 = ux2Var7.f(function1) | ux2Var7.f(px4Var);
                    Object objK12 = ux2Var7.K();
                    if (zF12 || objK12 == awVar) {
                        objK12 = new pv6(function1, px4Var, b4);
                        ux2Var7.g0(objK12);
                    }
                    Function0 function13 = (Function0) objK12;
                    boolean zN6 = im3.n(px4Var.getValue(), "MUSIC_AND_SOUND");
                    boolean z13 = this.n;
                    if (zN6 && z13) {
                        ux2Var7.W(-2072141034);
                        fs4VarS = au8.s(fs4VarS, ((rn4) ux2Var7.j(un4.a)).a.r, sf6.a(16.0f));
                        ux2Var7.p(false);
                    } else {
                        ux2Var7.W(-2071965915);
                        ux2Var7.p(false);
                    }
                    n67.e(z13, z12, function12, i6, function13, fs4VarS, null, ux2Var7, 0);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ qv6(boolean z, dw6 dw6Var, iv6 iv6Var, Function1 function1, px4 px4Var, byte b) {
        this.m = b;
        this.n = z;
        this.f1872o = dw6Var;
        this.p = iv6Var;
        this.q = function1;
        this.r = px4Var;
    }
}
