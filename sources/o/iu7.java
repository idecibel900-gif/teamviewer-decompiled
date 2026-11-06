package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class iu7 extends jp3 {
    public static final /* synthetic */ long s = defpackage.a.a.objectFieldOffset(iu7.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread q = Thread.currentThread();
    public t22 r;

    public static void p(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // o.jp3
    public final boolean m() {
        return true;
    }

    @Override // o.jp3
    public final void n(Throwable th) {
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = s;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                p(intVolatile);
                throw null;
            }
            iu7 iu7Var = this;
            if (unsafe.compareAndSwapInt(iu7Var, s, intVolatile, 2)) {
                iu7Var.q.interrupt();
                unsafe.putIntVolatile(iu7Var, j, 3);
                return;
            }
            this = iu7Var;
        }
    }

    public final void o() {
        iu7 iu7Var;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = s;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                iu7Var = this;
                if (unsafe.compareAndSwapInt(iu7Var, j, intVolatile, 1)) {
                    t22 t22Var = iu7Var.r;
                    if (t22Var != null) {
                        t22Var.a();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        p(intVolatile);
                        throw null;
                    }
                }
                iu7Var = this;
            }
            this = iu7Var;
        }
    }
}
