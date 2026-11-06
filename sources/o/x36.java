package o;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class x36 implements Runnable {
    public final dj0 m;
    public volatile AtomicInteger n = new AtomicInteger(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a46 f2478o;

    public x36(a46 a46Var, dj0 dj0Var) {
        this.f2478o = a46Var;
        this.m = dj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j93 j93Var;
        String strConcat = "OkHttp ".concat(this.f2478o.n.a.f());
        a46 a46Var = this.f2478o;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            a46Var.q.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.m.a(a46Var.e());
                        j93Var = a46Var.m.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            ql5 ql5Var = ql5.a;
                            ql5 ql5Var2 = ql5.a;
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            sb.append((a46Var.C ? "canceled " : "") + "call to " + a46Var.n.a.f());
                            ql5Var2.j(4, sb.toString(), e);
                        } else {
                            this.m.q(e);
                        }
                        j93Var = a46Var.m.a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        a46Var.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.m.q(iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        j93Var = a46Var.m.a;
                    }
                } catch (Throwable th2) {
                    j93 j93Var2 = a46Var.m.a;
                    j93Var2.getClass();
                    j93.Z(j93Var2, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            j93Var.getClass();
            j93.Z(j93Var, null, null, this, 3);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
