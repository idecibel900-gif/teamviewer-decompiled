package o;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class sw0 extends p0 {
    public Function0 W;
    public boolean X;
    public final pw4 Y;
    public final pw4 Z;
    public in5 a0;
    public n87 b0;
    public n87 c0;
    public boolean d0;
    public boolean e0;
    public long f0;
    public boolean g0;
    public eh3 h0;
    public n87 i0;
    public n87 j0;
    public boolean k0;
    public boolean l0;
    public long m0;
    public boolean n0;

    public sw0(Function0 function0, Function0 function1, mw4 mw4Var, boolean z) {
        super(mw4Var, null, z, true, null, null, function0);
        this.W = function1;
        this.X = true;
        int i = yf4.a;
        this.Y = new pw4(6);
        this.Z = new pw4(6);
        this.f0 = -1L;
        this.m0 = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.p0, o.ln5
    public final void D0(bn5 bn5Var, cn5 cn5Var, long j) {
        super.D0(bn5Var, cn5Var, j);
        Object[] objArr = 0;
        if (cn5Var != cn5.n) {
            if (cn5Var != cn5.f544o || this.a0 == null || this.e0) {
                return;
            }
            List list = bn5Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                in5 in5Var = (in5) list.get(i);
                if (in5Var.c() && in5Var != this.a0) {
                    l1(false);
                    return;
                }
            }
            return;
        }
        hc1 hc1Var = null;
        if (this.a0 == null) {
            if (un7.e(bn5Var, true)) {
                in5 in5Var2 = (in5) bn5Var.a.get(0);
                in5Var2.a();
                this.a0 = in5Var2;
                if (this.H) {
                    n87 n87Var = this.c0;
                    if (n87Var != null && n87Var.e()) {
                        ((ee8) xk0.q(this, b11.t)).getClass();
                        if (in5Var2.b - this.f0 < 40) {
                            this.g0 = true;
                            return;
                        }
                        this.d0 = true;
                        n87 n87Var2 = this.c0;
                        if (n87Var2 != null) {
                            n87Var2.j(null);
                        }
                        this.c0 = null;
                    }
                    this.e0 = false;
                    e1(in5Var2);
                    if (this.W != null) {
                        this.b0 = im3.R(I0(), null, null, new rw0(this, hc1Var, objArr == true ? 1 : 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Object[] objArr2 = bn5Var.c == 2;
        List list2 = bn5Var.a;
        if (objArr2 != false && !this.e0 && this.H && this.W != null) {
            n87 n87Var3 = this.b0;
            if (n87Var3 != null) {
                n87Var3.j(null);
            }
            this.b0 = null;
            Function0 function0 = this.W;
            if (function0 != null) {
                function0.a();
            }
            if (this.X) {
                ((tl5) ((v43) xk0.q(this, b11.l))).a(0);
            }
            this.e0 = true;
        }
        if (this.e0) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!qs1.F((in5) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((in5) list2.get(i3)).a();
                    }
                    return;
                }
            }
            in5 in5Var3 = (in5) list2.get(0);
            in5Var3.a();
            long j2 = in5Var3.b;
            in5 in5Var4 = this.a0;
            in5Var4.getClass();
            n1(j2, in5Var4);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!qs1.E((in5) list2.get(i4))) {
                long jA1 = a1(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    in5 in5Var5 = (in5) list2.get(i5);
                    if (in5Var5.c() || qs1.R(in5Var5, j, jA1)) {
                        l1(false);
                        return;
                    }
                }
                return;
            }
        }
        in5 in5Var6 = (in5) list2.get(0);
        in5Var6.a();
        long j3 = in5Var6.b;
        in5 in5Var7 = this.a0;
        in5Var7.getClass();
        n1(j3, in5Var7);
    }

    @Override // o.ln5
    public final void E() {
        j63 j63Var;
        mw4 mw4Var = this.C;
        if (mw4Var != null && (j63Var = this.P) != null) {
            mw4Var.b(new k63(j63Var));
        }
        this.P = null;
        l1(false);
    }

    @Override // o.es4
    public final void O0() {
        o1();
    }

    @Override // o.p0
    public final void X0(op6 op6Var) {
        if (this.W != null) {
            y yVar = new y(this, (byte) 27);
            fw3[] fw3VarArr = lp6.a;
            op6Var.d(zo6.c, new m3(null, yVar));
        }
    }

    @Override // o.mh3
    public final void e0() {
        l1(true);
    }

    @Override // o.p0
    public final void g1() {
        o1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // o.p0
    public final boolean h1(KeyEvent keyEvent) {
        boolean z;
        long jB = yo1.B(keyEvent);
        hc1 hc1Var = null;
        if (this.W != null) {
            pw4 pw4Var = this.Y;
            if (pw4Var.d(jB) == null) {
                pw4Var.g(jB, im3.R(I0(), null, null, new rw0(this, hc1Var, (byte) 2), 3));
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // o.p0
    public final void i1(KeyEvent keyEvent) {
        long jB = yo1.B(keyEvent);
        pw4 pw4Var = this.Y;
        boolean z = false;
        if (pw4Var.d(jB) != null) {
            bp3 bp3Var = (bp3) pw4Var.d(jB);
            if (bp3Var != null) {
                if (bp3Var.e()) {
                    bp3Var.j(null);
                } else {
                    z = true;
                }
            }
            pw4Var.f(jB);
        }
        if (z) {
            return;
        }
        j1();
    }

    @Override // o.mh3
    public final void j0(ae aeVar, cn5 cn5Var) {
        ArrayList arrayList = (ArrayList) aeVar.c;
        f1();
        if (this.H && this.L == null) {
            az2 az2Var = new az2(this);
            U0(az2Var);
            this.L = az2Var;
        }
        byte b = 1;
        int i = 0;
        if (cn5Var != cn5.n) {
            if (cn5Var != cn5.f544o || this.h0 == null || this.l0) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                eh3 eh3Var = (eh3) arrayList.get(i);
                if (eh3Var.i && eh3Var != this.h0) {
                    l1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.h0 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (zu1.n((eh3) arrayList.get(i2))) {
                    eh3 eh3Var2 = (eh3) arrayList.get(0);
                    eh3Var2.i = true;
                    this.h0 = eh3Var2;
                    if (this.H) {
                        n87 n87Var = this.j0;
                        hc1 hc1Var = null;
                        if (n87Var != null && n87Var.e()) {
                            ((ee8) xk0.q(this, b11.t)).getClass();
                            if (eh3Var2.b - this.m0 < 40) {
                                this.n0 = true;
                                return;
                            }
                            this.k0 = true;
                            n87 n87Var2 = this.j0;
                            if (n87Var2 != null) {
                                n87Var2.j(null);
                            }
                            this.j0 = null;
                        }
                        this.l0 = false;
                        d1(eh3Var2);
                        if (this.W != null) {
                            this.i0 = im3.R(I0(), null, null, new rw0(this, hc1Var, b), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.l0) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                eh3 eh3Var3 = (eh3) arrayList.get(i3);
                if (!eh3Var3.h || eh3Var3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((eh3) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            eh3 eh3Var4 = (eh3) arrayList.get(0);
            eh3Var4.i = true;
            long j = eh3Var4.b;
            eh3 eh3Var5 = this.h0;
            eh3Var5.getClass();
            m1(j, eh3Var5);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            eh3 eh3Var6 = (eh3) arrayList.get(i4);
            if (eh3Var6.i || !eh3Var6.h || eh3Var6.d) {
                float f = ((ee8) xk0.q(this, b11.t)).f();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    eh3 eh3Var7 = (eh3) arrayList.get(i5);
                    long j2 = eh3Var7.c;
                    eh3 eh3Var8 = this.h0;
                    eh3Var8.getClass();
                    boolean z = Math.abs(t65.c(t65.d(j2, eh3Var8.c))) > f;
                    if (eh3Var7.i || z) {
                        l1(true);
                        return;
                    }
                }
                return;
            }
        }
        eh3 eh3Var9 = (eh3) arrayList.get(0);
        eh3Var9.i = true;
        long j3 = eh3Var9.b;
        eh3 eh3Var10 = this.h0;
        eh3Var10.getClass();
        m1(j3, eh3Var10);
    }

    public final void l1(boolean z) {
        if (z) {
            this.h0 = null;
            n87 n87Var = this.i0;
            if (n87Var != null) {
                n87Var.j(null);
            }
            this.i0 = null;
            n87 n87Var2 = this.j0;
            if (n87Var2 != null) {
                n87Var2.j(null);
            }
            this.j0 = null;
            this.k0 = false;
            this.l0 = false;
            this.m0 = -1L;
            this.n0 = false;
        } else {
            this.a0 = null;
            n87 n87Var3 = this.b0;
            if (n87Var3 != null) {
                n87Var3.j(null);
            }
            this.b0 = null;
            n87 n87Var4 = this.c0;
            if (n87Var4 != null) {
                n87Var4.j(null);
            }
            this.c0 = null;
            this.d0 = false;
            this.e0 = false;
            this.f0 = -1L;
            this.g0 = false;
        }
        b1(z);
    }

    public final void m1(long j, eh3 eh3Var) {
        if (this.H && !this.n0) {
            c1(eh3Var.c, true);
            this.m0 = j;
            if (!this.l0 && !this.k0) {
                j1();
            }
        }
        this.h0 = null;
        this.n0 = false;
        this.k0 = false;
        n87 n87Var = this.i0;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.i0 = null;
        this.l0 = false;
    }

    public final void n1(long j, in5 in5Var) {
        if (this.H && !this.g0) {
            c1(in5Var.c, false);
            this.f0 = j;
            if (!this.e0 && !this.d0) {
                j1();
            }
        }
        this.a0 = null;
        this.g0 = false;
        this.d0 = false;
        n87 n87Var = this.b0;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.b0 = null;
        this.e0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    public final void o1() {
        char c;
        long j;
        long j2;
        pw4 pw4Var = this.Y;
        Object[] objArr = pw4Var.c;
        long[] jArr = pw4Var.a;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((bp3) objArr[(i << 3) + i3]).j(null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        pw4Var.a();
        pw4 pw4Var2 = this.Z;
        Object[] objArr2 = pw4Var2.c;
        long[] jArr2 = pw4Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((qw0) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        pw4Var2.a();
    }
}
