package o;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public abstract class iw6 extends sb0 {
    public l07 a;
    public long b = 9205357640488583168L;

    @Override // o.sb0
    public final void a(float f, long j, gy8 gy8Var) {
        l07 l07Var = this.a;
        if (l07Var == null || !y07.a(this.b, j)) {
            if (y07.c(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                l07Var = null;
            } else {
                l07Var = this.a;
                if (l07Var == null) {
                    l07Var = new l07((byte) 15, false);
                    this.a = l07Var;
                }
                l07Var.n = c(j);
                this.a = l07Var;
                this.b = j;
            }
        }
        long jE = gy8Var.e();
        long j2 = rv0.b;
        if (!z68.a(jE, j2)) {
            gy8Var.l(j2);
        }
        if (!im3.n((Shader) gy8Var.d, l07Var != null ? (Shader) l07Var.n : null)) {
            gy8Var.o(l07Var != null ? (Shader) l07Var.n : null);
        }
        if (((Paint) gy8Var.c).getAlpha() / 255.0f == f) {
            return;
        }
        gy8Var.j(f);
    }

    public abstract Shader c(long j);
}
