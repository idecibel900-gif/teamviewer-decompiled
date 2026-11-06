package io.sentry.android.core.internal.util;

import android.os.Process;
import io.sentry.android.ndk.SentryNdk;
import io.sentry.ndk.NativeScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ byte m;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                g.b = Process.myTid();
                break;
            case 1:
                NativeScope.nativeClearAttachments();
                break;
            default:
                SentryNdk.lambda$static$0();
                break;
        }
    }

    public /* synthetic */ f(byte b) {
        this.m = b;
    }
}
