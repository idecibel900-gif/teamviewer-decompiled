package o;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class cl8 {
    public final ma0 a;
    public final float b;

    public cl8(Rect rect, float f) {
        this.a = new ma0(rect);
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!cl8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        cl8 cl8Var = (cl8) obj;
        return im3.n(this.a, cl8Var.a) && this.b == cl8Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public cl8(ma0 ma0Var, float f) {
        this.a = ma0Var;
        this.b = f;
    }
}
