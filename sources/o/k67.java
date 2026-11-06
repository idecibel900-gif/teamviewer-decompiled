package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k67 implements Comparable {
    public boolean m;
    public float q;
    public int x;
    public int n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1232o = -1;
    public int p = 0;
    public boolean r = false;
    public final float[] s = new float[9];
    public final float[] t = new float[9];
    public zw[] u = new zw[16];
    public int v = 0;
    public int w = 0;

    public k67(int i) {
        this.x = i;
    }

    public final void a(zw zwVar) {
        int i = 0;
        while (true) {
            int i2 = this.v;
            zw[] zwVarArr = this.u;
            if (i >= i2) {
                if (i2 >= zwVarArr.length) {
                    zwVarArr = (zw[]) Arrays.copyOf(zwVarArr, zwVarArr.length * 2);
                    this.u = zwVarArr;
                }
                int i3 = this.v;
                zwVarArr[i3] = zwVar;
                this.v = i3 + 1;
                return;
            }
            if (zwVarArr[i] == zwVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(zw zwVar) {
        int i = this.v;
        int i2 = 0;
        while (i2 < i) {
            if (this.u[i2] == zwVar) {
                while (i2 < i - 1) {
                    zw[] zwVarArr = this.u;
                    int i3 = i2 + 1;
                    zwVarArr[i2] = zwVarArr[i3];
                    i2 = i3;
                }
                this.v--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.x = 5;
        this.p = 0;
        this.n = -1;
        this.f1232o = -1;
        this.q = 0.0f;
        this.r = false;
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            this.u[i2] = null;
        }
        this.v = 0;
        this.w = 0;
        this.m = false;
        Arrays.fill(this.t, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.n - ((k67) obj).n;
    }

    public final void d(ba4 ba4Var, float f) {
        this.q = f;
        this.r = true;
        int i = this.v;
        this.f1232o = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.u[i2].h(ba4Var, this, false);
        }
        this.v = 0;
    }

    public final void e(ba4 ba4Var, zw zwVar) {
        int i = this.v;
        for (int i2 = 0; i2 < i; i2++) {
            this.u[i2].i(ba4Var, zwVar, false);
        }
        this.v = 0;
    }

    public final String toString() {
        return "" + this.n;
    }
}
