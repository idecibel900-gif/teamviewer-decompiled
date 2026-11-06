package io.sentry;

import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class d6 {
    public static volatile d6 c;
    public static final io.sentry.util.a d = new io.sentry.util.a();
    public static volatile Boolean e = null;
    public static final io.sentry.util.a f = new io.sentry.util.a();
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    public static d6 d() {
        if (c == null) {
            io.sentry.util.a aVar = d;
            aVar.e();
            try {
                if (c == null) {
                    c = new d6();
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return c;
    }

    public final void a(String str) {
        io.sentry.util.b.v(str, "integration is required.");
        this.a.add(str);
    }

    public final void b(String str, String str2) {
        this.b.add(new io.sentry.protocol.x(str, str2));
        io.sentry.util.a aVar = f;
        aVar.e();
        try {
            e = null;
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean c(g1 g1Var) {
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        io.sentry.util.a aVar = f;
        aVar.e();
        try {
            boolean z = false;
            for (io.sentry.protocol.x xVar : this.b) {
                if (xVar.m.startsWith("maven:io.sentry:") && !"8.58.0".equalsIgnoreCase(xVar.n)) {
                    g1Var.g(f6.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", xVar.m, "8.58.0", xVar.n);
                    z = true;
                }
            }
            if (z) {
                f6 f6Var = f6.ERROR;
                g1Var.g(f6Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                g1Var.g(f6Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                g1Var.g(f6Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                g1Var.g(f6Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            e = Boolean.valueOf(z);
            aVar.close();
            return z;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
