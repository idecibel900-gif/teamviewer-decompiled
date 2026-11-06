package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class a4 implements Runnable {
    public static final Charset n = Charset.forName("UTF-8");
    public final SentryAndroidOptions m;

    public a4(SentryAndroidOptions sentryAndroidOptions) {
        this.m = sentryAndroidOptions;
    }

    public final Date a(File file) {
        SentryAndroidOptions sentryAndroidOptions = this.m;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), n));
            try {
                String line = bufferedReader.readLine();
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateP = io.sentry.config.a.p(line);
                bufferedReader.close();
                return dateP;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            sentryAndroidOptions.getLogger().d(f6.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            sentryAndroidOptions.getLogger().b(f6.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        SentryAndroidOptions sentryAndroidOptions = this.m;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            sentryAndroidOptions.getLogger().g(f6.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && !((io.sentry.cache.c) envelopeDiskCache).h()) {
            sentryAndroidOptions.getLogger().g(f6.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        Charset charset = io.sentry.cache.c.u;
        File file = new File(cacheDirPath, "previous_session.json");
        t1 serializer = sentryAndroidOptions.getSerializer();
        if (file.exists()) {
            sentryAndroidOptions.getLogger().g(f6.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), n));
                try {
                    u7 u7Var = (u7) serializer.b(bufferedReader, u7.class);
                    if (u7Var == null) {
                        sentryAndroidOptions.getLogger().g(f6.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(sentryAndroidOptions.getCacheDirPath(), ".sentry-native/last_crash");
                        t7 t7Var = u7Var.s;
                        t7 t7Var2 = t7.Crashed;
                        if (t7Var == t7Var2) {
                            k5 k5Var = k5.c;
                            io.sentry.util.a aVar = k5Var.b;
                            aVar.e();
                            try {
                                k5Var.a = false;
                                aVar.close();
                                k5Var.a();
                            } catch (Throwable th) {
                                try {
                                    aVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else if (file2.exists()) {
                            sentryAndroidOptions.getLogger().g(f6.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file2);
                            u7Var.c(t7Var2, null, true, null);
                            u7Var.b(dateA);
                        } else if (u7Var.z == null) {
                            u7Var.b(new Date());
                        }
                        if (file2.exists() && !file2.delete()) {
                            sentryAndroidOptions.getLogger().g(f6.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                        }
                        d5.c().h(new io.sentry.internal.debugmeta.c((io.sentry.protocol.w) null, sentryAndroidOptions.getSdkVersion(), t5.e(serializer, u7Var)), new p0());
                    }
                    bufferedReader.close();
                } catch (Throwable th3) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                sentryAndroidOptions.getLogger().d(f6.ERROR, "Error processing previous session.", th5);
            }
            if (file.delete()) {
                return;
            }
            sentryAndroidOptions.getLogger().g(f6.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
