package o;

import android.os.Bundle;
import com.teamviewer.remotecontrollib.swig.INearbyDevicesViewModel;
import com.teamviewer.remotecontrollib.swig.INearbyDevicesViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b9 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ b9(my4 my4Var, ly4 ly4Var) {
        this.m = (byte) 9;
        this.n = my4Var;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x02e2  */
    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        cs4 cs4Var = cs4.b;
        boolean z = true;
        f88 f88Var = f88.a;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                o9 o9Var = (o9) obj4;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var.Q();
                } else if (o9Var.h) {
                    ux2Var.W(-1373812961);
                    st5.a(androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(cs4Var, 24.0f), "TVTA-devices-add-contact-bottom-sheet-loading-content"), ((rn4) ux2Var.j(un4.a)).a.b, 0.0f, 0L, 0, 0.0f, ux2Var, 6, 60);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-1373519081);
                    qs7.b(m77.z(R.string.device_tab_add_contact_send_invite, ux2Var), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-contact-bottom-sheet-normal-content"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 48, 0, 262140);
                    ux2Var.p(false);
                }
                return f88Var;
            case 1:
                ia iaVar = (ia) obj4;
                DyngateID dyngateID = (DyngateID) obj;
                String str = (String) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                dyngateID.getClass();
                str.getClass();
                if (zBooleanValue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("DeviceDyngateId", dyngateID.toString());
                    bundle.putString("DeviceAlias", str);
                    iaVar.G().e0("NearbyDeviceAddCallbackRequestKey", bundle);
                    dc3 dc3Var = iaVar.h1;
                    if (dc3Var != null) {
                        INearbyDevicesViewModel iNearbyDevicesViewModel = ((q15) dc3Var).n;
                        INearbyDevicesViewModelSWIGJNI.INearbyDevicesViewModel_ReportEvent(iNearbyDevicesViewModel.a, iNearbyDevicesViewModel, 1);
                    }
                    iaVar.A0();
                }
                return f88Var;
            case 2:
                ob obVar = (ob) obj4;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else if (obVar.k) {
                    ux2Var2.W(-101550568);
                    st5.a(androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(cs4Var, 24.0f), "TVTA-devices-add-remote-device-via-id-bottom-sheet-loading-content"), ((rn4) ux2Var2.j(un4.a)).a.b, 0.0f, 0L, 0, 0.0f, ux2Var2, 6, 60);
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-101243079);
                    qs7.b(m77.z(R.string.add_device, ux2Var2), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-remote-device-via-id-bottom-sheet-normal-content"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var2, 48, 0, 262140);
                    ux2Var2.p(false);
                }
                return f88Var;
            case 3:
                q20 q20Var = (q20) obj4;
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    qs7.b(q20Var.c, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262142);
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
            case 4:
                ((fj3) obj4).invoke((Throwable) obj);
                return f88Var;
            case 5:
                yd1 yd1Var = (yd1) obj4;
                int iIntValue4 = ((Integer) obj).intValue();
                int iIntValue5 = ((Integer) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue2) {
                    iIntValue4 = yd1Var.I.k(iIntValue4);
                }
                if (!zBooleanValue2) {
                    iIntValue5 = yd1Var.I.k(iIntValue5);
                }
                if (yd1Var.G) {
                    long j = yd1Var.D.b;
                    int i = gt7.c;
                    if (iIntValue4 == ((int) (j >> 32)) && iIntValue5 == ((int) (j & 4294967295L))) {
                        z = false;
                    } else {
                        int iMin = Math.min(iIntValue4, iIntValue5);
                        n43 n43Var = n43.m;
                        if (iMin < 0 || Math.max(iIntValue4, iIntValue5) > yd1Var.D.a.n.length()) {
                            pr7 pr7Var = yd1Var.J;
                            pr7Var.u(false);
                            pr7Var.r(n43Var);
                            z = false;
                        } else {
                            if (zBooleanValue2 || iIntValue4 == iIntValue5) {
                                pr7 pr7Var2 = yd1Var.J;
                                pr7Var2.u(false);
                                pr7Var2.r(n43Var);
                            } else {
                                yd1Var.J.e(true);
                            }
                            yd1Var.E.v.invoke(new zr7(yd1Var.D.a, h57.a(iIntValue4, iIntValue5), (gt7) null));
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                rz1 rz1Var = (rz1) obj4;
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (ux2Var4.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    if (rz1Var.h) {
                        ux2Var4.W(-2117403748);
                        xo1.k(rz1Var.i, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-groupTopBarSearch"), false, null, null, di1.h, ux2Var4, 1572912, 60);
                        ux2Var4.p(false);
                    } else {
                        ux2Var4.W(-2116961688);
                        ux2Var4.p(false);
                    }
                    if (rz1Var.k) {
                        ux2Var4.W(-2116875105);
                        xo1.k(rz1Var.m, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-groupTopBarSort"), !rz1Var.l, null, null, au8.O(-32449398, new t0(rz1Var, (byte) 22), ux2Var4), ux2Var4, 1572912, 56);
                        ux2Var4.p(false);
                    } else {
                        ux2Var4.W(-2115960760);
                        ux2Var4.p(false);
                    }
                    hw2 hw2Var = rz1Var.j;
                    if (hw2Var == null) {
                        ux2Var4.W(-2115911905);
                    } else {
                        ux2Var4.W(763028770);
                        hw2Var.invoke(ux2Var4, 0);
                    }
                    ux2Var4.p(false);
                } else {
                    ux2Var4.Q();
                }
                return f88Var;
            case 7:
                ((eg4) obj4).n.a(((in5) obj2).c, jk0.K);
                return f88Var;
            case 8:
                oi2 oi2Var = (oi2) obj4;
                ux2 ux2Var5 = (ux2) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((eg6) obj).getClass();
                if (!ux2Var5.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ux2Var5.Q();
                } else if (oi2Var.h) {
                    ux2Var5.W(-907246216);
                    st5.a(androidx.compose.foundation.layout.b.l(cs4Var, 24.0f), ((rn4) ux2Var5.j(un4.a)).a.b, 0.0f, 0L, 0, 0.0f, ux2Var5, 6, 60);
                    ux2Var5.p(false);
                } else {
                    ux2Var5.W(-907036253);
                    qs7.b(m77.z(R.string.feedback_send_button, ux2Var5), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var5, 0, 0, 262142);
                    ux2Var5.p(false);
                }
                return f88Var;
            case ep1.b /* 9 */:
                my4 my4Var = (my4) obj4;
                my4.u.set(my4Var, null);
                my4Var.j(null);
                return f88Var;
            case ep1.c /* 10 */:
                kl6 kl6Var = (kl6) obj4;
                ux2 ux2Var6 = (ux2) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((w14) obj).getClass();
                if (ux2Var6.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    et1.m(0, m77.z(kl6Var.a(), ux2Var6), ux2Var6, androidx.compose.ui.platform.a.a(cs4Var, kl6Var.d() + "-header"));
                } else {
                    ux2Var6.Q();
                }
                return f88Var;
            case 11:
                zl6 zl6Var = (zl6) obj4;
                bn7 bn7Var = (bn7) obj;
                ux2 ux2Var7 = (ux2) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                bn7Var.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= (iIntValue9 & 8) == 0 ? ux2Var7.f(bn7Var) : ux2Var7.h(bn7Var) ? 4 : 2;
                }
                if (ux2Var7.N(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    xz2.X.x0(new gm7(bn7Var.a, zl6Var.ordinal(), false, bn7Var.b), Float.NaN, 2.0f, 0L, null, ux2Var7, 197040, 24);
                } else {
                    ux2Var7.Q();
                }
                return f88Var;
            case ep1.d /* 12 */:
                ((sp6) obj4).c();
                return f88Var;
            default:
                pr7 pr7Var3 = (pr7) obj4;
                fs4 fs4Var = (fs4) obj;
                ux2 ux2Var8 = (ux2) obj2;
                ((Integer) obj3).getClass();
                ux2Var8.W(1980580247);
                in1 in1Var = (in1) ux2Var8.j(b11.h);
                Object objK = ux2Var8.K();
                aw awVar = e01.a;
                Object obj5 = objK;
                if (objK == awVar) {
                    bg5 bg5VarP = h57.p(new dl3(0L));
                    ux2Var8.g0(bg5VarP);
                    obj5 = bg5VarP;
                }
                px4 px4Var = (px4) obj5;
                boolean zH = ux2Var8.h(pr7Var3);
                Object objK2 = ux2Var8.K();
                Object obj6 = objK2;
                if (zH || objK2 == awVar) {
                    a26 a26Var = new a26((Object) pr7Var3, (Object) px4Var, (byte) 24);
                    ux2Var8.g0(a26Var);
                    obj6 = a26Var;
                }
                Function0 function0 = (Function0) obj6;
                boolean zF = ux2Var8.f(in1Var);
                Object objK3 = ux2Var8.K();
                Object obj7 = objK3;
                if (zF || objK3 == awVar) {
                    tr7 tr7Var = new tr7(in1Var, px4Var, false ? 1 : 0);
                    ux2Var8.g0(tr7Var);
                    obj7 = tr7Var;
                }
                no noVar = vo6.a;
                fs4 fs4VarK = uf0.k(fs4Var, new sd(function0, (Function1) obj7, (byte) 12));
                ux2Var8.p(false);
                return fs4VarK;
        }
    }

    public /* synthetic */ b9(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
