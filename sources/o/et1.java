package o;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.apidefinitions.legacydevices.models.Device;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceManagedState;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceType;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceFlags;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntry;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntryType;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceModuleType;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.InAppPurchaseViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class et1 {
    public static int a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class A(wt3 wt3Var) {
        wt3Var.getClass();
        Class clsA = ((vr0) wt3Var).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class B(wt3 wt3Var) {
        wt3Var.getClass();
        Class clsA = ((vr0) wt3Var).a();
        if (clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final sy4 C(ty4 ty4Var, int i) {
        ty4Var.getClass();
        return sy4.d(ty4Var.getString(i));
    }

    public static final String D(du6 du6Var) {
        String str = du6Var.l;
        if (str != null) {
            if (str.length() == 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String string = du6Var.j.toString();
        string.getClass();
        return string;
    }

    public static final boolean E(dd5 dd5Var, ht2 ht2Var) {
        dd5Var.getClass();
        ht2Var.getClass();
        return dd5Var.a(ht2Var);
    }

    public static u86 F(zi0 zi0Var, Function0 function0) {
        if (function0 != null) {
            return new u86(zi0Var, function0);
        }
        hk0.g("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
        return null;
    }

    public static int G(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        gk0.l(ua5.l("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
        return 0;
    }

    public static float H(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static final long I(long j, long j2) {
        return z68.a(j, rv0.h) ? j2 : j;
    }

    public static sy4 J(sy4 sy4Var, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!sy4Var.n) {
            String strC = sy4Var.c();
            if (bc7.N(false, strC, str) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return sy4.e(str2.concat(ub7.i0(strC, str)));
                }
                if (!z) {
                    return sy4Var;
                }
                String strI0 = ub7.i0(strC, str);
                if (strI0.length() != 0 && g68.v(0, strI0)) {
                    if (strI0.length() != 1 && g68.v(1, strI0)) {
                        Iterator it = new yk3(0, strI0.length() - 1, 1).iterator();
                        do {
                            xk3 xk3Var = (xk3) it;
                            if (!xk3Var.f2526o) {
                                next = null;
                                break;
                            }
                            next = xk3Var.next();
                        } while (g68.v(((Number) next).intValue(), strI0));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strI0 = g68.C(strI0.substring(0, iIntValue)).concat(strI0.substring(iIntValue));
                        } else {
                            strI0 = g68.C(strI0);
                        }
                    } else if (strI0.length() != 0 && 'A' <= (cCharAt2 = strI0.charAt(0)) && cCharAt2 < '[') {
                        strI0 = Character.toLowerCase(cCharAt2) + strI0.substring(1);
                    }
                }
                if (sy4.f(strI0)) {
                    return sy4.e(strI0);
                }
            }
        }
        return null;
    }

    public static final Function1 K(xy6 xy6Var, Function0 function0, ux2 ux2Var, int i) {
        xy6Var.getClass();
        function0.getClass();
        Object objK = ux2Var.K();
        aw awVar = e01.a;
        if (objK == awVar) {
            objK = ck3.w(ux2Var);
            ux2Var.g0(objK);
        }
        me1 me1Var = (me1) objK;
        boolean z = ((((i & 14) ^ 6) > 4 && ux2Var.f(xy6Var)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ux2Var.f(function0)) || (i & 48) == 32);
        Object objK2 = ux2Var.K();
        if (z || objK2 == awVar) {
            objK2 = new m5((Object) me1Var, (Object) xy6Var, (Object) function0, (byte) 23);
            ux2Var.g0(objK2);
        }
        return (Function1) objK2;
    }

    public static final ls1 L(DeviceOnlineStatus deviceOnlineStatus, boolean z) {
        deviceOnlineStatus.getClass();
        if (deviceOnlineStatus == DeviceOnlineStatus.Offline && z) {
            return ls1.f1400o;
        }
        int i = dt1.b[deviceOnlineStatus.ordinal()];
        if (i == 1) {
            return ls1.m;
        }
        if (i == 2) {
            return ls1.n;
        }
        gk0.s();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void M(Activity activity, boolean z) {
        ac3 ac3Var = activity instanceof ac3 ? (ac3) activity : null;
        if (ac3Var != null) {
            MainActivity mainActivity = (MainActivity) ac3Var;
            if (z) {
                mainActivity.c0(8);
            } else {
                mainActivity.c0(0);
            }
        }
    }

    public static final mj3 N(InputStream inputStream) {
        inputStream.getClass();
        return new mj3(inputStream, new ov7());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    public static final ns1 O(Device device) {
        ms1 ms1Var;
        ms1 ms1Var2;
        boolean z;
        ks1 ks1Var;
        DeviceType deviceType;
        int i;
        js1 js1Var;
        device.getClass();
        Boolean boolIsMobileWakeActivated = device.isMobileWakeActivated();
        Boolean bool = Boolean.TRUE;
        js1 js1Var2 = null;
        if (!im3.n(boolIsMobileWakeActivated, bool)) {
            if (im3.n(device.isWakeOnLanPossible(), bool)) {
                ms1Var2 = ms1.n;
            } else {
                ms1Var = null;
            }
            long teamViewerId = device.getTeamViewerId();
            String displayName = device.getDisplayName();
            DeviceOnlineStatus onlineStatus = device.getOnlineStatus();
            if (ms1Var != null) {
                z = true;
            } else {
                z = false;
            }
            ls1 ls1VarL = L(onlineStatus, z);
            Integer numValueOf = Integer.valueOf(device.getDeviceId());
            Integer numValueOf2 = Integer.valueOf(device.getGroupId());
            String description = device.getDescription();
            Boolean hasPersonalPassword = device.getHasPersonalPassword();
            if (device.isManagedDevice() || device.getManagedState() != DeviceManagedState.WeAreManager) {
                ks1Var = ks1.m;
            } else {
                ks1Var = ks1.n;
            }
            ks1 ks1Var2 = ks1Var;
            deviceType = device.getDeviceType();
            if (deviceType != null) {
                i = dt1.d[deviceType.ordinal()];
                if (i != 1) {
                    js1Var = js1.m;
                } else if (i != 2) {
                    js1Var = js1.n;
                } else if (i != 3) {
                    js1Var = js1.f1197o;
                } else {
                    if (i == 4) {
                        gk0.s();
                        return null;
                    }
                    js1Var = js1.p;
                }
                js1Var2 = js1Var;
            }
            return new ns1(teamViewerId, displayName, ls1VarL, numValueOf, numValueOf2, ms1Var, description, hasPersonalPassword, null, null, false, null, ks1Var2, js1Var2, null, 2618944);
        }
        ms1Var2 = ms1.m;
        ms1Var = ms1Var2;
        long teamViewerId2 = device.getTeamViewerId();
        String displayName2 = device.getDisplayName();
        DeviceOnlineStatus onlineStatus2 = device.getOnlineStatus();
        if (ms1Var != null) {
            z = true;
        } else {
            z = false;
        }
        ls1 ls1VarL2 = L(onlineStatus2, z);
        Integer numValueOf3 = Integer.valueOf(device.getDeviceId());
        Integer numValueOf4 = Integer.valueOf(device.getGroupId());
        String description2 = device.getDescription();
        Boolean hasPersonalPassword2 = device.getHasPersonalPassword();
        if (device.isManagedDevice()) {
            ks1Var = ks1.m;
        } else {
            ks1Var = ks1.m;
        }
        ks1 ks1Var3 = ks1Var;
        deviceType = device.getDeviceType();
        if (deviceType != null) {
            i = dt1.d[deviceType.ordinal()];
            if (i != 1) {
                js1Var = js1.m;
            } else if (i != 2) {
                js1Var = js1.n;
            } else if (i != 3) {
                js1Var = js1.f1197o;
            } else {
                if (i == 4) {
                    gk0.s();
                    return null;
                }
                js1Var = js1.p;
            }
            js1Var2 = js1Var;
        }
        return new ns1(teamViewerId2, displayName2, ls1VarL2, numValueOf3, numValueOf4, ms1Var, description2, hasPersonalPassword2, null, null, false, null, ks1Var3, js1Var2, null, 2618944);
    }

    public static final ns1 P(DeviceListEntry deviceListEntry) {
        deviceListEntry.getClass();
        long teamViewerId = deviceListEntry.getTeamViewerId();
        String displayName = deviceListEntry.getDisplayName();
        com.teamviewer.apidefinitions.manageddevices.models.DeviceOnlineStatus onlineStatus = deviceListEntry.getOnlineStatus();
        ls1 ls1VarS = onlineStatus != null ? S(onlineStatus) : null;
        ms1 ms1VarU = U(deviceListEntry.getFlags());
        String description = deviceListEntry.getDescription();
        Boolean hasPassword = deviceListEntry.getHasPassword();
        DeviceModuleType moduleType = deviceListEntry.getModuleType();
        String tvVersion = deviceListEntry.getTvVersion();
        UUID managementId = deviceListEntry.getManagementId();
        List<UUID> groupIds = deviceListEntry.getGroupIds();
        ks1 ks1Var = deviceListEntry.getDeviceListEntryType() == DeviceListEntryType.Bookmarked ? ks1.m : ks1.n;
        com.teamviewer.apidefinitions.manageddevices.models.DeviceType deviceType = deviceListEntry.getDeviceType();
        return new ns1(teamViewerId, displayName, ls1VarS, null, null, ms1VarU, description, hasPassword, moduleType, tvVersion, true, groupIds, ks1Var, deviceType != null ? Q(deviceType) : null, managementId, 512088);
    }

    public static final js1 Q(com.teamviewer.apidefinitions.manageddevices.models.DeviceType deviceType) {
        int i = dt1.c[deviceType.ordinal()];
        if (i == 1) {
            return js1.m;
        }
        if (i == 2) {
            return js1.n;
        }
        if (i == 3) {
            return js1.f1197o;
        }
        if (i == 4) {
            return js1.p;
        }
        gk0.s();
        return null;
    }

    public static final n72 R(rc3 rc3Var) {
        if (rc3Var.equals(pc3.a)) {
            return n72.Mouse;
        }
        if (rc3Var.equals(qc3.a)) {
            return n72.Touch;
        }
        gk0.s();
        return null;
    }

    public static final ls1 S(com.teamviewer.apidefinitions.manageddevices.models.DeviceOnlineStatus deviceOnlineStatus) {
        deviceOnlineStatus.getClass();
        int i = dt1.a[deviceOnlineStatus.ordinal()];
        if (i == 1) {
            return ls1.m;
        }
        if (i == 2) {
            return ls1.n;
        }
        if (i == 3) {
            return ls1.f1400o;
        }
        gk0.s();
        return null;
    }

    public static final cb3 T(rc3 rc3Var) {
        if (rc3Var.equals(pc3.a)) {
            return cb3.Mouse;
        }
        if (rc3Var.equals(qc3.a)) {
            return cb3.Touch;
        }
        gk0.s();
        return null;
    }

    public static final ms1 U(List list) {
        if (list != null && list.contains(DeviceFlags.MobileWakeActive)) {
            return ms1.m;
        }
        if (list == null || !list.contains(DeviceFlags.WakeOnLanActive)) {
            return null;
        }
        return ms1.n;
    }

    public static void V(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iB0 = b0(parcel, i);
        parcel.writeBundle(bundle);
        c0(parcel, iB0);
    }

    public static void W(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iB0 = b0(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        c0(parcel, iB0);
    }

    public static void X(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iB0 = b0(parcel, i);
        parcel.writeString(str);
        c0(parcel, iB0);
    }

    public static void Y(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iB0 = b0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        c0(parcel, iB0);
    }

    public static void Z(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iB0 = b0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        c0(parcel, iB0);
    }

    public static final void a(z31 z31Var, yl6 yl6Var, boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        yl6Var.getClass();
        function1.getClass();
        ux2Var.Y(-1229958101);
        int i2 = i | (ux2Var.f(z31Var) ? 4 : 2) | (ux2Var.f(yl6Var) ? 32 : 16) | (ux2Var.g(z) ? 256 : 128) | (ux2Var.h(function1) ? 2048 : 1024) | (ux2Var.f(fs4Var) ? 16384 : 8192);
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            String str = yl6Var.a;
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 7168) == 2048) | (i3 == 4);
            Object objK = ux2Var.K();
            if (z2 || objK == e01.a) {
                objK = new a26((Object) function1, (Object) z31Var, (byte) 11);
                ux2Var.g0(objK);
            }
            iq8.d(z31Var, fs4Var, str, false, z, (Function0) objK, ux2Var, ((i2 >> 9) & 112) | i3 | ((i2 << 6) & 57344), 8);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new xa(z31Var, yl6Var, z, function1, fs4Var, i);
        }
    }

    public static void a0(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static final void b(int i, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(571638628);
        int i2 = 2;
        int i3 = i | (ux2Var.h(function0) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 384;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new l5(i2, null, (byte) 9);
                ux2Var.g0(objK);
            }
            ck3.i(f88.a, (hw2) objK, ux2Var);
            cs4 cs4Var = cs4.b;
            uf0.b(function0, au8.O(1095594924, new v4(function1, (byte) 18), ux2Var), cs4Var, au8.O(1115136046, new v4(function0, (byte) 19), ux2Var), ck3.t, ck3.u, null, 0L, 0L, 0L, 0L, null, ux2Var, (i3 & 14) | 1772976, 0, 16272);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new u71(function0, function1, fs4Var2, i, (byte) 2);
        }
    }

    public static int b0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final void c(int i, ux2 ux2Var, boolean z) {
        int i2;
        boolean z2;
        ux2Var.Y(-1451323518);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            Activity activity = (Activity) ux2Var.j(tc4.a);
            if (activity == null) {
                j56 j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new ec(z, i, b);
                    return;
                }
                return;
            }
            boolean zF = ux2Var.f(activity);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (zF || objK == awVar) {
                objK = h57.p(Boolean.FALSE);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) objK;
            int i3 = i2 & 14;
            ga0.a(i3, ux2Var, z);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zF2 = (i3 == 4) | ux2Var.f(px4Var) | ux2Var.h(activity);
            Object objK2 = ux2Var.K();
            if (zF2 || objK2 == awVar) {
                z2 = z;
                objK2 = new oa1(z2, activity, px4Var, null, (byte) 16);
                ux2Var.g0(objK2);
            } else {
                z2 = z;
            }
            ck3.h(activity, boolValueOf, (hw2) objK2, ux2Var);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zF3 = ux2Var.f(px4Var) | (i3 == 4) | ux2Var.h(activity);
            Object objK3 = ux2Var.K();
            if (zF3 || objK3 == awVar) {
                objK3 = new iq1(b2, activity, px4Var, z2);
                ux2Var.g0(objK3);
            }
            ck3.d(activity, boolValueOf2, (Function1) objK3, ux2Var);
        } else {
            z2 = z;
            ux2Var.Q();
        }
        j56 j56VarR2 = ux2Var.r();
        if (j56VarR2 != null) {
            j56VarR2.d = new ec(z2, i, (byte) 3);
        }
    }

    public static void c0(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static IInAppPurchaseViewModel d() {
        long jInAppPurchaseViewModelFactory_GetInAppPurchaseViewModel = InAppPurchaseViewModelFactorySWIGJNI.InAppPurchaseViewModelFactory_GetInAppPurchaseViewModel();
        if (jInAppPurchaseViewModelFactory_GetInAppPurchaseViewModel == 0) {
            return null;
        }
        IInAppPurchaseViewModel iInAppPurchaseViewModel = new IInAppPurchaseViewModel();
        iInAppPurchaseViewModel.b = true;
        iInAppPurchaseViewModel.a = jInAppPurchaseViewModelFactory_GetInAppPurchaseViewModel;
        return iInAppPurchaseViewModel;
    }

    public static final void e(yy0 yy0Var, ux2 ux2Var, int i) {
        ux2Var.Y(-709502251);
        byte b = 2;
        boolean z = false;
        if (ux2Var.N(i & 1, (i & 3) != 2)) {
            h72 h72Var = ph6.a;
            nh6 nh6Var = (nh6) ux2Var.j(h72Var);
            lh6 lh6VarP = zu1.P(ux2Var);
            Object[] objArr = {nh6Var};
            byte b2 = 6;
            a65 a65Var = new a65((byte) 20, (Object) new qo2(b2), (Object) new o43(nh6Var, lh6VarP, b2), z);
            boolean zH = ux2Var.h(nh6Var) | ux2Var.h(lh6VarP);
            Object objK = ux2Var.K();
            if (zH || objK == e01.a) {
                objK = new ql1(nh6Var, lh6VarP, (byte) 18);
                ux2Var.g0(objK);
            }
            c54 c54Var = (c54) zu1.O(objArr, a65Var, (Function0) objK, ux2Var, 0);
            j51.l(h72Var.a(c54Var), au8.O(-412824043, new c9((Object) yy0Var, (Object) c54Var, (byte) 29), ux2Var), ux2Var, 56);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new np2(yy0Var, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x011e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0128  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void f(ye5 ye5Var, cv7 cv7Var, yy0 yy0Var, yy0 yy0Var2, fs4 fs4Var, iw2 iw2Var, he5 he5Var, ux2 ux2Var, int i, int i2) {
        int i3;
        he5 he5Var2;
        byte b;
        boolean z;
        he5 he5Var3;
        j56 j56VarR;
        he5 he5Var4;
        he5 he5VarF;
        boolean z2;
        Object objK;
        ux2Var.Y(-1856579097);
        if ((i & 6) == 0) {
            i3 = (ux2Var.f(ye5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.f(cv7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.h(yy0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ux2Var.h(iw2Var) ? 131072 : 65536;
        }
        int i4 = 1572864 | i3;
        int i5 = i2 & 128;
        if (i5 == 0) {
            if ((12582912 & i) == 0) {
                he5Var2 = he5Var;
                i4 |= ux2Var.f(he5Var2) ? 8388608 : 4194304;
            }
            b = 0;
            if ((4793491 & i4) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i4 & 1, z)) {
                if (i5 != 0) {
                    he5Var2 = null;
                }
                he5Var4 = he5Var2;
                if (he5Var4 == null) {
                    ux2Var.W(-1761065701);
                    if ((i4 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objK = ux2Var.K();
                    if (z2 || objK == e01.a) {
                        objK = new ya4(cv7Var, b);
                        ux2Var.g0(objK);
                    }
                    he5VarF = nv1.F((Function0) objK, false, ux2Var);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-1761066755);
                    ux2Var.p(false);
                    he5VarF = he5Var4;
                }
                int i6 = i4 << 3;
                tu7.b(fs4Var.f(androidx.compose.foundation.layout.b.c), ye5Var, cv7Var, xa4.a, yy0Var, iw2Var, he5VarF, yy0Var2, ux2Var, (i6 & 29360128) | (i6 & 112) | 3072 | (i6 & 896) | ((i4 << 6) & 57344) | (458752 & i4) | ((i4 << 15) & 234881024));
                he5Var3 = he5Var4;
            } else {
                ux2Var.Q();
                he5Var3 = he5Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new za4(ye5Var, cv7Var, yy0Var, yy0Var2, fs4Var, iw2Var, he5Var3, i, i2);
            }
        }
        i4 = 14155776 | i3;
        he5Var2 = he5Var;
        b = 0;
        if ((4793491 & i4) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i4 & 1, z)) {
            if (i5 != 0) {
                he5Var2 = null;
            }
            he5Var4 = he5Var2;
            if (he5Var4 == null) {
                ux2Var.W(-1761065701);
                if ((i4 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objK = ux2Var.K();
                if (z2) {
                    objK = new ya4(cv7Var, b);
                    ux2Var.g0(objK);
                } else {
                    objK = new ya4(cv7Var, b);
                    ux2Var.g0(objK);
                }
                he5VarF = nv1.F((Function0) objK, false, ux2Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1761066755);
                ux2Var.p(false);
                he5VarF = he5Var4;
            }
            int i7 = i4 << 3;
            tu7.b(fs4Var.f(androidx.compose.foundation.layout.b.c), ye5Var, cv7Var, xa4.a, yy0Var, iw2Var, he5VarF, yy0Var2, ux2Var, (i7 & 29360128) | (i7 & 112) | 3072 | (i7 & 896) | ((i4 << 6) & 57344) | (458752 & i4) | ((i4 << 15) & 234881024));
            he5Var3 = he5Var4;
        } else {
            ux2Var.Q();
            he5Var3 = he5Var2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new za4(ye5Var, cv7Var, yy0Var, yy0Var2, fs4Var, iw2Var, he5Var3, i, i2);
        }
    }

    public static final void g(int i, Function1 function1, ux2 ux2Var, fs4 fs4Var) {
        function1.getClass();
        ux2Var.Y(-1086970834);
        int i2 = (ux2Var.h(function1) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 32 : 16);
        byte b = 18;
        byte b2 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            xh4 xh4VarH = vt1.H(new yh4(R.raw.lottie_animation_login), ux2Var);
            kh4 kh4VarG = g68.g((qh4) xh4VarH.getValue(), Integer.MAX_VALUE, ux2Var, 958);
            List listL = qf0.L(m77.z(R.string.sign_in_lottie_title_option_1, ux2Var), m77.z(R.string.sign_in_lottie_title_option_2, ux2Var), m77.z(R.string.sign_in_lottie_title_option_3, ux2Var), m77.z(R.string.sign_in_lottie_title_option_4, ux2Var));
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (objK == obj) {
                objK = new yf5(0);
                ux2Var.g0(objK);
            }
            yf5 yf5Var = (yf5) objK;
            Object objK2 = ux2Var.K();
            if (objK2 == obj) {
                objK2 = new wf5(0.0f);
                ux2Var.g0(objK2);
            }
            wf5 wf5Var = (wf5) objK2;
            Object objK3 = ux2Var.K();
            if (objK3 == obj) {
                objK3 = d57.b(new eb((Object) listL, (Object) kh4VarG, (Object) wf5Var, (Object) yf5Var, (byte) 10));
                ux2Var.g0(objK3);
            }
            i97 i97Var = (i97) objK3;
            Object objT = h57.t(function1, ux2Var);
            String str = (String) i97Var.getValue();
            boolean zF = ux2Var.f(objT);
            Object objK4 = ux2Var.K();
            if (zF || objK4 == obj) {
                objK4 = new i9(objT, i97Var, null, b);
                ux2Var.g0(objK4);
            }
            ck3.i(str, (hw2) objK4, ux2Var);
            qh4 qh4Var = (qh4) xh4VarH.getValue();
            fs4 fs4VarF = fs4Var.f(androidx.compose.foundation.layout.b.c);
            boolean zF2 = ux2Var.f(kh4VarG);
            Object objK5 = ux2Var.K();
            if (zF2 || objK5 == obj) {
                objK5 = new k31(kh4VarG, b2);
                ux2Var.g0(objK5);
            }
            ct1.f(qh4Var, (Function0) objK5, fs4VarF, ux2Var, 0);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new l64((byte) 3, i, function1, fs4Var);
        }
    }

    public static final void h(Function0 function0, ux2 ux2Var, int i) {
        int i2;
        function0.getClass();
        ux2Var.Y(1734552115);
        if ((i & 6) == 0) {
            i2 = i | (ux2Var.h(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new yv1(function0, (byte) 12);
                ux2Var.g0(objK);
            }
            uf0.b((Function0) objK, au8.O(-1573697301, new v4(function0, (byte) 24), ux2Var), null, null, ka0.h, ka0.i, null, 0L, 0L, 0L, 0L, null, ux2Var, 1769520, 0, 16284);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new xn4(function0, i, (byte) 0);
        }
    }

    public static final void i(final int i, final int i2, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var, final boolean z) {
        int i3;
        int i4;
        final Function0 function2;
        int i5;
        Function0 function3;
        int i6;
        final Function0 function4;
        final fs4 fs4Var2;
        Function0 function5;
        Function0 function6;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(167764895);
        if ((i & 6) == 0) {
            i3 = i | (ux2Var2.g(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (ux2Var.f(fs4Var) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i5 = i4 | 384;
            function2 = function0;
        } else {
            function2 = function0;
            i5 = i4 | (ux2Var2.h(function2) ? 256 : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i6 = i5 | 3072;
            function3 = function1;
        } else {
            function3 = function1;
            i6 = i5 | (ux2Var2.h(function3) ? 2048 : 1024);
        }
        int i10 = i6;
        if (ux2Var2.N(i10 & 1, (i10 & 1171) != 1170)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4Var3 = i7 != 0 ? cs4Var : fs4Var;
            aw awVar = e01.a;
            if (i8 != 0) {
                Object objK = ux2Var2.K();
                if (objK == awVar) {
                    objK = new w26((byte) 20);
                    ux2Var2.g0(objK);
                }
                function5 = (Function0) objK;
            } else {
                function5 = function2;
            }
            if (i9 != 0) {
                Object objK2 = ux2Var2.K();
                if (objK2 == awVar) {
                    objK2 = new w26((byte) 21);
                    ux2Var2.g0(objK2);
                }
                function6 = (Function0) objK2;
            } else {
                function6 = function3;
            }
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(au8.s(fs4Var3, ((rn4) ux2Var2.j(un4.a)).a.p, kh.V), "TVTA-searchScreen-optionButtons");
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            int i11 = (i10 << 9) & 7168;
            g57.b(function6, ka0.F(eg6.a(cs4Var, 1.0f), 0.0f, 0.0f, 12.0f, 0.0f, 11), null, z, "TVTA-searchScreen-optionButtons-fileTransfer", null, kh.f1264o, ux2Var2, ((i10 >> 9) & 14) | 1597440 | i11, 36);
            Function0 function7 = function6;
            ux2Var2 = ux2Var;
            Function0 function8 = function5;
            m77.g(function8, eg6.a(cs4Var, 1.0f), null, z, "TVTA-searchScreen-optionButtons-remoteControl", null, kh.p, ux2Var2, ((i10 >> 6) & 14) | 1597440 | i11, 36);
            ux2Var2.p(true);
            function2 = function8;
            fs4Var2 = fs4Var3;
            function4 = function7;
        } else {
            ux2Var2.Q();
            function4 = function3;
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.om6
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    et1.i(yo1.Y(i | 1), i2, function2, function4, (ux2) obj, fs4Var2, z);
                    return f88.a;
                }
            };
        }
    }

    public static final void j(final Integer num, final String str, final Function0 function0, final Function0 function1, fs4 fs4Var, final int i, final int i2, ux2 ux2Var, final int i3) {
        final fs4 fs4Var2;
        fs4 fs4Var3;
        str.getClass();
        function0.getClass();
        function1.getClass();
        ux2Var.Y(-25601049);
        byte b = 2;
        byte b2 = 4;
        int i4 = i3 | (ux2Var.f(num) ? 4 : 2) | (ux2Var.f(str) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128) | (ux2Var.h(function1) ? 2048 : 1024) | 24576 | (ux2Var.d(i) ? 131072 : 65536) | (ux2Var.d(i2) ? 1048576 : 524288);
        byte b3 = 1;
        if (ux2Var.N(i4 & 1, (599187 & i4) != 599186)) {
            ux2Var.S();
            if ((i3 & 1) == 0 || ux2Var.x()) {
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var;
            }
            ux2Var.q();
            fs4Var2 = fs4Var3;
            uf0.b(function0, au8.O(1624224415, new xn4(function1, i2, b3), ux2Var), fs4Var2, au8.O(-571004451, new xn4(function0, i, b), ux2Var), au8.O(1528733979, new gg4(num, (byte) 6), ux2Var), au8.O(-1716364102, new qa(str, b2), ux2Var), null, 0L, 0L, 0L, 0L, null, ux2Var, ((i4 >> 6) & 14) | 1772976, 0, 16272);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(num, str, function0, function1, fs4Var2, i, i2, i3) { // from class: o.jj5
                public final /* synthetic */ Integer m;
                public final /* synthetic */ String n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ Function0 f1172o;
                public final /* synthetic */ Function0 p;
                public final /* synthetic */ fs4 q;
                public final /* synthetic */ int r;
                public final /* synthetic */ int s;

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(1);
                    et1.j(this.m, this.n, this.f1172o, this.p, this.q, this.r, this.s, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014a  */
    /* JADX WARN: Code duplicated, block: B:103:0x014c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0158  */
    /* JADX WARN: Code duplicated, block: B:110:0x016c  */
    /* JADX WARN: Code duplicated, block: B:111:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x017d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0192  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:137:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:140:0x0303  */
    /* JADX WARN: Code duplicated, block: B:141:0x0306  */
    /* JADX WARN: Code duplicated, block: B:144:0x030e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0313  */
    /* JADX WARN: Code duplicated, block: B:151:0x0333  */
    /* JADX WARN: Code duplicated, block: B:154:0x033d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x0344  */
    /* JADX WARN: Code duplicated, block: B:159:0x039d  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x011a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x012f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    public static final void k(ql6 ql6Var, String str, boolean z, fs4 fs4Var, Function1 function1, Function0 function0, Function0 function2, Function0 function3, ux2 ux2Var, int i, int i2) {
        int i3;
        Function1 function4;
        int i4;
        Function0 function5;
        int i5;
        int i6;
        Function0 function6;
        int i7;
        int i8;
        Function0 function7;
        int i9;
        boolean z2;
        Function1 function8;
        Function0 function9;
        Function0 function10;
        Function0 function11;
        fs4 fs4Var2;
        j56 j56VarR;
        aw awVar;
        Function0 function12;
        Function0 function13;
        Object objK;
        sq2 sq2Var;
        int i10;
        boolean z3;
        Object objK2;
        boolean z4;
        byte b;
        px4 px4VarN;
        boolean z5;
        boolean zF;
        Object objK3;
        hc1 hc1Var;
        Object objK4;
        byte b2;
        String strM;
        Function1 function14;
        int i11;
        boolean zF2;
        Object objK5;
        aw awVar2;
        aw awVar3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objK6;
        aw awVar4;
        boolean z10;
        Object objK7;
        Function1 function15;
        byte b3;
        Object objK8;
        Object objK9;
        Object objK10;
        Object objK11;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-546759111);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? ux2Var2.f(ql6Var) : ux2Var2.h(ql6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var2.g(z) ? 256 : 128;
        }
        int i12 = i3 | 3072;
        int i13 = i2 & 16;
        if (i13 == 0) {
            if ((i & 24576) == 0) {
                function4 = function1;
                i12 |= ux2Var2.h(function4) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                i12 |= 196608;
                function5 = function0;
            } else {
                function5 = function0;
                if ((i & 196608) == 0) {
                    if (ux2Var2.h(function5)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i12 |= i5;
                }
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i12 |= 1572864;
                function6 = function2;
            } else {
                function6 = function2;
                if ((i & 1572864) == 0) {
                    if (ux2Var2.h(function6)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i12 |= i7;
                }
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i12 |= 12582912;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & 12582912) == 0) {
                    if (ux2Var2.h(function7)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i12 |= i9;
                }
            }
            if ((i12 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ux2Var2.N(i12 & 1, z2)) {
                awVar = e01.a;
                if (i13 != 0) {
                    objK11 = ux2Var2.K();
                    if (objK11 == awVar) {
                        objK11 = new fk6((byte) 2);
                        ux2Var2.g0(objK11);
                    }
                    function4 = (Function1) objK11;
                }
                if (i4 != 0) {
                    objK10 = ux2Var2.K();
                    if (objK10 == awVar) {
                        objK10 = new w26((byte) 17);
                        ux2Var2.g0(objK10);
                    }
                    function12 = (Function0) objK10;
                } else {
                    function12 = function5;
                }
                if (i6 != 0) {
                    objK9 = ux2Var2.K();
                    if (objK9 == awVar) {
                        objK9 = new w26((byte) 18);
                        ux2Var2.g0(objK9);
                    }
                    function6 = (Function0) objK9;
                }
                if (i8 != 0) {
                    objK8 = ux2Var2.K();
                    if (objK8 == awVar) {
                        objK8 = new w26((byte) 19);
                        ux2Var2.g0(objK8);
                    }
                    function13 = (Function0) objK8;
                } else {
                    function13 = function7;
                }
                objK = ux2Var2.K();
                if (objK == awVar) {
                    objK = new sq2();
                    ux2Var2.g0(objK);
                }
                sq2Var = (sq2) objK;
                Object[] objArr = new Object[0];
                i10 = i12 & 112;
                if (i10 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objK2 = ux2Var2.K();
                z4 = z3;
                b = 6;
                if (z4 || objK2 == awVar) {
                    objK2 = new lz1(str, b);
                    ux2Var2.g0(objK2);
                }
                px4VarN = zu1.N(objArr, zr7.d, (Function0) objK2, ux2Var2);
                if (i10 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zF = z5 | ux2Var2.f(px4VarN);
                objK3 = ux2Var2.K();
                hc1Var = null;
                if (zF || objK3 == awVar) {
                    objK3 = new kq1(str, px4VarN, hc1Var, (byte) 2);
                    ux2Var2.g0(objK3);
                }
                ck3.i(str, (hw2) objK3, ux2Var2);
                objK4 = ux2Var2.K();
                b2 = 3;
                if (objK4 == awVar) {
                    objK4 = new z9(sq2Var, hc1Var, b2);
                    ux2Var2.g0(objK4);
                }
                ck3.i(f88.a, (hw2) objK4, ux2Var2);
                if (ql6Var.equals(ol6.a)) {
                    strM = to7.m(ux2Var2, -1983743805, R.string.connect_id_field_place_holder, ux2Var2, false);
                } else {
                    strM = to7.m(ux2Var2, -1983668723, R.string.search_place_holder, ux2Var2, false);
                }
                cs4 cs4Var = cs4.b;
                fs4 fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), "TVTA-searchScreen-input");
                dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
                function14 = function4;
                int iHashCode = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL = ux2Var2.l();
                fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(LayoutNode.e0);
                } else {
                    ux2Var2.j0();
                }
                o67.n(dg6VarA, d82.v, ux2Var2);
                o67.n(yj5VarL, d82.u, ux2Var2);
                o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS, d82.t, ux2Var2);
                i11 = i12;
                String str2 = strM;
                Function0 function16 = function6;
                Function0 function17 = function12;
                td3.b(lv1.T(R.drawable.navigation_back_icon, ux2Var2, 0), m77.z(R.string.navigation_back_content_description, ux2Var2), androidx.compose.foundation.layout.b.l(ka0.B(androidx.compose.foundation.b.b(iq8.j(androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), "TVTA-searchScreen-input-back"), sf6.a), false, null, null, function13, 15), 8.0f), 24.0f), ((rn4) ux2Var2.j(un4.a)).a.s, ux2Var2, 8, 0);
                zr7 zr7Var = (zr7) px4VarN.getValue();
                fs4 fs4VarB = ka0.B(uf0.n(androidx.compose.ui.platform.a.a(cs4Var, "TVTA-searchScreen-input-textField"), sq2Var).f(new s14(1.0f, true)), 0.0f);
                zF2 = ux2Var2.f(px4VarN);
                objK5 = ux2Var2.K();
                if (zF2) {
                    awVar2 = awVar;
                } else {
                    if (objK5 == awVar2) {
                    }
                    awVar2 = awVar;
                    fs4 fs4VarA2 = cp6.a(fs4VarB, false, (Function1) objK5);
                    awVar3 = awVar2;
                    long j = rv0.g;
                    z6 = false;
                    cq7 cq7VarD = jk0.d(j, j, j, j, j, ux2Var);
                    yx3 yx3Var = new yx3(0, 7, 119);
                    if ((i11 & 896) == 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if ((458752 & i11) == 131072) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z7 | z8;
                    objK6 = ux2Var.K();
                    if (z9) {
                        awVar4 = awVar3;
                    } else {
                        awVar4 = awVar3;
                        if (objK6 == awVar4) {
                        }
                        xx3 xx3Var = new xx3((Function1) objK6, 62);
                        boolean zF3 = ux2Var.f(px4VarN);
                        if ((i11 & 57344) == 16384) {
                            z6 = true;
                        }
                        z10 = zF3 | z6;
                        objK7 = ux2Var.K();
                        if (!z10 || objK7 == awVar4) {
                            function15 = function14;
                            b3 = 6;
                            objK7 = new g70(function15, px4VarN, b3);
                            ux2Var.g0(objK7);
                        } else {
                            function15 = function14;
                            b3 = 6;
                        }
                        o77.c(zr7Var, (Function1) objK7, fs4VarA2, false, null, au8.O(-1974155590, new qa(str2, b3), ux2Var), au8.O(190877244, new wh3(str, function16, (byte) 3), ux2Var), null, yx3Var, xx3Var, true, 0, 0, null, cq7VarD, ux2Var, 817889280);
                        ux2Var2 = ux2Var;
                        ux2Var2.p(true);
                        function8 = function15;
                        function9 = function17;
                        function11 = function13;
                        fs4Var2 = cs4Var;
                        function10 = function16;
                    }
                    objK6 = new x9((byte) 4, (Object) function17, z);
                    ux2Var.g0(objK6);
                    xx3 xx3Var2 = new xx3((Function1) objK6, 62);
                    boolean zF4 = ux2Var.f(px4VarN);
                    if ((i11 & 57344) == 16384) {
                        z6 = true;
                    }
                    z10 = zF4 | z6;
                    objK7 = ux2Var.K();
                    if (z10) {
                        function15 = function14;
                        b3 = 6;
                        objK7 = new g70(function15, px4VarN, b3);
                        ux2Var.g0(objK7);
                    } else {
                        function15 = function14;
                        b3 = 6;
                        objK7 = new g70(function15, px4VarN, b3);
                        ux2Var.g0(objK7);
                    }
                    o77.c(zr7Var, (Function1) objK7, fs4VarA2, false, null, au8.O(-1974155590, new qa(str2, b3), ux2Var), au8.O(190877244, new wh3(str, function16, (byte) 3), ux2Var), null, yx3Var, xx3Var2, true, 0, 0, null, cq7VarD, ux2Var, 817889280);
                    ux2Var2 = ux2Var;
                    ux2Var2.p(true);
                    function8 = function15;
                    function9 = function17;
                    function11 = function13;
                    fs4Var2 = cs4Var;
                    function10 = function16;
                }
                awVar2 = awVar;
                objK5 = new va(px4VarN, (byte) 24);
                ux2Var2.g0(objK5);
                awVar2 = awVar;
                fs4 fs4VarA3 = cp6.a(fs4VarB, false, (Function1) objK5);
                awVar3 = awVar2;
                long j2 = rv0.g;
                z6 = false;
                cq7 cq7VarD2 = jk0.d(j2, j2, j2, j2, j2, ux2Var);
                yx3 yx3Var2 = new yx3(0, 7, 119);
                if ((i11 & 896) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((458752 & i11) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z7 | z8;
                objK6 = ux2Var.K();
                if (z9) {
                    awVar4 = awVar3;
                    if (objK6 == awVar4) {
                    }
                    xx3 xx3Var3 = new xx3((Function1) objK6, 62);
                    boolean zF5 = ux2Var.f(px4VarN);
                    if ((i11 & 57344) == 16384) {
                        z6 = true;
                    }
                    z10 = zF5 | z6;
                    objK7 = ux2Var.K();
                    if (z10) {
                        function15 = function14;
                        b3 = 6;
                        objK7 = new g70(function15, px4VarN, b3);
                        ux2Var.g0(objK7);
                    } else {
                        function15 = function14;
                        b3 = 6;
                        objK7 = new g70(function15, px4VarN, b3);
                        ux2Var.g0(objK7);
                    }
                    o77.c(zr7Var, (Function1) objK7, fs4VarA3, false, null, au8.O(-1974155590, new qa(str2, b3), ux2Var), au8.O(190877244, new wh3(str, function16, (byte) 3), ux2Var), null, yx3Var2, xx3Var3, true, 0, 0, null, cq7VarD2, ux2Var, 817889280);
                    ux2Var2 = ux2Var;
                    ux2Var2.p(true);
                    function8 = function15;
                    function9 = function17;
                    function11 = function13;
                    fs4Var2 = cs4Var;
                    function10 = function16;
                } else {
                    awVar4 = awVar3;
                }
                objK6 = new x9((byte) 4, (Object) function17, z);
                ux2Var.g0(objK6);
                xx3 xx3Var4 = new xx3((Function1) objK6, 62);
                boolean zF6 = ux2Var.f(px4VarN);
                if ((i11 & 57344) == 16384) {
                    z6 = true;
                }
                z10 = zF6 | z6;
                objK7 = ux2Var.K();
                if (z10) {
                    function15 = function14;
                    b3 = 6;
                    objK7 = new g70(function15, px4VarN, b3);
                    ux2Var.g0(objK7);
                } else {
                    function15 = function14;
                    b3 = 6;
                    objK7 = new g70(function15, px4VarN, b3);
                    ux2Var.g0(objK7);
                }
                o77.c(zr7Var, (Function1) objK7, fs4VarA3, false, null, au8.O(-1974155590, new qa(str2, b3), ux2Var), au8.O(190877244, new wh3(str, function16, (byte) 3), ux2Var), null, yx3Var2, xx3Var4, true, 0, 0, null, cq7VarD2, ux2Var, 817889280);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                function8 = function15;
                function9 = function17;
                function11 = function13;
                fs4Var2 = cs4Var;
                function10 = function16;
            } else {
                ux2Var2.Q();
                function8 = function4;
                function9 = function5;
                function10 = function6;
                function11 = function7;
                fs4Var2 = fs4Var;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new pm6(ql6Var, str, z, fs4Var2, function8, function9, function10, function11, i, i2);
            }
        }
        i12 = i3 | 27648;
        function4 = function1;
        i4 = i2 & 32;
        if (i4 != 0) {
            i12 |= 196608;
            function5 = function0;
        } else {
            function5 = function0;
            if ((i & 196608) == 0) {
                if (ux2Var2.h(function5)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i12 |= i5;
            }
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i12 |= 1572864;
            function6 = function2;
        } else {
            function6 = function2;
            if ((i & 1572864) == 0) {
                if (ux2Var2.h(function6)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i12 |= i7;
            }
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i12 |= 12582912;
            function7 = function3;
        } else {
            function7 = function3;
            if ((i & 12582912) == 0) {
                if (ux2Var2.h(function7)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i12 |= i9;
            }
        }
        if ((i12 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ux2Var2.N(i12 & 1, z2)) {
            awVar = e01.a;
            if (i13 != 0) {
                objK11 = ux2Var2.K();
                if (objK11 == awVar) {
                    objK11 = new fk6((byte) 2);
                    ux2Var2.g0(objK11);
                }
                function4 = (Function1) objK11;
            }
            if (i4 != 0) {
                objK10 = ux2Var2.K();
                if (objK10 == awVar) {
                    objK10 = new w26((byte) 17);
                    ux2Var2.g0(objK10);
                }
                function12 = (Function0) objK10;
            } else {
                function12 = function5;
            }
            if (i6 != 0) {
                objK9 = ux2Var2.K();
                if (objK9 == awVar) {
                    objK9 = new w26((byte) 18);
                    ux2Var2.g0(objK9);
                }
                function6 = (Function0) objK9;
            }
            if (i8 != 0) {
                objK8 = ux2Var2.K();
                if (objK8 == awVar) {
                    objK8 = new w26((byte) 19);
                    ux2Var2.g0(objK8);
                }
                function13 = (Function0) objK8;
            } else {
                function13 = function7;
            }
            objK = ux2Var2.K();
            if (objK == awVar) {
                objK = new sq2();
                ux2Var2.g0(objK);
            }
            sq2Var = (sq2) objK;
            Object[] objArr2 = new Object[0];
            i10 = i12 & 112;
            if (i10 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objK2 = ux2Var2.K();
            z4 = z3;
            b = 6;
            if (z4) {
                objK2 = new lz1(str, b);
                ux2Var2.g0(objK2);
            } else {
                objK2 = new lz1(str, b);
                ux2Var2.g0(objK2);
            }
            px4VarN = zu1.N(objArr2, zr7.d, (Function0) objK2, ux2Var2);
            if (i10 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            zF = z5 | ux2Var2.f(px4VarN);
            objK3 = ux2Var2.K();
            hc1Var = null;
            if (zF) {
                objK3 = new kq1(str, px4VarN, hc1Var, (byte) 2);
                ux2Var2.g0(objK3);
            } else {
                objK3 = new kq1(str, px4VarN, hc1Var, (byte) 2);
                ux2Var2.g0(objK3);
            }
            ck3.i(str, (hw2) objK3, ux2Var2);
            objK4 = ux2Var2.K();
            b2 = 3;
            if (objK4 == awVar) {
                objK4 = new z9(sq2Var, hc1Var, b2);
                ux2Var2.g0(objK4);
            }
            ck3.i(f88.a, (hw2) objK4, ux2Var2);
            if (ql6Var.equals(ol6.a)) {
                strM = to7.m(ux2Var2, -1983743805, R.string.connect_id_field_place_holder, ux2Var2, false);
            } else {
                strM = to7.m(ux2Var2, -1983668723, R.string.search_place_holder, ux2Var2, false);
            }
            cs4 cs4Var2 = cs4.b;
            fs4 fs4VarA4 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f), "TVTA-searchScreen-input");
            dg6 dg6VarA2 = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
            function14 = function4;
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA4);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA2, d82.v, ux2Var2);
            o67.n(yj5VarL2, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS2, d82.t, ux2Var2);
            i11 = i12;
            String str3 = strM;
            Function0 function18 = function6;
            Function0 function19 = function12;
            td3.b(lv1.T(R.drawable.navigation_back_icon, ux2Var2, 0), m77.z(R.string.navigation_back_content_description, ux2Var2), androidx.compose.foundation.layout.b.l(ka0.B(androidx.compose.foundation.b.b(iq8.j(androidx.compose.ui.platform.a.a(ka0.F(cs4Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14), "TVTA-searchScreen-input-back"), sf6.a), false, null, null, function13, 15), 8.0f), 24.0f), ((rn4) ux2Var2.j(un4.a)).a.s, ux2Var2, 8, 0);
            zr7 zr7Var2 = (zr7) px4VarN.getValue();
            fs4 fs4VarB2 = ka0.B(uf0.n(androidx.compose.ui.platform.a.a(cs4Var2, "TVTA-searchScreen-input-textField"), sq2Var).f(new s14(1.0f, true)), 0.0f);
            zF2 = ux2Var2.f(px4VarN);
            objK5 = ux2Var2.K();
            if (zF2) {
                if (objK5 == awVar2) {
                }
                awVar2 = awVar;
                fs4 fs4VarA5 = cp6.a(fs4VarB2, false, (Function1) objK5);
                awVar3 = awVar2;
                long j3 = rv0.g;
                z6 = false;
                cq7 cq7VarD3 = jk0.d(j3, j3, j3, j3, j3, ux2Var);
                yx3 yx3Var3 = new yx3(0, 7, 119);
                if ((i11 & 896) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((458752 & i11) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z7 | z8;
                objK6 = ux2Var.K();
                if (z9) {
                    awVar4 = awVar3;
                    if (objK6 == awVar4) {
                    }
                    xx3 xx3Var5 = new xx3((Function1) objK6, 62);
                    boolean zF7 = ux2Var.f(px4VarN);
                    if ((i11 & 57344) == 16384) {
                        z6 = true;
                    }
                    z10 = zF7 | z6;
                    objK7 = ux2Var.K();
                    if (z10) {
                        function15 = function14;
                        b3 = 6;
                        objK7 = new g70(function15, px4VarN, b3);
                        ux2Var.g0(objK7);
                    } else {
                        function15 = function14;
                        b3 = 6;
                        objK7 = new g70(function15, px4VarN, b3);
                        ux2Var.g0(objK7);
                    }
                    o77.c(zr7Var2, (Function1) objK7, fs4VarA5, false, null, au8.O(-1974155590, new qa(str3, b3), ux2Var), au8.O(190877244, new wh3(str, function18, (byte) 3), ux2Var), null, yx3Var3, xx3Var5, true, 0, 0, null, cq7VarD3, ux2Var, 817889280);
                    ux2Var2 = ux2Var;
                    ux2Var2.p(true);
                    function8 = function15;
                    function9 = function19;
                    function11 = function13;
                    fs4Var2 = cs4Var2;
                    function10 = function18;
                } else {
                    awVar4 = awVar3;
                }
                objK6 = new x9((byte) 4, (Object) function19, z);
                ux2Var.g0(objK6);
                xx3 xx3Var6 = new xx3((Function1) objK6, 62);
                boolean zF8 = ux2Var.f(px4VarN);
                if ((i11 & 57344) == 16384) {
                    z6 = true;
                }
                z10 = zF8 | z6;
                objK7 = ux2Var.K();
                if (z10) {
                    function15 = function14;
                    b3 = 6;
                    objK7 = new g70(function15, px4VarN, b3);
                    ux2Var.g0(objK7);
                } else {
                    function15 = function14;
                    b3 = 6;
                    objK7 = new g70(function15, px4VarN, b3);
                    ux2Var.g0(objK7);
                }
                o77.c(zr7Var2, (Function1) objK7, fs4VarA5, false, null, au8.O(-1974155590, new qa(str3, b3), ux2Var), au8.O(190877244, new wh3(str, function18, (byte) 3), ux2Var), null, yx3Var3, xx3Var6, true, 0, 0, null, cq7VarD3, ux2Var, 817889280);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                function8 = function15;
                function9 = function19;
                function11 = function13;
                fs4Var2 = cs4Var2;
                function10 = function18;
            } else {
                awVar2 = awVar;
            }
            awVar2 = awVar;
            objK5 = new va(px4VarN, (byte) 24);
            ux2Var2.g0(objK5);
            awVar2 = awVar;
            fs4 fs4VarA6 = cp6.a(fs4VarB2, false, (Function1) objK5);
            awVar3 = awVar2;
            long j4 = rv0.g;
            z6 = false;
            cq7 cq7VarD4 = jk0.d(j4, j4, j4, j4, j4, ux2Var);
            yx3 yx3Var4 = new yx3(0, 7, 119);
            if ((i11 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((458752 & i11) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z7 | z8;
            objK6 = ux2Var.K();
            if (z9) {
                awVar4 = awVar3;
                if (objK6 == awVar4) {
                }
                xx3 xx3Var7 = new xx3((Function1) objK6, 62);
                boolean zF9 = ux2Var.f(px4VarN);
                if ((i11 & 57344) == 16384) {
                    z6 = true;
                }
                z10 = zF9 | z6;
                objK7 = ux2Var.K();
                if (z10) {
                    function15 = function14;
                    b3 = 6;
                    objK7 = new g70(function15, px4VarN, b3);
                    ux2Var.g0(objK7);
                } else {
                    function15 = function14;
                    b3 = 6;
                    objK7 = new g70(function15, px4VarN, b3);
                    ux2Var.g0(objK7);
                }
                o77.c(zr7Var2, (Function1) objK7, fs4VarA6, false, null, au8.O(-1974155590, new qa(str3, b3), ux2Var), au8.O(190877244, new wh3(str, function18, (byte) 3), ux2Var), null, yx3Var4, xx3Var7, true, 0, 0, null, cq7VarD4, ux2Var, 817889280);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                function8 = function15;
                function9 = function19;
                function11 = function13;
                fs4Var2 = cs4Var2;
                function10 = function18;
            } else {
                awVar4 = awVar3;
            }
            objK6 = new x9((byte) 4, (Object) function19, z);
            ux2Var.g0(objK6);
            xx3 xx3Var8 = new xx3((Function1) objK6, 62);
            boolean zF10 = ux2Var.f(px4VarN);
            if ((i11 & 57344) == 16384) {
                z6 = true;
            }
            z10 = zF10 | z6;
            objK7 = ux2Var.K();
            if (z10) {
                function15 = function14;
                b3 = 6;
                objK7 = new g70(function15, px4VarN, b3);
                ux2Var.g0(objK7);
            } else {
                function15 = function14;
                b3 = 6;
                objK7 = new g70(function15, px4VarN, b3);
                ux2Var.g0(objK7);
            }
            o77.c(zr7Var2, (Function1) objK7, fs4VarA6, false, null, au8.O(-1974155590, new qa(str3, b3), ux2Var), au8.O(190877244, new wh3(str, function18, (byte) 3), ux2Var), null, yx3Var4, xx3Var8, true, 0, 0, null, cq7VarD4, ux2Var, 817889280);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            function8 = function15;
            function9 = function19;
            function11 = function13;
            fs4Var2 = cs4Var2;
            function10 = function18;
        } else {
            ux2Var2.Q();
            function8 = function4;
            function9 = function5;
            function10 = function6;
            function11 = function7;
            fs4Var2 = fs4Var;
        }
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new pm6(ql6Var, str, z, fs4Var2, function8, function9, function10, function11, i, i2);
        }
    }

    public static final void l(zl6 zl6Var, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        ux2 ux2Var2;
        zl6Var.getClass();
        function1.getClass();
        ux2Var.Y(44969535);
        if ((i & 6) == 0) {
            i2 = (ux2Var.d(zl6Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ux2Var2 = ux2Var;
            j51.g(androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), "TVTA-searchView-tabs"), null, false, au8.O(-1301163351, new sd(zl6Var, function1, (byte) 10), ux2Var), ux2Var2, 3072, 6);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) zl6Var, (Object) function1, (Object) fs4Var, i, (byte) 19);
        }
    }

    public static final void m(int i, String str, ux2 ux2Var, fs4 fs4Var) {
        str.getClass();
        ux2Var.Y(1267842670);
        int i2 = (ux2Var.f(str) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 32 : 16);
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            fs4 fs4VarB = ka0.B(fs4Var, 16.0f);
            h72 h72Var = un4.a;
            qs7.b(str, fs4VarB, ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.i, ux2Var, i2 & 14, 0, 131064);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gx0(str, fs4Var, i, (byte) 5);
        }
    }

    public static final void n(fs4 fs4Var, yy0 yy0Var, ux2 ux2Var, int i) {
        ux2Var.Y(-1854833411);
        int i2 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ei.i;
                ux2Var.g0(objK);
            }
            do4 do4Var = (do4) objK;
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4Var, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            yy0Var.invoke(ux2Var, 6);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new l64((byte) 19, i, fs4Var, yy0Var);
        }
    }

    public static final void o(int i, String str, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        function0.getClass();
        ux2Var.Y(889370153);
        int i2 = i | (ux2Var.f(str) ? 4 : 2) | (ux2Var.h(function0) ? 32 : 16) | (ux2Var.f(fs4Var) ? 256 : 128);
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            fs4 fs4VarC = ka0.C(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), false, null, null, function0, 15), 16.0f, 8.0f);
            String strA = m77.A(R.string.search_view_all_results, new Object[]{str}, ux2Var);
            h72 h72Var = un4.a;
            qs7.b(strA, fs4VarC, ((rn4) ux2Var.j(h72Var)).a.a, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.k, ux2Var, 0, 0, 131064);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gd1(str, function0, fs4Var, i, (byte) 7);
        }
    }

    public static final ns1 p(DeviceListEntry deviceListEntry, ns1 ns1Var) {
        ms1 ms1VarU;
        deviceListEntry.getClass();
        ns1Var.getClass();
        String displayName = deviceListEntry.getDisplayName();
        com.teamviewer.apidefinitions.manageddevices.models.DeviceOnlineStatus onlineStatus = deviceListEntry.getOnlineStatus();
        ls1 ls1VarS = onlineStatus != null ? S(onlineStatus) : null;
        UUID managementId = deviceListEntry.getManagementId();
        List<DeviceFlags> flags = deviceListEntry.getFlags();
        if (flags == null || (ms1VarU = U(flags)) == null) {
            ms1VarU = ns1Var.f;
        }
        ms1 ms1Var = ms1VarU;
        String description = deviceListEntry.getDescription();
        Boolean hasPassword = deviceListEntry.getHasPassword();
        if (hasPassword == null) {
            hasPassword = ns1Var.i;
        }
        Boolean bool = hasPassword;
        DeviceModuleType moduleType = deviceListEntry.getModuleType();
        String tvVersion = deviceListEntry.getTvVersion();
        List<UUID> groupIds = deviceListEntry.getGroupIds();
        ks1 ks1Var = deviceListEntry.getDeviceListEntryType() == DeviceListEntryType.Bookmarked ? ks1.m : ks1.n;
        com.teamviewer.apidefinitions.manageddevices.models.DeviceType deviceType = deviceListEntry.getDeviceType();
        return ns1.a(ns1Var, 0L, displayName, ls1VarS, null, ms1Var, false, description, bool, moduleType, tvVersion, null, groupIds, null, null, null, null, null, ks1Var, deviceType != null ? Q(deviceType) : null, managementId, 512089);
    }

    public static float q(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static final hq6 r(String str, it1 it1Var, fq6[] fq6VarArr, Function1 function1) {
        if (ub7.b0(str)) {
            hk0.g("Blank serial names are prohibited");
            return null;
        }
        if (it1Var.equals(lc7.d)) {
            hk0.g("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        rs0 rs0Var = new rs0(str);
        function1.invoke(rs0Var);
        return new hq6(str, it1Var, rs0Var.b.size(), cx.g1(fq6VarArr), rs0Var);
    }

    public static hq6 s(String str, it1 it1Var, fq6[] fq6VarArr) {
        if (ub7.b0(str)) {
            hk0.g("Blank serial names are prohibited");
            return null;
        }
        if (it1Var.equals(lc7.d)) {
            hk0.g("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        rs0 rs0Var = new rs0(str);
        return new hq6(str, it1Var, rs0Var.b.size(), cx.g1(fq6VarArr), rs0Var);
    }

    public static final String t(rp3 rp3Var, fq6 fq6Var) {
        fq6Var.getClass();
        rp3Var.getClass();
        for (Annotation annotation : fq6Var.getAnnotations()) {
            if (annotation instanceof cq3) {
                return ((cq3) annotation).discriminator();
            }
        }
        return rp3Var.a.d;
    }

    public static final px4 u(go2 go2Var, Object obj, x84 x84Var, m84 m84Var, de1 de1Var, ux2 ux2Var, int i) {
        Object[] objArr = {go2Var, x84Var, m84Var, de1Var};
        boolean zH = ((((i & 7168) ^ 3072) > 2048 && ux2Var.d(m84Var.ordinal())) || (i & 3072) == 2048) | ux2Var.h(x84Var) | ux2Var.h(de1Var) | ux2Var.h(go2Var);
        Object objK = ux2Var.K();
        Object obj2 = e01.a;
        if (zH || objK == obj2) {
            Object ajVar = new aj(x84Var, m84Var, de1Var, go2Var, null, (byte) 5);
            ux2Var.g0(ajVar);
            objK = ajVar;
        }
        hw2 hw2Var = (hw2) objK;
        Object objK2 = ux2Var.K();
        if (objK2 == obj2) {
            objK2 = h57.p(obj);
            ux2Var.g0(objK2);
        }
        px4 px4Var = (px4) objK2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zH2 = ux2Var.h(hw2Var);
        Object objK3 = ux2Var.K();
        if (zH2 || objK3 == obj2) {
            objK3 = new e57(hw2Var, px4Var, null, (byte) 3);
            ux2Var.g0(objK3);
        }
        ck3.j(objArrCopyOf, (hw2) objK3, ux2Var);
        return px4Var;
    }

    public static final px4 v(j97 j97Var, ux2 ux2Var) {
        return u(j97Var, j97Var.getValue(), ((LifecycleOwner) ux2Var.j(dd4.a)).getR(), m84.p, ba2.m, ux2Var, 0);
    }

    public static final fe1 w(Executor executor) {
        fe1 fe1Var;
        e22 e22Var = executor instanceof e22 ? (e22) executor : null;
        return (e22Var == null || (fe1Var = e22Var.m) == null) ? new ue2(executor) : fe1Var;
    }

    public static final wt3 x(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return w86.a.b(clsAnnotationType);
    }

    public static final js0 y(ty4 ty4Var, int i) {
        ty4Var.getClass();
        return im3.D(ty4Var.a(i), ty4Var.b(i));
    }

    public static final Class z(wt3 wt3Var) {
        wt3Var.getClass();
        Class clsA = ((vr0) wt3Var).a();
        clsA.getClass();
        return clsA;
    }
}
