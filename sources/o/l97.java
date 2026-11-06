package o;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class l97 extends w2 implements sx4, go2, nx2 {
    public static final /* synthetic */ long r = defpackage.a.a.objectFieldOffset(l97.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int q;

    public l97(Object obj) {
        this._state$volatile = obj;
    }

    @Override // o.nx2
    public final go2 a(de1 de1Var, int i, df0 df0Var) {
        return (((i < 0 || i >= 2) && i != -2) || df0Var != df0.n) ? au8.A(this, de1Var, i, df0Var) : this;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006c, B:30:0x0076, B:33:0x007d, B:34:0x0081, B:36:0x0084, B:46:0x00a5, B:49:0x00b5, B:50:0x00d1, B:56:0x00e1, B:53:0x00d8, B:55:0x00de, B:38:0x008a, B:42:0x0091, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00d1->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b4 -> B:28:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at java.base/java.util.HashMap.putVal(HashMap.java:627)
        	at java.base/java.util.HashMap.put(HashMap.java:608)
        	at java.base/java.util.HashSet.add(HashSet.java:220)
        	at jadx.core.utils.BlockUtils.addPredecessors(BlockUtils.java:703)
        	at jadx.core.utils.BlockUtils.addPredecessors(BlockUtils.java:706)
        */
    @Override // o.go2
    public final java.lang.Object b(o.ho2 r14, o.hc1 r15) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l97.b(o.ho2, o.hc1):java.lang.Object");
    }

    @Override // o.nx4, o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        k(obj);
        return f88.a;
    }

    @Override // o.j97
    public final Object getValue() {
        hr2 hr2Var = g68.s;
        Object objectVolatile = defpackage.a.a.getObjectVolatile(this, r);
        if (objectVolatile == hr2Var) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean j(Object obj, Object obj2) {
        hr2 hr2Var = g68.s;
        if (obj == null) {
            obj = hr2Var;
        }
        if (obj2 == null) {
            obj2 = hr2Var;
        }
        return l(obj, obj2);
    }

    public final void k(Object obj) {
        if (obj == null) {
            obj = g68.s;
        }
        l(null, obj);
    }

    public final boolean l(Object obj, Object obj2) {
        int i;
        x2[] x2VarArr;
        hr2 hr2Var;
        synchronized (this) {
            Unsafe unsafe = defpackage.a.a;
            long j = r;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !im3.n(objectVolatile, obj)) {
                return false;
            }
            if (im3.n(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.q;
            if ((i2 & 1) != 0) {
                this.q = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.q = i3;
            x2[] x2VarArr2 = this.m;
            while (true) {
                m97[] m97VarArr = (m97[]) x2VarArr2;
                if (m97VarArr != null) {
                    for (m97 m97Var : m97VarArr) {
                        if (m97Var != null) {
                            AtomicReference atomicReference = m97Var.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 == null || obj3 == (hr2Var = im3.B)) {
                                    break;
                                }
                                hr2 hr2Var2 = im3.A;
                                if (obj3 != hr2Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, hr2Var2)) {
                                            ((gl0) obj3).resumeWith(f88.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, hr2Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.q;
                    if (i == i3) {
                        this.q = i3 + 1;
                        return true;
                    }
                    x2VarArr = this.m;
                }
                x2VarArr2 = x2VarArr;
                i3 = i;
            }
        }
    }
}
