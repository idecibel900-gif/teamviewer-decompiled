package io.sentry.android.core;

import io.sentry.f6;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements io.sentry.util.g {
    public final /* synthetic */ byte m;
    public final /* synthetic */ SentryAndroidOptions n;

    public /* synthetic */ q(io.sentry.util.i iVar, SentryAndroidOptions sentryAndroidOptions) {
        this.m = (byte) 5;
        this.n = sentryAndroidOptions;
    }

    @Override // io.sentry.util.g
    public Object e() {
        byte b = this.m;
        SentryAndroidOptions sentryAndroidOptions = this.n;
        switch (b) {
            case 0:
                return sentryAndroidOptions.getExecutorService();
            case 1:
                return sentryAndroidOptions.getExecutorService();
            case 2:
                List list = io.sentry.android.core.cache.b.w;
                String outboxPath = sentryAndroidOptions.getOutboxPath();
                boolean z = false;
                if (outboxPath != null) {
                    File file = new File(outboxPath, "startup_crash");
                    try {
                        boolean zExists = file.exists();
                        if (zExists && !file.delete()) {
                            sentryAndroidOptions.getLogger().g(f6.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                        }
                        z = zExists;
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().d(f6.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
                    }
                    break;
                } else {
                    sentryAndroidOptions.getLogger().g(f6.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
                }
                return Boolean.valueOf(z);
            case 3:
            default:
                return Boolean.valueOf(io.sentry.util.i.b(sentryAndroidOptions, "androidx.core.view.ScrollingView"));
            case 4:
                return sentryAndroidOptions.getExecutorService();
        }
    }

    public /* synthetic */ q(SentryAndroidOptions sentryAndroidOptions, byte b) {
        this.m = b;
        this.n = sentryAndroidOptions;
    }
}
