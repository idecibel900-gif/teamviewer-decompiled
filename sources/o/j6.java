package o;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.teamviewer.remotecontrollib.swig.DeleteAccountViewModel;
import com.teamviewer.remotecontrollib.swig.DeleteAccountViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDevicePreferenceViewModelNative;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j6 extends oe8 {
    public final l97 A;
    public final t36 B;
    public final VoidSignalCallback C;
    public final k6 D;
    public final k6 E;
    public final LicenseViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ITrustedDevicePreferenceViewModelNative f1133o;
    public final LogoutViewModel p;
    public final DeleteAccountViewModel q;
    public final PLManagerDevicesV2ViewModel r;
    public final PLManagerGroupsListV2ViewModel s;
    public final d82 t;
    public final yx6 u;
    public final r36 v;
    public final yx6 w;
    public final r36 x;
    public final yx6 y;
    public final r36 z;

    public j6(LicenseViewModel licenseViewModel, ITrustedDevicePreferenceViewModelNative iTrustedDevicePreferenceViewModelNative, LogoutViewModel logoutViewModel, DeleteAccountViewModel deleteAccountViewModel, PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel, PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel) {
        d82 d82Var = new d82((byte) 27);
        this.n = licenseViewModel;
        this.f1133o = iTrustedDevicePreferenceViewModelNative;
        this.p = logoutViewModel;
        this.q = deleteAccountViewModel;
        this.r = pLManagerDevicesV2ViewModel;
        this.s = pLManagerGroupsListV2ViewModel;
        this.t = d82Var;
        byte b = 0;
        hc1 hc1Var = null;
        yx6 yx6VarL = au8.l(0, 6, null);
        this.u = yx6VarL;
        this.v = new r36(yx6VarL);
        yx6 yx6VarL2 = au8.l(0, 7, null);
        this.w = yx6VarL2;
        this.x = new r36(yx6VarL2);
        yx6 yx6VarL3 = au8.l(0, 7, null);
        this.y = yx6VarL3;
        this.z = new r36(yx6VarL3);
        l97 l97VarK = im3.k(new a6(null, null, null, null, false, false, false, false, false, b12.m));
        this.A = l97VarK;
        this.B = yo1.u(l97VarK);
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new o5(this, (byte) 7));
        this.C = voidSignalCallback;
        byte b2 = 1;
        k6 k6Var = new k6(new f6(this, b2), b);
        this.D = k6Var;
        k6 k6Var2 = new k6(new f6(this, (byte) 2), b);
        this.E = k6Var2;
        LicenseViewModelSWIGJNI.LicenseViewModel_RegisterForChanges(licenseViewModel.a, licenseViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        logoutViewModel.b(k6Var);
        deleteAccountViewModel.b(k6Var2);
        Y0(new f6(this, (byte) 4));
        im3.R(e8.n(this), null, null, new i6(this, hc1Var, b), 3);
        im3.R(e8.n(this), null, null, new i6(this, hc1Var, b2), 3);
        a6 a6Var = (a6) l97VarK.getValue();
        a6Var.getClass();
        l97VarK.k(a6.a(a6Var, null, null, null, null, false, false, false, LogoutViewModelSWIGJNI.LogoutViewModel_IsEnabled(logoutViewModel.c, logoutViewModel), false, null, 895));
        a6 a6Var2 = (a6) l97VarK.getValue();
        a6Var2.getClass();
        l97VarK.k(a6.a(a6Var2, null, null, null, null, false, false, LogoutViewModelSWIGJNI.LogoutViewModel_IsEnabled(logoutViewModel.c, logoutViewModel) || DeleteAccountViewModelSWIGJNI.DeleteAccountViewModel_IsAccountLoggedIn(deleteAccountViewModel.c, deleteAccountViewModel), false, false, null, 959));
        a6 a6Var3 = (a6) l97VarK.getValue();
        a6Var3.getClass();
        l97VarK.k(a6.a(a6Var3, null, null, null, null, false, false, false, false, DeleteAccountViewModelSWIGJNI.DeleteAccountViewModel_IsAccountLoggedIn(deleteAccountViewModel.c, deleteAccountViewModel), null, 767));
        a6 a6Var4 = (a6) l97VarK.getValue();
        a6Var4.getClass();
        l97VarK.k(a6.a(a6Var4, null, null, null, null, false, false, LogoutViewModelSWIGJNI.LogoutViewModel_IsEnabled(logoutViewModel.c, logoutViewModel) || DeleteAccountViewModelSWIGJNI.DeleteAccountViewModel_IsAccountLoggedIn(deleteAccountViewModel.c, deleteAccountViewModel), false, false, null, 959));
    }

    public static boolean W0(Context context) {
        b03 b03Var;
        context.getClass();
        NotificationManager notificationManager = new r55(context).a;
        if (!notificationManager.areNotificationsEnabled()) {
            return false;
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL");
        if (notificationChannel != null) {
            String id = notificationChannel.getId();
            int importance = notificationChannel.getImportance();
            b03Var = new b03();
            Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
            id.getClass();
            b03Var.m = importance;
            AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
            notificationChannel.getName();
            notificationChannel.getDescription();
            notificationChannel.getGroup();
            notificationChannel.canShowBadge();
            notificationChannel.getSound();
            notificationChannel.getAudioAttributes();
            notificationChannel.shouldShowLights();
            notificationChannel.getLightColor();
            notificationChannel.shouldVibrate();
            notificationChannel.getVibrationPattern();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                b4.e(notificationChannel);
                b4.c(notificationChannel);
            }
            notificationChannel.canBypassDnd();
            notificationChannel.getLockscreenVisibility();
            if (i >= 29) {
                eq.b(notificationChannel);
            }
            if (i >= 30) {
                b4.h(notificationChannel);
            }
        } else {
            b03Var = null;
        }
        return b03Var == null || b03Var.m != 0;
    }

    @Override // o.oe8
    public final void U0() {
        this.C.Disconnect();
        this.D.Disconnect();
        this.E.Disconnect();
        this.n.a();
        this.f1133o.a();
        this.p.c();
        this.q.c();
        PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = this.r;
        if (pLManagerDevicesV2ViewModel != null) {
            pLManagerDevicesV2ViewModel.a();
        }
        PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = this.s;
        if (pLManagerGroupsListV2ViewModel != null) {
            pLManagerGroupsListV2ViewModel.a();
        }
    }

    public final void V0(boolean z) {
        l97 l97Var = this.A;
        a6 a6Var = (a6) l97Var.getValue();
        a6Var.getClass();
        a6 a6VarA = a6.a(a6Var, null, null, null, null, false, z, false, false, false, null, 991);
        l97Var.getClass();
        l97Var.l(null, a6VarA);
    }

    public final void X0(b12 b12Var) {
        l97 l97Var = this.A;
        a6 a6Var = (a6) l97Var.getValue();
        a6Var.getClass();
        a6 a6VarA = a6.a(a6Var, null, null, null, null, false, false, false, false, false, b12Var, 511);
        l97Var.getClass();
        l97Var.l(null, a6VarA);
    }

    public final void Y0(Function1 function1) {
        l97 l97Var = this.A;
        l97Var.k((a6) function1.invoke((a6) l97Var.getValue()));
    }
}
