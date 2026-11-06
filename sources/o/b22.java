package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class b22 extends mj6 {
    public static final /* synthetic */ long q = defpackage.a.a.objectFieldOffset(b22.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // o.mj6, o.op3
    public final void c(Object obj) {
        d(obj);
    }

    @Override // o.mj6, o.op3
    public final void d(Object obj) {
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = q;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile != 1) {
                    hk0.l("Already resumed");
                    return;
                } else {
                    ga0.t(mo8.s(obj), vt1.A(this.p));
                    return;
                }
            }
            b22 b22Var = this;
            if (unsafe.compareAndSwapInt(b22Var, j, 0, 2)) {
                return;
            } else {
                this = b22Var;
            }
        }
    }
}
