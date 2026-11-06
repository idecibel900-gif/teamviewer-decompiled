package o;

import android.content.Context;
import android.os.Looper;
import android.os.Trace;
import android.util.TypedValue;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.SubcomposeContentPainterElement;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class l47 {
    public static final void a(String str, rv0 rv0Var, xl1 xl1Var, am1 am1Var, bm1 bm1Var, ux2 ux2Var, int i) {
        ux2Var.Y(-1997815837);
        int i2 = i | (ux2Var.f(str) ? 4 : 2) | (ux2Var.f(rv0Var) ? 32 : 16) | (ux2Var.f(xl1Var) ? 256 : 128) | (ux2Var.f(am1Var) ? 2048 : 1024) | (ux2Var.f(bm1Var) ? 16384 : 8192);
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            long jI = et1.I(xl1Var.c, rv0.b);
            long jI2 = et1.I(xl1Var.n, rv0.b(0.15f, rv0Var != null ? rv0Var.a : et1.I(xl1Var.e, jI)));
            long jI3 = et1.I(xl1Var.f2530o, rv0Var != null ? rv0Var.a : et1.I(xl1Var.f, jI));
            pw6 pw6Var = am1Var.c;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = ka0.C(au8.s(iq8.j(cs4Var, pw6Var), jI2, kh.V).f(cs4Var), 10.0f, 3.0f);
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            j51.e(str, null, ot7.a(bm1Var.d, jI3, 0L, null, null, 0L, 0L, null, 16777214), null, 2, false, 1, 0, ux2Var, (i2 & 14) | 1597440, 938);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new o31((Object) str, (Object) rv0Var, (Object) xl1Var, (Object) am1Var, (Object) bm1Var, i, (byte) 13);
        }
    }

    public static final void b(wx wxVar, fs4 fs4Var, Function1 function1, he heVar, sb1 sb1Var, yy0 yy0Var, ux2 ux2Var, int i, int i2) {
        int i3;
        ux2Var.Y(-205779950);
        int i4 = i | (ux2Var.f(wxVar) ? 4 : 2) | (ux2Var.f(fs4Var) ? 256 : 128) | (ux2Var.h(function1) ? 2048 : 1024) | (ux2Var.h(null) ? 16384 : 8192) | (ux2Var.f(heVar) ? 131072 : 65536) | (ux2Var.f(sb1Var) ? 1048576 : 524288) | (ux2Var.c(1.0f) ? 8388608 : 4194304) | (ux2Var.f(null) ? 67108864 : 33554432) | (ux2Var.d(1) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (ux2Var.g(true) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 32 : 16;
        }
        if (ux2Var.N(i4 & 1, ((306783379 & i4) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            ke3 ke3VarD = va8.d(wxVar.a, sb1Var, ux2Var, (i4 >> 15) & 112);
            i46 i46Var = wxVar.c;
            int i5 = i4 >> 6;
            int i6 = i4 >> 12;
            ox oxVar = (ox) ux2Var.j(vc4.a);
            ux2Var.W(-1242991349);
            Trace.beginSection("rememberAsyncImagePainter");
            try {
                ke3 ke3VarC = va8.c(ke3VarD, ux2Var);
                va8.g(ke3VarC);
                qx qxVar = new qx(i46Var, ke3VarC, oxVar);
                Object objK = ux2Var.K();
                aw awVar = e01.a;
                if (objK == awVar) {
                    objK = new AsyncImagePainter(qxVar);
                    ux2Var.g0(objK);
                }
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objK;
                Object objK2 = ux2Var.K();
                if (objK2 == awVar) {
                    objK2 = ck3.w(ux2Var);
                    ux2Var.g0(objK2);
                }
                asyncImagePainter.x = (me1) objK2;
                asyncImagePainter.y = function1;
                asyncImagePainter.z = sb1Var;
                asyncImagePainter.A = true;
                asyncImagePainter.B = va8.a(ux2Var);
                asyncImagePainter.m(qxVar);
                ux2Var.p(false);
                Trace.endSection();
                a17 a17Var = ke3VarD.p;
                if (a17Var instanceof v61) {
                    ux2Var.W(-1470570430);
                    j51.g(fs4Var, heVar, true, au8.O(-374957172, new e70(a17Var, yy0Var, asyncImagePainter, heVar, sb1Var), ux2Var), ux2Var, (i5 & 14) | 3456 | (i6 & 112), 0);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-1471259157);
                    do4 do4VarC = ua0.c(heVar, true);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    yy0Var.d(new r46(ya0.a, asyncImagePainter, heVar, sb1Var), ux2Var, Integer.valueOf(i3 & 112));
                    ux2Var.p(true);
                    ux2Var.p(false);
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new nx(wxVar, fs4Var, function1, heVar, sb1Var, yy0Var, i, i2);
        }
    }

    public static final void c(final r46 r46Var, final fs4 fs4Var, ud5 ud5Var, he heVar, final sb1 sb1Var, float f, boolean z, ux2 ux2Var, final int i) {
        int i2;
        final ud5 ud5Var2;
        final he heVar2;
        final float f2;
        final boolean z2;
        ud5 ud5Var3;
        he heVar3;
        float f3;
        boolean z3;
        ux2Var.Y(-1375825518);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(r46Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.f(sb1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= 33554432;
        }
        if (ux2Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                ud5Var3 = r46Var.b;
                heVar3 = r46Var.c;
                f3 = 1.0f;
                z3 = true;
            } else {
                ux2Var.Q();
                ud5Var3 = ud5Var;
                heVar3 = heVar;
                f3 = f;
                z3 = z;
            }
            ux2Var.q();
            fs4 fs4VarF = fs4Var.f(new SubcomposeContentPainterElement(ud5Var3, heVar3, sb1Var, f3, z3));
            int i3 = va8.b;
            ei eiVar = ei.k;
            int iHashCode = Long.hashCode(ux2Var.T);
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarF);
            yj5 yj5VarL = ux2Var.l();
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(eiVar, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            ux2Var.p(true);
            ud5Var2 = ud5Var3;
            heVar2 = heVar3;
            f2 = f3;
            z2 = z3;
        } else {
            ux2Var.Q();
            ud5Var2 = ud5Var;
            heVar2 = heVar;
            f2 = f;
            z2 = z;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.id7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l47.c(r46Var, fs4Var, ud5Var2, heVar2, sb1Var, f2, z2, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:86:0x0153  */
    /* JADX WARN: Code duplicated, block: B:89:0x015e  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void d(sk7 sk7Var, boolean z, Function1 function1, fs4 fs4Var, String str, String str2, ux2 ux2Var, int i, int i2) {
        int i3;
        fs4 fs4Var2;
        int i4;
        int i5;
        String str3;
        int i6;
        byte b;
        boolean z2;
        String str4;
        fs4 fs4Var3;
        j56 j56VarR;
        fs4 fs4Var4;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objK;
        al7 al7Var;
        yy0 yy0VarO;
        int i7;
        function1.getClass();
        ux2Var.Y(-2108327828);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? ux2Var.f(sk7Var) : ux2Var.h(sk7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.h(function1) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (ux2Var.f(str)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i4 = 196608 | i3;
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((1572864 & i) == 0) {
                    str3 = str2;
                    if (ux2Var.f(str3)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                b = 1;
                if ((599187 & i4) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (ux2Var.N(i4 & 1, z2)) {
                    if (i8 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if (i5 != 0) {
                        str3 = "";
                    }
                    if ((i4 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i4 & 112) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z3 | z4;
                    objK = ux2Var.K();
                    if (z5 || objK == e01.a) {
                        objK = new fq0(function1, z, (byte) 1);
                        ux2Var.g0(objK);
                    }
                    fs4 fs4VarB = androidx.compose.foundation.b.b(fs4Var4, false, null, null, (Function0) objK, 15);
                    al7Var = sk7Var.c;
                    if (al7Var == null) {
                        ux2Var.W(407827196);
                        ux2Var.p(false);
                        yy0VarO = null;
                    } else {
                        ux2Var.W(407827197);
                        yy0VarO = au8.O(-1606426959, new tk7(al7Var, b), ux2Var);
                        ux2Var.p(false);
                    }
                    yy0 yy0Var = yy0VarO;
                    String str5 = str3;
                    pb4.a(au8.O(324157134, new uk7(sk7Var, str, (byte) 2), ux2Var), fs4VarB, au8.O(1032666603, new uk7(sk7Var, str, (byte) 3), ux2Var), yy0Var, au8.O(1505006249, new na(z, (Object) function1, (Object) str, (Object) str5, (byte) 7), ux2Var), null, ux2Var, 199686, 452);
                    str4 = str5;
                    fs4Var3 = fs4Var4;
                } else {
                    ux2Var.Q();
                    str4 = str3;
                    fs4Var3 = fs4Var2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new w4(sk7Var, z, function1, fs4Var3, str, str4, i, i2);
                }
            }
            i4 = 1769472 | i3;
            str3 = str2;
            b = 1;
            if ((599187 & i4) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ux2Var.N(i4 & 1, z2)) {
                if (i8 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if (i5 != 0) {
                    str3 = "";
                }
                if ((i4 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i4 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z3 | z4;
                objK = ux2Var.K();
                if (z5) {
                    objK = new fq0(function1, z, (byte) 1);
                    ux2Var.g0(objK);
                } else {
                    objK = new fq0(function1, z, (byte) 1);
                    ux2Var.g0(objK);
                }
                fs4 fs4VarB2 = androidx.compose.foundation.b.b(fs4Var4, false, null, null, (Function0) objK, 15);
                al7Var = sk7Var.c;
                if (al7Var == null) {
                    ux2Var.W(407827196);
                    ux2Var.p(false);
                    yy0VarO = null;
                } else {
                    ux2Var.W(407827197);
                    yy0VarO = au8.O(-1606426959, new tk7(al7Var, b), ux2Var);
                    ux2Var.p(false);
                }
                yy0 yy0Var2 = yy0VarO;
                String str6 = str3;
                pb4.a(au8.O(324157134, new uk7(sk7Var, str, (byte) 2), ux2Var), fs4VarB2, au8.O(1032666603, new uk7(sk7Var, str, (byte) 3), ux2Var), yy0Var2, au8.O(1505006249, new na(z, (Object) function1, (Object) str, (Object) str6, (byte) 7), ux2Var), null, ux2Var, 199686, 452);
                str4 = str6;
                fs4Var3 = fs4Var4;
            } else {
                ux2Var.Q();
                str4 = str3;
                fs4Var3 = fs4Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new w4(sk7Var, z, function1, fs4Var3, str, str4, i, i2);
            }
        }
        i3 |= 3072;
        fs4Var2 = fs4Var;
        if ((i & 24576) == 0) {
            if (ux2Var.f(str)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        i4 = 196608 | i3;
        i5 = i2 & 64;
        if (i5 != 0) {
            if ((1572864 & i) == 0) {
                str3 = str2;
                if (ux2Var.f(str3)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            b = 1;
            if ((599187 & i4) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ux2Var.N(i4 & 1, z2)) {
                if (i8 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if (i5 != 0) {
                    str3 = "";
                }
                if ((i4 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i4 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z3 | z4;
                objK = ux2Var.K();
                if (z5) {
                    objK = new fq0(function1, z, (byte) 1);
                    ux2Var.g0(objK);
                } else {
                    objK = new fq0(function1, z, (byte) 1);
                    ux2Var.g0(objK);
                }
                fs4 fs4VarB3 = androidx.compose.foundation.b.b(fs4Var4, false, null, null, (Function0) objK, 15);
                al7Var = sk7Var.c;
                if (al7Var == null) {
                    ux2Var.W(407827196);
                    ux2Var.p(false);
                    yy0VarO = null;
                } else {
                    ux2Var.W(407827197);
                    yy0VarO = au8.O(-1606426959, new tk7(al7Var, b), ux2Var);
                    ux2Var.p(false);
                }
                yy0 yy0Var3 = yy0VarO;
                String str7 = str3;
                pb4.a(au8.O(324157134, new uk7(sk7Var, str, (byte) 2), ux2Var), fs4VarB3, au8.O(1032666603, new uk7(sk7Var, str, (byte) 3), ux2Var), yy0Var3, au8.O(1505006249, new na(z, (Object) function1, (Object) str, (Object) str7, (byte) 7), ux2Var), null, ux2Var, 199686, 452);
                str4 = str7;
                fs4Var3 = fs4Var4;
            } else {
                ux2Var.Q();
                str4 = str3;
                fs4Var3 = fs4Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new w4(sk7Var, z, function1, fs4Var3, str, str4, i, i2);
            }
        }
        i4 = 1769472 | i3;
        str3 = str2;
        b = 1;
        if ((599187 & i4) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ux2Var.N(i4 & 1, z2)) {
            if (i8 != 0) {
                fs4Var4 = cs4.b;
            } else {
                fs4Var4 = fs4Var2;
            }
            if (i5 != 0) {
                str3 = "";
            }
            if ((i4 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i4 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z3 | z4;
            objK = ux2Var.K();
            if (z5) {
                objK = new fq0(function1, z, (byte) 1);
                ux2Var.g0(objK);
            } else {
                objK = new fq0(function1, z, (byte) 1);
                ux2Var.g0(objK);
            }
            fs4 fs4VarB4 = androidx.compose.foundation.b.b(fs4Var4, false, null, null, (Function0) objK, 15);
            al7Var = sk7Var.c;
            if (al7Var == null) {
                ux2Var.W(407827196);
                ux2Var.p(false);
                yy0VarO = null;
            } else {
                ux2Var.W(407827197);
                yy0VarO = au8.O(-1606426959, new tk7(al7Var, b), ux2Var);
                ux2Var.p(false);
            }
            yy0 yy0Var4 = yy0VarO;
            String str8 = str3;
            pb4.a(au8.O(324157134, new uk7(sk7Var, str, (byte) 2), ux2Var), fs4VarB4, au8.O(1032666603, new uk7(sk7Var, str, (byte) 3), ux2Var), yy0Var4, au8.O(1505006249, new na(z, (Object) function1, (Object) str, (Object) str8, (byte) 7), ux2Var), null, ux2Var, 199686, 452);
            str4 = str8;
            fs4Var3 = fs4Var4;
        } else {
            ux2Var.Q();
            str4 = str3;
            fs4Var3 = fs4Var2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new w4(sk7Var, z, function1, fs4Var3, str, str4, i, i2);
        }
    }

    public static final void e(boolean z, rb6 rb6Var, pr7 pr7Var, ux2 ux2Var, int i) {
        int i2;
        ws7 ws7VarD;
        ux2Var.Y(-1344558920);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.d(rb6Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(pr7Var) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zF = (i3 == 4) | ux2Var.f(pr7Var);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (zF || objK == awVar) {
                objK = new mr7(pr7Var, z);
                ux2Var.g0(objK);
            }
            zp7 zp7Var = (zp7) objK;
            boolean zH = (i3 == 4) | ux2Var.h(pr7Var);
            Object objK2 = ux2Var.K();
            if (zH || objK2 == awVar) {
                objK2 = new qr7(pr7Var, z);
                ux2Var.g0(objK2);
            }
            w65 w65Var = (w65) objK2;
            boolean zG = gt7.g(pr7Var.l().b);
            int i4 = (int) (z ? pr7Var.l().b >> 32 : pr7Var.l().b & 4294967295L);
            j64 j64Var = pr7Var.d;
            float fG = 0.0f;
            if (j64Var != null && (ws7VarD = j64Var.d()) != null) {
                vs7 vs7Var = ws7VarD.a;
                if (i4 >= 0) {
                    us7 us7Var = vs7Var.a;
                    xu4 xu4Var = vs7Var.b;
                    if (us7Var.a.n.length() != 0) {
                        int iMin = Math.min(xu4Var.d(i4), Math.min(xu4Var.b - 1, xu4Var.f - 1));
                        if (i4 <= xu4Var.c(iMin, false)) {
                            xu4Var.m(iMin);
                            ArrayList arrayList = xu4Var.h;
                            cf5 cf5Var = (cf5) arrayList.get(ct1.G(iMin, arrayList));
                            fG = cf5Var.a.d.g(iMin - cf5Var.d);
                        }
                    }
                }
            }
            float f = fG;
            boolean zH2 = ux2Var.h(zp7Var);
            Object objK3 = ux2Var.K();
            if (zH2 || objK3 == awVar) {
                objK3 = new ki(zp7Var, (byte) 6);
                ux2Var.g0(objK3);
            }
            uf0.f(w65Var, z, rb6Var, zG, 0L, f, qg7.a(cs4.b, zp7Var, (PointerInputEventHandler) objK3), ux2Var, (i2 << 3) & 1008);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new cn1(z, (Object) rb6Var, (Object) pr7Var, i, (byte) 9);
        }
    }

    public static final void f(j74 j74Var, boolean z, Function0 function0, c74 c74Var, p74 p74Var, f74 f74Var, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        fs4 fs4Var2;
        String str;
        String str2;
        rv0 rv0VarA;
        nd5 nd5Var;
        long j;
        ux2 ux2Var2 = ux2Var;
        Set set = j74Var.i;
        c74Var.getClass();
        f74Var.getClass();
        bm1 bm1Var = f74Var.d;
        ux2Var2.Y(-322176094);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.f(j74Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var2.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var2.d(c74Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var2.f(p74Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var2.f(f74Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (ux2Var2.N(i3 & 1, (599187 & i3) != 599186)) {
            xl1 xl1Var = f74Var.a;
            long j2 = xl1Var.c;
            h84 h84Var = xl1Var.m;
            long jI = et1.I(j2, rv0.b);
            long jI2 = et1.I(xl1Var.d, rv0.b(0.6f, jI));
            i97 i97VarA = r07.a(z ? et1.I(xl1Var.b, rv0.g) : et1.I(xl1Var.a, rv0.g), db8.I0(200, 6, null), ux2Var2, 432, 8);
            boolean zF = ux2Var2.f(set);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (zF || objK == awVar) {
                objK = (e84) lv0.n0(set);
                ux2Var2.g0(objK);
            }
            e84 e84Var = (e84) objK;
            boolean zF2 = ux2Var2.f(set) | ux2Var2.f(h84Var);
            Object objK2 = ux2Var2.K();
            if (zF2 || objK2 == awVar) {
                if (e84Var == null || (str2 = e84Var.d) == null || (rv0VarA = h84Var.a(str2)) == null) {
                    objK2 = (e84Var == null || (str = e84Var.a) == null) ? null : h84Var.a(str);
                } else {
                    objK2 = rv0VarA;
                }
                ux2Var2.g0(objK2);
            }
            rv0 rv0Var = (rv0) objK2;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            boolean zF3 = ux2Var2.f(i97VarA);
            Object objK3 = ux2Var2.K();
            if (zF3 || objK3 == awVar) {
                objK3 = new yk1(i97VarA, (byte) 2);
                ux2Var2.g0(objK3);
            }
            fs4 fs4VarB = androidx.compose.foundation.b.b(j51.B(fs4VarC, (Function1) objK3), false, null, null, function0, 15);
            zl1 zl1Var = f74Var.b;
            zl1Var.getClass();
            int iOrdinal = c74Var.ordinal();
            if (iOrdinal == 0) {
                nd5Var = zl1Var.a;
            } else {
                if (iOrdinal != 1) {
                    gk0.s();
                    return;
                }
                nd5Var = zl1Var.b;
            }
            fs4 fs4VarA = ka0.A(fs4VarB, nd5Var);
            kw0 kw0VarA = iw0.a(new ew(c74Var == c74.m ? 4.0f : 2.0f, new hk0((byte) 2)), xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z2 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var2, 48);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, cs4Var);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            ux2Var2 = ux2Var;
            j51.e(j74Var.c, new s14(1.0f, true), ot7.a(bm1Var.a, jI, 0L, null, null, 0L, 0L, null, 16777214), null, 2, false, 1, 0, ux2Var2, 1597440, 936);
            String str3 = j74Var.b;
            if (str3 == null || ub7.b0(str3)) {
                j = jI2;
                ux2Var2.W(-1592178214);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1592489578);
                f74Var.c.getClass();
                b77.a(ux2Var2, androidx.compose.foundation.layout.b.p(cs4Var, 8.0f));
                j = jI2;
                j51.e(str3, null, ot7.a(bm1Var.c, j, 0L, null, nr2.d, 0L, 0L, null, 16777182), null, 0, false, 1, 0, ux2Var2, 1572864, 954);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            String strK = lv1.K(j74Var);
            String str4 = !ub7.b0(strK) ? strK : null;
            if (str4 != null) {
                ux2Var2.W(-1301003876);
                j51.e(str4, null, ot7.a(bm1Var.b, j, 0L, null, null, 0L, 0L, null, 16777214), null, 2, false, 1, 0, ux2Var2, 1597440, 938);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1300784458);
                ux2Var2.p(false);
            }
            String str5 = j74Var.d;
            if (str5 != null) {
                ub7.b0(str5);
            }
            ux2Var2.W(-1300378730);
            ux2Var2.p(false);
            if (set.isEmpty()) {
                ux2Var2.W(-1299524618);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1300259783);
                byte b = 2;
                lq1.c(null, new ew(6.0f, new hk0(b)), new ew(6.0f, new hk0(b)), null, 0, 0, au8.O(-1971957004, new q34(j74Var, rv0Var, xl1Var, f74Var, (byte) 12), ux2Var2), ux2Var, 1573296);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new n76(j74Var, z, function0, c74Var, p74Var, f74Var, fs4Var2, i, (byte) 1);
        }
    }

    public static final void g(int i, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var, boolean z) {
        int i2;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(-1802203897);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
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
            i2 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        byte b2 = 0;
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (objK == obj) {
                objK = h57.p(null);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) objK;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var.j(dd4.a);
            boolean zH = ux2Var.h(lifecycleOwner);
            Object objK2 = ux2Var.K();
            if (zH || objK2 == obj) {
                objK2 = new jh8(lifecycleOwner, px4Var, b2);
                ux2Var.g0(objK2);
            }
            ck3.e(lifecycleOwner, (Function1) objK2, ux2Var);
            kw0 kw0VarA = iw0.a(new ew(16.0f, new hk0(b)), xz2.B, ux2Var, 54);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            boolean z2 = z && ((ih8) px4Var.getValue()) == null;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            boolean z3 = (i2 & 112) == 32;
            Object objK3 = ux2Var.K();
            if (z3 || objK3 == obj) {
                objK3 = new ot1(function0, px4Var, (byte) 5);
                ux2Var.g0(objK3);
            }
            m77.g((Function0) objK3, fs4VarC, null, z2, "TVTA-connectScreen-AccountRequiredBottomSheet-signIn", null, au8.O(1489970434, new kh8(px4Var, b2), ux2Var), ux2Var, 1597488, 36);
            boolean z4 = z && ((ih8) px4Var.getValue()) == null;
            fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            boolean z5 = (i2 & 896) == 256;
            Object objK4 = ux2Var.K();
            if (z5 || objK4 == obj) {
                objK4 = new ot1(function1, px4Var, (byte) 6);
                ux2Var.g0(objK4);
            }
            g57.b((Function0) objK4, fs4VarC2, null, z4, "TVTA-connectScreen-AccountRequiredBottomSheet-createAnAccount", null, au8.O(-1005309760, new kh8(px4Var, (byte) 1), ux2Var), ux2Var, 1597488, 36);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new w46(z, function0, function1, fs4Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(dk6 dk6Var, float f, ko koVar, ei1 ei1Var, Function1 function1, jc1 jc1Var) {
        j47 j47Var;
        float f2;
        h76 h76Var;
        if (jc1Var instanceof j47) {
            j47Var = (j47) jc1Var;
            int i = j47Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                j47Var.q = i - Integer.MIN_VALUE;
            } else {
                j47Var = new j47(jc1Var);
            }
        } else {
            j47Var = new j47(jc1Var);
        }
        Object obj = j47Var.p;
        int i2 = j47Var.q;
        if (i2 == 0) {
            ct1.a0(obj);
            h76 h76Var2 = new h76();
            boolean z = ((Number) koVar.a()).floatValue() == 0.0f;
            i47 i47Var = new i47(f, h76Var2, dk6Var, function1, (byte) 0);
            j47Var.n = koVar;
            j47Var.f1129o = h76Var2;
            j47Var.m = f;
            j47Var.q = 1;
            Object objE = i67.e(koVar, ei1Var, !z, i47Var, j47Var);
            ne1 ne1Var = ne1.m;
            if (objE == ne1Var) {
                return ne1Var;
            }
            f2 = f;
            h76Var = h76Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = j47Var.m;
            h76Var = j47Var.f1129o;
            koVar = j47Var.n;
            ct1.a0(obj);
        }
        return new go(new Float(f2 - h76Var.m), koVar);
    }

    public static final void i(io ioVar, dk6 dk6Var, Function1 function1, float f) {
        float fA;
        try {
            fA = dk6Var.a(f);
        } catch (CancellationException unused) {
            ioVar.a();
            fA = 0.0f;
        }
        function1.invoke(Float.valueOf(fA));
        if (Math.abs(f - fA) > 0.5f) {
            ioVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object j(dk6 dk6Var, float f, float f2, ko koVar, jo joVar, Function1 function1, jc1 jc1Var) {
        k47 k47Var;
        float fFloatValue;
        ko koVar2;
        h76 h76Var;
        float f3 = f;
        if (jc1Var instanceof k47) {
            k47Var = (k47) jc1Var;
            int i = k47Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                k47Var.r = i - Integer.MIN_VALUE;
            } else {
                k47Var = new k47(jc1Var);
            }
        } else {
            k47Var = new k47(jc1Var);
        }
        k47 k47Var2 = k47Var;
        Object obj = k47Var2.q;
        int i2 = k47Var2.r;
        if (i2 == 0) {
            ct1.a0(obj);
            h76 h76Var2 = new h76();
            fFloatValue = ((Number) koVar.a()).floatValue();
            Float f4 = new Float(f3);
            boolean z = ((Number) koVar.a()).floatValue() == 0.0f;
            i47 i47Var = new i47(f2, h76Var2, dk6Var, function1, (byte) 1);
            k47Var2.f1229o = koVar;
            k47Var2.p = h76Var2;
            k47Var2.m = f3;
            k47Var2.n = fFloatValue;
            k47Var2.r = 1;
            Object objF = i67.f(koVar, f4, joVar, !z, i47Var, k47Var2);
            ne1 ne1Var = ne1.m;
            if (objF == ne1Var) {
                return ne1Var;
            }
            koVar2 = koVar;
            h76Var = h76Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f5 = k47Var2.n;
            float f6 = k47Var2.m;
            h76Var = k47Var2.p;
            koVar2 = k47Var2.f1229o;
            ct1.a0(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new go(new Float(f3 - h76Var.m), pm8.n(koVar2, 0.0f, k(((Number) koVar2.a()).floatValue(), fFloatValue), 29));
    }

    public static final float k(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static ed8 m(nw5 nw5Var) {
        nw5Var.getClass();
        if (nw5Var.n.size() == 0) {
            return ed8.b;
        }
        List list = nw5Var.n;
        list.getClass();
        return new ed8(list);
    }

    public static int n(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static boolean o(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final boolean p(pr7 pr7Var, boolean z) {
        i04 i04VarC;
        j64 j64Var = pr7Var.d;
        if (j64Var == null || (i04VarC = j64Var.c()) == null) {
            return false;
        }
        v56 v56VarF = ep1.F(i04VarC);
        long j = pr7Var.j(z);
        float f = v56VarF.a;
        float f2 = v56VarF.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = v56VarF.b;
        float f4 = v56VarF.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static final void q(Context context) {
        Map map;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            we4.f().c(em8.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            String[] strArr = em8.b;
            int iQ = xm4.Q(strArr.length);
            if (iQ < 16) {
                iQ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
            for (String str : strArr) {
                linkedHashMap.put(new File(ua5.z(databasePath2.getPath(), str)), new File(ua5.z(file.getPath(), str)));
            }
            if (linkedHashMap.isEmpty()) {
                Map mapSingletonMap = Collections.singletonMap(databasePath2, file);
                mapSingletonMap.getClass();
                map = mapSingletonMap;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        we4.f().j(em8.a, "Over-writing contents of " + file3);
                    }
                    we4.f().c(em8.a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static fn7 r(pg6 pg6Var, String str) {
        Map mapB;
        zu6 zu6Var;
        pg6Var.getClass();
        ug6 ug6VarJ0 = pg6Var.J0("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (ug6VarJ0.F0()) {
                int iR = bt1.r(ug6VarJ0, "name");
                int iR2 = bt1.r(ug6VarJ0, "type");
                int iR3 = bt1.r(ug6VarJ0, "notnull");
                int iR4 = bt1.r(ug6VarJ0, "pk");
                int iR5 = bt1.r(ug6VarJ0, "dflt_value");
                im4 im4Var = new im4();
                do {
                    String strH0 = ug6VarJ0.h0(iR);
                    im4Var.put(strH0, new cn7(strH0, ug6VarJ0.h0(iR2), ug6VarJ0.getLong(iR3) != 0, (int) ug6VarJ0.getLong(iR4), ug6VarJ0.isNull(iR5) ? null : ug6VarJ0.h0(iR5), 2));
                } while (ug6VarJ0.F0());
                mapB = im4Var.b();
                iq8.l(ug6VarJ0, null);
            } else {
                mapB = fa2.m;
                iq8.l(ug6VarJ0, null);
            }
            ug6 ug6VarJ1 = pg6Var.J0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iR6 = bt1.r(ug6VarJ1, "id");
                int iR7 = bt1.r(ug6VarJ1, "seq");
                int iR8 = bt1.r(ug6VarJ1, "table");
                int iR9 = bt1.r(ug6VarJ1, "on_delete");
                int iR10 = bt1.r(ug6VarJ1, "on_update");
                List listT = wo1.T(ug6VarJ1);
                ug6VarJ1.reset();
                zu6 zu6Var2 = new zu6();
                while (ug6VarJ1.F0()) {
                    if (ug6VarJ1.getLong(iR7) == j) {
                        int i = (int) ug6VarJ1.getLong(iR6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iR6;
                        ArrayList<vs2> arrayList3 = new ArrayList();
                        for (Object obj : listT) {
                            int i3 = iR7;
                            List list = listT;
                            if (((vs2) obj).m == i) {
                                arrayList3.add(obj);
                            }
                            iR7 = i3;
                            listT = list;
                        }
                        int i4 = iR7;
                        List list2 = listT;
                        for (vs2 vs2Var : arrayList3) {
                            arrayList.add(vs2Var.f2340o);
                            arrayList2.add(vs2Var.p);
                        }
                        zu6Var2.add(new dn7(ug6VarJ1.h0(iR8), ug6VarJ1.h0(iR9), ug6VarJ1.h0(iR10), arrayList, arrayList2));
                        iR6 = i2;
                        iR7 = i4;
                        listT = list2;
                        j = 0;
                    }
                }
                zu6 zu6VarE = lv1.E(zu6Var2);
                iq8.l(ug6VarJ1, null);
                ug6 ug6VarJ2 = pg6Var.J0("PRAGMA index_list(`" + str + "`)");
                try {
                    int iR11 = bt1.r(ug6VarJ2, "name");
                    int iR12 = bt1.r(ug6VarJ2, "origin");
                    int iR13 = bt1.r(ug6VarJ2, "unique");
                    if (iR11 == -1 || iR12 == -1 || iR13 == -1) {
                        iq8.l(ug6VarJ2, null);
                        zu6Var = null;
                    } else {
                        zu6 zu6Var3 = new zu6();
                        while (ug6VarJ2.F0()) {
                            if ("c".equals(ug6VarJ2.h0(iR12))) {
                                en7 en7VarU = wo1.U(pg6Var, ug6VarJ2.h0(iR11), ug6VarJ2.getLong(iR13) == 1);
                                if (en7VarU == null) {
                                    iq8.l(ug6VarJ2, null);
                                    zu6Var = null;
                                } else {
                                    zu6Var3.add(en7VarU);
                                }
                            }
                        }
                        zu6 zu6VarE2 = lv1.E(zu6Var3);
                        iq8.l(ug6VarJ2, null);
                        zu6Var = zu6VarE2;
                    }
                    return new fn7(str, mapB, zu6VarE, zu6Var);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        iq8.l(ug6VarJ2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    iq8.l(ug6VarJ1, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                iq8.l(ug6VarJ0, th5);
                throw th6;
            }
        }
    }

    public static void t() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        hk0.l("Must be called from the main thread.");
    }

    public abstract Object l();

    public l47 s(String str, Function1 function1) {
        return this;
    }

    public void u(kx8 kx8Var, kx8 kx8Var2) {
        kx8Var.b = kx8Var2;
    }

    public void v(kx8 kx8Var, Thread thread) {
        kx8Var.a = thread;
    }

    public boolean w(rx8 rx8Var, av8 av8Var, av8 av8Var2) {
        synchronized (rx8Var) {
            try {
                if (rx8Var.n != av8Var) {
                    return false;
                }
                rx8Var.n = av8Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean x(rx8 rx8Var, Object obj, Object obj2) {
        synchronized (rx8Var) {
            try {
                if (rx8Var.m != obj) {
                    return false;
                }
                rx8Var.m = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean y(rx8 rx8Var, kx8 kx8Var, kx8 kx8Var2) {
        synchronized (rx8Var) {
            try {
                if (rx8Var.f1963o != kx8Var) {
                    return false;
                }
                rx8Var.f1963o = kx8Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
