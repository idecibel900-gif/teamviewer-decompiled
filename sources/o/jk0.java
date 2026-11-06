package o;

import android.content.Context;
import android.graphics.Color;
import com.teamviewer.apidefinitions.account.apis.AccountApi;
import com.teamviewer.apidefinitions.account.models.Account;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jk0 implements k10, vc1, rb8, e07, vm2, ce1, ad2, ir2 {
    public static on3 A;
    public static final an4 L;
    public static final yq4 M;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile ou f1175o;
    public static Context t;
    public final /* synthetic */ byte m;
    public static final jk0 n = new jk0(1);
    public static final jk0 p = new jk0(3);
    public static final jk0 q = new jk0(4);
    public static final jk0 r = new jk0(5);
    public static final jk0 s = new jk0(6);
    public static final jk0 u = new jk0(7);
    public static final jk0 v = new jk0(8);
    public static final jk0 w = new jk0(9);
    public static final jk0 x = new jk0(10);
    public static final /* synthetic */ jk0 y = new jk0(11);
    public static final jk0 z = new jk0(12);
    public static final jk0 B = new jk0(13);
    public static final jk0 C = new jk0(14);
    public static final /* synthetic */ jk0 D = new jk0(15);
    public static final jk0 E = new jk0(16);
    public static final jk0 F = new jk0(17);
    public static final /* synthetic */ jk0 G = new jk0(18);
    public static final jk0 H = new jk0(19);
    public static final jk0 I = new jk0(20);
    public static final jk0 J = new jk0(21);
    public static final yq4 K = new yq4(16);
    public static final an4 N = new an4(18);
    public static final jk0 O = new jk0(23);
    public static final jk0 P = new jk0(24);
    public static final jk0 Q = new jk0(25);

    static {
        byte b = 17;
        L = new an4(b);
        M = new yq4(b);
    }

    public /* synthetic */ jk0(byte b) {
        this.m = b;
    }

    public static cq7 d(long j, long j2, long j3, long j4, long j5, ux2 ux2Var) {
        long j6 = rv0.h;
        return e(((rn4) ux2Var.j(un4.a)).a, (jt7) ux2Var.j(kt7.a)).b(j6, j6, j6, j6, j, j2, j3, j6, j6, j6, null, j4, j5, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6);
    }

    public static cq7 e(zv0 zv0Var, jt7 jt7Var) {
        cq7 cq7Var = zv0Var.i0;
        if (cq7Var != null) {
            if (im3.n(cq7Var.k, jt7Var)) {
                return cq7Var;
            }
            cq7 cq7VarB = cq7Var.b(cq7Var.a, cq7Var.b, cq7Var.c, cq7Var.d, cq7Var.e, cq7Var.f, cq7Var.g, cq7Var.h, cq7Var.i, cq7Var.j, jt7Var, cq7Var.l, cq7Var.m, cq7Var.n, cq7Var.f550o, cq7Var.p, cq7Var.q, cq7Var.r, cq7Var.s, cq7Var.t, cq7Var.u, cq7Var.v, cq7Var.w, cq7Var.x, cq7Var.y, cq7Var.z, cq7Var.A, cq7Var.B, cq7Var.C, cq7Var.D, cq7Var.E, cq7Var.F, cq7Var.G, cq7Var.H, cq7Var.I, cq7Var.J, cq7Var.K, cq7Var.L, cq7Var.M, cq7Var.N, cq7Var.O, cq7Var.P, cq7Var.Q);
            zv0Var.i0 = cq7VarB;
            return cq7VarB;
        }
        long jB = bw0.b(zv0Var, au8.R);
        long jB2 = bw0.b(zv0Var, au8.W);
        aw0 aw0Var = au8.z;
        long jB3 = bw0.b(zv0Var, aw0Var);
        float f = au8.A;
        long jB4 = rv0.b(f, jB3);
        long jB5 = bw0.b(zv0Var, au8.L);
        aw0 aw0Var2 = au8.v;
        long jB6 = bw0.b(zv0Var, aw0Var2);
        long jB7 = bw0.b(zv0Var, aw0Var2);
        long jB8 = bw0.b(zv0Var, aw0Var2);
        long jB9 = bw0.b(zv0Var, aw0Var2);
        long jB10 = bw0.b(zv0Var, au8.u);
        long jB11 = bw0.b(zv0Var, au8.K);
        long jB12 = bw0.b(zv0Var, au8.Q);
        long jB13 = bw0.b(zv0Var, au8.t);
        long jB14 = rv0.b(au8.y, bw0.b(zv0Var, au8.x));
        long jB15 = bw0.b(zv0Var, au8.J);
        long jB16 = bw0.b(zv0Var, au8.T);
        long jB17 = bw0.b(zv0Var, au8.b0);
        long jB18 = rv0.b(au8.E, bw0.b(zv0Var, au8.D));
        long jB19 = bw0.b(zv0Var, au8.N);
        long jB20 = bw0.b(zv0Var, au8.V);
        long jB21 = bw0.b(zv0Var, au8.d0);
        long jB22 = rv0.b(au8.I, bw0.b(zv0Var, au8.H));
        long jB23 = bw0.b(zv0Var, au8.P);
        long jB24 = bw0.b(zv0Var, au8.S);
        long jB25 = bw0.b(zv0Var, au8.a0);
        long jB26 = rv0.b(au8.C, bw0.b(zv0Var, au8.B));
        long jB27 = bw0.b(zv0Var, au8.M);
        aw0 aw0Var3 = au8.X;
        long jB28 = bw0.b(zv0Var, aw0Var3);
        long jB29 = bw0.b(zv0Var, aw0Var3);
        long jB30 = rv0.b(f, bw0.b(zv0Var, aw0Var));
        long jB31 = bw0.b(zv0Var, aw0Var3);
        long jB32 = bw0.b(zv0Var, au8.U);
        long jB33 = bw0.b(zv0Var, au8.c0);
        long jB34 = rv0.b(au8.G, bw0.b(zv0Var, au8.F));
        long jB35 = bw0.b(zv0Var, au8.O);
        aw0 aw0Var4 = au8.Y;
        long jB36 = bw0.b(zv0Var, aw0Var4);
        long jB37 = bw0.b(zv0Var, aw0Var4);
        long jB38 = rv0.b(f, bw0.b(zv0Var, aw0Var4));
        long jB39 = bw0.b(zv0Var, aw0Var4);
        aw0 aw0Var5 = au8.Z;
        cq7 cq7Var2 = new cq7(jB, jB2, jB4, jB5, jB6, jB7, jB8, jB9, jB10, jB11, jt7Var, jB12, jB13, jB14, jB15, jB16, jB17, jB18, jB19, jB20, jB21, jB22, jB23, jB24, jB25, jB26, jB27, jB28, jB29, jB30, jB31, jB32, jB33, jB34, jB35, jB36, jB37, jB38, jB39, bw0.b(zv0Var, aw0Var5), bw0.b(zv0Var, aw0Var5), rv0.b(f, bw0.b(zv0Var, aw0Var5)), bw0.b(zv0Var, aw0Var5));
        zv0Var.i0 = cq7Var2;
        return cq7Var2;
    }

    @Override // o.k10
    public byte[] a(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr;
    }

    public void b(final boolean z2, mw4 mw4Var, final cq7 cq7Var, final pw6 pw6Var, ux2 ux2Var, int i) {
        ux2Var.Y(-818661242);
        int i2 = i | (ux2Var.g(z2) ? 4 : 2) | (ux2Var.g(false) ? 32 : 16) | (ux2Var.f(mw4Var) ? 256 : 128) | (ux2Var.f(cq7Var) ? 16384 : 8192) | (ux2Var.f(pw6Var) ? 131072 : 65536);
        if (ux2Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            boolean z3 = (i2 & 896) == 256;
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (z3 || objK == obj) {
                objK = new ux4(mw4Var);
                ux2Var.g0(objK);
            }
            ux4 ux4Var = (ux4) objK;
            final e87 e87VarC0 = xs1.c0(du4.p, ux2Var);
            boolean zH = ((i2 & 14) == 4) | ((((57344 & i2) ^ 24576) > 16384 && ux2Var.f(cq7Var)) || (i2 & 24576) == 16384) | ((((458752 & i2) ^ 196608) > 131072 && ux2Var.f(pw6Var)) || (i2 & 196608) == 131072) | ((i2 & 112) == 32) | ux2Var.h(e87VarC0);
            Object objK2 = ux2Var.K();
            if (zH || objK2 == obj) {
                objK2 = new nc7() { // from class: o.eq7
                    @Override // o.nc7
                    public final void a(pb6 pb6Var) {
                        e87 e87Var = e87VarC0;
                        pb6Var.h(pw6Var);
                        cq7 cq7Var2 = cq7Var;
                        boolean z4 = z2;
                        pb6Var.a(cq7Var2.a(z4, false, false));
                        wc7 wc7Var = pb6Var.n;
                        wc7Var.getClass();
                        rx4 rx4Var = wc7Var.K.c;
                        if ((((qx4) v47.s(rx4Var.m, rx4Var)).c & 4) != 0) {
                            jo joVar = pb6Var.x;
                            jo joVar2 = pb6Var.y;
                            try {
                                pb6Var.x = e87Var;
                                pb6Var.y = e87Var;
                                pb6Var.a(cq7Var2.a(z4, false, true));
                            } finally {
                                pb6Var.x = joVar;
                                pb6Var.y = joVar2;
                            }
                        }
                    }
                };
                ux2Var.g0(objK2);
            }
            nc7 nc7Var = (nc7) objK2;
            ua0.a((nc7Var == mc7.a ? cs4.b : new qc7(ux4Var, nc7Var).f(rc7.b)).f(new yg3(z2, mw4Var, cq7Var, pw6Var)), ux2Var, 0);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new xa(this, z2, mw4Var, cq7Var, pw6Var, i);
        }
    }

    public void c(final String str, final hw2 hw2Var, final boolean z2, final boolean z3, final tg8 tg8Var, final mw4 mw4Var, final hw2 hw2Var2, final hw2 hw2Var3, final pw6 pw6Var, final cq7 cq7Var, nd5 nd5Var, hw2 hw2Var4, ux2 ux2Var, final int i) {
        int i2;
        hw2 hw2Var5;
        Object obj;
        final nd5 nd5Var2;
        final hw2 hw2Var6;
        nd5 pd5Var;
        int i3;
        hw2 hw2VarO;
        int i4;
        ux2Var.Y(1806980801);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            hw2Var5 = hw2Var;
            i2 |= ux2Var.h(hw2Var5) ? 32 : 16;
        } else {
            hw2Var5 = hw2Var;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.g(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.f(tg8Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            obj = mw4Var;
            i2 |= ux2Var.f(obj) ? 131072 : 65536;
        } else {
            obj = mw4Var;
        }
        if ((i & 1572864) == 0) {
            i2 |= ux2Var.g(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= ux2Var.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= ux2Var.h(hw2Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= ux2Var.h(null) ? 536870912 : 268435456;
        }
        int i5 = 100663296 | (ux2Var.h(hw2Var3) ? 4 : 2) | (ux2Var.h(null) ? 32 : 16) | (ux2Var.h(null) ? 256 : 128) | (ux2Var.h(null) ? 2048 : 1024) | (ux2Var.f(pw6Var) ? 16384 : 8192) | (ux2Var.f(cq7Var) ? 131072 : 65536) | 13107200;
        if (ux2Var.N(i2 & 1, ((i2 & 306783379) == 306783378 && (38347923 & i5) == 38347922) ? false : true)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                pd5Var = new pd5(16.0f, 16.0f, 16.0f, 16.0f);
                i3 = i5 & (-3670017);
                hw2VarO = au8.O(417908150, new na(z2, obj, (Object) cq7Var, (Object) pw6Var, (byte) 8), ux2Var);
                i4 = 1572864;
            } else {
                ux2Var.Q();
                i3 = i5 & (-3670017);
                i4 = 1572864;
                pd5Var = nd5Var;
                hw2VarO = hw2Var4;
            }
            ux2Var.q();
            boolean z4 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object objK = ux2Var.K();
            if (z4 || objK == e01.a) {
                objK = tg8Var.c(new xo(str));
                ux2Var.g0(objK);
            }
            String str2 = ((e18) objK).a.n;
            xq7 xq7Var = new xq7();
            ux2Var.W(-1353189719);
            ux2Var.p(false);
            int i6 = i2 >> 12;
            int i7 = i3 << 18;
            nd5 nd5Var3 = pd5Var;
            m77.a(str2, hw2Var5, xq7Var, null, hw2Var2, null, hw2Var3, null, z3, z2, false, mw4Var, nd5Var3, cq7Var, hw2VarO, ux2Var, (57344 & i6) | (i2 & 112) | (i6 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), ((i2 >> 6) & 7168) | ((i2 >> 9) & 14) | ((i2 >> 3) & 112) | (i6 & 896) | (i3 & 458752) | i4);
            nd5Var2 = nd5Var3;
            hw2Var6 = hw2VarO;
        } else {
            ux2Var.Q();
            nd5Var2 = nd5Var;
            hw2Var6 = hw2Var4;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.dq7
                @Override // o.hw2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = yo1.Y(i | 1);
                    this.m.c(str, hw2Var, z2, z3, tg8Var, mw4Var, hw2Var2, hw2Var3, pw6Var, cq7Var, nd5Var2, hw2Var6, (ux2) obj2, iY);
                    return f88.a;
                }
            };
        }
    }

    @Override // o.vm2
    public oz3 f(aw5 aw5Var, String str, g07 g07Var, g07 g07Var2) {
        aw5Var.getClass();
        str.getClass();
        g07Var.getClass();
        g07Var2.getClass();
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // o.rb8
    public Object g(kr3 kr3Var, float f) {
        boolean z2 = kr3Var.q() == 1;
        if (z2) {
            kr3Var.D0();
        }
        double dNextDouble = kr3Var.nextDouble();
        double dNextDouble2 = kr3Var.nextDouble();
        double dNextDouble3 = kr3Var.nextDouble();
        double dNextDouble4 = kr3Var.q() == 7 ? kr3Var.nextDouble() : 1.0d;
        if (z2) {
            kr3Var.A0();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(jc1 jc1Var) {
        g5 g5Var;
        long j;
        if (jc1Var instanceof g5) {
            g5Var = (g5) jc1Var;
            int i = g5Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                g5Var.p = i - Integer.MIN_VALUE;
            } else {
                g5Var = new g5(this, jc1Var);
            }
        } else {
            g5Var = new g5(this, jc1Var);
        }
        Object objA = g5Var.n;
        int i2 = g5Var.p;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            j = 30000;
            g5Var.m = 30000L;
            g5Var.p = 1;
            objA = n85Var.a(30000L, g5Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = g5Var.m;
        ct1.a0(objA);
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<Account> account = ((AccountApi) ((kh7) y85.m.t().f).getValue()).getAccount();
        g5Var.m = j;
        g5Var.p = 2;
        Object objM = nv1.m(account, g5Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    @Override // o.ad2
    public void i(zi0 zi0Var) {
        throw new IllegalStateException("Cannot infer visibility for " + zi0Var);
    }

    @Override // o.ad2
    public void j(ns4 ns4Var, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + ns4Var.getName() + ", unresolved classes " + arrayList);
    }

    @Override // o.e07
    public void lock() {
    }

    @Override // o.e07
    public void unlock() {
    }

    @Override // o.vc1
    public Object w(Object obj) {
        switch (this.m) {
            case 4:
                return (db6) obj;
            case 20:
                return Double.valueOf(((nc6) obj).u());
            default:
                return ((nc6) obj).u();
        }
    }
}
