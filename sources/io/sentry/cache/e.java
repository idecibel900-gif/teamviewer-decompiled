package io.sentry.cache;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.h1;
import io.sentry.protocol.u;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h1 {
    public final SentryAndroidOptions a;

    public e(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    @Override // io.sentry.h1
    public final void a(Map map) {
        i(map, "tags.json");
    }

    @Override // io.sentry.h1
    public final void b(u uVar) {
        if (uVar == null) {
            h("sdk-version.json");
        } else {
            i(uVar, "sdk-version.json");
        }
    }

    @Override // io.sentry.h1
    public final void c(String str) {
        if (str == null) {
            h("dist.json");
        } else {
            i(str, "dist.json");
        }
    }

    @Override // io.sentry.h1
    public final void d(Double d) {
        if (d == null) {
            h("replay-error-sample-rate.json");
        } else {
            i(d.toString(), "replay-error-sample-rate.json");
        }
    }

    @Override // io.sentry.h1
    public final void e(String str) {
        if (str == null) {
            h("environment.json");
        } else {
            i(str, "environment.json");
        }
    }

    @Override // io.sentry.h1
    public final void f(String str) {
        if (str == null) {
            h("proguard-uuid.json");
        } else {
            i(str, "proguard-uuid.json");
        }
    }

    @Override // io.sentry.h1
    public final void g(String str) {
        if (str == null) {
            h("release.json");
        } else {
            i(str, "release.json");
        }
    }

    public final void h(String str) {
        a.a(this.a, ".options-cache", str);
    }

    public final void i(Object obj, String str) {
        a.d(this.a, obj, ".options-cache", str);
    }
}
