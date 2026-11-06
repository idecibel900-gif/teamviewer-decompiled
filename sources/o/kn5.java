package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kn5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public kn5(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn5)) {
            return false;
        }
        kn5 kn5Var = (kn5) obj;
        return vs1.o(this.a, kn5Var.a) && this.b == kn5Var.b && t65.b(this.c, kn5Var.c) && t65.b(this.d, kn5Var.d) && this.e == kn5Var.e && Float.compare(this.f, kn5Var.f) == 0 && this.g == kn5Var.g && this.h == kn5Var.h && this.i.equals(kn5Var.i) && t65.b(this.j, kn5Var.j) && Float.compare(this.k, kn5Var.k) == 0 && t65.b(this.l, kn5Var.l) && t65.b(this.m, kn5Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + fx3.c(e41.e(this.k, fx3.c((this.i.hashCode() + to7.f(fx3.a(this.g, e41.e(this.f, to7.f(fx3.c(fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        String strW = vs1.W(this.a);
        String strG = t65.g(this.c);
        String strG2 = t65.g(this.d);
        String strA = sn5.a(this.g);
        String strG3 = t65.g(this.j);
        String strG4 = t65.g(this.l);
        String strG5 = t65.g(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strW);
        sb.append(", uptime=");
        sb.append(this.b);
        e41.t(sb, ", positionOnScreen=", strG, ", position=", strG2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(strA);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(strG3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(strG4);
        sb.append(", originalEventPosition=");
        sb.append(strG5);
        sb.append(")");
        return sb.toString();
    }
}
