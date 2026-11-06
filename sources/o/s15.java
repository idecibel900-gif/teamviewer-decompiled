package o;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s15 extends ox4 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ox4 f1971o;
    public boolean p;

    public s15(long j, t47 t47Var, Function1 function1, Function1 function2, ox4 ox4Var) {
        super(j, t47Var, function1, function2);
        this.f1971o = ox4Var;
        ox4Var.k();
    }

    @Override // o.ox4, o.n47
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.f1971o.l();
    }

    @Override // o.ox4
    public final r47 w() {
        s15 s15Var;
        ox4 ox4Var = this.f1971o;
        if (ox4Var.m || ox4Var.c) {
            return new p47(this);
        }
        kx4 kx4Var = this.h;
        long j = this.b;
        HashMap mapM = kx4Var != null ? v47.m(ox4Var.g(), this, this.f1971o.d()) : null;
        Object obj = v47.c;
        synchronized (obj) {
            try {
                v47.v(this);
                if (kx4Var == null || kx4Var.d == 0) {
                    s15Var = this;
                    s15Var.a();
                } else {
                    s15Var = this;
                    r47 r47VarZ = s15Var.z(this.f1971o.g(), kx4Var, mapM, this.f1971o.d());
                    if (!r47VarZ.equals(q47.e)) {
                        return r47VarZ;
                    }
                    kx4 kx4VarX = s15Var.f1971o.x();
                    if (kx4VarX != null) {
                        kx4VarX.k(kx4Var);
                    } else {
                        s15Var.f1971o.B(kx4Var);
                        s15Var.h = null;
                    }
                }
                if (im3.u(s15Var.f1971o.g(), j) < 0) {
                    s15Var.f1971o.v();
                }
                ox4 ox4Var2 = s15Var.f1971o;
                ox4Var2.r(ox4Var2.d().b(j).a(s15Var.j));
                s15Var.f1971o.A(j);
                ox4 ox4Var3 = s15Var.f1971o;
                int i = s15Var.d;
                s15Var.d = -1;
                if (i >= 0) {
                    int[] iArr = ox4Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    ox4Var3.k = iArrCopyOf;
                } else {
                    ox4Var3.getClass();
                }
                ox4 ox4Var4 = s15Var.f1971o;
                t47 t47Var = s15Var.j;
                ox4Var4.getClass();
                synchronized (obj) {
                    ox4Var4.j = ox4Var4.j.d(t47Var);
                    ox4 ox4Var5 = s15Var.f1971o;
                    int[] iArr2 = s15Var.k;
                    ox4Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = ox4Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        ox4Var5.k = iArr2;
                    }
                }
                s15Var.m = true;
                if (!s15Var.p) {
                    s15Var.p = true;
                    s15Var.f1971o.l();
                }
                return q47.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
