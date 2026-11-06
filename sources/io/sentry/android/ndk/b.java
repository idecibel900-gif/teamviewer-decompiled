package io.sentry.android.ndk;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.f;
import io.sentry.b5;
import io.sentry.f6;
import io.sentry.h;
import io.sentry.p4;
import io.sentry.s4;
import io.sentry.u4;
import io.sentry.w7;

/* JADX INFO: loaded from: classes.dex */
public final class b extends s4 {
    public final SentryAndroidOptions a;

    public b(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    @Override // io.sentry.m1
    public final void j(h hVar) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new u4(this, hVar, (byte) 10));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(f6.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.s4, io.sentry.m1
    public final void m() {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new f(this));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(f6.ERROR, th, "Scope sync clearAttachments has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.m1
    public final void n(w7 w7Var, p4 p4Var) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        if (w7Var == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new b5(this, w7Var, (byte) 13));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(f6.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
        }
    }
}
