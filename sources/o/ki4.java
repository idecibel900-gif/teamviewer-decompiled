package o;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class ki4 {
    public static final Executor e;
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile ii4 d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new xv((byte) 1);
        } else {
            e = Executors.newCachedThreadPool(new li4());
        }
    }

    public ki4(Callable callable) {
        Executor executor = e;
        ji4 ji4Var = new ji4(callable);
        ji4Var.m = this;
        executor.execute(ji4Var);
    }

    public final synchronized void a(hi4 hi4Var) {
        Throwable th;
        try {
            ii4 ii4Var = this.d;
            if (ii4Var != null && (th = ii4Var.b) != null) {
                hi4Var.onResult(th);
            }
            this.b.add(hi4Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(hi4 hi4Var) {
        qh4 qh4Var;
        try {
            ii4 ii4Var = this.d;
            if (ii4Var != null && (qh4Var = ii4Var.a) != null) {
                hi4Var.onResult(qh4Var);
            }
            this.a.add(hi4Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        ii4 ii4Var = this.d;
        if (ii4Var == null) {
            return;
        }
        qh4 qh4Var = ii4Var.a;
        if (qh4Var != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.a).iterator();
                while (it.hasNext()) {
                    ((hi4) it.next()).onResult(qh4Var);
                }
            }
            return;
        }
        Throwable th = ii4Var.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                xe4.b("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((hi4) it2.next()).onResult(th);
            }
        }
    }

    public final void d(ii4 ii4Var) {
        if (this.d != null) {
            hk0.l("A task may only be set once.");
            return;
        }
        this.d = ii4Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new pc0((Object) this, (byte) 20));
        }
    }

    public ki4(qh4 qh4Var) {
        d(new ii4(qh4Var));
    }
}
