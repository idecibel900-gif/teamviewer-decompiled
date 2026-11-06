package o;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class rg4 extends jl5 implements bu4, oc5, fo4 {
    public static final ek3 E = new ek3(19);
    public static final ek3 F = new ek3(20);
    public boolean A;
    public final sg4 B = new sg4(this, 0);
    public r8 C;
    public jx4 D;
    public qg4 r;
    public Function1 s;
    public hw2 t;
    public Function1 u;
    public ll5 v;
    public jx4 w;
    public boolean x;
    public jx4 y;
    public boolean z;

    public static void L0(e45 e45Var) {
        c14 c14Var;
        e45 e45Var2 = e45Var.J;
        LayoutNode layoutNode = e45Var.G;
        if (!im3.n(e45Var2 != null ? e45Var2.G : null, layoutNode)) {
            layoutNode.getLayoutDelegate().p.K.f();
            return;
        }
        me meVarG = layoutNode.getLayoutDelegate().p.g();
        if (meVarG == null || (c14Var = ((co4) meVarG).K) == null) {
            return;
        }
        c14Var.f();
    }

    public abstract LayoutNode D0();

    public abstract eo4 F0();

    @Override // o.bu4
    public final void H(boolean z) {
        rg4 rg4VarI0 = I0();
        LayoutNode layoutNodeD0 = rg4VarI0 != null ? rg4VarI0.D0() : null;
        if (im3.n(layoutNodeD0, D0())) {
            this.x = z;
            return;
        }
        if ((layoutNodeD0 != null ? layoutNodeD0.v() : null) != y04.f2568o) {
            if ((layoutNodeD0 != null ? layoutNodeD0.v() : null) != y04.p) {
                return;
            }
        }
        this.x = z;
    }

    public abstract rg4 I0();

    public abstract long J0();

    public final qg4 K0() {
        qg4 qg4Var = this.r;
        if (qg4Var != null) {
            return qg4Var;
        }
        qg4 qg4Var2 = new qg4(this);
        this.r = qg4Var2;
        return qg4Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M0(kx4 kx4Var) {
        LayoutNode layoutNode;
        Object[] objArr = kx4Var.b;
        long[] jArr = kx4Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((gh8) objArr[(i << 3) + i3]).get()) != null) {
                        if (b0()) {
                            layoutNode.r0(false);
                        } else {
                            layoutNode.t0(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void N0();

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:14:0x0033->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:1: B:14:0x0033->B:24:0x006a], SYNTHETIC] */
    public final void O0() {
        r8 r8Var = this.C;
        if (r8Var != null) {
            int i = r8Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((e63[]) r8Var.c)[i2] = null;
                ((float[]) r8Var.d)[i2] = Float.NaN;
                ((byte[]) r8Var.e)[i2] = 0;
            }
            r8Var.b = 0;
        }
        jx4 jx4Var = this.D;
        if (jx4Var == null) {
            return;
        }
        Object[] objArr = jx4Var.c;
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
                            M0((kx4) objArr[(i3 << 3) + i5]);
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
        jx4Var.a();
    }

    @Override // o.jl5
    public final int W(ie ieVar) {
        int iP0;
        if (!z0() || (iP0 = p0(ieVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = ieVar instanceof id8;
        long j = this.q;
        return iP0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // o.bm3
    public boolean b0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(LayoutNode layoutNode, e63 e63Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        jx4 jx4Var = this.D;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (jx4Var != null) {
            Object[] objArr = jx4Var.c;
            long[] jArr3 = jx4Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                kx4 kx4Var = (kx4) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = kx4Var.b;
                                long[] jArr4 = kx4Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    LayoutNode layoutNode2 = (LayoutNode) ((gh8) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (layoutNode2 != null) {
                                                        boolean zW = layoutNode2.W();
                                                        i4 = i8;
                                                        if (zW) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    kx4Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        jx4 jx4Var2 = this.D;
        if (jx4Var2 != null) {
            long[] jArr5 = jx4Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((kx4) jx4Var2.c[i18]).g()) {
                                    jx4Var2.l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        jx4 jx4Var3 = this.D;
        if (jx4Var3 == null) {
            jx4Var3 = new jx4();
            this.D = jx4Var3;
        }
        Object objG = jx4Var3.g(e63Var);
        if (objG == null) {
            objG = new kx4();
            jx4Var3.m(e63Var, objG);
        }
        ((kx4) objG).j(new gh8(layoutNode));
    }

    @Override // o.fo4
    public final eo4 o0(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ki3.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new pv(i, i2, map, function1, function2, this, (byte) 1);
    }

    public abstract int p0(ie ieVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(final ll5 ll5Var, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        LayoutNode layoutNode;
        boolean z2;
        int i;
        char c2;
        long j6;
        pc5 snapshotObserver;
        jx4 jx4Var = this.D;
        r8 r8Var = this.C;
        if (r8Var == null) {
            r8Var = new r8();
            this.C = r8Var;
        }
        r8 r8Var2 = r8Var;
        Owner owner = D0().A;
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.a.f(ll5Var, E, new Function0() { // from class: o.pg4
                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    rg4 rg4Var = this.m;
                    rg4Var.K0().m = false;
                    rg4Var.K0().n = j;
                    rg4Var.K0().f1829o = j2;
                    Function1 function1G = ll5Var.m.g();
                    if (function1G != null) {
                        function1G.invoke(rg4Var.K0());
                    }
                    return f88.a;
                }
            });
        }
        boolean zB0 = b0();
        kx4 kx4Var = (kx4) r8Var2.f;
        kx4 kx4Var2 = (kx4) r8Var2.g;
        int i2 = r8Var2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) r8Var2.e)[i3];
            if (b == 3) {
                e63 e63Var = ((e63[]) r8Var2.c)[i3];
                e63Var.getClass();
                kx4Var2.j(e63Var);
            } else if (b != 0 && jx4Var != null) {
                e63 e63Var2 = ((e63[]) r8Var2.c)[i3];
                e63Var2.getClass();
                kx4 kx4Var3 = (kx4) jx4Var.k(e63Var2);
                if (kx4Var3 != null) {
                    kx4Var.k(kx4Var3);
                }
            }
        }
        int i4 = r8Var2.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) r8Var2.e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                e63[] e63VarArr = (e63[]) r8Var2.c;
                e63VarArr[i6 - i5] = e63VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = r8Var2.b;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((e63[]) r8Var2.c)[i8] = null;
        }
        r8Var2.b -= i5;
        rg4 rg4VarI0 = I0();
        Object[] objArr = kx4Var2.b;
        long[] jArr = kx4Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            e63 e63Var3 = (e63) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            rg4 rg4Var = rg4VarI0 == null ? this : rg4VarI0;
                            i = i9;
                            rg4 rg4Var2 = rg4Var;
                            while (true) {
                                r8 r8Var3 = rg4Var2.C;
                                if (r8Var3 != null) {
                                    z2 = zB0;
                                    if (cx.B0(e63Var3, (e63[]) r8Var3.c)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zB0;
                                rg4 rg4VarI1 = rg4Var2.I0();
                                if (rg4VarI1 == null) {
                                    break;
                                }
                                rg4Var2 = rg4VarI1;
                                zB0 = z2;
                            }
                            jx4 jx4Var2 = rg4Var2.D;
                            kx4 kx4Var4 = jx4Var2 != null ? (kx4) jx4Var2.k(e63Var3) : null;
                            if (kx4Var4 != null) {
                                rg4Var.M0(kx4Var4);
                            }
                        } else {
                            z2 = zB0;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zB0 = z2;
                    }
                    z = zB0;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zB0;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zB0 = z;
                i9 = 8;
            }
        } else {
            z = zB0;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        kx4Var2.b();
        Object[] objArr2 = kx4Var.b;
        long[] jArr2 = kx4Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (layoutNode = (LayoutNode) ((gh8) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                layoutNode.r0(false);
                            } else {
                                layoutNode.t0(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        kx4Var.b();
    }

    public boolean s() {
        return D0().W();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    public final void u0(eo4 eo4Var) {
        long j;
        char c;
        long j2;
        long j3;
        qg4 qg4Var;
        jx4 jx4Var;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        boolean z;
        r8 r8Var;
        jx4 jx4Var2;
        kx4 kx4Var;
        qg4 qg4Var2;
        long j4;
        if (this.A) {
            return;
        }
        Function1 function1G = eo4Var.g();
        hw2 hw2VarF = eo4Var.f();
        Function1 function1E = eo4Var.e();
        long j5 = 0;
        if (hw2VarF == null) {
            long jO = 9223372034707292159L;
            if (function1G == null) {
                O0();
                this.s = null;
                this.t = null;
                this.u = null;
                qg4 qg4Var3 = this.r;
                if (qg4Var3 != null) {
                    qg4Var3.m = false;
                }
                if (qg4Var3 != null) {
                    qg4Var3.n = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.t = null;
            this.u = null;
            boolean z2 = this.s != function1G;
            if (!z2 && K0().m) {
                i04 i04VarX0 = x0();
                jO = us1.O(i04VarX0.A(0L));
                j5 = i04VarX0.j();
                z2 = (vk3.a(jO, K0().n) && dl3.b(j5, K0().f1829o)) ? false : true;
            }
            if (z2) {
                ll5 ll5Var = this.v;
                if (ll5Var != null) {
                    ll5Var.m = eo4Var;
                } else {
                    ll5Var = new ll5(eo4Var, this, null);
                    this.v = ll5Var;
                }
                r0(ll5Var, jO, j5);
                this.s = eo4Var.g();
                return;
            }
            return;
        }
        if (hw2VarF != this.t || function1E != this.u) {
            this.t = hw2VarF;
            this.u = function1E;
            O0();
            return;
        }
        jx4 jx4Var3 = this.y;
        long j6 = -9187201950435737472L;
        int i3 = 8;
        if (jx4Var3 != null) {
            Object[] objArr3 = jx4Var3.c;
            long[] jArr3 = jx4Var3.a;
            j2 = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                c = 7;
                int i4 = 0;
                qg4Var2 = null;
                while (true) {
                    long j7 = jArr3[i4];
                    j3 = 255;
                    if ((((~j7) << 7) & j7 & j6) != j6) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j7 & 255) < 128) {
                                j4 = j6;
                                qg4 qg4Var4 = (qg4) objArr3[(i4 << 3) + i6];
                                if (qg4Var4.m) {
                                    qg4Var2 = qg4Var4;
                                }
                            } else {
                                j4 = j6;
                            }
                            j7 >>= 8;
                            i6++;
                            j6 = j4;
                        }
                        j = j6;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        j = j6;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    j6 = j;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                j3 = 255;
                qg4Var2 = null;
            }
            qg4Var = qg4Var2;
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 128;
            j3 = 255;
            qg4Var = null;
        }
        if (qg4Var == null) {
            return;
        }
        i04 i04VarX1 = x0();
        long jO2 = us1.O(i04VarX1.A(0L));
        long j8 = i04VarX1.j();
        if ((vk3.a(jO2, qg4Var.n) && dl3.b(j8, qg4Var.f1829o)) || (jx4Var = this.y) == null) {
            return;
        }
        Object[] objArr4 = jx4Var.b;
        Object[] objArr5 = jx4Var.c;
        long[] jArr4 = jx4Var.a;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j9 = jArr4[i7];
            int i8 = length2;
            if ((((~j9) << c) & j9 & j) != j) {
                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j9 & j3) < j2) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr4[i11];
                        qg4 qg4Var5 = (qg4) objArr5[i11];
                        i2 = i3;
                        e63 e63Var = (e63) obj;
                        jArr2 = jArr4;
                        if (qg4Var5.m) {
                            objArr2 = objArr4;
                            z = (dl3.b(qg4Var5.f1829o, j8) && vk3.a(qg4Var5.n, jO2)) ? false : true;
                            qg4Var5.f1829o = j8;
                            qg4Var5.n = jO2;
                            qg4Var5.m = false;
                            if (!z) {
                                r8Var = this.C;
                                if (r8Var != null) {
                                    r8Var.I(e63Var);
                                }
                                jx4Var2 = this.D;
                                if (jx4Var2 != null) {
                                    kx4Var = (kx4) jx4Var2.g(e63Var);
                                } else {
                                    kx4Var = null;
                                }
                                if (kx4Var != null) {
                                    M0(kx4Var);
                                    kx4Var.b();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        qg4Var5.f1829o = j8;
                        qg4Var5.n = jO2;
                        qg4Var5.m = false;
                        if (!z) {
                            r8Var = this.C;
                            if (r8Var != null) {
                                r8Var.I(e63Var);
                            }
                            jx4Var2 = this.D;
                            if (jx4Var2 != null) {
                                kx4Var = (kx4) jx4Var2.g(e63Var);
                            } else {
                                kx4Var = null;
                            }
                            if (kx4Var != null) {
                                M0(kx4Var);
                                kx4Var.b();
                            }
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        i2 = i3;
                    }
                    j9 >>= i2;
                    i10++;
                    objArr4 = objArr2;
                    i3 = i2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
            }
            length2 = i8;
            if (i7 == length2) {
                return;
            }
            i7++;
            i3 = i;
            objArr4 = objArr;
            jArr4 = jArr;
        }
    }

    public abstract rg4 v0();

    public abstract i04 x0();

    public abstract boolean z0();
}
