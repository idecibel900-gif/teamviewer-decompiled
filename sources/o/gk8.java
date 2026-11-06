package o;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class gk8 {
    public final sk8 a;
    public nj3[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public gk8(sk8 sk8Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = sk8Var;
        c(sk8Var);
    }

    public final void a() {
        nj3[] nj3VarArr = this.b;
        if (nj3VarArr != null) {
            nj3 nj3VarI = nj3VarArr[0];
            nj3 nj3VarI2 = nj3VarArr[1];
            sk8 sk8Var = this.a;
            if (nj3VarI2 == null) {
                nj3VarI2 = sk8Var.a.i(2);
            }
            if (nj3VarI == null) {
                nj3VarI = sk8Var.a.i(1);
            }
            h(nj3.a(nj3VarI, nj3VarI2));
            nj3 nj3Var = this.b[v67.l(16)];
            if (nj3Var != null) {
                g(nj3Var);
            }
            nj3 nj3Var2 = this.b[v67.l(32)];
            if (nj3Var2 != null) {
                e(nj3Var2);
            }
            nj3 nj3Var3 = this.b[v67.l(64)];
            if (nj3Var3 != null) {
                i(nj3Var3);
            }
        }
    }

    public abstract sk8 b();

    public void c(sk8 sk8Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listF = sk8Var.a.f(i);
            int iL = v67.l(i);
            this.c[iL] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i != 8) {
                List<Rect> listG = sk8Var.a.g(i);
                this.d[iL] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            }
        }
    }

    public void d(int i, nj3 nj3Var) {
        if (this.b == null) {
            this.b = new nj3[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[v67.l(i2)] = nj3Var;
            }
        }
    }

    public void e(nj3 nj3Var) {
    }

    public abstract void f(nj3 nj3Var);

    public void g(nj3 nj3Var) {
    }

    public abstract void h(nj3 nj3Var);

    public void i(nj3 nj3Var) {
    }

    public gk8() {
        this(new sk8((sk8) null));
    }
}
