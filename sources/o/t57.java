package o;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class t57 extends sb0 implements yl3 {
    public final long a;

    public t57(long j) {
        this.a = j;
    }

    @Override // o.sb0
    public final void a(float f, long j, gy8 gy8Var) {
        gy8Var.j(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = rv0.b(rv0.c(jB) * f, jB);
        }
        gy8Var.l(jB);
        if (((Shader) gy8Var.d) != null) {
            gy8Var.o(null);
        }
    }

    @Override // o.yl3
    public final Object b(float f, Object obj) {
        if (obj == null) {
            int i = rv0.i;
            obj = new t57(rv0.g);
        }
        if (!(obj instanceof t57)) {
            return null;
        }
        return new t57(j51.K(this.a, ((t57) obj).a, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t57)) {
            return false;
        }
        long j = ((t57) obj).a;
        int i = rv0.i;
        return z68.a(this.a, j);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return fx3.g("SolidColor(value=", rv0.h(this.a), ")");
    }
}
