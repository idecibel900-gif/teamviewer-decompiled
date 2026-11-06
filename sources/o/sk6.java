package o;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sk6 extends e52 implements kx3, dp6 {
    public final x15 V;
    public t0 W;
    public s2 X;
    public boolean Y;
    public boolean Z;
    public nu4 a0;
    public u08 b0;
    public final zj1 c0;
    public final yk6 d0;
    public final qk6 e0;
    public final br2 f0;
    public final cb1 g0;

    public sk6(li liVar, nb0 nb0Var, ym2 ym2Var, mw4 mw4Var, gb5 gb5Var, tk6 tk6Var, boolean z, boolean z2) {
        super(ka0.a, z, mw4Var, gb5Var);
        this.V = new x15();
        zj1 zj1Var = new zj1(new ei1(new l07(ok6.c)));
        this.c0 = zj1Var;
        yk6 yk6Var = new yk6(tk6Var, liVar, ym2Var == null ? zj1Var : ym2Var, gb5Var, z2, this.V, this, new rk6(this, (byte) 0));
        this.d0 = yk6Var;
        qk6 qk6Var = new qk6(yk6Var, z);
        this.e0 = qk6Var;
        br2 br2Var = new br2(2, null, 10);
        U0(br2Var);
        this.f0 = br2Var;
        cb1 cb1Var = new cb1(gb5Var, yk6Var, z2, nb0Var, new rk6(this, (byte) 1));
        U0(cb1Var);
        this.g0 = cb1Var;
        U0(new b25(qk6Var, this.V));
        kb0 kb0Var = new kb0();
        kb0Var.A = cb1Var;
        U0(kb0Var);
    }

    @Override // o.kx3
    public final boolean A(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.E || ((!xw3.a(yo1.B(keyEvent), xw3.D) && !xw3.a(qs1.m(keyEvent.getKeyCode()), xw3.C)) || yo1.F(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.d0.d == gb5.m;
        cb1 cb1Var = this.g0;
        if (z) {
            int iV0 = (int) (cb1Var.V0() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(xw3.a(qs1.m(keyEvent.getKeyCode()), xw3.C) ? iV0 : -iV0)));
        } else {
            int iV1 = (int) (cb1Var.V0() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(xw3.a(qs1.m(keyEvent.getKeyCode()), xw3.C) ? iV1 : -iV1)) << 32);
        }
        im3.R(I0(), null, null, new s2(this, jFloatToRawIntBits, null, (byte) 1), 3);
        return true;
    }

    @Override // o.e52, o.ln5
    public final void D0(bn5 bn5Var, cn5 cn5Var, long j) {
        boolean z;
        int i;
        List list = bn5Var.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Boolean) this.D.invoke(new sn5(((in5) list.get(i2)).i))).booleanValue()) {
                super.D0(bn5Var, cn5Var, j);
                break;
            }
        }
        if (this.E) {
            if (this.M == null) {
                az2 az2Var = new az2(this);
                U0(az2Var);
                this.M = az2Var;
            }
            hc1 hc1Var = null;
            byte b = 12;
            cn5 cn5Var2 = cn5.m;
            if (cn5Var == cn5Var2 && bn5Var.f == 6) {
                if (this.Y) {
                    z = true;
                } else {
                    z = true;
                    this.a0 = new nu4(this.d0, new df6(ViewConfiguration.get(e8.y(this).getContext()), b), new xy0(2, this, sk6.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, (byte) 1), vn4.p0(this).L);
                    this.Y = true;
                }
                nu4 nu4Var = this.a0;
                if (nu4Var != null) {
                    me1 me1VarI0 = I0();
                    if (nu4Var.h == null) {
                        nu4Var.h = im3.R(me1VarI0, null, null, new ff(nu4Var, hc1Var, (byte) 8), 3);
                    }
                }
            } else {
                z = true;
            }
            nu4 nu4Var2 = this.a0;
            cn5 cn5Var3 = cn5.n;
            if (nu4Var2 != null && bn5Var.f == 6) {
                List list2 = bn5Var.a;
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        if (cn5Var == cn5Var2 && nu4Var2.d) {
                            nu4Var2.f(bn5Var);
                            u45.a(bn5Var);
                        }
                        if (cn5Var != cn5Var3 || nu4Var2.d || !nu4Var2.f(bn5Var)) {
                            break;
                            break;
                            break;
                        } else {
                            u45.a(bn5Var);
                            break;
                        }
                    }
                    if (((in5) list2.get(i3)).c()) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (cn5Var == cn5Var2 && ((i = bn5Var.f) == 10 || i == 11 || i == 12)) {
                if (!this.Z) {
                    this.b0 = new u08(this.d0, new xy0(2, this, sk6.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, (byte) 2), vn4.p0(this).L);
                    this.Z = z;
                }
                u08 u08Var = this.b0;
                if (u08Var != null) {
                    me1 me1VarI1 = I0();
                    if (u08Var.g == null) {
                        u08Var.g = im3.R(me1VarI1, null, null, new tb(u08Var, hc1Var, (byte) 9), 3);
                    }
                }
            }
            u08 u08Var2 = this.b0;
            if (u08Var2 != null) {
                int i4 = bn5Var.f;
                if (i4 == 10 || i4 == 11 || i4 == 12) {
                    List list3 = bn5Var.a;
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (((in5) list3.get(i5)).c()) {
                            return;
                        }
                    }
                    if (cn5Var == cn5Var2 && u08Var2.d) {
                        u08Var2.d(bn5Var);
                        u45.a(bn5Var);
                    }
                    if (cn5Var == cn5Var3 && !u08Var2.d && u08Var2.d(bn5Var)) {
                        u45.a(bn5Var);
                    }
                }
            }
        }
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void M0() {
        nu4 nu4Var = this.a0;
        if (nu4Var != null) {
            nu4Var.c = vn4.p0(this).L;
        }
        u08 u08Var = this.b0;
        if (u08Var != null) {
            u08Var.c = vn4.p0(this).L;
        }
        if (this.z) {
            in1 in1Var = vn4.p0(this).L;
            zj1 zj1Var = this.c0;
            zj1Var.getClass();
            zj1Var.a = new ei1(new l07(in1Var));
        }
    }

    @Override // o.e52
    public final Object Y0(bj bjVar, tb tbVar) {
        yk6 yk6Var = this.d0;
        Object objG = yk6Var.g(ay4.n, new ko2(bjVar, yk6Var, null, (byte) 17), tbVar);
        return objG == ne1.m ? objG : f88.a;
    }

    @Override // o.um1, o.ln5
    public final void c() {
        E();
        nu4 nu4Var = this.a0;
        if (nu4Var != null) {
            nu4Var.c = vn4.p0(this).L;
        }
        u08 u08Var = this.b0;
        if (u08Var != null) {
            u08Var.c = vn4.p0(this).L;
        }
        E();
        if (this.z) {
            in1 in1Var = vn4.p0(this).L;
            zj1 zj1Var = this.c0;
            zj1Var.getClass();
            zj1Var.a = new ei1(new l07(in1Var));
        }
    }

    @Override // o.e52
    public final void d1(long j) {
    }

    @Override // o.e52
    public final void e1(q42 q42Var) {
        if (this.z) {
            im3.R(this.V.c(), null, null, new vt4(q42Var, this, null, (byte) 15), 3);
        }
    }

    @Override // o.kx3
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }

    public final void p1(li liVar, nb0 nb0Var, ym2 ym2Var, mw4 mw4Var, gb5 gb5Var, tk6 tk6Var, boolean z, boolean z2) {
        boolean z3;
        if (this.E != z) {
            this.e0.n = z;
            this.W = null;
            this.X = null;
            vn4.p0(this).U();
        }
        if (ym2Var == null) {
            ym2Var = this.c0;
        }
        yk6 yk6Var = this.d0;
        boolean z4 = true;
        if (im3.n(yk6Var.a, tk6Var)) {
            z3 = false;
        } else {
            yk6Var.a = tk6Var;
            z3 = true;
        }
        yk6Var.b = liVar;
        gb5 gb5Var2 = yk6Var.d;
        if (gb5Var2 != gb5Var) {
            yk6Var.d = gb5Var;
            gb5Var2 = gb5Var;
            z3 = true;
        }
        if (yk6Var.e != z2) {
            yk6Var.e = z2;
        } else {
            z4 = z3;
        }
        yk6Var.c = ym2Var;
        yk6Var.f = this.V;
        cb1 cb1Var = this.g0;
        cb1Var.A = gb5Var;
        cb1Var.C = z2;
        cb1Var.D = nb0Var;
        t2 t2Var = ka0.a;
        gb5 gb5Var3 = gb5.m;
        if (gb5Var2 != gb5Var3) {
            gb5Var3 = gb5.n;
        }
        o1(t2Var, z, mw4Var, gb5Var3, z4);
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        if (this.E && (this.W == null || this.X == null)) {
            this.W = new t0(this, (byte) 1);
            this.X = new s2(this, null);
        }
        t0 t0Var = this.W;
        if (t0Var != null) {
            fw3[] fw3VarArr = lp6.a;
            op6Var.d(zo6.d, new m3(null, t0Var));
        }
        s2 s2Var = this.X;
        if (s2Var != null) {
            fw3[] fw3VarArr2 = lp6.a;
            op6Var.d(zo6.e, s2Var);
        }
    }
}
