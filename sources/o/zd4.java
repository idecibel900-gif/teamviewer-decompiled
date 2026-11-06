package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zd4 {
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ long f2691o;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = defpackage.a.a;
        m = unsafe.objectFieldOffset(zd4.class.getDeclaredField("_next$volatile"));
        n = unsafe.objectFieldOffset(zd4.class.getDeclaredField("_prev$volatile"));
        f2691o = unsafe.objectFieldOffset(zd4.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(zd4 zd4Var, int i) {
        zd4 zd4Var2;
        zd4 zd4Var3;
        while (true) {
            zd4 zd4VarJ = this.j();
            if (zd4VarJ instanceof wa4) {
                return (((wa4) zd4VarJ).p & i) == 0 && zd4VarJ.c(zd4Var, i);
            }
            Unsafe unsafe = defpackage.a.a;
            unsafe.putObjectVolatile(zd4Var, n, zd4VarJ);
            long j = m;
            unsafe.putObjectVolatile(zd4Var, j, this);
            while (true) {
                Unsafe unsafe2 = defpackage.a.a;
                zd4Var2 = this;
                zd4Var3 = zd4Var;
                if (unsafe2.compareAndSwapObject(zd4VarJ, m, zd4Var2, zd4Var3)) {
                    zd4Var3.g(zd4Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(zd4VarJ, j) != zd4Var2) {
                    break;
                }
                this = zd4Var2;
                zd4Var = zd4Var3;
            }
            this = zd4Var2;
            zd4Var = zd4Var3;
        }
    }

    public final zd4 d() {
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = n;
            zd4 zd4Var = (zd4) unsafe.getObjectVolatile(this, j);
            zd4 zd4Var2 = null;
            zd4 zd4Var3 = zd4Var;
            while (true) {
                if (zd4Var3 == null) {
                    io.sentry.h2.f();
                    return null;
                }
                Unsafe unsafe2 = defpackage.a.a;
                long j2 = m;
                Object objectVolatile = unsafe2.getObjectVolatile(zd4Var3, j2);
                if (objectVolatile == this) {
                    if (zd4Var != zd4Var3) {
                        while (true) {
                            Unsafe unsafe3 = defpackage.a.a;
                            zd4 zd4Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(zd4Var4, n, zd4Var, zd4Var3);
                            zd4 zd4Var5 = zd4Var;
                            this = zd4Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != zd4Var5) {
                                    break;
                                }
                                this = this;
                                zd4Var = zd4Var5;
                            }
                        }
                    }
                    return zd4Var3;
                }
                zd4Var = zd4Var;
                this = this;
                if (this.k()) {
                    return null;
                }
                if (!(objectVolatile instanceof la6)) {
                    objectVolatile.getClass();
                    zd4Var2 = zd4Var3;
                    zd4Var3 = (zd4) objectVolatile;
                } else if (zd4Var2 != null) {
                    zd4 zd4Var6 = ((la6) objectVolatile).a;
                    while (true) {
                        zd4 zd4Var7 = zd4Var3;
                        Unsafe unsafe4 = defpackage.a.a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(zd4Var2, m, zd4Var7, zd4Var6);
                        zd4Var3 = zd4Var7;
                        if (zCompareAndSwapObject2) {
                            zd4Var3 = zd4Var2;
                            zd4Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(zd4Var2, j2) != zd4Var3) {
                            break;
                        }
                    }
                } else {
                    if (zd4Var3 == null) {
                        io.sentry.h2.f();
                        return null;
                    }
                    zd4Var3 = (zd4) unsafe2.getObjectVolatile(zd4Var3, j);
                }
            }
            this = this;
        }
    }

    public final void g(zd4 zd4Var) {
        zd4 zd4Var2;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = n;
            zd4 zd4Var3 = (zd4) unsafe.getObjectVolatile(zd4Var, j);
            if (this.h() != zd4Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = defpackage.a.a;
                zd4Var2 = this;
                zd4 zd4Var4 = zd4Var;
                if (unsafe2.compareAndSwapObject(zd4Var4, n, zd4Var3, zd4Var2)) {
                    if (zd4Var2.k()) {
                        zd4Var4.d();
                        return;
                    }
                    return;
                } else {
                    zd4Var = zd4Var4;
                    if (unsafe2.getObjectVolatile(zd4Var4, j) != zd4Var3) {
                        break;
                    } else {
                        this = zd4Var2;
                    }
                }
            }
            this = zd4Var2;
        }
    }

    public final Object h() {
        return defpackage.a.a.getObjectVolatile(this, m);
    }

    public final zd4 i() {
        Object objH = h();
        la6 la6Var = objH instanceof la6 ? (la6) objH : null;
        if (la6Var != null) {
            return la6Var.a;
        }
        objH.getClass();
        return (zd4) objH;
    }

    public final zd4 j() {
        zd4 zd4VarD = d();
        if (zd4VarD != null) {
            return zd4VarD;
        }
        Unsafe unsafe = defpackage.a.a;
        long j = n;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            zd4 zd4Var = (zd4) objectVolatile;
            if (!zd4Var.k()) {
                return zd4Var;
            }
            objectVolatile = defpackage.a.a.getObjectVolatile(zd4Var, j);
        }
    }

    public boolean k() {
        return h() instanceof la6;
    }

    public String toString() {
        return new k44(this, di1.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1, (byte) 1) + '@' + di1.r(this);
    }
}
