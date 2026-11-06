package com.teamviewer.remotecontrolviewlib.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationNotificationViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.IConditionalAccessAuthNotificationViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.IntSignalCallback;
import com.teamviewer.teamviewerlib.settings.Settings;
import java.io.Serializable;
import java.util.LinkedList;
import o.a21;
import o.b21;
import o.c21;
import o.c36;
import o.c4;
import o.gk0;
import o.hk0;
import o.l25;
import o.r55;
import o.v11;
import o.ye4;
import o.z11;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final class ConditionalAccessAuthenticationService extends Service {
    public static final /* synthetic */ int q = 0;
    public final v11 m;
    public final LinkedList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f69o;
    public final z11 p;

    public ConditionalAccessAuthenticationService() {
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            throw null;
        }
        this.m = c36Var.d(null);
        this.n = new LinkedList();
        this.p = new z11(this, (byte) 0);
    }

    public final void a(b21 b21Var) {
        a21 a21Var = b21Var.b;
        long j = b21Var.a;
        int iOrdinal = a21Var.ordinal();
        v11 v11Var = this.m;
        if (iOrdinal == 0) {
            c21 c21Var = new c21(this, (byte) 0);
            ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative = v11Var.n;
            IConditionalAccessAuthNotificationViewModelSWIGJNI.ConditionalAccessAuthenticationNotificationViewModelNative_OnConnectionRequestAllowed(conditionalAccessAuthenticationNotificationViewModelNative.a, conditionalAccessAuthenticationNotificationViewModelNative, j, IntSignalCallback.getCPtr((IntSignalCallback) c21Var), c21Var);
        } else {
            if (iOrdinal != 1) {
                gk0.s();
                return;
            }
            c21 c21Var2 = new c21(this, (byte) 1);
            ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative2 = v11Var.n;
            IConditionalAccessAuthNotificationViewModelSWIGJNI.ConditionalAccessAuthenticationNotificationViewModelNative_OnConnectionRequestDenied(conditionalAccessAuthenticationNotificationViewModelNative2.a, conditionalAccessAuthenticationNotificationViewModelNative2, j, IntSignalCallback.getCPtr((IntSignalCallback) c21Var2), c21Var2);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Serializable serializableExtra;
        if (intent == null) {
            return 2;
        }
        long longExtra = intent.getLongExtra("SESSION_ID", 0L);
        if (longExtra == 0) {
            ye4.c("ConditionalAccessAuthenticationService", "Invalid session Id");
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            serializableExtra = c4.g(intent, a21.class);
        } else {
            serializableExtra = intent.getSerializableExtra("RESPONSE");
            if (!a21.class.isInstance(serializableExtra)) {
                serializableExtra = null;
            }
        }
        a21 a21Var = (a21) serializableExtra;
        if (a21Var == null) {
            ye4.c("ConditionalAccessAuthenticationService", "Invalid result");
            return 2;
        }
        b21 b21Var = new b21(longExtra, a21Var);
        if (l25.b()) {
            a(b21Var);
        } else {
            if (!this.f69o) {
                Settings.i.n().f(this.p);
                this.f69o = true;
            }
            this.n.add(b21Var);
            ye4.a("ConditionalAccessAuthenticationService", "Response queued");
        }
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        new r55(applicationContext).a(18, String.valueOf(longExtra));
        return 2;
    }
}
