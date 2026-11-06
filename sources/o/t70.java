package o;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class t70 extends tv0 {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public t70(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            zf.f();
            porterDuffColorFilter = zf.c(j51.U(j), j51.T(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(j51.U(j), j51.V(i));
        }
        super(porterDuffColorFilter);
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t70)) {
            return false;
        }
        t70 t70Var = (t70) obj;
        long j = t70Var.b;
        int i = rv0.i;
        return z68.a(this.b, j) && this.c == t70Var.c;
    }

    public final int hashCode() {
        int i = rv0.i;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return fx3.h("BlendModeColorFilter(color=", rv0.h(this.b), ", blendMode=", iq8.F(this.c), ")");
    }
}
