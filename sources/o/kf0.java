package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class kf0 implements wm0 {
    public static final /* synthetic */ long A;
    public static final /* synthetic */ long B;
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(kf0.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1258o;
    public static final /* synthetic */ AtomicLongFieldUpdater p;
    public static final /* synthetic */ AtomicLongFieldUpdater q;
    public static final /* synthetic */ AtomicReferenceFieldUpdater r;
    public static final /* synthetic */ AtomicReferenceFieldUpdater s;
    public static final /* synthetic */ long t;
    public static final /* synthetic */ long u;
    public static final /* synthetic */ long v;
    public static final /* synthetic */ long w;
    public static final /* synthetic */ long x;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int m;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = defpackage.a.a;
        B = unsafe.objectFieldOffset(kf0.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        f1258o = AtomicLongFieldUpdater.newUpdater(kf0.class, "receivers$volatile");
        z = unsafe.objectFieldOffset(kf0.class.getDeclaredField("receivers$volatile"));
        p = AtomicLongFieldUpdater.newUpdater(kf0.class, "bufferEnd$volatile");
        u = unsafe.objectFieldOffset(kf0.class.getDeclaredField("bufferEnd$volatile"));
        q = AtomicLongFieldUpdater.newUpdater(kf0.class, "completedExpandBuffersAndPauseFlag$volatile");
        x = unsafe.objectFieldOffset(kf0.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        r = AtomicReferenceFieldUpdater.newUpdater(kf0.class, Object.class, "sendSegment$volatile");
        A = unsafe.objectFieldOffset(kf0.class.getDeclaredField("sendSegment$volatile"));
        s = AtomicReferenceFieldUpdater.newUpdater(kf0.class, Object.class, "receiveSegment$volatile");
        y = unsafe.objectFieldOffset(kf0.class.getDeclaredField("receiveSegment$volatile"));
        v = unsafe.objectFieldOffset(kf0.class.getDeclaredField("bufferEndSegment$volatile"));
        t = unsafe.objectFieldOffset(kf0.class.getDeclaredField("_closeCause$volatile"));
        w = unsafe.objectFieldOffset(kf0.class.getDeclaredField("closeHandler$volatile"));
    }

    public kf0(int i) {
        this.m = i;
        if (i < 0) {
            gk0.h(fx3.f(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        kn0 kn0Var = mf0.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = p();
        kn0 kn0Var2 = new kn0(0L, null, this, 3);
        this.sendSegment$volatile = kn0Var2;
        this.receiveSegment$volatile = kn0Var2;
        if (B()) {
            kn0Var2 = mf0.a;
            kn0Var2.getClass();
        }
        this.bufferEndSegment$volatile = kn0Var2;
        this._closeCause$volatile = mf0.s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object F(kf0 kf0Var, jc1 jc1Var) {
        if0 if0Var;
        kn0 kn0Var;
        if (jc1Var instanceof if0) {
            if0Var = (if0) jc1Var;
            int i = if0Var.f1054o;
            if ((i & Integer.MIN_VALUE) != 0) {
                if0Var.f1054o = i - Integer.MIN_VALUE;
            } else {
                if0Var = new if0(kf0Var, jc1Var);
            }
        } else {
            if0Var = new if0(kf0Var, jc1Var);
        }
        if0 if0Var2 = if0Var;
        Object obj = if0Var2.m;
        int i2 = if0Var2.f1054o;
        if (i2 != 0) {
            if (i2 == 1) {
                ct1.a0(obj);
                return ((jn0) obj).a;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        kn0 kn0Var2 = (kn0) defpackage.a.a.getObjectVolatile(kf0Var, y);
        while (!kf0Var.y()) {
            long andIncrement = f1258o.getAndIncrement(kf0Var);
            long j = mf0.b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (kn0Var2.p != j2) {
                kn0 kn0VarI = kf0Var.i(j2, kn0Var2);
                if (kn0VarI == null) {
                    continue;
                } else {
                    kn0Var = kn0VarI;
                }
            } else {
                kn0Var = kn0Var2;
            }
            kf0 kf0Var2 = kf0Var;
            Object objK = kf0Var2.K(kn0Var, i3, andIncrement, null);
            if (objK == mf0.m) {
                hk0.l("unexpected");
                return null;
            }
            if (objK != mf0.f1464o) {
                if (objK != mf0.n) {
                    kn0Var.a();
                    return objK;
                }
                if0Var2.f1054o = 1;
                Object objG = kf0Var2.G(kn0Var, i3, andIncrement, if0Var2);
                ne1 ne1Var = ne1.m;
                return objG == ne1Var ? ne1Var : objG;
            }
            if (andIncrement < kf0Var2.u()) {
                kn0Var.a();
            }
            kf0Var = kf0Var2;
            kn0Var2 = kn0Var;
        }
        return new hn0(kf0Var.q());
    }

    public boolean A() {
        return false;
    }

    public final boolean B() {
        long jP = p();
        return jP == 0 || jP == Long.MAX_VALUE;
    }

    public final void C(long j, kn0 kn0Var) {
        kf0 kf0Var;
        kn0 kn0Var2;
        kn0 kn0Var3;
        while (kn0Var.p < j && (kn0Var3 = (kn0) kn0Var.c()) != null) {
            kn0Var = kn0Var3;
        }
        while (true) {
            kn0 kn0Var4 = kn0Var;
            while (kn0Var4.d() && (kn0Var2 = (kn0) kn0Var4.c()) != null) {
                kn0Var4 = kn0Var2;
            }
            while (true) {
                Unsafe unsafe = defpackage.a.a;
                long j2 = v;
                tn6 tn6Var = (tn6) unsafe.getObjectVolatile(this, j2);
                if (tn6Var.p >= kn0Var4.p) {
                    return;
                }
                if (!kn0Var4.j()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = defpackage.a.a;
                    kf0Var = this;
                    if (unsafe2.compareAndSwapObject(kf0Var, v, tn6Var, kn0Var4)) {
                        if (tn6Var.f()) {
                            tn6Var.e();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(kf0Var, j2) != tn6Var) {
                        break;
                    } else {
                        this = kf0Var;
                    }
                }
                if (kn0Var4.f()) {
                    kn0Var4.e();
                }
                this = kf0Var;
            }
            kn0Var = kn0Var4;
        }
    }

    public final Object D(Object obj, hc1 hc1Var) {
        gl0 gl0Var = new gl0(1, vt1.A(hc1Var));
        gl0Var.t();
        gl0Var.resumeWith(new sc6(t()));
        Object objQ = gl0Var.q();
        return objQ == ne1.m ? objQ : f88.a;
    }

    public final void E(Object obj, gl0 gl0Var) {
        gl0Var.resumeWith(new sc6(t()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(kn0 kn0Var, int i, long j, jc1 jc1Var) {
        jf0 jf0Var;
        jn0 jn0Var;
        kn0 kn0Var2;
        if (jc1Var instanceof jf0) {
            jf0Var = (jf0) jc1Var;
            int i2 = jf0Var.f1157o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jf0Var.f1157o = i2 - Integer.MIN_VALUE;
            } else {
                jf0Var = new jf0(this, jc1Var);
            }
        } else {
            jf0Var = new jf0(this, jc1Var);
        }
        Object objQ = jf0Var.m;
        int i3 = jf0Var.f1157o;
        if (i3 == 0) {
            ct1.a0(objQ);
            jf0Var.f1157o = 1;
            gl0 gl0VarG = im3.G(vt1.A(jf0Var));
            try {
                u46 u46Var = new u46(gl0VarG);
                Object objK = K(kn0Var, i, j, u46Var);
                if (objK != mf0.m) {
                    if (objK == mf0.f1464o) {
                        if (j < u()) {
                            kn0Var.a();
                        }
                        kn0 kn0Var3 = (kn0) defpackage.a.a.getObjectVolatile(this, y);
                        while (true) {
                            if (y()) {
                                gl0VarG.resumeWith(new jn0(new hn0(q())));
                                break;
                            }
                            long andIncrement = f1258o.getAndIncrement(this);
                            long j2 = mf0.b;
                            long j3 = andIncrement / j2;
                            int i4 = (int) (andIncrement % j2);
                            if (kn0Var3.p != j3) {
                                kn0 kn0VarI = i(j3, kn0Var3);
                                if (kn0VarI != null) {
                                    kn0Var2 = kn0VarI;
                                }
                            } else {
                                kn0Var2 = kn0Var3;
                            }
                            Object objK2 = K(kn0Var2, i4, andIncrement, u46Var);
                            kn0 kn0Var4 = kn0Var2;
                            if (objK2 == mf0.m) {
                                u46Var.a(kn0Var4, i4);
                                break;
                            }
                            if (objK2 == mf0.f1464o) {
                                if (andIncrement < u()) {
                                    kn0Var4.a();
                                }
                                kn0Var3 = kn0Var4;
                            } else {
                                if (objK2 == mf0.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kn0Var4.a();
                                jn0Var = new jn0(objK2);
                            }
                        }
                    } else {
                        kn0Var.a();
                        jn0Var = new jn0(objK);
                    }
                    gl0VarG.g(jn0Var, null);
                    break;
                }
                u46Var.a(kn0Var, i);
                objQ = gl0VarG.q();
                ne1 ne1Var = ne1.m;
                if (objQ == ne1Var) {
                    return ne1Var;
                }
            } catch (Throwable th) {
                gl0VarG.B();
                throw th;
            }
        } else {
            if (i3 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(objQ);
        }
        return ((jn0) objQ).a;
    }

    public final void H(ug8 ug8Var, boolean z2) {
        if (ug8Var instanceof fl0) {
            ((hc1) ug8Var).resumeWith(new sc6(z2 ? r() : t()));
            return;
        }
        if (ug8Var instanceof u46) {
            ((u46) ug8Var).m.resumeWith(new jn0(new hn0(q())));
            return;
        }
        if (!(ug8Var instanceof ff0)) {
            if (ug8Var instanceof ao6) {
                ((ao6) ug8Var).g(this, mf0.l);
                return;
            } else {
                hk0.f(ug8Var, "Unexpected waiter: ");
                return;
            }
        }
        ff0 ff0Var = (ff0) ug8Var;
        gl0 gl0Var = ff0Var.n;
        gl0Var.getClass();
        ff0Var.n = null;
        ff0Var.m = mf0.l;
        Throwable thQ = ff0Var.f790o.q();
        if (thQ == null) {
            gl0Var.resumeWith(Boolean.FALSE);
        } else {
            gl0Var.resumeWith(new sc6(thQ));
        }
    }

    public final boolean I(Object obj, Object obj2) {
        if (obj instanceof ao6) {
            return ((ao6) obj).g(this, obj2) == 0;
        }
        if (obj instanceof u46) {
            gl0 gl0Var = ((u46) obj).m;
            jn0 jn0Var = new jn0(obj2);
            kn0 kn0Var = mf0.a;
            hr2 hr2VarO = gl0Var.o(jn0Var, null);
            if (hr2VarO == null) {
                return false;
            }
            gl0Var.s(hr2VarO);
            return true;
        }
        if (!(obj instanceof ff0)) {
            if (!(obj instanceof fl0)) {
                hk0.f(obj, "Unexpected receiver type: ");
                return false;
            }
            fl0 fl0Var = (fl0) obj;
            kn0 kn0Var2 = mf0.a;
            hr2 hr2VarO2 = fl0Var.o(obj2, null);
            if (hr2VarO2 == null) {
                return false;
            }
            fl0Var.s(hr2VarO2);
            return true;
        }
        ff0 ff0Var = (ff0) obj;
        gl0 gl0Var2 = ff0Var.n;
        gl0Var2.getClass();
        ff0Var.n = null;
        ff0Var.m = obj2;
        Boolean bool = Boolean.TRUE;
        ff0Var.f790o.getClass();
        kn0 kn0Var3 = mf0.a;
        hr2 hr2VarO3 = gl0Var2.o(bool, null);
        if (hr2VarO3 == null) {
            return false;
        }
        gl0Var2.s(hr2VarO3);
        return true;
    }

    public final boolean J(Object obj, kn0 kn0Var, int i) {
        v38 v38Var;
        boolean z2 = obj instanceof fl0;
        f88 f88Var = f88.a;
        if (z2) {
            fl0 fl0Var = (fl0) obj;
            kn0 kn0Var2 = mf0.a;
            hr2 hr2VarO = fl0Var.o(f88Var, null);
            if (hr2VarO == null) {
                return false;
            }
            fl0Var.s(hr2VarO);
            return true;
        }
        if (!(obj instanceof ao6)) {
            hk0.f(obj, "Unexpected waiter: ");
            return false;
        }
        int iG = ((ao6) obj).g(this, f88Var);
        v38 v38Var2 = v38.m;
        v38 v38Var3 = v38.n;
        if (iG == 0) {
            v38Var = v38Var2;
        } else if (iG == 1) {
            v38Var = v38Var3;
        } else if (iG == 2) {
            v38Var = v38.f2273o;
        } else {
            if (iG != 3) {
                an4.e(iG, "Unexpected internal result: ");
                return false;
            }
            v38Var = v38.p;
        }
        if (v38Var == v38Var3) {
            kn0Var.n(i, null);
        }
        return v38Var == v38Var2;
    }

    public final Object K(kn0 kn0Var, int i, long j, Object obj) {
        Object objL = kn0Var.l(i);
        AtomicReferenceArray atomicReferenceArray = kn0Var.t;
        long j2 = B;
        if (objL == null) {
            if (j >= (defpackage.a.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return mf0.n;
                }
                if (kn0Var.k(i, objL, obj)) {
                    h();
                    return mf0.m;
                }
            }
        } else if (objL == mf0.d && kn0Var.k(i, objL, mf0.i)) {
            h();
            Object obj2 = atomicReferenceArray.get(i * 2);
            kn0Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object objL2 = kn0Var.l(i);
            if (objL2 == null || objL2 == mf0.e) {
                if (j < (defpackage.a.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (kn0Var.k(i, objL2, mf0.h)) {
                        h();
                        return mf0.f1464o;
                    }
                } else {
                    if (obj == null) {
                        return mf0.n;
                    }
                    if (kn0Var.k(i, objL2, obj)) {
                        h();
                        return mf0.m;
                    }
                }
            } else {
                if (objL2 != mf0.d) {
                    hr2 hr2Var = mf0.j;
                    if (objL2 != hr2Var && objL2 != mf0.h) {
                        if (objL2 == mf0.l) {
                            h();
                            return mf0.f1464o;
                        }
                        if (objL2 != mf0.g && kn0Var.k(i, objL2, mf0.f)) {
                            boolean z2 = objL2 instanceof vg8;
                            if (z2) {
                                objL2 = ((vg8) objL2).a;
                            }
                            if (J(objL2, kn0Var, i)) {
                                kn0Var.o(i, mf0.i);
                                h();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                kn0Var.n(i, null);
                                return obj3;
                            }
                            kn0Var.o(i, hr2Var);
                            kn0Var.i();
                            if (z2) {
                                h();
                            }
                            return mf0.f1464o;
                        }
                    }
                    return mf0.f1464o;
                }
                if (kn0Var.k(i, objL2, mf0.i)) {
                    h();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    kn0Var.n(i, null);
                    return obj4;
                }
            }
        }
    }

    public final int L(kn0 kn0Var, int i, Object obj, long j, Object obj2, boolean z2) {
        kn0Var.n(i, obj);
        if (z2) {
            return M(kn0Var, i, obj, j, obj2, z2);
        }
        Object objL = kn0Var.l(i);
        if (objL == null) {
            if (c(j)) {
                if (kn0Var.k(i, null, mf0.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kn0Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof ug8) {
            kn0Var.n(i, null);
            if (I(objL, obj)) {
                kn0Var.o(i, mf0.i);
                return 0;
            }
            hr2 hr2Var = mf0.k;
            if (kn0Var.t.getAndSet((i * 2) + 1, hr2Var) == hr2Var) {
                return 5;
            }
            kn0Var.m(i, true);
            return 5;
        }
        return M(kn0Var, i, obj, j, obj2, z2);
    }

    public final int M(kn0 kn0Var, int i, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object objL = kn0Var.l(i);
            if (objL == null) {
                if (!c(j) || z2) {
                    if (z2) {
                        if (kn0Var.k(i, null, mf0.j)) {
                            kn0Var.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kn0Var.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kn0Var.k(i, null, mf0.d)) {
                    break;
                }
            } else {
                if (objL != mf0.e) {
                    hr2 hr2Var = mf0.k;
                    if (objL == hr2Var) {
                        kn0Var.n(i, null);
                        return 5;
                    }
                    if (objL == mf0.h) {
                        kn0Var.n(i, null);
                        return 5;
                    }
                    if (objL == mf0.l) {
                        kn0Var.n(i, null);
                        z();
                        return 4;
                    }
                    kn0Var.n(i, null);
                    if (objL instanceof vg8) {
                        objL = ((vg8) objL).a;
                    }
                    if (I(objL, obj)) {
                        kn0Var.o(i, mf0.i);
                        return 0;
                    }
                    if (kn0Var.t.getAndSet((i * 2) + 1, hr2Var) != hr2Var) {
                        kn0Var.m(i, true);
                    }
                    return 5;
                }
                if (kn0Var.k(i, objL, mf0.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void N(long j) {
        kf0 kf0Var = this;
        if (kf0Var.B()) {
            return;
        }
        while (kf0Var.p() <= j) {
            kf0Var = this;
        }
        int i = mf0.c;
        int i2 = 0;
        while (true) {
            long j2 = x;
            if (i2 < i) {
                long jP = kf0Var.p();
                if (jP == (defpackage.a.a.getLongVolatile(kf0Var, j2) & 4611686018427387903L) && jP == kf0Var.p()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = defpackage.a.a;
                    long longVolatile = unsafe.getLongVolatile(kf0Var, j2);
                    if (unsafe.compareAndSwapLong(kf0Var, x, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        kf0Var = this;
                    }
                }
                while (true) {
                    long jP2 = kf0Var.p();
                    Unsafe unsafe2 = defpackage.a.a;
                    long longVolatile2 = unsafe2.getLongVolatile(kf0Var, j2);
                    long j3 = longVolatile2 & 4611686018427387903L;
                    boolean z2 = (longVolatile2 & 4611686018427387904L) != 0;
                    if (jP2 == j3 && jP2 == kf0Var.p()) {
                        break;
                    }
                    if (z2) {
                        kf0Var = this;
                    } else {
                        kf0Var = this;
                        unsafe2.compareAndSwapLong(kf0Var, x, longVolatile2, j3 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = defpackage.a.a;
                    long longVolatile3 = unsafe3.getLongVolatile(kf0Var, j2);
                    if (unsafe3.compareAndSwapLong(kf0Var, x, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        kf0Var = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0162  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165 A[RETURN] */
    @Override // o.wp6
    public Object a(Object obj, hc1 hc1Var) {
        f88 f88Var;
        Object objQ;
        ne1 ne1Var;
        int i;
        kf0 kf0Var = this;
        Unsafe unsafe = defpackage.a.a;
        long j = A;
        kn0 kn0Var = (kn0) unsafe.getObjectVolatile(kf0Var, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(kf0Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zX = kf0Var.x(andIncrement, false);
            int i2 = mf0.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = kn0Var.p;
            ne1 ne1Var2 = ne1.m;
            f88Var = f88.a;
            if (j5 != j4) {
                kn0 kn0VarO = kf0Var.o(j4, kn0Var);
                if (kn0VarO != null) {
                    kn0Var = kn0VarO;
                } else if (zX) {
                    Object objD = D(obj, hc1Var);
                    if (objD == ne1Var2) {
                        return objD;
                    }
                }
            }
            int iL = kf0Var.L(kn0Var, i3, obj, j2, null, zX);
            if (iL == 0) {
                kn0Var.a();
                return f88Var;
            }
            if (iL != 1) {
                if (iL == 2) {
                    if (!zX) {
                        break;
                    }
                    kn0Var.i();
                    Object objD2 = D(obj, hc1Var);
                    if (objD2 == ne1Var2) {
                        return objD2;
                    }
                } else if (iL == 3) {
                    gl0 gl0VarG = im3.G(vt1.A(hc1Var));
                    try {
                        int iL2 = L(kn0Var, i3, obj, j2, gl0VarG, false);
                        if (iL2 != 0) {
                            if (iL2 == 1) {
                                ne1Var2 = ne1Var2;
                                gl0VarG.resumeWith(f88Var);
                            } else if (iL2 != 2) {
                                if (iL2 != 4) {
                                    String str = "unexpected";
                                    if (iL2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    kn0Var.a();
                                    kn0 kn0Var2 = (kn0) defpackage.a.a.getObjectVolatile(this, j);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean zX2 = x(andIncrement2, false);
                                        int i4 = mf0.b;
                                        atomicLongFieldUpdater = atomicLongFieldUpdater;
                                        long j7 = i4;
                                        ne1Var2 = ne1Var2;
                                        long j8 = j6 / j7;
                                        int i5 = (int) (j6 % j7);
                                        if (kn0Var2.p != j8) {
                                            kn0 kn0VarO2 = o(j8, kn0Var2);
                                            if (kn0VarO2 != null) {
                                                i = i5;
                                                kn0Var2 = kn0VarO2;
                                            } else if (zX2) {
                                            }
                                        } else {
                                            i = i5;
                                        }
                                        int iL3 = L(kn0Var2, i, obj, j6, gl0VarG, zX2);
                                        if (iL3 == 0) {
                                            kn0Var2.a();
                                        } else if (iL3 != 1) {
                                            if (iL3 == 2) {
                                                if (!zX2) {
                                                    gl0VarG.a(kn0Var2, i + i4);
                                                    break;
                                                }
                                                kn0Var2.i();
                                            } else {
                                                if (iL3 == 3) {
                                                    throw new IllegalStateException(str);
                                                }
                                                if (iL3 != 4) {
                                                    if (iL3 == 5) {
                                                        kn0Var2.a();
                                                    }
                                                    str = str;
                                                } else if (j6 < s()) {
                                                    kn0Var2.a();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    ne1Var2 = ne1Var2;
                                    if (j2 < s()) {
                                        kn0Var.a();
                                    }
                                }
                                E(obj, gl0VarG);
                                break;
                            } else {
                                ne1Var2 = ne1Var2;
                                gl0VarG.a(kn0Var, i3 + i2);
                            }
                            objQ = gl0VarG.q();
                            ne1Var = ne1Var2;
                            if (objQ != ne1Var) {
                                objQ = f88Var;
                            }
                            if (objQ == ne1Var) {
                                return objQ;
                            }
                        } else {
                            ne1Var2 = ne1Var2;
                            kn0Var.a();
                        }
                        gl0VarG.resumeWith(f88Var);
                        objQ = gl0VarG.q();
                        ne1Var = ne1Var2;
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
                } else if (iL != 4) {
                    if (iL == 5) {
                        kn0Var.a();
                    }
                    kf0Var = this;
                } else {
                    if (j2 < s()) {
                        kn0Var.a();
                    }
                    Object objD3 = D(obj, hc1Var);
                    if (objD3 == ne1Var2) {
                        return objD3;
                    }
                }
            } else {
                break;
            }
        }
        return f88Var;
    }

    @Override // o.wp6
    public Object b(Object obj) {
        kf0 kf0Var = this;
        Unsafe unsafe = defpackage.a.a;
        long longVolatile = unsafe.getLongVolatile(kf0Var, B);
        long j = 1152921504606846975L;
        boolean z2 = kf0Var.x(longVolatile, false) ? false : !kf0Var.c(longVolatile & 1152921504606846975L);
        in0 in0Var = jn0.b;
        if (z2) {
            return in0Var;
        }
        Object obj2 = mf0.j;
        kn0 kn0Var = (kn0) unsafe.getObjectVolatile(kf0Var, A);
        while (true) {
            long andIncrement = n.getAndIncrement(kf0Var);
            long j2 = andIncrement & j;
            boolean zX = kf0Var.x(andIncrement, false);
            int i = mf0.b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (kn0Var.p != j4) {
                kn0 kn0VarO = kf0Var.o(j4, kn0Var);
                if (kn0VarO != null) {
                    kn0Var = kn0VarO;
                } else {
                    if (zX) {
                        return new hn0(kf0Var.t());
                    }
                    j = 1152921504606846975L;
                }
            }
            int iL = kf0Var.L(kn0Var, i2, obj, j2, obj2, zX);
            f88 f88Var = f88.a;
            if (iL == 0) {
                kn0Var.a();
                return f88Var;
            }
            if (iL == 1) {
                return f88Var;
            }
            if (iL == 2) {
                if (zX) {
                    kn0Var.i();
                    return new hn0(t());
                }
                ug8 ug8Var = obj2 instanceof ug8 ? (ug8) obj2 : null;
                if (ug8Var != null) {
                    ug8Var.a(kn0Var, i2 + i);
                }
                kn0Var.i();
                return in0Var;
            }
            if (iL == 3) {
                hk0.l("unexpected");
                return null;
            }
            if (iL == 4) {
                if (j2 < s()) {
                    kn0Var.a();
                }
                return new hn0(t());
            }
            if (iL == 5) {
                kn0Var.a();
            }
            j = 1152921504606846975L;
            kf0Var = this;
        }
    }

    public final boolean c(long j) {
        return j < p() || j < s() + ((long) this.m);
    }

    public final boolean d(Throwable th) {
        return e(th, false);
    }

    public final boolean e(Throwable th, boolean z2) {
        boolean z3;
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        Unsafe unsafe4;
        long j4;
        long longVolatile3;
        if (z2) {
            do {
                unsafe4 = defpackage.a.a;
                j4 = B;
                longVolatile3 = unsafe4.getLongVolatile(this, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                kn0 kn0Var = mf0.a;
            } while (!unsafe4.compareAndSwapLong(this, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L));
        }
        hr2 hr2Var = mf0.s;
        while (true) {
            Unsafe unsafe5 = defpackage.a.a;
            long j5 = t;
            if (unsafe5.compareAndSwapObject(this, j5, hr2Var, th)) {
                z3 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j5) != hr2Var) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                unsafe3 = defpackage.a.a;
                j3 = B;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = defpackage.a.a;
                j = B;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i = (int) (longVolatile >> 60);
                if (i == 0) {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        z();
        if (z3) {
            loop3: while (true) {
                Unsafe unsafe6 = defpackage.a.a;
                long j6 = w;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                hr2 hr2Var2 = objectVolatile == null ? mf0.q : mf0.r;
                do {
                    unsafe2 = defpackage.a.a;
                    if (unsafe2.compareAndSwapObject(this, w, objectVolatile, hr2Var2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                e8.i(1, objectVolatile);
                ((Function1) objectVolatile).invoke(q());
                return z3;
            }
        }
        return z3;
    }

    public final kn0 f(long j) {
        l11 l11Var;
        long j2;
        Unsafe unsafe;
        long j3;
        Unsafe unsafe2 = defpackage.a.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, v);
        kn0 kn0Var = (kn0) unsafe2.getObjectVolatile(this, A);
        if (kn0Var.p > ((kn0) objectVolatile).p) {
            objectVolatile = kn0Var;
        }
        kn0 kn0Var2 = (kn0) unsafe2.getObjectVolatile(this, y);
        if (kn0Var2.p > ((kn0) objectVolatile).p) {
            objectVolatile = kn0Var2;
        }
        l11 l11Var2 = (l11) objectVolatile;
        loop0: while (true) {
            l11Var = l11Var2;
            while (true) {
                int i = l11.f1321o;
                l11Var.getClass();
                Object objectVolatile2 = defpackage.a.a.getObjectVolatile(l11Var, l11.m);
                hr2 hr2Var = xk0.m;
                if (objectVolatile2 == hr2Var) {
                    break loop0;
                }
                l11Var2 = (l11) objectVolatile2;
                if (l11Var2 == null) {
                    do {
                        unsafe = defpackage.a.a;
                        j3 = l11.m;
                        if (unsafe.compareAndSwapObject(l11Var, j3, (Object) null, hr2Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(l11Var, j3) == null);
                }
            }
        }
        kn0 kn0Var3 = (kn0) l11Var;
        if (A()) {
            kn0 kn0Var4 = kn0Var3;
            loop3: while (true) {
                int i2 = mf0.b - 1;
                while (true) {
                    if (-1 < i2) {
                        j2 = (kn0Var4.p * ((long) mf0.b)) + ((long) i2);
                        if (j2 >= s()) {
                            while (true) {
                                Object objL = kn0Var4.l(i2);
                                if (objL != null && objL != mf0.e) {
                                    if (objL != mf0.d) {
                                        break;
                                    }
                                    break loop3;
                                }
                                if (kn0Var4.k(i2, objL, mf0.l)) {
                                    kn0Var4.i();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        kn0Var4 = (kn0) ((l11) defpackage.a.a.getObjectVolatile(kn0Var4, l11.n));
                        if (kn0Var4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                g(j2);
            }
        }
        Object objM = null;
        loop6: for (kn0 kn0Var5 = kn0Var3; kn0Var5 != null; kn0Var5 = (kn0) ((l11) defpackage.a.a.getObjectVolatile(kn0Var5, l11.n))) {
            for (int i3 = mf0.b - 1; -1 < i3; i3--) {
                if ((kn0Var5.p * ((long) mf0.b)) + ((long) i3) < j) {
                    break loop6;
                }
                while (true) {
                    Object objL2 = kn0Var5.l(i3);
                    if (objL2 != null && objL2 != mf0.e) {
                        if (!(objL2 instanceof vg8)) {
                            if (!(objL2 instanceof ug8)) {
                                break;
                            }
                            if (kn0Var5.k(i3, objL2, mf0.l)) {
                                objM = yo1.M(objM, objL2);
                                kn0Var5.m(i3, true);
                                break;
                            }
                        } else {
                            if (kn0Var5.k(i3, objL2, mf0.l)) {
                                objM = yo1.M(objM, ((vg8) objL2).a);
                                kn0Var5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (kn0Var5.k(i3, objL2, mf0.l)) {
                            kn0Var5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objM != null) {
            if (!(objM instanceof ArrayList)) {
                H((ug8) objM, true);
                return kn0Var3;
            }
            ArrayList arrayList = (ArrayList) objM;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                H((ug8) arrayList.get(size), true);
            }
        }
        return kn0Var3;
    }

    public final void g(long j) {
        kn0 kn0Var = (kn0) defpackage.a.a.getObjectVolatile(this, y);
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j2 = z;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(((long) this.m) + longVolatile, this.p())) {
                return;
            }
            this = this;
            if (unsafe.compareAndSwapLong(this, j2, longVolatile, 1 + longVolatile)) {
                long j3 = mf0.b;
                long j4 = longVolatile / j3;
                int i = (int) (longVolatile % j3);
                if (kn0Var.p != j4) {
                    kn0 kn0VarI = this.i(j4, kn0Var);
                    if (kn0VarI != null) {
                        kn0Var = kn0VarI;
                    }
                }
                kn0 kn0Var2 = kn0Var;
                if (this.K(kn0Var2, i, longVolatile, null) != mf0.f1464o || longVolatile < this.u()) {
                    kn0Var2.a();
                }
                kn0Var = kn0Var2;
            }
        }
    }

    public final void h() {
        Object objS;
        Unsafe unsafe;
        if (B()) {
            return;
        }
        Unsafe unsafe2 = defpackage.a.a;
        long j = v;
        kn0 kn0Var = (kn0) unsafe2.getObjectVolatile(this, j);
        while (true) {
            long andIncrement = p.getAndIncrement(this);
            long j2 = andIncrement / ((long) mf0.b);
            if (u() <= andIncrement) {
                if (kn0Var.p < j2 && kn0Var.c() != null) {
                    C(j2, kn0Var);
                }
                v(1L);
                return;
            }
            if (kn0Var.p != j2) {
                lf0 lf0Var = lf0.n;
                while (true) {
                    objS = xk0.s(kn0Var, j2, lf0Var);
                    if (!nv1.C(objS)) {
                        tn6 tn6VarZ = nv1.z(objS);
                        while (true) {
                            tn6 tn6Var = (tn6) defpackage.a.a.getObjectVolatile(this, j);
                            if (tn6Var.p >= tn6VarZ.p) {
                                break;
                            }
                            if (!tn6VarZ.j()) {
                                break;
                            }
                            do {
                                unsafe = defpackage.a.a;
                                if (unsafe.compareAndSwapObject(this, v, tn6Var, tn6VarZ)) {
                                    if (!tn6Var.f()) {
                                        break;
                                    }
                                    tn6Var.e();
                                    break;
                                }
                            } while (unsafe.getObjectVolatile(this, j) == tn6Var);
                            if (tn6VarZ.f()) {
                                tn6VarZ.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                kn0 kn0Var2 = null;
                if (nv1.C(objS)) {
                    z();
                    C(j2, kn0Var);
                    v(1L);
                } else {
                    kn0 kn0Var3 = (kn0) nv1.z(objS);
                    long j3 = kn0Var3.p;
                    if (j3 > j2) {
                        long j4 = ((long) mf0.b) * j3;
                        if (defpackage.a.a.compareAndSwapLong(this, u, 1 + andIncrement, j4)) {
                            v(j4 - andIncrement);
                        } else {
                            v(1L);
                        }
                    } else {
                        kn0Var2 = kn0Var3;
                    }
                }
                if (kn0Var2 == null) {
                    continue;
                } else {
                    kn0Var = kn0Var2;
                }
            }
            int i = (int) (andIncrement % ((long) mf0.b));
            Object objL = kn0Var.l(i);
            boolean z2 = objL instanceof ug8;
            long j5 = z;
            if (!z2 || andIncrement < defpackage.a.a.getLongVolatile(this, j5) || !kn0Var.k(i, objL, mf0.g)) {
                while (true) {
                    Object objL2 = kn0Var.l(i);
                    if (objL2 instanceof ug8) {
                        if (andIncrement < defpackage.a.a.getLongVolatile(this, j5)) {
                            if (kn0Var.k(i, objL2, new vg8((ug8) objL2))) {
                                v(1L);
                                return;
                            }
                        } else if (kn0Var.k(i, objL2, mf0.g)) {
                            if (!J(objL2, kn0Var, i)) {
                                kn0Var.o(i, mf0.j);
                                kn0Var.i();
                                break;
                            } else {
                                kn0Var.o(i, mf0.d);
                                v(1L);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == mf0.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (kn0Var.k(i, objL2, mf0.e)) {
                                v(1L);
                                return;
                            }
                        } else if (objL2 == mf0.d || objL2 == mf0.h || objL2 == mf0.i || objL2 == mf0.k || objL2 == mf0.l) {
                            v(1L);
                            return;
                        } else if (objL2 != mf0.f) {
                            hk0.f(objL2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                v(1L);
            } else if (J(objL, kn0Var, i)) {
                kn0Var.o(i, mf0.d);
                v(1L);
                return;
            } else {
                kn0Var.o(i, mf0.j);
                kn0Var.i();
                v(1L);
            }
        }
    }

    public final kn0 i(long j, kn0 kn0Var) {
        Object objS;
        kn0 kn0Var2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        kn0 kn0Var3 = mf0.a;
        lf0 lf0Var = lf0.n;
        loop0: while (true) {
            objS = xk0.s(kn0Var, j, lf0Var);
            if (!nv1.C(objS)) {
                tn6 tn6VarZ = nv1.z(objS);
                while (true) {
                    Unsafe unsafe3 = defpackage.a.a;
                    long j3 = y;
                    tn6 tn6Var = (tn6) unsafe3.getObjectVolatile(this, j3);
                    if (tn6Var.p >= tn6VarZ.p) {
                        break loop0;
                    }
                    if (!tn6VarZ.j()) {
                        break;
                    }
                    do {
                        unsafe2 = defpackage.a.a;
                        if (unsafe2.compareAndSwapObject(this, y, tn6Var, tn6VarZ)) {
                            if (!tn6Var.f()) {
                                break loop0;
                            }
                            tn6Var.e();
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(this, j3) == tn6Var);
                    if (tn6VarZ.f()) {
                        tn6VarZ.e();
                    }
                }
            } else {
                break;
            }
        }
        if (nv1.C(objS)) {
            z();
            if (kn0Var.p * ((long) mf0.b) < u()) {
                kn0Var.a();
                return null;
            }
        } else {
            kn0 kn0Var4 = (kn0) nv1.z(objS);
            long j4 = kn0Var4.p;
            if (B() || j > p() / ((long) mf0.b)) {
                kn0Var2 = kn0Var4;
                break;
            }
            loop3: while (true) {
                Unsafe unsafe4 = defpackage.a.a;
                long j5 = v;
                tn6 tn6Var2 = (tn6) unsafe4.getObjectVolatile(this, j5);
                if (tn6Var2.p >= j4 || !kn0Var4.j()) {
                    kn0Var2 = kn0Var4;
                    break;
                }
                while (true) {
                    Unsafe unsafe5 = defpackage.a.a;
                    kn0Var2 = kn0Var4;
                    if (unsafe5.compareAndSwapObject(this, v, tn6Var2, kn0Var4)) {
                        if (!tn6Var2.f()) {
                            break loop3;
                        }
                        tn6Var2.e();
                        break loop3;
                    }
                    if (unsafe5.getObjectVolatile(this, j5) != tn6Var2) {
                        break;
                    }
                    kn0Var4 = kn0Var2;
                }
                if (kn0Var2.f()) {
                    kn0Var2.e();
                }
                kn0Var4 = kn0Var2;
            }
            if (j4 <= j) {
                return kn0Var2;
            }
            long j6 = j4 * ((long) mf0.b);
            do {
                unsafe = defpackage.a.a;
                j2 = z;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * ((long) mf0.b) < u()) {
                kn0Var2.a();
            }
        }
        return null;
    }

    @Override // o.wm0
    public final ff0 iterator() {
        return new ff0(this);
    }

    @Override // o.wm0
    public final void j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        e(cancellationException, true);
    }

    @Override // o.wm0
    public final a65 k() {
        e8.i(3, gf0.n);
        e8.i(3, hf0.n);
        return new a65(this, (ef0) null);
    }

    @Override // o.wm0
    public final Object l() {
        kn0 kn0Var;
        Unsafe unsafe = defpackage.a.a;
        long longVolatile = unsafe.getLongVolatile(this, z);
        long longVolatile2 = unsafe.getLongVolatile(this, B);
        if (x(longVolatile2, true)) {
            return new hn0(q());
        }
        long j = longVolatile2 & 1152921504606846975L;
        in0 in0Var = jn0.b;
        if (longVolatile >= j) {
            return in0Var;
        }
        Object obj = mf0.k;
        kn0 kn0Var2 = (kn0) unsafe.getObjectVolatile(this, y);
        while (!this.y()) {
            long andIncrement = f1258o.getAndIncrement(this);
            long j2 = mf0.b;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (kn0Var2.p != j3) {
                kn0 kn0VarI = this.i(j3, kn0Var2);
                if (kn0VarI == null) {
                    continue;
                } else {
                    kn0Var = kn0VarI;
                }
            } else {
                kn0Var = kn0Var2;
            }
            kf0 kf0Var = this;
            Object objK = kf0Var.K(kn0Var, i, andIncrement, obj);
            kn0Var2 = kn0Var;
            if (objK == mf0.m) {
                ug8 ug8Var = obj instanceof ug8 ? (ug8) obj : null;
                if (ug8Var != null) {
                    ug8Var.a(kn0Var2, i);
                }
                kf0Var.N(andIncrement);
                kn0Var2.i();
                return in0Var;
            }
            if (objK != mf0.f1464o) {
                if (objK != mf0.n) {
                    kn0Var2.a();
                    return objK;
                }
                hk0.l("unexpected");
                return null;
            }
            if (andIncrement < kf0Var.u()) {
                kn0Var2.a();
            }
            this = kf0Var;
        }
        return new hn0(this.q());
    }

    @Override // o.wm0
    public final Object m(hc1 hc1Var) throws Throwable {
        kn0 kn0Var;
        Throwable th;
        kn0 kn0Var2;
        Unsafe unsafe = defpackage.a.a;
        long j = y;
        kn0 kn0Var3 = (kn0) unsafe.getObjectVolatile(this, j);
        while (!this.y()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1258o;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = mf0.b;
            long j3 = andIncrement / j2;
            int i = (int) (andIncrement % j2);
            if (kn0Var3.p != j3) {
                kn0 kn0VarI = this.i(j3, kn0Var3);
                if (kn0VarI == null) {
                    continue;
                } else {
                    kn0Var = kn0VarI;
                }
            } else {
                kn0Var = kn0Var3;
            }
            kf0 kf0Var = this;
            Object objK = kf0Var.K(kn0Var, i, andIncrement, null);
            hr2 hr2Var = mf0.m;
            if (objK == hr2Var) {
                hk0.l("unexpected");
                return null;
            }
            hr2 hr2Var2 = mf0.f1464o;
            if (objK == hr2Var2) {
                if (andIncrement < kf0Var.u()) {
                    kn0Var.a();
                }
                this = kf0Var;
                kn0Var3 = kn0Var;
            } else {
                if (objK != mf0.n) {
                    kn0Var.a();
                    return objK;
                }
                gl0 gl0VarG = im3.G(vt1.A(hc1Var));
                try {
                    Object objK2 = kf0Var.K(kn0Var, i, andIncrement, gl0VarG);
                    if (objK2 != hr2Var) {
                        if (objK2 == hr2Var2) {
                            if (andIncrement < kf0Var.u()) {
                                kn0Var.a();
                            }
                            kn0 kn0Var4 = (kn0) defpackage.a.a.getObjectVolatile(kf0Var, j);
                            while (true) {
                                if (kf0Var.y()) {
                                    gl0VarG.resumeWith(new sc6(kf0Var.r()));
                                    break;
                                }
                                gl0 gl0Var = gl0VarG;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(kf0Var);
                                    long j4 = mf0.b;
                                    long j5 = andIncrement2 / j4;
                                    int i2 = (int) (andIncrement2 % j4);
                                    if (kn0Var4.p != j5) {
                                        try {
                                            kn0 kn0VarI2 = kf0Var.i(j5, kn0Var4);
                                            if (kn0VarI2 == null) {
                                                gl0VarG = gl0Var;
                                            } else {
                                                kn0Var2 = kn0VarI2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            gl0VarG = gl0Var;
                                            gl0VarG.B();
                                            throw th;
                                        }
                                    } else {
                                        kn0Var2 = kn0Var4;
                                    }
                                    kf0 kf0Var2 = kf0Var;
                                    objK2 = kf0Var2.K(kn0Var2, i2, andIncrement2, gl0Var);
                                    kf0Var = kf0Var2;
                                    kn0 kn0Var5 = kn0Var2;
                                    gl0VarG = gl0Var;
                                    if (objK2 == mf0.m) {
                                        gl0VarG.a(kn0Var5, i2);
                                        break;
                                    }
                                    if (objK2 == mf0.f1464o) {
                                        if (andIncrement2 < kf0Var.u()) {
                                            kn0Var5.a();
                                        }
                                        kn0Var4 = kn0Var5;
                                    } else {
                                        if (objK2 == mf0.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kn0Var5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    gl0VarG = gl0Var;
                                    th = th;
                                    gl0VarG.B();
                                    throw th;
                                }
                            }
                        } else {
                            kn0Var.a();
                        }
                        gl0VarG.g(objK2, null);
                        break;
                    }
                    gl0VarG.a(kn0Var, i);
                    return gl0VarG.q();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thR = this.r();
        int i3 = g87.a;
        throw thR;
    }

    @Override // o.wm0
    public final Object n(pw0 pw0Var) {
        return F(this, pw0Var);
    }

    public final kn0 o(long j, kn0 kn0Var) {
        Object objS;
        kn0 kn0Var2;
        long j2;
        Unsafe unsafe;
        kf0 kf0Var = this;
        kn0 kn0Var3 = mf0.a;
        lf0 lf0Var = lf0.n;
        loop0: while (true) {
            objS = xk0.s(kn0Var, j, lf0Var);
            if (!nv1.C(objS)) {
                tn6 tn6VarZ = nv1.z(objS);
                while (true) {
                    Unsafe unsafe2 = defpackage.a.a;
                    long j3 = A;
                    tn6 tn6Var = (tn6) unsafe2.getObjectVolatile(kf0Var, j3);
                    if (tn6Var.p >= tn6VarZ.p) {
                        break loop0;
                    }
                    if (!tn6VarZ.j()) {
                        break;
                    }
                    do {
                        unsafe = defpackage.a.a;
                        if (unsafe.compareAndSwapObject(kf0Var, A, tn6Var, tn6VarZ)) {
                            if (!tn6Var.f()) {
                                break loop0;
                            }
                            tn6Var.e();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(kf0Var, j3) == tn6Var);
                    if (tn6VarZ.f()) {
                        tn6VarZ.e();
                    }
                }
            } else {
                break;
            }
        }
        kn0 kn0Var4 = null;
        if (nv1.C(objS)) {
            kf0Var.z();
            if (kn0Var.p * ((long) mf0.b) >= kf0Var.s()) {
                return null;
            }
            kn0Var.a();
            return null;
        }
        kn0 kn0Var5 = (kn0) nv1.z(objS);
        long j4 = kn0Var5.p;
        if (j4 <= j) {
            return kn0Var5;
        }
        long j5 = j4 * ((long) mf0.b);
        while (true) {
            Unsafe unsafe3 = defpackage.a.a;
            long j6 = B;
            long longVolatile = unsafe3.getLongVolatile(kf0Var, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                kn0Var2 = kn0Var4;
                j2 = j4;
                break;
            }
            kn0Var2 = kn0Var4;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(kf0Var, j6, longVolatile, j7 + (((long) ((int) (longVolatile >> 60))) << 60))) {
                break;
            }
            kf0Var = this;
            kn0Var4 = kn0Var2;
            j4 = j2;
        }
        if (j2 * ((long) mf0.b) >= s()) {
            return kn0Var2;
        }
        kn0Var5.a();
        return kn0Var2;
    }

    public final long p() {
        return defpackage.a.a.getLongVolatile(this, u);
    }

    public final Throwable q() {
        return (Throwable) defpackage.a.a.getObjectVolatile(this, t);
    }

    public final Throwable r() {
        Throwable thQ = q();
        return thQ == null ? new iu0("Channel was closed") : thQ;
    }

    public final long s() {
        return defpackage.a.a.getLongVolatile(this, z);
    }

    public final Throwable t() {
        Throwable thQ = q();
        return thQ == null ? new ju0("Channel was closed") : thQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = defpackage.a.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, B) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.m + ',');
        sb.append("data=[");
        int i = 0;
        List listL = qf0.L(unsafe.getObjectVolatile(this, y), unsafe.getObjectVolatile(this, A), unsafe.getObjectVolatile(this, v));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (((kn0) obj) != mf0.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            yq4.p();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((kn0) next).p;
            do {
                Object next2 = it.next();
                long j2 = ((kn0) next2).p;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        kn0 kn0Var = (kn0) next;
        long jS = s();
        long jU = u();
        loop2: while (true) {
            int i2 = mf0.b;
            for (int i3 = i; i3 < i2; i3++) {
                long j3 = (kn0Var.p * ((long) mf0.b)) + ((long) i3);
                if (j3 >= jU && j3 >= jS) {
                    break loop2;
                }
                Object objL = kn0Var.l(i3);
                Object obj2 = kn0Var.t.get(i3 * 2);
                if (objL instanceof fl0) {
                    string = (jU > j3 || j3 >= jS) ? (jS > j3 || j3 >= jU) ? "cont" : "send" : "receive";
                } else if (objL instanceof ao6) {
                    string = (jU > j3 || j3 >= jS) ? (jS > j3 || j3 >= jU) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof u46) {
                    string = "receiveCatching";
                } else if (objL instanceof vg8) {
                    string = "EB(" + objL + ')';
                } else if (im3.n(objL, mf0.f) || im3.n(objL, mf0.g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(mf0.e) && !objL.equals(mf0.i) && !objL.equals(mf0.h) && !objL.equals(mf0.k) && !objL.equals(mf0.j) && !objL.equals(mf0.l)) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            kn0Var = (kn0) kn0Var.c();
            if (kn0Var == null) {
                break;
            }
            i = 0;
        }
        if (ub7.c0(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final long u() {
        return defpackage.a.a.getLongVolatile(this, B) & 1152921504606846975L;
    }

    public final void v(long j) {
        if ((q.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((defpackage.a.a.getLongVolatile(this, x) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean x(long j, boolean z2) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                f(j & 1152921504606846975L);
                if (z2) {
                    while (true) {
                        Unsafe unsafe = defpackage.a.a;
                        long j2 = y;
                        kn0 kn0VarI = (kn0) unsafe.getObjectVolatile(this, j2);
                        long jS = s();
                        if (u() <= jS) {
                            break;
                        }
                        long j3 = mf0.b;
                        long j4 = jS / j3;
                        if (kn0VarI.p != j4 && (kn0VarI = i(j4, kn0VarI)) == null) {
                            if (((kn0) unsafe.getObjectVolatile(this, j2)).p < j4) {
                                break;
                            }
                        } else {
                            kn0VarI.a();
                            int i2 = (int) (jS % j3);
                            while (true) {
                                Object objL = kn0VarI.l(i2);
                                if (objL != null && objL != mf0.e) {
                                    if (objL != mf0.d && (objL == mf0.j || objL == mf0.l || objL == mf0.i || objL == mf0.h || (objL != mf0.g && (objL == mf0.f || jS != s())))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (kn0VarI.k(i2, objL, mf0.h)) {
                                    h();
                                    break;
                                }
                            }
                            defpackage.a.a.compareAndSwapLong(this, z, jS, jS + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    an4.g(fx3.e(i, "unexpected close status: "));
                    return false;
                }
                kn0 kn0VarF = f(j & 1152921504606846975L);
                Object objM = null;
                loop0: do {
                    for (int i3 = mf0.b - 1; -1 < i3; i3--) {
                        long j5 = (kn0VarF.p * ((long) mf0.b)) + ((long) i3);
                        while (true) {
                            Object objL2 = kn0VarF.l(i3);
                            if (objL2 == mf0.i) {
                                break loop0;
                            }
                            if (objL2 != mf0.d) {
                                if (objL2 != mf0.e && objL2 != null) {
                                    if (!(objL2 instanceof ug8) && !(objL2 instanceof vg8)) {
                                        hr2 hr2Var = mf0.g;
                                        if (objL2 == hr2Var || objL2 == mf0.f) {
                                            break loop0;
                                        }
                                        if (objL2 != hr2Var) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < s()) {
                                            break loop0;
                                        }
                                        ug8 ug8Var = objL2 instanceof vg8 ? ((vg8) objL2).a : (ug8) objL2;
                                        if (kn0VarF.k(i3, objL2, mf0.l)) {
                                            objM = yo1.M(objM, ug8Var);
                                            kn0VarF.n(i3, null);
                                            kn0VarF.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (kn0VarF.k(i3, objL2, mf0.l)) {
                                        kn0VarF.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < s()) {
                                    break loop0;
                                }
                                if (kn0VarF.k(i3, objL2, mf0.l)) {
                                    kn0VarF.n(i3, null);
                                    kn0VarF.i();
                                    break;
                                }
                            }
                        }
                    }
                    kn0VarF = (kn0) ((l11) defpackage.a.a.getObjectVolatile(kn0VarF, l11.n));
                } while (kn0VarF != null);
                if (objM != null) {
                    if (objM instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            H((ug8) arrayList.get(size), false);
                        }
                    } else {
                        H((ug8) objM, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean y() {
        return x(defpackage.a.a.getLongVolatile(this, B), true);
    }

    public final boolean z() {
        return x(defpackage.a.a.getLongVolatile(this, B), false);
    }
}
