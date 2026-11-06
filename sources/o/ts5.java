package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ts5 extends zw {
    public k67[] f;
    public k67[] g;
    public int h;
    public a65 i;

    @Override // o.zw
    public final k67 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            k67[] k67VarArr = this.f;
            k67 k67Var = k67VarArr[i2];
            if (!zArr[k67Var.n]) {
                a65 a65Var = this.i;
                a65Var.n = k67Var;
                int i3 = 8;
                if (i != -1) {
                    k67 k67Var2 = k67VarArr[i];
                    while (i3 >= 0) {
                        float f = k67Var2.t[i3];
                        float f2 = ((k67) a65Var.n).t[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((k67) a65Var.n).t[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // o.zw
    public final boolean e() {
        return this.h == 0;
    }

    @Override // o.zw
    public final void i(ba4 ba4Var, zw zwVar, boolean z) {
        k67 k67Var = zwVar.a;
        if (k67Var == null) {
            return;
        }
        float[] fArr = k67Var.t;
        nw nwVar = zwVar.d;
        int iD = nwVar.d();
        for (int i = 0; i < iD; i++) {
            k67 k67VarE = nwVar.e(i);
            float f = nwVar.f(i);
            a65 a65Var = this.i;
            a65Var.n = k67VarE;
            if (k67VarE.m) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((k67) a65Var.n).t;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((k67) a65Var.n).t[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((ts5) a65Var.f302o).k((k67) a65Var.n);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((k67) a65Var.n).t[i3] = f4;
                    } else {
                        ((k67) a65Var.n).t[i3] = 0.0f;
                    }
                }
                j(k67VarE);
            }
            this.b = (zwVar.b * f) + this.b;
        }
        k(k67Var);
    }

    public final void j(k67 k67Var) {
        int i;
        k67[] k67VarArr;
        int i2 = this.h + 1;
        k67[] k67VarArr2 = this.f;
        if (i2 > k67VarArr2.length) {
            k67[] k67VarArr3 = (k67[]) Arrays.copyOf(k67VarArr2, k67VarArr2.length * 2);
            this.f = k67VarArr3;
            this.g = (k67[]) Arrays.copyOf(k67VarArr3, k67VarArr3.length * 2);
        }
        k67[] k67VarArr4 = this.f;
        int i3 = this.h;
        k67VarArr4[i3] = k67Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && k67VarArr4[i3].n > k67Var.n) {
            int i5 = 0;
            while (true) {
                i = this.h;
                k67VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                k67VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(k67VarArr, 0, i, new gj2((byte) 24));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        k67Var.m = true;
        k67Var.a(this);
    }

    public final void k(k67 k67Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == k67Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        k67Var.m = false;
                        return;
                    } else {
                        k67[] k67VarArr = this.f;
                        int i3 = i + 1;
                        k67VarArr[i] = k67VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // o.zw
    public final String toString() {
        a65 a65Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            a65Var.n = this.f[i];
            str = str + a65Var + " ";
        }
        return str;
    }
}
