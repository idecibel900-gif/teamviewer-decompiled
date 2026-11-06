package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class ae4 {
    public static final /* synthetic */ long a = defpackage.a.a.objectFieldOffset(ae4.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new ce4(8, false);

    public final boolean a(Runnable runnable) {
        ae4 ae4Var;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = a;
            ce4 ce4Var = (ce4) unsafe.getObjectVolatile(this, j);
            int iA = ce4Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                ce4 ce4VarC = ce4Var.c();
                while (true) {
                    Unsafe unsafe2 = defpackage.a.a;
                    ae4Var = this;
                    if (unsafe2.compareAndSwapObject(ae4Var, a, ce4Var, ce4VarC) || unsafe2.getObjectVolatile(ae4Var, j) != ce4Var) {
                        break;
                    }
                    this = ae4Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                ae4Var = this;
            }
            this = ae4Var;
        }
    }

    public final void b() {
        ae4 ae4Var;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = a;
            ce4 ce4Var = (ce4) unsafe.getObjectVolatile(this, j);
            if (ce4Var.b()) {
                return;
            }
            ce4 ce4VarC = ce4Var.c();
            while (true) {
                ae4Var = this;
                if (defpackage.a.a.compareAndSwapObject(ae4Var, a, ce4Var, ce4VarC) || defpackage.a.a.getObjectVolatile(ae4Var, j) != ce4Var) {
                    break;
                } else {
                    this = ae4Var;
                }
            }
            this = ae4Var;
        }
    }

    public final int c() {
        ce4 ce4Var = (ce4) defpackage.a.a.getObjectVolatile(this, a);
        ce4Var.getClass();
        long longVolatile = defpackage.a.a.getLongVolatile(ce4Var, ce4.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        ae4 ae4Var;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = a;
            ce4 ce4Var = (ce4) unsafe.getObjectVolatile(this, j);
            Object objD = ce4Var.d();
            if (objD != ce4.e) {
                return objD;
            }
            ce4 ce4VarC = ce4Var.c();
            while (true) {
                ae4Var = this;
                if (defpackage.a.a.compareAndSwapObject(ae4Var, a, ce4Var, ce4VarC) || defpackage.a.a.getObjectVolatile(ae4Var, j) != ce4Var) {
                    break;
                }
                this = ae4Var;
            }
            this = ae4Var;
        }
    }
}
