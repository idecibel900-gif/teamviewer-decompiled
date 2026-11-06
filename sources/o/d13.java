package o;

/* JADX INFO: loaded from: classes.dex */
public final class d13 {
    public final int a;
    public final long b;
    public final float c;

    public d13(float f, int i, long j) {
        this.a = i;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d13)) {
            return false;
        }
        d13 d13Var = (d13) obj;
        if (this.a != d13Var.a) {
            return false;
        }
        long j = d13Var.b;
        int i = rv0.i;
        return z68.a(this.b, j) && w32.b(this.c, d13Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        int i = rv0.i;
        return Float.hashCode(this.c) + fx3.c(iHashCode, 31, this.b);
    }

    public final String toString() {
        String strH = rv0.h(this.b);
        String strC = w32.c(this.c);
        StringBuilder sb = new StringBuilder("GroupActionsMenuIcon(resId=");
        sb.append(this.a);
        sb.append(", tint=");
        sb.append(strH);
        sb.append(", size=");
        return e41.l(sb, strC, ")");
    }
}
