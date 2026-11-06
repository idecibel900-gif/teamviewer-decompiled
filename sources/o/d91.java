package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d91 implements iw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f598o;
    public final /* synthetic */ Object p;

    public /* synthetic */ d91(l71 l71Var, Function1 function1, boolean z) {
        this.f598o = l71Var;
        this.p = function1;
        this.n = z;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        aw awVar = e01.a;
        Object obj4 = this.p;
        boolean z = this.n;
        Object obj5 = this.f598o;
        byte b2 = 0;
        switch (b) {
            case 0:
                l71 l71Var = (l71) obj5;
                Function1 function1 = (Function1) obj4;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    w50 w50Var = xz2.B;
                    cs4 cs4Var = cs4.b;
                    fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    hk6 hk6VarW = im3.W(ux2Var);
                    Object objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = ck3.w(ux2Var);
                        ux2Var.g0(objK);
                    }
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(o77.t(fs4VarC, hk6VarW, (me1) objK), "TVTA-contacts-filtering-bottomSheet");
                    kw0 kw0VarA = iw0.a(iq8.c, w50Var, ux2Var, 48);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    qs7.b(m77.z(R.string.view_contacts, ux2Var), androidx.compose.ui.platform.a.a(ka0.D(cs4Var, 16.0f, 0.0f, 2), "TVTA-contacts-filtering-bottomSheetTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(un4.a)).b.g, ux2Var, 48, 0, 131068);
                    lv1.k(ka0.E(cs4Var, 16.0f, 16.0f, 16.0f, 24.0f), 0.0f, 0L, ux2Var, 0, 6);
                    ux2Var.W(1503779762);
                    sa4 sa4VarT = qf0.t();
                    sa4VarT.add(new k71(m77.z(R.string.contacts_all, ux2Var), R.drawable.ic_all_contacts, l71.m, ra1.R, "TVTA-contacts-filtering-optionAll"));
                    if (z) {
                        ux2Var.W(-863992528);
                        sa4VarT.add(new k71(m77.z(R.string.contacts_company, ux2Var), R.drawable.ic_company_contact, l71.f1335o, ra1.S, "TVTA-contacts-filtering-optionCompany"));
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(-863445719);
                        ux2Var.p(false);
                    }
                    sa4VarT.add(new k71(m77.z(R.string.contacts_personal, ux2Var), R.drawable.ic_personal_contact, l71.n, ra1.T, "TVTA-contacts-filtering-optionPersonal"));
                    sa4VarT.add(new k71(m77.z(R.string.contacts_invitation, ux2Var), R.drawable.ic_invitation_contact, l71.p, ra1.U, "TVTA-contacts-filtering-optionInvitation"));
                    sa4 sa4VarR = qf0.r(sa4VarT);
                    ux2Var.p(false);
                    hm3.d(sa4VarR, l71Var, null, function1, ux2Var, 0);
                    ux2Var.p(true);
                } else {
                    ux2Var.Q();
                }
                return f88.a;
            default:
                hr7 hr7Var = (hr7) obj5;
                bg5 bg5Var = hr7Var.f;
                mw4 mw4Var = (mw4) obj4;
                ux2 ux2Var2 = (ux2) obj2;
                ((Integer) obj3).getClass();
                ux2Var2.W(-2137546592);
                boolean z2 = ((gb5) bg5Var.getValue()) == gb5.m || !(ux2Var2.j(b11.n) == j04.n);
                boolean zF = ux2Var2.f(hr7Var);
                Object objK2 = ux2Var2.K();
                if (zF || objK2 == awVar) {
                    objK2 = new er7(hr7Var, b2);
                    ux2Var2.g0(objK2);
                }
                px4 px4VarT = h57.t((Function1) objK2, ux2Var2);
                Object objK3 = ux2Var2.K();
                if (objK3 == awVar) {
                    wk1 wk1Var = new wk1(new va(px4VarT, (byte) 23));
                    ux2Var2.g0(wk1Var);
                    objK3 = wk1Var;
                }
                tk6 tk6Var = (tk6) objK3;
                boolean zF2 = ux2Var2.f(tk6Var) | ux2Var2.f(hr7Var);
                Object objK4 = ux2Var2.K();
                if (zF2 || objK4 == awVar) {
                    objK4 = new gr7(tk6Var, hr7Var);
                    ux2Var2.g0(objK4);
                }
                fs4 fs4VarA2 = ok6.a((gr7) objK4, (gb5) bg5Var.getValue(), z && hr7Var.b.z() != 0.0f, z2, mw4Var);
                ux2Var2.p(false);
                return fs4VarA2;
        }
    }

    public /* synthetic */ d91(hr7 hr7Var, boolean z, mw4 mw4Var) {
        this.f598o = hr7Var;
        this.n = z;
        this.p = mw4Var;
    }
}
