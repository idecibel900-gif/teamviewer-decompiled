package o;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dy implements iw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f663o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ pw2 q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ dy(ul1 ul1Var, boolean z, px4 px4Var, dw6 dw6Var, boolean z2, a06 a06Var, iv6 iv6Var, Function0 function0, me1 me1Var) {
        this.s = ul1Var;
        this.n = z;
        this.f663o = px4Var;
        this.t = dw6Var;
        this.p = z2;
        this.u = a06Var;
        this.v = iv6Var;
        this.q = function0;
        this.r = me1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean, int] */
    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        ?? r5;
        Object l8Var;
        me1 me1Var;
        xy6 xy6Var;
        ux2 ux2Var;
        Function0 function0;
        px4 px4Var;
        iy iyVar;
        Object obj4;
        byte b = this.m;
        aw awVar = e01.a;
        f88 f88Var = f88.a;
        Object obj5 = this.v;
        Object obj6 = this.u;
        Object obj7 = this.f663o;
        pw2 pw2Var = this.q;
        Object obj8 = this.r;
        Object obj9 = this.t;
        Object obj10 = this.s;
        char c = 1;
        switch (b) {
            case 0:
                iy iyVar2 = (iy) obj10;
                xy6 xy6Var2 = (xy6) obj9;
                me1 me1Var2 = (me1) obj8;
                Function0 function1 = (Function0) pw2Var;
                px4 px4Var2 = (px4) obj7;
                px4 px4Var3 = (px4) obj6;
                Context context = (Context) obj5;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    bw bwVar = iq8.c;
                    w50 w50Var = xz2.B;
                    cs4 cs4Var = cs4.b;
                    fs4 fs4VarF = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10);
                    kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var2, 54);
                    int iHashCode = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL = ux2Var2.l();
                    fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(LayoutNode.e0);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var2);
                    o67.n(yj5VarL, d82.u, ux2Var2);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                    o67.l(ux2Var2);
                    o67.n(fs4VarS, d82.t, ux2Var2);
                    db8.d(this.n, this.p, ((Boolean) px4Var2.getValue()).booleanValue(), ux2Var2, 6);
                    au0 au0Var = (au0) ux2Var2.j(b11.f);
                    String strZ = m77.z(R.string.enter_content_description, ux2Var2);
                    fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    Object objK = ux2Var2.K();
                    if (objK == awVar) {
                        objK = new va(px4Var2, (byte) 3);
                        ux2Var2.g0(objK);
                    }
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.z(fs4VarC, (Function1) objK), "TVTA-settings-version-attractionGuidTextField");
                    boolean zF = ux2Var2.f(strZ);
                    Object objK2 = ux2Var2.K();
                    if (zF || objK2 == awVar) {
                        r5 = 0;
                        objK2 = new fy(strZ, 0 == true ? 1 : 0);
                        ux2Var2.g0(objK2);
                    } else {
                        r5 = 0;
                    }
                    fs4 fs4VarA2 = cp6.a(fs4VarA, r5, (Function1) objK2);
                    String str = (String) px4Var3.getValue();
                    qf6 qf6Var = ((rn4) ux2Var2.j(un4.a)).c.b;
                    yx3 yx3Var = new yx3(r5, 7, 119);
                    boolean zH = ux2Var2.h(iyVar2) | ux2Var2.h(me1Var2) | ux2Var2.f(xy6Var2) | ux2Var2.f(function1);
                    Object objK3 = ux2Var2.K();
                    if (zH || objK3 == awVar) {
                        me1Var = me1Var2;
                        xy6Var = xy6Var2;
                        ux2Var = ux2Var2;
                        function0 = function1;
                        px4Var = px4Var3;
                        iyVar = iyVar2;
                        l8Var = new l8(iyVar, me1Var, px4Var, xy6Var, function0);
                        ux2Var.g0(l8Var);
                    } else {
                        ux2Var = ux2Var2;
                        l8Var = objK3;
                        me1Var = me1Var2;
                        xy6Var = xy6Var2;
                        function0 = function1;
                        px4Var = px4Var3;
                        iyVar = iyVar2;
                    }
                    xx3 xx3Var = new xx3((Function1) l8Var, 62);
                    Object objK4 = ux2Var.K();
                    if (objK4 == awVar) {
                        objK4 = new va(px4Var, (byte) 4);
                        ux2Var.g0(objK4);
                    }
                    bt1.e(str, (Function1) objK4, fs4VarA2, false, false, null, kh.c, kh.d, null, au8.O(-1988998606, new f9((Object) au0Var, (Object) context, (Object) px4Var, (byte) 3), ux2Var), null, false, null, yx3Var, xx3Var, true, 0, 0, qf6Var, null, ux2Var, 819462192, 12779520, 6061368);
                    b77.a(ux2Var, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
                    boolean z = ((String) px4Var.getValue()).length() > 0;
                    fs4 fs4VarF2 = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    boolean zH2 = ux2Var.h(iyVar) | ux2Var.h(me1Var) | ux2Var.f(xy6Var) | ux2Var.f(function0);
                    Object objK5 = ux2Var.K();
                    if (zH2 || objK5 == awVar) {
                        bk bkVar = new bk(iyVar, me1Var, px4Var, xy6Var, function0);
                        ux2Var.g0(bkVar);
                        objK5 = bkVar;
                    }
                    m77.g((Function0) objK5, fs4VarF2, null, z, "TVTA-settings-version-AttractionGuidOkButton", null, kh.g, ux2Var, 1597488, 36);
                    ux2Var.p(true);
                }
                break;
            case 1:
                ul1 ul1Var = (ul1) obj10;
                px4 px4Var4 = (px4) obj7;
                dw6 dw6Var = (dw6) obj9;
                a06 a06Var = (a06) obj6;
                iv6 iv6Var = (iv6) obj5;
                Function0 function2 = (Function0) pw2Var;
                me1 me1Var3 = (me1) obj8;
                xu7 xu7Var = (xu7) obj;
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xu7Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? ux2Var3.f(xu7Var) : ux2Var3.h(xu7Var) ? 4 : 2;
                }
                if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ux2Var3.Q();
                } else {
                    qu7 qu7VarD = ul1Var.d();
                    String string = (qu7VarD == null || (obj4 = qu7VarD.b) == null) ? null : obj4.toString();
                    boolean z2 = this.n;
                    if (!z2 || string == null) {
                        if (z2 && px4Var4.getValue() != null) {
                            string = (String) px4Var4.getValue();
                        } else if (z2 && dw6Var.a) {
                            string = "ACCOUNT";
                        } else if (z2) {
                            string = "LOGIN";
                        }
                    }
                    if (string == null || string.equals("SCAN_QR")) {
                        ux2Var3.W(98652206);
                        ux2Var3.p(false);
                    } else {
                        ux2Var3.W(97947793);
                        ne5.a(xu7Var, null, null, null, null, au8.O(1033208199, new dy(this.p, z2, a06Var, dw6Var, iv6Var, string, function2, me1Var3, ul1Var), ux2Var3), ux2Var3, (iIntValue2 & 14) | 1572864);
                        ux2Var3.p(false);
                    }
                }
                break;
            case 2:
                a06 a06Var2 = (a06) obj10;
                dw6 dw6Var2 = (dw6) obj9;
                iv6 iv6Var2 = (iv6) obj7;
                String str2 = (String) obj6;
                Function0 function3 = (Function0) pw2Var;
                me1 me1Var4 = (me1) obj8;
                ul1 ul1Var2 = (ul1) obj5;
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((tn) obj).getClass();
                if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ux2Var4.Q();
                } else {
                    boolean zH3 = ux2Var4.h(me1Var4) | ux2Var4.f(ul1Var2);
                    Object objK6 = ux2Var4.K();
                    if (zH3 || objK6 == awVar) {
                        objK6 = new rw1(me1Var4, ul1Var2, c == true ? 1 : 0);
                        ux2Var4.g0(objK6);
                    }
                    wo1.t(this.n, this.p, a06Var2, dw6Var2, iv6Var2, str2, function3, (Function0) objK6, ux2Var4, 0);
                }
                break;
            default:
                zr7 zr7Var = (zr7) obj10;
                tg8 tg8Var = (tg8) obj9;
                mw4 mw4Var = (mw4) obj8;
                hw2 hw2Var = (hw2) pw2Var;
                hw2 hw2Var2 = (hw2) obj7;
                pw6 pw6Var = (pw6) obj6;
                cq7 cq7Var = (cq7) obj5;
                hw2 hw2Var3 = (hw2) obj;
                ux2 ux2Var5 = (ux2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ux2Var5.h(hw2Var3) ? 4 : 2;
                }
                if (!ux2Var5.N(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    ux2Var5.Q();
                } else {
                    jk0.P.c(zr7Var.a.n, hw2Var3, this.n, this.p, tg8Var, mw4Var, hw2Var, hw2Var2, pw6Var, cq7Var, null, null, ux2Var5, (iIntValue4 << 3) & 112);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ dy(zr7 zr7Var, boolean z, boolean z2, tg8 tg8Var, mw4 mw4Var, hw2 hw2Var, hw2 hw2Var2, pw6 pw6Var, cq7 cq7Var) {
        this.s = zr7Var;
        this.n = z;
        this.p = z2;
        this.t = tg8Var;
        this.r = mw4Var;
        this.q = hw2Var;
        this.f663o = hw2Var2;
        this.u = pw6Var;
        this.v = cq7Var;
    }

    public /* synthetic */ dy(boolean z, boolean z2, iy iyVar, xy6 xy6Var, me1 me1Var, Function0 function0, px4 px4Var, px4 px4Var2, Context context) {
        this.n = z;
        this.p = z2;
        this.s = iyVar;
        this.t = xy6Var;
        this.r = me1Var;
        this.q = function0;
        this.f663o = px4Var;
        this.u = px4Var2;
        this.v = context;
    }

    public /* synthetic */ dy(boolean z, boolean z2, a06 a06Var, dw6 dw6Var, iv6 iv6Var, String str, Function0 function0, me1 me1Var, ul1 ul1Var) {
        this.n = z;
        this.p = z2;
        this.s = a06Var;
        this.t = dw6Var;
        this.f663o = iv6Var;
        this.u = str;
        this.q = function0;
        this.r = me1Var;
        this.v = ul1Var;
    }
}
