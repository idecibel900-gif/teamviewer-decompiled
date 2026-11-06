package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class z4 {
    public final /* synthetic */ byte a;
    public final io.sentry.android.core.q b;

    public /* synthetic */ z4(io.sentry.android.core.q qVar, byte b) {
        this.a = b;
        this.b = qVar;
    }

    public static boolean b(g1 g1Var, String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        g1Var.g(f6.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    public final y4 a(n1 n1Var, g7 g7Var) {
        byte b = this.a;
        io.sentry.android.core.q qVar = this.b;
        switch (b) {
            case 0:
                io.sentry.util.b.v(n1Var, "Scopes are required");
                io.sentry.util.b.v(g7Var, "SentryOptions is required");
                String cacheDirPath = qVar.n.getCacheDirPath();
                if (cacheDirPath == null || !b(g7Var.getLogger(), cacheDirPath)) {
                    g7Var.getLogger().g(f6.ERROR, "No cache dir path is defined in options.", new Object[0]);
                    return null;
                }
                return new y4(g7Var.getLogger(), cacheDirPath, new i0(n1Var, g7Var.getSerializer(), g7Var.getLogger(), g7Var.getFlushTimeoutMillis(), g7Var.getMaxQueueSize()), new File(cacheDirPath));
            default:
                io.sentry.util.b.v(n1Var, "Scopes are required");
                io.sentry.util.b.v(g7Var, "SentryOptions is required");
                String outboxPath = qVar.n.getOutboxPath();
                if (outboxPath == null || !b(g7Var.getLogger(), outboxPath)) {
                    g7Var.getLogger().g(f6.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                    return null;
                }
                return new y4(g7Var.getLogger(), outboxPath, new y3(n1Var, g7Var.getEnvelopeReader(), g7Var.getSerializer(), g7Var.getLogger(), g7Var.getFlushTimeoutMillis(), g7Var.getMaxQueueSize()), new File(outboxPath));
        }
    }
}
