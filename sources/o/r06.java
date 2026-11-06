package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r06 {
    public final int a;
    public final int b;
    public final int c;

    public r06(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r06.class == obj.getClass()) {
            r06 r06Var = (r06) obj;
            if (this.a == r06Var.a && this.b == r06Var.b && this.c == r06Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sbB = lb7.b();
        sbB.append(this.b);
        sbB.append(',');
        sbB.append(this.c);
        sbB.append(':');
        sbB.append(this.a);
        return lb7.k(sbB);
    }
}
