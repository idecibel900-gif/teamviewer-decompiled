package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import io.sentry.f6;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ScreenshotEventProcessor implements io.sentry.j0 {
    public final SentryAndroidOptions a;
    public final boolean c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final io.sentry.android.core.internal.util.i b = new io.sentry.android.core.internal.util.i(3, 2000);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, q0 q0Var, boolean z) {
        this.a = sentryAndroidOptions;
        this.c = z;
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.b.a("Screenshot");
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0214 */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:138:0x023c A[PHI: r8
      0x023c: PHI (r8v3 android.graphics.Bitmap) = (r8v13 android.graphics.Bitmap), (r8v14 android.graphics.Bitmap), (r8v4 android.graphics.Bitmap) binds: [B:74:0x0171, B:75:0x0173, B:137:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0165  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // io.sentry.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.sentry.v5 b(io.sentry.v5 r17, io.sentry.p0 r18) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ScreenshotEventProcessor.b(io.sentry.v5, io.sentry.p0):io.sentry.v5");
    }

    @Override // io.sentry.j0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, io.sentry.p0 p0Var) {
        return f0Var;
    }

    public final io.sentry.android.replay.viewhierarchy.g e(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            View rootView = (activity.getWindow() == null || activity.getWindow().peekDecorView() == null || activity.getWindow().peekDecorView().getRootView() == null) ? null : activity.getWindow().peekDecorView().getRootView();
            if (rootView == null) {
                return null;
            }
            io.sentry.android.replay.viewhierarchy.g gVarM = io.sentry.config.a.m(rootView, null, sentryAndroidOptions.getScreenshot());
            io.sentry.config.a.F(rootView, gVarM, sentryAndroidOptions.getScreenshot(), sentryAndroidOptions.getLogger(), null);
            return gVarM;
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Failed to build view hierarchy", th);
            return null;
        }
    }
}
