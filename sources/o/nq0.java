package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class nq0 extends jp3 {
    public final gl0 q;

    public nq0(gl0 gl0Var) {
        this.q = gl0Var;
    }

    @Override // o.jp3
    public final void n(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        op3 op3VarL = l();
        gl0 gl0Var = this.q;
        Throwable thP = gl0Var.p(op3VarL);
        if (gl0Var.y()) {
            a22 a22Var = (a22) gl0Var.p;
            long j = a22.t;
            loop0: while (true) {
                Object objectVolatile = defpackage.a.a.getObjectVolatile(a22Var, j);
                hr2 hr2Var = ga0.t;
                if (im3.n(objectVolatile, hr2Var)) {
                    do {
                        unsafe = defpackage.a.a;
                        if (unsafe.compareAndSwapObject(a22Var, a22.t, hr2Var, thP)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(a22Var, j) == hr2Var);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = defpackage.a.a;
                        if (unsafe2.compareAndSwapObject(a22Var, a22.t, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(a22Var, j) == objectVolatile);
                }
            }
        }
        gl0Var.f(thP);
        if (gl0Var.y()) {
            return;
        }
        gl0Var.m();
    }
}
