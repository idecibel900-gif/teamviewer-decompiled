package o;

import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.INearbyDevicesViewModel;
import com.teamviewer.remotecontrollib.swig.INearbyDevicesViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.LegalAgreementActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ t0(byte b, int i, Object obj) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:238:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:239:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:241:0x0703  */
    /* JADX WARN: Code duplicated, block: B:242:0x0705  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        ux2 ux2Var;
        Object value;
        boolean z;
        Object value2;
        boolean z2;
        Object value3;
        boolean z3;
        Object value4;
        byte b = this.m;
        tg3 tg3Var = LayoutNode.e0;
        hc1 hc1Var = null;
        cs4 cs4Var = cs4.b;
        byte b2 = 3;
        f88 f88Var = f88.a;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                u0 u0Var = (u0) obj4;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    u0Var.a(0, ux2Var2);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            case 1:
                sk6 sk6Var = (sk6) obj4;
                im3.R(sk6Var.I0(), null, null, new r2(sk6Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 2:
                o9 o9Var = (o9) obj4;
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var3.W(1853168114);
                    StringBuilder sb = new StringBuilder(o9Var.d.length() + "/500");
                    if (o9Var.f) {
                        ux2Var3.W(1815374906);
                        sb.append(" " + m77.z(R.string.character_limit_reached_text_error, ux2Var3));
                        ux2Var3.p(false);
                    } else {
                        ux2Var3.W(1815498875);
                        ux2Var3.p(false);
                    }
                    String string = sb.toString();
                    ux2Var3.p(false);
                    qs7.b(string, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-contact-bottom-sheet-description-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 48, 0, 262140);
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
            case 3:
                ia iaVar = (ia) obj4;
                long jLongValue = ((Long) obj).longValue();
                if (((Boolean) obj2).booleanValue()) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("PartnerAccountId", jLongValue);
                    iaVar.G().e0("NearbyPartnerAddCallbackRequestKey", bundle);
                    dc3 dc3Var = iaVar.h1;
                    if (dc3Var != null) {
                        INearbyDevicesViewModel iNearbyDevicesViewModel = ((q15) dc3Var).n;
                        INearbyDevicesViewModelSWIGJNI.INearbyDevicesViewModel_ReportEvent(iNearbyDevicesViewModel.a, iNearbyDevicesViewModel, 2);
                    }
                    iaVar.A0();
                }
                return f88Var;
            case 4:
                ib ibVar = (ib) obj4;
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qs7.b(jx0.f(ibVar.f, ux2Var4), androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-add-remote-device-to-your-account-bottom-sheet-select-a-group-input-hint"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var4, 48, 0, 262140);
                } else {
                    ux2Var4.Q();
                }
                return f88Var;
            case 5:
                return Boolean.valueOf(((ds7) obj4).d(ds1.m0((RectF) obj), ds1.m0((RectF) obj2)));
            case 6:
                xy6 xy6Var = (xy6) obj4;
                float fH = r61.h(((r61) obj2).a);
                float f = (int) (((dl3) obj).a & 4294967295L);
                i52 i52Var = new i52((byte) 0);
                yy6 yy6Var = yy6.m;
                i52Var.a(fH, yy6Var);
                Set set = xy6Var.a;
                yy6 yy6Var2 = yy6.f2656o;
                boolean zContains = set.contains(yy6Var2);
                boolean z4 = xy6Var.e;
                if (zContains && (z4 || f > fH / 2.0f)) {
                    i52Var.a(fH - (z4 ? Math.min(fH / 2.0f, f) : fH / 2.0f), yy6Var2);
                }
                yy6 yy6Var3 = yy6.n;
                if (f != 0.0f) {
                    i52Var.a(Math.max(0.0f, fH - f), yy6Var3);
                }
                ArrayList arrayList = i52Var.a;
                float[] fArr = i52Var.b;
                int size = arrayList.size();
                vn4.a0(size, fArr.length);
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                fArrCopyOfRange.getClass();
                uj1 uj1Var = new uj1(arrayList, fArrCopyOfRange);
                int iOrdinal = ((yy6) xy6Var.f.getValue()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            gk0.s();
                            return null;
                        }
                        if (z4) {
                            uj1 uj1VarE = xy6Var.g.e();
                            if (uj1VarE.c(yy6Var2) && uj1VarE.c(yy6Var3) && uj1VarE.f(yy6Var2) == uj1VarE.f(yy6Var3) && uj1Var.c(yy6Var3)) {
                                yy6Var = yy6Var3;
                            } else if (uj1Var.c(yy6Var2)) {
                                yy6Var = yy6Var2;
                            } else if (uj1Var.c(yy6Var3)) {
                                yy6Var = yy6Var3;
                            }
                        } else if (uj1Var.c(yy6Var2)) {
                            yy6Var = yy6Var2;
                        } else if (uj1Var.c(yy6Var3)) {
                            yy6Var = yy6Var3;
                        }
                    } else if (uj1Var.c(yy6Var3)) {
                        yy6Var = yy6Var3;
                    }
                }
                return new vd5(uj1Var, yy6Var);
            case 7:
                Boolean bool = (Boolean) obj4;
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i = ee0.t0;
                if (!ux2Var5.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var5.Q();
                } else if (im3.n(bool, Boolean.TRUE)) {
                    ux2Var5.W(1904807467);
                    ut7.a(xk0.f, ux2Var5, 48);
                    ux2Var5.p(false);
                } else {
                    ux2Var5.W(1904911255);
                    ux2Var5.p(false);
                }
                return f88Var;
            case 8:
                ((Integer) obj2).getClass();
                int i2 = ComposeView.x;
                ((ComposeView) obj4).a(yo1.Y(1), (ux2) obj);
                return f88Var;
            case ep1.b /* 9 */:
                ux2 ux2Var6 = (ux2) obj4;
                fs4 fs4Var = (fs4) obj;
                fs4 fs4VarR = (ds4) obj2;
                if (fs4VarR instanceof d01) {
                    iw2 iw2Var = ((d01) fs4VarR).d;
                    e8.i(3, iw2Var);
                    fs4VarR = uf0.r(ux2Var6, (fs4) iw2Var.d(cs4Var, ux2Var6, 0));
                }
                return fs4Var.f(fs4VarR);
            case ep1.c /* 10 */:
                au2 au2Var = (au2) obj4;
                ((Integer) obj).getClass();
                if (obj2 instanceof mz0) {
                    mz0 mz0Var = (mz0) obj2;
                    kx4 kx4Var = (kx4) au2Var.i;
                    if (kx4Var == null) {
                        kx4 kx4Var2 = ui6.a;
                        kx4Var = new kx4();
                        au2Var.i = kx4Var;
                    }
                    kx4Var.j(mz0Var);
                    ((xx4) au2Var.g).b(mz0Var);
                }
                if (obj2 instanceof yx2) {
                    au2Var.f((yx2) obj2);
                }
                if (obj2 instanceof j56) {
                    ((j56) obj2).c();
                }
                return f88Var;
            case 11:
                ((Integer) obj2).getClass();
                iq8.g((xo) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case ep1.d /* 12 */:
                ((Integer) obj2).getClass();
                ka0.n((pr7) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case 13:
                j93 j93Var = (j93) obj4;
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (ux2Var7.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    String strO = n37.o(R.string.m3c_dialog, ux2Var7);
                    fs4 fs4Var2 = (fs4) j93Var.f1141o;
                    pd5 pd5Var = yd.a;
                    fs4 fs4VarO = androidx.compose.foundation.layout.b.o(fs4Var2, 280.0f, 0.0f, 560.0f, 10);
                    boolean zF = ux2Var7.f(strO);
                    Object objK = ux2Var7.K();
                    if (zF || objK == e01.a) {
                        obj3 = objK;
                        fy fyVar = new fy(strO, (byte) 4);
                        ux2Var7.g0(fyVar);
                        obj3 = fyVar;
                    }
                    obj3 = objK;
                    fs4 fs4VarF = fs4VarO.f(cp6.a(cs4Var, false, (Function1) obj3));
                    do4 do4VarC = ua0.c(xz2.f2564o, true);
                    int iHashCode = Long.hashCode(ux2Var7.T);
                    yj5 yj5VarL = ux2Var7.l();
                    fs4 fs4VarS = uf0.s(ux2Var7, fs4VarF);
                    yz0.c.getClass();
                    ux2Var7.a0();
                    if (ux2Var7.S) {
                        ux2Var7.k(tg3Var);
                    } else {
                        ux2Var7.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var7);
                    o67.n(yj5VarL, d82.u, ux2Var7);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var7);
                    o67.l(ux2Var7);
                    o67.n(fs4VarS, d82.t, ux2Var7);
                    ((yy0) j93Var.q).invoke(ux2Var7, 0);
                    ux2Var7.p(true);
                } else {
                    ux2Var7.Q();
                }
                return f88Var;
            case 14:
                p07 p07Var = (p07) obj4;
                ux2 ux2Var8 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (ux2Var8.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ir irVar = iq8.b;
                    x50 x50Var = xz2.y;
                    iw2 iw2Var2 = p07Var.g;
                    dg6 dg6VarA = cg6.a(irVar, x50Var, ux2Var8, 54);
                    int iHashCode2 = Long.hashCode(ux2Var8.T);
                    yj5 yj5VarL2 = ux2Var8.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var8, cs4Var);
                    yz0.c.getClass();
                    ux2Var8.a0();
                    if (ux2Var8.S) {
                        ux2Var8.k(tg3Var);
                    } else {
                        ux2Var8.j0();
                    }
                    o67.n(dg6VarA, d82.v, ux2Var8);
                    o67.n(yj5VarL2, d82.u, ux2Var8);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var8);
                    o67.l(ux2Var8);
                    o67.n(fs4VarS2, d82.t, ux2Var8);
                    iw2Var2.d(fg6.a, ux2Var8, 6);
                    ux2Var8.p(true);
                } else {
                    ux2Var8.Q();
                }
                return f88Var;
            case 15:
                ux2 ux2Var9 = (ux2) obj;
                ((Integer) obj2).getClass();
                ux2Var9.W(666084174);
                String str = ((mp7) obj4).b;
                ux2Var9.p(false);
                return str;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                a65 a65Var = (a65) obj4;
                jh6 jh6Var = (jh6) obj;
                j57 j57Var = ((ul1) obj2).a;
                ArrayList arrayList2 = new ArrayList(j57Var.size());
                int size2 = j57Var.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList2.add(((hw2) a65Var.n).invoke(jh6Var, (qu7) j57Var.get(i3)));
                }
                return arrayList2;
            case 17:
                nf nfVar = (nf) obj4;
                ux2 ux2Var10 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (ux2Var10.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    iw2 iw2Var3 = (iw2) nfVar.j;
                    if (iw2Var3 == null) {
                        ux2Var10.W(1117801240);
                    } else {
                        ux2Var10.W(590247433);
                        iw2Var3.d((he5) nfVar.i, ux2Var10, 0);
                    }
                    ux2Var10.p(false);
                } else {
                    ux2Var10.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                cv7 cv7Var = (cv7) obj4;
                ux2 ux2Var11 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (ux2Var11.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ce5 ce5Var = cv7Var.a;
                    ux2Var11.W(-1569812260);
                    ux2Var11.p(false);
                } else {
                    ux2Var11.Q();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                wt1 wt1Var = (wt1) obj4;
                ux2 ux2Var12 = (ux2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (ux2Var12.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, 40.0f), sf6.a(8.0f));
                    h72 h72Var = un4.a;
                    fs4 fs4VarS3 = au8.s(fs4VarJ, rv0.b(0.08f, ((rn4) ux2Var12.j(h72Var)).a.s), kh.V);
                    do4 do4VarC2 = ua0.c(xz2.s, false);
                    int iHashCode3 = Long.hashCode(ux2Var12.T);
                    yj5 yj5VarL3 = ux2Var12.l();
                    fs4 fs4VarS4 = uf0.s(ux2Var12, fs4VarS3);
                    yz0.c.getClass();
                    ux2Var12.a0();
                    if (ux2Var12.S) {
                        ux2Var12.k(tg3Var);
                    } else {
                        ux2Var12.j0();
                    }
                    o67.n(do4VarC2, d82.v, ux2Var12);
                    o67.n(yj5VarL3, d82.u, ux2Var12);
                    o67.n(Integer.valueOf(iHashCode3), d82.w, ux2Var12);
                    o67.l(ux2Var12);
                    o67.n(fs4VarS4, d82.t, ux2Var12);
                    if (wt1Var.k) {
                        ux2Var12.W(-1081316594);
                        st5.a(androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(cs4Var, 20.0f), "TVTA-devicesScreen-deviceInfoScreen-wakingIndicator"), 0L, 2.0f, 0L, 0, 0.0f, ux2Var12, 390, 58);
                        ux2Var = ux2Var12;
                        ux2Var.p(false);
                    } else {
                        ux2Var = ux2Var12;
                        ux2Var.W(-1080883152);
                        td3.b(lv1.T(R.drawable.ic_mobile_wake, ux2Var, 0), m77.z(R.string.tv_device_options_rc_prompt_tooltip, ux2Var), androidx.compose.foundation.layout.b.l(cs4Var, 24.0f), ((rn4) ux2Var.j(h72Var)).a.s, ux2Var, 392, 0);
                        ux2Var.p(false);
                    }
                    ux2Var.p(true);
                } else {
                    ux2Var12.Q();
                }
                return f88Var;
            case 20:
                ((Integer) obj2).getClass();
                vs1.a((t94) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case 21:
                fw1 fw1Var = (fw1) obj4;
                ux2 ux2Var13 = (ux2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (ux2Var13.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    fw1Var.A0(null, null, ux2Var13, 0);
                } else {
                    ux2Var13.Q();
                }
                return f88Var;
            case 22:
                rz1 rz1Var = (rz1) obj4;
                ux2 ux2Var14 = (ux2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!ux2Var14.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ux2Var14.Q();
                } else if (rz1Var.l) {
                    ux2Var14.W(-332314262);
                    st5.a(androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(cs4Var, 24.0f), "TVTA-devicesScreen-sortLoadingIndicator"), ((tf2) ux2Var14.j(vf2.a)).l, 2.0f, 0L, 0, 0.0f, ux2Var14, 390, 56);
                    ux2Var14.p(false);
                } else {
                    ux2Var14.W(-331918175);
                    td3.b(lv1.T(R.drawable.sort_double_arrow, ux2Var14, 0), m77.z(R.string.sort_by, ux2Var14), null, 0L, ux2Var14, 8, 12);
                    ux2Var14.p(false);
                }
                return f88Var;
            case 23:
                ((Integer) obj2).getClass();
                ((y02) obj4).a(yo1.Y(1), (ux2) obj);
                return f88Var;
            case 24:
                ux2 ux2Var15 = (ux2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (ux2Var15.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    throw null;
                }
                ux2Var15.Q();
                return f88Var;
            case 25:
                d13 d13Var = (d13) obj4;
                ux2 ux2Var16 = (ux2) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (ux2Var16.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    td3.b(lv1.T(d13Var.a, ux2Var16, 0), m77.z(R.string.group_actions_content_description, ux2Var16), ka0.B(cs4Var, 8.0f), d13Var.b, ux2Var16, 392, 0);
                } else {
                    ux2Var16.Q();
                }
                return f88Var;
            case 26:
                jf3 jf3Var = (jf3) obj4;
                g60 g60Var = (g60) obj;
                List list = (List) obj2;
                g60Var.getClass();
                int i4 = g60Var.a;
                if (i4 != 1) {
                    ye4.a("InAppPurchaseCheckoutViewModel", "Purchase process complete: " + i4);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObject = ((lx5) it.next()).c;
                            ua5.v("Purchase token found: ", jSONObject.optString("token", jSONObject.optString("purchaseToken")), "InAppPurchaseCheckoutViewModel");
                        }
                    }
                    boolean z5 = g60Var.a == 0;
                    if (z5) {
                        EventHub.e(jf3Var.p, EventType.EVENT_IN_APP_PURCHASE_COMPLETED);
                    }
                    im3.R(e8.n(jf3Var), null, null, new g6(jf3Var, z5, hc1Var, b2), 3);
                }
                return f88Var;
            case 27:
                ((Integer) obj2).getClass();
                ((th3) obj4).a(yo1.Y(1), (ux2) obj);
                return f88Var;
            case 28:
                LegalAgreementActivity legalAgreementActivity = (LegalAgreementActivity) obj4;
                ux2 ux2Var17 = (ux2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int i5 = LegalAgreementActivity.O;
                if (ux2Var17.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ut7.a(au8.O(-1438755104, new l64(ds1.d0((Configuration) ux2Var17.j(lh.a), vn4.Y(legalAgreementActivity, ux2Var17), new l51(legalAgreementActivity), ux2Var17), legalAgreementActivity, false ? (byte) 1 : (byte) 0), ux2Var17), ux2Var17, 48);
                } else {
                    ux2Var17.Q();
                }
                return f88Var;
            default:
                hb3 hb3Var = (hb3) obj4;
                lb1 lb1Var = (lb1) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                lb1Var.getClass();
                if (lb1Var.equals(ib1.a)) {
                    l97 l97Var = ((z64) hb3Var).p;
                    do {
                        value4 = l97Var.getValue();
                    } while (!l97Var.j(value4, v64.a((v64) value4, zBooleanValue, false, false, false, null, 30)));
                } else if (lb1Var.equals(hb1.a)) {
                    l97 l97Var2 = ((z64) hb3Var).p;
                    do {
                        value3 = l97Var2.getValue();
                        z3 = zBooleanValue;
                        zBooleanValue = z3;
                    } while (!l97Var2.j(value3, v64.a((v64) value3, false, z3, false, false, null, 29)));
                } else if (lb1Var.equals(kb1.a)) {
                    l97 l97Var3 = ((z64) hb3Var).p;
                    do {
                        value2 = l97Var3.getValue();
                        z2 = zBooleanValue;
                        zBooleanValue = z2;
                    } while (!l97Var3.j(value2, v64.a((v64) value2, false, false, z2, false, null, 27)));
                } else {
                    if (!lb1Var.equals(jb1.a)) {
                        gk0.s();
                        return null;
                    }
                    l97 l97Var4 = ((z64) hb3Var).p;
                    do {
                        value = l97Var4.getValue();
                        z = zBooleanValue;
                        zBooleanValue = z;
                    } while (!l97Var4.j(value, v64.a((v64) value, false, false, false, z, null, 23)));
                }
                return f88Var;
        }
    }

    public /* synthetic */ t0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
