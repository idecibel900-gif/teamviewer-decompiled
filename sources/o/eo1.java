package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class eo1 extends t97 implements i97 {
    public final Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c57 f728o;
    public do1 p = new do1(v47.h().g());

    public eo1(Function0 function0, c57 c57Var) {
        this.n = function0;
        this.f728o = c57Var;
    }

    public final do1 A() {
        n47 n47VarH = v47.h();
        return z((do1) v47.g(this.p, n47VarH), n47VarH, false, this.n);
    }

    @Override // o.s97
    public final u97 d() {
        return this.p;
    }

    @Override // o.i97
    public final Object getValue() {
        Function1 function1E = v47.h().e();
        if (function1E != null) {
            function1E.invoke(this);
        }
        n47 n47VarH = v47.h();
        return z((do1) v47.g(this.p, n47VarH), n47VarH, true, this.n).f;
    }

    public final String toString() {
        do1 do1Var = (do1) v47.f(this.p);
        return "DerivedState(value=" + (do1Var.c(this, v47.h()) ? String.valueOf(do1Var.f) : "<Not calculated>") + ")@" + hashCode();
    }

    @Override // o.s97
    public final void x(u97 u97Var) {
        this.p = (do1) u97Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    public final do1 z(do1 do1Var, n47 n47Var, boolean z, Function0 function0) {
        do1 do1Var2;
        c57 c57Var;
        int i;
        if (do1Var.c(this, n47Var)) {
            if (z) {
                xx4 xx4VarA = d57.a();
                Object[] objArr = xx4VarA.m;
                int i2 = xx4VarA.f2559o;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((tx2) objArr[i3]).b();
                }
                try {
                    vw4 vw4Var = do1Var.e;
                    ep3 ep3Var = d57.a;
                    al3 al3Var = (al3) ep3Var.get();
                    if (al3Var == null) {
                        al3Var = new al3();
                        ep3Var.E(al3Var);
                    }
                    int i4 = al3Var.a;
                    Object[] objArr2 = vw4Var.b;
                    int[] iArr = vw4Var.c;
                    long[] jArr = vw4Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        s97 s97Var = (s97) objArr2[i9];
                                        i = i6;
                                        al3Var.a = i4 + iArr[i9];
                                        Function1 function1E = n47Var.e();
                                        if (function1E != null) {
                                            function1E.invoke(s97Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    al3Var.a = i4;
                } finally {
                    Object[] objArr3 = xx4VarA.m;
                    int i10 = xx4VarA.f2559o;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((tx2) objArr3[i11]).a();
                    }
                }
            }
            return do1Var;
        }
        vw4 vw4Var2 = new vw4();
        ep3 ep3Var2 = d57.a;
        al3 al3Var2 = (al3) ep3Var2.get();
        if (al3Var2 == null) {
            al3Var2 = new al3();
            ep3Var2.E(al3Var2);
        }
        int i12 = al3Var2.a;
        xx4 xx4VarA2 = d57.a();
        Object[] objArr4 = xx4VarA2.m;
        int i13 = xx4VarA2.f2559o;
        for (int i14 = 0; i14 < i13; i14++) {
            ((tx2) objArr4[i14]).b();
        }
        try {
            al3Var2.a = i12 + 1;
            Object objG = el5.g(new co1(this, al3Var2, vw4Var2, i12, (byte) 0), function0);
            al3Var2.a = i12;
            Object[] objArr5 = xx4VarA2.m;
            int i15 = xx4VarA2.f2559o;
            for (int i16 = 0; i16 < i15; i16++) {
                ((tx2) objArr5[i16]).a();
            }
            Object obj = v47.c;
            synchronized (obj) {
                try {
                    n47 n47VarH = v47.h();
                    Object obj2 = do1Var.f;
                    if (obj2 == do1.h || (c57Var = this.f728o) == null || !c57Var.G(objG, obj2)) {
                        do1 do1Var3 = this.p;
                        synchronized (obj) {
                            u97 u97VarK = v47.k(do1Var3, this);
                            u97VarK.a(do1Var3);
                            u97VarK.a = n47VarH.g();
                            do1Var2 = (do1) u97VarK;
                            do1Var2.e = vw4Var2;
                            do1Var2.g = do1Var2.d(this, n47VarH);
                            do1Var2.f = objG;
                        }
                        return do1Var2;
                    }
                    do1Var.e = vw4Var2;
                    do1Var.g = do1Var.d(this, n47VarH);
                    do1Var2 = do1Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            al3 al3Var3 = (al3) d57.a.get();
            if (al3Var3 == null || al3Var3.a != 0) {
                return do1Var2;
            }
            v47.h().m();
            synchronized (obj) {
                n47 n47VarH2 = v47.h();
                do1Var2.c = n47VarH2.g();
                do1Var2.d = n47VarH2.h();
                return do1Var2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = xx4VarA2.m;
            int i17 = xx4VarA2.f2559o;
            for (int i18 = 0; i18 < i17; i18++) {
                ((tx2) objArr6[i18]).a();
            }
            throw th2;
        }
    }
}
