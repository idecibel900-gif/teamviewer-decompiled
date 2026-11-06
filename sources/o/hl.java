package o;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class hl extends TextPaint {
    public gy8 a;
    public vp7 b;
    public byte c;
    public lw6 d;
    public rv0 e;
    public sb0 f;
    public eo1 g;
    public y07 h;
    public v52 i;

    public final gy8 a() {
        gy8 gy8Var = this.a;
        if (gy8Var != null) {
            return gy8Var;
        }
        gy8 gy8Var2 = new gy8(this);
        this.a = gy8Var2;
        return gy8Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().k(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    public final void c(sb0 sb0Var, long j, float f) {
        if (sb0Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (sb0Var instanceof t57) {
            d(x67.r(f, ((t57) sb0Var).a));
            return;
        }
        if (!(sb0Var instanceof iw6)) {
            gk0.s();
            return;
        }
        byte b = 0;
        if (im3.n(this.f, sb0Var)) {
            y07 y07Var = this.h;
            if (!(y07Var == null ? false : y07.a(y07Var.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = sb0Var;
                    this.h = new y07(j);
                    this.g = d57.b(new gl(b, j, sb0Var));
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f = sb0Var;
            this.h = new y07(j);
            this.g = d57.b(new gl(b, j, sb0Var));
        }
        gy8 gy8VarA = a();
        eo1 eo1Var = this.g;
        gy8VarA.o(eo1Var != null ? (Shader) eo1Var.getValue() : null);
        this.e = null;
        di1.D(this, f);
    }

    public final void d(long j) {
        rv0 rv0Var = this.e;
        if ((rv0Var == null ? false : z68.a(rv0Var.a, j)) || j == 16) {
            return;
        }
        this.e = new rv0(j);
        setColor(j51.U(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(v52 v52Var) {
        if (v52Var == null || im3.n(this.i, v52Var)) {
            return;
        }
        this.i = v52Var;
        if (v52Var.equals(zk2.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(v52Var instanceof cc7)) {
            gk0.s();
            return;
        }
        a().s(1);
        cc7 cc7Var = (cc7) v52Var;
        a().r(cc7Var.a);
        gy8 gy8VarA = a();
        ((Paint) gy8VarA.c).setStrokeMiter(cc7Var.b);
        a().q(cc7Var.d);
        a().p(cc7Var.c);
        ((Paint) a().c).setPathEffect(null);
    }

    public final void f(lw6 lw6Var) {
        if (lw6Var == null || im3.n(this.d, lw6Var)) {
            return;
        }
        this.d = lw6Var;
        if (lw6Var.equals(lw6.d)) {
            clearShadowLayer();
            return;
        }
        lw6 lw6Var2 = this.d;
        float f = lw6Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (lw6Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), j51.U(this.d.a));
    }

    public final void g(vp7 vp7Var) {
        if (vp7Var == null || im3.n(this.b, vp7Var)) {
            return;
        }
        this.b = vp7Var;
        int i = vp7Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
