package o;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class yh5 {
    public final s01 a;
    public final n01 b;
    public final ux2 c;
    public final hw2 d;
    public final boolean e;
    public final l78 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(ai5.f327o);
    public long i = o67.f();
    public kx4 j;
    public final au2 k;
    public final r56 l;

    public yh5(s01 s01Var, n01 n01Var, ux2 ux2Var, mx4 mx4Var, hw2 hw2Var, boolean z, l78 l78Var, Object obj) {
        this.a = s01Var;
        this.b = n01Var;
        this.c = ux2Var;
        this.d = hw2Var;
        this.e = z;
        this.f = l78Var;
        this.g = obj;
        kx4 kx4Var = ui6.a;
        kx4Var.getClass();
        this.j = kx4Var;
        au2 au2Var = new au2((byte) 3);
        au2Var.k(mx4Var, ux2Var.y());
        this.k = au2Var;
        this.l = new r56(l78Var.f1337o);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((ai5) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    ai5 ai5Var = ai5.r;
                    ai5 ai5Var2 = ai5.s;
                    while (!atomicReference.compareAndSet(ai5Var, ai5Var2)) {
                        if (atomicReference.get() != ai5Var) {
                            up5.b("Unexpected state change from: " + ai5Var + " to: " + ai5Var2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new w35();
            }
        } catch (Exception e) {
            atomicReference.set(ai5.m);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.d();
                    this.k.e();
                    this.k.c();
                    this.a.C = null;
                } catch (Throwable th) {
                    this.k.c();
                    this.a.C = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((ai5) this.h.get()).compareTo(ai5.r) >= 0;
    }

    public final void d() {
        AtomicReference atomicReference;
        ai5 ai5Var;
        ai5 ai5Var2;
        do {
            atomicReference = this.h;
            ai5Var = ai5.p;
            ai5Var2 = ai5.r;
            if (atomicReference.compareAndSet(ai5Var, ai5Var2)) {
                return;
            }
        } while (atomicReference.get() == ai5Var);
        up5.b("Unexpected state change from: " + ai5Var + " to: " + ai5Var2 + ".");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:1: B:25:0x007b->B:85:?, LOOP_END, SYNTHETIC] */
    public final boolean e(hz6 hz6Var) throws Exception {
        long j;
        ai5 ai5Var = ai5.q;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((ai5) atomicReference.get()).ordinal();
            ai5 ai5Var2 = ai5.p;
            s01 s01Var = this.a;
            n01 n01Var = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    ux2 ux2Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        ux2Var.z = 0;
                        ux2Var.y = true;
                    }
                    this.j = n01Var.b(s01Var, hz6Var, this.d);
                    if (z) {
                        if (ux2Var.F || ux2Var.z != 0) {
                            up5.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        ux2Var.z = -1;
                        ux2Var.y = false;
                    }
                    ai5 ai5Var3 = ai5.f327o;
                    while (!atomicReference.compareAndSet(ai5Var3, ai5Var2)) {
                        if (atomicReference.get() != ai5Var3) {
                            up5.b("Unexpected state change from: " + ai5Var3 + " to: " + ai5Var2 + ".");
                            if (this.j.g()) {
                                d();
                            }
                            return c();
                        }
                    }
                    if (this.j.g()) {
                        d();
                    }
                    return c();
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(ai5Var2, ai5Var)) {
                            if (atomicReference.get() != ai5Var2) {
                                up5.b("Unexpected state change from: " + ai5Var2 + " to: " + ai5Var + ".");
                                j = this.i;
                                this.i = o67.f();
                                this.j = n01Var.n(s01Var, hz6Var, this.j);
                                this.i = j;
                                while (!atomicReference.compareAndSet(ai5Var, ai5Var2)) {
                                    if (atomicReference.get() != ai5Var) {
                                        up5.b("Unexpected state change from: " + ai5Var + " to: " + ai5Var2 + ".");
                                        if (this.j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = o67.f();
                        this.j = n01Var.n(s01Var, hz6Var, this.j);
                        this.i = j;
                        while (!atomicReference.compareAndSet(ai5Var, ai5Var2)) {
                            if (atomicReference.get() != ai5Var) {
                                up5.b("Unexpected state change from: " + ai5Var + " to: " + ai5Var2 + ".");
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (!atomicReference.compareAndSet(ai5Var, ai5Var2)) {
                            if (atomicReference.get() != ai5Var) {
                                up5.b("Unexpected state change from: " + ai5Var + " to: " + ai5Var2 + ".");
                                throw th;
                            }
                        }
                        throw th;
                    }
                    j = this.i;
                case 4:
                    i01.b("Recursive call to resume()");
                    throw new iz3();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new w35();
            }
        } catch (Exception e) {
            atomicReference.set(ai5.m);
            throw e;
        }
    }
}
