package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.sentry.f6;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w2 extends BroadcastReceiver {
    public final io.sentry.n1 a;
    public final SentryAndroidOptions b;
    public final io.sentry.android.core.internal.util.i c = new io.sentry.android.core.internal.util.i(0, 60000);
    public final char[] d = new char[64];
    public final /* synthetic */ SystemEventsBreadcrumbsIntegration e;

    public w2(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.n1 n1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.e = systemEventsBreadcrumbsIntegration;
        this.a = n1Var;
        this.b = sentryAndroidOptions;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        v2 v2Var;
        Bundle extras;
        int i;
        String action = intent.getAction();
        boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
        SentryAndroidOptions sentryAndroidOptions = this.b;
        String str = null;
        if (!zEquals) {
            v2Var = null;
        } else {
            if (this.c.a()) {
                return;
            }
            Float fB = b1.b(intent, sentryAndroidOptions);
            v2Var = new v2(fB != null ? Integer.valueOf(fB.intValue()) : null, b1.c(intent, sentryAndroidOptions));
            SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = this.e;
            if (v2Var.equals(systemEventsBreadcrumbsIntegration.x)) {
                return;
            } else {
                systemEventsBreadcrumbsIntegration.x = v2Var;
            }
        }
        io.sentry.h hVar = new io.sentry.h(System.currentTimeMillis());
        hVar.q = "system";
        hVar.s = "device.event";
        if (action != null) {
            int length = action.length();
            char[] cArr = this.d;
            int length2 = cArr.length;
            int i2 = length - 1;
            while (true) {
                if (i2 >= 0) {
                    char cCharAt = action.charAt(i2);
                    if (cCharAt == '.') {
                        str = new String(cArr, length2, cArr.length - length2);
                        break;
                    }
                    if (length2 == 0) {
                        Charset charset = io.sentry.util.r.a;
                        int iLastIndexOf = action.lastIndexOf(".");
                        if (iLastIndexOf >= 0 && action.length() > (i = iLastIndexOf + 1)) {
                            str = action.substring(i);
                            break;
                        }
                        break;
                    }
                    length2--;
                    cArr[length2] = cCharAt;
                    i2--;
                }
                str = action;
                break;
            }
        }
        if (str != null) {
            hVar.d(str, "action");
        }
        if (v2Var != null) {
            Integer num = v2Var.a;
            if (num != null) {
                hVar.d(num, "level");
            }
            Boolean bool = v2Var.b;
            if (bool != null) {
                hVar.d(bool, "charging");
            }
        } else if (sentryAndroidOptions.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
            HashMap map = new HashMap(extras.size());
            for (String str2 : extras.keySet()) {
                try {
                    Object obj = extras.get(str2);
                    if (obj != null) {
                        map.put(str2, obj.toString());
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().b(f6.ERROR, th, "%s key of the %s action threw an error.", str2, action);
                }
            }
            hVar.d(map, "extras");
        }
        hVar.u = f6.INFO;
        io.sentry.p0 p0Var = new io.sentry.p0();
        p0Var.d(intent, "android:intent");
        this.a.f(hVar, p0Var);
    }
}
