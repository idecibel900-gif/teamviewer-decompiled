package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public class ox4 extends n47 {
    public static final int[] n = new int[0];
    public final Function1 e;
    public final Function1 f;
    public int g;
    public kx4 h;
    public ArrayList i;
    public t47 j;
    public int[] k;
    public int l;
    public boolean m;

    public ox4(long j, t47 t47Var, Function1 function1, Function1 function2) {
        super(j, t47Var);
        this.e = function1;
        this.f = function2;
        this.j = t47.q;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (v47.c) {
            this.j = this.j.f(j);
        }
    }

    public void B(kx4 kx4Var) {
        this.h = kx4Var;
    }

    public ox4 C(Function1 function1, Function1 function2) {
        s15 s15Var;
        if (this.c) {
            up5.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            up5.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = v47.c;
        synchronized (obj) {
            long j = v47.e;
            v47.e = j + 1;
            v47.d = v47.d.f(j);
            t47 t47VarD = d();
            r(t47VarD.f(j));
            s15Var = new s15(j, v47.a(t47VarD, g() + 1, j), v47.i(function1, e(), true), v47.j(function2, i()), this);
        }
        if (this.m || this.c) {
            return s15Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = v47.e;
            v47.e = j2 + 1;
            s(j2);
            v47.d = v47.d.f(g());
        }
        r(v47.a(d(), jG + 1, g()));
        return s15Var;
    }

    @Override // o.n47
    public final void b() {
        v47.d = v47.d.b(g()).a(this.j);
    }

    @Override // o.n47
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (v47.c) {
            o();
        }
        l();
    }

    @Override // o.n47
    public int h() {
        return this.g;
    }

    @Override // o.n47
    public Function1 i() {
        return this.f;
    }

    @Override // o.n47
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // o.n47
    public void l() {
        if (this.l <= 0) {
            up5.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        kx4 kx4VarX = x();
        if (kx4VarX != null) {
            if (this.m) {
                up5.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = kx4VarX.b;
            long[] jArr = kx4VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (u97 u97VarD = ((s97) objArr[(i2 << 3) + i4]).d(); u97VarD != null; u97VarD = u97VarD.b) {
                                    long j2 = u97VarD.a;
                                    if (j2 == jG || lv0.h0(this.j, Long.valueOf(j2))) {
                                        vs6 vs6Var = v47.a;
                                        u97VarD.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // o.n47
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // o.n47
    public void n(s97 s97Var) {
        kx4 kx4VarX = x();
        if (kx4VarX == null) {
            kx4 kx4Var = ui6.a;
            kx4VarX = new kx4();
            B(kx4VarX);
        }
        kx4VarX.a(s97Var);
    }

    @Override // o.n47
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            v47.t(this.k[i]);
        }
        o();
    }

    @Override // o.n47
    public void t(int i) {
        this.g = i;
    }

    @Override // o.n47
    public n47 u(Function1 function1) {
        t15 t15Var;
        if (this.c) {
            up5.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            up5.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = v47.c;
        synchronized (obj) {
            long j = v47.e;
            v47.e = j + 1;
            v47.d = v47.d.f(j);
            t15Var = new t15(j, v47.a(d(), jG + 1, j), v47.i(function1, e(), true), this);
        }
        if (this.m || this.c) {
            return t15Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = v47.e;
            v47.e = j2 + 1;
            s(j2);
            v47.d = v47.d.f(g());
        }
        r(v47.a(d(), jG2 + 1, g()));
        return t15Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (v47.c) {
            long j = v47.e;
            v47.e = j + 1;
            s(j);
            v47.d = v47.d.f(g());
        }
        r(v47.a(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    public r47 w() {
        HashMap mapM;
        List list;
        kx4 kx4Var;
        long j;
        long j2;
        kx4 kx4VarX = x();
        if (kx4VarX != null) {
            long j3 = v47.j.b;
            mapM = v47.m(j3, this, v47.d.b(j3));
        } else {
            mapM = null;
        }
        ea2 ea2Var = ea2.m;
        synchronized (v47.c) {
            try {
                v47.v(this);
                if (kx4VarX == null || kx4VarX.d == 0) {
                    b();
                    lz2 lz2Var = v47.j;
                    kx4 kx4Var2 = lz2Var.h;
                    v47.u(lz2Var, v47.a);
                    if (kx4Var2 == null || !kx4Var2.h()) {
                        list = ea2Var;
                        kx4Var = null;
                    } else {
                        list = v47.h;
                        kx4Var = kx4Var2;
                    }
                } else {
                    lz2 lz2Var2 = v47.j;
                    r47 r47VarZ = z(v47.e, kx4VarX, mapM, v47.d.b(lz2Var2.b));
                    if (!r47VarZ.equals(q47.e)) {
                        return r47VarZ;
                    }
                    b();
                    kx4Var = lz2Var2.h;
                    v47.u(lz2Var2, v47.a);
                    B(null);
                    lz2Var2.h = null;
                    list = v47.h;
                }
                this.m = true;
                if (kx4Var != null) {
                    vi6 vi6Var = new vi6(kx4Var);
                    if (!kx4Var.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((hw2) list.get(i)).invoke(vi6Var, this);
                        }
                    }
                }
                if (kx4VarX != null && kx4VarX.h()) {
                    vi6 vi6Var2 = new vi6(kx4VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((hw2) list.get(i2)).invoke(vi6Var2, this);
                    }
                }
                synchronized (v47.c) {
                    try {
                        p();
                        v47.d();
                        if (kx4Var != null) {
                            Object[] objArr = kx4Var.b;
                            long[] jArr = kx4Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                v47.p((s97) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
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
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (kx4VarX != null) {
                            Object[] objArr2 = kx4VarX.b;
                            long[] jArr2 = kx4VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                v47.p((s97) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                v47.p((s97) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return q47.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public kx4 x() {
        return this.h;
    }

    @Override // o.n47
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[LOOP:3: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final r47 z(long j, kx4 kx4Var, HashMap map, t47 t47Var) {
        ArrayList arrayList;
        ArrayList arrayListA0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        s97 s97Var;
        u97 u97Var;
        t47 t47Var2;
        Object[] objArr;
        long[] jArr;
        t47 t47Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        u97 u97VarF;
        t47 t47VarD = d().f(g()).d(this.j);
        Object[] objArr3 = kx4Var.b;
        long[] jArr3 = kx4Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListA0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            s97 s97Var2 = (s97) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            u97 u97VarD = s97Var2.d();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            u97 u97VarR = v47.r(u97VarD, j, t47Var);
                            if (u97VarR == null) {
                                arrayList4 = arrayListA0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListA0;
                                j2 = j3;
                                u97 u97VarR2 = v47.r(u97VarD, g(), t47VarD);
                                if (u97VarR2 != null && u97VarR2.a != 1 && !u97VarR.equals(u97VarR2)) {
                                    t47Var3 = t47VarD;
                                    u97 u97VarR3 = v47.r(u97VarD, g(), d());
                                    if (u97VarR3 == null) {
                                        v47.q();
                                        throw null;
                                    }
                                    if (map == null || (u97VarF = (u97) map.get(u97VarR)) == null) {
                                        u97VarF = s97Var2.f(u97VarR2, u97VarR, u97VarR3);
                                    }
                                    if (u97VarF == null) {
                                        return new p47(this);
                                    }
                                    if (!u97VarF.equals(u97VarR3)) {
                                        if (u97VarF.equals(u97VarR)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new vd5(s97Var2, u97VarR.b(g())));
                                            arrayListA0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListA0.add(s97Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!u97VarF.equals(u97VarR2) ? new vd5(s97Var2, u97VarF) : new vd5(s97Var2, u97VarR2.b(g())));
                                        }
                                    }
                                    arrayListA0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListA0 = arrayList4;
                            }
                            t47Var3 = t47VarD;
                            arrayList2 = arrayList5;
                            arrayListA0 = arrayList4;
                        } else {
                            t47Var3 = t47VarD;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        t47VarD = t47Var3;
                    }
                    t47Var2 = t47VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    t47Var2 = t47VarD;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    t47VarD = t47Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    vd5 vd5Var = (vd5) arrayList2.get(i2);
                    s97Var = (s97) vd5Var.m;
                    u97Var = (u97) vd5Var.n;
                    u97Var.a = j;
                    synchronized (v47.c) {
                        u97Var.b = s97Var.d();
                        s97Var.x(u97Var);
                    }
                }
            }
            if (arrayListA0 != null) {
                size = arrayListA0.size();
                for (i = 0; i < size; i++) {
                    kx4Var.l((s97) arrayListA0.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListA0 = lv0.A0(arrayList3, arrayListA0);
                }
                this.i = arrayListA0;
            }
            return q47.e;
        }
        arrayList = null;
        arrayListA0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                vd5 vd5Var2 = (vd5) arrayList2.get(i2);
                s97Var = (s97) vd5Var2.m;
                u97Var = (u97) vd5Var2.n;
                u97Var.a = j;
                synchronized (v47.c) {
                    u97Var.b = s97Var.d();
                    s97Var.x(u97Var);
                }
            }
        }
        if (arrayListA0 != null) {
            size = arrayListA0.size();
            while (i < size) {
                kx4Var.l((s97) arrayListA0.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListA0 = lv0.A0(arrayList3, arrayListA0);
            }
            this.i = arrayListA0;
        }
        return q47.e;
    }
}
