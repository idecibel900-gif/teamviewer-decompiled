package o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wu0 implements o36 {
    public final ru0 a;
    public int b;
    public int c;
    public int d = 0;

    public wu0(ru0 ru0Var) {
        Charset charset = sl3.a;
        this.a = ru0Var;
        ru0Var.n = this;
    }

    public static void R(int i) throws qm3 {
        if ((i & 3) != 0) {
            throw qm3.d();
        }
    }

    public static void S(int i) throws qm3 {
        if ((i & 7) != 0) {
            throw qm3.d();
        }
    }

    @Override // o.o36
    public final void A(List list) throws qm3 {
        O(list, true);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    @Override // o.o36
    public final vh0 B() throws qm3 {
        byte[] bArrCopyOfRange;
        Q(2);
        ru0 ru0Var = this.a;
        byte[] bArr = ru0Var.f1952o;
        int I = ru0Var.I();
        if (I > 0) {
            int i = ru0Var.p;
            int i2 = ru0Var.r;
            if (I <= i - i2) {
                vh0 vh0VarC = yh0.c(bArr, i2, I);
                ru0Var.r += I;
                return vh0VarC;
            }
        }
        if (I == 0) {
            return yh0.n;
        }
        if (I > 0) {
            int i3 = ru0Var.p;
            int i4 = ru0Var.r;
            if (I <= i3 - i4) {
                int i5 = I + i4;
                ru0Var.r = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (I <= 0) {
                    throw qm3.e();
                }
                if (I == 0) {
                    throw qm3.c();
                }
                bArrCopyOfRange = sl3.b;
            }
        } else {
            if (I <= 0) {
                throw qm3.e();
            }
            if (I == 0) {
                throw qm3.c();
            }
            bArrCopyOfRange = sl3.b;
        }
        vh0 vh0Var = yh0.n;
        return new vh0(bArrCopyOfRange);
    }

    @Override // o.o36
    public final void C(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof gn2;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int I = ru0Var.I();
                R(I);
                int iD = ru0Var.d() + I;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(ru0Var.G())));
                } while (ru0Var.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw qm3.b();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(ru0Var.G())));
                if (ru0Var.e()) {
                    return;
                } else {
                    iB = ru0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        gn2 gn2Var = (gn2) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int I2 = ru0Var.I();
            R(I2);
            int iD2 = ru0Var.d() + I2;
            do {
                gn2Var.b(Float.intBitsToFloat(ru0Var.G()));
            } while (ru0Var.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw qm3.b();
        }
        do {
            gn2Var.b(Float.intBitsToFloat(ru0Var.G()));
            if (ru0Var.e()) {
                return;
            } else {
                iB2 = ru0Var.B();
            }
        } while (iB2 == this.b);
        this.d = iB2;
    }

    @Override // o.o36
    public final int D() throws qm3.a {
        Q(0);
        return this.a.I();
    }

    @Override // o.o36
    public final void E(List list, bj6 bj6Var, cg2 cg2Var) throws qm3 {
        int iB;
        int i = this.b;
        if ((i & 7) != 2) {
            throw qm3.b();
        }
        do {
            list.add(N(bj6Var, cg2Var));
            ru0 ru0Var = this.a;
            if (ru0Var.e() || this.d != 0) {
                return;
            } else {
                iB = ru0Var.B();
            }
        } while (iB == i);
        this.d = iB;
    }

    @Override // o.o36
    public final int F() throws qm3.a {
        Q(5);
        return this.a.G();
    }

    @Override // o.o36
    public final void G(List list) throws qm3 {
        int iB;
        if ((this.b & 7) != 2) {
            throw qm3.b();
        }
        do {
            list.add(B());
            ru0 ru0Var = this.a;
            if (ru0Var.e()) {
                return;
            } else {
                iB = ru0Var.B();
            }
        } while (iB == this.b);
        this.d = iB;
    }

    @Override // o.o36
    public final void H(List list, bj6 bj6Var, cg2 cg2Var) throws qm3 {
        int iB;
        int i = this.b;
        if ((i & 7) != 3) {
            throw qm3.b();
        }
        do {
            list.add(M(bj6Var, cg2Var));
            ru0 ru0Var = this.a;
            if (ru0Var.e() || this.d != 0) {
                return;
            } else {
                iB = ru0Var.B();
            }
        } while (iB == i);
        this.d = iB;
    }

    @Override // o.o36
    public final void I(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof n32;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(ru0Var.H())));
                    if (ru0Var.e()) {
                        return;
                    } else {
                        iB = ru0Var.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (i2 != 2) {
                throw qm3.b();
            }
            int I = ru0Var.I();
            S(I);
            int iD = ru0Var.d() + I;
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(ru0Var.H())));
            } while (ru0Var.d() < iD);
            return;
        }
        n32 n32Var = (n32) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                n32Var.b(Double.longBitsToDouble(ru0Var.H()));
                if (ru0Var.e()) {
                    return;
                } else {
                    iB2 = ru0Var.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (i3 != 2) {
            throw qm3.b();
        }
        int I2 = ru0Var.I();
        S(I2);
        int iD2 = ru0Var.d() + I2;
        do {
            n32Var.b(Double.longBitsToDouble(ru0Var.H()));
        } while (ru0Var.d() < iD2);
    }

    @Override // o.o36
    public final long J() throws qm3.a {
        Q(0);
        return this.a.J();
    }

    @Override // o.o36
    public final String K() throws qm3 {
        Q(2);
        ru0 ru0Var = this.a;
        int I = ru0Var.I();
        if (I > 0) {
            int i = ru0Var.p;
            int i2 = ru0Var.r;
            if (I <= i - i2) {
                String strJ = ha8.a.j(ru0Var.f1952o, i2, I);
                ru0Var.r += I;
                return strJ;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I <= 0) {
            throw qm3.c();
        }
        throw qm3.e();
    }

    @Override // o.o36
    public final void L(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof wf4;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(ru0Var.H()));
                    if (ru0Var.e()) {
                        return;
                    } else {
                        iB = ru0Var.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (i2 != 2) {
                throw qm3.b();
            }
            int I = ru0Var.I();
            S(I);
            int iD = ru0Var.d() + I;
            do {
                list.add(Long.valueOf(ru0Var.H()));
            } while (ru0Var.d() < iD);
            return;
        }
        wf4 wf4Var = (wf4) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                wf4Var.b(ru0Var.H());
                if (ru0Var.e()) {
                    return;
                } else {
                    iB2 = ru0Var.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (i3 != 2) {
            throw qm3.b();
        }
        int I2 = ru0Var.I();
        S(I2);
        int iD2 = ru0Var.d() + I2;
        do {
            wf4Var.b(ru0Var.H());
        } while (ru0Var.d() < iD2);
    }

    public final Object M(bj6 bj6Var, cg2 cg2Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object objC = bj6Var.c();
            bj6Var.g(objC, this, cg2Var);
            bj6Var.a(objC);
            if (this.b != this.c) {
                throw qm3.d();
            }
            this.c = i;
            return objC;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final Object N(bj6 bj6Var, cg2 cg2Var) throws qm3 {
        ru0 ru0Var = this.a;
        int I = ru0Var.I();
        if (ru0Var.m >= 100) {
            throw new qm3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iK = ru0Var.k(I);
        Object objC = bj6Var.c();
        ru0Var.m++;
        bj6Var.g(objC, this, cg2Var);
        bj6Var.a(objC);
        if (ru0Var.t != 0) {
            throw new qm3("Protocol message end-group tag did not match expected tag.");
        }
        ru0Var.m--;
        ru0Var.u = iK;
        ru0Var.L();
        return objC;
    }

    public final void O(List list, boolean z) throws qm3 {
        int iB;
        int iB2;
        if ((this.b & 7) != 2) {
            throw qm3.b();
        }
        boolean z2 = list instanceof h54;
        ru0 ru0Var = this.a;
        if (!z2 || z) {
            do {
                list.add(z ? K() : x());
                if (ru0Var.e()) {
                    return;
                } else {
                    iB = ru0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        h54 h54Var = (h54) list;
        do {
            h54Var.Y(B());
            if (ru0Var.e()) {
                return;
            } else {
                iB2 = ru0Var.B();
            }
        } while (iB2 == this.b);
        this.d = iB2;
    }

    public final void P(int i) throws qm3 {
        if (this.a.d() != i) {
            throw qm3.e();
        }
    }

    public final void Q(int i) throws qm3.a {
        if ((this.b & 7) != i) {
            throw qm3.b();
        }
    }

    @Override // o.o36
    public final void a(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof nk3;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(uu0.b(ru0Var.I())));
                    if (ru0Var.e()) {
                        return;
                    } else {
                        iB = ru0Var.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (i2 != 2) {
                throw qm3.b();
            }
            int iD = ru0Var.d() + ru0Var.I();
            do {
                list.add(Integer.valueOf(uu0.b(ru0Var.I())));
            } while (ru0Var.d() < iD);
            P(iD);
            return;
        }
        nk3 nk3Var = (nk3) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                nk3Var.b(uu0.b(ru0Var.I()));
                if (ru0Var.e()) {
                    return;
                } else {
                    iB2 = ru0Var.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (i3 != 2) {
            throw qm3.b();
        }
        int iD2 = ru0Var.d() + ru0Var.I();
        do {
            nk3Var.b(uu0.b(ru0Var.I()));
        } while (ru0Var.d() < iD2);
        P(iD2);
    }

    @Override // o.o36
    public final Object b(bj6 bj6Var, cg2 cg2Var) throws qm3.a {
        Q(3);
        return M(bj6Var, cg2Var);
    }

    @Override // o.o36
    public final long c() throws qm3.a {
        Q(0);
        return this.a.J();
    }

    @Override // o.o36
    public final long d() throws qm3.a {
        Q(1);
        return this.a.H();
    }

    @Override // o.o36
    public final void e(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof nk3;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int I = ru0Var.I();
                R(I);
                int iD = ru0Var.d() + I;
                do {
                    list.add(Integer.valueOf(ru0Var.G()));
                } while (ru0Var.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw qm3.b();
            }
            do {
                list.add(Integer.valueOf(ru0Var.G()));
                if (ru0Var.e()) {
                    return;
                } else {
                    iB = ru0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        nk3 nk3Var = (nk3) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int I2 = ru0Var.I();
            R(I2);
            int iD2 = ru0Var.d() + I2;
            do {
                nk3Var.b(ru0Var.G());
            } while (ru0Var.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw qm3.b();
        }
        do {
            nk3Var.b(ru0Var.G());
            if (ru0Var.e()) {
                return;
            } else {
                iB2 = ru0Var.B();
            }
        } while (iB2 == this.b);
        this.d = iB2;
    }

    @Override // o.o36
    public final void f(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof wf4;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(uu0.c(ru0Var.J())));
                    if (ru0Var.e()) {
                        return;
                    } else {
                        iB = ru0Var.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (i2 != 2) {
                throw qm3.b();
            }
            int iD = ru0Var.d() + ru0Var.I();
            do {
                list.add(Long.valueOf(uu0.c(ru0Var.J())));
            } while (ru0Var.d() < iD);
            P(iD);
            return;
        }
        wf4 wf4Var = (wf4) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                wf4Var.b(uu0.c(ru0Var.J()));
                if (ru0Var.e()) {
                    return;
                } else {
                    iB2 = ru0Var.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (i3 != 2) {
            throw qm3.b();
        }
        int iD2 = ru0Var.d() + ru0Var.I();
        do {
            wf4Var.b(uu0.c(ru0Var.J()));
        } while (ru0Var.d() < iD2);
        P(iD2);
    }

    @Override // o.o36
    public final Object g(bj6 bj6Var, cg2 cg2Var) throws qm3.a {
        Q(2);
        return N(bj6Var, cg2Var);
    }

    @Override // o.o36
    public final void h(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof nk3;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(ru0Var.I()));
                    if (ru0Var.e()) {
                        return;
                    } else {
                        iB = ru0Var.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (i2 != 2) {
                throw qm3.b();
            }
            int iD = ru0Var.d() + ru0Var.I();
            do {
                list.add(Integer.valueOf(ru0Var.I()));
            } while (ru0Var.d() < iD);
            P(iD);
            return;
        }
        nk3 nk3Var = (nk3) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                nk3Var.b(ru0Var.I());
                if (ru0Var.e()) {
                    return;
                } else {
                    iB2 = ru0Var.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (i3 != 2) {
            throw qm3.b();
        }
        int iD2 = ru0Var.d() + ru0Var.I();
        do {
            nk3Var.b(ru0Var.I());
        } while (ru0Var.d() < iD2);
        P(iD2);
    }

    @Override // o.o36
    public final int i() throws qm3.a {
        Q(5);
        return this.a.G();
    }

    @Override // o.o36
    public final boolean j() throws qm3.a {
        Q(0);
        return this.a.l();
    }

    @Override // o.o36
    public final long k() throws qm3.a {
        Q(1);
        return this.a.H();
    }

    @Override // o.o36
    public final void l(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof wf4;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(ru0Var.J()));
                    if (ru0Var.e()) {
                        return;
                    } else {
                        iB = ru0Var.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (i2 != 2) {
                throw qm3.b();
            }
            int iD = ru0Var.d() + ru0Var.I();
            do {
                list.add(Long.valueOf(ru0Var.J()));
            } while (ru0Var.d() < iD);
            P(iD);
            return;
        }
        wf4 wf4Var = (wf4) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                wf4Var.b(ru0Var.J());
                if (ru0Var.e()) {
                    return;
                } else {
                    iB2 = ru0Var.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (i3 != 2) {
            throw qm3.b();
        }
        int iD2 = ru0Var.d() + ru0Var.I();
        do {
            wf4Var.b(ru0Var.J());
        } while (ru0Var.d() < iD2);
        P(iD2);
    }

    @Override // o.o36
    public final int m() throws qm3.a {
        Q(0);
        return this.a.I();
    }

    @Override // o.o36
    public final void n(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof wf4;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(ru0Var.J()));
                    if (ru0Var.e()) {
                        return;
                    } else {
                        iB = ru0Var.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (i2 != 2) {
                throw qm3.b();
            }
            int iD = ru0Var.d() + ru0Var.I();
            do {
                list.add(Long.valueOf(ru0Var.J()));
            } while (ru0Var.d() < iD);
            P(iD);
            return;
        }
        wf4 wf4Var = (wf4) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                wf4Var.b(ru0Var.J());
                if (ru0Var.e()) {
                    return;
                } else {
                    iB2 = ru0Var.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (i3 != 2) {
            throw qm3.b();
        }
        int iD2 = ru0Var.d() + ru0Var.I();
        do {
            wf4Var.b(ru0Var.J());
        } while (ru0Var.d() < iD2);
        P(iD2);
    }

    @Override // o.o36
    public final void o(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof wf4;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(ru0Var.H()));
                    if (ru0Var.e()) {
                        return;
                    } else {
                        iB = ru0Var.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (i2 != 2) {
                throw qm3.b();
            }
            int I = ru0Var.I();
            S(I);
            int iD = ru0Var.d() + I;
            do {
                list.add(Long.valueOf(ru0Var.H()));
            } while (ru0Var.d() < iD);
            return;
        }
        wf4 wf4Var = (wf4) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                wf4Var.b(ru0Var.H());
                if (ru0Var.e()) {
                    return;
                } else {
                    iB2 = ru0Var.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (i3 != 2) {
            throw qm3.b();
        }
        int I2 = ru0Var.I();
        S(I2);
        int iD2 = ru0Var.d() + I2;
        do {
            wf4Var.b(ru0Var.H());
        } while (ru0Var.d() < iD2);
    }

    @Override // o.o36
    public final void p(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof nk3;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(ru0Var.I()));
                    if (ru0Var.e()) {
                        return;
                    } else {
                        iB = ru0Var.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (i2 != 2) {
                throw qm3.b();
            }
            int iD = ru0Var.d() + ru0Var.I();
            do {
                list.add(Integer.valueOf(ru0Var.I()));
            } while (ru0Var.d() < iD);
            P(iD);
            return;
        }
        nk3 nk3Var = (nk3) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                nk3Var.b(ru0Var.I());
                if (ru0Var.e()) {
                    return;
                } else {
                    iB2 = ru0Var.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (i3 != 2) {
            throw qm3.b();
        }
        int iD2 = ru0Var.d() + ru0Var.I();
        do {
            nk3Var.b(ru0Var.I());
        } while (ru0Var.d() < iD2);
        P(iD2);
    }

    @Override // o.o36
    public final void q(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof nk3;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(ru0Var.I()));
                    if (ru0Var.e()) {
                        return;
                    } else {
                        iB = ru0Var.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (i2 != 2) {
                throw qm3.b();
            }
            int iD = ru0Var.d() + ru0Var.I();
            do {
                list.add(Integer.valueOf(ru0Var.I()));
            } while (ru0Var.d() < iD);
            P(iD);
            return;
        }
        nk3 nk3Var = (nk3) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                nk3Var.b(ru0Var.I());
                if (ru0Var.e()) {
                    return;
                } else {
                    iB2 = ru0Var.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (i3 != 2) {
            throw qm3.b();
        }
        int iD2 = ru0Var.d() + ru0Var.I();
        do {
            nk3Var.b(ru0Var.I());
        } while (ru0Var.d() < iD2);
        P(iD2);
    }

    @Override // o.o36
    public final int r() throws qm3.a {
        Q(0);
        return this.a.I();
    }

    @Override // o.o36
    public final double readDouble() throws qm3.a {
        Q(1);
        return Double.longBitsToDouble(this.a.H());
    }

    @Override // o.o36
    public final float readFloat() throws qm3.a {
        Q(5);
        return Float.intBitsToFloat(this.a.G());
    }

    @Override // o.o36
    public final int s() {
        return this.b;
    }

    @Override // o.o36
    public final void t(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof nk3;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int I = ru0Var.I();
                R(I);
                int iD = ru0Var.d() + I;
                do {
                    list.add(Integer.valueOf(ru0Var.G()));
                } while (ru0Var.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw qm3.b();
            }
            do {
                list.add(Integer.valueOf(ru0Var.G()));
                if (ru0Var.e()) {
                    return;
                } else {
                    iB = ru0Var.B();
                }
            } while (iB == this.b);
            this.d = iB;
            return;
        }
        nk3 nk3Var = (nk3) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int I2 = ru0Var.I();
            R(I2);
            int iD2 = ru0Var.d() + I2;
            do {
                nk3Var.b(ru0Var.G());
            } while (ru0Var.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw qm3.b();
        }
        do {
            nk3Var.b(ru0Var.G());
            if (ru0Var.e()) {
                return;
            } else {
                iB2 = ru0Var.B();
            }
        } while (iB2 == this.b);
        this.d = iB2;
    }

    @Override // o.o36
    public final int u() throws qm3.a {
        Q(0);
        return uu0.b(this.a.I());
    }

    @Override // o.o36
    public final long v() throws qm3.a {
        Q(0);
        return uu0.c(this.a.J());
    }

    @Override // o.o36
    public final void w(List list) throws qm3 {
        int iB;
        int iB2;
        boolean z = list instanceof o80;
        int i = this.b;
        ru0 ru0Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(ru0Var.l()));
                    if (ru0Var.e()) {
                        return;
                    } else {
                        iB = ru0Var.B();
                    }
                } while (iB == this.b);
                this.d = iB;
                return;
            }
            if (i2 != 2) {
                throw qm3.b();
            }
            int iD = ru0Var.d() + ru0Var.I();
            do {
                list.add(Boolean.valueOf(ru0Var.l()));
            } while (ru0Var.d() < iD);
            P(iD);
            return;
        }
        o80 o80Var = (o80) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                o80Var.b(ru0Var.l());
                if (ru0Var.e()) {
                    return;
                } else {
                    iB2 = ru0Var.B();
                }
            } while (iB2 == this.b);
            this.d = iB2;
            return;
        }
        if (i3 != 2) {
            throw qm3.b();
        }
        int iD2 = ru0Var.d() + ru0Var.I();
        do {
            o80Var.b(ru0Var.l());
        } while (ru0Var.d() < iD2);
        P(iD2);
    }

    @Override // o.o36
    public final String x() throws qm3 {
        Q(2);
        ru0 ru0Var = this.a;
        int I = ru0Var.I();
        if (I > 0) {
            int i = ru0Var.p;
            int i2 = ru0Var.r;
            if (I <= i - i2) {
                String str = new String(ru0Var.f1952o, i2, I, sl3.a);
                ru0Var.r += I;
                return str;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I < 0) {
            throw qm3.c();
        }
        throw qm3.e();
    }

    @Override // o.o36
    public final int y() throws qm3 {
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

    @Override // o.o36
    public final void z(List list) throws qm3 {
        O(list, false);
    }
}
