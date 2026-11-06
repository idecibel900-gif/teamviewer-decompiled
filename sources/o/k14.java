package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k14 implements eo4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eo4 b;
    public final /* synthetic */ p14 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ eo4 e;

    public /* synthetic */ k14(eo4 eo4Var, p14 p14Var, int i, eo4 eo4Var2, byte b) {
        this.a = b;
        this.c = p14Var;
        this.d = i;
        this.e = eo4Var2;
        this.b = eo4Var;
    }

    @Override // o.eo4
    public final int a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.a();
    }

    @Override // o.eo4
    public final int b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.b();
    }

    @Override // o.eo4
    public final Map c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.c();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[LOOP:0: B:11:0x002f->B:33:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[SYNTHETIC] */
    @Override // o.eo4
    public final void d() {
        byte b = this.a;
        eo4 eo4Var = this.e;
        int i = this.d;
        p14 p14Var = this.c;
        switch (b) {
            case 0:
                p14Var.q = i;
                eo4Var.d();
                xx4 xx4Var = p14Var.y;
                jx4 jx4Var = p14Var.x;
                long[] jArr = jx4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((255 & j) < 128) {
                                    int i6 = (i2 << 3) + i5;
                                    Object obj = jx4Var.b[i6];
                                    kd7 kd7Var = (kd7) jx4Var.c[i6];
                                    int i7 = xx4Var.i(obj);
                                    if (i7 < 0 || i7 >= p14Var.q) {
                                        if (i7 >= 0) {
                                            Object obj2 = g68.y;
                                            Object[] objArr = xx4Var.m;
                                            Object obj3 = objArr[i7];
                                            objArr[i7] = obj2;
                                        }
                                        if (p14Var.v.b(obj)) {
                                            kd7Var.a();
                                        }
                                        jx4Var.l(i6);
                                    } else {
                                        i3 = i3;
                                    }
                                } else {
                                    i3 = i3;
                                }
                                j >>= i3;
                                i5++;
                                i3 = i3;
                            }
                            if (i4 == i3) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                p14Var.f(p14Var.p);
                break;
            default:
                p14Var.p = i;
                eo4Var.d();
                if (p14Var.m.u == null) {
                    p14Var.f(p14Var.p);
                }
                break;
        }
    }

    @Override // o.eo4
    public final Function1 e() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.e();
    }

    @Override // o.eo4
    public final hw2 f() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.f();
    }

    @Override // o.eo4
    public final Function1 g() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.g();
    }
}
