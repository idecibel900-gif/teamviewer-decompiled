package com.teamviewer.teamviewer.market.mobile.application;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceResponseSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import o.bu7;
import o.c36;
import o.fx3;
import o.j38;
import o.l25;
import o.q38;
import o.r55;
import o.t38;
import o.u38;
import o.ub7;
import o.ye4;
import o.z11;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final class TrustedDeviceService extends Service {
    public static final /* synthetic */ int r = 0;
    public final t38 m;
    public final LinkedList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f82o;
    public final z11 p;
    public final q38 q;

    public TrustedDeviceService() {
        c36 c36Var = zu1.c;
        this.m = c36Var != null ? c36Var.m() : null;
        this.n = new LinkedList();
        this.f82o = new AtomicBoolean(false);
        this.p = new z11(this, (byte) 4);
        this.q = new q38(this, (byte) 1);
    }

    public final void a(int i) {
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            return;
        }
        String string = applicationContext.getString(i);
        string.getClass();
        fx3.r(string, 1, applicationContext, bu7.MAIN);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        int intExtra = intent.getIntExtra("KEY_RESULT", 1);
        String stringExtra = intent.getStringExtra("KEY_TOKEN");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String str = stringExtra;
        int intExtra2 = intent.getIntExtra("SESSION_ID", 0);
        if (intExtra != 0) {
            return 2;
        }
        t38 t38Var = this.m;
        if (t38Var != null) {
            ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative = t38Var.n;
            ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_OnSignInConfirmedDeviceFromNotification(iTrustedDeviceRequestViewModelNative.a, iTrustedDeviceRequestViewModelNative);
        }
        if (ub7.b0(str)) {
            a(R.string.tv_trusted_device_authorize_device_error_invalid_token_text);
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            new r55(applicationContext).a(intExtra2, "TeamViewerRcTrustedDeviceNotification");
            return 2;
        }
        boolean z = !l25.b();
        AtomicBoolean atomicBoolean = this.f82o;
        if (z && (!atomicBoolean.get())) {
            Settings.i.n().f(this.p);
            atomicBoolean.set(true);
            this.n.add(new u38(intExtra2, str));
            ye4.a("TrustedDeviceService", "Response queued");
            return 2;
        }
        if (t38Var != null) {
            j38 j38Var = j38.Device;
            q38 q38Var = this.q;
            q38Var.getClass();
            ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative2 = t38Var.n;
            ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_SendResponse(iTrustedDeviceRequestViewModelNative2.a, iTrustedDeviceRequestViewModelNative2, 0, false, str, TrustedDeviceResponseSignalCallback.getCPtr((TrustedDeviceResponseSignalCallback) q38Var), q38Var);
        }
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        new r55(applicationContext2).a(intExtra2, "TeamViewerRcTrustedDeviceNotification");
        return 2;
    }
}
