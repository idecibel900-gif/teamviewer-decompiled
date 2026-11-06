package o;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.teamviewer.apidefinitions.legacydevices.models.Device;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceChangedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceDelta;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceType;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceOnlineStateChangedEvent;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a81 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ a81(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01af  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bb5 bb5Var;
        ms1 ms1Var;
        ls1 ls1VarQ1;
        Boolean boolValueOf;
        js1 js1Var;
        int i;
        String strConcat;
        int length;
        int i2;
        String str;
        ms1 ms1Var2;
        Object next;
        Object obj2;
        byte b = this.m;
        ms1 ms1Var3 = ms1.n;
        ms1 ms1Var4 = ms1.m;
        byte b2 = 2;
        ArrayList arrayList = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        f88 f88Var = f88.a;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                n81 n81Var = (n81) obj3;
                z31 z31Var = (z31) obj;
                z31Var.getClass();
                boolean z = n81Var.A;
                n81Var.A = false;
                n81Var.V0();
                im3.R(e8.n(n81Var), n81Var.q, null, new h0(z, n81Var, z31Var, (hc1) null), 2);
                return f88Var;
            case 1:
                int i3 = hr1.u0;
                ((TextView) ((wk0) obj3).f2420o).setText((String) obj);
                return f88Var;
            case 2:
                hr1 hr1Var = (hr1) obj3;
                int i4 = hr1.u0;
                if (!((Boolean) obj).booleanValue() && (bb5Var = hr1Var.r0) != null) {
                    bb5Var.G0();
                }
                return f88Var;
            case 3:
                ns1 ns1Var = (ns1) obj;
                ns1Var.getClass();
                DeviceDelta device = ((DeviceChangedEvent) obj3).getDevice();
                if (device.isMobileWakeActivated() == null && device.isWakeOnLanPossible() == null) {
                    ms1Var = ns1Var.f;
                } else {
                    Boolean boolIsMobileWakeActivated = device.isMobileWakeActivated();
                    Boolean bool = Boolean.TRUE;
                    if (im3.n(boolIsMobileWakeActivated, bool)) {
                        ms1Var3 = ms1Var4;
                    } else if (!im3.n(device.isWakeOnLanPossible(), bool)) {
                        ms1Var3 = null;
                    }
                    ms1Var = ms1Var3;
                }
                DeviceOnlineStatus onlineStatus = device.getOnlineStatus();
                if (onlineStatus != null) {
                    ls1VarQ1 = ru1.q1(onlineStatus, ms1Var != null);
                } else {
                    ls1VarQ1 = ns1Var.c;
                    Object[] objArr4 = ms1Var != null;
                    ls1 ls1Var = ls1.f1400o;
                    ls1 ls1Var2 = ls1.n;
                    if (ls1VarQ1 == ls1Var2 && objArr4 == true) {
                        ls1VarQ1 = ls1Var;
                    } else if (ls1VarQ1 == ls1Var && objArr4 == false) {
                        ls1VarQ1 = ls1Var2;
                    }
                }
                ls1 ls1Var3 = ls1VarQ1;
                if (device.getHasPersonalPassword() == null && device.getHasPermanentPassword() == null) {
                    boolValueOf = ns1Var.i;
                } else {
                    Boolean hasPersonalPassword = device.getHasPersonalPassword();
                    Boolean bool2 = Boolean.TRUE;
                    boolValueOf = Boolean.valueOf(im3.n(hasPersonalPassword, bool2) || im3.n(device.getHasPermanentPassword(), bool2));
                }
                Boolean bool3 = boolValueOf;
                Long teamViewerId = device.getTeamViewerId();
                long jLongValue = teamViewerId != null ? teamViewerId.longValue() : ns1Var.a;
                String displayName = device.getDisplayName();
                if (displayName == null) {
                    displayName = ns1Var.b;
                }
                String str2 = displayName;
                Integer groupId = device.getGroupId();
                if (groupId == null) {
                    groupId = ns1Var.e;
                }
                Integer num = groupId;
                String description = device.getDescription();
                if (description == null) {
                    description = ns1Var.h;
                }
                String str3 = description;
                DeviceType deviceType = device.getDeviceType();
                if (deviceType != null) {
                    int i5 = fu1.b[deviceType.ordinal()];
                    if (i5 == 1) {
                        js1Var = js1.m;
                    } else if (i5 == 2) {
                        js1Var = js1.n;
                    } else if (i5 == 3) {
                        js1Var = js1.f1197o;
                    } else {
                        if (i5 != 4) {
                            gk0.s();
                            return null;
                        }
                        js1Var = js1.p;
                    }
                } else {
                    js1Var = ns1Var.u;
                }
                return ns1.a(ns1Var, jLongValue, str2, ls1Var3, num, ms1Var, false, str3, bool3, null, null, null, null, null, null, null, null, null, null, js1Var, null, 3145288);
            case 4:
                ns1 ns1Var2 = (ns1) obj;
                ns1Var2.getClass();
                return ns1.a(ns1Var2, 0L, null, ru1.r1(((ManagedDeviceOnlineStateChangedEvent) obj3).getOnlineStatus(), ns1Var2.f), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194299);
            case 5:
                ns1 ns1Var3 = (ns1) obj;
                ns1Var3.getClass();
                return ns1.a(ns1Var3, 0L, null, (ls1) obj3, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194299);
            case 6:
                Set set = (Set) obj3;
                ns1 ns1Var4 = (ns1) obj;
                ns1Var4.getClass();
                List list = ns1Var4.n;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (!set.contains((UUID) obj4)) {
                            arrayList.add(obj4);
                        }
                    }
                }
                return ns1.a(ns1Var4, 0L, null, null, null, null, false, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, null, 4186111);
            case 7:
                List list2 = (List) obj3;
                ns1 ns1Var5 = (ns1) obj;
                ns1Var5.getClass();
                if (!ns1Var5.l) {
                    return ns1Var5;
                }
                UUID uuid = ns1Var5.f1598o;
                if (uuid == null) {
                    uuid = ns1Var5.r;
                }
                return ns1.a(ns1Var5, 0L, null, null, null, null, false, null, null, null, null, null, null, null, ru1.l1(uuid, list2), null, null, null, null, null, null, 4161535);
            case 8:
                wt1 wt1Var = (wt1) obj3;
                ns1 ns1Var6 = (ns1) obj;
                String str4 = wt1Var.l;
                String str5 = wt1Var.n;
                String str6 = wt1Var.m;
                return ns1.a(ns1Var6, 0L, str4, null, null, null, false, str5, str6 != null ? Boolean.valueOf(str6.length() > 0) : ns1Var6.i, null, null, null, null, null, null, null, null, null, null, null, null, 4193917);
            case ep1.b /* 9 */:
                ua3 ua3Var = (ua3) obj;
                AppCompatImageView appCompatImageView = ((fv1) obj3).u0;
                if (appCompatImageView != null) {
                    ua3Var.getClass();
                    int iOrdinal = ua3Var.ordinal();
                    if (iOrdinal == 0) {
                        i = R.drawable.online_indicator;
                    } else if (iOrdinal == 1) {
                        i = R.drawable.away_indicator;
                    } else if (iOrdinal == 2) {
                        i = R.drawable.busy_indicator;
                    } else {
                        if (iOrdinal != 3) {
                            gk0.s();
                            return null;
                        }
                        i = R.drawable.offline_indicator;
                    }
                    appCompatImageView.setImageResource(i);
                }
                return f88Var;
            case ep1.c /* 10 */:
                ChatConversationID chatConversationID = (ChatConversationID) obj;
                chatConversationID.getClass();
                bb5 bb5Var2 = ((fw1) obj3).p0;
                if (bb5Var2 != null) {
                    if (it1.c == null) {
                        im3.e0("viewFactory");
                        throw null;
                    }
                    bb5Var2.I0(ep3.h(chatConversationID), true);
                }
                return f88Var;
            case 11:
                ((y12) obj3).x = true;
                return f88Var;
            case ep1.d /* 12 */:
                xk1 xk1Var = (xk1) obj3;
                g42 g42Var = (g42) obj;
                if (!g42Var.m.z) {
                    return k28.n;
                }
                g42 g42Var2 = g42Var.B;
                k28 k28Var = k28.m;
                if (g42Var2 != null) {
                    a81 a81Var = new a81(xk1Var, (byte) 12);
                    if (a81Var.invoke(g42Var2) == k28Var) {
                        g57.s(g42Var2, a81Var);
                    }
                }
                g42Var.B = null;
                g42Var.A = null;
                return k28Var;
            case 13:
                ((fg4) obj3).a();
                return f88Var;
            case 14:
                zy2 zy2Var = (zy2) obj;
                return Boolean.valueOf(zy2Var instanceof l52 ? ((Boolean) ((z90) obj3).invoke(zy2Var)).booleanValue() : true);
            case 15:
                e82 e82Var = (e82) obj;
                String str7 = ((e82) obj3) == e82Var ? " > " : "   ";
                if (!(e82Var instanceof cx0)) {
                    if (e82Var instanceof bv6) {
                        bv6 bv6Var = (bv6) e82Var;
                        length = bv6Var.a.n.length();
                        i2 = bv6Var.b;
                        str = "SetComposingTextCommand(text.length=";
                    } else if (e82Var instanceof av6) {
                        strConcat = ((av6) e82Var).toString();
                    } else if (e82Var instanceof dn1) {
                        strConcat = ((dn1) e82Var).toString();
                    } else if (e82Var instanceof en1) {
                        strConcat = ((en1) e82Var).toString();
                    } else if (e82Var instanceof dv6) {
                        strConcat = ((dv6) e82Var).toString();
                    } else if (e82Var instanceof ql2) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (e82Var instanceof an1) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strF = w86.a.b(e82Var.getClass()).f();
                        if (strF == null) {
                            strF = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strF);
                    }
                    return str7.concat(strConcat);
                }
                cx0 cx0Var = (cx0) e82Var;
                length = cx0Var.a.n.length();
                i2 = cx0Var.b;
                str = "CommitTextCommand(text.length=";
                strConcat = fx3.d(length, i2, str, ", newCursorPosition=", ")");
                return str7.concat(strConcat);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ii2 ii2Var = (ii2) obj3;
                ii2Var.p0().runOnUiThread(new qe(((Boolean) obj).booleanValue(), ii2Var));
                return f88Var;
            case 17:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                m5 m5Var = ((mi2) obj3).s;
                if (m5Var != null) {
                    m5Var.invoke(bool4);
                }
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                xx4 xx4Var = (xx4) obj3;
                Object[] objArr5 = xx4Var.m;
                int i6 = xx4Var.f2559o;
                for (int i7 = 0; i7 < i6; i7++) {
                    ((eo4) objArr5[i7]).d();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                b68 b68Var = (b68) obj;
                return ((or2) obj3).a(new b68(null, b68Var.b, b68Var.c, b68Var.d, b68Var.e)).m;
            case 20:
                kf0 kf0Var = (kf0) obj3;
                if (mz2.b.compareAndSet(false, true)) {
                    kf0Var.b(f88Var);
                }
                return f88Var;
            case 21:
                u52 u52Var = (u52) obj;
                ll0 ll0VarX = u52Var.h0().x();
                hw2 hw2Var = ((o03) obj3).p;
                if (hw2Var != null) {
                    hw2Var.invoke(ll0VarX, (l03) u52Var.h0().p);
                }
                return f88Var;
            case 22:
                k13 k13Var = (k13) obj3;
                bb8 bb8Var = (bb8) obj;
                k13Var.g(bb8Var);
                Function1 function1 = k13Var.i;
                if (function1 != null) {
                    function1.invoke(bb8Var);
                }
                return f88Var;
            case 23:
                Device device2 = (Device) obj3;
                List list3 = (List) obj;
                list3.getClass();
                if (!list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        Integer num2 = ((ns1) it.next()).d;
                        int deviceId = device2.getDeviceId();
                        if (num2 != null && num2.intValue() == deviceId) {
                            return list3;
                        }
                    }
                }
                return lv0.B0(list3, et1.O(device2));
            case 24:
                DeviceDelta deviceDelta = (DeviceDelta) obj3;
                List<ns1> list4 = (List) obj;
                list4.getClass();
                ArrayList arrayList2 = new ArrayList(mv0.Z(list4, 10));
                for (ns1 ns1VarA : list4) {
                    Integer num3 = ns1VarA.d;
                    int deviceId2 = deviceDelta.getDeviceId();
                    if (num3 != null && num3.intValue() == deviceId2) {
                        if (deviceDelta.isMobileWakeActivated() == null && deviceDelta.isWakeOnLanPossible() == null) {
                            ms1Var2 = ns1VarA.f;
                        } else {
                            Boolean boolIsMobileWakeActivated2 = deviceDelta.isMobileWakeActivated();
                            Boolean boolIsWakeOnLanPossible = deviceDelta.isWakeOnLanPossible();
                            Boolean bool5 = Boolean.TRUE;
                            ms1Var2 = im3.n(boolIsMobileWakeActivated2, bool5) ? ms1Var4 : im3.n(boolIsWakeOnLanPossible, bool5) ? ms1Var3 : null;
                        }
                        ms1 ms1Var5 = ms1Var2;
                        DeviceOnlineStatus onlineStatus2 = deviceDelta.getOnlineStatus();
                        ls1 ls1VarL = onlineStatus2 != null ? et1.L(onlineStatus2, ms1Var5 != null) : ns1VarA.c;
                        Long teamViewerId2 = deviceDelta.getTeamViewerId();
                        long jLongValue2 = teamViewerId2 != null ? teamViewerId2.longValue() : ns1VarA.a;
                        String displayName2 = deviceDelta.getDisplayName();
                        if (displayName2 == null) {
                            displayName2 = ns1VarA.b;
                        }
                        ns1VarA = ns1.a(ns1VarA, jLongValue2, displayName2, ls1VarL, null, ms1Var5, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194264);
                    }
                    arrayList2.add(ns1VarA);
                }
                return arrayList2;
            case 25:
                return (xd3) obj3;
            case 26:
                in1 in1Var = (in1) obj3;
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
                documentBuilderFactoryNewInstance.setNamespaceAware(true);
                Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(bArr))).getDocumentElement();
                documentElement.getClass();
                p82 p82Var = new p82(documentElement);
                in1Var.getClass();
                nm nmVar = new nm((byte) 1);
                float fN = v67.n(h57.d(p82Var, "width"), in1Var);
                float fN2 = v67.n(h57.d(p82Var, "height"), in1Var);
                String strD = h57.d(p82Var, "viewportWidth");
                float f = strD != null ? Float.parseFloat(strD) : 0.0f;
                String strD2 = h57.d(p82Var, "viewportHeight");
                ve3 ve3Var = new ve3(null, fN, fN2, f, strD2 != null ? Float.parseFloat(strD2) : 0.0f, 0L, 0, im3.n(h57.d(p82Var, "autoMirrored"), "true"), 97);
                h57.s(p82Var, ve3Var, nmVar);
                return new ae3(ve3Var.e());
            case 27:
                tf3 tf3Var = (tf3) obj3;
                IInAppPurchaseViewModel iInAppPurchaseViewModel = tf3Var.n;
                List list5 = (List) obj;
                list5.getClass();
                Iterator it2 = list5.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        lx5 lx5Var = (lx5) next;
                        if ((lx5Var == null || lx5Var.a() != 2) && (lx5Var == null || lx5Var.a() != 1)) {
                        }
                    } else {
                        next = null;
                    }
                }
                lx5 lx5Var2 = (lx5) next;
                String strF2 = tf3Var.f2105o.F();
                if (IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_IsAccountLoggedIn(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel) && !IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_DoesAccountNeedALicense(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel)) {
                    obj2 = lf3.a;
                } else if (!IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_IsAccountLoggedIn(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel) || lx5Var2 == null) {
                    obj2 = qf3.a;
                } else {
                    JSONObject jSONObject = lx5Var2.c;
                    String strOptString = jSONObject.optString("obfuscatedAccountId");
                    hr2 hr2Var = (strOptString == null && jSONObject.optString("obfuscatedProfileId") == null) ? null : new hr2(strOptString, (byte) 4);
                    if (im3.n(hr2Var != null ? hr2Var.n : null, strF2)) {
                        obj2 = pf3.a;
                    } else {
                        obj2 = qf3.a;
                    }
                }
                im3.R(e8.n(tf3Var), null, null, new oa1((Object) tf3Var, obj2, (hc1) (objArr == true ? 1 : 0), (byte) 26), 3);
                return f88Var;
            case 28:
                dg3 dg3Var = (dg3) obj3;
                List list6 = (List) obj;
                list6.getClass();
                if (list6.isEmpty()) {
                    IInAppPurchaseViewModel iInAppPurchaseViewModel2 = dg3Var.n;
                    if (IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_DoesAccountNeedALicense(iInAppPurchaseViewModel2.a, iInAppPurchaseViewModel2)) {
                        im3.R(e8.n(dg3Var), null, null, new y0(dg3Var, objArr2 == true ? 1 : 0, (byte) 18), 3);
                    }
                } else {
                    Iterator it3 = list6.iterator();
                    if (!it3.hasNext()) {
                        yq4.p();
                        return null;
                    }
                    Object next2 = it3.next();
                    if (it3.hasNext()) {
                        int iA = ((lx5) next2).a();
                        do {
                            Object next3 = it3.next();
                            int iA2 = ((lx5) next3).a();
                            if (iA < iA2) {
                                next2 = next3;
                                iA = iA2;
                            }
                        } while (it3.hasNext());
                    }
                    im3.R(e8.n(dg3Var), null, null, new oa1((Object) dg3Var, next2, (hc1) (objArr3 == true ? 1 : 0), (byte) 28), 3);
                }
                return f88Var;
            default:
                ah3 ah3Var = (ah3) obj3;
                hi0 hi0Var = (hi0) obj;
                float density = hi0Var.getDensity() * ((w32) ah3Var.L.d()).m;
                rj rjVarA = tj.a();
                pw6 pw6VarA = ah3Var.K;
                if (pw6VarA == null) {
                    pw6VarA = ux6.a(((rn4) xk0.q(ah3Var, un4.a)).c, au8.w);
                }
                vs1 vs1VarA = pw6VarA.a(hi0Var.m.d(), hi0Var.m.getLayoutDirection(), hi0Var);
                if (vs1VarA instanceof ob5) {
                    rj.b(rjVarA, ((ob5) vs1VarA).e);
                } else if (vs1VarA instanceof pb5) {
                    rj.c(rjVarA, ((pb5) vs1VarA).e);
                } else {
                    if (!(vs1VarA instanceof nb5)) {
                        gk0.s();
                        return null;
                    }
                    rj.a(rjVarA, ((nb5) vs1VarA).e);
                }
                rj rjVarA2 = tj.a();
                rj.b(rjVarA2, new v56(0.0f, Float.intBitsToFloat((int) (hi0Var.m.d() & 4294967295L)) - density, Float.intBitsToFloat((int) (hi0Var.m.d() >> 32)), Float.intBitsToFloat((int) (4294967295L & hi0Var.m.d()))));
                rj rjVarA3 = tj.a();
                rjVarA3.f(rjVarA2, rjVarA, 1);
                return hi0Var.a(new o43(rjVarA3, ah3Var, b2));
        }
    }

    public /* synthetic */ a81(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
    }

    public /* synthetic */ a81(ru1 ru1Var, Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
