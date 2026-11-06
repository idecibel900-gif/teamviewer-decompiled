package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u53 {
    public final i04 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final zw4 f = new zw4();
    public final o45 g = new o45();
    public final pw4 h = new pw4(10);

    public u53(i04 i04Var) {
        this.a = i04Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    public final void a(long j, List list, boolean z) {
        pw4 pw4Var;
        long[] jArr;
        y35 y35Var;
        Object objD;
        Object obj;
        int size = list.size();
        o45 o45Var = this.g;
        o45 o45Var2 = o45Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            pw4Var = this.h;
            if (i >= size) {
                break;
            }
            es4 es4Var = (es4) list.get(i);
            if (es4Var.z) {
                es4Var.y = new ql1(this, es4Var, (byte) 12);
                if (z2) {
                    xx4 xx4Var = o45Var2.a;
                    Object[] objArr = xx4Var.m;
                    int i2 = xx4Var.f2559o;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (((y35) obj).c.equals(es4Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    y35Var = (y35) obj;
                    if (y35Var != null) {
                        y35Var.i = true;
                        y35Var.d.a(j);
                        if (z) {
                            Object objD2 = pw4Var.d(j);
                            if (objD2 == null) {
                                objD2 = new zw4();
                                pw4Var.g(j, objD2);
                            }
                            ((zw4) objD2).a(y35Var);
                        }
                    } else {
                        z2 = false;
                        y35Var = new y35(es4Var);
                        y35Var.d.a(j);
                        if (z) {
                            objD = pw4Var.d(j);
                            if (objD == null) {
                                objD = new zw4();
                                pw4Var.g(j, objD);
                            }
                            ((zw4) objD).a(y35Var);
                        }
                        o45Var2.a.b(y35Var);
                    }
                } else {
                    y35Var = new y35(es4Var);
                    y35Var.d.a(j);
                    if (z) {
                        objD = pw4Var.d(j);
                        if (objD == null) {
                            objD = new zw4();
                            pw4Var.g(j, objD);
                        }
                        ((zw4) objD).a(y35Var);
                    }
                    o45Var2.a.b(y35Var);
                }
                o45Var2 = y35Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = pw4Var.b;
            Object[] objArr2 = pw4Var.c;
            long[] jArr3 = pw4Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                zw4 zw4Var = (zw4) objArr2[i8];
                                xx4 xx4Var2 = o45Var.a;
                                Object[] objArr3 = xx4Var2.m;
                                int i9 = xx4Var2.f2559o;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((y35) objArr3[i10]).f(j3, zw4Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        pw4Var.a();
    }

    public final boolean b(io.sentry.android.core.n1 n1Var, boolean z) {
        o45 o45Var = this.g;
        xx4 xx4Var = o45Var.a;
        if (!o45Var.a((mg4) n1Var.f118o, this.a, n1Var, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = xx4Var.m;
        int i = xx4Var.f2559o;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((y35) objArr[i2]).e(n1Var, z) || z3;
        }
        Object[] objArr2 = xx4Var.m;
        int i3 = xx4Var.f2559o;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((y35) objArr2[i4]).d(n1Var) || z4;
        }
        o45Var.b(n1Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            zw4 zw4Var = this.f;
            int i5 = zw4Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((es4) zw4Var.f(i6));
            }
            zw4Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            o45Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        o45 o45Var = this.g;
        xx4 xx4Var = o45Var.a;
        Object[] objArr = xx4Var.m;
        int i = xx4Var.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            ((y35) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            o45Var.a.g();
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
    public final void d(es4 es4Var) {
        if (this.b) {
            this.e = true;
            this.f.a(es4Var);
            return;
        }
        o45 o45Var = this.g;
        zw4 zw4Var = o45Var.b;
        zw4Var.d();
        zw4Var.a(o45Var);
        while (zw4Var.i()) {
            o45 o45Var2 = (o45) zw4Var.k(zw4Var.b - 1);
            int i = 0;
            while (true) {
                xx4 xx4Var = o45Var2.a;
                if (i < xx4Var.f2559o) {
                    y35 y35Var = (y35) xx4Var.m[i];
                    if (y35Var.c.equals(es4Var)) {
                        o45Var2.a.j(y35Var);
                        y35Var.c();
                    } else {
                        zw4Var.a(y35Var);
                        i++;
                    }
                }
            }
        }
    }
}
