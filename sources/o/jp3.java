package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jp3 extends zd4 implements t22, ng3 {
    public op3 p;

    @Override // o.t22
    public final void a() {
        jp3 jp3Var;
        Unsafe unsafe;
        long j;
        op3 op3VarL = l();
        while (true) {
            Object objE = op3VarL.E();
            if (objE instanceof jp3) {
                if (objE != this) {
                    return;
                }
                u92 u92Var = ka0.s;
                do {
                    unsafe = defpackage.a.a;
                    j = op3.n;
                    if (unsafe.compareAndSwapObject(op3VarL, j, objE, u92Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(op3VarL, j) == objE);
            } else {
                if (!(objE instanceof ng3) || ((ng3) objE).f() == null) {
                    return;
                }
                while (true) {
                    Object objH = this.h();
                    if (objH instanceof la6) {
                        return;
                    }
                    if (objH == this) {
                        return;
                    }
                    objH.getClass();
                    zd4 zd4Var = (zd4) objH;
                    Unsafe unsafe2 = defpackage.a.a;
                    long j2 = zd4.f2691o;
                    la6 la6Var = (la6) unsafe2.getObjectVolatile(zd4Var, j2);
                    if (la6Var == null) {
                        la6Var = new la6(zd4Var);
                        unsafe2.putObjectVolatile(zd4Var, j2, la6Var);
                    }
                    la6 la6Var2 = la6Var;
                    while (true) {
                        Unsafe unsafe3 = defpackage.a.a;
                        long j3 = zd4.m;
                        jp3Var = this;
                        if (unsafe3.compareAndSwapObject(jp3Var, j3, objH, la6Var2)) {
                            zd4Var.d();
                            return;
                        } else if (unsafe3.getObjectVolatile(jp3Var, j3) != objH) {
                            break;
                        } else {
                            this = jp3Var;
                        }
                    }
                    this = jp3Var;
                }
            }
        }
    }

    @Override // o.ng3
    public final boolean e() {
        return true;
    }

    @Override // o.ng3
    public final l45 f() {
        return null;
    }

    public final op3 l() {
        op3 op3Var = this.p;
        if (op3Var != null) {
            return op3Var;
        }
        im3.e0("job");
        throw null;
    }

    public boolean m() {
        return true;
    }

    public abstract void n(Throwable th);

    @Override // o.zd4
    public final String toString() {
        return getClass().getSimpleName() + '@' + di1.r(this) + "[job@" + di1.r(l()) + ']';
    }
}
