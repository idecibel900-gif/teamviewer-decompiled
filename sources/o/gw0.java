package o;

/* JADX INFO: loaded from: classes.dex */
public final class gw0 implements bs7 {
    public final long a;

    public gw0(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        li3.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // o.bs7
    public final float a() {
        return rv0.c(this.a);
    }

    @Override // o.bs7
    public final long b() {
        return this.a;
    }

    @Override // o.bs7
    public final sb0 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw0)) {
            return false;
        }
        long j = ((gw0) obj).a;
        int i = rv0.i;
        return z68.a(this.a, j);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return fx3.g("ColorStyle(value=", rv0.h(this.a), ")");
    }
}
