package o;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class vs8 implements lt8 {
    public static final Object p = new Object();
    public static final tk2 q = new tk2(ot8.class);
    public static final boolean r;
    public static final o77 s;
    public volatile Object m;
    public volatile qs8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile us8 f2342o;

    static {
        boolean z;
        o77 ss8Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        r = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                ss8Var = new ts8();
            } catch (Error | Exception e) {
                try {
                    ss8Var = new rs8();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    ss8Var = new ss8();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                ss8Var = new rs8();
            } catch (NoClassDefFoundError unused2) {
                ss8Var = new ss8();
            }
        }
        th = null;
        th2 = null;
        s = ss8Var;
        if (th != null) {
            tk2 tk2Var = q;
            Logger loggerA = tk2Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            tk2Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(us8 us8Var) {
        us8Var.a = null;
        while (true) {
            us8 us8Var2 = this.f2342o;
            if (us8Var2 != us8.c) {
                us8 us8Var3 = null;
                while (us8Var2 != null) {
                    us8 us8Var4 = us8Var2.b;
                    if (us8Var2.a != null) {
                        us8Var3 = us8Var2;
                    } else if (us8Var3 != null) {
                        us8Var3.b = us8Var4;
                        if (us8Var3.a == null) {
                        }
                    } else if (!s.A(this, us8Var2, us8Var4)) {
                    }
                    us8Var2 = us8Var4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable c();
}
