package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mg4 implements Cloneable {
    public /* synthetic */ boolean m;
    public /* synthetic */ long[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object[] f1467o;
    public /* synthetic */ int p;

    public mg4(int i) {
        if (i == 0) {
            this.n = j51.n;
            this.f1467o = j51.f1132o;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.n = new long[i5];
        this.f1467o = new Object[i5];
    }

    public final void a() {
        int i = this.p;
        Object[] objArr = this.f1467o;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.p = 0;
        this.m = false;
    }

    public final Object b(long j) {
        Object obj;
        int iT = j51.t(this.n, this.p, j);
        if (iT < 0 || (obj = this.f1467o[iT]) == uf0.F) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.m) {
            int i = this.p;
            long[] jArr = this.n;
            Object[] objArr = this.f1467o;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != uf0.F) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.m = false;
            this.p = i2;
        }
        return j51.t(this.n, this.p, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        mg4 mg4Var = (mg4) objClone;
        mg4Var.n = (long[]) this.n.clone();
        mg4Var.f1467o = (Object[]) this.f1467o.clone();
        return mg4Var;
    }

    public final long d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.p)) {
            hk0.g(fx3.e(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.m) {
            long[] jArr = this.n;
            Object[] objArr = this.f1467o;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != uf0.F) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.m = false;
            this.p = i3;
        }
        return this.n[i];
    }

    public final void e(long j, Object obj) {
        Object obj2 = uf0.F;
        int iT = j51.t(this.n, this.p, j);
        if (iT >= 0) {
            this.f1467o[iT] = obj;
            return;
        }
        int i = ~iT;
        int i2 = this.p;
        if (i < i2) {
            Object[] objArr = this.f1467o;
            if (objArr[i] == obj2) {
                this.n[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.m) {
            long[] jArr = this.n;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f1467o;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.m = false;
                this.p = i3;
                i = ~j51.t(this.n, i3, j);
            }
        }
        int i5 = this.p;
        if (i5 >= this.n.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.n = Arrays.copyOf(this.n, i9);
            this.f1467o = Arrays.copyOf(this.f1467o, i9);
        }
        int i10 = this.p;
        if (i10 - i != 0) {
            long[] jArr2 = this.n;
            int i11 = i + 1;
            cx.H0(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.f1467o;
            cx.G0(i11, i, this.p, objArr3, objArr3);
        }
        this.n[i] = j;
        this.f1467o[i] = obj;
        this.p++;
    }

    public final void g(long j) {
        int iT = j51.t(this.n, this.p, j);
        if (iT >= 0) {
            Object[] objArr = this.f1467o;
            Object obj = objArr[iT];
            Object obj2 = uf0.F;
            if (obj != obj2) {
                objArr[iT] = obj2;
                this.m = true;
            }
        }
    }

    public final int h() {
        if (this.m) {
            int i = this.p;
            long[] jArr = this.n;
            Object[] objArr = this.f1467o;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != uf0.F) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.m = false;
            this.p = i2;
        }
        return this.p;
    }

    public final Object i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.p)) {
            hk0.g(fx3.e(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.m) {
            long[] jArr = this.n;
            Object[] objArr = this.f1467o;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != uf0.F) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.m = false;
            this.p = i3;
        }
        return this.f1467o[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.p * 28);
        sb.append('{');
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ mg4(Object obj) {
        this(10);
    }
}
