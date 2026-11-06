package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class zw {
    public final nw d;
    public k67 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public zw(iu iuVar) {
        this.d = new nw(this, iuVar);
    }

    public final void a(ba4 ba4Var, int i) {
        k67 k67VarJ = ba4Var.j(i);
        nw nwVar = this.d;
        nwVar.g(k67VarJ, 1.0f);
        nwVar.g(ba4Var.j(i), -1.0f);
    }

    public final void b(k67 k67Var, k67 k67Var2, k67 k67Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        nw nwVar = this.d;
        if (z) {
            nwVar.g(k67Var, 1.0f);
            nwVar.g(k67Var2, -1.0f);
            nwVar.g(k67Var3, -1.0f);
        } else {
            nwVar.g(k67Var, -1.0f);
            nwVar.g(k67Var2, 1.0f);
            nwVar.g(k67Var3, 1.0f);
        }
    }

    public final void c(k67 k67Var, k67 k67Var2, k67 k67Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        nw nwVar = this.d;
        if (z) {
            nwVar.g(k67Var, 1.0f);
            nwVar.g(k67Var2, -1.0f);
            nwVar.g(k67Var3, 1.0f);
        } else {
            nwVar.g(k67Var, -1.0f);
            nwVar.g(k67Var2, 1.0f);
            nwVar.g(k67Var3, -1.0f);
        }
    }

    public k67 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final k67 f(boolean[] zArr, k67 k67Var) {
        int i;
        nw nwVar = this.d;
        int iD = nwVar.d();
        k67 k67Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = nwVar.f(i2);
            if (f2 < 0.0f) {
                k67 k67VarE = nwVar.e(i2);
                if ((zArr == null || !zArr[k67VarE.n]) && k67VarE != k67Var && (((i = k67VarE.x) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    k67Var2 = k67VarE;
                }
            }
        }
        return k67Var2;
    }

    public final void g(k67 k67Var) {
        k67 k67Var2 = this.a;
        nw nwVar = this.d;
        if (k67Var2 != null) {
            nwVar.g(k67Var2, -1.0f);
            this.a.f1232o = -1;
            this.a = null;
        }
        float fH = nwVar.h(k67Var, true) * (-1.0f);
        this.a = k67Var;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        int i = nwVar.h;
        for (int i2 = 0; i != -1 && i2 < nwVar.a; i2++) {
            float[] fArr = nwVar.g;
            fArr[i] = fArr[i] / fH;
            i = nwVar.f[i];
        }
    }

    public final void h(ba4 ba4Var, k67 k67Var, boolean z) {
        if (k67Var.r) {
            nw nwVar = this.d;
            float fC = nwVar.c(k67Var);
            this.b = (k67Var.q * fC) + this.b;
            nwVar.h(k67Var, z);
            if (z) {
                k67Var.b(this);
            }
            if (nwVar.d() == 0) {
                this.e = true;
                ba4Var.b = true;
            }
        }
    }

    public void i(ba4 ba4Var, zw zwVar, boolean z) {
        nw nwVar = this.d;
        nwVar.getClass();
        float fC = nwVar.c(zwVar.a);
        nwVar.h(zwVar.a, z);
        nw nwVar2 = zwVar.d;
        int iD = nwVar2.d();
        for (int i = 0; i < iD; i++) {
            k67 k67VarE = nwVar2.e(i);
            nwVar.a(k67VarE, nwVar2.c(k67VarE) * fC, z);
        }
        this.b = (zwVar.b * fC) + this.b;
        if (z) {
            zwVar.a.b(this);
        }
        if (this.a == null || nwVar.d() != 0) {
            return;
        }
        this.e = true;
        ba4Var.b = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != 0.0f) {
            strConcat = strConcat + this.b;
            z = true;
        } else {
            z = false;
        }
        nw nwVar = this.d;
        int iD = nwVar.d();
        for (int i = 0; i < iD; i++) {
            k67 k67VarE = nwVar.e(i);
            if (k67VarE != null) {
                float f = nwVar.f(i);
                if (f != 0.0f) {
                    String string = k67VarE.toString();
                    if (z) {
                        if (f > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            f *= -1.0f;
                        }
                    } else if (f < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        f *= -1.0f;
                    }
                    strConcat = f == 1.0f ? strConcat.concat(string) : strConcat + f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }
}
