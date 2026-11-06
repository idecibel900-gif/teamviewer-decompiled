package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l11 {
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f1321o = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = defpackage.a.a;
        m = unsafe.objectFieldOffset(l11.class.getDeclaredField("_next$volatile"));
        n = unsafe.objectFieldOffset(l11.class.getDeclaredField("_prev$volatile"));
    }

    public l11(tn6 tn6Var) {
        this._prev$volatile = tn6Var;
    }

    public final void a() {
        defpackage.a.a.putObjectVolatile(this, n, (Object) null);
    }

    public final l11 c() {
        Object objectVolatile = defpackage.a.a.getObjectVolatile(this, m);
        if (objectVolatile == xk0.m) {
            return null;
        }
        return (l11) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        l11 l11Var;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = defpackage.a.a;
            long j = n;
            l11 l11Var2 = (l11) unsafe2.getObjectVolatile(this, j);
            while (l11Var2 != null && l11Var2.d()) {
                l11Var2 = (l11) defpackage.a.a.getObjectVolatile(l11Var2, j);
            }
            l11 l11VarC = c();
            l11VarC.getClass();
            do {
                l11Var = l11VarC;
                if (!l11Var.d()) {
                    break;
                } else {
                    l11VarC = l11Var.c();
                }
            } while (l11VarC != null);
            while (true) {
                Object objectVolatile = defpackage.a.a.getObjectVolatile(l11Var, j);
                l11 l11Var3 = ((l11) objectVolatile) == null ? null : l11Var2;
                while (true) {
                    unsafe = defpackage.a.a;
                    if (unsafe.compareAndSwapObject(l11Var, n, objectVolatile, l11Var3)) {
                        break;
                    } else if (unsafe.getObjectVolatile(l11Var, j) != objectVolatile) {
                    }
                }
            }
            if (l11Var2 != null) {
                unsafe.putObjectVolatile(l11Var2, m, l11Var);
            }
            if (!l11Var.d() || l11Var.c() == null) {
                if (l11Var2 == null || !l11Var2.d()) {
                    return;
                }
            }
        }
    }
}
