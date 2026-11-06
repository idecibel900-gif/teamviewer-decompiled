package com.teamviewer.teamviewerlib.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.SparseArray;
import com.teamviewer.remotecontrolviewlib.service.ConditionalAccessAuthenticationService;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceResponseSignalCallback;
import com.teamviewer.teamviewer.market.mobile.application.DeviceAuthenticationService;
import com.teamviewer.teamviewer.market.mobile.application.TrustedDeviceService;
import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import io.sentry.h2;
import java.util.Date;
import java.util.LinkedList;
import kotlin.Metadata;
import o.b21;
import o.gc3;
import o.gv6;
import o.h57;
import o.im3;
import o.j38;
import o.k25;
import o.n37;
import o.n38;
import o.nx3;
import o.ov6;
import o.q38;
import o.r55;
import o.rt0;
import o.t38;
import o.u38;
import o.ww3;
import o.ye4;
import o.z11;
import o.zc3;
import o.zr1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/teamviewer/teamviewerlib/settings/Settings;", "", "o/gv6", "Companion", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class Settings {
    public static final Companion i;
    public static volatile Settings j;
    public final String a;
    public final int b;
    public final nx3 c;
    public final nx3 d;
    public final nx3 e;
    public final nx3 f;
    public final nx3 g;
    public final Date h;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0018\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0086 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u001f\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b \u0010!J \u0010\"\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\"\u0010#J(\u0010%\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b'\u0010#J(\u0010(\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b(\u0010\u001eJ \u0010)\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b+\u0010,J(\u0010-\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b-\u0010\u0011J \u0010.\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b.\u0010/J(\u00101\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u000200H\u0082 ¢\u0006\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/teamviewer/teamviewerlib/settings/Settings$Companion;", "", "", "handle", "", "oldValue", "newValue", "Lo/f88;", "handleBoolPropertyChangedCallback", "(IZZ)V", "handleIntPropertyChangedCallback", "(III)V", "", "handleInt64PropertyChangedCallback", "(IJJ)V", "", "handleStringPropertyChangedCallback", "(ILjava/lang/String;Ljava/lang/String;)V", "", "handleByteArrayPropertyChangedCallback", "(I[B[B)V", "domain", "key", "", "data", "jniSetStringArray", "(ILjava/lang/String;[Ljava/lang/String;)V", "jniInit", "()Z", "jniRegisterBoolListener", "(ILjava/lang/String;I)V", "jniRegisterInt64Listener", "jniUnregisterListener", "(I)V", "jniIsProp", "(ILjava/lang/String;)Z", "value", "jniSetBool", "(ILjava/lang/String;Z)V", "jniGetBool", "jniSetInt", "jniGetInt", "(ILjava/lang/String;)I", "jniGetInt64", "(ILjava/lang/String;)J", "jniSetString", "jniGetString", "(ILjava/lang/String;)Ljava/lang/String;", "", "jniSetIntArray", "(ILjava/lang/String;[I)V", "TAG", "Ljava/lang/String;", "Lcom/teamviewer/teamviewerlib/settings/Settings;", "_instance", "Lcom/teamviewer/teamviewerlib/settings/Settings;", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ boolean a(int i, String str) {
            return Settings.i.jniGetBool(i, str);
        }

        public static final /* synthetic */ int b(int i, String str) {
            return Settings.i.jniGetInt(i, str);
        }

        public static final /* synthetic */ long c(int i, String str) {
            return Settings.i.jniGetInt64(i, str);
        }

        public static final /* synthetic */ String d(String str) {
            return Settings.i.jniGetString(1, str);
        }

        public static final /* synthetic */ boolean f(String str) {
            return Settings.i.jniIsProp(1, str);
        }

        public static final /* synthetic */ void g(int i, String str) {
            Settings.i.jniRegisterBoolListener(1, str, i);
        }

        public static final /* synthetic */ void h(int i, String str) {
            Settings.i.jniRegisterInt64Listener(1, str, i);
        }

        public static final /* synthetic */ void i(int i, String str, boolean z) {
            Settings.i.jniSetBool(i, str, z);
        }

        public static final /* synthetic */ void j(int i, int i2, String str) {
            Settings.i.jniSetInt(i, str, i2);
        }

        private final native boolean jniGetBool(int domain, String key);

        private final native int jniGetInt(int domain, String key);

        private final native long jniGetInt64(int domain, String key);

        private final native String jniGetString(int domain, String key);

        /* JADX INFO: Access modifiers changed from: private */
        public final native boolean jniInit();

        private final native boolean jniIsProp(int domain, String key);

        private final native void jniRegisterBoolListener(int domain, String key, int handle);

        private final native void jniRegisterInt64Listener(int domain, String key, int handle);

        private final native void jniSetBool(int domain, String key, boolean value);

        private final native void jniSetInt(int domain, String key, int value);

        private final native void jniSetIntArray(int domain, String key, int[] data);

        private final native void jniSetString(int domain, String key, String value);

        private final native void jniUnregisterListener(int handle);

        public static final /* synthetic */ void k(String str, int[] iArr) {
            Settings.i.jniSetIntArray(1, str, iArr);
        }

        public static final /* synthetic */ void l(String str, String str2) {
            Settings.i.jniSetString(1, str, str2);
        }

        public static final /* synthetic */ void m(int i) {
            Settings.i.jniUnregisterListener(i);
        }

        public final void handleBoolPropertyChangedCallback(int handle, boolean oldValue, boolean newValue) {
            z11 z11Var = (z11) n().c.A(handle);
            if (z11Var != null) {
                byte b = z11Var.a;
                Object obj = z11Var.b;
                switch (b) {
                    case 0:
                        ConditionalAccessAuthenticationService conditionalAccessAuthenticationService = (ConditionalAccessAuthenticationService) obj;
                        LinkedList linkedList = conditionalAccessAuthenticationService.n;
                        if (!newValue) {
                            int i = ConditionalAccessAuthenticationService.q;
                        } else {
                            while (!linkedList.isEmpty()) {
                                Object objRemove = linkedList.remove();
                                objRemove.getClass();
                                conditionalAccessAuthenticationService.a((b21) objRemove);
                                ye4.a("ConditionalAccessAuthenticationService", "Queued response sent");
                            }
                            Settings.i.n().m(conditionalAccessAuthenticationService.p);
                            conditionalAccessAuthenticationService.f69o = false;
                        }
                        break;
                    case 1:
                        DeviceAuthenticationService deviceAuthenticationService = (DeviceAuthenticationService) obj;
                        LinkedList linkedList2 = deviceAuthenticationService.f79o;
                        if (!newValue) {
                            int i2 = DeviceAuthenticationService.q;
                        } else {
                            while (!linkedList2.isEmpty()) {
                                zr1 zr1Var = (zr1) linkedList2.remove();
                                zr1Var.getClass();
                                deviceAuthenticationService.a(zr1Var);
                                int i3 = zr1Var.b;
                                Context applicationContext = deviceAuthenticationService.getApplicationContext();
                                applicationContext.getClass();
                                new r55(applicationContext).a(i3, "TvDeviceConnectionAuthenticationNotification");
                                ye4.a("DeviceAuthenticationService", "Device authentication queued response sent");
                            }
                            Settings.i.n().m(deviceAuthenticationService.p);
                            deviceAuthenticationService.n = false;
                        }
                        break;
                    case 2:
                        ((ww3) obj).a(newValue ? k25.f1224o : k25.m);
                        break;
                    case 3:
                        n38 n38Var = (n38) obj;
                        if (newValue) {
                            Settings.i.n().m(n38Var.g);
                            n38Var.c = false;
                        }
                        break;
                    default:
                        TrustedDeviceService trustedDeviceService = (TrustedDeviceService) obj;
                        LinkedList linkedList3 = trustedDeviceService.n;
                        if (!newValue) {
                            int i4 = TrustedDeviceService.r;
                        } else {
                            while (!linkedList3.isEmpty()) {
                                u38 u38Var = (u38) linkedList3.remove();
                                int i5 = u38Var.a;
                                String str = u38Var.b;
                                t38 t38Var = trustedDeviceService.m;
                                if (t38Var != null) {
                                    j38 j38Var = j38.Device;
                                    q38 q38Var = trustedDeviceService.q;
                                    q38Var.getClass();
                                    ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative = t38Var.n;
                                    ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_SendResponse(iTrustedDeviceRequestViewModelNative.a, iTrustedDeviceRequestViewModelNative, 0, false, str, TrustedDeviceResponseSignalCallback.getCPtr((TrustedDeviceResponseSignalCallback) q38Var), q38Var);
                                }
                                Context applicationContext2 = trustedDeviceService.getApplicationContext();
                                applicationContext2.getClass();
                                new r55(applicationContext2).a(i5, "TeamViewerRcTrustedDeviceNotification");
                                ye4.a("TrustedDeviceService", "Queued response sent");
                            }
                            Settings.i.n().m(trustedDeviceService.p);
                            trustedDeviceService.f82o.set(false);
                        }
                        break;
                }
            }
        }

        public final void handleByteArrayPropertyChangedCallback(int handle, byte[] oldValue, byte[] newValue) {
            if (n().g.A(handle) == null) {
                return;
            }
            h2.f();
        }

        public final void handleInt64PropertyChangedCallback(int handle, long oldValue, long newValue) {
            gc3 gc3Var = (gc3) n().e.A(handle);
            if (gc3Var != null) {
                gc3Var.a(oldValue, newValue);
            }
        }

        public final void handleIntPropertyChangedCallback(int handle, int oldValue, int newValue) {
            if (n().d.A(handle) == null) {
                return;
            }
            h2.f();
        }

        public final void handleStringPropertyChangedCallback(int handle, String oldValue, String newValue) {
            oldValue.getClass();
            newValue.getClass();
            if (n().f.A(handle) == null) {
                return;
            }
            h2.f();
        }

        public final native void jniSetStringArray(int domain, String key, String[] data);

        public final Settings n() {
            Settings settings;
            Settings settings2 = Settings.j;
            if (settings2 != null) {
                return settings2;
            }
            synchronized (this) {
                settings = Settings.j;
                if (settings == null) {
                    settings = new Settings();
                    Settings.j = settings;
                }
            }
            return settings;
        }
    }

    static {
        Companion companion = new Companion();
        i = companion;
        if (NativeLibTvExt.c() && companion.jniInit()) {
            return;
        }
        ye4.c("Settings", "initializing Settings failed!");
    }

    public Settings() {
        String str = n37.f;
        if (str == null) {
            im3.e0("versionString");
            throw null;
        }
        this.a = str;
        this.b = Build.VERSION.SDK_INT + 8192;
        this.c = new nx3((byte) 12);
        this.d = new nx3((byte) 12);
        this.e = new nx3((byte) 12);
        this.f = new nx3((byte) 12);
        this.g = new nx3((byte) 12);
        ye4.a("Settings", "version: ".concat(str));
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("VERSION_STRING", str);
        editorEdit.apply();
        this.h = new Date();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(gv6 gv6Var, Enum r2) {
        if (NativeLibTvExt.c()) {
            return Companion.a(gv6Var.m, ((zc3) r2).a());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(gv6 gv6Var, Enum r2) {
        if (NativeLibTvExt.c()) {
            return Companion.b(gv6Var.m, ((zc3) r2).a());
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long c(gv6 gv6Var, Enum r2) {
        if (NativeLibTvExt.c()) {
            return Companion.c(gv6Var.m, ((zc3) r2).a());
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String d(Enum r1) {
        return !NativeLibTvExt.c() ? "" : Companion.d(((zc3) r1).a());
    }

    public static DyngateID e() {
        if (!NativeLibTvExt.c() ? false : Companion.f("ClientID_64")) {
            DyngateID dyngateIDFromLong = DyngateID.FromLong(c(gv6.MACHINE, ov6.P_REGISTERED_CLIENT_ID_64));
            dyngateIDFromLong.getClass();
            return dyngateIDFromLong;
        }
        DyngateID dyngateIDInvalidDyngateID = DyngateID.InvalidDyngateID();
        dyngateIDInvalidDyngateID.getClass();
        return dyngateIDInvalidDyngateID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Enum r1, String str) {
        r1.getClass();
        str.getClass();
        if (NativeLibTvExt.c()) {
            Companion.l(((zc3) r1).a(), str);
        }
    }

    public static final void handleBoolPropertyChangedCallback(int i2, boolean z, boolean z2) {
        i.handleBoolPropertyChangedCallback(i2, z, z2);
    }

    public static final void handleByteArrayPropertyChangedCallback(int i2, byte[] bArr, byte[] bArr2) {
        i.handleByteArrayPropertyChangedCallback(i2, bArr, bArr2);
    }

    public static final void handleInt64PropertyChangedCallback(int i2, long j2, long j3) {
        i.handleInt64PropertyChangedCallback(i2, j2, j3);
    }

    public static final void handleIntPropertyChangedCallback(int i2, int i3, int i4) {
        i.handleIntPropertyChangedCallback(i2, i3, i4);
    }

    public static final void handleStringPropertyChangedCallback(int i2, String str, String str2) {
        i.handleStringPropertyChangedCallback(i2, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(Enum r1, int[] iArr) {
        iArr.getClass();
        if (NativeLibTvExt.c()) {
            Companion.k(((zc3) r1).a(), iArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(gv6 gv6Var, Enum r2, int i2) {
        if (NativeLibTvExt.c()) {
            Companion.j(gv6Var.m, i2, ((zc3) r2).a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void k(gv6 gv6Var, Enum r2, boolean z) {
        r2.getClass();
        if (NativeLibTvExt.c()) {
            Companion.i(gv6Var.m, ((zc3) r2).a(), z);
        }
    }

    public static void l(String[] strArr) {
        strArr.getClass();
        if (NativeLibTvExt.c()) {
            i.jniSetStringArray(1, rt0.P_CONDITIONALACCESS_SERVERS.a(), strArr);
        }
    }

    public final void f(z11 z11Var) {
        z11Var.getClass();
        if (NativeLibTvExt.c()) {
            Companion.g(this.c.m(z11Var), "Is_Logged_In");
        }
    }

    public final void g(gc3 gc3Var) {
        gc3Var.getClass();
        if (NativeLibTvExt.c()) {
            Companion.h(this.e.m(gc3Var), "ClientID_64");
        }
    }

    public final void m(z11 z11Var) {
        nx3 nx3Var = this.c;
        z11Var.getClass();
        if (NativeLibTvExt.c()) {
            int iY = nx3Var.y(z11Var);
            synchronized (nx3Var) {
                ((SparseArray) nx3Var.n).remove(iY);
            }
            Companion.m(iY);
        }
    }
}
