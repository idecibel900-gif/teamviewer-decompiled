package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class a46 implements Cloneable {
    public boolean A;
    public boolean B;
    public volatile boolean C;
    public volatile io.sentry.z7 D;
    public final CopyOnWriteArrayList E;
    public final c75 m;
    public final ab6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q82 f295o;
    public volatile ae2 p;
    public final z36 q;
    public final AtomicBoolean r;
    public Object s;
    public oe2 t;
    public b46 u;
    public boolean v;
    public io.sentry.z7 w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        AtomicReferenceFieldUpdater.newUpdater(a46.class, ae2.class, "p");
    }

    public a46(c75 c75Var, ab6 ab6Var) {
        ab6Var.getClass();
        this.m = c75Var;
        this.n = ab6Var;
        this.f295o = (q82) c75Var.C.n;
        this.p = (ae2) c75Var.d.m;
        z36 z36Var = new z36(this);
        z36Var.g(0L);
        this.q = z36Var;
        this.r = new AtomicBoolean();
        this.B = true;
        this.E = new CopyOnWriteArrayList();
        new AtomicReference(ab6Var.e);
    }

    public final void a(b46 b46Var) {
        b46Var.getClass();
        TimeZone timeZone = ro8.a;
        if (this.u != null) {
            hk0.l("Check failed.");
        } else {
            this.u = b46Var;
            b46Var.p.add(new y36(this, this.s));
        }
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketI;
        TimeZone timeZone = ro8.a;
        b46 b46Var = this.u;
        if (b46Var != null) {
            synchronized (b46Var) {
                socketI = i();
            }
            if (this.u == null) {
                if (socketI != null) {
                    ro8.c(socketI);
                }
                this.p.k(this, b46Var);
            } else if (socketI != null) {
                hk0.l("Check failed.");
                return null;
            }
        }
        if (!this.v && this.q.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        ae2 ae2Var = this.p;
        if (iOException == null) {
            ae2Var.c(this);
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        ae2Var.d(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void c(dj0 dj0Var) {
        if (!this.r.compareAndSet(false, true)) {
            hk0.l("Already Executed");
            return;
        }
        ql5 ql5Var = ql5.a;
        this.s = ql5.a.h();
        this.p.e(this);
        j93 j93Var = this.m.a;
        x36 x36Var = new x36(this, dj0Var);
        j93Var.getClass();
        j93.Z(j93Var, x36Var, null, null, 6);
    }

    public final void cancel() {
        if (this.C) {
            return;
        }
        this.C = true;
        io.sentry.z7 z7Var = this.D;
        if (z7Var != null) {
            ((ne2) z7Var.d).cancel();
        }
        Iterator it = this.E.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((zf6) it.next()).cancel();
        }
        this.p.f(this);
    }

    public final Object clone() {
        return new a46(this.m, this.n);
    }

    public final void d(boolean z) {
        io.sentry.z7 z7Var;
        synchronized (this) {
            if (!this.B) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (z7Var = this.D) != null) {
            ((ne2) z7Var.d).cancel();
            ((a46) z7Var.b).g(z7Var, true, true, true, true, null);
        }
        this.w = null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d3  */
    public final lc6 e() throws Throwable {
        Object next;
        IOException iOException;
        ArrayList arrayList = new ArrayList();
        qv0.c0(arrayList, this.m.b);
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((nl3) next) instanceof io.sentry.okhttp.g));
        if (next == null) {
            arrayList.add(new io.sentry.okhttp.g());
        }
        arrayList.add(new wi0((byte) 5));
        arrayList.add(new wi0((byte) 2));
        arrayList.add(new wi0((byte) 3));
        arrayList.add(wi0.c);
        qv0.c0(arrayList, this.m.c);
        arrayList.add(wi0.b);
        ab6 ab6Var = this.n;
        c75 c75Var = this.m;
        ab6Var.getClass();
        k46 k46Var = new k46(this, arrayList, 0, null, ab6Var, c75Var.v, c75Var.w, c75Var.x, c75Var.g, c75Var.t, c75Var.C, c75Var.j, c75Var.k, c75Var.s, c75Var.m, c75Var.l, c75Var.e, c75Var.n, c75Var.f497o, c75Var.p, c75Var.u);
        boolean z = false;
        try {
            lc6 lc6VarB = k46Var.b(this.n);
            if (!this.C) {
                h(null);
                return lc6VarB;
            }
            iOException = null;
            try {
                try {
                    po8.b(lc6VarB);
                    throw new IOException("Canceled");
                } catch (IOException e) {
                    e = e;
                    z = true;
                    IOException iOExceptionH = h(e);
                    iOExceptionH.getClass();
                    throw iOExceptionH;
                }
            } catch (Throwable th) {
                th = th;
                if (!z) {
                    h(iOException);
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            iOException = null;
        } catch (Throwable th2) {
            th = th2;
            iOException = null;
            if (!z) {
                h(iOException);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004d  */
    public final IOException g(io.sentry.z7 z7Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        z7Var.getClass();
        if (z7Var.equals(this.D)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (this.x) {
                            if (z) {
                                this.x = false;
                            }
                            if (z2) {
                                this.y = false;
                            }
                            if (z4) {
                                this.z = false;
                            }
                            if (z3) {
                                this.A = false;
                            }
                            if (this.x) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = true;
                            }
                            boolean z8 = z5;
                            z5 = z7;
                            z6 = z8;
                        } else if ((!z2 && this.y) || ((z4 && this.z) || (z3 && this.A))) {
                            if (z) {
                                this.x = false;
                            }
                            if (z2) {
                                this.y = false;
                            }
                            if (z4) {
                                this.z = false;
                            }
                            if (z3) {
                                this.A = false;
                            }
                            if (this.x || this.y || this.z || this.A) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 && !this.B) {
                                z5 = true;
                            }
                            boolean z9 = z5;
                            z5 = z7;
                            z6 = z9;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = !z2 ? false : false;
                }
            }
            if (z5) {
                this.D = null;
                b46 b46Var = this.u;
                if (b46Var != null) {
                    synchronized (b46Var) {
                        b46Var.m++;
                    }
                }
            }
            if (z6) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.B) {
                this.B = false;
                if (!this.x && !this.y && !this.z && !this.A) {
                    z = true;
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket i() {
        b46 b46Var = this.u;
        b46Var.getClass();
        TimeZone timeZone = ro8.a;
        ArrayList arrayList = b46Var.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (im3.n(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            hk0.l("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.u = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        b46Var.q = System.nanoTime();
        q82 q82Var = this.f295o;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) q82Var.d;
        TimeZone timeZone2 = ro8.a;
        if (!b46Var.j) {
            ((go7) q82Var.b).c((c46) q82Var.c, 0L);
            return null;
        }
        b46Var.j = true;
        concurrentLinkedQueue.remove(b46Var);
        if (concurrentLinkedQueue.isEmpty()) {
            go7 go7Var = (go7) q82Var.b;
            synchronized (go7Var.a) {
                if (go7Var.a()) {
                    go7Var.a.c(go7Var);
                }
            }
        }
        return b46Var.e;
    }
}
