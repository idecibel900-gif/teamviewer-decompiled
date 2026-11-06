package o;

/* JADX INFO: loaded from: classes.dex */
public final class ol7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ol7(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol7)) {
            return false;
        }
        ol7 ol7Var = (ol7) obj;
        long j = ol7Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.b, ol7Var.b) && z68.a(this.c, ol7Var.c) && z68.a(this.d, ol7Var.d);
    }

    public final int hashCode() {
        int i = rv0.i;
        return fx3.c(fx3.c(fx3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strH = rv0.h(this.a);
        String strH2 = rv0.h(this.b);
        return e41.m(e41.o("TVSnackbarColors(containerColor=", strH, ", messageColor=", strH2, ", actionButtonTextColor="), rv0.h(this.c), ", dismissButtonColor=", rv0.h(this.d), ", leadingIconColorFilter=null)");
    }
}
