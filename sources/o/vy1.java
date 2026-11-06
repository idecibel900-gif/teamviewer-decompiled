package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class vy1 {
    public int a;
    public final Object b;
    public final Object c;

    public vy1(androidx.recyclerview.widget.a aVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = aVar;
    }

    public static vy1 b(androidx.recyclerview.widget.a aVar, int i) {
        if (i == 0) {
            return new hb5(aVar, (byte) 0);
        }
        byte b = 1;
        if (i == 1) {
            return new hb5(aVar, b);
        }
        hk0.g("invalid orientation");
        return null;
    }

    public void a(pg6 pg6Var) {
        pg6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void c(pg6 pg6Var) {
        pg6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.a) {
            return 0;
        }
        return n() - this.a;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s(pg6 pg6Var) {
        pg6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void t(pg6 pg6Var) {
        pg6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void u(pg6 pg6Var) {
        pg6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void v(pg6 pg6Var) {
        pg6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public io.sentry.android.core.t0 w(pg6 pg6Var) {
        pg6Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public String x(Context context) {
        context.getClass();
        String string = context.getString(this.a);
        string.getClass();
        return string;
    }

    public /* synthetic */ vy1(sl7 sl7Var, int i) {
        this(sl7Var, i, g37.n);
    }

    public vy1(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public vy1(sl7 sl7Var, int i, g37 g37Var) {
        this.b = sl7Var;
        this.a = i;
        this.c = g37Var;
    }
}
