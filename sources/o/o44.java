package o;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o44 implements eo4 {
    public final p44 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final eo4 e;
    public final float f;
    public final boolean g;
    public final me1 h;
    public final in1 i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1627o;
    public final gb5 p;
    public final int q;
    public final int r;

    public o44(p44 p44Var, int i, boolean z, float f, eo4 eo4Var, float f2, boolean z2, me1 me1Var, in1 in1Var, long j, int i2, List list, int i3, int i4, int i5, gb5 gb5Var, int i6, int i7) {
        this.a = p44Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = eo4Var;
        this.f = f2;
        this.g = z2;
        this.h = me1Var;
        this.i = in1Var;
        this.j = j;
        this.k = i2;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.f1627o = i5;
        this.p = gb5Var;
        this.q = i6;
        this.r = i7;
    }

    @Override // o.eo4
    public final int a() {
        return this.e.a();
    }

    @Override // o.eo4
    public final int b() {
        return this.e.b();
    }

    @Override // o.eo4
    public final Map c() {
        return this.e.c();
    }

    @Override // o.eo4
    public final void d() {
        this.e.d();
    }

    @Override // o.eo4
    public final Function1 e() {
        return this.e.e();
    }

    @Override // o.eo4
    public final hw2 f() {
        return this.e.f();
    }

    @Override // o.eo4
    public final Function1 g() {
        return this.e.g();
    }

    public final o44 h(int i, boolean z) {
        p44 p44Var;
        if (this.g) {
            return null;
        }
        List list = this.l;
        if (list.isEmpty() || (p44Var = this.a) == null) {
            return null;
        }
        int iA = p44Var.a();
        int i2 = this.b - i;
        if (i2 < 0 || i2 >= iA) {
            return null;
        }
        p44 p44Var2 = (p44) lv0.m0(list);
        p44 p44Var3 = (p44) lv0.v0(list);
        if (p44Var2.r || p44Var3.r) {
            return null;
        }
        int i3 = p44Var2.m;
        int i4 = this.n;
        int i5 = this.m;
        if (i < 0) {
            if (Math.min((p44Var2.a() + i3) - i5, (p44Var3.a() + p44Var3.m) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - i3, i4 - p44Var3.m) <= i) {
            return null;
        }
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            p44 p44Var4 = (p44) list.get(i6);
            p44Var4.getClass();
            int[] iArr = p44Var4.v;
            if (!p44Var4.r) {
                p44Var4.m += i;
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if ((i7 & 1) != 0) {
                        iArr[i7] = iArr[i7] + i;
                    }
                }
                if (z) {
                    int size2 = p44Var4.b.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        k34 k34Var = (k34) p44Var4.k.a.g(p44Var4.i);
                        i34 i34Var = k34Var != null ? k34Var.a[i8] : null;
                        if (i34Var != null) {
                            long j = i34Var.l;
                            i34Var.l = (((long) (((int) (j & 4294967295L)) + i)) & 4294967295L) | (((long) ((int) (j >> 32))) << 32);
                        }
                        i8++;
                        size = size;
                    }
                }
            }
            i6++;
            size = size;
        }
        return new o44(this.a, i2, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, list, this.m, this.n, this.f1627o, this.p, this.q, this.r);
    }

    public final long i() {
        eo4 eo4Var = this.e;
        return (((long) eo4Var.b()) << 32) | (((long) eo4Var.a()) & 4294967295L);
    }
}
