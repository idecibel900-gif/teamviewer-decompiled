package io.sentry.android.core.cache;

import android.os.SystemClock;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.c0;
import io.sentry.android.core.internal.util.d;
import io.sentry.android.core.k1;
import io.sentry.android.core.performance.f;
import io.sentry.android.core.performance.g;
import io.sentry.android.core.x2;
import io.sentry.cache.c;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.g8;
import io.sentry.h2;
import io.sentry.p0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    public static final List w = Arrays.asList(new a(c0.class, "ANR", "last_anr_report", new h2((byte) 19)), new a(x2.class, "Tombstone", "last_tombstone_report", new h2((byte) 20)), new a(k1.class, "MemoryLimiter", "last_memory_limiter_report", new h2((byte) 21)));
    public final d v;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(SentryAndroidOptions sentryAndroidOptions) {
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        io.sentry.util.b.v(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.v = d.m;
    }

    public static Long k(g7 g7Var, String str, String str2) {
        String cacheDirPath = g7Var.getCacheDirPath();
        io.sentry.util.b.v(cacheDirPath, "Cache dir path should be set for getting " + str2 + "s reported");
        File file = new File(cacheDirPath, str);
        try {
            String strU = io.sentry.util.b.u(file);
            if (strU != null && !strU.equals("null")) {
                return Long.valueOf(Long.parseLong(strU.trim()));
            }
            return null;
        } catch (Throwable th) {
            if (th instanceof FileNotFoundException) {
                g7Var.getLogger().g(f6.DEBUG, fx3.g("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
                return null;
            }
            g7Var.getLogger().d(f6.ERROR, fx3.g("Error reading last ", str2, " marker"), th);
            return null;
        }
    }

    public static void l(g7 g7Var, Long l, String str, String str2) {
        String cacheDirPath = g7Var.getCacheDirPath();
        if (cacheDirPath == null) {
            g7Var.getLogger().g(f6.DEBUG, fx3.g("Cache dir path is null, the ", str2, " marker will not be written"), new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str));
            try {
                fileOutputStream.write(String.valueOf(l).getBytes(c.u));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            g7Var.getLogger().d(f6.ERROR, fx3.g("Error writing the ", str2, " marker to the disk"), th3);
        }
    }

    @Override // io.sentry.cache.c, io.sentry.cache.d
    public final boolean F(io.sentry.internal.debugmeta.c cVar, p0 p0Var) {
        Long lValueOf;
        boolean zF = super.F(cVar, p0Var);
        g7 g7Var = this.m;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) g7Var;
        g gVar = f.c().q;
        if (g8.class.isInstance(p0Var.b("sentry:typeCheckHint")) && gVar.d()) {
            this.v.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - gVar.f123o;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                g1 logger = sentryAndroidOptions.getLogger();
                f6 f6Var = f6.DEBUG;
                logger.g(f6Var, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = g7Var.getOutboxPath();
                if (outboxPath == null) {
                    g7Var.getLogger().g(f6Var, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    File file = new File(outboxPath);
                    if (io.sentry.util.b.f(file)) {
                        try {
                            new File(file, "startup_crash").createNewFile();
                        } catch (Throwable th) {
                            g7Var.getLogger().d(f6.ERROR, "Error writing the startup crash marker file to the disk", th);
                        }
                    } else {
                        g7Var.getLogger().g(f6.ERROR, "Failed to create outbox dir %s", outboxPath);
                    }
                }
            }
        }
        for (a aVar : w) {
            Class cls = aVar.a;
            Object objB = p0Var.b("sentry:typeCheckHint");
            if (cls.isInstance(p0Var.b("sentry:typeCheckHint")) && objB != null) {
                switch (aVar.d.m) {
                    case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        lValueOf = Long.valueOf(((c0) objB).p);
                        break;
                    case 20:
                        lValueOf = Long.valueOf(((x2) objB).p);
                        break;
                    default:
                        lValueOf = Long.valueOf(((k1) objB).p);
                        break;
                }
                g1 logger2 = sentryAndroidOptions.getLogger();
                f6 f6Var2 = f6.DEBUG;
                String str = aVar.b;
                logger2.g(f6Var2, "Writing last reported %s marker with timestamp %d", str, lValueOf);
                l(sentryAndroidOptions, lValueOf, aVar.c, str);
            }
        }
        return zF;
    }
}
