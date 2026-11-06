package o;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.LegalAgreementActivity;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sd implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2009o;

    public /* synthetic */ sd(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f2009o = obj2;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        h72 h72Var;
        long j;
        Typeface typeface;
        byte b = this.m;
        tg3 tg3Var = LayoutNode.e0;
        hc1 hc1Var = null;
        byte b2 = 19;
        cs4 cs4Var = cs4.b;
        aw awVar = e01.a;
        f88 f88Var = f88.a;
        Object obj4 = this.f2009o;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                j04 j04Var = (j04) obj5;
                yy0 yy0Var = (yy0) obj4;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (ux2Var.N(1 & iIntValue, (iIntValue & 17) != 16)) {
                    j51.l(b11.n.a(j04Var), yy0Var, ux2Var, 8);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            case 1:
                p31 p31Var = (p31) obj5;
                i31 i31Var = (i31) obj4;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bo) obj).getClass();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    yy0 yy0Var2 = im3.c;
                    vt5 vt5Var = new vt5(m77.z(p31Var.l ? R.string.tv_qs_promotion_open : R.string.tv_qs_promotion_download, ux2Var2));
                    ut5 ut5Var = new ut5(m77.z(R.string.quick_support_card_description, ux2Var2));
                    Integer numValueOf = Integer.valueOf(R.drawable.ic_close);
                    String strZ = m77.z(R.string.close_content_description, ux2Var2);
                    boolean zF = ux2Var2.f(i31Var);
                    Object objK = ux2Var2.K();
                    if (zF || objK == awVar) {
                        objK = new n31(i31Var, (byte) 1);
                        ux2Var2.g0(objK);
                    }
                    tt5 tt5Var = new tt5(numValueOf, strZ, (Function0) objK);
                    boolean zF2 = ux2Var2.f(i31Var);
                    Object objK2 = ux2Var2.K();
                    if (zF2 || objK2 == awVar) {
                        objK2 = new n31(i31Var, (byte) 2);
                        ux2Var2.g0(objK2);
                    }
                    Function0 function0 = (Function0) objK2;
                    Object objK3 = ux2Var2.K();
                    if (objK3 == awVar) {
                        objK3 = new y01((byte) 13);
                        ux2Var2.g0(objK3);
                    }
                    ct1.j(yy0Var2, vt5Var, ut5Var, tt5Var, null, function0, (Function0) objK3, ux2Var2, 1572870, 16);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            case 2:
                a91 a91Var = (a91) obj5;
                Function1 function1 = (Function1) obj4;
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    w50 w50Var = xz2.B;
                    fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    hk6 hk6VarW = im3.W(ux2Var3);
                    Object objK4 = ux2Var3.K();
                    if (objK4 == awVar) {
                        objK4 = ck3.w(ux2Var3);
                        ux2Var3.g0(objK4);
                    }
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(o77.t(fs4VarC, hk6VarW, (me1) objK4), "TVTA-contacts-sorting-bottomSheet");
                    kw0 kw0VarA = iw0.a(iq8.c, w50Var, ux2Var3, 48);
                    int iHashCode = Long.hashCode(ux2Var3.T);
                    yj5 yj5VarL = ux2Var3.l();
                    fs4 fs4VarS = uf0.s(ux2Var3, fs4VarA);
                    yz0.c.getClass();
                    ux2Var3.a0();
                    if (ux2Var3.S) {
                        ux2Var3.k(tg3Var);
                    } else {
                        ux2Var3.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var3);
                    o67.n(yj5VarL, d82.u, ux2Var3);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var3);
                    o67.l(ux2Var3);
                    o67.n(fs4VarS, d82.t, ux2Var3);
                    qs7.b(m77.z(R.string.sort_by, ux2Var3), androidx.compose.ui.platform.a.a(ka0.D(cs4Var, 16.0f, 0.0f, 2), "TVTA-contacts-sorting-bottomSheetTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.g, ux2Var3, 48, 0, 131068);
                    lv1.k(ka0.E(cs4Var, 16.0f, 16.0f, 16.0f, 24.0f), 0.0f, 0L, ux2Var3, 0, 6);
                    vn4.S(qf0.L(new z81(m77.z(R.string.sort_name_a_z, ux2Var3), a91.m, ra1.K, "TVTA-contacts-sorting-optionAscending"), new z81(m77.z(R.string.sort_name_z_a, ux2Var3), a91.n, ra1.L, "TVTA-contacts-sorting-optionDescending"), new z81(m77.z(R.string.sort_status_online, ux2Var3), a91.f309o, ra1.M, "TVTA-contacts-sorting-optionOnline"), new z81(m77.z(R.string.sort_status_offline, ux2Var3), a91.p, ra1.N, "TVTA-contacts-sorting-optionOffline"), new z81(m77.z(R.string.sort_status_pending, ux2Var3), a91.q, ra1.O, "TVTA-contacts-sorting-optionPending")), a91Var, null, function1, ux2Var3, 0);
                    ux2Var3.p(true);
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
            case 3:
                Function1 function2 = (Function1) obj5;
                zb1 zb1Var = (zb1) obj4;
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (ux2Var4.N(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                    Object objK5 = ux2Var4.K();
                    if (objK5 == awVar) {
                        objK5 = new ac1();
                        ux2Var4.g0(objK5);
                    }
                    ac1 ac1Var = (ac1) objK5;
                    ac1Var.a.clear();
                    function2.invoke(ac1Var);
                    ac1Var.a(zb1Var, ux2Var4, 0);
                } else {
                    ux2Var4.Q();
                }
                return f88Var;
            case 4:
                m13 m13Var = (m13) obj5;
                Function1 function3 = (Function1) obj4;
                ux2 ux2Var5 = (ux2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    w50 w50Var2 = xz2.B;
                    fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    hk6 hk6VarW2 = im3.W(ux2Var5);
                    Object objK6 = ux2Var5.K();
                    if (objK6 == awVar) {
                        objK6 = ck3.w(ux2Var5);
                        ux2Var5.g0(objK6);
                    }
                    fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(o77.t(fs4VarC2, hk6VarW2, (me1) objK6), "TVTA-groupDevices-sorting-bottomSheet");
                    kw0 kw0VarA2 = iw0.a(iq8.c, w50Var2, ux2Var5, 48);
                    int iHashCode2 = Long.hashCode(ux2Var5.T);
                    yj5 yj5VarL2 = ux2Var5.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var5, fs4VarA2);
                    yz0.c.getClass();
                    ux2Var5.a0();
                    if (ux2Var5.S) {
                        ux2Var5.k(tg3Var);
                    } else {
                        ux2Var5.j0();
                    }
                    o67.n(kw0VarA2, d82.v, ux2Var5);
                    o67.n(yj5VarL2, d82.u, ux2Var5);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var5);
                    o67.l(ux2Var5);
                    o67.n(fs4VarS2, d82.t, ux2Var5);
                    qs7.b(m77.z(R.string.sort_by, ux2Var5), androidx.compose.ui.platform.a.a(ka0.D(cs4Var, 16.0f, 0.0f, 2), "TVTA-groupDevices-sorting-bottomSheetTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var5.j(un4.a)).b.g, ux2Var5, 48, 0, 131068);
                    lv1.k(ka0.E(cs4Var, 16.0f, 16.0f, 16.0f, 24.0f), 0.0f, 0L, ux2Var5, 0, 6);
                    xs1.s(qf0.L(new l13(m77.z(R.string.sort_name_a_z, ux2Var5), m13.m, g02.J, "TVTA-groupDevices-sorting-optionAscending"), new l13(m77.z(R.string.sort_name_z_a, ux2Var5), m13.n, g02.K, "TVTA-groupDevices-sorting-optionDescending"), new l13(m77.z(R.string.sort_status_online, ux2Var5), m13.f1425o, g02.L, "TVTA-groupDevices-sorting-optionOnline"), new l13(m77.z(R.string.sort_status_offline, ux2Var5), m13.p, g02.M, "TVTA-groupDevices-sorting-optionOffline")), m13Var, null, function3, ux2Var5, 0);
                    ux2Var5.p(true);
                } else {
                    ux2Var5.Q();
                }
                return f88Var;
            case 5:
                a06 a06Var = (a06) obj5;
                LegalAgreementActivity legalAgreementActivity = (LegalAgreementActivity) obj4;
                nd5 nd5Var = (nd5) obj;
                ux2 ux2Var6 = (ux2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i = LegalAgreementActivity.O;
                nd5Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ux2Var6.f(nd5Var) ? 4 : 2;
                }
                if (ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    fs4 fs4VarA3 = ka0.A(cs4Var, nd5Var);
                    kw0 kw0VarA3 = iw0.a(iq8.c, xz2.A, ux2Var6, 0);
                    int iHashCode3 = Long.hashCode(ux2Var6.T);
                    yj5 yj5VarL3 = ux2Var6.l();
                    fs4 fs4VarS3 = uf0.s(ux2Var6, fs4VarA3);
                    yz0.c.getClass();
                    ux2Var6.a0();
                    if (ux2Var6.S) {
                        ux2Var6.k(tg3Var);
                    } else {
                        ux2Var6.j0();
                    }
                    o67.n(kw0VarA3, d82.v, ux2Var6);
                    o67.n(yj5VarL3, d82.u, ux2Var6);
                    o67.n(Integer.valueOf(iHashCode3), d82.w, ux2Var6);
                    o67.l(ux2Var6);
                    o67.n(fs4VarS3, d82.t, ux2Var6);
                    m77.i(null, ux2Var6, 0);
                    boolean zA = a06Var.a();
                    boolean z = a06Var.c;
                    boolean zH = ux2Var6.h(legalAgreementActivity);
                    Object objK7 = ux2Var6.K();
                    if (zH || objK7 == awVar) {
                        objK7 = new vm3(legalAgreementActivity, (byte) 4);
                        ux2Var6.g0(objK7);
                    }
                    lv1.l(zA, z, (Function0) objK7, null, null, ux2Var6, 1572864);
                    ux2Var6.p(true);
                } else {
                    ux2Var6.Q();
                }
                return f88Var;
            case 6:
                iw2 iw2Var = (iw2) obj5;
                j74 j74Var = (j74) obj4;
                ux2 ux2Var7 = (ux2) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((bo) obj).getClass();
                if (ux2Var7.N(1 & iIntValue7, (iIntValue7 & 17) != 16)) {
                    if (iw2Var == null) {
                        ux2Var7.W(-825696039);
                    } else {
                        ux2Var7.W(111911976);
                        iw2Var.d(j74Var, ux2Var7, 0);
                    }
                    ux2Var7.p(false);
                } else {
                    ux2Var7.Q();
                }
                return f88Var;
            case 7:
                a06 a06Var2 = (a06) obj5;
                M2MClientActivity m2MClientActivity = (M2MClientActivity) obj4;
                nd5 nd5Var2 = (nd5) obj;
                ux2 ux2Var8 = (ux2) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i2 = M2MClientActivity.h0;
                nd5Var2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ux2Var8.f(nd5Var2) ? 4 : 2;
                }
                if (ux2Var8.N(1 & iIntValue8, (iIntValue8 & 19) != 18)) {
                    boolean zH2 = ux2Var8.h(m2MClientActivity);
                    Object objK8 = ux2Var8.K();
                    if (zH2 || objK8 == awVar) {
                        objK8 = new ax1(0, m2MClientActivity, M2MClientActivity.class, "showEndSessionDialog", "showEndSessionDialog()V", 0, (byte) 18);
                        ux2Var8.g0(objK8);
                    }
                    g77.d(a06Var2, (Function0) ((pu3) objK8), ka0.A(cs4Var, nd5Var2), ux2Var8, 0);
                } else {
                    ux2Var8.Q();
                }
                return f88Var;
            case 8:
                UUID uuid = (UUID) obj5;
                Function1 function4 = (Function1) obj4;
                ux2 ux2Var9 = (ux2) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((w14) obj).getClass();
                if (ux2Var9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    String strZ2 = m77.z(R.string.device_tab_device_edit_no_policy, ux2Var9);
                    boolean z2 = uuid == null;
                    boolean zF3 = ux2Var9.f(function4);
                    Object objK9 = ux2Var9.K();
                    if (zF3 || objK9 == awVar) {
                        objK9 = new qv1(function4, (byte) 12);
                        ux2Var9.g0(objK9);
                    }
                    ct1.i(strZ2, R.drawable.no_policy, z2, (Function0) objK9, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-deviceEditScreen-policySelector-noPolicy"), ux2Var9, 24576);
                } else {
                    ux2Var9.Q();
                }
                return f88Var;
            case ep1.b /* 9 */:
                a06 a06Var3 = (a06) obj5;
                RCClientActivity rCClientActivity = (RCClientActivity) obj4;
                nd5 nd5Var3 = (nd5) obj;
                ux2 ux2Var10 = (ux2) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i3 = RCClientActivity.c0;
                nd5Var3.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ux2Var10.f(nd5Var3) ? 4 : 2;
                }
                if (ux2Var10.N(1 & iIntValue10, (iIntValue10 & 19) != 18)) {
                    boolean zH3 = ux2Var10.h(rCClientActivity);
                    Object objK10 = ux2Var10.K();
                    if (zH3 || objK10 == awVar) {
                        objK10 = new vm3(rCClientActivity, (byte) 26);
                        ux2Var10.g0(objK10);
                    }
                    g77.d(a06Var3, (Function0) objK10, ka0.A(cs4Var, nd5Var3), ux2Var10, 0);
                } else {
                    ux2Var10.Q();
                }
                return f88Var;
            case ep1.c /* 10 */:
                zl6 zl6Var = (zl6) obj5;
                Function1 function5 = (Function1) obj4;
                ab0 ab0Var = (ab0) obj;
                ux2 ux2Var11 = (ux2) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ab0Var.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ux2Var11.f(ab0Var) ? 4 : 2;
                }
                if (ux2Var11.N(1 & iIntValue11, (iIntValue11 & 19) != 18)) {
                    in1 in1Var = ab0Var.a;
                    long j2 = ab0Var.b;
                    if (w32.a(r61.e(j2) ? in1Var.O(r61.i(j2)) : Float.POSITIVE_INFINITY, 0.0f) <= 0) {
                        ux2Var11.W(-877508984);
                        lv1.k(null, 0.0f, 0L, ux2Var11, 0, 7);
                        ux2Var11.p(false);
                    } else {
                        ux2Var11.W(-877431143);
                        ux2Var11.p(false);
                        x37.b(zl6Var.ordinal(), androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0L, 0L, au8.O(-157925731, new b9((Object) zl6Var, (byte) 11), ux2Var11), null, au8.O(-1924197325, new l64(zl6Var, function5, (byte) 17), ux2Var11), ux2Var11, 1597488, 44);
                    }
                } else {
                    ux2Var11.Q();
                }
                return f88Var;
            case 11:
                zl6 zl6Var2 = (zl6) obj5;
                zl6 zl6Var3 = (zl6) obj4;
                ux2 ux2Var12 = (ux2) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var12.N(1 & iIntValue12, (iIntValue12 & 17) != 16)) {
                    fs4 fs4VarC3 = androidx.compose.foundation.layout.b.c(ka0.C(cs4Var, 8.0f, 14.0f), 1.0f);
                    String strZ3 = m77.z(zl6Var2.m, ux2Var12);
                    if (zl6Var3 == zl6Var2) {
                        ux2Var12.W(-1479199805);
                        h72Var = un4.a;
                        j = ((rn4) ux2Var12.j(h72Var)).a.q;
                        ux2Var12.p(false);
                    } else {
                        ux2Var12.W(-1479095428);
                        h72Var = un4.a;
                        j = ((rn4) ux2Var12.j(h72Var)).a.s;
                        ux2Var12.p(false);
                    }
                    qs7.b(strZ3, fs4VarC3, j, 0L, null, 0L, new qo7(3), 0L, 2, false, 1, 0, null, ((rn4) ux2Var12.j(h72Var)).b.i, ux2Var12, 48, 24960, 109560);
                } else {
                    ux2Var12.Q();
                }
                return f88Var;
            case ep1.d /* 12 */:
                Function0 function6 = (Function0) obj5;
                Function1 function7 = (Function1) obj4;
                ux2 ux2Var13 = (ux2) obj2;
                ((Integer) obj3).getClass();
                ux2Var13.W(759876635);
                Object objK11 = ux2Var13.K();
                Object obj6 = objK11;
                if (objK11 == awVar) {
                    eo1 eo1VarB = d57.b(function6);
                    ux2Var13.g0(eo1VarB);
                    obj6 = eo1VarB;
                }
                i97 i97Var = (i97) obj6;
                Object objK12 = ux2Var13.K();
                Object obj7 = objK12;
                if (objK12 == awVar) {
                    t65 t65Var = (t65) i97Var.getValue();
                    long j3 = t65Var.a;
                    km kmVar = new km(t65Var, vo6.b, new t65(vo6.c), 8);
                    ux2Var13.g0(kmVar);
                    obj7 = kmVar;
                }
                km kmVar2 = (km) obj7;
                boolean zH4 = ux2Var13.h(kmVar2);
                Object objK13 = ux2Var13.K();
                Object obj8 = objK13;
                if (zH4 || objK13 == awVar) {
                    ko2 ko2Var = new ko2(i97Var, kmVar2, hc1Var, b2);
                    ux2Var13.g0(ko2Var);
                    obj8 = ko2Var;
                }
                ck3.i(f88Var, (hw2) obj8, ux2Var13);
                ko koVar = kmVar2.c;
                boolean zF4 = ux2Var13.f(koVar);
                Object objK14 = ux2Var13.K();
                if (zF4 || objK14 == awVar) {
                    objK14 = new b5(koVar, (byte) 6);
                    ux2Var13.g0(objK14);
                }
                fs4 fs4Var = (fs4) function7.invoke((Function0) objK14);
                ux2Var13.p(false);
                return fs4Var;
            case 13:
                rr6 rr6Var = (rr6) obj5;
                Function1 function8 = (Function1) obj4;
                ux2 ux2Var14 = (ux2) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var14.N(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    w50 w50Var3 = xz2.B;
                    fs4 fs4VarC4 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    hk6 hk6VarW3 = im3.W(ux2Var14);
                    Object objK15 = ux2Var14.K();
                    if (objK15 == awVar) {
                        objK15 = ck3.w(ux2Var14);
                        ux2Var14.g0(objK15);
                    }
                    fs4 fs4VarA4 = androidx.compose.ui.platform.a.a(o77.t(fs4VarC4, hk6VarW3, (me1) objK15), "TVTA-contacts-sorting-bottomSheet");
                    kw0 kw0VarA4 = iw0.a(iq8.c, w50Var3, ux2Var14, 48);
                    int iHashCode4 = Long.hashCode(ux2Var14.T);
                    yj5 yj5VarL4 = ux2Var14.l();
                    fs4 fs4VarS4 = uf0.s(ux2Var14, fs4VarA4);
                    yz0.c.getClass();
                    ux2Var14.a0();
                    if (ux2Var14.S) {
                        ux2Var14.k(tg3Var);
                    } else {
                        ux2Var14.j0();
                    }
                    o67.n(kw0VarA4, d82.v, ux2Var14);
                    o67.n(yj5VarL4, d82.u, ux2Var14);
                    o67.n(Integer.valueOf(iHashCode4), d82.w, ux2Var14);
                    o67.l(ux2Var14);
                    o67.n(fs4VarS4, d82.t, ux2Var14);
                    qs7.b(m77.z(R.string.sort_by, ux2Var14), androidx.compose.ui.platform.a.a(ka0.D(cs4Var, 16.0f, 0.0f, 2), "TVTA-contacts-sorting-bottomSheetTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var14.j(un4.a)).b.g, ux2Var14, 48, 0, 131068);
                    lv1.k(ka0.E(cs4Var, 16.0f, 16.0f, 16.0f, 24.0f), 0.0f, 0L, ux2Var14, 0, 6);
                    ds1.y(qf0.L(new qr6(m77.z(R.string.sort_name_a_z, ux2Var14), rr6.m, sr6.OnServiceQueueSortByOptionAscendingClicked, "TVTA-service-queue-sorting-optionAscending"), new qr6(m77.z(R.string.sort_name_z_a, ux2Var14), rr6.n, sr6.OnServiceQueueSortByOptionDescendingClicked, "TVTA-service-queue-sorting-optionDescending"), new qr6(m77.z(R.string.service_queue_sort_status_waiting, ux2Var14), rr6.f1944o, sr6.OnServiceQueueSortByOptionWaitingClicked, "TVTA-service-queue-sorting-optionWaiting"), new qr6(m77.z(R.string.service_queue_sort_status_not_joined, ux2Var14), rr6.p, sr6.OnServiceQueueSortByOptionNotJoinedClicked, "TVTA-service-queue-sorting-optionNotJoined")), rr6Var, null, function8, ux2Var14, 0);
                    ux2Var14.p(true);
                } else {
                    ux2Var14.Q();
                }
                return f88Var;
            case 14:
                f67 f67Var = (f67) obj5;
                i97 i97Var2 = (i97) obj4;
                ux2 ux2Var15 = (ux2) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((nd5) obj).getClass();
                if (!ux2Var15.N(1 & iIntValue14, (iIntValue14 & 17) != 16)) {
                    ux2Var15.Q();
                } else if (((j67) i97Var2.getValue()).b) {
                    ux2Var15.W(989475512);
                    i67.a(null, ux2Var15, 0);
                    ux2Var15.p(false);
                } else {
                    ux2Var15.W(989557166);
                    h67.a((j67) i97Var2.getValue(), f67Var, null, ux2Var15, 0);
                    ux2Var15.p(false);
                }
                return f88Var;
            case 15:
                Spannable spannable = (Spannable) obj5;
                pj pjVar = (pj) obj4;
                c77 c77Var = (c77) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                int iIntValue16 = ((Integer) obj3).intValue();
                nr2 nr2Var = c77Var.f;
                ms2 ms2Var = c77Var.c;
                if (ms2Var == null) {
                    ms2Var = ms2.f1503o;
                }
                ks2 ks2Var = c77Var.d;
                int i4 = ks2Var != null ? ks2Var.a : 0;
                ls2 ls2Var = c77Var.e;
                int i5 = ls2Var != null ? ls2Var.a : 65535;
                qj qjVar = (qj) pjVar.n;
                c68 c68VarB = ((or2) qjVar.q).b(nr2Var, ms2Var, i4, i5);
                if (c68VarB instanceof c68) {
                    Object obj9 = c68VarB.m;
                    obj9.getClass();
                    typeface = (Typeface) obj9;
                } else {
                    y58 y58Var = new y58(c68VarB, qjVar.v);
                    qjVar.v = y58Var;
                    Object obj10 = y58Var.p;
                    obj10.getClass();
                    typeface = (Typeface) obj10;
                }
                spannable.setSpan(new qr2(typeface, (byte) 1), iIntValue15, iIntValue16, 33);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                List<l08> list = (List) obj5;
                String str = (String) obj4;
                ux2 ux2Var16 = (ux2) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var16.N(1 & iIntValue17, (iIntValue17 & 17) != 16)) {
                    ux2Var16.Q();
                } else if (list == null) {
                    ux2Var16.W(1917740361);
                    ux2Var16.p(false);
                } else {
                    ux2Var16.W(1917740362);
                    for (l08 l08Var : list) {
                        if (((Boolean) l08Var.d.getValue()).booleanValue()) {
                            ux2Var16.W(-829856104);
                            ux2Var16.W(-829683682);
                            x67.d(l08Var, null, str, ux2Var16, 0);
                            ux2Var16.p(false);
                            ux2Var16.p(false);
                        } else {
                            ux2Var16.W(-829566843);
                            ux2Var16.p(false);
                        }
                    }
                    ux2Var16.p(false);
                }
                return f88Var;
            default:
                ar7 ar7Var = (ar7) obj5;
                mw4 mw4Var = (mw4) obj4;
                ux2 ux2Var17 = (ux2) obj2;
                ((Integer) obj3).getClass();
                ux2Var17.W(-102778667);
                Object objK16 = ux2Var17.K();
                Object obj11 = objK16;
                if (objK16 == awVar) {
                    me1 me1VarW = ck3.w(ux2Var17);
                    ux2Var17.g0(me1VarW);
                    obj11 = me1VarW;
                }
                me1 me1Var = (me1) obj11;
                Object objK17 = ux2Var17.K();
                Object obj12 = objK17;
                if (objK17 == awVar) {
                    bg5 bg5VarP = h57.p(null);
                    ux2Var17.g0(bg5VarP);
                    obj12 = bg5VarP;
                }
                px4 px4Var = (px4) obj12;
                px4 px4VarT = h57.t(ar7Var, ux2Var17);
                boolean zF5 = ux2Var17.f(mw4Var);
                Object objK18 = ux2Var17.K();
                Object obj13 = objK18;
                if (zF5 || objK18 == awVar) {
                    py5 py5Var = new py5(px4Var, mw4Var, b2);
                    ux2Var17.g0(py5Var);
                    obj13 = py5Var;
                }
                ck3.e(mw4Var, (Function1) obj13, ux2Var17);
                boolean zH5 = ux2Var17.h(me1Var) | ux2Var17.f(mw4Var) | ux2Var17.f(px4VarT);
                Object objK19 = ux2Var17.K();
                Object obj14 = objK19;
                if (zH5 || objK19 == awVar) {
                    dr7 dr7Var = new dr7(me1Var, px4Var, mw4Var, px4VarT);
                    ux2Var17.g0(dr7Var);
                    obj14 = dr7Var;
                }
                fs4 fs4VarA5 = qg7.a(cs4Var, mw4Var, (PointerInputEventHandler) obj14);
                ux2Var17.p(false);
                return fs4VarA5;
        }
    }
}
