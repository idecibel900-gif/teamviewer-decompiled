package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class r97 {
    public final PointF a;
    public final PointF b;
    public final boolean c;

    public r97(PointF pointF, PointF pointF2, boolean z) {
        this.a = pointF;
        this.b = pointF2;
        this.c = z;
    }

    public static r97 a(r97 r97Var, PointF pointF, PointF pointF2, boolean z, int i) {
        if ((i & 1) != 0) {
            pointF = r97Var.a;
        }
        if ((i & 2) != 0) {
            pointF2 = r97Var.b;
        }
        if ((i & 4) != 0) {
            z = r97Var.c;
        }
        return new r97(pointF, pointF2, z);
    }

    public final r97 b(float f, float f2) {
        return a(this, new PointF(f, f2), null, false, 6);
    }

    public final r97 c(float f, float f2) {
        return a(this, null, new PointF(f, f2), false, 5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r97)) {
            return false;
        }
        r97 r97Var = (r97) obj;
        return this.a.equals(r97Var.a) && this.b.equals(r97Var.b) && this.c == r97Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StateMouse(mousePosOnBitmap=");
        sb.append(this.a);
        sb.append(", mousePosOnView=");
        sb.append(this.b);
        sb.append(", drawMouse=");
        return ua5.n(")", sb, this.c);
    }
}
