package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class xu0 {
    public final uu0 a;
    public int b;
    public int c;
    public int d = 0;

    public xu0(uu0 uu0Var) {
        Charset charset = ul3.a;
        this.a = uu0Var;
        uu0Var.n = this;
    }

    public final int a() {
        int iB = this.d;
        if (iB != 0) {
            this.b = iB;
            this.d = 0;
        } else {
            iB = this.a.B();
            this.b = iB;
        }
        if (iB == 0 || iB == this.c) {
            return Integer.MAX_VALUE;
        }
        return iB >>> 3;
    }

    public final void b(Object obj, cj6 cj6Var, eg2 eg2Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            cj6Var.g(obj, this, eg2Var);
            if (this.b != this.c) {
                throw new pm3("Failed to parse the message.");
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final void c(Object obj, cj6 cj6Var, eg2 eg2Var) throws pm3 {
        uu0 uu0Var = this.a;
        int iC = uu0Var.C();
        if (uu0Var.m >= 100) {
            throw new pm3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iK = uu0Var.k(iC);
        uu0Var.m++;
        cj6Var.g(obj, this, eg2Var);
        uu0Var.a(0);
        uu0Var.m--;
        uu0Var.j(iK);
    }

    public final void d(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 0) {
            do {
                ((xw5) rl3Var).add(Boolean.valueOf(uu0Var.l()));
                if (uu0Var.e()) {
                    return;
                } else {
                    iB = uu0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        if (i != 2) {
            throw pm3.b();
        }
        int iD = uu0Var.d() + uu0Var.C();
        do {
            ((xw5) rl3Var).add(Boolean.valueOf(uu0Var.l()));
        } while (uu0Var.d() < iD);
        v(iD);
    }

    public final wh0 e() throws pm3.a {
        w(2);
        return this.a.m();
    }

    public final void f(rl3 rl3Var) throws pm3.a {
        int iB;
        if ((this.b & 7) != 2) {
            throw pm3.b();
        }
        do {
            ((xw5) rl3Var).add(e());
            uu0 uu0Var = this.a;
            if (uu0Var.e()) {
                return;
            } else {
                iB = uu0Var.B();
            }
        } while (iB == this.b);
        this.d = iB;
    }

    public final void g(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 1) {
            do {
                ((xw5) rl3Var).add(Double.valueOf(uu0Var.n()));
                if (uu0Var.e()) {
                    return;
                } else {
                    iB = uu0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        if (i != 2) {
            throw pm3.b();
        }
        int iC = uu0Var.C();
        if ((iC & 7) != 0) {
            throw new pm3("Failed to parse the message.");
        }
        int iD = uu0Var.d() + iC;
        do {
            ((xw5) rl3Var).add(Double.valueOf(uu0Var.n()));
        } while (uu0Var.d() < iD);
    }

    public final void h(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 0) {
            do {
                ((xw5) rl3Var).add(Integer.valueOf(uu0Var.o()));
                if (uu0Var.e()) {
                    return;
                } else {
                    iB = uu0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        if (i != 2) {
            throw pm3.b();
        }
        int iD = uu0Var.d() + uu0Var.C();
        do {
            ((xw5) rl3Var).add(Integer.valueOf(uu0Var.o()));
        } while (uu0Var.d() < iD);
        v(iD);
    }

    public final Object i(zl8 zl8Var, Class cls, eg2 eg2Var) throws pm3 {
        int iOrdinal = zl8Var.ordinal();
        uu0 uu0Var = this.a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(uu0Var.n());
            case 1:
                w(5);
                return Float.valueOf(uu0Var.r());
            case 2:
                w(0);
                return Long.valueOf(uu0Var.u());
            case 3:
                w(0);
                return Long.valueOf(uu0Var.D());
            case 4:
                w(0);
                return Integer.valueOf(uu0Var.s());
            case 5:
                w(1);
                return Long.valueOf(uu0Var.q());
            case 6:
                w(5);
                return Integer.valueOf(uu0Var.p());
            case 7:
                w(0);
                return Boolean.valueOf(uu0Var.l());
            case 8:
                w(2);
                return uu0Var.A();
            case ep1.b /* 9 */:
            default:
                hk0.g("unsupported field type.");
                return null;
            case ep1.c /* 10 */:
                w(2);
                cj6 cj6VarA = vw5.c.a(cls);
                py2 py2VarC = cj6VarA.c();
                c(py2VarC, cj6VarA, eg2Var);
                cj6VarA.a(py2VarC);
                return py2VarC;
            case 11:
                return e();
            case ep1.d /* 12 */:
                w(0);
                return Integer.valueOf(uu0Var.C());
            case 13:
                w(0);
                return Integer.valueOf(uu0Var.o());
            case 14:
                w(5);
                return Integer.valueOf(uu0Var.v());
            case 15:
                w(1);
                return Long.valueOf(uu0Var.w());
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                w(0);
                return Integer.valueOf(uu0Var.x());
            case 17:
                w(0);
                return Long.valueOf(uu0Var.y());
        }
    }

    public final void j(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 2) {
            int iC = uu0Var.C();
            if ((iC & 3) != 0) {
                throw new pm3("Failed to parse the message.");
            }
            int iD = uu0Var.d() + iC;
            do {
                ((xw5) rl3Var).add(Integer.valueOf(uu0Var.p()));
            } while (uu0Var.d() < iD);
            return;
        }
        if (i != 5) {
            throw pm3.b();
        }
        do {
            ((xw5) rl3Var).add(Integer.valueOf(uu0Var.p()));
            if (uu0Var.e()) {
                return;
            } else {
                iB = uu0Var.B();
            }
        } while (iB == this.b);
        this.d = iB;
    }

    public final void k(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 1) {
            do {
                ((xw5) rl3Var).add(Long.valueOf(uu0Var.q()));
                if (uu0Var.e()) {
                    return;
                } else {
                    iB = uu0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        if (i != 2) {
            throw pm3.b();
        }
        int iC = uu0Var.C();
        if ((iC & 7) != 0) {
            throw new pm3("Failed to parse the message.");
        }
        int iD = uu0Var.d() + iC;
        do {
            ((xw5) rl3Var).add(Long.valueOf(uu0Var.q()));
        } while (uu0Var.d() < iD);
    }

    public final void l(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 2) {
            int iC = uu0Var.C();
            if ((iC & 3) != 0) {
                throw new pm3("Failed to parse the message.");
            }
            int iD = uu0Var.d() + iC;
            do {
                ((xw5) rl3Var).add(Float.valueOf(uu0Var.r()));
            } while (uu0Var.d() < iD);
            return;
        }
        if (i != 5) {
            throw pm3.b();
        }
        do {
            ((xw5) rl3Var).add(Float.valueOf(uu0Var.r()));
            if (uu0Var.e()) {
                return;
            } else {
                iB = uu0Var.B();
            }
        } while (iB == this.b);
        this.d = iB;
    }

    public final void m(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 0) {
            do {
                ((xw5) rl3Var).add(Integer.valueOf(uu0Var.s()));
                if (uu0Var.e()) {
                    return;
                } else {
                    iB = uu0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        if (i != 2) {
            throw pm3.b();
        }
        int iD = uu0Var.d() + uu0Var.C();
        do {
            ((xw5) rl3Var).add(Integer.valueOf(uu0Var.s()));
        } while (uu0Var.d() < iD);
        v(iD);
    }

    public final void n(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 0) {
            do {
                ((xw5) rl3Var).add(Long.valueOf(uu0Var.u()));
                if (uu0Var.e()) {
                    return;
                } else {
                    iB = uu0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        if (i != 2) {
            throw pm3.b();
        }
        int iD = uu0Var.d() + uu0Var.C();
        do {
            ((xw5) rl3Var).add(Long.valueOf(uu0Var.u()));
        } while (uu0Var.d() < iD);
        v(iD);
    }

    public final void o(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 2) {
            int iC = uu0Var.C();
            if ((iC & 3) != 0) {
                throw new pm3("Failed to parse the message.");
            }
            int iD = uu0Var.d() + iC;
            do {
                ((xw5) rl3Var).add(Integer.valueOf(uu0Var.v()));
            } while (uu0Var.d() < iD);
            return;
        }
        if (i != 5) {
            throw pm3.b();
        }
        do {
            ((xw5) rl3Var).add(Integer.valueOf(uu0Var.v()));
            if (uu0Var.e()) {
                return;
            } else {
                iB = uu0Var.B();
            }
        } while (iB == this.b);
        this.d = iB;
    }

    public final void p(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 1) {
            do {
                ((xw5) rl3Var).add(Long.valueOf(uu0Var.w()));
                if (uu0Var.e()) {
                    return;
                } else {
                    iB = uu0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        if (i != 2) {
            throw pm3.b();
        }
        int iC = uu0Var.C();
        if ((iC & 7) != 0) {
            throw new pm3("Failed to parse the message.");
        }
        int iD = uu0Var.d() + iC;
        do {
            ((xw5) rl3Var).add(Long.valueOf(uu0Var.w()));
        } while (uu0Var.d() < iD);
    }

    public final void q(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 0) {
            do {
                ((xw5) rl3Var).add(Integer.valueOf(uu0Var.x()));
                if (uu0Var.e()) {
                    return;
                } else {
                    iB = uu0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        if (i != 2) {
            throw pm3.b();
        }
        int iD = uu0Var.d() + uu0Var.C();
        do {
            ((xw5) rl3Var).add(Integer.valueOf(uu0Var.x()));
        } while (uu0Var.d() < iD);
        v(iD);
    }

    public final void r(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 0) {
            do {
                ((xw5) rl3Var).add(Long.valueOf(uu0Var.y()));
                if (uu0Var.e()) {
                    return;
                } else {
                    iB = uu0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        if (i != 2) {
            throw pm3.b();
        }
        int iD = uu0Var.d() + uu0Var.C();
        do {
            ((xw5) rl3Var).add(Long.valueOf(uu0Var.y()));
        } while (uu0Var.d() < iD);
        v(iD);
    }

    public final void s(rl3 rl3Var, boolean z) throws pm3.a {
        String strZ;
        int iB;
        if ((this.b & 7) != 2) {
            throw pm3.b();
        }
        do {
            uu0 uu0Var = this.a;
            if (z) {
                w(2);
                strZ = uu0Var.A();
            } else {
                w(2);
                strZ = uu0Var.z();
            }
            ((xw5) rl3Var).add(strZ);
            if (uu0Var.e()) {
                return;
            } else {
                iB = uu0Var.B();
            }
        } while (iB == this.b);
        this.d = iB;
    }

    public final void t(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 0) {
            do {
                ((xw5) rl3Var).add(Integer.valueOf(uu0Var.C()));
                if (uu0Var.e()) {
                    return;
                } else {
                    iB = uu0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        if (i != 2) {
            throw pm3.b();
        }
        int iD = uu0Var.d() + uu0Var.C();
        do {
            ((xw5) rl3Var).add(Integer.valueOf(uu0Var.C()));
        } while (uu0Var.d() < iD);
        v(iD);
    }

    public final void u(rl3 rl3Var) throws pm3 {
        int iB;
        int i = this.b & 7;
        uu0 uu0Var = this.a;
        if (i == 0) {
            do {
                ((xw5) rl3Var).add(Long.valueOf(uu0Var.D()));
                if (uu0Var.e()) {
                    return;
                } else {
                    iB = uu0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        if (i != 2) {
            throw pm3.b();
        }
        int iD = uu0Var.d() + uu0Var.C();
        do {
            ((xw5) rl3Var).add(Long.valueOf(uu0Var.D()));
        } while (uu0Var.d() < iD);
        v(iD);
    }

    public final void v(int i) throws pm3 {
        if (this.a.d() != i) {
            throw pm3.e();
        }
    }

    public final void w(int i) throws pm3.a {
        if ((this.b & 7) != i) {
            throw pm3.b();
        }
    }

    public final boolean x() {
        int i;
        uu0 uu0Var = this.a;
        if (uu0Var.e() || (i = this.b) == this.c) {
            return false;
        }
        return uu0Var.E(i);
    }
}
