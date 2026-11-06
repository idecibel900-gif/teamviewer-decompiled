package o;

/* JADX INFO: loaded from: classes.dex */
public final class zb1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public zb1(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zb1)) {
            return false;
        }
        zb1 zb1Var = (zb1) obj;
        long j = zb1Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.b, zb1Var.b) && z68.a(this.c, zb1Var.c) && z68.a(this.d, zb1Var.d) && z68.a(this.e, zb1Var.e);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.e) + fx3.c(fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strH = rv0.h(this.a);
        String strH2 = rv0.h(this.b);
        String strH3 = rv0.h(this.c);
        String strH4 = rv0.h(this.d);
        String strH5 = rv0.h(this.e);
        StringBuilder sbO = e41.o("ContextMenuColors(backgroundColor=", strH, ", textColor=", strH2, ", iconColor=");
        e41.t(sbO, strH3, ", disabledTextColor=", strH4, ", disabledIconColor=");
        return e41.l(sbO, strH5, ")");
    }
}
