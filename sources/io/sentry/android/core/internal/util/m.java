package io.sentry.android.core.internal.util;

import android.content.Context;
import io.sentry.android.core.q0;
import io.sentry.g1;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final Charset g = Charset.forName("UTF-8");
    public final Context a;
    public final q0 b;
    public final g1 c;
    public final String[] d;
    public final String[] e;
    public final Runtime f;

    public m(Context context, g1 g1Var, q0 q0Var) {
        Runtime runtime = Runtime.getRuntime();
        this.a = context;
        io.sentry.util.b.v(q0Var, "The BuildInfoProvider is required.");
        this.b = q0Var;
        io.sentry.util.b.v(g1Var, "The Logger is required.");
        this.c = g1Var;
        this.d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        io.sentry.util.b.v(runtime, "The Runtime is required.");
        this.f = runtime;
    }
}
