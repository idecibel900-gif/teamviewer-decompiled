package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f01 {
    public final ux2 a;
    public tm0 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final r94 d = new r94((byte) 2);
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public f01(ux2 ux2Var, tm0 tm0Var) {
        this.a = ux2Var;
        this.b = tm0Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            va5 va5Var = this.b.V;
            va5Var.v0(qa5.d);
            va5Var.q[va5Var.r - va5Var.f2293o[va5Var.p - 1].b] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        tm0 tm0Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        tm0Var.getClass();
        if (size != 0) {
            va5 va5Var2 = tm0Var.V;
            va5Var2.v0(r95.d);
            lq1.E(va5Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                va5 va5Var = this.b.V;
                va5Var.v0(ga5.d);
                int i3 = va5Var.r - va5Var.f2293o[va5Var.p - 1].b;
                int[] iArr = va5Var.q;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                va5 va5Var2 = this.b.V;
                va5Var2.v0(ca5.d);
                int i6 = va5Var2.r - va5Var2.f2293o[va5Var2.p - 1].b;
                int[] iArr2 = va5Var2.q;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        g17 g17Var = this.a.G;
        int i = z ? g17Var.i : g17Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            i01.a("Tried to seek backward");
        }
        if (i2 > 0) {
            va5 va5Var = this.b.V;
            va5Var.v0(k95.d);
            va5Var.q[va5Var.r - va5Var.f2293o[va5Var.p - 1].b] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                i01.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
