package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class sp6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2043o;
    public static final /* synthetic */ AtomicLongFieldUpdater p;
    public static final /* synthetic */ AtomicIntegerFieldUpdater q;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ long s;
    public static final /* synthetic */ long t;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    public final int m;
    public final b9 n;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = defpackage.a.a;
        s = unsafe.objectFieldOffset(sp6.class.getDeclaredField("head$volatile"));
        f2043o = AtomicLongFieldUpdater.newUpdater(sp6.class, "deqIdx$volatile");
        t = unsafe.objectFieldOffset(sp6.class.getDeclaredField("tail$volatile"));
        p = AtomicLongFieldUpdater.newUpdater(sp6.class, "enqIdx$volatile");
        q = AtomicIntegerFieldUpdater.newUpdater(sp6.class, "_availablePermits$volatile");
        r = unsafe.objectFieldOffset(sp6.class.getDeclaredField("_availablePermits$volatile"));
    }

    public sp6(int i) {
        this.m = i;
        if (i <= 0) {
            gk0.h(fx3.e(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            gk0.h(fx3.e(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        vp6 vp6Var = new vp6(0L, null, 2);
        this.head$volatile = vp6Var;
        this.tail$volatile = vp6Var;
        this._availablePermits$volatile = i;
        this.n = new b9((Object) this, (byte) 12);
    }

    public final Object a(jc1 jc1Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = q;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.m;
        } while (andDecrement > i);
        f88 f88Var = f88.a;
        if (andDecrement <= 0) {
            gl0 gl0VarG = im3.G(vt1.A(jc1Var));
            try {
                if (!b(gl0VarG)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                gl0VarG.g(f88Var, this.n);
                                break;
                            }
                            if (b(gl0VarG)) {
                                break;
                            }
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

    public final boolean b(ug8 ug8Var) {
        Object objS;
        Unsafe unsafe;
        sp6 sp6Var = this;
        Unsafe unsafe2 = defpackage.a.a;
        long j = t;
        vp6 vp6Var = (vp6) unsafe2.getObjectVolatile(sp6Var, j);
        long andIncrement = p.getAndIncrement(sp6Var);
        qp6 qp6Var = qp6.n;
        long j2 = andIncrement / ((long) up6.f);
        loop0: while (true) {
            objS = xk0.s(vp6Var, j2, qp6Var);
            if (nv1.C(objS)) {
                break;
            }
            tn6 tn6VarZ = nv1.z(objS);
            while (true) {
                tn6 tn6Var = (tn6) defpackage.a.a.getObjectVolatile(sp6Var, j);
                if (tn6Var.p >= tn6VarZ.p) {
                    sp6Var = this;
                    break loop0;
                }
                if (!tn6VarZ.j()) {
                    break;
                }
                do {
                    unsafe = defpackage.a.a;
                    sp6Var = this;
                    if (unsafe.compareAndSwapObject(sp6Var, t, tn6Var, tn6VarZ)) {
                        if (!tn6Var.f()) {
                            break loop0;
                        }
                        tn6Var.e();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(sp6Var, j) == tn6Var);
                if (tn6VarZ.f()) {
                    tn6VarZ.e();
                }
            }
            sp6Var = this;
        }
        vp6 vp6Var2 = (vp6) nv1.z(objS);
        AtomicReferenceArray atomicReferenceArray = vp6Var2.s;
        int i = (int) (andIncrement % ((long) up6.f));
        while (!atomicReferenceArray.compareAndSet(i, null, ug8Var)) {
            if (atomicReferenceArray.get(i) != null) {
                hr2 hr2Var = up6.b;
                hr2 hr2Var2 = up6.c;
                while (!atomicReferenceArray.compareAndSet(i, hr2Var, hr2Var2)) {
                    if (atomicReferenceArray.get(i) != hr2Var) {
                        return false;
                    }
                }
                ((fl0) ug8Var).g(f88.a, sp6Var.n);
                return true;
            }
        }
        ug8Var.a(vp6Var2, i);
        return true;
    }

    public final void c() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i;
        Object objS;
        boolean z;
        Unsafe unsafe2;
        do {
            int andIncrement = q.getAndIncrement(this);
            int i2 = this.m;
            if (andIncrement >= i2) {
                do {
                    unsafe = defpackage.a.a;
                    j = r;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i = this.m;
                    if (intVolatile <= i) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i));
                an4.e(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = defpackage.a.a;
            long j2 = s;
            vp6 vp6Var = (vp6) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = f2043o.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) up6.f);
            rp6 rp6Var = rp6.n;
            while (true) {
                objS = xk0.s(vp6Var, j3, rp6Var);
                if (!nv1.C(objS)) {
                    tn6 tn6VarZ = nv1.z(objS);
                    while (true) {
                        tn6 tn6Var = (tn6) defpackage.a.a.getObjectVolatile(this, j2);
                        if (tn6Var.p >= tn6VarZ.p) {
                            break;
                        }
                        if (!tn6VarZ.j()) {
                            break;
                        }
                        do {
                            unsafe2 = defpackage.a.a;
                            if (unsafe2.compareAndSwapObject(this, s, tn6Var, tn6VarZ)) {
                                if (!tn6Var.f()) {
                                    break;
                                }
                                tn6Var.e();
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(this, j2) == tn6Var);
                        if (tn6VarZ.f()) {
                            tn6VarZ.e();
                        }
                    }
                } else {
                    break;
                }
            }
            vp6 vp6Var2 = (vp6) nv1.z(objS);
            AtomicReferenceArray atomicReferenceArray = vp6Var2.s;
            vp6Var2.a();
            z = false;
            if (vp6Var2.p <= j3) {
                int i3 = (int) (andIncrement2 % ((long) up6.f));
                Object andSet = atomicReferenceArray.getAndSet(i3, up6.b);
                if (andSet == null) {
                    int i4 = up6.a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            hr2 hr2Var = up6.b;
                            hr2 hr2Var2 = up6.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i3, hr2Var, hr2Var2)) {
                                    z = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i3) == hr2Var);
                            z = !z;
                            break;
                        }
                        if (atomicReferenceArray.get(i3) == up6.c) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                } else if (andSet != up6.e) {
                    boolean z2 = andSet instanceof fl0;
                    f88 f88Var = f88.a;
                    if (z2) {
                        fl0 fl0Var = (fl0) andSet;
                        hr2 hr2VarO = fl0Var.o(f88Var, this.n);
                        if (hr2VarO != null) {
                            fl0Var.s(hr2VarO);
                            z = true;
                            break;
                            break;
                        }
                    } else if (!(andSet instanceof ao6)) {
                        hk0.f(andSet, "unexpected: ");
                        return;
                    } else if (((ao6) andSet).g(this, f88Var) == 0) {
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
