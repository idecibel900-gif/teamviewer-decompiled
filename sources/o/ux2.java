package o;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ux2 {
    public int A;
    public int B;
    public boolean C;
    public final tx2 D;
    public final ArrayList E;
    public boolean F;
    public g17 G;
    public h17 H;
    public k17 I;
    public boolean J;
    public yj5 K;
    public tm0 L;
    public final f01 M;
    public px2 N;
    public em2 O;
    public hz6 P;
    public final q01 Q;
    public final de1 R;
    public boolean S;
    public long T;
    public vx2 U;
    public final l78 a;
    public final n01 b;
    public final h17 c;
    public final mx4 d;
    public final tm0 e;
    public final tm0 f;
    public final xc0 g;
    public final s01 h;
    public xx2 j;
    public int k;
    public int l;
    public int m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f2257o;
    public iw4 p;
    public boolean q;
    public boolean r;
    public kw4 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final r94 n = new r94((byte) 2);
    public final ArrayList s = new ArrayList();
    public final r94 t = new r94((byte) 2);
    public yj5 u = yj5.p;
    public final r94 x = new r94((byte) 2);
    public int z = -1;

    public ux2(l78 l78Var, n01 n01Var, h17 h17Var, mx4 mx4Var, tm0 tm0Var, tm0 tm0Var2, xc0 xc0Var, s01 s01Var) {
        this.a = l78Var;
        this.b = n01Var;
        this.c = h17Var;
        this.d = mx4Var;
        this.e = tm0Var;
        this.f = tm0Var2;
        this.g = xc0Var;
        this.h = s01Var;
        this.C = n01Var.f() || n01Var.d();
        this.D = new tx2(this, (byte) 0);
        this.E = new ArrayList();
        g17 g17VarC = h17Var.c();
        g17VarC.c();
        this.G = g17VarC;
        h17 h17Var2 = new h17();
        if (n01Var.f()) {
            h17Var2.b();
        }
        if (n01Var.d()) {
            h17Var2.w = new kw4();
        }
        this.H = h17Var2;
        k17 k17VarD = h17Var2.d();
        k17VarD.e(true);
        this.I = k17VarD;
        this.M = new f01(this, tm0Var);
        g17 g17VarC2 = this.H.c();
        try {
            px2 px2VarA = g17VarC2.a(0);
            g17VarC2.c();
            this.N = px2VarA;
            this.O = new em2();
            this.Q = new q01(this);
            de1 de1VarJ = n01Var.j();
            de1 de1VarY = y();
            this.R = de1VarJ.H0(de1VarY == null ? ba2.m : de1VarY);
        } catch (Throwable th) {
            g17VarC2.c();
            throw th;
        }
    }

    public static final int M(ux2 ux2Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        int i5;
        g17 g17Var;
        g17 g17Var2 = ux2Var.G;
        int i6 = 0;
        if (g17Var2.j(i)) {
            int i7 = g17Var2.i(i);
            Object objP = g17Var2.p(g17Var2.b, i);
            if (i7 == 206 && im3.n(objP, i01.e)) {
                Object objH = g17Var2.h(i, 0);
                yx2 yx2Var = objH instanceof yx2 ? (yx2) objH : null;
                t96 t96Var = yx2Var != null ? yx2Var.a : null;
                rx2 rx2Var = t96Var instanceof rx2 ? (rx2) t96Var : null;
                if (rx2Var != null) {
                    kx4 kx4Var = rx2Var.m.e;
                    Object[] objArr = kx4Var.b;
                    long[] jArr2 = kx4Var.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr2[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i6;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        ux2 ux2Var2 = (ux2) objArr[(i8 << 3) + i11];
                                        h17 h17Var = ux2Var2.c;
                                        if (h17Var.n <= 0 || (h17Var.m[1] & 67108864) == 0) {
                                            i5 = i6;
                                        } else {
                                            s01 s01Var = ux2Var2.h;
                                            synchronized (s01Var.p) {
                                                s01Var.p();
                                                jx4 jx4Var = s01Var.z;
                                                s01Var.z = xo1.G();
                                                try {
                                                    s01Var.H.d0(jx4Var);
                                                } catch (Throwable th) {
                                                    s01Var.z = jx4Var;
                                                    throw th;
                                                }
                                            }
                                            tm0 tm0Var = new tm0();
                                            ux2Var2.L = tm0Var;
                                            g17 g17VarC = ux2Var2.c.c();
                                            try {
                                                ux2Var2.G = g17VarC;
                                                f01 f01Var = ux2Var2.M;
                                                tm0 tm0Var2 = f01Var.b;
                                                try {
                                                    f01Var.b = tm0Var;
                                                    ux2Var2.L(0);
                                                    f01 f01Var2 = ux2Var2.M;
                                                    f01Var2.b();
                                                    try {
                                                        if (f01Var2.c) {
                                                            g17Var = g17VarC;
                                                            try {
                                                                f01Var2.b.V.v0(ja5.d);
                                                                if (f01Var2.c) {
                                                                    f01Var2.d(false);
                                                                    f01Var2.d(false);
                                                                    f01Var2.b.V.v0(t95.d);
                                                                    i5 = 0;
                                                                    f01Var2.c = false;
                                                                }
                                                                f01Var.b = tm0Var2;
                                                                g17Var.c();
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                f01Var.b = tm0Var2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            g17Var = g17VarC;
                                                        }
                                                        f01Var.b = tm0Var2;
                                                        g17Var.c();
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        g17Var.c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    g17Var = g17VarC;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                g17Var = g17VarC;
                                            }
                                        }
                                        ux2Var.b.r(ux2Var2.h);
                                    } else {
                                        jArr2 = jArr2;
                                        i5 = i6;
                                        i9 = i9;
                                    }
                                    j >>= i9;
                                    i11++;
                                    i9 = i9;
                                    i6 = i5;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                i4 = i6;
                                if (i10 != i9) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                i4 = i6;
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            i6 = i4;
                            jArr2 = jArr;
                        }
                    }
                }
                return g17Var2.o(i);
            }
            i3 = 1;
            if (!g17Var2.l(i)) {
                return g17Var2.o(i);
            }
        } else {
            i3 = 1;
            if (g17Var2.d(i)) {
                int i12 = g17Var2.b[(i * 5) + 3] + i;
                int iM = 0;
                for (int i13 = i + 1; i13 < i12; i13 += g17Var2.b[(i13 * 5) + 3]) {
                    boolean zL = g17Var2.l(i13);
                    if (zL) {
                        ux2Var.M.c();
                        f01 f01Var3 = ux2Var.M;
                        Object objN = g17Var2.n(i13);
                        f01Var3.c();
                        f01Var3.h.add(objN);
                    }
                    iM += M(ux2Var, i13, zL || z, zL ? 0 : i2 + iM);
                    if (zL) {
                        ux2Var.M.c();
                        ux2Var.M.a();
                    }
                }
                if (!g17Var2.l(i)) {
                    return iM;
                }
            } else if (!g17Var2.l(i)) {
                return g17Var2.o(i);
            }
        }
        return i3;
    }

    public final void A(ArrayList arrayList) {
        g17 g17Var;
        ux2 ux2Var = this;
        tm0 tm0Var = ux2Var.f;
        f01 f01Var = ux2Var.M;
        tm0 tm0Var2 = f01Var.b;
        try {
            f01Var.b = tm0Var;
            tm0Var.V.v0(ha5.d);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                vd5 vd5Var = (vd5) arrayList.get(i);
                pu4 pu4Var = (pu4) vd5Var.m;
                pu4Var.getClass();
                px2 px2VarL = ep1.l(null);
                h17 h17VarA = j17.a(null);
                int iA = h17VarA.a(px2VarL);
                al3 al3Var = new al3();
                f01Var.b();
                va5 va5Var = f01Var.b.V;
                va5Var.v0(q95.d);
                lq1.F(va5Var, 0, al3Var, 1, px2VarL);
                if (h17VarA == ux2Var.H) {
                    if (!ux2Var.I.w) {
                        i01.a("Check failed");
                    }
                    ux2Var.u();
                }
                g17 g17VarC = h17VarA.c();
                try {
                    g17VarC.r(iA);
                    f01Var.f = iA;
                    tm0 tm0Var3 = new tm0();
                    try {
                        g17Var = g17VarC;
                        try {
                            F(null, null, null, ea2.m, new n5(this, tm0Var3, g17VarC, pu4Var, (byte) 17));
                            tm0 tm0Var4 = f01Var.b;
                            tm0Var4.getClass();
                            if (!tm0Var3.V.u0()) {
                                va5 va5Var2 = tm0Var4.V;
                                va5Var2.v0(m95.d);
                                lq1.F(va5Var2, 0, tm0Var3, 1, al3Var);
                            }
                            g17Var.c();
                            f01Var.b.V.v0(ja5.d);
                            i++;
                            ux2Var = this;
                        } catch (Throwable th) {
                            th = th;
                            g17Var.c();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        g17Var = g17VarC;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    g17Var = g17VarC;
                }
            }
            f01Var.b();
            f01Var.b.V.v0(u95.d);
            f01Var.f = 0;
            f01Var.b = tm0Var2;
        } catch (Throwable th4) {
            f01Var.b = tm0Var2;
            throw th4;
        }
    }

    public final void B(yj5 yj5Var, Object obj) {
        U(126665345, null);
        C();
        h0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                k17.y(this.I);
            }
            boolean z = (this.S || im3.n(this.G.f(), yj5Var)) ? false : true;
            if (z) {
                I(yj5Var);
            }
            R(202, 0, i01.c, yj5Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            zu1.y(this, new yy0(-59194059, true, new t0(obj, (byte) 24)));
            this.w = z2;
            p(false);
            this.K = null;
            this.T = j;
            p(false);
        } catch (Throwable th) {
            try {
                ka0.H(th, new qx2(this, (byte) 2));
                throw th;
            } catch (Throwable th2) {
                p(false);
                this.K = null;
                this.T = j;
                p(false);
                throw th2;
            }
        }
    }

    public final Object C() {
        boolean z = this.S;
        aw awVar = e01.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof id6)) {
                return objM;
            }
        } else if (this.r) {
            i01.a("A call to createNode(), emitNode() or useNode() expected");
            return awVar;
        }
        return awVar;
    }

    public final List D() {
        n01 n01Var = this.b;
        m01 m01VarH = n01Var.h();
        s01 s01Var = m01VarH != null ? (s01) m01VarH : null;
        if (s01Var != null) {
            h17 h17Var = s01Var.r;
            g17 g17VarC = j17.a(h17Var).c();
            try {
                Integer numN = ga0.n(g17VarC, n01Var, 0, g17VarC.c);
                g17VarC.c();
                if (numN != null) {
                    g17 g17VarC2 = j17.a(h17Var).c();
                    try {
                        return lv0.A0(ga0.x(g17VarC2, numN.intValue(), 0), s01Var.H.D());
                    } finally {
                        g17VarC2.c();
                    }
                }
            } catch (Throwable th) {
                g17VarC.c();
                throw th;
            }
        }
        return ea2.m;
    }

    public final int E(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    public final Object F(s01 s01Var, s01 s01Var2, Integer num, List list, Function0 function0) {
        Object objA;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                vd5 vd5Var = (vd5) list.get(i2);
                j56 j56Var = (j56) vd5Var.m;
                Object obj = vd5Var.n;
                if (obj != null) {
                    c0(j56Var, obj);
                } else {
                    c0(j56Var, null);
                }
            }
            if (s01Var == null) {
                objA = function0.a();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (s01Var2 == null || s01Var2 == s01Var || iIntValue < 0) {
                    objA = function0.a();
                } else {
                    s01Var.D = s01Var2;
                    s01Var.E = iIntValue;
                    try {
                        objA = function0.a();
                        s01Var.D = null;
                        s01Var.E = 0;
                    } catch (Throwable th) {
                        s01Var.D = null;
                        s01Var.E = 0;
                        throw th;
                    }
                }
                if (objA == null) {
                    objA = function0.a();
                }
            }
            this.F = z;
            this.k = i;
            return objA;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void G() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ux2.G():void");
    }

    public final void H() throws Throwable {
        int i;
        L(this.G.g);
        f01 f01Var = this.M;
        f01Var.d(false);
        r94 r94Var = f01Var.d;
        ux2 ux2Var = f01Var.a;
        g17 g17Var = ux2Var.G;
        if (g17Var.c > 0 && r94Var.a(-2) != (i = g17Var.i)) {
            if (!f01Var.c && f01Var.e) {
                f01Var.d(false);
                f01Var.b.V.v0(x95.d);
                f01Var.c = true;
            }
            if (i > 0) {
                px2 px2VarA = g17Var.a(i);
                r94Var.c(i);
                f01Var.d(false);
                va5 va5Var = f01Var.b.V;
                va5Var.v0(w95.d);
                lq1.E(va5Var, 0, px2VarA);
                f01Var.c = true;
            }
        }
        f01Var.b.V.v0(fa5.d);
        int i2 = f01Var.f;
        g17 g17Var2 = ux2Var.G;
        f01Var.f = g17Var2.b[(g17Var2.g * 5) + 3] + i2;
    }

    public final void I(yj5 yj5Var) {
        kw4 kw4Var = this.v;
        if (kw4Var == null) {
            kw4Var = new kw4();
            this.v = kw4Var;
        }
        kw4Var.i(this.G.g, yj5Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void J(int i, int i2, int i3) {
        g17 g17Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (g17Var.q(i) == i2) {
                i3 = i2;
            } else if (g17Var.q(i2) == i) {
                i3 = i;
            } else if (g17Var.q(i) == g17Var.q(i2)) {
                i3 = g17Var.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = g17Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = g17Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = g17Var.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = g17Var.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = g17Var.q(iQ5)) {
                    i3 = g17Var.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (g17Var.l(i)) {
                this.M.a();
            }
            i = g17Var.q(i);
        }
        o(i2, i3);
    }

    public final Object K() {
        boolean z = this.S;
        aw awVar = e01.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof id6)) {
                return objM instanceof yx2 ? ((yx2) objM).a : objM;
            }
        } else if (this.r) {
            i01.a("A call to createNode(), emitNode() or useNode() expected");
            return awVar;
        }
        return awVar;
    }

    public final void L(int i) throws Throwable {
        boolean zL = this.G.l(i);
        f01 f01Var = this.M;
        if (zL) {
            f01Var.c();
            Object objN = this.G.n(i);
            f01Var.c();
            f01Var.h.add(objN);
        }
        M(this, i, zL, 0);
        f01Var.c();
        if (zL) {
            f01Var.a();
        }
    }

    public final boolean N(int i, boolean z) {
        j56 j56VarW;
        if ((i & 1) == 0 && (this.S || this.y)) {
            hz6 hz6Var = this.P;
            if (hz6Var != null && (j56VarW = w()) != null && hz6Var.d()) {
                int i2 = j56VarW.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                j56VarW.b = i3;
                j56VarW.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                va5 va5Var = this.M.b.V;
                va5Var.v0(ea5.d);
                lq1.E(va5Var, 0, j56VarW);
                this.b.q(j56VarW);
                return false;
            }
        } else if (!z && z()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void O() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        g17 g17Var = this.G;
        int iG = g17Var.g();
        int[] iArr = g17Var.b;
        int i = g17Var.g;
        Object objP = i < g17Var.h ? g17Var.p(iArr, i) : null;
        Object objF = g17Var.f();
        int i2 = this.m;
        aw awVar = e01.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(awVar)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
            }
            V(null, (iArr[(g17Var.g * 5) + 1] & 1073741824) != 0);
            G();
            g17Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(awVar)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        this.T = jRotateLeft;
        V(null, (iArr[(g17Var.g * 5) + 1] & 1073741824) != 0);
        G();
        g17Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void P() {
        g17 g17Var = this.G;
        int i = g17Var.i;
        this.l = i >= 0 ? g17Var.b[(i * 5) + 1] & 67108863 : 0;
        g17Var.t();
    }

    public final void Q() {
        if (this.l != 0) {
            i01.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        j56 j56VarW = w();
        if (j56VarW != null) {
            int i = j56VarW.b;
            if ((i & 128) == 0) {
                j56VarW.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0326  */
    /* JADX WARN: Code duplicated, block: B:176:0x033c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0357  */
    /* JADX WARN: Code duplicated, block: B:180:0x035d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0363  */
    /* JADX WARN: Code duplicated, block: B:185:0x036a  */
    /* JADX WARN: Code duplicated, block: B:187:0x036d  */
    /* JADX WARN: Code duplicated, block: B:188:0x036f  */
    /* JADX WARN: Code duplicated, block: B:192:0x039d  */
    /* JADX WARN: Code duplicated, block: B:193:0x039f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    public final void R(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        xx2 xx2Var;
        xx2 xx2Var2;
        ArrayList arrayList;
        kw4 kw4Var;
        int i3;
        Object objValueOf;
        jx4 jx4Var;
        Object objG;
        zw4 zw4Var;
        k17 k17Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        g17 g17Var;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        g17 g17Var2;
        int i13;
        Object objP;
        k17 k17Var2;
        int i14;
        xx2 xx2Var3;
        Object obj4 = obj;
        if (this.r) {
            i01.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.m;
        Object obj5 = e01.a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i15);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i15);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                k17Var2 = this.I;
                i14 = k17Var2.t;
                if (z) {
                    k17Var2.P(i, obj5, true, obj5);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    k17Var2.P(i, obj4, false, obj2);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    k17Var2.P(i, obj4, false, obj5);
                }
                xx2Var3 = this.j;
                if (xx2Var3 != null) {
                    int i16 = (-2) - i14;
                    ix3 ix3Var = new ix3(-1, i, i16, -1);
                    xx2Var3.e.i(i16, new m33(-1, this.k - xx2Var3.b, 0));
                    xx2Var3.d.add(ix3Var);
                }
                t(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    g17Var2 = this.G;
                    i13 = g17Var2.g;
                    if (i13 < g17Var2.h) {
                        objP = g17Var2.p(g17Var2.b, i13);
                    } else {
                        objP = null;
                    }
                    if (im3.n(obj4, objP)) {
                        V(obj2, z);
                        z3 = z2;
                    }
                }
                g17Var = this.G;
                iArr = g17Var.b;
                arrayList2 = new ArrayList();
                if (g17Var.k <= 0) {
                    i10 = g17Var.g;
                    while (i10 < g17Var.h) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objP2 = g17Var.p(iArr, i10);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new ix3(objP2, i18, i10, i12));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new xx2(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            xx2Var = this.j;
            if (xx2Var != null) {
                arrayList = xx2Var.d;
                kw4Var = xx2Var.e;
                i3 = xx2Var.b;
                if (obj4 != null) {
                    objValueOf = new pp3(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                jx4Var = ((rv4) xx2Var.f.getValue()).a;
                objG = jx4Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof zw4) {
                    zw4Var = (zw4) objG;
                    Object objK = zw4Var.k(0);
                    if (zw4Var.h()) {
                        jx4Var.k(objValueOf);
                    }
                    if (zw4Var.b == 1) {
                        jx4Var.m(objValueOf, zw4Var.e());
                    }
                    objG = objK;
                } else {
                    jx4Var.k(objValueOf);
                }
                ix3 ix3Var2 = (ix3) objG;
                if (!z3 || ix3Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        k17 k17VarD = this.H.d();
                        this.I = k17VarD;
                        k17VarD.L();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    k17Var = this.I;
                    int i19 = k17Var.t;
                    if (z) {
                        k17Var.P(i, obj5, true, obj5);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        k17Var.P(i, obj5, false, obj2);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        k17Var.P(i, obj3, false, obj5);
                    }
                    this.N = this.I.b(i19);
                    int i20 = (-2) - i19;
                    ix3 ix3Var3 = new ix3(-1, i, i20, -1);
                    kw4Var.i(i20, new m33(-1, this.k - i3, i4));
                    arrayList.add(ix3Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    xx2Var2 = new xx2(i5, arrayList3);
                } else {
                    int i21 = ix3Var2.c;
                    arrayList.add(ix3Var2);
                    m33 m33Var = (m33) kw4Var.b(i21);
                    this.k = (m33Var != null ? m33Var.b : -1) + i3;
                    m33 m33Var2 = (m33) kw4Var.b(i21);
                    int i22 = m33Var2 != null ? m33Var2.a : -1;
                    int i23 = xx2Var.c;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = kw4Var.c;
                            long[] jArr = kw4Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j = jArr[i26];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                m33 m33Var3 = (m33) objArr3[(i26 << 3) + i28];
                                                int i29 = m33Var3.a;
                                                if (i29 == i22) {
                                                    m33Var3.a = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        m33Var3.a = i29 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = kw4Var.c;
                        long[] jArr2 = kw4Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j2 = jArr2[i30];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j2 & 255) < 128) {
                                            i9 = i25;
                                            m33 m33Var4 = (m33) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = m33Var4.a;
                                            if (i33 == i22) {
                                                m33Var4.a = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                m33Var4.a = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j2 >>= i9;
                                        i32++;
                                        i24 = i8;
                                        i25 = i9;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    f01 f01Var = this.M;
                    int i34 = f01Var.f;
                    ux2 ux2Var = f01Var.a;
                    f01Var.f = (i21 - ux2Var.G.g) + i34;
                    this.G.r(i21);
                    if (i6 > 0) {
                        f01Var.d(false);
                        r94 r94Var = f01Var.d;
                        g17 g17Var3 = ux2Var.G;
                        if (g17Var3.c > 0 && r94Var.a(-2) != (i7 = g17Var3.i)) {
                            if (!f01Var.c && f01Var.e) {
                                f01Var.d(false);
                                f01Var.b.V.v0(x95.d);
                                f01Var.c = true;
                            }
                            if (i7 > 0) {
                                px2 px2VarA = g17Var3.a(i7);
                                r94Var.c(i7);
                                f01Var.d(false);
                                va5 va5Var = f01Var.b.V;
                                va5Var.v0(w95.d);
                                lq1.E(va5Var, 0, px2VarA);
                                f01Var.c = true;
                            }
                        }
                        va5 va5Var2 = f01Var.b.V;
                        va5Var2.v0(ba5.d);
                        va5Var2.q[va5Var2.r - va5Var2.f2293o[va5Var2.p - 1].b] = i6;
                    }
                    V(obj2, z);
                    xx2Var2 = null;
                }
            } else {
                xx2Var2 = null;
            }
            t(z, xx2Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.T = jRotateLeft;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            k17Var2 = this.I;
            i14 = k17Var2.t;
            if (z) {
                k17Var2.P(i, obj5, true, obj5);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                k17Var2.P(i, obj4, false, obj2);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                k17Var2.P(i, obj4, false, obj5);
            }
            xx2Var3 = this.j;
            if (xx2Var3 != null) {
                int i110 = (-2) - i14;
                ix3 ix3Var4 = new ix3(-1, i, i110, -1);
                xx2Var3.e.i(i110, new m33(-1, this.k - xx2Var3.b, 0));
                xx2Var3.d.add(ix3Var4);
            }
            t(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                g17Var2 = this.G;
                i13 = g17Var2.g;
                if (i13 < g17Var2.h) {
                    objP = g17Var2.p(g17Var2.b, i13);
                } else {
                    objP = null;
                }
                if (im3.n(obj4, objP)) {
                    V(obj2, z);
                    z3 = z2;
                }
            }
            g17Var = this.G;
            iArr = g17Var.b;
            arrayList2 = new ArrayList();
            if (g17Var.k <= 0) {
                i10 = g17Var.g;
                while (i10 < g17Var.h) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = g17Var.p(iArr, i10);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new ix3(objP3, i112, i10, i12));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new xx2(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        xx2Var = this.j;
        if (xx2Var != null) {
            arrayList = xx2Var.d;
            kw4Var = xx2Var.e;
            i3 = xx2Var.b;
            if (obj4 != null) {
                objValueOf = new pp3(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            jx4Var = ((rv4) xx2Var.f.getValue()).a;
            objG = jx4Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof zw4) {
                zw4Var = (zw4) objG;
                Object objK2 = zw4Var.k(0);
                if (zw4Var.h()) {
                    jx4Var.k(objValueOf);
                }
                if (zw4Var.b == 1) {
                    jx4Var.m(objValueOf, zw4Var.e());
                }
                objG = objK2;
            } else {
                jx4Var.k(objValueOf);
            }
            ix3 ix3Var5 = (ix3) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                k17 k17VarD2 = this.H.d();
                this.I = k17VarD2;
                k17VarD2.L();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            k17Var = this.I;
            int i113 = k17Var.t;
            if (z) {
                k17Var.P(i, obj5, true, obj5);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                k17Var.P(i, obj5, false, obj2);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                k17Var.P(i, obj3, false, obj5);
            }
            this.N = this.I.b(i113);
            int i210 = (-2) - i113;
            ix3 ix3Var6 = new ix3(-1, i, i210, -1);
            kw4Var.i(i210, new m33(-1, this.k - i3, i4));
            arrayList.add(ix3Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            xx2Var2 = new xx2(i5, arrayList4);
        } else {
            xx2Var2 = null;
        }
        t(z, xx2Var2);
    }

    public final void S() {
        R(-127, 0, null, null);
    }

    public final void T(int i, h95 h95Var) {
        R(i, 0, h95Var, null);
    }

    public final void U(int i, Object obj) {
        R(i, 0, obj, null);
    }

    public final void V(Object obj, boolean z) {
        if (z) {
            g17 g17Var = this.G;
            if (g17Var.k <= 0) {
                if ((g17Var.b[(g17Var.g * 5) + 1] & 1073741824) == 0) {
                    up5.a("Expected a node group");
                }
                g17Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            f01 f01Var = this.M;
            f01Var.getClass();
            f01Var.d(false);
            va5 va5Var = f01Var.b.V;
            va5Var.v0(oa5.d);
            lq1.E(va5Var, 0, obj);
        }
        this.G.u();
    }

    public final void W(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            R(i, 0, null, null);
            return;
        }
        if (this.r) {
            i01.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        g17 g17Var = this.G;
        boolean z = this.S;
        aw awVar = e01.a;
        if (z) {
            g17Var.k++;
            this.I.P(i, awVar, false, awVar);
            t(false, null);
            return;
        }
        if (g17Var.g() == i && ((i3 = g17Var.g) >= g17Var.h || (g17Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            g17Var.u();
            t(false, null);
            return;
        }
        if (g17Var.k <= 0 && (i2 = g17Var.g) != g17Var.h) {
            int i4 = this.k;
            H();
            this.M.e(i4, g17Var.s());
            j51.P(this.s, i2, g17Var.g);
        }
        g17Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            k17 k17VarD = this.H.d();
            this.I = k17VarD;
            k17VarD.L();
            this.J = false;
            this.K = null;
        }
        k17 k17Var = this.I;
        k17Var.d();
        int i5 = k17Var.t;
        k17Var.P(i, awVar, false, awVar);
        this.N = k17Var.b(i5);
        t(false, null);
    }

    public final void X(int i) {
        R(i, 0, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final ux2 Y(int i) {
        j56 j56Var;
        boolean z;
        W(i);
        boolean z2 = this.S;
        xc0 xc0Var = this.g;
        ArrayList arrayList = this.E;
        s01 s01Var = this.h;
        if (z2) {
            j56 j56Var2 = new j56(s01Var);
            arrayList.add(j56Var2);
            h0(j56Var2);
            j56Var2.e = this.B;
            j56Var2.b &= -17;
            xc0Var.H();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iF = j51.F(i2, arrayList2);
        tm3 tm3Var = iF >= 0 ? (tm3) arrayList2.remove(iF) : null;
        Object objM = this.G.m();
        if (im3.n(objM, e01.a)) {
            j56Var = new j56(s01Var);
            h0(j56Var);
        } else {
            objM.getClass();
            j56Var = (j56) objM;
        }
        if (tm3Var == null) {
            int i3 = j56Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                j56Var.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = j56Var.b;
        j56Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(j56Var);
        j56Var.e = this.B;
        j56Var.b &= -17;
        xc0Var.H();
        int i5 = j56Var.b;
        if ((i5 & 256) != 0) {
            j56Var.b = (i5 & (-257)) | 512;
            va5 va5Var = this.M.b.V;
            va5Var.v0(ka5.d);
            lq1.E(va5Var, 0, j56Var);
            if (!this.y) {
                int i6 = j56Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    j56Var.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final void Z(Object obj) {
        if (!this.S && this.G.g() == 207 && !im3.n(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        R(207, 0, null, obj);
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        em2 em2Var = this.O;
        em2Var.p.s0();
        em2Var.f725o.s0();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        g17 g17Var = this.G;
        if (!g17Var.f) {
            g17Var.c();
        }
        if (this.I.w) {
            return;
        }
        u();
    }

    public final void a0() {
        R(125, 2, null, null);
        this.r = true;
    }

    public final void b(Object obj, hw2 hw2Var) {
        if (this.S) {
            va5 va5Var = this.O.f725o;
            va5Var.v0(pa5.d);
            lq1.E(va5Var, 0, obj);
            e8.i(2, hw2Var);
            lq1.E(va5Var, 1, hw2Var);
            return;
        }
        f01 f01Var = this.M;
        f01Var.b();
        va5 va5Var2 = f01Var.b.V;
        va5Var2.v0(pa5.d);
        e8.i(2, hw2Var);
        lq1.F(va5Var2, 0, obj, 1, hw2Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b0() {
        this.m = 0;
        this.G = this.c.c();
        R(100, 0, null, null);
        n01 n01Var = this.b;
        n01Var.t();
        yj5 yj5VarI = n01Var.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(yj5VarI);
        this.K = null;
        if (!this.q) {
            this.q = n01Var.e();
        }
        boolean zF = this.C;
        if (!zF) {
            zF = n01Var.f();
            this.C = zF;
        }
        if (zF) {
            h72 h72Var = r01.a;
            h72Var.getClass();
            yj5VarI = yj5VarI.d(h72Var, new ca7(y()));
        }
        this.u = yj5VarI;
        Set set = (Set) di1.z(yj5VarI, yj3.a);
        if (set != null) {
            set.add(v());
            n01Var.o(set);
        }
        R(Long.hashCode(n01Var.g()), 0, null, null);
    }

    public final boolean c(float f) {
        Object objC = C();
        if ((objC instanceof Float) && f == ((Number) objC).floatValue()) {
            return false;
        }
        h0(Float.valueOf(f));
        return true;
    }

    public final boolean c0(j56 j56Var, Object obj) {
        px2 px2Var = j56Var.c;
        if (px2Var == null) {
            return false;
        }
        int iA = this.G.a.a(ep1.l(px2Var));
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iF = j51.F(iA, arrayList);
        if (iF < 0) {
            int i = -(iF + 1);
            if (!(obj instanceof eo1)) {
                obj = null;
            }
            arrayList.add(i, new tm3(j56Var, iA, obj));
            return true;
        }
        tm3 tm3Var = (tm3) arrayList.get(iF);
        if (!(obj instanceof eo1)) {
            tm3Var.c = null;
            return true;
        }
        Object obj2 = tm3Var.c;
        if (obj2 == null) {
            tm3Var.c = obj;
            return true;
        }
        if (obj2 instanceof kx4) {
            ((kx4) obj2).a(obj);
            return true;
        }
        kx4 kx4Var = ui6.a;
        kx4 kx4Var2 = new kx4(2);
        kx4Var2.j(obj2);
        kx4Var2.j(obj);
        tm3Var.c = kx4Var2;
        return true;
    }

    public final boolean d(int i) {
        Object objC = C();
        if ((objC instanceof Integer) && i == ((Number) objC).intValue()) {
            return false;
        }
        h0(Integer.valueOf(i));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:20:0x0043->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[EDGE_INSN: B:43:0x0096->B:36:0x0096 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0093], SYNTHETIC] */
    public final void d0(jx4 jx4Var) {
        ArrayList arrayList = this.s;
        for (int iD = qf0.D(arrayList); -1 < iD; iD--) {
            tm3 tm3Var = (tm3) arrayList.get(iD);
            px2 px2Var = tm3Var.a.c;
            px2 px2VarL = px2Var != null ? ep1.l(px2Var) : null;
            if (px2VarL == null || !px2VarL.a()) {
                arrayList.remove(iD);
            } else {
                int i = tm3Var.b;
                int i2 = px2VarL.a;
                if (i != i2) {
                    tm3Var.b = i2;
                }
            }
        }
        Object[] objArr = jx4Var.b;
        Object[] objArr2 = jx4Var.c;
        long[] jArr = jx4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            j56 j56Var = (j56) obj;
                            px2 px2Var2 = j56Var.c;
                            if (px2Var2 != null) {
                                int i7 = ep1.l(px2Var2).a;
                                if (obj2 == xz2.V) {
                                    obj2 = null;
                                }
                                arrayList.add(new tm3(j56Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        pv0.b0(arrayList, j51.p);
    }

    public final boolean e(long j) {
        Object objC = C();
        if ((objC instanceof Long) && j == ((Number) objC).longValue()) {
            return false;
        }
        h0(Long.valueOf(j));
        return true;
    }

    public final void e0(int i, int i2) {
        if (i0(i) != i2) {
            if (i < 0) {
                iw4 iw4Var = this.p;
                if (iw4Var == null) {
                    iw4Var = new iw4();
                    this.p = iw4Var;
                }
                iw4Var.f(i, i2);
                return;
            }
            int[] iArr = this.f2257o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.f2257o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final boolean f(Object obj) {
        if (im3.n(C(), obj)) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final void f0(int i, int i2) {
        int iI0 = i0(i);
        if (iI0 != i2) {
            int i3 = i2 - iI0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iI1 = i0(i) + i3;
                e0(i, iI1);
                for (int i4 = size; -1 < i4; i4--) {
                    xx2 xx2Var = (xx2) arrayList.get(i4);
                    if (xx2Var != null && xx2Var.a(i, iI1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                g17 g17Var = this.G;
                if (i < 0) {
                    i = g17Var.i;
                } else if (g17Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final boolean g(boolean z) {
        Object objC = C();
        if ((objC instanceof Boolean) && z == ((Boolean) objC).booleanValue()) {
            return false;
        }
        h0(Boolean.valueOf(z));
        return true;
    }

    public final void g0(Object obj) {
        if (obj instanceof t96) {
            yx2 yx2Var = new yx2((t96) obj, this.m - 1);
            if (this.S) {
                va5 va5Var = this.M.b.V;
                va5Var.v0(da5.d);
                lq1.E(va5Var, 0, yx2Var);
            }
            this.d.add(obj);
            obj = yx2Var;
        }
        h0(obj);
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final void h0(Object obj) {
        if (this.S) {
            k17 k17Var = this.I;
            if (k17Var.n <= 0 || k17Var.i == k17Var.k) {
                k17Var.E(obj);
                return;
            }
            kw4 kw4Var = k17Var.s;
            if (kw4Var == null) {
                kw4Var = new kw4();
            }
            k17Var.s = kw4Var;
            int i = k17Var.v;
            Object objB = kw4Var.b(i);
            if (objB == null) {
                objB = new zw4();
                kw4Var.i(i, objB);
            }
            ((zw4) objB).a(obj);
            return;
        }
        g17 g17Var = this.G;
        boolean z = g17Var.n;
        f01 f01Var = this.M;
        if (!z) {
            px2 px2VarA = g17Var.a(g17Var.i);
            va5 va5Var = f01Var.b.V;
            va5Var.v0(l95.d);
            lq1.F(va5Var, 0, px2VarA, 1, obj);
            return;
        }
        int iD = (g17Var.l - j17.d(g17Var.b, g17Var.i)) - 1;
        if (f01Var.a.G.i - f01Var.f >= 0) {
            f01Var.d(true);
            va5 va5Var2 = f01Var.b.V;
            va5Var2.v0(y95.h);
            lq1.E(va5Var2, 0, obj);
            va5Var2.q[va5Var2.r - va5Var2.f2293o[va5Var2.p - 1].b] = iD;
            return;
        }
        g17 g17Var2 = this.G;
        px2 px2VarA2 = g17Var2.a(g17Var2.i);
        va5 va5Var3 = f01Var.b.V;
        va5Var3.v0(y95.g);
        lq1.F(va5Var3, 0, obj, 1, px2VarA2);
        va5Var3.q[va5Var3.r - va5Var3.f2293o[va5Var3.p - 1].b] = iD;
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        f01 f01Var = this.M;
        f01Var.c = false;
        f01Var.d.b = 0;
        f01Var.f = 0;
        f01Var.e = true;
        f01Var.g = 0;
        f01Var.h.clear();
        f01Var.i = -1;
        f01Var.j = -1;
        f01Var.k = -1;
        f01Var.l = 0;
        this.E.clear();
        this.f2257o = null;
        this.p = null;
    }

    public final int i0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f2257o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        iw4 iw4Var = this.p;
        if (iw4Var != null && iw4Var.c(i) >= 0) {
            int iC = iw4Var.c(i);
            if (iC >= 0) {
                return iw4Var.c[iC];
            }
            an4.j(fx3.e(i, "Cannot find value for key "));
        }
        return 0;
    }

    public final Object j(zw5 zw5Var) {
        return di1.z(l(), zw5Var);
    }

    public final void j0() {
        if (!this.r) {
            i01.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            i01.a("useNode() called while inserting");
        }
        g17 g17Var = this.G;
        Object objN = g17Var.n(g17Var.i);
        f01 f01Var = this.M;
        f01Var.c();
        f01Var.h.add(objN);
        if (this.y && (objN instanceof mz0)) {
            f01Var.b();
            f01Var.b.V.v0(ra5.d);
        }
    }

    public final void k(Function0 function0) {
        if (!this.r) {
            i01.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            i01.a("createNode() can only be called when inserting");
        }
        r94 r94Var = this.n;
        int i = r94Var.a[r94Var.b - 1];
        k17 k17Var = this.I;
        px2 px2VarB = k17Var.b(k17Var.v);
        this.l++;
        em2 em2Var = this.O;
        va5 va5Var = em2Var.f725o;
        va5Var.v0(y95.e);
        lq1.E(va5Var, 0, function0);
        va5Var.q[va5Var.r - va5Var.f2293o[va5Var.p - 1].b] = i;
        lq1.E(va5Var, 1, px2VarB);
        va5 va5Var2 = em2Var.p;
        va5Var2.v0(y95.f);
        va5Var2.q[va5Var2.r - va5Var2.f2293o[va5Var2.p - 1].b] = i;
        lq1.E(va5Var2, 0, px2VarB);
    }

    public final yj5 l() {
        yj5 yj5Var;
        yj5 yj5Var2 = this.K;
        if (yj5Var2 != null) {
            return yj5Var2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        h95 h95Var = i01.c;
        if (z && this.J) {
            int iD = this.I.v;
            while (iD > 0) {
                if (this.I.r(iD) == 202 && im3.n(this.I.s(iD), h95Var)) {
                    Object objP = this.I.p(iD);
                    objP.getClass();
                    yj5 yj5Var3 = (yj5) objP;
                    this.K = yj5Var3;
                    return yj5Var3;
                }
                k17 k17Var = this.I;
                iD = k17Var.D(k17Var.b, iD);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    g17 g17Var = this.G;
                    if (im3.n(g17Var.p(g17Var.b, iQ), h95Var)) {
                        kw4 kw4Var = this.v;
                        if (kw4Var == null || (yj5Var = (yj5) kw4Var.b(iQ)) == null) {
                            g17 g17Var2 = this.G;
                            Object objB = g17Var2.b(g17Var2.b, iQ);
                            objB.getClass();
                            yj5Var = (yj5) objB;
                        }
                        this.K = yj5Var;
                        return yj5Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        yj5 yj5Var4 = this.u;
        this.K = yj5Var4;
        return yj5Var4;
    }

    public final vz0 m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        sa4 sa4VarT = qf0.t();
        k17 k17Var = this.I;
        sa4VarT.addAll(ga0.h(k17Var, null, k17Var.t, null));
        g17 g17Var = this.G;
        boolean z = g17Var.f;
        int[] iArr = g17Var.b;
        if (z || g17Var.c == 0) {
            collection = ea2.m;
        } else {
            q36 q36Var = new q36(g17Var);
            int iQ = g17Var.i;
            Object objValueOf = Integer.valueOf(g17Var.l - j17.d(iArr, iQ));
            while (iQ >= 0) {
                q36Var.e(g17Var.i(iQ), g17Var.k(iQ) ? g17Var.p(iArr, iQ) : e01.a, g17Var.a.g(iQ), objValueOf);
                objValueOf = g17Var.a(iQ);
                iQ = g17Var.q(iQ);
            }
            collection = q36Var.m;
        }
        sa4VarT.addAll(collection);
        sa4VarT.addAll(D());
        return new vz0(qf0.r(sa4VarT), this.C);
    }

    public final void n(jx4 jx4Var, hw2 hw2Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            i01.a("Reentrant composition is not supported");
        }
        this.g.H();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(v47.h().g());
            this.v = null;
            d0(jx4Var);
            this.k = 0;
            byte b = 1;
            this.F = true;
            try {
                b0();
                Object objC = C();
                if (objC != hw2Var && hw2Var != null) {
                    h0(hw2Var);
                }
                tx2 tx2Var = this.D;
                xx4 xx4VarA = d57.a();
                try {
                    xx4VarA.b(tx2Var);
                    h95 h95Var = i01.a;
                    if (hw2Var != null) {
                        T(200, h95Var);
                        zu1.y(this, hw2Var);
                        p(false);
                    } else if (!this.w || objC == null || objC.equals(e01.a)) {
                        O();
                    } else {
                        T(200, h95Var);
                        e8.i(2, objC);
                        zu1.y(this, (hw2) objC);
                        p(false);
                    }
                    xx4VarA.k(xx4VarA.f2559o - 1);
                    s();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        i01.a("Check failed");
                    }
                    u();
                    Trace.endSection();
                } catch (Throwable th) {
                    xx4VarA.k(xx4VarA.f2559o - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    ka0.H(th2, new qx2(this, b));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        i01.a("Check failed");
                    }
                    u();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            f01 f01Var = this.M;
            f01Var.c();
            f01Var.h.add(objN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x039a  */
    /* JADX WARN: Code duplicated, block: B:202:0x050c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void p(boolean z) {
        long jRotateRight;
        r94 r94Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        r94 r94Var2;
        int i7;
        kx4 kx4Var;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        r94 r94Var3 = this.n;
        int i15 = r94Var3.a[r94Var3.b - 2] - 1;
        boolean z2 = this.S;
        aw awVar = e01.a;
        if (z2) {
            k17 k17Var = this.I;
            int i16 = k17Var.v;
            int iR = k17Var.r(i16);
            Object objS = this.I.s(i16);
            Object objP = this.I.p(i16);
            if (objS != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objS instanceof Enum ? ((Enum) objS).ordinal() : objS.hashCode()));
            } else if (objP == null || iR != 207 || objP.equals(awVar)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) iR);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objP.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            g17 g17Var = this.G;
            int i17 = g17Var.i;
            int i18 = g17Var.i(i17);
            g17 g17Var2 = this.G;
            Object objP2 = g17Var2.p(g17Var2.b, i17);
            g17 g17Var3 = this.G;
            Object objB = g17Var3.b(g17Var3.b, i17);
            if (objP2 != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP2 instanceof Enum ? ((Enum) objP2).ordinal() : objP2.hashCode()));
            } else if (objB == null || i18 != 207 || objB.equals(awVar)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) i18);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = this.l;
        xx2 xx2Var = this.j;
        ArrayList arrayList4 = this.s;
        f01 f01Var = this.M;
        if (xx2Var != null) {
            kw4 kw4Var = xx2Var.e;
            int i20 = xx2Var.b;
            ArrayList arrayList5 = xx2Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = xx2Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList6.get(i21));
                }
                i = -1;
                kx4 kx4Var2 = ui6.a;
                kx4 kx4Var3 = new kx4();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    ix3 ix3Var = (ix3) arrayList5.get(i22);
                    if (hashSet2.contains(ix3Var)) {
                        r94Var2 = r94Var3;
                        i7 = i22;
                        if (!kx4Var3.c(ix3Var)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                ix3 ix3Var2 = (ix3) arrayList6.get(i25);
                                if (ix3Var2 != ix3Var) {
                                    m33 m33Var = (m33) kw4Var.b(ix3Var2.c);
                                    int i26 = m33Var != null ? m33Var.b : -1;
                                    kx4Var3.a(ix3Var2);
                                    i10 = i24;
                                    if (i26 != i10) {
                                        m33 m33Var2 = (m33) kw4Var.b(ix3Var2.c);
                                        int i27 = m33Var2 != null ? m33Var2.c : ix3Var2.d;
                                        kx4Var = kx4Var3;
                                        int i28 = i26 + i20;
                                        i8 = size2;
                                        int i29 = i10 + i20;
                                        if (i27 > 0) {
                                            i9 = i20;
                                            int i30 = f01Var.l;
                                            if (i30 > 0) {
                                                arrayList2 = arrayList5;
                                                if (f01Var.j == i28 - i30 && f01Var.k == i29 - i30) {
                                                    f01Var.l = i30 + i27;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            f01Var.c();
                                            f01Var.j = i28;
                                            f01Var.k = i29;
                                            f01Var.l = i27;
                                        } else {
                                            i9 = i20;
                                            arrayList2 = arrayList5;
                                            f01Var.getClass();
                                        }
                                        if (i26 <= i10) {
                                            int i31 = i27;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i26) {
                                                Object[] objArr5 = kw4Var.c;
                                                long[] jArr5 = kw4Var.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i32 = 0;
                                                    while (true) {
                                                        long j = jArr5[i32];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i33 = 8 - ((~(i32 - length)) >>> 31);
                                                            int i34 = 0;
                                                            while (i34 < i33) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    m33 m33Var3 = (m33) objArr5[(i32 << 3) + i34];
                                                                    jArr2 = jArr5;
                                                                    int i35 = m33Var3.b;
                                                                    i13 = i26;
                                                                    if (i26 <= i35 && i35 < i13 + i31) {
                                                                        m33Var3.b = (i35 - i13) + i10;
                                                                    } else if (i13 + 1 <= i35 && i35 < i10) {
                                                                        m33Var3.b = i35 - i31;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i26;
                                                                }
                                                                j >>= 8;
                                                                i34++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i26 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                            if (i33 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                        }
                                                        if (i32 == length) {
                                                            break;
                                                        }
                                                        i32++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i26 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = kw4Var.c;
                                            long[] jArr6 = kw4Var.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i36 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i36];
                                                    int i37 = i27;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i36 - length2)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i39;
                                                                m33 m33Var4 = (m33) objArr6[(i36 << 3) + i39];
                                                                objArr4 = objArr6;
                                                                int i40 = m33Var4.b;
                                                                jArr4 = jArr6;
                                                                if (i26 <= i40 && i40 < i26 + i37) {
                                                                    m33Var4.b = (i40 - i26) + i10;
                                                                } else if (i10 <= i40 && i40 < i26) {
                                                                    m33Var4.b = i40 + i37;
                                                                }
                                                            } else {
                                                                i14 = i39;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i39 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i36 == length2) {
                                                        break;
                                                    }
                                                    i36++;
                                                    arrayList4 = arrayList4;
                                                    i27 = i37;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        kx4Var = kx4Var3;
                                        i8 = size2;
                                        i9 = i20;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    kx4Var = kx4Var3;
                                    i8 = size2;
                                    i9 = i20;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i24;
                                    i11 = i7 + 1;
                                }
                                i23 = i25 + 1;
                                m33 m33Var5 = (m33) kw4Var.b(ix3Var2.c);
                                int i41 = i10 + (m33Var5 != null ? m33Var5.c : ix3Var2.d);
                                i22 = i11;
                                xx2Var = xx2Var;
                                kx4Var3 = kx4Var;
                                size2 = i8;
                                i20 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i24 = i41;
                                r94Var3 = r94Var2;
                            } else {
                                i23 = i25;
                                r94Var3 = r94Var2;
                                i22 = i7;
                            }
                        }
                    } else {
                        r94Var2 = r94Var3;
                        m33 m33Var6 = (m33) kw4Var.b(ix3Var.c);
                        int i42 = m33Var6 != null ? m33Var6.b : -1;
                        int i43 = ix3Var.c;
                        i7 = i22;
                        f01Var.e(i42 + i20, ix3Var.d);
                        xx2Var.a(i43, 0);
                        f01Var.f = (i43 - f01Var.a.G.g) + f01Var.f;
                        this.G.r(i43);
                        H();
                        this.G.s();
                        j51.P(arrayList4, i43, this.G.b[(i43 * 5) + 3] + i43);
                    }
                    i22 = i7 + 1;
                    r94Var3 = r94Var2;
                }
                r94Var = r94Var3;
                arrayList = arrayList4;
                f01Var.c();
                if (arrayList5.size() > 0) {
                    g17 g17Var4 = this.G;
                    f01Var.f = (g17Var4.h - f01Var.a.G.g) + f01Var.f;
                    g17Var4.t();
                }
            } else {
                r94Var = r94Var3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            r94Var = r94Var3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            g17 g17Var5 = this.G;
            int i44 = g17Var5.m - g17Var5.l;
            if (i44 > 0) {
                if (i44 > 0) {
                    f01Var.d(false);
                    r94 r94Var4 = f01Var.d;
                    g17 g17Var6 = f01Var.a.G;
                    if (g17Var6.c > 0 && r94Var4.a(-2) != (i6 = g17Var6.i)) {
                        if (!f01Var.c && f01Var.e) {
                            f01Var.d(false);
                            f01Var.b.V.v0(x95.d);
                            f01Var.c = true;
                        }
                        if (i6 > 0) {
                            px2 px2VarA = g17Var6.a(i6);
                            r94Var4.c(i6);
                            f01Var.d(false);
                            va5 va5Var = f01Var.b.V;
                            va5Var.v0(w95.d);
                            lq1.E(va5Var, 0, px2VarA);
                            f01Var.c = true;
                        }
                    }
                    va5 va5Var2 = f01Var.b.V;
                    va5Var2.v0(na5.d);
                    va5Var2.q[va5Var2.r - va5Var2.f2293o[va5Var2.p - 1].b] = i44;
                } else {
                    f01Var.getClass();
                }
            }
        }
        int i45 = this.k;
        while (true) {
            g17 g17Var7 = this.G;
            if (g17Var7.k > 0 || (i5 = g17Var7.g) == g17Var7.h) {
                break;
            }
            H();
            f01Var.e(i45, this.G.s());
            j51.P(arrayList, i5, this.G.g);
        }
        if (z3) {
            if (z) {
                em2 em2Var = this.O;
                va5 va5Var3 = em2Var.p;
                if (va5Var3.p == 0) {
                    i01.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                va5 va5Var4 = em2Var.f725o;
                hm2[] hm2VarArr = va5Var3.f2293o;
                int i46 = va5Var3.p - 1;
                va5Var3.p = i46;
                hm2 hm2Var = hm2VarArr[i46];
                hm2VarArr[i46] = null;
                va5Var4.v0(hm2Var);
                Object[] objArr7 = va5Var3.s;
                Object[] objArr8 = va5Var4.s;
                int i47 = va5Var4.t;
                int i48 = hm2Var.c;
                int i49 = va5Var3.t;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = va5Var3.s;
                int i51 = va5Var3.t;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = va5Var3.q;
                int[] iArr2 = va5Var4.q;
                int i52 = va5Var4.r;
                int i53 = hm2Var.b;
                int i54 = va5Var3.r;
                cx.F0(i52 - i53, i54 - i53, i54, iArr, iArr2);
                va5Var3.t -= i48;
                va5Var3.r -= i53;
                i19 = 1;
            }
            g17 g17Var8 = this.G;
            if (g17Var8.k <= 0) {
                up5.a("Unbalanced begin/end empty");
            }
            g17Var8.k--;
            k17 k17Var2 = this.I;
            int i55 = k17Var2.v;
            k17Var2.i();
            if (this.G.k <= 0) {
                int i56 = (-2) - i55;
                this.I.j();
                this.I.e(true);
                px2 px2Var = this.N;
                boolean zU0 = this.O.f725o.u0();
                h17 h17Var = this.H;
                if (zU0) {
                    f01Var.b();
                    f01Var.d(false);
                    r94 r94Var5 = f01Var.d;
                    g17 g17Var9 = f01Var.a.G;
                    if (g17Var9.c <= 0 || r94Var5.a(-2) == (i4 = g17Var9.i)) {
                        i3 = 1;
                    } else {
                        if (!f01Var.c && f01Var.e) {
                            f01Var.d(false);
                            f01Var.b.V.v0(x95.d);
                            f01Var.c = true;
                        }
                        if (i4 > 0) {
                            px2 px2VarA2 = g17Var9.a(i4);
                            r94Var5.c(i4);
                            f01Var.d(false);
                            va5 va5Var5 = f01Var.b.V;
                            va5Var5.v0(w95.d);
                            lq1.E(va5Var5, 0, px2VarA2);
                            i3 = 1;
                            f01Var.c = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    f01Var.c();
                    va5 va5Var6 = f01Var.b.V;
                    va5Var6.v0(z95.d);
                    lq1.F(va5Var6, 0, px2Var, i3, h17Var);
                    r3 = 0;
                } else {
                    em2 em2Var2 = this.O;
                    f01Var.b();
                    f01Var.d(false);
                    r94 r94Var6 = f01Var.d;
                    g17 g17Var10 = f01Var.a.G;
                    if (g17Var10.c > 0 && r94Var6.a(-2) != (i2 = g17Var10.i)) {
                        if (!f01Var.c && f01Var.e) {
                            f01Var.d(false);
                            f01Var.b.V.v0(x95.d);
                            f01Var.c = true;
                        }
                        if (i2 > 0) {
                            px2 px2VarA3 = g17Var10.a(i2);
                            r94Var6.c(i2);
                            f01Var.d(false);
                            va5 va5Var7 = f01Var.b.V;
                            va5Var7.v0(w95.d);
                            lq1.E(va5Var7, 0, px2VarA3);
                            f01Var.c = true;
                        }
                    }
                    f01Var.c();
                    va5 va5Var8 = f01Var.b.V;
                    va5Var8.v0(aa5.d);
                    int i57 = va5Var8.t - va5Var8.f2293o[va5Var8.p - 1].c;
                    Object[] objArr10 = va5Var8.s;
                    objArr10[i57] = px2Var;
                    objArr10[i57 + 1] = h17Var;
                    objArr10[i57 + 2] = em2Var2;
                    this.O = new em2();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.n != 0) {
                    e0(i56, r3);
                    f0(i56, i19);
                }
            }
        } else {
            if (z) {
                f01Var.a();
            }
            int i58 = f01Var.a.G.i;
            r94 r94Var7 = f01Var.d;
            int i59 = i;
            if (r94Var7.a(i59) > i58) {
                i01.a("Missed recording an endGroup");
            }
            if (r94Var7.a(i59) == i58) {
                f01Var.d(false);
                r94Var7.b();
                f01Var.b.V.v0(t95.d);
            }
            int i60 = this.G.i;
            if (i19 != i0(i60)) {
                f0(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.G.e();
            f01Var.c();
        }
        ArrayList arrayList7 = this.i;
        xx2 xx2Var2 = (xx2) arrayList7.remove(arrayList7.size() - 1);
        if (xx2Var2 != null && !z3) {
            xx2Var2.c++;
        }
        this.j = xx2Var2;
        this.k = r94Var.b() + i19;
        this.m = r94Var.b();
        this.l = r94Var.b() + i19;
    }

    public final void q() {
        p(false);
        j56 j56VarW = w();
        if (j56VarW != null) {
            int i = j56VarW.b;
            if ((i & 1) != 0) {
                j56VarW.b = i | 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[LOOP:0: B:16:0x003f->B:28:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[EDGE_INSN: B:29:0x0085->B:30:0x0086 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x0085 A[SYNTHETIC] */
    public final j56 r() {
        j56 j56Var;
        px2 px2VarA;
        i56 i56Var;
        ArrayList arrayList = this.E;
        j56 j56Var2 = !arrayList.isEmpty() ? (j56) arrayList.remove(arrayList.size() - 1) : null;
        byte b = 0;
        if (j56Var2 != null) {
            j56Var2.b &= -9;
            this.g.H();
            int i = this.B;
            vw4 vw4Var = j56Var2.f;
            if (vw4Var == null || (j56Var2.b & 16) != 0) {
                i56Var = null;
                break;
            }
            Object[] objArr = vw4Var.b;
            int[] iArr = vw4Var.c;
            long[] jArr = vw4Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                i56Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                i56Var = new i56(b, i, j56Var2, vw4Var);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    i56Var = null;
                    break;
                }
                if (i2 == length) {
                    i56Var = null;
                    break;
                }
                i2++;
            }
            f01 f01Var = this.M;
            if (i56Var != null) {
                va5 va5Var = f01Var.b.V;
                va5Var.v0(s95.d);
                lq1.F(va5Var, 0, i56Var, 1, this.h);
            }
            int i6 = j56Var2.b;
            if ((i6 & 512) != 0) {
                j56Var2.b = i6 & (-513);
                va5 va5Var2 = f01Var.b.V;
                va5Var2.v0(v95.d);
                lq1.E(va5Var2, 0, j56Var2);
                int i7 = j56Var2.b;
                j56Var2.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    j56Var2.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (j56Var2 != null) {
            int i8 = j56Var2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (j56Var2.c == null) {
                    if (this.S) {
                        k17 k17Var = this.I;
                        px2VarA = k17Var.b(k17Var.v);
                    } else {
                        g17 g17Var = this.G;
                        px2VarA = g17Var.a(g17Var.i);
                    }
                    j56Var2.c = px2VarA;
                }
                j56Var2.b &= -5;
                j56Var = j56Var2;
            } else {
                j56Var = null;
            }
        } else {
            j56Var = null;
        }
        p(false);
        return j56Var;
    }

    public final void s() {
        p(false);
        this.b.c();
        p(false);
        f01 f01Var = this.M;
        if (f01Var.c) {
            f01Var.d(false);
            f01Var.d(false);
            f01Var.b.V.v0(t95.d);
            f01Var.c = false;
        }
        f01Var.b();
        if (f01Var.d.b != 0) {
            i01.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            i01.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void t(boolean z, xx2 xx2Var) {
        this.i.add(this.j);
        this.j = xx2Var;
        int i = this.l;
        r94 r94Var = this.n;
        r94Var.c(i);
        r94Var.c(this.m);
        r94Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void u() {
        h17 h17Var = new h17();
        if (this.C) {
            h17Var.b();
        }
        if (this.b.d()) {
            h17Var.w = new kw4();
        }
        this.H = h17Var;
        k17 k17VarD = h17Var.d();
        k17VarD.e(true);
        this.I = k17VarD;
    }

    public final p01 v() {
        vx2 vx2Var = this.U;
        if (vx2Var != null) {
            return vx2Var;
        }
        vx2 vx2Var2 = new vx2(this.h);
        this.U = vx2Var2;
        return vx2Var2;
    }

    public final j56 w() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (j56) ua5.j(1, arrayList);
    }

    public final boolean x() {
        if (!z() || this.w) {
            return true;
        }
        j56 j56VarW = w();
        return (j56VarW == null || (j56VarW.b & 4) == 0) ? false : true;
    }

    public final q01 y() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean z() {
        j56 j56VarW;
        return (this.S || this.y || this.w || (j56VarW = w()) == null || (j56VarW.b & 8) != 0) ? false : true;
    }
}
