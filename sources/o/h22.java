package o;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class h22 {
    public final DisplayCutout a;

    public h22(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return dq.n(this.a);
        }
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return dq.o(this.a);
        }
        return 0;
    }

    public final nj3 c() {
        return Build.VERSION.SDK_INT >= 30 ? nj3.c(b4.g(this.a)) : nj3.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h22.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((h22) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
