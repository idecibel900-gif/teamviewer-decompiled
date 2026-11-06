package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.SystemClock;
import io.sentry.android.core.c1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements io.sentry.transport.f {
    public static final d m = new d();

    public void a(c1 c1Var) {
        if (Build.VERSION.SDK_INT <= 28) {
            String callingPackage = c1Var.getCallingPackage();
            String packageName = c1Var.getContext().getPackageName();
            if (callingPackage == null || !callingPackage.equals(packageName)) {
                throw new SecurityException("Provider does not allow for granting of Uri permissions");
            }
        }
    }

    @Override // io.sentry.transport.f
    public long c() {
        return SystemClock.uptimeMillis();
    }
}
