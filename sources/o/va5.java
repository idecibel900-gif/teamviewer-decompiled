package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class va5 extends ds1 {
    public int p;
    public int r;
    public int t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public hm2[] f2293o = new hm2[16];
    public int[] q = new int[16];
    public Object[] s = new Object[16];

    public final void s0() {
        this.p = 0;
        this.r = 0;
        Arrays.fill(this.s, 0, this.t, (Object) null);
        this.t = 0;
    }

    public final void t0(jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        if (this.p != 0) {
            rr0 rr0Var = new rr0(this);
            va5 va5Var = (va5) rr0Var.e;
            while (true) {
                hm2 hm2Var = va5Var.f2293o[rr0Var.b];
                px2 px2VarD = hm2Var.d(rr0Var);
                jv jvVar2 = jvVar;
                k17 k17Var2 = k17Var;
                au2 au2Var2 = au2Var;
                sa5 sa5Var2 = sa5Var;
                try {
                    hm2Var.c(rr0Var, jvVar2, k17Var2, au2Var2, sa5Var2);
                    int i = rr0Var.b;
                    int i2 = va5Var.p;
                    if (i < i2) {
                        hm2 hm2Var2 = va5Var.f2293o[i];
                        rr0Var.c += hm2Var2.b;
                        rr0Var.d += hm2Var2.c;
                        int i3 = i + 1;
                        rr0Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        jvVar = jvVar2;
                        k17Var = k17Var2;
                        au2Var = au2Var2;
                        sa5Var = sa5Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (sa5Var2 == null) {
                        throw th;
                    }
                    ka0.H(th, new n5((Object) px2VarD, (Object) k17Var2, (Object) sa5Var2, (byte) 23));
                    throw th;
                }
            }
        }
        s0();
    }

    public final boolean u0() {
        return this.p == 0;
    }

    public final void v0(hm2 hm2Var) {
        int i = this.p;
        hm2[] hm2VarArr = this.f2293o;
        if (i == hm2VarArr.length) {
            hm2[] hm2VarArr2 = new hm2[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(hm2VarArr, 0, hm2VarArr2, 0, i);
            this.f2293o = hm2VarArr2;
        }
        int i2 = this.r;
        int i3 = hm2Var.b;
        int i4 = hm2Var.c;
        int i5 = i2 + i3;
        int[] iArr = this.q;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            cx.F0(0, 0, length, iArr, iArr2);
            this.q = iArr2;
        }
        int i7 = this.t + i4;
        Object[] objArr = this.s;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.s = objArr2;
        }
        hm2[] hm2VarArr3 = this.f2293o;
        int i9 = this.p;
        this.p = i9 + 1;
        hm2VarArr3[i9] = hm2Var;
        this.r += hm2Var.b;
        this.t += i4;
    }
}
