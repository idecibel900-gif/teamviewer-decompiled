package o;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class ma0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new ma0(0, 0, 0, 0);
    }

    public ma0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            gk0.h(ua5.l("Left must be less than or equal to right, left: ", i, i3, ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        gk0.h(ua5.l("top must be less than or equal to bottom, top: ", i2, i4, ", bottom: "));
        throw null;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ma0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ma0 ma0Var = (ma0) obj;
        return this.a == ma0Var.a && this.b == ma0Var.b && this.c == ma0Var.c && this.d == ma0Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ma0.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return to7.l(sb, this.d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ma0(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
