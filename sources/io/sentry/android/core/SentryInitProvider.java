package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import io.sentry.d5;
import io.sentry.d6;
import io.sentry.f6;
import java.util.Iterator;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public final class SentryInitProvider extends c1 {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            hk0.l("An applicationId is required to fulfill the manifest placeholder.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean zD;
        io.sentry.android.core.performance.f.e(this);
        x xVar = new x((byte) 3);
        Context context = getContext();
        if (context == null) {
            xVar.g(f6.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            io.sentry.android.core.performance.f.f(this);
            return false;
        }
        try {
            Cloneable cloneable = j1.a;
            if (cloneable == null) {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) v0.d.a(context) : (ApplicationInfo) v0.e.a(context);
                cloneable = applicationInfo != null ? applicationInfo.metaData : null;
            }
            zD = cloneable != null ? j1.d(cloneable, xVar, "io.sentry.auto-init", true) : true;
        } catch (Throwable th) {
            xVar.d(f6.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        if (zD) {
            if (context.getPackageName().endsWith(".test")) {
                try {
                    Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
                    while (it.hasNext()) {
                        ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                        if (component == null || !component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                        }
                    }
                } catch (Throwable unused) {
                }
                e2.b(context, xVar, new io.sentry.h2((byte) 18));
                d6.d().a("AutoInit");
            } else {
                e2.b(context, xVar, new io.sentry.h2((byte) 18));
                d6.d().a("AutoInit");
            }
        }
        io.sentry.android.core.performance.f.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        d5.b();
    }
}
