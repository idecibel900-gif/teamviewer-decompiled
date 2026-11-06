package com.teamviewer.teamviewer.market.mobile.application;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthConnectionViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationConnectionViewModel;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.util.LinkedList;
import o.c36;
import o.it1;
import o.l25;
import o.r55;
import o.ub7;
import o.ur1;
import o.ye4;
import o.z11;
import o.zr1;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceAuthenticationService extends Service {
    public static final /* synthetic */ int q = 0;
    public final ur1 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedList f79o;
    public final z11 p;

    public DeviceAuthenticationService() {
        c36 c36Var = zu1.c;
        this.m = c36Var != null ? c36Var.f() : null;
        this.f79o = new LinkedList();
        this.p = new z11(this, (byte) 1);
    }

    public final void a(zr1 zr1Var) {
        String str = zr1Var.c;
        int i = zr1Var.e;
        String str2 = zr1Var.d;
        if (str == null || ub7.b0(str)) {
            ye4.c("DeviceAuthenticationService", "Invalid registration keyId");
            return;
        }
        if (str2 == null || ub7.b0(str2)) {
            ye4.c("DeviceAuthenticationService", "Invalid nonce");
            return;
        }
        ur1 ur1Var = this.m;
        if (ur1Var != null) {
            DyngateID dyngateID = zr1Var.a;
            int i2 = zr1Var.b;
            str.getClass();
            String strF = it1.F(ur1Var.n, str);
            if (strF != null) {
                IDeviceAuthenticationConnectionViewModel iDeviceAuthenticationConnectionViewModel = ur1Var.f2241o;
                IDeviceAuthConnectionViewModelSWIGJNI.IDeviceAuthenticationConnectionViewModel_SendConnectionResponse(iDeviceAuthenticationConnectionViewModel.a, iDeviceAuthenticationConnectionViewModel, DyngateID.getCPtr(dyngateID), dyngateID, i2, str2, strF, i);
            }
        }
        if (i == 0) {
            if (ur1Var != null) {
                IDeviceAuthenticationConnectionViewModel iDeviceAuthenticationConnectionViewModel2 = ur1Var.f2241o;
                IDeviceAuthConnectionViewModelSWIGJNI.IDeviceAuthenticationConnectionViewModel_OnNotificationRequestAllowed(iDeviceAuthenticationConnectionViewModel2.a, iDeviceAuthenticationConnectionViewModel2);
                return;
            }
            return;
        }
        if (i == 1 && ur1Var != null) {
            IDeviceAuthenticationConnectionViewModel iDeviceAuthenticationConnectionViewModel3 = ur1Var.f2241o;
            IDeviceAuthConnectionViewModelSWIGJNI.IDeviceAuthenticationConnectionViewModel_OnNotificationRequestDenied(iDeviceAuthenticationConnectionViewModel3.a, iDeviceAuthenticationConnectionViewModel3);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("KEY_ACTION");
            if (stringExtra == null) {
                i3 = 2;
            } else {
                int iHashCode = stringExtra.hashCode();
                if (iHashCode != -2069649952) {
                    if (iHashCode == -620869515 && stringExtra.equals("KEY_ACTION_DENY")) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                } else if (stringExtra.equals("KEY_ACTION_ALLOW")) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
            }
            DyngateID dyngateIDFromLong = DyngateID.FromLong(intent.getLongExtra("KEY_DESTINATION_DYNGATE_ID", 0L));
            dyngateIDFromLong.getClass();
            int intExtra = intent.getIntExtra("KEY_SESSION_IDENTIFIER", 0);
            zr1 zr1Var = new zr1(dyngateIDFromLong, intExtra, intent.getStringExtra("KEY_REGISTRATION_ID"), intent.getStringExtra("KEY_NONCE"), i3);
            if (l25.b()) {
                a(zr1Var);
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                new r55(applicationContext).a(intExtra, "TvDeviceConnectionAuthenticationNotification");
                return 2;
            }
            if (!this.n) {
                Settings.i.n().f(this.p);
                this.n = true;
            }
            this.f79o.add(zr1Var);
            ye4.a("DeviceAuthenticationService", "Device authentication response queued");
        }
        return 2;
    }
}
