package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class jj {
    public static final cp5 a = new cp5(30, true);

    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x0123  */
    /* JADX WARN: Code duplicated, block: B:76:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x0139  */
    /* JADX WARN: Code duplicated, block: B:80:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:84:0x0185  */
    /* JADX WARN: Code duplicated, block: B:87:0x0197  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void a(final boolean z, final Function0 function0, fs4 fs4Var, final long j, hk6 hk6Var, cp5 cp5Var, pw6 pw6Var, final long j2, float f, final yy0 yy0Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        Function0 function1;
        fs4 fs4Var2;
        int i4;
        int i5;
        boolean z2;
        final cp5 cp5Var2;
        final pw6 pw6Var2;
        final float f2;
        final fs4 fs4Var3;
        final hk6 hk6Var2;
        j56 j56VarR;
        fs4 fs4Var4;
        hk6 hk6Var3;
        pw6 pw6VarB;
        float f3;
        int i6;
        cp5 cp5Var3;
        Object objK;
        Object obj;
        wx4 wx4Var;
        in1 in1Var;
        boolean z3;
        boolean zF;
        Object objK2;
        fs4 fs4Var5;
        cp5 cp5Var4;
        int i7;
        int i8;
        ux2Var.Y(1725609375);
        if ((i & 6) == 0) {
            i3 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i3 |= ux2Var.h(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (ux2Var.e(j)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            i4 = 196608 | i3;
            if ((1572864 & i) == 0) {
                i4 = 720896 | i3;
            }
            if ((12582912 & i) == 0) {
                if (ux2Var.e(j2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i4 |= i7;
            }
            i5 = 905969664 | i4;
            if ((306783379 & i5) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (ux2Var.N(i5 & 1, z2)) {
                ux2Var.S();
                if ((i & 1) != 0 || ux2Var.x()) {
                    if (i9 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    hk6 hk6VarW = im3.W(ux2Var);
                    float f4 = kp4.a;
                    hk6Var3 = hk6VarW;
                    pw6VarB = ux6.b(j51.s, ux2Var);
                    f3 = kp4.a;
                    i6 = i5 & (-3727361);
                    cp5Var3 = a;
                } else {
                    ux2Var.Q();
                    hk6Var3 = hk6Var;
                    pw6VarB = pw6Var;
                    f3 = f;
                    fs4Var4 = fs4Var2;
                    i6 = i5 & (-3727361);
                    cp5Var3 = cp5Var;
                }
                ux2Var.q();
                objK = ux2Var.K();
                obj = e01.a;
                if (objK == obj) {
                    objK = new wx4(Boolean.FALSE);
                    ux2Var.g0(objK);
                }
                wx4Var = (wx4) objK;
                wx4Var.f2457o.setValue(Boolean.valueOf(z));
                if (!((Boolean) wx4Var.n.getValue()).booleanValue() || ((Boolean) wx4Var.f2457o.getValue()).booleanValue()) {
                    ux2Var.W(1165885407);
                    in1Var = (in1) ux2Var.j(b11.h);
                    if ((i6 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zF = z3 | ux2Var.f(in1Var);
                    objK2 = ux2Var.K();
                    if (zF || objK2 == obj) {
                        objK2 = new a72(j, in1Var);
                        ux2Var.g0(objK2);
                    }
                    a72 a72Var = (a72) objK2;
                    fs4Var5 = fs4Var4;
                    cp5Var4 = cp5Var3;
                    gk.a(a72Var, function1, cp5Var4, au8.O(-917492520, new gj(fs4Var5, wx4Var, a72Var, hk6Var3, pw6VarB, j2, f3, yy0Var), ux2Var), ux2Var, (i6 & 112) | 3072 | ((i6 >> 9) & 896), 0);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(1166904067);
                    ux2Var.p(false);
                    cp5Var4 = cp5Var3;
                    fs4Var5 = fs4Var4;
                }
                cp5Var2 = cp5Var4;
                fs4Var3 = fs4Var5;
                hk6Var2 = hk6Var3;
                pw6Var2 = pw6VarB;
                f2 = f3;
            } else {
                ux2Var.Q();
                cp5Var2 = cp5Var;
                pw6Var2 = pw6Var;
                f2 = f;
                fs4Var3 = fs4Var2;
                hk6Var2 = hk6Var;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.hj
                    @Override // o.hw2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iY = yo1.Y(i | 1);
                        jj.a(z, function0, fs4Var3, j, hk6Var2, cp5Var2, pw6Var2, j2, f2, yy0Var, (ux2) obj2, iY, i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 384;
        fs4Var2 = fs4Var;
        if ((i & 3072) == 0) {
            if (ux2Var.e(j)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        i4 = 196608 | i3;
        if ((1572864 & i) == 0) {
            i4 = 720896 | i3;
        }
        if ((12582912 & i) == 0) {
            if (ux2Var.e(j2)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i4 |= i7;
        }
        i5 = 905969664 | i4;
        if ((306783379 & i5) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (ux2Var.N(i5 & 1, z2)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                hk6 hk6VarW2 = im3.W(ux2Var);
                float f5 = kp4.a;
                hk6Var3 = hk6VarW2;
                pw6VarB = ux6.b(j51.s, ux2Var);
                f3 = kp4.a;
                i6 = i5 & (-3727361);
                cp5Var3 = a;
            } else {
                if (i9 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                hk6 hk6VarW3 = im3.W(ux2Var);
                float f6 = kp4.a;
                hk6Var3 = hk6VarW3;
                pw6VarB = ux6.b(j51.s, ux2Var);
                f3 = kp4.a;
                i6 = i5 & (-3727361);
                cp5Var3 = a;
            }
            ux2Var.q();
            objK = ux2Var.K();
            obj = e01.a;
            if (objK == obj) {
                objK = new wx4(Boolean.FALSE);
                ux2Var.g0(objK);
            }
            wx4Var = (wx4) objK;
            wx4Var.f2457o.setValue(Boolean.valueOf(z));
            if (((Boolean) wx4Var.n.getValue()).booleanValue()) {
                ux2Var.W(1165885407);
                in1Var = (in1) ux2Var.j(b11.h);
                if ((i6 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zF = z3 | ux2Var.f(in1Var);
                objK2 = ux2Var.K();
                if (zF) {
                    objK2 = new a72(j, in1Var);
                    ux2Var.g0(objK2);
                } else {
                    objK2 = new a72(j, in1Var);
                    ux2Var.g0(objK2);
                }
                a72 a72Var2 = (a72) objK2;
                fs4Var5 = fs4Var4;
                cp5Var4 = cp5Var3;
                gk.a(a72Var2, function1, cp5Var4, au8.O(-917492520, new gj(fs4Var5, wx4Var, a72Var2, hk6Var3, pw6VarB, j2, f3, yy0Var), ux2Var), ux2Var, (i6 & 112) | 3072 | ((i6 >> 9) & 896), 0);
                ux2Var.p(false);
            } else {
                ux2Var.W(1165885407);
                in1Var = (in1) ux2Var.j(b11.h);
                if ((i6 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zF = z3 | ux2Var.f(in1Var);
                objK2 = ux2Var.K();
                if (zF) {
                    objK2 = new a72(j, in1Var);
                    ux2Var.g0(objK2);
                } else {
                    objK2 = new a72(j, in1Var);
                    ux2Var.g0(objK2);
                }
                a72 a72Var3 = (a72) objK2;
                fs4Var5 = fs4Var4;
                cp5Var4 = cp5Var3;
                gk.a(a72Var3, function1, cp5Var4, au8.O(-917492520, new gj(fs4Var5, wx4Var, a72Var3, hk6Var3, pw6VarB, j2, f3, yy0Var), ux2Var), ux2Var, (i6 & 112) | 3072 | ((i6 >> 9) & 896), 0);
                ux2Var.p(false);
            }
            cp5Var2 = cp5Var4;
            fs4Var3 = fs4Var5;
            hk6Var2 = hk6Var3;
            pw6Var2 = pw6VarB;
            f2 = f3;
        } else {
            ux2Var.Q();
            cp5Var2 = cp5Var;
            pw6Var2 = pw6Var;
            f2 = f;
            fs4Var3 = fs4Var2;
            hk6Var2 = hk6Var;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.hj
                @Override // o.hw2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = yo1.Y(i | 1);
                    jj.a(z, function0, fs4Var3, j, hk6Var2, cp5Var2, pw6Var2, j2, f2, yy0Var, (ux2) obj2, iY, i2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x0118  */
    /* JADX WARN: Code duplicated, block: B:73:0x011e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x0147  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void b(hw2 hw2Var, Function0 function0, fs4 fs4Var, hw2 hw2Var2, boolean z, np4 np4Var, nd5 nd5Var, ux2 ux2Var, int i, int i2) {
        hw2 hw2Var3;
        int i3;
        Function0 function1;
        fs4 fs4Var2;
        int i4;
        int i5;
        nd5 nd5Var2;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        np4 np4Var2;
        fs4 fs4Var3;
        nd5 nd5Var3;
        j56 j56VarR;
        fs4 fs4Var4;
        zv0 zv0Var;
        np4 np4Var3;
        int i8;
        np4 np4Var4;
        boolean z4;
        int i9;
        ux2Var.Y(-532959117);
        if ((i & 6) == 0) {
            hw2Var3 = hw2Var;
            i3 = (ux2Var.h(hw2Var3) ? 4 : 2) | i;
        } else {
            hw2Var3 = hw2Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i3 |= ux2Var.h(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if (ux2Var.h(hw2Var2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i3 |= i9;
            }
            i4 = 221184 | i3;
            if ((1572864 & i) == 0) {
                i4 = 745472 | i3;
            }
            i5 = i2 & 128;
            if (i5 != 0) {
                if ((12582912 & i) == 0) {
                    nd5Var2 = nd5Var;
                    if (ux2Var.f(nd5Var2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 100663296;
                if ((38347923 & i7) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (ux2Var.N(i7 & 1, z2)) {
                    ux2Var.S();
                    if ((i & 1) != 0 || ux2Var.x()) {
                        if (i10 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        float f = kp4.a;
                        zv0Var = ((rn4) ux2Var.j(un4.a)).a;
                        np4Var3 = zv0Var.e0;
                        if (np4Var3 == null) {
                            np4 np4Var5 = new np4(bw0.b(zv0Var, ga0.I), bw0.b(zv0Var, ga0.K), bw0.b(zv0Var, ga0.Z), rv0.b(ga0.z, bw0.b(zv0Var, ga0.y)), rv0.b(ga0.B, bw0.b(zv0Var, ga0.A)), rv0.b(ga0.H, bw0.b(zv0Var, ga0.G)));
                            zv0Var.e0 = np4Var5;
                            np4Var3 = np4Var5;
                        }
                        int i11 = i7 & (-3670017);
                        if (i5 != 0) {
                            nd5Var2 = kp4.b;
                        }
                        i8 = i11;
                        np4Var4 = np4Var3;
                        z4 = true;
                    } else {
                        ux2Var.Q();
                        i8 = i7 & (-3670017);
                        np4Var4 = np4Var;
                        fs4Var4 = fs4Var2;
                        z4 = z;
                    }
                    nd5 nd5Var4 = nd5Var2;
                    ux2Var.q();
                    int i12 = 268435454 & i8;
                    Function0 function2 = function1;
                    fs4 fs4Var5 = fs4Var4;
                    vp4.b(hw2Var3, function2, fs4Var5, hw2Var2, z4, np4Var4, nd5Var4, ux2Var, i12);
                    fs4Var3 = fs4Var5;
                    nd5Var3 = nd5Var4;
                    np4Var2 = np4Var4;
                    z3 = z4;
                } else {
                    ux2Var.Q();
                    z3 = z;
                    np4Var2 = np4Var;
                    fs4Var3 = fs4Var2;
                    nd5Var3 = nd5Var2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new ij(hw2Var, function0, fs4Var3, hw2Var2, z3, np4Var2, nd5Var3, i, i2);
                }
            }
            i4 |= 12582912;
            nd5Var2 = nd5Var;
            i7 = i4 | 100663296;
            if ((38347923 & i7) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ux2Var.N(i7 & 1, z2)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    float f2 = kp4.a;
                    zv0Var = ((rn4) ux2Var.j(un4.a)).a;
                    np4Var3 = zv0Var.e0;
                    if (np4Var3 == null) {
                        np4 np4Var6 = new np4(bw0.b(zv0Var, ga0.I), bw0.b(zv0Var, ga0.K), bw0.b(zv0Var, ga0.Z), rv0.b(ga0.z, bw0.b(zv0Var, ga0.y)), rv0.b(ga0.B, bw0.b(zv0Var, ga0.A)), rv0.b(ga0.H, bw0.b(zv0Var, ga0.G)));
                        zv0Var.e0 = np4Var6;
                        np4Var3 = np4Var6;
                    }
                    int i13 = i7 & (-3670017);
                    if (i5 != 0) {
                        nd5Var2 = kp4.b;
                    }
                    i8 = i13;
                    np4Var4 = np4Var3;
                    z4 = true;
                } else {
                    if (i10 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    float f3 = kp4.a;
                    zv0Var = ((rn4) ux2Var.j(un4.a)).a;
                    np4Var3 = zv0Var.e0;
                    if (np4Var3 == null) {
                        np4 np4Var7 = new np4(bw0.b(zv0Var, ga0.I), bw0.b(zv0Var, ga0.K), bw0.b(zv0Var, ga0.Z), rv0.b(ga0.z, bw0.b(zv0Var, ga0.y)), rv0.b(ga0.B, bw0.b(zv0Var, ga0.A)), rv0.b(ga0.H, bw0.b(zv0Var, ga0.G)));
                        zv0Var.e0 = np4Var7;
                        np4Var3 = np4Var7;
                    }
                    int i14 = i7 & (-3670017);
                    if (i5 != 0) {
                        nd5Var2 = kp4.b;
                    }
                    i8 = i14;
                    np4Var4 = np4Var3;
                    z4 = true;
                }
                nd5 nd5Var5 = nd5Var2;
                ux2Var.q();
                int i15 = 268435454 & i8;
                Function0 function3 = function1;
                fs4 fs4Var6 = fs4Var4;
                vp4.b(hw2Var3, function3, fs4Var6, hw2Var2, z4, np4Var4, nd5Var5, ux2Var, i15);
                fs4Var3 = fs4Var6;
                nd5Var3 = nd5Var5;
                np4Var2 = np4Var4;
                z3 = z4;
            } else {
                ux2Var.Q();
                z3 = z;
                np4Var2 = np4Var;
                fs4Var3 = fs4Var2;
                nd5Var3 = nd5Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new ij(hw2Var, function0, fs4Var3, hw2Var2, z3, np4Var2, nd5Var3, i, i2);
            }
        }
        i3 |= 384;
        fs4Var2 = fs4Var;
        if ((i & 3072) != 0) {
            if (ux2Var.h(hw2Var2)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        i4 = 221184 | i3;
        if ((1572864 & i) == 0) {
            i4 = 745472 | i3;
        }
        i5 = i2 & 128;
        if (i5 != 0) {
            if ((12582912 & i) == 0) {
                nd5Var2 = nd5Var;
                if (ux2Var.f(nd5Var2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
            i7 = i4 | 100663296;
            if ((38347923 & i7) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ux2Var.N(i7 & 1, z2)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    float f4 = kp4.a;
                    zv0Var = ((rn4) ux2Var.j(un4.a)).a;
                    np4Var3 = zv0Var.e0;
                    if (np4Var3 == null) {
                        np4 np4Var8 = new np4(bw0.b(zv0Var, ga0.I), bw0.b(zv0Var, ga0.K), bw0.b(zv0Var, ga0.Z), rv0.b(ga0.z, bw0.b(zv0Var, ga0.y)), rv0.b(ga0.B, bw0.b(zv0Var, ga0.A)), rv0.b(ga0.H, bw0.b(zv0Var, ga0.G)));
                        zv0Var.e0 = np4Var8;
                        np4Var3 = np4Var8;
                    }
                    int i16 = i7 & (-3670017);
                    if (i5 != 0) {
                        nd5Var2 = kp4.b;
                    }
                    i8 = i16;
                    np4Var4 = np4Var3;
                    z4 = true;
                } else {
                    if (i10 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    float f5 = kp4.a;
                    zv0Var = ((rn4) ux2Var.j(un4.a)).a;
                    np4Var3 = zv0Var.e0;
                    if (np4Var3 == null) {
                        np4 np4Var9 = new np4(bw0.b(zv0Var, ga0.I), bw0.b(zv0Var, ga0.K), bw0.b(zv0Var, ga0.Z), rv0.b(ga0.z, bw0.b(zv0Var, ga0.y)), rv0.b(ga0.B, bw0.b(zv0Var, ga0.A)), rv0.b(ga0.H, bw0.b(zv0Var, ga0.G)));
                        zv0Var.e0 = np4Var9;
                        np4Var3 = np4Var9;
                    }
                    int i17 = i7 & (-3670017);
                    if (i5 != 0) {
                        nd5Var2 = kp4.b;
                    }
                    i8 = i17;
                    np4Var4 = np4Var3;
                    z4 = true;
                }
                nd5 nd5Var6 = nd5Var2;
                ux2Var.q();
                int i18 = 268435454 & i8;
                Function0 function4 = function1;
                fs4 fs4Var7 = fs4Var4;
                vp4.b(hw2Var3, function4, fs4Var7, hw2Var2, z4, np4Var4, nd5Var6, ux2Var, i18);
                fs4Var3 = fs4Var7;
                nd5Var3 = nd5Var6;
                np4Var2 = np4Var4;
                z3 = z4;
            } else {
                ux2Var.Q();
                z3 = z;
                np4Var2 = np4Var;
                fs4Var3 = fs4Var2;
                nd5Var3 = nd5Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new ij(hw2Var, function0, fs4Var3, hw2Var2, z3, np4Var2, nd5Var3, i, i2);
            }
        }
        i4 |= 12582912;
        nd5Var2 = nd5Var;
        i7 = i4 | 100663296;
        if ((38347923 & i7) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ux2Var.N(i7 & 1, z2)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                float f6 = kp4.a;
                zv0Var = ((rn4) ux2Var.j(un4.a)).a;
                np4Var3 = zv0Var.e0;
                if (np4Var3 == null) {
                    np4 np4Var10 = new np4(bw0.b(zv0Var, ga0.I), bw0.b(zv0Var, ga0.K), bw0.b(zv0Var, ga0.Z), rv0.b(ga0.z, bw0.b(zv0Var, ga0.y)), rv0.b(ga0.B, bw0.b(zv0Var, ga0.A)), rv0.b(ga0.H, bw0.b(zv0Var, ga0.G)));
                    zv0Var.e0 = np4Var10;
                    np4Var3 = np4Var10;
                }
                int i19 = i7 & (-3670017);
                if (i5 != 0) {
                    nd5Var2 = kp4.b;
                }
                i8 = i19;
                np4Var4 = np4Var3;
                z4 = true;
            } else {
                if (i10 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                float f7 = kp4.a;
                zv0Var = ((rn4) ux2Var.j(un4.a)).a;
                np4Var3 = zv0Var.e0;
                if (np4Var3 == null) {
                    np4 np4Var11 = new np4(bw0.b(zv0Var, ga0.I), bw0.b(zv0Var, ga0.K), bw0.b(zv0Var, ga0.Z), rv0.b(ga0.z, bw0.b(zv0Var, ga0.y)), rv0.b(ga0.B, bw0.b(zv0Var, ga0.A)), rv0.b(ga0.H, bw0.b(zv0Var, ga0.G)));
                    zv0Var.e0 = np4Var11;
                    np4Var3 = np4Var11;
                }
                int i110 = i7 & (-3670017);
                if (i5 != 0) {
                    nd5Var2 = kp4.b;
                }
                i8 = i110;
                np4Var4 = np4Var3;
                z4 = true;
            }
            nd5 nd5Var7 = nd5Var2;
            ux2Var.q();
            int i111 = 268435454 & i8;
            Function0 function5 = function1;
            fs4 fs4Var8 = fs4Var4;
            vp4.b(hw2Var3, function5, fs4Var8, hw2Var2, z4, np4Var4, nd5Var7, ux2Var, i111);
            fs4Var3 = fs4Var8;
            nd5Var3 = nd5Var7;
            np4Var2 = np4Var4;
            z3 = z4;
        } else {
            ux2Var.Q();
            z3 = z;
            np4Var2 = np4Var;
            fs4Var3 = fs4Var2;
            nd5Var3 = nd5Var2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ij(hw2Var, function0, fs4Var3, hw2Var2, z3, np4Var2, nd5Var3, i, i2);
        }
    }
}
