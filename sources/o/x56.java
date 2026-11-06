package o;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class x56 {
    public final tk3 a;
    public final AndroidComposeView b;
    public final ae c;
    public final ev7 d;
    public final zw4 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public lg i;
    public long j;
    public final y26 k;
    public final ix4 l;

    public x56(kw4 kw4Var, AndroidComposeView androidComposeView) {
        this.a = kw4Var;
        this.b = androidComposeView;
        ae aeVar = new ae((byte) 11);
        aeVar.c = new long[192];
        aeVar.d = new long[192];
        this.c = aeVar;
        this.d = new ev7();
        this.e = new zw4();
        this.j = -1L;
        this.k = new y26(this, (byte) 1);
        this.l = new ix4();
    }

    public static boolean c(e45 e45Var) {
        nc5 nc5Var = e45Var.h0;
        return (nc5Var == null || ct1.L(((o03) nc5Var).b())) ? false : true;
    }

    public static long f(LayoutNode layoutNode) {
        e45 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        long jC = 0;
        for (e45 e45Var = (ti3) layoutNode.S.d; e45Var != null && e45Var != outerCoordinator$ui; e45Var = e45Var.K) {
            if (c(e45Var)) {
                return 9223372034707292159L;
            }
            jC = vk3.c(jC, e45Var.T);
        }
        return jC;
    }

    public static void i(LayoutNode layoutNode) {
        if (!layoutNode.f13o || c(layoutNode.getOuterCoordinator$ui())) {
            return;
        }
        layoutNode.f13o = false;
        if (layoutNode.q) {
            layoutNode.p = f(layoutNode);
            layoutNode.q = false;
        }
        if (vk3.a(layoutNode.p, 9223372034707292159L)) {
            return;
        }
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            i((LayoutNode) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0227  */
    /* JADX WARN: Code duplicated, block: B:110:0x024c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0262  */
    /* JADX WARN: Code duplicated, block: B:115:0x0276  */
    /* JADX WARN: Code duplicated, block: B:117:0x0286  */
    /* JADX WARN: Code duplicated, block: B:119:0x028c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0295 A[LOOP:11: B:120:0x0293->B:121:0x0295, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02dd A[LOOP:9: B:113:0x0267->B:128:0x02dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ef A[LOOP:12: B:134:0x02ed->B:135:0x02ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:139:0x0301  */
    /* JADX WARN: Code duplicated, block: B:143:0x030a  */
    /* JADX WARN: Code duplicated, block: B:167:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02e8 A[EDGE_INSN: B:168:0x02e8->B:131:0x02e8 BREAK  A[LOOP:9: B:113:0x0267->B:128:0x02dd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba A[LOOP:7: B:92:0x01b8->B:93:0x01ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0201  */
    public final void a() {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        ev7 ev7Var;
        ae aeVar;
        long j5;
        long j6;
        long j7;
        float[] fArr;
        Object[] objArr;
        long[] jArr;
        int length;
        long jA;
        dv7 dv7Var;
        long j8;
        dv7 dv7Var2;
        int i;
        long j9;
        long j10;
        long j11;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j12;
        int i7;
        int i8;
        dv7 dv7Var3;
        long[] jArr2;
        long[] jArr3;
        int i9;
        int i10;
        int i11;
        long j13;
        long j14;
        float[] fArr2;
        dv7 dv7Var4;
        dv7 dv7Var5;
        long j15;
        long j16;
        lg lgVar = this.i;
        if (lgVar != null) {
            this.b.removeCallbacks(lgVar);
            this.i = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f;
        boolean z3 = z2 || this.g;
        ae aeVar2 = this.c;
        boolean z4 = true;
        ev7 ev7Var2 = this.d;
        if (z2) {
            this.f = false;
            zw4 zw4Var = this.e;
            Object[] objArr2 = zw4Var.a;
            int i12 = zw4Var.b;
            for (int i13 = 0; i13 < i12; i13++) {
                ((Function0) objArr2[i13]).a();
            }
            long[] jArr4 = (long[]) aeVar2.c;
            int i14 = aeVar2.b;
            int i15 = 0;
            while (i15 < jArr4.length - 2 && i15 < i14) {
                boolean z5 = z4;
                int i16 = i14;
                long j17 = jArr4[i15 + 2];
                boolean z6 = z3;
                if ((((int) (j17 >> 60)) & 1) != 0) {
                    long j18 = jArr4[i15];
                    long j19 = jArr4[i15 + 1];
                    dv7 dv7Var6 = (dv7) ev7Var2.a.b(((int) j17) & 33554431);
                    while (dv7Var6 != null) {
                        dv7 dv7Var7 = dv7Var6.f;
                        int i17 = i15;
                        long j20 = dv7Var6.i;
                        long j21 = dv7Var6.b;
                        long j22 = dv7Var6.c;
                        boolean z7 = (jCurrentTimeMillis - j20 >= j21 || j20 == Long.MIN_VALUE) ? z5 : false;
                        boolean z8 = j22 == 0 ? z5 : false;
                        boolean z9 = j21 == 0 ? z5 : false;
                        dv7Var6.g = j18;
                        dv7Var6.h = j19;
                        boolean z10 = ((z8 || z9) && !z8) ? false : z5;
                        if (z7 && z10) {
                            j16 = j19;
                            dv7Var6.j = -1L;
                            dv7Var6.i = jCurrentTimeMillis;
                            j15 = j18;
                            dv7Var6.a(j15, j16, ev7Var2.d, ev7Var2.e, ev7Var2.g);
                        } else {
                            j15 = j18;
                            j16 = j19;
                            if (!z8) {
                                dv7Var6.j = jCurrentTimeMillis;
                                long j23 = ev7Var2.c;
                                long j24 = j22 + jCurrentTimeMillis;
                                if (j23 > 0 && j24 < j23) {
                                    ev7Var2.c = j23;
                                }
                            }
                        }
                        i15 = i17;
                        dv7Var6 = dv7Var7;
                        j18 = j15;
                        j19 = j16;
                    }
                }
                i15 += 3;
                i14 = i16;
                z3 = z6;
                z4 = z5;
            }
            z = z3;
            j = 0;
            long[] jArr5 = (long[]) aeVar2.c;
            int i18 = aeVar2.b;
            for (int i19 = 0; i19 < jArr5.length - 2 && i19 < i18; i19 += 3) {
                int i20 = i19 + 2;
                jArr5[i20] = jArr5[i20] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.g) {
            this.g = false;
            long j25 = ev7Var2.d;
            long j26 = ev7Var2.e;
            j2 = jCurrentTimeMillis;
            float[] fArr3 = ev7Var2.g;
            kw4 kw4Var = ev7Var2.a;
            j3 = 128;
            Object[] objArr3 = kw4Var.c;
            long[] jArr6 = kw4Var.a;
            int length2 = jArr6.length - 2;
            if (length2 >= 0) {
                int i21 = 0;
                j4 = 255;
                while (true) {
                    long j27 = jArr6[i21];
                    long[] jArr7 = jArr6;
                    ev7 ev7Var3 = ev7Var2;
                    if ((((~j27) << 7) & j27 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                        long j28 = j27;
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j28 & 255) < 128) {
                                dv7 dv7Var8 = (dv7) objArr3[(i21 << 3) + i23];
                                while (dv7Var8 != null) {
                                    ae aeVar3 = aeVar2;
                                    dv7 dv7Var9 = dv7Var8;
                                    ev7Var3.b(dv7Var9, j25, j26, fArr3, j2);
                                    dv7Var8 = dv7Var9.f;
                                    aeVar2 = aeVar3;
                                }
                            }
                            j28 >>= 8;
                            i23++;
                            ev7Var3 = ev7Var3;
                            aeVar2 = aeVar2;
                        }
                        aeVar2 = aeVar2;
                        ev7Var2 = ev7Var3;
                        if (i22 != 8) {
                            break;
                        }
                    } else {
                        aeVar2 = aeVar2;
                        ev7Var2 = ev7Var3;
                    }
                    if (i21 == length2) {
                        break;
                    }
                    i21++;
                    aeVar2 = aeVar2;
                    jArr6 = jArr7;
                }
            }
            if (z) {
                j13 = ev7Var2.d;
                j14 = ev7Var2.e;
                fArr2 = ev7Var2.g;
                dv7Var4 = ev7Var2.b;
                if (dv7Var4 != null) {
                    dv7Var5 = dv7Var4;
                    while (dv7Var5 != null) {
                        LayoutNode layoutNodeP0 = vn4.p0(dv7Var5.d);
                        long jB = e14.a(layoutNodeP0).getRectManager().b(layoutNodeP0);
                        dv7Var5.g = jB;
                        dv7Var5.h = (((long) (layoutNodeP0.I() + ((int) (jB >> 32)))) << 32) | (((long) (layoutNodeP0.r() + ((int) (jB & 4294967295L)))) & 4294967295L);
                        ev7Var2.b(dv7Var5, j13, j14, fArr2, j2);
                        dv7Var5 = dv7Var5.f;
                        aeVar2 = aeVar2;
                    }
                }
            }
            ev7Var = ev7Var2;
            aeVar = aeVar2;
            if (this.h) {
                this.h = false;
                jArr2 = (long[]) aeVar.c;
                int i24 = aeVar.b;
                jArr3 = (long[]) aeVar.d;
                i10 = 0;
                for (i9 = 0; i9 < jArr2.length - 2 && i10 < jArr3.length - 2 && i9 < i24; i9 += 3) {
                    i11 = i9 + 2;
                    if (jArr2[i11] != w56.a) {
                        jArr3[i10] = jArr2[i9];
                        jArr3[i10 + 1] = jArr2[i9 + 1];
                        jArr3[i10 + 2] = jArr2[i11];
                        i10 += 3;
                    }
                }
                aeVar.b = i10;
                aeVar.c = jArr3;
                aeVar.d = jArr2;
            }
            j5 = ev7Var.c;
            if (j5 <= j2) {
                j6 = ev7Var.d;
                j7 = ev7Var.e;
                fArr = ev7Var.g;
                kw4 kw4Var2 = ev7Var.a;
                objArr = kw4Var2.c;
                jArr = kw4Var2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    j9 = Long.MAX_VALUE;
                    while (true) {
                        j10 = jArr[i];
                        j11 = j6;
                        i2 = length;
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            i5 = 8;
                            i6 = 8 - ((~(i - i2)) >>> 31);
                            jA = j9;
                            j12 = j10;
                            i7 = 0;
                            while (i7 < i6) {
                                if ((j12 & j4) < j3) {
                                    dv7Var3 = (dv7) objArr[(i << 3) + i7];
                                    while (dv7Var3 != null) {
                                        int i25 = i6;
                                        dv7 dv7Var10 = dv7Var3;
                                        long j29 = j11;
                                        int i26 = i7;
                                        int i27 = i5;
                                        int i28 = i;
                                        long j30 = j2;
                                        jA = ev7.a(dv7Var10, j29, j7, fArr, j30, jA);
                                        j2 = j30;
                                        i = i28;
                                        i5 = i27;
                                        i7 = i26;
                                        j11 = j29;
                                        i2 = i2;
                                        dv7Var3 = dv7Var10.f;
                                        i6 = i25;
                                    }
                                }
                                int i29 = i6;
                                long j31 = j11;
                                int i30 = i7;
                                int i31 = i5;
                                j12 >>= i31;
                                int i32 = i30 + 1;
                                j11 = j31;
                                i2 = i2;
                                i = i;
                                i5 = i31;
                                i7 = i32;
                                i6 = i29;
                            }
                            i3 = i2;
                            i8 = i5;
                            j6 = j11;
                            i4 = i;
                            if (i6 == i8) {
                                break;
                            } else {
                                j9 = jA;
                            }
                        } else {
                            i3 = i2;
                            i4 = i;
                            j6 = j11;
                        }
                        if (i4 != i3) {
                            jA = j9;
                            break;
                        } else {
                            i = i4 + 1;
                            length = i3;
                        }
                    }
                } else {
                    jA = Long.MAX_VALUE;
                }
                dv7Var = ev7Var.b;
                if (dv7Var != null) {
                    for (dv7Var2 = dv7Var; dv7Var2 != null; dv7Var2 = dv7Var2.f) {
                        long j32 = j2;
                        jA = ev7.a(dv7Var2, j6, j7, fArr, j32, jA);
                        j2 = j32;
                    }
                }
                if (jA == Long.MAX_VALUE) {
                    j8 = -1;
                } else {
                    j8 = jA;
                }
                ev7Var.c = j8;
                j5 = j8;
            }
            if (j5 > j) {
                j();
            }
        }
        j2 = jCurrentTimeMillis;
        j3 = 128;
        j4 = 255;
        if (z) {
            j13 = ev7Var2.d;
            j14 = ev7Var2.e;
            fArr2 = ev7Var2.g;
            dv7Var4 = ev7Var2.b;
            if (dv7Var4 != null) {
                dv7Var5 = dv7Var4;
                while (dv7Var5 != null) {
                    LayoutNode layoutNodeP1 = vn4.p0(dv7Var5.d);
                    long jB2 = e14.a(layoutNodeP1).getRectManager().b(layoutNodeP1);
                    dv7Var5.g = jB2;
                    dv7Var5.h = (((long) (layoutNodeP1.I() + ((int) (jB2 >> 32)))) << 32) | (((long) (layoutNodeP1.r() + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    ev7Var2.b(dv7Var5, j13, j14, fArr2, j2);
                    dv7Var5 = dv7Var5.f;
                    aeVar2 = aeVar2;
                }
            }
        }
        ev7Var = ev7Var2;
        aeVar = aeVar2;
        if (this.h) {
            this.h = false;
            jArr2 = (long[]) aeVar.c;
            int i210 = aeVar.b;
            jArr3 = (long[]) aeVar.d;
            i10 = 0;
            while (i9 < jArr2.length - 2) {
                i11 = i9 + 2;
                if (jArr2[i11] != w56.a) {
                    jArr3[i10] = jArr2[i9];
                    jArr3[i10 + 1] = jArr2[i9 + 1];
                    jArr3[i10 + 2] = jArr2[i11];
                    i10 += 3;
                }
            }
            aeVar.b = i10;
            aeVar.c = jArr3;
            aeVar.d = jArr2;
        }
        j5 = ev7Var.c;
        if (j5 <= j2) {
            j6 = ev7Var.d;
            j7 = ev7Var.e;
            fArr = ev7Var.g;
            kw4 kw4Var3 = ev7Var.a;
            objArr = kw4Var3.c;
            jArr = kw4Var3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j9 = Long.MAX_VALUE;
                while (true) {
                    j10 = jArr[i];
                    j11 = j6;
                    i2 = length;
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        i5 = 8;
                        i6 = 8 - ((~(i - i2)) >>> 31);
                        jA = j9;
                        j12 = j10;
                        i7 = 0;
                        while (i7 < i6) {
                            if ((j12 & j4) < j3) {
                                dv7Var3 = (dv7) objArr[(i << 3) + i7];
                                while (dv7Var3 != null) {
                                    int i211 = i6;
                                    dv7 dv7Var11 = dv7Var3;
                                    long j210 = j11;
                                    int i212 = i7;
                                    int i213 = i5;
                                    int i214 = i;
                                    long j33 = j2;
                                    jA = ev7.a(dv7Var11, j210, j7, fArr, j33, jA);
                                    j2 = j33;
                                    i = i214;
                                    i5 = i213;
                                    i7 = i212;
                                    j11 = j210;
                                    i2 = i2;
                                    dv7Var3 = dv7Var11.f;
                                    i6 = i211;
                                }
                            }
                            int i215 = i6;
                            long j34 = j11;
                            int i33 = i7;
                            int i34 = i5;
                            j12 >>= i34;
                            int i35 = i33 + 1;
                            j11 = j34;
                            i2 = i2;
                            i = i;
                            i5 = i34;
                            i7 = i35;
                            i6 = i215;
                        }
                        i3 = i2;
                        i8 = i5;
                        j6 = j11;
                        i4 = i;
                        if (i6 == i8) {
                            break;
                            break;
                        }
                        j9 = jA;
                    } else {
                        i3 = i2;
                        i4 = i;
                        j6 = j11;
                    }
                    if (i4 != i3) {
                        jA = j9;
                        break;
                    } else {
                        i = i4 + 1;
                        length = i3;
                    }
                }
            } else {
                jA = Long.MAX_VALUE;
            }
            dv7Var = ev7Var.b;
            if (dv7Var != null) {
                while (dv7Var2 != null) {
                    long j35 = j2;
                    jA = ev7.a(dv7Var2, j6, j7, fArr, j35, jA);
                    j2 = j35;
                }
            }
            if (jA == Long.MAX_VALUE) {
                j8 = -1;
            } else {
                j8 = jA;
            }
            ev7Var.c = j8;
            j5 = j8;
        }
        if (j5 > j) {
            j();
        }
    }

    public final long b(LayoutNode layoutNode) {
        if (layoutNode.s == -4) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.c)[d(layoutNode)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    public final int d(LayoutNode layoutNode) {
        int i = layoutNode.s;
        if (i != -4) {
            int i2 = layoutNode.n;
            ae aeVar = this.c;
            long[] jArr = (long[]) aeVar.c;
            if (i < 0 || i >= aeVar.b - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = aeVar.b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4 - 2) {
                        i = -4;
                        break;
                    }
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                    i5 += 3;
                }
            }
        } else {
            i = -4;
            break;
        }
        if (i == -4) {
            ki3.a("LayoutNode " + layoutNode.n + " not found in RectList");
        }
        layoutNode.s = i;
        return i;
    }

    public final void e(LayoutNode layoutNode) {
        layoutNode.f13o = true;
        nf nfVar = layoutNode.S;
        co4 co4VarZ = layoutNode.z();
        int iY = co4VarZ.Y();
        float fX = co4VarZ.X();
        ix4 ix4Var = this.l;
        ix4Var.a = 0.0f;
        ix4Var.b = 0.0f;
        ix4Var.c = iY;
        ix4Var.d = fX;
        for (e45 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui(); outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.K) {
            LayoutNode layoutNode2 = outerCoordinator$ui.G;
            if (outerCoordinator$ui == layoutNode2.getOuterCoordinator$ui() && !layoutNode2.f13o) {
                long jB = b(layoutNode2);
                if (!vk3.a(jB, 9223372034707292159L)) {
                    ix4Var.c((((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            nc5 nc5Var = outerCoordinator$ui.h0;
            if (nc5Var != null) {
                float[] fArrB = ((o03) nc5Var).b();
                if (!ct1.L(fArrB)) {
                    wn4.c(fArrB, ix4Var);
                }
            }
            long j = outerCoordinator$ui.T;
            ix4Var.c((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
        }
        int i = (int) ix4Var.a;
        int i2 = (int) ix4Var.b;
        int i3 = (int) ix4Var.c;
        int i4 = (int) ix4Var.d;
        int i5 = layoutNode.n;
        int i6 = layoutNode.s;
        ae aeVar = this.c;
        if (i6 != -4) {
            int iD = d(layoutNode);
            long[] jArr = (long[]) aeVar.c;
            jArr[iD] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iD + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i7 = iD + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            LayoutNode layoutNodeF = layoutNode.F();
            layoutNode.s = aeVar.i(i5, i, i2, i3, i4, layoutNodeF != null ? layoutNodeF.n : -1, layoutNodeF != null ? d(layoutNodeF) : -4, nfVar.f(1024), nfVar.f(16), this.d.a.a(i5));
        }
        layoutNode.r = false;
        this.f = true;
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i8 = xx4VarL.f2559o;
        for (int i9 = 0; i9 < i8; i9++) {
            LayoutNode layoutNode3 = (LayoutNode) objArr[i9];
            if (layoutNode3.X()) {
                e(layoutNode3);
            }
        }
    }

    public final void g(LayoutNode layoutNode) {
        long j;
        boolean zX = layoutNode.X();
        nf nfVar = layoutNode.S;
        if (zX && layoutNode.r) {
            LayoutNode layoutNodeF = layoutNode.F();
            if (layoutNodeF == null || layoutNodeF.f13o) {
                j = layoutNodeF == null ? 0L : 9223372034707292159L;
            } else {
                if (layoutNodeF.q) {
                    layoutNodeF.q = false;
                    layoutNodeF.p = f(layoutNodeF);
                }
                j = layoutNodeF.p;
            }
            e45 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
            if (vk3.a(j, 9223372034707292159L) || c(outerCoordinator$ui)) {
                e(layoutNode);
            } else if (layoutNode.f13o) {
                e(layoutNode);
                i(layoutNode);
            } else {
                long jC = vk3.c(j, outerCoordinator$ui.T);
                co4 co4VarZ = layoutNode.z();
                int iY = co4VarZ.Y();
                int iX = co4VarZ.X();
                int i = layoutNode.s;
                ae aeVar = this.c;
                if (i != -4) {
                    int iD = d(layoutNode);
                    if (layoutNodeF != null) {
                        int iD2 = d(layoutNodeF);
                        long[] jArr = (long[]) aeVar.c;
                        long j2 = jArr[iD2];
                        int i2 = ((int) (j2 >> 32)) + ((int) (jC >> 32));
                        int i3 = ((int) j2) + ((int) (jC & 4294967295L));
                        long j3 = jArr[iD];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = iD + 2;
                        long j4 = jArr[i6];
                        jArr[iD] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[iD + 1] = (((long) (iY + i2)) << 32) | (((long) (iX + i3)) & 4294967295L);
                        jArr[i6] = j4 | (((j4 >> 63) & 1) << 60);
                        if (i4 != 0 || i5 != 0) {
                            aeVar.o(iD, i4, i5, j4);
                        }
                    } else {
                        int iD3 = d(layoutNode);
                        int i7 = (int) (jC >> 32);
                        int i8 = (int) (jC & 4294967295L);
                        long[] jArr2 = (long[]) aeVar.c;
                        long j5 = jArr2[iD3];
                        jArr2[iD3] = (((long) i8) & 4294967295L) | (((long) i7) << 32);
                        jArr2[iD3 + 1] = (((long) (iX + i8)) & 4294967295L) | (((long) (iY + i7)) << 32);
                        int i9 = iD3 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            aeVar.o(iD3, i10, i11, j6);
                        }
                    }
                } else {
                    int i12 = layoutNode.n;
                    boolean zF = nfVar.f(1024);
                    boolean zF2 = nfVar.f(16);
                    boolean zA = this.d.a.a(i12);
                    if (layoutNodeF != null) {
                        int i13 = layoutNodeF.n;
                        int iD4 = d(layoutNodeF);
                        int i14 = (int) (jC >> 32);
                        int i15 = (int) (jC & 4294967295L);
                        int i16 = i12 & 33554431;
                        long[] jArr3 = (long[]) aeVar.c;
                        if ((((int) jArr3[iD4 + 2]) & 33554431) != (33554431 & i13)) {
                            ki3.a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                        }
                        long j7 = jArr3[iD4];
                        int i17 = ((int) (j7 >> 32)) + i14;
                        int i18 = ((int) j7) + i15;
                        layoutNode.s = aeVar.i(i16, i17, i18, i17 + iY, i18 + iX, i13, iD4, zF, zF2, zA);
                    } else {
                        int i19 = (int) (jC >> 32);
                        int i20 = (int) (jC & 4294967295L);
                        layoutNode.s = aeVar.i(i12, i19, i20, i19 + iY, i20 + iX, -1, -4, zF, zF2, zA);
                    }
                }
            }
            layoutNode.r = false;
            this.f = true;
            j();
        }
    }

    public final void h(LayoutNode layoutNode) {
        if (layoutNode.s != -4) {
            int iD = d(layoutNode);
            long[] jArr = (long[]) this.c.c;
            jArr[iD] = -1;
            jArr[iD + 1] = -1;
            jArr[iD + 2] = w56.a;
            layoutNode.s = -4;
            layoutNode.r = true;
            this.f = true;
            this.h = true;
        }
    }

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
    public final void j() {
        lg lgVar = this.i;
        boolean z = lgVar != null;
        long j = this.d.c;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            AndroidComposeView androidComposeView = this.b;
            if (lgVar != null) {
                androidComposeView.removeCallbacks(lgVar);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.j = jMax;
            lg lgVar2 = new lg(this.k, (byte) 1);
            androidComposeView.postDelayed(lgVar2, jMax - jCurrentTimeMillis);
            this.i = lgVar2;
        }
    }
}
