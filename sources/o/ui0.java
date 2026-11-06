package o;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class ui0 {
    public final c75 a;

    public /* synthetic */ ui0(c75 c75Var) {
        this.a = c75Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(c75 c75Var, z25 z25Var, hw2 hw2Var, jc1 jc1Var) {
        ti0 ti0Var;
        pi0 pi0Var;
        hw2 hw2Var2;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (jc1Var instanceof ti0) {
            ti0Var = (ti0) jc1Var;
            int i = ti0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ti0Var.p = i - Integer.MIN_VALUE;
            } else {
                ti0Var = new ti0(jc1Var);
            }
        } else {
            ti0Var = new ti0(jc1Var);
        }
        Object objL = ti0Var.f2112o;
        int i2 = ti0Var.p;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objL);
            ti0Var.m = hw2Var;
            ti0Var.n = c75Var;
            ti0Var.p = 1;
            objL = xk0.L(z25Var, ti0Var);
            if (objL != ne1Var) {
            }
            pi0Var = c75Var;
            return ne1Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) ti0Var.n;
                try {
                    ct1.a0(objL);
                    kh.n(closeable2, null);
                    return objL;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        kh.n(closeable2, th);
                        throw th3;
                    }
                }
            }
            hw2Var2 = ti0Var.m;
            ct1.a0(objL);
            closeable = (Closeable) objL;
            try {
                c35 c35VarJ = xk0.J((lc6) closeable);
                ti0Var.m = null;
                ti0Var.n = closeable;
                ti0Var.p = 3;
                objL = hw2Var2.invoke(c35VarJ, ti0Var);
                if (objL != ne1Var) {
                    closeable2 = closeable;
                    kh.n(closeable2, null);
                    return objL;
                }
                pi0Var = c75Var;
                return ne1Var;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        pi0 pi0Var2 = (pi0) ti0Var.n;
        hw2Var = ti0Var.m;
        ct1.a0(objL);
        pi0Var = pi0Var2;
        pi0Var = c75Var;
        ab6 ab6Var = (ab6) objL;
        c75 c75Var2 = (c75) pi0Var;
        c75Var2.getClass();
        ab6Var.getClass();
        a46 a46Var = new a46(c75Var2, ab6Var);
        ti0Var.m = hw2Var;
        ti0Var.n = null;
        ti0Var.p = 2;
        gl0 gl0Var = new gl0(1, vt1.A(ti0Var));
        gl0Var.t();
        gl0Var.v(new t(a46Var, (byte) 12));
        a46Var.c(new ek0(gl0Var, (byte) 0));
        objL = gl0Var.q();
        if (objL != ne1Var) {
            hw2Var2 = hw2Var;
            closeable = (Closeable) objL;
            c35 c35VarJ2 = xk0.J((lc6) closeable);
            ti0Var.m = null;
            ti0Var.n = closeable;
            ti0Var.p = 3;
            objL = hw2Var2.invoke(c35VarJ2, ti0Var);
            if (objL != ne1Var) {
                closeable2 = closeable;
                kh.n(closeable2, null);
                return objL;
            }
        }
        pi0Var = c75Var;
        return ne1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ui0) {
            return this.a == ((ui0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ")";
    }
}
