package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class my4 extends sp6 implements ky4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(my4.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long v = defpackage.a.a.objectFieldOffset(my4.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public my4() {
        super(1);
        this.owner$volatile = hm3.v;
    }

    public final boolean d() {
        return Math.max(defpackage.a.a.getIntVolatile(this, sp6.r), 0) == 0;
    }

    @Override // o.ky4
    public final Object e(hc1 hc1Var) {
        boolean zF = f();
        f88 f88Var = f88.a;
        if (!zF) {
            gl0 gl0VarG = im3.G(vt1.A(hc1Var));
            try {
                ly4 ly4Var = new ly4(this, gl0VarG);
                while (true) {
                    int andDecrement = sp6.q.getAndDecrement(this);
                    if (andDecrement <= this.m) {
                        if (andDecrement > 0) {
                            ly4Var.g(f88Var, this.n);
                            break;
                        }
                        if (b(ly4Var)) {
                            break;
                        }
                    }
                }
                Object objQ = gl0VarG.q();
                ne1 ne1Var = ne1.m;
                if (objQ != ne1Var) {
                    objQ = f88Var;
                }
                if (objQ == ne1Var) {
                    return objQ;
                }
            } catch (Throwable th) {
                gl0VarG.B();
                throw th;
            }
        }
        return f88Var;
    }

    public final boolean f() {
        my4 my4Var;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = sp6.r;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.m) {
                while (true) {
                    Unsafe unsafe2 = defpackage.a.a;
                    long j2 = sp6.r;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.m;
                    if (intVolatile2 <= i) {
                        my4Var = this;
                        break;
                    }
                    my4 my4Var2 = this;
                    my4Var = my4Var2;
                    if (unsafe2.compareAndSwapInt(my4Var2, j2, intVolatile2, i)) {
                        break;
                    }
                    this = my4Var;
                }
            } else {
                my4Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(my4Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(my4Var, v, (Object) null);
                    return true;
                }
            }
            this = my4Var;
        }
    }

    @Override // o.ky4
    public final void j(Object obj) {
        while (this.d()) {
            Unsafe unsafe = defpackage.a.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            hr2 hr2Var = hm3.v;
            if (objectVolatile != hr2Var) {
                if (objectVolatile != obj && obj != null) {
                    yq4.o("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    my4 my4Var = this;
                    if (defpackage.a.a.compareAndSwapObject(my4Var, v, objectVolatile, hr2Var)) {
                        my4Var.c();
                        return;
                    } else {
                        if (defpackage.a.a.getObjectVolatile(my4Var, j) != objectVolatile) {
                            this = my4Var;
                            break;
                        }
                        this = my4Var;
                    }
                }
            }
        }
        hk0.l("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + di1.r(this) + "[isLocked=" + d() + ",owner=" + defpackage.a.a.getObjectVolatile(this, v) + ']';
    }
}
