package o;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class v47 {
    public static final vs6 a = new vs6((byte) 5);
    public static final ep3 b = new ep3((byte) 24);
    public static final Object c = new Object();
    public static t47 d;
    public static long e;
    public static final io.sentry.android.core.l2 f;
    public static final ae g;
    public static List h;
    public static List i;
    public static final lz2 j;
    public static final yx k;

    static {
        t47 t47Var = t47.q;
        d = t47Var;
        e = 2L;
        io.sentry.android.core.l2 l2Var = new io.sentry.android.core.l2();
        l2Var.c = new long[16];
        l2Var.d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        l2Var.e = iArr;
        f = l2Var;
        ae aeVar = new ae((byte) 13);
        aeVar.c = new int[16];
        aeVar.d = new hh8[16];
        g = aeVar;
        ea2 ea2Var = ea2.m;
        h = ea2Var;
        i = ea2Var;
        long j2 = e;
        e = 1 + j2;
        lz2 lz2Var = new lz2(j2, t47Var, null, new ji2((byte) 8));
        d = d.f(lz2Var.b);
        j = lz2Var;
        k = new yx(0);
    }

    public static final t47 a(t47 t47Var, long j2, long j3) {
        while (im3.u(j2, j3) < 0) {
            t47Var = t47Var.f(j2);
            j2++;
        }
        return t47Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    public static final Object b(Function1 function1) {
        kx4 kx4Var;
        Object objU;
        lz2 lz2Var = j;
        synchronized (c) {
            try {
                kx4Var = lz2Var.h;
                if (kx4Var != null) {
                    k.addAndGet(1);
                }
                objU = u(lz2Var, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kx4Var != null) {
            try {
                List list = h;
                vi6 vi6Var = new vi6(kx4Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((hw2) list.get(i2)).invoke(vi6Var, lz2Var);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            d();
            if (kx4Var != null) {
                Object[] objArr = kx4Var.b;
                long[] jArr = kx4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    p((s97) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                            if (i3 != length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return objU;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        ae aeVar = g;
        int i2 = aeVar.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            hh8 hh8Var = ((hh8[]) aeVar.d)[i3];
            Object obj = hh8Var != null ? hh8Var.get() : null;
            if (obj != null && o((s97) obj)) {
                if (i4 != i3) {
                    ((hh8[]) aeVar.d)[i4] = hh8Var;
                    int[] iArr = (int[]) aeVar.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((hh8[]) aeVar.d)[i5] = null;
            ((int[]) aeVar.c)[i5] = 0;
        }
        if (i4 != i2) {
            aeVar.b = i4;
        }
    }

    public static final n47 e(n47 n47Var, Function1 function1, boolean z) {
        boolean z2 = n47Var instanceof ox4;
        if (z2 || n47Var == null) {
            return new e28(z2 ? (ox4) n47Var : null, function1, null, false, z);
        }
        return new f28(n47Var, function1, false, z);
    }

    public static final u97 f(u97 u97Var) {
        u97 u97VarR;
        n47 n47VarH = h();
        u97 u97VarR2 = r(u97Var, n47VarH.g(), n47VarH.d());
        if (u97VarR2 != null) {
            return u97VarR2;
        }
        synchronized (c) {
            n47 n47VarH2 = h();
            u97VarR = r(u97Var, n47VarH2.g(), n47VarH2.d());
        }
        if (u97VarR != null) {
            return u97VarR;
        }
        q();
        throw null;
    }

    public static final u97 g(u97 u97Var, n47 n47Var) {
        u97 u97VarR;
        u97 u97VarR2 = r(u97Var, n47Var.g(), n47Var.d());
        if (u97VarR2 != null) {
            return u97VarR2;
        }
        synchronized (c) {
            u97VarR = r(u97Var, n47Var.g(), n47Var.d());
        }
        if (u97VarR != null) {
            return u97VarR;
        }
        q();
        throw null;
    }

    public static final n47 h() {
        n47 n47Var = (n47) b.get();
        return n47Var == null ? j : n47Var;
    }

    public static final Function1 i(Function1 function1, Function1 function2, boolean z) {
        if (!z) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new tw1(function1, function2, (byte) 5);
    }

    public static final Function1 j(Function1 function1, Function1 function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new tw1(function1, function2, (byte) 6);
    }

    public static final u97 k(u97 u97Var, s97 s97Var) {
        long j2 = e;
        io.sentry.android.core.l2 l2Var = f;
        if (l2Var.a > 0) {
            j2 = ((long[]) l2Var.c)[0];
        }
        long j3 = j2 - 1;
        u97 u97Var2 = null;
        u97 u97Var3 = null;
        for (u97 u97VarD = s97Var.d(); u97VarD != null; u97VarD = u97VarD.b) {
            long j4 = u97VarD.a;
            if (j4 != 0) {
                if (j4 != 0 && im3.u(j4, j3) <= 0 && !t47.q.c(j4)) {
                    if (u97Var3 != null) {
                        if (im3.u(u97VarD.a, u97Var3.a) >= 0) {
                            u97Var2 = u97Var3;
                            break;
                        }
                        break;
                    }
                    u97Var3 = u97VarD;
                }
            }
            u97Var2 = u97VarD;
            break;
        }
        if (u97Var2 != null) {
            u97Var2.a = Long.MAX_VALUE;
            return u97Var2;
        }
        u97 u97VarB = u97Var.b(Long.MAX_VALUE);
        u97VarB.b = s97Var.d();
        s97Var.x(u97VarB);
        return u97VarB;
    }

    public static final void l(n47 n47Var, s97 s97Var) {
        n47Var.t(n47Var.h() + 1);
        Function1 function1I = n47Var.i();
        if (function1I != null) {
            function1I.invoke(s97Var);
        }
    }

    public static final HashMap m(long j2, ox4 ox4Var, t47 t47Var) {
        long[] jArr;
        t47 t47Var2;
        long[] jArr2;
        int i2;
        int i3;
        u97 u97VarR;
        kx4 kx4VarX = ox4Var.x();
        if (kx4VarX != null) {
            long jG = ox4Var.g();
            t47 t47VarD = ox4Var.d().f(jG).d(ox4Var.j);
            Object[] objArr = kx4VarX.b;
            long[] jArr3 = kx4VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                s97 s97Var = (s97) objArr[(i4 << 3) + i7];
                                u97 u97VarD = s97Var.d();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                u97 u97VarR2 = r(u97VarD, j2, t47Var);
                                if (u97VarR2 != null && (u97VarR = r(u97VarD, jG, t47VarD)) != null && !u97VarR2.equals(u97VarR)) {
                                    u97 u97VarR3 = r(u97VarD, jG, ox4Var.d());
                                    if (u97VarR3 == null) {
                                        q();
                                        throw null;
                                    }
                                    u97 u97VarF = s97Var.f(u97VarR, u97VarR2, u97VarR3);
                                    if (u97VarF == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(u97VarR2, u97VarF);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            t47VarD = t47VarD;
                        }
                        jArr = jArr3;
                        t47Var2 = t47VarD;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        t47Var2 = t47VarD;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    t47VarD = t47Var2;
                }
            }
        }
        return null;
    }

    public static final u97 n(u97 u97Var, t97 t97Var, n47 n47Var, u97 u97Var2) {
        u97 u97VarK;
        if (n47Var.f()) {
            n47Var.n(t97Var);
        }
        long jG = n47Var.g();
        if (u97Var2.a == jG) {
            return u97Var2;
        }
        synchronized (c) {
            u97VarK = k(u97Var, t97Var);
        }
        u97VarK.a = jG;
        n47Var.n(t97Var);
        return u97VarK;
    }

    public static final boolean o(s97 s97Var) {
        u97 u97Var;
        long j2 = e;
        io.sentry.android.core.l2 l2Var = f;
        if (l2Var.a > 0) {
            j2 = ((long[]) l2Var.c)[0];
        }
        u97 u97Var2 = null;
        u97 u97VarD = null;
        int i2 = 0;
        for (u97 u97VarD2 = s97Var.d(); u97VarD2 != null; u97VarD2 = u97VarD2.b) {
            long j3 = u97VarD2.a;
            if (j3 != 0) {
                if (im3.u(j3, j2) >= 0) {
                    i2++;
                } else if (u97Var2 == null) {
                    i2++;
                    u97Var2 = u97VarD2;
                } else {
                    if (im3.u(u97VarD2.a, u97Var2.a) < 0) {
                        u97Var = u97Var2;
                        u97Var2 = u97VarD2;
                    } else {
                        u97Var = u97VarD2;
                    }
                    if (u97VarD == null) {
                        u97VarD = s97Var.d();
                        u97 u97Var3 = u97VarD;
                        while (true) {
                            if (u97VarD == null) {
                                u97VarD = u97Var3;
                                break;
                            }
                            if (im3.u(u97VarD.a, j2) >= 0) {
                                break;
                            }
                            if (im3.u(u97Var3.a, u97VarD.a) < 0) {
                                u97Var3 = u97VarD;
                            }
                            u97VarD = u97VarD.b;
                        }
                    }
                    u97Var2.a = 0L;
                    u97Var2.a(u97VarD);
                    u97Var2 = u97Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p(s97 s97Var) {
        if (o(s97Var)) {
            ae aeVar = g;
            int i2 = aeVar.b;
            int iIdentityHashCode = System.identityHashCode(s97Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = aeVar.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) aeVar.c)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        hh8 hh8Var = ((hh8[]) aeVar.d)[i6];
                        if (s97Var == (hh8Var != null ? hh8Var.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || ((int[]) aeVar.c)[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = aeVar.b;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(aeVar.b + 1);
                                        break;
                                    }
                                    if (((int[]) aeVar.c)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    hh8 hh8Var2 = ((hh8[]) aeVar.d)[i6];
                                    if ((hh8Var2 != null ? hh8Var2.get() : null) == s97Var) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                hh8 hh8Var3 = ((hh8[]) aeVar.d)[i8];
                                if ((hh8Var3 != null ? hh8Var3.get() : null) == s97Var) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            hh8[] hh8VarArr = (hh8[]) aeVar.d;
            int length = hh8VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                hh8[] hh8VarArr2 = new hh8[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(hh8VarArr, i10, hh8VarArr2, i12, i2 - i10);
                System.arraycopy((hh8[]) aeVar.d, 0, hh8VarArr2, 0, i10);
                cx.F0(i12, i10, i2, (int[]) aeVar.c, iArr);
                cx.I0(0, i10, 6, (int[]) aeVar.c, iArr);
                aeVar.d = hh8VarArr2;
                aeVar.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(hh8VarArr, i10, hh8VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) aeVar.c;
                cx.F0(i13, i10, i2, iArr2, iArr2);
            }
            ((hh8[]) aeVar.d)[i10] = new hh8(s97Var);
            ((int[]) aeVar.c)[i10] = iIdentityHashCode;
            aeVar.b++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final u97 r(u97 u97Var, long j2, t47 t47Var) {
        u97 u97Var2 = null;
        while (u97Var != null) {
            long j3 = u97Var.a;
            if (j3 != 0 && im3.u(j3, j2) <= 0 && !t47Var.c(j3) && (u97Var2 == null || im3.u(u97Var2.a, u97Var.a) < 0)) {
                u97Var2 = u97Var;
            }
            u97Var = u97Var.b;
        }
        if (u97Var2 != null) {
            return u97Var2;
        }
        return null;
    }

    public static final u97 s(u97 u97Var, s97 s97Var) {
        u97 u97VarR;
        n47 n47VarH = h();
        Function1 function1E = n47VarH.e();
        if (function1E != null) {
            function1E.invoke(s97Var);
        }
        u97 u97VarR2 = r(u97Var, n47VarH.g(), n47VarH.d());
        if (u97VarR2 != null) {
            return u97VarR2;
        }
        synchronized (c) {
            n47 n47VarH2 = h();
            u97 u97VarD = s97Var.d();
            u97VarD.getClass();
            u97VarR = r(u97VarD, n47VarH2.g(), n47VarH2.d());
            if (u97VarR == null) {
                q();
                throw null;
            }
        }
        return u97VarR;
    }

    public static final void t(int i2) {
        io.sentry.android.core.l2 l2Var = f;
        int i3 = ((int[]) l2Var.e)[i2];
        l2Var.f(i3, l2Var.a - 1);
        l2Var.a--;
        long[] jArr = (long[]) l2Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (im3.u(jArr[i5], j2) <= 0) {
                break;
            }
            l2Var.f(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) l2Var.c;
        int i6 = l2Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < l2Var.a && im3.u(jArr2[i7], jArr2[i8]) < 0) {
                if (im3.u(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                l2Var.f(i7, i3);
                i3 = i7;
            } else {
                if (im3.u(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                l2Var.f(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) l2Var.e)[i2] = l2Var.b;
        l2Var.b = i2;
    }

    public static final Object u(lz2 lz2Var, Function1 function1) {
        long j2 = lz2Var.b;
        Object objInvoke = function1.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        t47 t47VarB = d.b(j2);
        d = t47VarB;
        lz2Var.b = j3;
        lz2Var.a = t47VarB;
        lz2Var.g = 0;
        lz2Var.h = null;
        lz2Var.o();
        d = d.f(j3);
        return objInvoke;
    }

    public static final void v(n47 n47Var) {
        Long lValueOf;
        if (d.c(n47Var.g())) {
            return;
        }
        long jG = n47Var.g();
        boolean z = n47Var.c;
        ox4 ox4Var = n47Var instanceof ox4 ? (ox4) n47Var : null;
        Object objValueOf = ox4Var != null ? Boolean.valueOf(ox4Var.m) : "read-only";
        synchronized (c) {
            io.sentry.android.core.l2 l2Var = f;
            lValueOf = Long.valueOf(l2Var.a > 0 ? ((long[]) l2Var.c)[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jG + ", disposed=" + z + ", applied=" + objValueOf + ", lowestPin=" + lValueOf).toString());
    }

    public static final u97 w(u97 u97Var, s97 s97Var, n47 n47Var) {
        u97 u97VarR;
        u97 u97VarR2;
        if (n47Var.f()) {
            n47Var.n(s97Var);
        }
        long jG = n47Var.g();
        u97 u97VarR3 = r(u97Var, jG, n47Var.d());
        if (u97VarR3 == null) {
            synchronized (c) {
                n47 n47VarH = h();
                u97 u97VarD = s97Var.d();
                u97VarD.getClass();
                u97VarR2 = r(u97VarD, n47VarH.g(), n47VarH.d());
                if (u97VarR2 == null) {
                    q();
                    throw null;
                }
            }
            u97VarR3 = u97VarR2;
        }
        if (u97VarR3.a == n47Var.g()) {
            return u97VarR3;
        }
        synchronized (c) {
            u97VarR = r(s97Var.d(), jG, n47Var.d());
            if (u97VarR == null) {
                q();
                throw null;
            }
            if (u97VarR.a != jG) {
                u97 u97VarK = k(u97VarR, s97Var);
                u97VarK.a(u97VarR);
                u97VarK.a = n47Var.g();
                u97VarR = u97VarK;
            }
        }
        n47Var.n(s97Var);
        return u97VarR;
    }
}
