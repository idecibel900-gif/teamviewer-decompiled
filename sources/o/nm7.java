package o;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class nm7 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final long e;

    static {
        aw0 aw0Var = es5.a;
        a = es5.e;
        b = 16.0f;
        c = 14.0f;
        d = 6.0f;
        e = h67.k(20);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0112  */
    /* JADX WARN: Code duplicated, block: B:86:0x011c  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void a(final boolean z, final Function0 function0, final fs4 fs4Var, boolean z2, final long j, final long j2, final yy0 yy0Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        final boolean z5;
        j56 j56VarR;
        int i5;
        int i6;
        int i7;
        ux2Var.Y(-1573136853);
        if ((i & 6) == 0) {
            i3 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= ux2Var.g(z3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (ux2Var.e(j)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                if (ux2Var.e(j2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (ux2Var.f(null)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if ((12582912 & i) == 0) {
                if (ux2Var.h(yy0Var)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            if ((4793491 & i3) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ux2Var.N(i3 & 1, z4)) {
                ux2Var.S();
                if ((i & 1) != 0 || ux2Var.x()) {
                    z3 = i8 == 0 ? z3 : true;
                } else {
                    ux2Var.Q();
                }
                ux2Var.q();
                boolean z6 = z3;
                int i9 = i3 >> 12;
                d(j, j2, z, au8.O(1128552423, new h70(fs4Var, z, zd6.a(true, 0.0f, j, null, 250), z6, function0, yy0Var), ux2Var), ux2Var, (i9 & 112) | (i9 & 14) | 3072 | ((i3 << 6) & 896));
                z5 = z6;
            } else {
                ux2Var.Q();
                z5 = z3;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.km7
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nm7.a(z, function0, fs4Var, z5, j, j2, yy0Var, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if (ux2Var.e(j)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i) == 0) {
            if (ux2Var.e(j2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (ux2Var.f(null)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (ux2Var.h(yy0Var)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((4793491 & i3) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ux2Var.N(i3 & 1, z4)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                z3 = i8 == 0 ? z3 : true;
            } else {
                z3 = i8 == 0 ? z3 : true;
            }
            ux2Var.q();
            boolean z7 = z3;
            int i10 = i3 >> 12;
            d(j, j2, z, au8.O(1128552423, new h70(fs4Var, z, zd6.a(true, 0.0f, j, null, 250), z7, function0, yy0Var), ux2Var), ux2Var, (i10 & 112) | (i10 & 14) | 3072 | ((i3 << 6) & 896));
            z5 = z7;
        } else {
            ux2Var.Q();
            z5 = z3;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.km7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nm7.a(z, function0, fs4Var, z5, j, j2, yy0Var, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void b(final boolean z, final Function0 function0, fs4 fs4Var, boolean z2, final hw2 hw2Var, long j, long j2, ux2 ux2Var, final int i, final int i2) {
        fs4 fs4Var2;
        int i3;
        long j3;
        long j4;
        int i4;
        byte b2;
        boolean z3;
        final boolean z4;
        final fs4 fs4Var3;
        final long j5;
        final long j6;
        j56 j56VarR;
        fs4 fs4Var4;
        long j7;
        long j8;
        long j9;
        boolean z5;
        yy0 yy0VarO;
        ux2Var.Y(1015017965);
        byte b3 = 4;
        int i5 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.h(function0) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            fs4Var2 = fs4Var;
        } else {
            fs4Var2 = fs4Var;
            i3 = i5 | (ux2Var.f(fs4Var2) ? 256 : 128);
        }
        int i7 = i3 | 199680;
        if ((i2 & 64) == 0) {
            j3 = j;
            int i8 = ux2Var.e(j3) ? 1048576 : 524288;
            int i9 = i7 | i8;
            if ((i2 & 128) == 0) {
                j4 = j2;
                int i10 = ux2Var.e(j4) ? 8388608 : 4194304;
                i4 = i9 | i10 | 100663296;
                b2 = 0;
                if ((38347923 & i4) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ux2Var.N(i4 & 1, z3)) {
                    ux2Var.S();
                    if ((i & 1) != 0 || ux2Var.x()) {
                        if (i6 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        if ((i2 & 64) != 0) {
                            j7 = ((rv0) ux2Var.j(wa1.a)).a;
                            i4 &= -3670017;
                        } else {
                            j7 = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i4 &= -29360129;
                            j4 = j7;
                        }
                        j8 = j4;
                        j9 = j7;
                        z5 = true;
                    } else {
                        ux2Var.Q();
                        if ((i2 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        fs4Var4 = fs4Var2;
                        j8 = j4;
                        j9 = j3;
                        z5 = z2;
                    }
                    ux2Var.q();
                    if (hw2Var == null) {
                        ux2Var.W(1830887765);
                        ux2Var.p(false);
                        yy0VarO = null;
                    } else {
                        ux2Var.W(1830887766);
                        yy0VarO = au8.O(-1745256900, new xd(hw2Var, b3), ux2Var);
                        ux2Var.p(false);
                    }
                    int i11 = (i4 & 14) | 12582912 | (i4 & 112) | 3072;
                    int i12 = i4 >> 6;
                    a(z, function0, vn4.j0(fs4Var4, new p20(b2)), z5, j9, j8, au8.O(-906085472, new lj1(yy0VarO, (byte) 2), ux2Var), ux2Var, (i12 & 458752) | i11 | (57344 & i12) | 1572864, 0);
                    fs4Var3 = fs4Var4;
                    z4 = z5;
                    j5 = j9;
                    j6 = j8;
                } else {
                    ux2Var.Q();
                    z4 = z2;
                    fs4Var3 = fs4Var2;
                    j5 = j3;
                    j6 = j4;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2(z, function0, fs4Var3, z4, hw2Var, j5, j6, i, i2) { // from class: o.jm7
                        public final /* synthetic */ boolean m;
                        public final /* synthetic */ Function0 n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ fs4 f1184o;
                        public final /* synthetic */ boolean p;
                        public final /* synthetic */ hw2 q;
                        public final /* synthetic */ long r;
                        public final /* synthetic */ long s;
                        public final /* synthetic */ short t;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.t = i2;
                        }

                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iY = yo1.Y(24577);
                            nm7.b(this.m, this.n, this.f1184o, this.p, this.q, this.r, this.s, (ux2) obj, iY, this.t);
                            return f88.a;
                        }
                    };
                }
            }
            j4 = j2;
            i4 = i9 | i10 | 100663296;
            b2 = 0;
            if ((38347923 & i4) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i4 & 1, z3)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if ((i2 & 64) != 0) {
                        j7 = ((rv0) ux2Var.j(wa1.a)).a;
                        i4 &= -3670017;
                    } else {
                        j7 = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                        j4 = j7;
                    }
                    j8 = j4;
                    j9 = j7;
                    z5 = true;
                } else {
                    if (i6 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if ((i2 & 64) != 0) {
                        j7 = ((rv0) ux2Var.j(wa1.a)).a;
                        i4 &= -3670017;
                    } else {
                        j7 = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                        j4 = j7;
                    }
                    j8 = j4;
                    j9 = j7;
                    z5 = true;
                }
                ux2Var.q();
                if (hw2Var == null) {
                    ux2Var.W(1830887765);
                    ux2Var.p(false);
                    yy0VarO = null;
                } else {
                    ux2Var.W(1830887766);
                    yy0VarO = au8.O(-1745256900, new xd(hw2Var, b3), ux2Var);
                    ux2Var.p(false);
                }
                int i13 = (i4 & 14) | 12582912 | (i4 & 112) | 3072;
                int i14 = i4 >> 6;
                a(z, function0, vn4.j0(fs4Var4, new p20(b2)), z5, j9, j8, au8.O(-906085472, new lj1(yy0VarO, (byte) 2), ux2Var), ux2Var, (i14 & 458752) | i13 | (57344 & i14) | 1572864, 0);
                fs4Var3 = fs4Var4;
                z4 = z5;
                j5 = j9;
                j6 = j8;
            } else {
                ux2Var.Q();
                z4 = z2;
                fs4Var3 = fs4Var2;
                j5 = j3;
                j6 = j4;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2(z, function0, fs4Var3, z4, hw2Var, j5, j6, i, i2) { // from class: o.jm7
                    public final /* synthetic */ boolean m;
                    public final /* synthetic */ Function0 n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    public final /* synthetic */ fs4 f1184o;
                    public final /* synthetic */ boolean p;
                    public final /* synthetic */ hw2 q;
                    public final /* synthetic */ long r;
                    public final /* synthetic */ long s;
                    public final /* synthetic */ short t;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.t = i2;
                    }

                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iY = yo1.Y(24577);
                        nm7.b(this.m, this.n, this.f1184o, this.p, this.q, this.r, this.s, (ux2) obj, iY, this.t);
                        return f88.a;
                    }
                };
            }
        }
        j3 = j;
        int i15 = i7 | i8;
        if ((i2 & 128) == 0) {
            j4 = j2;
            if (ux2Var.e(j4)) {
            }
            i4 = i15 | i10 | 100663296;
            b2 = 0;
            if ((38347923 & i4) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i4 & 1, z3)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if ((i2 & 64) != 0) {
                        j7 = ((rv0) ux2Var.j(wa1.a)).a;
                        i4 &= -3670017;
                    } else {
                        j7 = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                        j4 = j7;
                    }
                    j8 = j4;
                    j9 = j7;
                    z5 = true;
                } else {
                    if (i6 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if ((i2 & 64) != 0) {
                        j7 = ((rv0) ux2Var.j(wa1.a)).a;
                        i4 &= -3670017;
                    } else {
                        j7 = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                        j4 = j7;
                    }
                    j8 = j4;
                    j9 = j7;
                    z5 = true;
                }
                ux2Var.q();
                if (hw2Var == null) {
                    ux2Var.W(1830887765);
                    ux2Var.p(false);
                    yy0VarO = null;
                } else {
                    ux2Var.W(1830887766);
                    yy0VarO = au8.O(-1745256900, new xd(hw2Var, b3), ux2Var);
                    ux2Var.p(false);
                }
                int i16 = (i4 & 14) | 12582912 | (i4 & 112) | 3072;
                int i17 = i4 >> 6;
                a(z, function0, vn4.j0(fs4Var4, new p20(b2)), z5, j9, j8, au8.O(-906085472, new lj1(yy0VarO, (byte) 2), ux2Var), ux2Var, (i17 & 458752) | i16 | (57344 & i17) | 1572864, 0);
                fs4Var3 = fs4Var4;
                z4 = z5;
                j5 = j9;
                j6 = j8;
            } else {
                ux2Var.Q();
                z4 = z2;
                fs4Var3 = fs4Var2;
                j5 = j3;
                j6 = j4;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2(z, function0, fs4Var3, z4, hw2Var, j5, j6, i, i2) { // from class: o.jm7
                    public final /* synthetic */ boolean m;
                    public final /* synthetic */ Function0 n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    public final /* synthetic */ fs4 f1184o;
                    public final /* synthetic */ boolean p;
                    public final /* synthetic */ hw2 q;
                    public final /* synthetic */ long r;
                    public final /* synthetic */ long s;
                    public final /* synthetic */ short t;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.t = i2;
                    }

                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iY = yo1.Y(24577);
                        nm7.b(this.m, this.n, this.f1184o, this.p, this.q, this.r, this.s, (ux2) obj, iY, this.t);
                        return f88.a;
                    }
                };
            }
        }
        j4 = j2;
        i4 = i15 | i10 | 100663296;
        b2 = 0;
        if ((38347923 & i4) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ux2Var.N(i4 & 1, z3)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if ((i2 & 64) != 0) {
                    j7 = ((rv0) ux2Var.j(wa1.a)).a;
                    i4 &= -3670017;
                } else {
                    j7 = j3;
                }
                if ((i2 & 128) != 0) {
                    i4 &= -29360129;
                    j4 = j7;
                }
                j8 = j4;
                j9 = j7;
                z5 = true;
            } else {
                if (i6 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if ((i2 & 64) != 0) {
                    j7 = ((rv0) ux2Var.j(wa1.a)).a;
                    i4 &= -3670017;
                } else {
                    j7 = j3;
                }
                if ((i2 & 128) != 0) {
                    i4 &= -29360129;
                    j4 = j7;
                }
                j8 = j4;
                j9 = j7;
                z5 = true;
            }
            ux2Var.q();
            if (hw2Var == null) {
                ux2Var.W(1830887765);
                ux2Var.p(false);
                yy0VarO = null;
            } else {
                ux2Var.W(1830887766);
                yy0VarO = au8.O(-1745256900, new xd(hw2Var, b3), ux2Var);
                ux2Var.p(false);
            }
            int i18 = (i4 & 14) | 12582912 | (i4 & 112) | 3072;
            int i19 = i4 >> 6;
            a(z, function0, vn4.j0(fs4Var4, new p20(b2)), z5, j9, j8, au8.O(-906085472, new lj1(yy0VarO, (byte) 2), ux2Var), ux2Var, (i19 & 458752) | i18 | (57344 & i19) | 1572864, 0);
            fs4Var3 = fs4Var4;
            z4 = z5;
            j5 = j9;
            j6 = j8;
        } else {
            ux2Var.Q();
            z4 = z2;
            fs4Var3 = fs4Var2;
            j5 = j3;
            j6 = j4;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(z, function0, fs4Var3, z4, hw2Var, j5, j6, i, i2) { // from class: o.jm7
                public final /* synthetic */ boolean m;
                public final /* synthetic */ Function0 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ fs4 f1184o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ hw2 q;
                public final /* synthetic */ long r;
                public final /* synthetic */ long s;
                public final /* synthetic */ short t;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.t = i2;
                }

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(24577);
                    nm7.b(this.m, this.n, this.f1184o, this.p, this.q, this.r, this.s, (ux2) obj, iY, this.t);
                    return f88.a;
                }
            };
        }
    }

    public static final void c(hw2 hw2Var, ux2 ux2Var, int i) {
        boolean z;
        y50 y50Var = xz2.f2564o;
        ux2Var.Y(-1349901398);
        int i2 = (ux2Var.h(hw2Var) ? 4 : 2) | i | (ux2Var.h(null) ? 32 : 16);
        byte b2 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4);
            Object objK = ux2Var.K();
            if (z2 || objK == e01.a) {
                objK = new qa4(hw2Var, b2);
                ux2Var.g0(objK);
            }
            do4 do4Var = (do4) objK;
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z3 = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(do4Var, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            if (hw2Var != null) {
                ux2Var.W(870361332);
                fs4 fs4VarD = ka0.D(hm3.w(cs4Var, "text"), b, 0.0f, 2);
                do4 do4VarC = ua0.c(y50Var, false);
                int iHashCode2 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL2 = ux2Var.l();
                fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarD);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4VarC, iz0Var, ux2Var);
                o67.n(yj5VarL2, iz0Var2, ux2Var);
                e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS2, iz0Var4, ux2Var);
                hw2Var.invoke(ux2Var, Integer.valueOf(i3));
                ux2Var.p(true);
                z = false;
                ux2Var.p(false);
            } else {
                z = false;
                ux2Var.W(870466081);
                ux2Var.p(false);
            }
            ux2Var.W(870557345);
            ux2Var.p(z);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new xd(i, hw2Var);
        }
    }

    public static final void d(final long j, final long j2, boolean z, final yy0 yy0Var, ux2 ux2Var, final int i) {
        int i2;
        final boolean z2;
        boolean z3;
        Object objP0;
        boolean z4;
        e87 e87VarC0;
        ux2Var.Y(-833145221);
        if ((i & 6) == 0) {
            i2 = (ux2Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.e(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= ux2Var.g(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
            u18 u18VarY0 = ck3.y0(Boolean.valueOf(z2), null, ux2Var, i3 & 14, 2);
            g2 g2Var = u18VarY0.a;
            boolean zBooleanValue = ((Boolean) u18VarY0.d.getValue()).booleanValue();
            ux2Var.W(-1069234984);
            long j3 = zBooleanValue ? j : j2;
            ux2Var.p(false);
            Object objE = rv0.e(j3);
            boolean zF = ux2Var.f(objE);
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (zF || objK == obj) {
                Object yn1Var = new yn1(zm.t, new io.sentry.okhttp.b(objE, (byte) 5));
                ux2Var.g0(yn1Var);
                objK = yn1Var;
            }
            yn1 yn1Var2 = (yn1) objK;
            if (u18VarY0.g()) {
                z3 = false;
                ux2Var.W(1666827533);
                ux2Var.p(false);
                objP0 = g2Var.p0();
            } else {
                ux2Var.W(1666573488);
                boolean zF2 = ux2Var.f(u18VarY0);
                objP0 = ux2Var.K();
                if (zF2 || objP0 == obj) {
                    n47 n47VarC = el5.c();
                    Function1 function1E = n47VarC != null ? n47VarC.e() : null;
                    n47 n47VarF = el5.f(n47VarC);
                    try {
                        Object objP1 = g2Var.p0();
                        el5.h(n47VarC, n47VarF, function1E);
                        ux2Var.g0(objP1);
                        objP0 = objP1;
                    } catch (Throwable th) {
                        el5.h(n47VarC, n47VarF, function1E);
                        throw th;
                    }
                }
                ux2Var.p(false);
                z3 = false;
            }
            boolean zBooleanValue2 = ((Boolean) objP0).booleanValue();
            ux2Var.W(-1069234984);
            long j4 = zBooleanValue2 ? j : j2;
            ux2Var.p(z3);
            rv0 rv0Var = new rv0(j4);
            boolean zF3 = ux2Var.f(u18VarY0);
            Object objK2 = ux2Var.K();
            if (zF3 || objK2 == obj) {
                objK2 = d57.b(new iq0(u18VarY0, (byte) 8));
                ux2Var.g0(objK2);
            }
            boolean zBooleanValue3 = ((Boolean) ((i97) objK2).getValue()).booleanValue();
            ux2Var.W(-1069234984);
            long j5 = zBooleanValue3 ? j : j2;
            ux2Var.p(false);
            rv0 rv0Var2 = new rv0(j5);
            boolean zF4 = ux2Var.f(u18VarY0);
            Object objK3 = ux2Var.K();
            if (zF4 || objK3 == obj) {
                objK3 = d57.b(new iq0(u18VarY0, (byte) 9));
                ux2Var.g0(objK3);
            }
            o18 o18Var = (o18) ((i97) objK3).getValue();
            ux2Var.W(1058649156);
            if (o18Var.c(Boolean.FALSE, Boolean.TRUE)) {
                ux2Var.W(272207019);
                e87VarC0 = xs1.c0(du4.f656o, ux2Var);
                z4 = false;
                ux2Var.p(false);
            } else {
                z4 = false;
                ux2Var.W(272326989);
                e87VarC0 = xs1.c0(du4.p, ux2Var);
                ux2Var.p(false);
            }
            ux2Var.p(z4);
            q18 q18VarZ = ck3.z(u18VarY0, rv0Var, rv0Var2, e87VarC0, yn1Var2, ux2Var, 0);
            h72 h72Var = wa1.a;
            rv0 rv0Var3 = (rv0) q18VarZ.v.getValue();
            long j6 = rv0Var3.a;
            j51.l(h72Var.a(rv0Var3), yy0Var, ux2Var, 8 | (i3 & 112));
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.lm7
                @Override // o.hw2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    nm7.d(j, j2, z2, yy0Var, (ux2) obj2, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }
}
