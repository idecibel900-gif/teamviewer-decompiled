package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p44 {
    public final int a;
    public final List b;
    public final ge c;
    public final j04 d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;
    public final Object i;
    public final Object j;
    public final m34 k;
    public final long l;
    public int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1705o;
    public final int p;
    public final int q;
    public boolean r;
    public int s = Integer.MIN_VALUE;
    public int t;
    public int u;
    public final int[] v;

    public p44(int i, List list, ge geVar, j04 j04Var, int i2, int i3, int i4, long j, Object obj, Object obj2, m34 m34Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = geVar;
        this.d = j04Var;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = j;
        this.i = obj;
        this.j = obj2;
        this.k = m34Var;
        this.l = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            jl5 jl5Var = (jl5) list.get(i6);
            i5 += jl5Var.n;
            iMax = Math.max(iMax, jl5Var.m);
        }
        this.n = i5;
        this.q = iMax;
        this.v = new int[this.b.size() * 2];
        this.p = this.g;
        this.f1705o = i5;
    }

    public final int a() {
        int i = this.f1705o + this.p;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final long b(int i) {
        if (i == 0 && this.b.size() == 0) {
            return ((long) this.m) & 4294967295L;
        }
        int i2 = i * 2;
        int[] iArr = this.v;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(il5 il5Var, boolean z) {
        if (this.s == Integer.MIN_VALUE) {
            ni3.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jl5 jl5Var = (jl5) list.get(i);
            int i2 = this.t - jl5Var.n;
            int i3 = this.u;
            long jB = b(i);
            k34 k34Var = (k34) this.k.a.g(this.i);
            l03 l03Var = null;
            Object[] objArr = 0;
            i34 i34Var = k34Var != null ? k34Var.a[i] : null;
            if (i34Var != null) {
                if (z) {
                    i34Var.n = jB;
                } else {
                    if (!vk3.a(i34Var.n, 9223372034707292159L)) {
                        jB = i34Var.n;
                    }
                    long jC = vk3.c(jB, ((vk3) i34Var.r.getValue()).a);
                    int i4 = (int) (jB & 4294967295L);
                    if (((i4 <= i2 && ((int) (jC & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (jC & 4294967295L)) >= i3)) && ((Boolean) i34Var.h.getValue()).booleanValue()) {
                        im3.R(i34Var.a, null, null, new f34(i34Var, objArr == true ? 1 : 0, (byte) 1), 3);
                    }
                    jB = jC;
                }
                l03Var = i34Var.f1031o;
            }
            long jC2 = vk3.c(jB, this.h);
            if (!z && i34Var != null) {
                i34Var.m = jC2;
            }
            if (l03Var != null) {
                il5Var.f(jl5Var);
                jl5Var.e0(vk3.c(jC2, jl5Var.q), 0.0f, l03Var);
            } else {
                le5 le5Var = kl5.a;
                il5Var.f(jl5Var);
                jl5Var.c0(vk3.c(jC2, jl5Var.q), 0.0f, le5Var);
            }
        }
    }

    public final void d(int i, int i2, int i3) {
        this.m = i;
        this.s = i3;
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            jl5 jl5Var = (jl5) list.get(i4);
            int i5 = i4 * 2;
            ge geVar = this.c;
            if (geVar == null) {
                throw fx3.l("null horizontalAlignment when isVertical == true");
            }
            int iA = geVar.a(jl5Var.m, i2, this.d);
            int[] iArr = this.v;
            iArr[i5] = iA;
            iArr[i5 + 1] = i;
            i += jl5Var.n;
        }
        this.t = -this.e;
        this.u = this.s + this.f;
    }
}
