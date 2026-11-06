package o;

/* JADX INFO: loaded from: classes.dex */
public final class zr7 {
    public static final a65 d = new a65((byte) 20, (Object) new jp6(27), (Object) new yr7(0), false);
    public final xo a;
    public final long b;
    public final gt7 c;

    public zr7(xo xoVar, long j, gt7 gt7Var) {
        gt7 gt7Var2;
        this.a = xoVar;
        this.b = h57.h(xoVar.n.length(), j);
        if (gt7Var != null) {
            gt7Var2 = new gt7(h57.h(xoVar.n.length(), gt7Var.a));
        } else {
            gt7Var2 = null;
        }
        this.c = gt7Var2;
    }

    public static zr7 a(zr7 zr7Var, xo xoVar, long j, int i) {
        if ((i & 1) != 0) {
            xoVar = zr7Var.a;
        }
        if ((i & 2) != 0) {
            j = zr7Var.b;
        }
        gt7 gt7Var = (i & 4) != 0 ? zr7Var.c : null;
        zr7Var.getClass();
        return new zr7(xoVar, j, gt7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr7)) {
            return false;
        }
        zr7 zr7Var = (zr7) obj;
        return gt7.b(this.b, zr7Var.b) && im3.n(this.c, zr7Var.c) && im3.n(this.a, zr7Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = gt7.c;
        int iC = fx3.c(iHashCode, 31, this.b);
        gt7 gt7Var = this.c;
        return iC + (gt7Var != null ? Long.hashCode(gt7Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + gt7.h(this.b) + ", composition=" + this.c + ")";
    }

    public zr7(int i, long j, String str) {
        this(new xo((i & 1) != 0 ? "" : str), (i & 2) != 0 ? gt7.b : j, (gt7) null);
    }
}
