package o;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends vm1 implements ln5, kx3, dp6, v01, o65, mh3, zy2 {
    public mw4 C;
    public xg3 D;
    public boolean E;
    public String F;
    public pe6 G;
    public boolean H;
    public Function0 I;
    public final fr2 J;
    public xg3 K;
    public az2 L;
    public String M = "idle";
    public um1 N;
    public yr5 O;
    public j63 P;
    public final pw4 Q;
    public long R;
    public yr5 S;
    public mw4 T;
    public boolean U;
    public n87 V;

    public p0(mw4 mw4Var, xg3 xg3Var, boolean z, boolean z2, String str, pe6 pe6Var, Function0 function0) {
        this.C = mw4Var;
        this.D = xg3Var;
        this.E = z;
        this.F = str;
        this.G = pe6Var;
        this.H = z2;
        this.I = function0;
        this.J = new fr2(mw4Var, 0, new i0(1, this, p0.class, "onFocusChange", "onFocusChange(Z)V", 0, (byte) 0));
        int i = yf4.a;
        this.Q = new pw4(6);
        this.R = 0L;
        mw4 mw4Var2 = this.C;
        this.T = mw4Var2;
        this.U = mw4Var2 == null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.kx3
    public final boolean A(KeyEvent keyEvent) {
        boolean z;
        f1();
        long jB = yo1.B(keyEvent);
        boolean z2 = this.H;
        byte b = 3;
        hc1 hc1Var = null;
        pw4 pw4Var = this.Q;
        if (z2) {
            byte b2 = 2;
            if (yo1.F(keyEvent) == 2 && androidx.compose.foundation.b.e(keyEvent)) {
                if (pw4Var.b(jB)) {
                    z = false;
                } else {
                    yr5 yr5Var = new yr5(this.R);
                    pw4Var.g(jB, yr5Var);
                    if (this.C != null) {
                        im3.R(I0(), null, null, new n0(this, yr5Var, hc1Var, b2), 3);
                    }
                    z = true;
                }
                if (h1(keyEvent) || z) {
                    return true;
                }
                return false;
            }
        }
        if (this.H && yo1.F(keyEvent) == 1 && androidx.compose.foundation.b.e(keyEvent)) {
            yr5 yr5Var2 = (yr5) pw4Var.f(jB);
            if (yr5Var2 != null) {
                if (this.C != null) {
                    im3.R(I0(), null, null, new n0(this, yr5Var2, hc1Var, b), 3);
                }
                i1(keyEvent);
            }
            if (yr5Var2 != null) {
                return true;
            }
        }
        return false;
    }

    public void D0(bn5 bn5Var, cn5 cn5Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.R = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        f1();
        if (this.H) {
            if (this.L == null) {
                az2 az2Var = new az2(this);
                U0(az2Var);
                this.L = az2Var;
            }
            if (cn5Var == cn5.n) {
                int i = bn5Var.f;
                hc1 hc1Var = null;
                if (i == 4) {
                    im3.R(I0(), null, null, new o0(this, hc1Var, (byte) 0), 3);
                } else if (i == 5) {
                    im3.R(I0(), null, null, new o0(this, hc1Var, (byte) 1), 3);
                }
            }
        }
    }

    @Override // o.dp6
    public final boolean F0() {
        return true;
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void M0() {
        n0();
        if (!this.U) {
            f1();
        }
        if (this.H) {
            U0(this.J);
        }
    }

    @Override // o.zy2
    public final String N() {
        return this.M;
    }

    @Override // o.es4
    public final void N0() {
        Z0();
        if (this.T == null) {
            this.C = null;
        }
        um1 um1Var = this.N;
        if (um1Var != null) {
            V0(um1Var);
        }
        this.N = null;
        az2 az2Var = this.L;
        if (az2Var != null) {
            V0(az2Var);
        }
        this.L = null;
    }

    public void X0(op6 op6Var) {
    }

    public final boolean Y0() {
        k76 k76Var = new k76();
        g57.p(this, az2.B, new jb(new jg(k76Var, (byte) 1), (byte) 2));
        if (k76Var.m == null) {
            int i = lt0.b;
            ViewParent parent = e8.y(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void Z0() {
        mw4 mw4Var = this.C;
        pw4 pw4Var = this.Q;
        if (mw4Var != null) {
            yr5 yr5Var = this.O;
            if (yr5Var != null) {
                mw4Var.b(new xr5(yr5Var));
            }
            yr5 yr5Var2 = this.S;
            if (yr5Var2 != null) {
                mw4Var.b(new xr5(yr5Var2));
            }
            j63 j63Var = this.P;
            if (j63Var != null) {
                mw4Var.b(new k63(j63Var));
            }
            Object[] objArr = pw4Var.c;
            long[] jArr = pw4Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                mw4Var.b(new xr5((yr5) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.O = null;
        this.S = null;
        this.P = null;
        pw4Var.a();
    }

    public final long a1(long j) {
        long jW0 = vn4.p0(this).L.w0(((ee8) xk0.q(this, b11.t)).d());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jW0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jW0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void b1(boolean z) {
        mw4 mw4Var = this.C;
        if (mw4Var != null) {
            n87 n87Var = this.V;
            hc1 hc1Var = null;
            if (n87Var == null || !n87Var.e()) {
                yr5 yr5Var = z ? this.S : this.O;
                if (yr5Var != null) {
                    xr5 xr5Var = new xr5(yr5Var);
                    bp3 bp3Var = (bp3) ((fc1) I0()).m.l0(z06.z);
                    im3.R(I0(), null, null, new j0((Object) mw4Var, (Object) xr5Var, (Object) (bp3Var != null ? bp3Var.o0(new g0(mw4Var, xr5Var, (byte) 0)) : null), hc1Var, (byte) 0), 3);
                }
            } else {
                n87 n87Var2 = this.V;
                if (n87Var2 != null) {
                    n87Var2.j(null);
                }
            }
            if (z) {
                this.S = null;
            } else {
                this.O = null;
            }
        }
    }

    public final void c1(long j, boolean z) {
        mw4 mw4Var = this.C;
        if (mw4Var != null) {
            n87 n87Var = this.V;
            if (n87Var == null || !n87Var.e()) {
                yr5 yr5Var = z ? this.S : this.O;
                if (yr5Var != null) {
                    im3.R(I0(), null, null, new l0(yr5Var, mw4Var, null), 3);
                }
            } else {
                n87Var.j(null);
                im3.R(I0(), null, null, new k0((Object) n87Var, j, mw4Var, (hc1) null, (byte) 0), 3);
            }
            if (z) {
                this.S = null;
            } else {
                this.O = null;
            }
        }
    }

    public final void d1(eh3 eh3Var) {
        mw4 mw4Var = this.C;
        if (mw4Var != null) {
            yr5 yr5Var = new yr5(eh3Var.c);
            hc1 hc1Var = null;
            if (Y0()) {
                this.V = im3.R(I0(), null, null, new m0(mw4Var, yr5Var, this, hc1Var, (byte) 0), 3);
            } else {
                this.S = yr5Var;
                im3.R(I0(), null, null, new l0(mw4Var, yr5Var, hc1Var, (byte) 1), 3);
            }
        }
    }

    public final void e1(in5 in5Var) {
        mw4 mw4Var = this.C;
        if (mw4Var != null) {
            yr5 yr5Var = new yr5(in5Var.c);
            hc1 hc1Var = null;
            if (Y0()) {
                this.V = im3.R(I0(), null, null, new m0(mw4Var, yr5Var, this, hc1Var, (byte) 1), 3);
            } else {
                this.O = yr5Var;
                im3.R(I0(), null, null, new l0(mw4Var, yr5Var, hc1Var, (byte) 2), 3);
            }
        }
    }

    public final void f1() {
        if (this.N != null) {
            return;
        }
        xg3 xg3Var = this.E ? this.K : this.D;
        if (xg3Var != null) {
            mw4 mw4Var = this.C;
            if (mw4Var == null) {
                mw4Var = new mw4();
                this.C = mw4Var;
            }
            this.J.Y0(mw4Var);
            mw4 mw4Var2 = this.C;
            mw4Var2.getClass();
            um1 um1VarA = xg3Var.a(mw4Var2);
            U0(um1VarA);
            this.N = um1VarA;
        }
    }

    public void g1() {
    }

    @Override // o.kx3
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }

    public boolean h1(KeyEvent keyEvent) {
        return false;
    }

    public void i1(KeyEvent keyEvent) {
        j1();
    }

    public final void j1() {
        p67 p67Var = (p67) xk0.q(this, b11.v);
        if (p67Var != null) {
            p67Var.a();
        }
        this.I.a();
    }

    public final void k1(mw4 mw4Var, xg3 xg3Var, boolean z, boolean z2, String str, pe6 pe6Var, Function0 function0) {
        boolean z3;
        boolean z4;
        um1 um1Var;
        boolean z5 = true;
        if (im3.n(this.T, mw4Var)) {
            z3 = false;
        } else {
            Z0();
            this.T = mw4Var;
            this.C = mw4Var;
            z3 = true;
        }
        if (!im3.n(this.D, xg3Var)) {
            this.D = xg3Var;
            z3 = true;
        }
        if (this.E != z) {
            this.E = z;
            if (z) {
                n0();
            }
            z3 = true;
        }
        boolean z6 = this.H;
        fr2 fr2Var = this.J;
        if (z6 != z2) {
            if (z2) {
                U0(fr2Var);
            } else {
                V0(fr2Var);
                Z0();
            }
            vn4.p0(this).U();
            if (!z2) {
                um1 um1Var2 = this.L;
                if (um1Var2 != null) {
                    V0(um1Var2);
                }
                this.L = null;
                this.M = "idle";
            }
            this.H = z2;
        }
        if (!im3.n(this.F, str)) {
            this.F = str;
            vn4.p0(this).U();
        }
        if (!im3.n(this.G, pe6Var)) {
            this.G = pe6Var;
            vn4.p0(this).U();
        }
        this.I = function0;
        boolean z7 = this.U;
        mw4 mw4Var2 = this.T;
        if (z7 == (mw4Var2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = mw4Var2 == null;
            this.U = z4;
            if (z4 || this.N != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((um1Var = this.N) != null || !z4)) {
            if (um1Var != null) {
                V0(um1Var);
            }
            this.N = null;
            f1();
        }
        fr2Var.Y0(this.C);
    }

    @Override // o.o65
    public final void n0() {
        if (this.E) {
            bt1.J(this, new f0(this, (byte) 0));
        }
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        pe6 pe6Var = this.G;
        if (pe6Var != null) {
            lp6.i(op6Var, pe6Var.a);
        }
        String str = this.F;
        f0 f0Var = new f0(this, (byte) 1);
        fw3[] fw3VarArr = lp6.a;
        op6Var.d(zo6.b, new m3(str, f0Var));
        if (this.H) {
            this.J.z(op6Var);
        } else {
            op6Var.d(kp6.j, f88.a);
        }
        X0(op6Var);
    }
}
