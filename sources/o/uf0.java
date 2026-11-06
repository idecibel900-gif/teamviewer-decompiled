package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.contacts.models.ContactOnlineStatus;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class uf0 implements vc1 {
    public static final yy0 A;
    public static final yy0 B;
    public static final yy0 C;
    public static final yy0 D;
    public static final Object E;
    public static final Object F;
    public static qg5 G = null;
    public static final ne6 H;
    public static final aw0 I;
    public static final i68 J;
    public static final aw0 K;
    public static final float L;
    public static final ax6 M;
    public static final aw0 N;
    public static final aw0 O;
    public static final i68 P;
    public static final float Q;
    public static final float R;
    public static final yj S;
    public static final float T = 24.0f;
    public static final float U = 24.0f;
    public static final t2 m = new t2(9);
    public static final ei1 n = new ei1(new z06(28));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yy0 f2206o;
    public static final yy0 p;
    public static final yy0 q;
    public static final yy0 r;
    public static final yy0 s;
    public static final yy0 t;
    public static final yy0 u;
    public static final yy0 v;
    public static final yy0 w;
    public static final yy0 x;
    public static final yy0 y;
    public static final yy0 z;

    static {
        byte b = 22;
        f2206o = new yy0(1115533481, false, new p20(b));
        byte b2 = 13;
        new yy0(982718444, false, new zy0(b2));
        byte b3 = 16;
        p = new yy0(2098778411, false, new bz0(b3));
        byte b4 = 17;
        q = new yy0(1622296290, false, new bz0(b4));
        byte b5 = 19;
        r = new yy0(-91331245, false, new fz0(b5));
        s = new yy0(788181022, false, new hz0((byte) 11));
        t = new yy0(-435889823, false, new hz0((byte) 18));
        u = new yy0(-411966312, false, new hz0(b5));
        v = new yy0(1986757275, false, new hz0((byte) 20));
        w = new yy0(482814896, false, new hz0((byte) 21));
        x = new yy0(1191324365, false, new hz0(b));
        y = new yy0(-514144503, false, new hz0((byte) 23));
        z = new yy0(-25187444, false, new hz0((byte) 12));
        A = new yy0(-1714039382, false, new hz0(b2));
        B = new yy0(558727559, false, new hz0((byte) 14));
        C = new yy0(1000118519, false, new hz0((byte) 15));
        D = new yy0(1708627988, false, new hz0(b3));
        new yy0(2021491963, false, new hz0(b4));
        E = new Object();
        F = new Object();
        G = new ju((byte) 29);
        H = new ne6(new me6());
        I = aw0.f367o;
        J = i68.q;
        K = aw0.p;
        L = 6.0f;
        M = ax6.f371o;
        aw0 aw0Var = aw0.n;
        N = aw0Var;
        O = aw0Var;
        P = i68.n;
        Q = 48.0f;
        R = 68.0f;
        S = new yj(1022);
    }

    public static void A(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            A((View) parent, fArr, fArr2, iArr);
            kh.x(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            kh.x(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            kh.x(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            kh.x(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        kh.B(matrix, fArr2);
        kh.w(fArr, fArr2);
    }

    public static int B(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                try {
                    int i4 = ew8.a;
                    int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new dw8("Unpaired surrogate at index " + i2 + " of " + length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                    break;
                } catch (dw8 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static final void a(boolean z2, Function0 function0, Function0 function1, Function0 function2, fs4 fs4Var, String str, xy6 xy6Var, ux2 ux2Var, int i) {
        int i2;
        fs4 fs4Var2;
        xy6 xy6Var2;
        int i3;
        fs4 fs4Var3;
        xy6 xy6Var3;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        ux2Var.Y(-512573956);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(function2) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= ux2Var.f(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        byte b = 0;
        if (ux2Var.N(i4 & 1, (599187 & i4) != 599186)) {
            ux2Var.S();
            hc1 hc1Var = null;
            if ((i & 1) == 0 || ux2Var.x()) {
                xy6 xy6VarR = yo1.R(null, ux2Var, 6, 2);
                i3 = i4 & (-3670017);
                fs4Var3 = cs4.b;
                xy6Var3 = xy6VarR;
            } else {
                ux2Var.Q();
                i3 = i4 & (-3670017);
                fs4Var3 = fs4Var;
                xy6Var3 = xy6Var;
            }
            int i5 = i3;
            ux2Var.q();
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            me1 me1Var = (me1) objK;
            Function1 function1K = et1.K(xy6Var3, function2, ux2Var, (i5 >> 6) & 112);
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new l5(2, hc1Var, b);
                ux2Var.g0(objK2);
            }
            ck3.i(f88.a, (hw2) objK2, ux2Var);
            xy6 xy6Var4 = xy6Var3;
            yo1.k(function2, androidx.compose.ui.platform.a.a(fs4Var3, str), xy6Var4, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(133436762, new h5(me1Var, z2, function1K, function0, function1, str), ux2Var), ux2Var, (i5 >> 9) & 14, 3072, 8184);
            xy6Var2 = xy6Var4;
            fs4Var2 = fs4Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new i5(z2, function0, function1, function2, fs4Var2, str, xy6Var2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0158  */
    /* JADX WARN: Code duplicated, block: B:102:0x0181  */
    /* JADX WARN: Code duplicated, block: B:105:0x0198  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0144  */
    public static final void b(final Function0 function0, final yy0 yy0Var, fs4 fs4Var, hw2 hw2Var, final hw2 hw2Var2, final hw2 hw2Var3, pw6 pw6Var, long j, long j2, long j3, long j4, a12 a12Var, ux2 ux2Var, final int i, final int i2, final int i3) {
        Function0 function1;
        int i4;
        fs4 fs4Var2;
        int i5;
        hw2 hw2Var4;
        int i6;
        int i7;
        int i8;
        int i9;
        a12 a12Var2;
        int i10;
        boolean z2;
        final pw6 pw6Var2;
        final long j5;
        final fs4 fs4Var3;
        final a12 a12Var3;
        final hw2 hw2Var5;
        final long j6;
        final long j7;
        final long j8;
        j56 j56VarR;
        fs4 fs4Var4;
        pw6 pw6VarB;
        long jC;
        int i11;
        int i12;
        int i13;
        a12 a12Var4;
        hw2 hw2Var6;
        long j9;
        long j10;
        long j11;
        int i14;
        int i15;
        ux2Var.Y(94478519);
        if ((i & 6) == 0) {
            function1 = function0;
            i4 = (ux2Var.h(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= ux2Var.h(yy0Var) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 == 0) {
            if ((i & 384) == 0) {
                fs4Var2 = fs4Var;
                i4 |= ux2Var.f(fs4Var2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    hw2Var4 = hw2Var;
                    if (ux2Var.h(hw2Var4)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 24576;
                if ((196608 & i) != 0) {
                    if (ux2Var.h(hw2Var2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i7 |= i15;
                }
                if ((1572864 & i) != 0) {
                    if (ux2Var.h(hw2Var3)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i7 |= i14;
                }
                if ((12582912 & i) == 0) {
                    i7 |= 4194304;
                }
                if ((100663296 & i) == 0) {
                    i7 |= 33554432;
                }
                if ((805306368 & i) == 0) {
                    i7 |= 268435456;
                }
                i8 = i2 | 402;
                i9 = i3 & 8192;
                if (i9 != 0) {
                    if ((i2 & 3072) == 0) {
                        a12Var2 = a12Var;
                        if (ux2Var.f(a12Var2)) {
                            i10 = 2048;
                        } else {
                            i10 = 1024;
                        }
                        i8 |= i10;
                    }
                    if ((i7 & 306783379) == 306783378 || (i8 & 1171) != 1170) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (ux2Var.N(i7 & 1, z2)) {
                        ux2Var.S();
                        if ((i & 1) != 0 || ux2Var.x()) {
                            if (i16 != 0) {
                                fs4Var4 = cs4.b;
                            } else {
                                fs4Var4 = fs4Var2;
                            }
                            if (i5 != 0) {
                                hw2Var4 = null;
                            }
                            pw6VarB = ux6.b(au8.n, ux2Var);
                            jC = bw0.c(au8.m, ux2Var);
                            long jC2 = bw0.c(au8.s, ux2Var);
                            i11 = i7 & (-2143289345);
                            long jC3 = bw0.c(au8.f364o, ux2Var);
                            long jC4 = bw0.c(au8.q, ux2Var);
                            i12 = i8 & (-127);
                            if (i9 != 0) {
                                i13 = i11;
                                a12Var4 = new a12(7);
                            } else {
                                i13 = i11;
                                a12Var4 = a12Var2;
                            }
                            hw2Var6 = hw2Var4;
                            j9 = jC2;
                            j10 = jC3;
                            j11 = jC4;
                        } else {
                            ux2Var.Q();
                            i13 = i7 & (-2143289345);
                            pw6VarB = pw6Var;
                            j9 = j2;
                            j11 = j4;
                            i12 = i8 & (-127);
                            fs4Var4 = fs4Var2;
                            a12Var4 = a12Var2;
                            hw2Var6 = hw2Var4;
                            jC = j;
                            j10 = j3;
                        }
                        ux2Var.q();
                        yd.c(function1, yy0Var, fs4Var4, hw2Var6, hw2Var2, hw2Var3, pw6VarB, jC, j9, j10, j11, a12Var4, ux2Var, i13 & 2147483646, i12 & 8190);
                        hw2Var5 = hw2Var6;
                        a12Var3 = a12Var4;
                        fs4Var3 = fs4Var4;
                        j5 = j11;
                        j8 = j10;
                        j7 = j9;
                        j6 = jC;
                        pw6Var2 = pw6VarB;
                    } else {
                        ux2Var.Q();
                        pw6Var2 = pw6Var;
                        j5 = j4;
                        fs4Var3 = fs4Var2;
                        a12Var3 = a12Var2;
                        hw2Var5 = hw2Var4;
                        j6 = j;
                        j7 = j2;
                        j8 = j3;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.wf
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iY = yo1.Y(i | 1);
                                int iY2 = yo1.Y(i2);
                                uf0.b(function0, yy0Var, fs4Var3, hw2Var5, hw2Var2, hw2Var3, pw6Var2, j6, j7, j8, j5, a12Var3, (ux2) obj, iY, iY2, i3);
                                return f88.a;
                            }
                        };
                    }
                }
                i8 = 3474;
                a12Var2 = a12Var;
                if ((i7 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (ux2Var.N(i7 & 1, z2)) {
                    ux2Var.S();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        if (i5 != 0) {
                            hw2Var4 = null;
                        }
                        pw6VarB = ux6.b(au8.n, ux2Var);
                        jC = bw0.c(au8.m, ux2Var);
                        long jC5 = bw0.c(au8.s, ux2Var);
                        i11 = i7 & (-2143289345);
                        long jC6 = bw0.c(au8.f364o, ux2Var);
                        long jC7 = bw0.c(au8.q, ux2Var);
                        i12 = i8 & (-127);
                        if (i9 != 0) {
                            i13 = i11;
                            a12Var4 = new a12(7);
                        } else {
                            i13 = i11;
                            a12Var4 = a12Var2;
                        }
                        hw2Var6 = hw2Var4;
                        j9 = jC5;
                        j10 = jC6;
                        j11 = jC7;
                    } else {
                        if (i16 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        if (i5 != 0) {
                            hw2Var4 = null;
                        }
                        pw6VarB = ux6.b(au8.n, ux2Var);
                        jC = bw0.c(au8.m, ux2Var);
                        long jC8 = bw0.c(au8.s, ux2Var);
                        i11 = i7 & (-2143289345);
                        long jC9 = bw0.c(au8.f364o, ux2Var);
                        long jC10 = bw0.c(au8.q, ux2Var);
                        i12 = i8 & (-127);
                        if (i9 != 0) {
                            i13 = i11;
                            a12Var4 = new a12(7);
                        } else {
                            i13 = i11;
                            a12Var4 = a12Var2;
                        }
                        hw2Var6 = hw2Var4;
                        j9 = jC8;
                        j10 = jC9;
                        j11 = jC10;
                    }
                    ux2Var.q();
                    yd.c(function1, yy0Var, fs4Var4, hw2Var6, hw2Var2, hw2Var3, pw6VarB, jC, j9, j10, j11, a12Var4, ux2Var, i13 & 2147483646, i12 & 8190);
                    hw2Var5 = hw2Var6;
                    a12Var3 = a12Var4;
                    fs4Var3 = fs4Var4;
                    j5 = j11;
                    j8 = j10;
                    j7 = j9;
                    j6 = jC;
                    pw6Var2 = pw6VarB;
                } else {
                    ux2Var.Q();
                    pw6Var2 = pw6Var;
                    j5 = j4;
                    fs4Var3 = fs4Var2;
                    a12Var3 = a12Var2;
                    hw2Var5 = hw2Var4;
                    j6 = j;
                    j7 = j2;
                    j8 = j3;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.wf
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iY = yo1.Y(i | 1);
                            int iY2 = yo1.Y(i2);
                            uf0.b(function0, yy0Var, fs4Var3, hw2Var5, hw2Var2, hw2Var3, pw6Var2, j6, j7, j8, j5, a12Var3, (ux2) obj, iY, iY2, i3);
                            return f88.a;
                        }
                    };
                }
            }
            i4 |= 3072;
            hw2Var4 = hw2Var;
            i7 = i4 | 24576;
            if ((196608 & i) != 0) {
                if (ux2Var.h(hw2Var2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i7 |= i15;
            }
            if ((1572864 & i) != 0) {
                if (ux2Var.h(hw2Var3)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i7 |= i14;
            }
            if ((12582912 & i) == 0) {
                i7 |= 4194304;
            }
            if ((100663296 & i) == 0) {
                i7 |= 33554432;
            }
            if ((805306368 & i) == 0) {
                i7 |= 268435456;
            }
            i8 = i2 | 402;
            i9 = i3 & 8192;
            if (i9 != 0) {
                if ((i2 & 3072) == 0) {
                    a12Var2 = a12Var;
                    if (ux2Var.f(a12Var2)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i8 |= i10;
                }
                if ((i7 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (ux2Var.N(i7 & 1, z2)) {
                    ux2Var.S();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        if (i5 != 0) {
                            hw2Var4 = null;
                        }
                        pw6VarB = ux6.b(au8.n, ux2Var);
                        jC = bw0.c(au8.m, ux2Var);
                        long jC11 = bw0.c(au8.s, ux2Var);
                        i11 = i7 & (-2143289345);
                        long jC12 = bw0.c(au8.f364o, ux2Var);
                        long jC13 = bw0.c(au8.q, ux2Var);
                        i12 = i8 & (-127);
                        if (i9 != 0) {
                            i13 = i11;
                            a12Var4 = new a12(7);
                        } else {
                            i13 = i11;
                            a12Var4 = a12Var2;
                        }
                        hw2Var6 = hw2Var4;
                        j9 = jC11;
                        j10 = jC12;
                        j11 = jC13;
                    } else {
                        if (i16 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        if (i5 != 0) {
                            hw2Var4 = null;
                        }
                        pw6VarB = ux6.b(au8.n, ux2Var);
                        jC = bw0.c(au8.m, ux2Var);
                        long jC14 = bw0.c(au8.s, ux2Var);
                        i11 = i7 & (-2143289345);
                        long jC15 = bw0.c(au8.f364o, ux2Var);
                        long jC16 = bw0.c(au8.q, ux2Var);
                        i12 = i8 & (-127);
                        if (i9 != 0) {
                            i13 = i11;
                            a12Var4 = new a12(7);
                        } else {
                            i13 = i11;
                            a12Var4 = a12Var2;
                        }
                        hw2Var6 = hw2Var4;
                        j9 = jC14;
                        j10 = jC15;
                        j11 = jC16;
                    }
                    ux2Var.q();
                    yd.c(function1, yy0Var, fs4Var4, hw2Var6, hw2Var2, hw2Var3, pw6VarB, jC, j9, j10, j11, a12Var4, ux2Var, i13 & 2147483646, i12 & 8190);
                    hw2Var5 = hw2Var6;
                    a12Var3 = a12Var4;
                    fs4Var3 = fs4Var4;
                    j5 = j11;
                    j8 = j10;
                    j7 = j9;
                    j6 = jC;
                    pw6Var2 = pw6VarB;
                } else {
                    ux2Var.Q();
                    pw6Var2 = pw6Var;
                    j5 = j4;
                    fs4Var3 = fs4Var2;
                    a12Var3 = a12Var2;
                    hw2Var5 = hw2Var4;
                    j6 = j;
                    j7 = j2;
                    j8 = j3;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.wf
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iY = yo1.Y(i | 1);
                            int iY2 = yo1.Y(i2);
                            uf0.b(function0, yy0Var, fs4Var3, hw2Var5, hw2Var2, hw2Var3, pw6Var2, j6, j7, j8, j5, a12Var3, (ux2) obj, iY, iY2, i3);
                            return f88.a;
                        }
                    };
                }
            }
            i8 = 3474;
            a12Var2 = a12Var;
            if ((i7 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (ux2Var.N(i7 & 1, z2)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if (i5 != 0) {
                        hw2Var4 = null;
                    }
                    pw6VarB = ux6.b(au8.n, ux2Var);
                    jC = bw0.c(au8.m, ux2Var);
                    long jC17 = bw0.c(au8.s, ux2Var);
                    i11 = i7 & (-2143289345);
                    long jC18 = bw0.c(au8.f364o, ux2Var);
                    long jC19 = bw0.c(au8.q, ux2Var);
                    i12 = i8 & (-127);
                    if (i9 != 0) {
                        i13 = i11;
                        a12Var4 = new a12(7);
                    } else {
                        i13 = i11;
                        a12Var4 = a12Var2;
                    }
                    hw2Var6 = hw2Var4;
                    j9 = jC17;
                    j10 = jC18;
                    j11 = jC19;
                } else {
                    if (i16 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if (i5 != 0) {
                        hw2Var4 = null;
                    }
                    pw6VarB = ux6.b(au8.n, ux2Var);
                    jC = bw0.c(au8.m, ux2Var);
                    long jC110 = bw0.c(au8.s, ux2Var);
                    i11 = i7 & (-2143289345);
                    long jC111 = bw0.c(au8.f364o, ux2Var);
                    long jC112 = bw0.c(au8.q, ux2Var);
                    i12 = i8 & (-127);
                    if (i9 != 0) {
                        i13 = i11;
                        a12Var4 = new a12(7);
                    } else {
                        i13 = i11;
                        a12Var4 = a12Var2;
                    }
                    hw2Var6 = hw2Var4;
                    j9 = jC110;
                    j10 = jC111;
                    j11 = jC112;
                }
                ux2Var.q();
                yd.c(function1, yy0Var, fs4Var4, hw2Var6, hw2Var2, hw2Var3, pw6VarB, jC, j9, j10, j11, a12Var4, ux2Var, i13 & 2147483646, i12 & 8190);
                hw2Var5 = hw2Var6;
                a12Var3 = a12Var4;
                fs4Var3 = fs4Var4;
                j5 = j11;
                j8 = j10;
                j7 = j9;
                j6 = jC;
                pw6Var2 = pw6VarB;
            } else {
                ux2Var.Q();
                pw6Var2 = pw6Var;
                j5 = j4;
                fs4Var3 = fs4Var2;
                a12Var3 = a12Var2;
                hw2Var5 = hw2Var4;
                j6 = j;
                j7 = j2;
                j8 = j3;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.wf
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iY = yo1.Y(i | 1);
                        int iY2 = yo1.Y(i2);
                        uf0.b(function0, yy0Var, fs4Var3, hw2Var5, hw2Var2, hw2Var3, pw6Var2, j6, j7, j8, j5, a12Var3, (ux2) obj, iY, iY2, i3);
                        return f88.a;
                    }
                };
            }
        }
        i4 |= 384;
        fs4Var2 = fs4Var;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                hw2Var4 = hw2Var;
                if (ux2Var.h(hw2Var4)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i4 | 24576;
            if ((196608 & i) != 0) {
                if (ux2Var.h(hw2Var2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i7 |= i15;
            }
            if ((1572864 & i) != 0) {
                if (ux2Var.h(hw2Var3)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i7 |= i14;
            }
            if ((12582912 & i) == 0) {
                i7 |= 4194304;
            }
            if ((100663296 & i) == 0) {
                i7 |= 33554432;
            }
            if ((805306368 & i) == 0) {
                i7 |= 268435456;
            }
            i8 = i2 | 402;
            i9 = i3 & 8192;
            if (i9 != 0) {
                if ((i2 & 3072) == 0) {
                    a12Var2 = a12Var;
                    if (ux2Var.f(a12Var2)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i8 |= i10;
                }
                if ((i7 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (ux2Var.N(i7 & 1, z2)) {
                    ux2Var.S();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        if (i5 != 0) {
                            hw2Var4 = null;
                        }
                        pw6VarB = ux6.b(au8.n, ux2Var);
                        jC = bw0.c(au8.m, ux2Var);
                        long jC113 = bw0.c(au8.s, ux2Var);
                        i11 = i7 & (-2143289345);
                        long jC114 = bw0.c(au8.f364o, ux2Var);
                        long jC115 = bw0.c(au8.q, ux2Var);
                        i12 = i8 & (-127);
                        if (i9 != 0) {
                            i13 = i11;
                            a12Var4 = new a12(7);
                        } else {
                            i13 = i11;
                            a12Var4 = a12Var2;
                        }
                        hw2Var6 = hw2Var4;
                        j9 = jC113;
                        j10 = jC114;
                        j11 = jC115;
                    } else {
                        if (i16 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        if (i5 != 0) {
                            hw2Var4 = null;
                        }
                        pw6VarB = ux6.b(au8.n, ux2Var);
                        jC = bw0.c(au8.m, ux2Var);
                        long jC116 = bw0.c(au8.s, ux2Var);
                        i11 = i7 & (-2143289345);
                        long jC117 = bw0.c(au8.f364o, ux2Var);
                        long jC118 = bw0.c(au8.q, ux2Var);
                        i12 = i8 & (-127);
                        if (i9 != 0) {
                            i13 = i11;
                            a12Var4 = new a12(7);
                        } else {
                            i13 = i11;
                            a12Var4 = a12Var2;
                        }
                        hw2Var6 = hw2Var4;
                        j9 = jC116;
                        j10 = jC117;
                        j11 = jC118;
                    }
                    ux2Var.q();
                    yd.c(function1, yy0Var, fs4Var4, hw2Var6, hw2Var2, hw2Var3, pw6VarB, jC, j9, j10, j11, a12Var4, ux2Var, i13 & 2147483646, i12 & 8190);
                    hw2Var5 = hw2Var6;
                    a12Var3 = a12Var4;
                    fs4Var3 = fs4Var4;
                    j5 = j11;
                    j8 = j10;
                    j7 = j9;
                    j6 = jC;
                    pw6Var2 = pw6VarB;
                } else {
                    ux2Var.Q();
                    pw6Var2 = pw6Var;
                    j5 = j4;
                    fs4Var3 = fs4Var2;
                    a12Var3 = a12Var2;
                    hw2Var5 = hw2Var4;
                    j6 = j;
                    j7 = j2;
                    j8 = j3;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.wf
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iY = yo1.Y(i | 1);
                            int iY2 = yo1.Y(i2);
                            uf0.b(function0, yy0Var, fs4Var3, hw2Var5, hw2Var2, hw2Var3, pw6Var2, j6, j7, j8, j5, a12Var3, (ux2) obj, iY, iY2, i3);
                            return f88.a;
                        }
                    };
                }
            }
            i8 = 3474;
            a12Var2 = a12Var;
            if ((i7 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (ux2Var.N(i7 & 1, z2)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if (i5 != 0) {
                        hw2Var4 = null;
                    }
                    pw6VarB = ux6.b(au8.n, ux2Var);
                    jC = bw0.c(au8.m, ux2Var);
                    long jC119 = bw0.c(au8.s, ux2Var);
                    i11 = i7 & (-2143289345);
                    long jC1110 = bw0.c(au8.f364o, ux2Var);
                    long jC1111 = bw0.c(au8.q, ux2Var);
                    i12 = i8 & (-127);
                    if (i9 != 0) {
                        i13 = i11;
                        a12Var4 = new a12(7);
                    } else {
                        i13 = i11;
                        a12Var4 = a12Var2;
                    }
                    hw2Var6 = hw2Var4;
                    j9 = jC119;
                    j10 = jC1110;
                    j11 = jC1111;
                } else {
                    if (i16 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if (i5 != 0) {
                        hw2Var4 = null;
                    }
                    pw6VarB = ux6.b(au8.n, ux2Var);
                    jC = bw0.c(au8.m, ux2Var);
                    long jC1112 = bw0.c(au8.s, ux2Var);
                    i11 = i7 & (-2143289345);
                    long jC1113 = bw0.c(au8.f364o, ux2Var);
                    long jC1114 = bw0.c(au8.q, ux2Var);
                    i12 = i8 & (-127);
                    if (i9 != 0) {
                        i13 = i11;
                        a12Var4 = new a12(7);
                    } else {
                        i13 = i11;
                        a12Var4 = a12Var2;
                    }
                    hw2Var6 = hw2Var4;
                    j9 = jC1112;
                    j10 = jC1113;
                    j11 = jC1114;
                }
                ux2Var.q();
                yd.c(function1, yy0Var, fs4Var4, hw2Var6, hw2Var2, hw2Var3, pw6VarB, jC, j9, j10, j11, a12Var4, ux2Var, i13 & 2147483646, i12 & 8190);
                hw2Var5 = hw2Var6;
                a12Var3 = a12Var4;
                fs4Var3 = fs4Var4;
                j5 = j11;
                j8 = j10;
                j7 = j9;
                j6 = jC;
                pw6Var2 = pw6VarB;
            } else {
                ux2Var.Q();
                pw6Var2 = pw6Var;
                j5 = j4;
                fs4Var3 = fs4Var2;
                a12Var3 = a12Var2;
                hw2Var5 = hw2Var4;
                j6 = j;
                j7 = j2;
                j8 = j3;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.wf
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iY = yo1.Y(i | 1);
                        int iY2 = yo1.Y(i2);
                        uf0.b(function0, yy0Var, fs4Var3, hw2Var5, hw2Var2, hw2Var3, pw6Var2, j6, j7, j8, j5, a12Var3, (ux2) obj, iY, iY2, i3);
                        return f88.a;
                    }
                };
            }
        }
        i4 |= 3072;
        hw2Var4 = hw2Var;
        i7 = i4 | 24576;
        if ((196608 & i) != 0) {
            if (ux2Var.h(hw2Var2)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i7 |= i15;
        }
        if ((1572864 & i) != 0) {
            if (ux2Var.h(hw2Var3)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i7 |= i14;
        }
        if ((12582912 & i) == 0) {
            i7 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i7 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i7 |= 268435456;
        }
        i8 = i2 | 402;
        i9 = i3 & 8192;
        if (i9 != 0) {
            if ((i2 & 3072) == 0) {
                a12Var2 = a12Var;
                if (ux2Var.f(a12Var2)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i8 |= i10;
            }
            if ((i7 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (ux2Var.N(i7 & 1, z2)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if (i5 != 0) {
                        hw2Var4 = null;
                    }
                    pw6VarB = ux6.b(au8.n, ux2Var);
                    jC = bw0.c(au8.m, ux2Var);
                    long jC1115 = bw0.c(au8.s, ux2Var);
                    i11 = i7 & (-2143289345);
                    long jC1116 = bw0.c(au8.f364o, ux2Var);
                    long jC1117 = bw0.c(au8.q, ux2Var);
                    i12 = i8 & (-127);
                    if (i9 != 0) {
                        i13 = i11;
                        a12Var4 = new a12(7);
                    } else {
                        i13 = i11;
                        a12Var4 = a12Var2;
                    }
                    hw2Var6 = hw2Var4;
                    j9 = jC1115;
                    j10 = jC1116;
                    j11 = jC1117;
                } else {
                    if (i16 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if (i5 != 0) {
                        hw2Var4 = null;
                    }
                    pw6VarB = ux6.b(au8.n, ux2Var);
                    jC = bw0.c(au8.m, ux2Var);
                    long jC1118 = bw0.c(au8.s, ux2Var);
                    i11 = i7 & (-2143289345);
                    long jC1119 = bw0.c(au8.f364o, ux2Var);
                    long jC11110 = bw0.c(au8.q, ux2Var);
                    i12 = i8 & (-127);
                    if (i9 != 0) {
                        i13 = i11;
                        a12Var4 = new a12(7);
                    } else {
                        i13 = i11;
                        a12Var4 = a12Var2;
                    }
                    hw2Var6 = hw2Var4;
                    j9 = jC1118;
                    j10 = jC1119;
                    j11 = jC11110;
                }
                ux2Var.q();
                yd.c(function1, yy0Var, fs4Var4, hw2Var6, hw2Var2, hw2Var3, pw6VarB, jC, j9, j10, j11, a12Var4, ux2Var, i13 & 2147483646, i12 & 8190);
                hw2Var5 = hw2Var6;
                a12Var3 = a12Var4;
                fs4Var3 = fs4Var4;
                j5 = j11;
                j8 = j10;
                j7 = j9;
                j6 = jC;
                pw6Var2 = pw6VarB;
            } else {
                ux2Var.Q();
                pw6Var2 = pw6Var;
                j5 = j4;
                fs4Var3 = fs4Var2;
                a12Var3 = a12Var2;
                hw2Var5 = hw2Var4;
                j6 = j;
                j7 = j2;
                j8 = j3;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.wf
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iY = yo1.Y(i | 1);
                        int iY2 = yo1.Y(i2);
                        uf0.b(function0, yy0Var, fs4Var3, hw2Var5, hw2Var2, hw2Var3, pw6Var2, j6, j7, j8, j5, a12Var3, (ux2) obj, iY, iY2, i3);
                        return f88.a;
                    }
                };
            }
        }
        i8 = 3474;
        a12Var2 = a12Var;
        if ((i7 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (ux2Var.N(i7 & 1, z2)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if (i5 != 0) {
                    hw2Var4 = null;
                }
                pw6VarB = ux6.b(au8.n, ux2Var);
                jC = bw0.c(au8.m, ux2Var);
                long jC11111 = bw0.c(au8.s, ux2Var);
                i11 = i7 & (-2143289345);
                long jC11112 = bw0.c(au8.f364o, ux2Var);
                long jC11113 = bw0.c(au8.q, ux2Var);
                i12 = i8 & (-127);
                if (i9 != 0) {
                    i13 = i11;
                    a12Var4 = new a12(7);
                } else {
                    i13 = i11;
                    a12Var4 = a12Var2;
                }
                hw2Var6 = hw2Var4;
                j9 = jC11111;
                j10 = jC11112;
                j11 = jC11113;
            } else {
                if (i16 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if (i5 != 0) {
                    hw2Var4 = null;
                }
                pw6VarB = ux6.b(au8.n, ux2Var);
                jC = bw0.c(au8.m, ux2Var);
                long jC11114 = bw0.c(au8.s, ux2Var);
                i11 = i7 & (-2143289345);
                long jC11115 = bw0.c(au8.f364o, ux2Var);
                long jC11116 = bw0.c(au8.q, ux2Var);
                i12 = i8 & (-127);
                if (i9 != 0) {
                    i13 = i11;
                    a12Var4 = new a12(7);
                } else {
                    i13 = i11;
                    a12Var4 = a12Var2;
                }
                hw2Var6 = hw2Var4;
                j9 = jC11114;
                j10 = jC11115;
                j11 = jC11116;
            }
            ux2Var.q();
            yd.c(function1, yy0Var, fs4Var4, hw2Var6, hw2Var2, hw2Var3, pw6VarB, jC, j9, j10, j11, a12Var4, ux2Var, i13 & 2147483646, i12 & 8190);
            hw2Var5 = hw2Var6;
            a12Var3 = a12Var4;
            fs4Var3 = fs4Var4;
            j5 = j11;
            j8 = j10;
            j7 = j9;
            j6 = jC;
            pw6Var2 = pw6VarB;
        } else {
            ux2Var.Q();
            pw6Var2 = pw6Var;
            j5 = j4;
            fs4Var3 = fs4Var2;
            a12Var3 = a12Var2;
            hw2Var5 = hw2Var4;
            j6 = j;
            j7 = j2;
            j8 = j3;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.wf
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    uf0.b(function0, yy0Var, fs4Var3, hw2Var5, hw2Var2, hw2Var3, pw6Var2, j6, j7, j8, j5, a12Var3, (ux2) obj, iY, iY2, i3);
                    return f88.a;
                }
            };
        }
    }

    public static final void c(int i, Function1 function1, h71 h71Var, r81 r81Var, ux2 ux2Var, fs4 fs4Var, boolean z2, boolean z3) {
        fs4 fs4Var2;
        long j;
        vl7 vl7VarE;
        ux2 ux2Var2 = ux2Var;
        h71Var.getClass();
        String str = h71Var.f954o;
        function1.getClass();
        ux2Var2.Y(424290918);
        int i2 = i | (ux2Var2.h(h71Var) ? 4 : 2) | (ux2Var2.g(z2) ? 32 : 16) | (ux2Var2.h(function1) ? 256 : 128) | 3072 | (ux2Var2.g(z3) ? 16384 : 8192) | (ux2Var2.h(r81Var) ? 131072 : 65536);
        byte b = 0;
        if (ux2Var2.N(i2 & 1, (74899 & i2) != 74898)) {
            ux2Var2.S();
            int i3 = i & 1;
            cs4 cs4Var = cs4.b;
            if (i3 == 0 || ux2Var2.x()) {
                fs4Var2 = cs4Var;
            } else {
                ux2Var2.Q();
                fs4Var2 = fs4Var;
            }
            ux2Var2.q();
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(Boolean.FALSE);
                ux2Var2.g0(objK);
            }
            px4 px4Var = (px4) objK;
            fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.c(fs4Var2, 1.0f), sf6.a(16.0f));
            if (z2) {
                ux2Var2.W(-278304902);
                j = ((rn4) ux2Var2.j(un4.a)).a.G;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-278303887);
                ux2Var2.p(false);
                j = rv0.g;
            }
            fs4 fs4VarS = au8.s(fs4VarJ, j, kh.V);
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar) {
                objK2 = new la(px4Var, (byte) 9);
                ux2Var2.g0(objK2);
            }
            Function0 function0 = (Function0) objK2;
            boolean zH = ((i2 & 896) == 256) | ux2Var2.h(h71Var);
            Object objK3 = ux2Var2.K();
            if (zH || objK3 == awVar) {
                objK3 = new s81(function1, h71Var, b);
                ux2Var2.g0(objK3);
            }
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.D(androidx.compose.foundation.b.d(fs4VarS, function0, (Function0) objK3), 16.0f, 0.0f, 2), "TVTA-devicesScreen-contactList-contactItem");
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS2 = s(ux2Var2, fs4VarA);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z4 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z4) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(dg6VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            boolean zF = ux2Var2.f(str);
            Object objK4 = ux2Var2.K();
            if (zF || objK4 == awVar) {
                objK4 = x67.o(str);
                ux2Var2.g0(objK4);
            }
            ba8 ba8Var = (ba8) objK4;
            ka0.x(ux2Var2);
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(ka0.D(cs4Var, 0.0f, 16.0f, 1), 40.0f), "TVTA-devicesScreen-contactList-userAvatar");
            hi7 hi7Var = hi7.Size40dp;
            String str2 = h71Var.f954o;
            ContactOnlineStatus contactOnlineStatus = h71Var.s;
            boolean z5 = contactOnlineStatus != null;
            if (contactOnlineStatus == null || (vl7VarE = y57.E(contactOnlineStatus)) == null) {
                vl7VarE = vl7.Offline;
            }
            String str3 = h71Var.r;
            ba8Var.getClass();
            fs4Var = fs4Var2;
            b77.d(hi7Var, fs4VarA2, z5, vl7VarE, 0L, 0L, str2, str3, ba8Var.m, new rv0(ba8Var.n), ux2Var2, 54, 104);
            fs4 fs4VarF = ka0.C(cs4Var, 16.0f, 8.0f).f(new s14(1.0f, true));
            kw0 kw0VarA = iw0.a(iq8.e, xz2.A, ux2Var2, 6);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS3 = s(ux2Var2, fs4VarF);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS3, iz0Var4, ux2Var2);
            fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-contactList-title");
            String str4 = h71Var.f954o;
            h72 h72Var = un4.a;
            qs7.b(str4, fs4VarA3, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, ((rn4) ux2Var2.j(h72Var)).b.j, ux2Var, 48, 24960, 110584);
            ux2Var2 = ux2Var;
            String str5 = h71Var.p;
            if (str5 == null) {
                ux2Var2.W(1800553237);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(1800553238);
                qs7.b(str5, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-contactList-email"), ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var, 48, 24960, 110584);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            boolean zBooleanValue = ((Boolean) px4Var.getValue()).booleanValue();
            Object objK5 = ux2Var2.K();
            if (objK5 == awVar) {
                objK5 = new va(px4Var, (byte) 10);
                ux2Var2.g0(objK5);
            }
            xk0.e((i2 & 14) | 3072 | ((i2 >> 12) & 112) | ((i2 << 3) & 458752), (Function1) objK5, h71Var, r81Var, ux2Var2, null, zBooleanValue, z3);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        fs4 fs4Var3 = fs4Var;
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new h70(i, function1, h71Var, r81Var, fs4Var3, z2, z3);
        }
    }

    public static final void d(w65 w65Var, he heVar, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ux2Var.f(w65Var) : ux2Var.h(w65Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(heVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 256 : 128;
        }
        boolean z2 = true;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean z3 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !ux2Var.f(w65Var))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objK = ux2Var.K();
            if (z4 || objK == e01.a) {
                objK = new m43(heVar, w65Var);
                ux2Var.g0(objK);
            }
            gk.a((m43) objK, null, new cp5(false, hn6.m, false), yy0Var, ux2Var, ((i2 << 3) & 7168) | 384, 2);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) w65Var, (Object) heVar, (Object) yy0Var, i, (byte) 1);
        }
    }

    public static final void e(boolean z2, Function0 function0, Function0 function1, String str, fs4 fs4Var, ux2 ux2Var, int i) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1832087022);
        int i2 = i | (ux2Var2.g(z2) ? 4 : 2) | (ux2Var2.h(function0) ? 32 : 16) | (ux2Var2.h(function1) ? 256 : 128) | (ux2Var2.f(str) ? 2048 : 1024);
        if (ux2Var2.N(i2 & 1, (i2 & 9363) != 9362)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = s(ux2Var2, fs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            String strConcat = str.concat("-signIn");
            cs4 cs4Var = cs4.b;
            int i3 = (i2 << 9) & 7168;
            m77.g(function0, ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), null, z2, strConcat, null, im3.a, ux2Var2, ((i2 >> 3) & 14) | 1572912 | i3, 36);
            ux2Var2 = ux2Var;
            g57.b(function1, androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), null, z2, str.concat("-createAnAccount"), null, im3.b, ux2Var2, ((i2 >> 6) & 14) | 1572912 | i3, 36);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new k5(z2, function0, function1, str, fs4Var, i, (byte) 0);
        }
    }

    public static final void f(final w65 w65Var, final boolean z2, final rb6 rb6Var, final boolean z3, long j, final float f, final fs4 fs4Var, ux2 ux2Var, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z4;
        ux2Var.Y(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ux2Var.f(w65Var) : ux2Var.h(w65Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.d(rb6Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.g(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 1048576 : 524288;
        }
        if (ux2Var.N(i2 & 1, (533651 & i2) != 533650)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                ux2Var.Q();
                i3 = i2 & (-57345);
                j3 = j;
            }
            ux2Var.q();
            rb6 rb6Var2 = rb6.n;
            rb6 rb6Var3 = rb6.m;
            if (z2) {
                np6 np6Var = uo6.a;
                z4 = (rb6Var == rb6Var3 && !z3) || (rb6Var == rb6Var2 && z3);
            } else {
                np6 np6Var2 = uo6.a;
                z4 = (rb6Var != rb6Var3 || z3) && !(rb6Var == rb6Var2 && z3);
            }
            v50 v50Var = z4 ? ga0.b : ga0.a;
            int i4 = i3 & 14;
            boolean zG = (i4 == 4 || ((i3 & 8) != 0 && ux2Var.h(w65Var))) | ((i3 & 112) == 32) | ux2Var.g(z4);
            Object objK = ux2Var.K();
            if (zG || objK == e01.a) {
                objK = new Function1() { // from class: o.nk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        op6 op6Var = (op6) obj;
                        long jA = w65Var.a();
                        op6Var.d(uo6.a, new to6(z2 ? l43.n : l43.f1328o, jA, z4 ? so6.m : so6.f2042o, (9223372034707292159L & jA) != 9205357640488583168L));
                        return f88.a;
                    }
                };
                ux2Var.g0(objK);
            }
            final fs4 fs4VarA = cp6.a(fs4Var, false, (Function1) objK);
            final ee8 ee8Var = (ee8) ux2Var.j(b11.t);
            long j4 = j3;
            v50 v50Var2 = v50Var;
            j2 = j4;
            d(w65Var, v50Var2, au8.O(1365123137, new hw2() { // from class: o.ok
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ux2 ux2Var2 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        dx5 dx5VarA = b11.t.a(ee8Var);
                        final long j5 = j2;
                        final boolean z5 = z4;
                        final fs4 fs4Var2 = fs4VarA;
                        final w65 w65Var2 = w65Var;
                        j51.l(dx5VarA, au8.O(1260045569, new hw2() { // from class: o.qk
                            @Override // o.hw2
                            public final Object invoke(Object obj3, Object obj4) {
                                ux2 ux2Var3 = (ux2) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final byte b = 1;
                                final byte b2 = 0;
                                if (ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j6 = j5;
                                    boolean z6 = z5;
                                    fs4 fs4Var3 = fs4Var2;
                                    final w65 w65Var3 = w65Var2;
                                    aw awVar = e01.a;
                                    if (j6 != 9205357640488583168L) {
                                        ux2Var3.W(3458246);
                                        dw dwVar = z6 ? mo8.b : mo8.a;
                                        fs4 fs4VarJ = androidx.compose.foundation.layout.b.j(fs4Var3, a42.b(j6), a42.a(j6), 0.0f, 0.0f, 12);
                                        dg6 dg6VarA = cg6.a(dwVar, xz2.x, ux2Var3, 0);
                                        int iHashCode = Long.hashCode(ux2Var3.T);
                                        yj5 yj5VarL = ux2Var3.l();
                                        fs4 fs4VarS = uf0.s(ux2Var3, fs4VarJ);
                                        yz0.c.getClass();
                                        ux2Var3.a0();
                                        if (ux2Var3.S) {
                                            ux2Var3.k(LayoutNode.e0);
                                        } else {
                                            ux2Var3.j0();
                                        }
                                        o67.n(dg6VarA, d82.v, ux2Var3);
                                        o67.n(yj5VarL, d82.u, ux2Var3);
                                        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var3);
                                        o67.l(ux2Var3);
                                        o67.n(fs4VarS, d82.t, ux2Var3);
                                        boolean zH = ux2Var3.h(w65Var3);
                                        Object objK2 = ux2Var3.K();
                                        if (zH || objK2 == awVar) {
                                            objK2 = new Function0() { // from class: o.rk
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object a() {
                                                    byte b3 = b2;
                                                    w65 w65Var4 = w65Var3;
                                                    switch (b3) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & w65Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & w65Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            ux2Var3.g0(objK2);
                                        }
                                        uf0.g(cs4.b, (Function0) objK2, z6, ux2Var3, 6);
                                        ux2Var3.p(true);
                                        ux2Var3.p(false);
                                    } else {
                                        ux2Var3.W(4389176);
                                        boolean zH2 = ux2Var3.h(w65Var3);
                                        Object objK3 = ux2Var3.K();
                                        if (zH2 || objK3 == awVar) {
                                            objK3 = new Function0() { // from class: o.rk
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object a() {
                                                    byte b3 = b;
                                                    w65 w65Var4 = w65Var3;
                                                    switch (b3) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & w65Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & w65Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            ux2Var3.g0(objK3);
                                        }
                                        uf0.g(fs4Var3, (Function0) objK3, z6, ux2Var3, 0);
                                        ux2Var3.p(false);
                                    }
                                } else {
                                    ux2Var3.Q();
                                }
                                return f88.a;
                            }
                        }, ux2Var2), ux2Var2, 56);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, i4 | 384);
        } else {
            ux2Var.Q();
            j2 = j;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            final long j5 = j2;
            j56VarR.d = new hw2() { // from class: o.pk
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uf0.f(w65Var, z2, rb6Var, z3, j5, f, fs4Var, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void g(final fs4 fs4Var, final Function0 function0, final boolean z2, ux2 ux2Var, final int i) {
        int i2;
        ux2Var.Y(2111672474);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (ux2Var.h(function0) ? 32 : 16) | (ux2Var.g(z2) ? 256 : 128);
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            np6 np6Var = uo6.a;
            b77.a(ux2Var, k(androidx.compose.foundation.layout.b.m(fs4Var, 25.0f, 25.0f), new w71(b, function0, z2)));
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.sk
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    uf0.g(fs4Var, function0, z2, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final Object h(nf nfVar, float f, mf mfVar, uj1 uj1Var, Object obj, jo joVar, og7 og7Var) {
        Object objC;
        float f2 = uj1Var.f(obj);
        h76 h76Var = new h76();
        h76Var.m = Float.isNaN(((wf5) nfVar.i).z()) ? 0.0f : ((wf5) nfVar.i).z();
        if (!Float.isNaN(f2)) {
            float f3 = h76Var.m;
            if (f3 != f2 && (objC = i67.c(f3, f2, f, joVar, new c9((Object) mfVar, (Object) h76Var, (byte) 1), og7Var)) == ne1.m) {
                return objC;
            }
        }
        return f88.a;
    }

    public static final fs4 i(fs4 fs4Var, float f, long j, pw6 pw6Var) {
        return fs4Var.f(new c90(f, new t57(j), pw6Var));
    }

    public static final fs4 j(fs4 fs4Var, hb0 hb0Var) {
        return fs4Var.f(new fb0(hb0Var));
    }

    public static fs4 k(fs4 fs4Var, iw2 iw2Var) {
        return fs4Var.f(new d01(iw2Var));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final vi l(hi0 hi0Var, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        vi viVarQ = wo1.a;
        cg cgVarA = wo1.b;
        nl0 nl0Var = wo1.c;
        if (viVarQ == null || cgVarA == null) {
            viVarQ = ds1.q(iCeil, iCeil, 1, 24);
            wo1.a = viVarQ;
            cgVarA = dg.a(viVarQ);
            wo1.b = cgVarA;
        } else {
            Bitmap bitmap = viVarQ.a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                viVarQ = ds1.q(iCeil, iCeil, 1, 24);
                wo1.a = viVarQ;
                cgVarA = dg.a(viVarQ);
                wo1.b = cgVarA;
            }
        }
        vi viVar = viVarQ;
        cg cgVar = cgVarA;
        if (nl0Var == null) {
            nl0Var = new nl0();
            wo1.c = nl0Var;
        }
        nl0 nl0Var2 = nl0Var;
        ml0 ml0Var = nl0Var2.m;
        j04 layoutDirection = hi0Var.m.getLayoutDirection();
        Bitmap bitmap2 = viVar.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        in1 in1Var = ml0Var.a;
        j04 j04Var = ml0Var.b;
        ll0 ll0Var = ml0Var.c;
        long j = ml0Var.d;
        ml0Var.a = hi0Var;
        ml0Var.b = layoutDirection;
        ml0Var.c = cgVar;
        ml0Var.d = jFloatToRawIntBits;
        cgVar.g();
        u52.k0(nl0Var2, rv0.b, nl0Var2.d(), 0.0f, 58);
        u52.k0(nl0Var2, j51.j(4278190080L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, 120);
        u52.t(nl0Var2, j51.j(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), null, 120);
        cgVar.p();
        ml0Var.a = in1Var;
        ml0Var.b = j04Var;
        ml0Var.c = ll0Var;
        ml0Var.d = j;
        return viVar;
    }

    public static final fs4 m(fs4 fs4Var, nf nfVar, hw2 hw2Var) {
        return fs4Var.f(new j52(nfVar, hw2Var));
    }

    public static final fs4 n(fs4 fs4Var, sq2 sq2Var) {
        return fs4Var.f(new tq2(sq2Var));
    }

    public static Drawable p(Context context, int i) {
        return bc6.c().d(context, i);
    }

    public static String q(zp0 zp0Var, eo3 eo3Var) {
        if (zp0Var.b(eo3Var)) {
            return null;
        }
        return zp0Var.getDescription();
    }

    public static final fs4 r(ux2 ux2Var, fs4 fs4Var) {
        if (fs4Var.b(new px((byte) 28))) {
            return fs4Var;
        }
        ux2Var.X(1219399079);
        fs4 fs4Var2 = (fs4) fs4Var.c(cs4.b, new t0(ux2Var, (byte) 9));
        ux2Var.p(false);
        return fs4Var2;
    }

    public static final fs4 s(ux2 ux2Var, fs4 fs4Var) {
        ux2Var.W(439770924);
        fs4 fs4VarR = r(ux2Var, fs4Var);
        ux2Var.p(false);
        return fs4VarR;
    }

    public static final fs4 t(Function1 function1) {
        return new jx3(function1, null);
    }

    public static final fs4 u(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new jx3(null, function1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(Function0 function0, hw2 hw2Var, jc1 jc1Var) {
        ye yeVar;
        if (jc1Var instanceof ye) {
            yeVar = (ye) jc1Var;
            int i = yeVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                yeVar.n = i - Integer.MIN_VALUE;
            } else {
                yeVar = new ye(jc1Var);
            }
        } else {
            yeVar = new ye(jc1Var);
        }
        Object obj = yeVar.m;
        int i2 = yeVar.n;
        hc1 hc1Var = null;
        try {
            if (i2 == 0) {
                ct1.a0(obj);
                j0 j0Var = new j0(function0, hw2Var, hc1Var, (byte) 5);
                yeVar.n = 1;
                Object objJ = hm3.j(j0Var, yeVar);
                ne1 ne1Var = ne1.m;
                if (objJ == ne1Var) {
                    return ne1Var;
                }
            } else {
                if (i2 != 1) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
            }
        } catch (ue unused) {
        }
        return f88.a;
    }

    public static final long x(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final List y(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(lv0.m0(list));
        }
        return ea2.m;
    }

    public static final Map z(Map map) {
        int size = map.size();
        if (size == 0) {
            return fa2.m;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) lv0.l0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public void o(kx6 kx6Var, float f, float f2) {
        kx6Var.d(f2 * f, 180.0f, 90.0f);
        double d = f2;
        double d2 = f;
        kx6Var.c((float) (Math.sin(Math.toRadians(90.0d)) * d * d2), (float) (Math.sin(Math.toRadians(0.0d)) * d * d2));
    }
}
