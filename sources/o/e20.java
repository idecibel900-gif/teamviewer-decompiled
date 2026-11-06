package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/e20;", "Lo/ls4;", "Lo/f20;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e20 extends ls4 {
    public final long b;
    public final sb0 c;
    public final pw6 d;

    public e20(long j, sb0 sb0Var, pw6 pw6Var, int i) {
        j = (i & 1) != 0 ? rv0.h : j;
        sb0Var = (i & 2) != 0 ? null : sb0Var;
        this.b = j;
        this.c = sb0Var;
        this.d = pw6Var;
    }

    @Override // o.ls4
    public final es4 create() {
        f20 f20Var = new f20();
        f20Var.A = this.b;
        f20Var.B = this.c;
        f20Var.C = 1.0f;
        f20Var.D = this.d;
        f20Var.E = 9205357640488583168L;
        return f20Var;
    }

    public final boolean equals(Object obj) {
        e20 e20Var = obj instanceof e20 ? (e20) obj : null;
        if (e20Var == null) {
            return false;
        }
        long j = e20Var.b;
        int i = rv0.i;
        return z68.a(this.b, j) && im3.n(this.c, e20Var.c) && im3.n(this.d, e20Var.d);
    }

    public final int hashCode() {
        int i = rv0.i;
        int iHashCode = Long.hashCode(this.b) * 31;
        sb0 sb0Var = this.c;
        return this.d.hashCode() + e41.e(1.0f, (iHashCode + (sb0Var != null ? sb0Var.hashCode() : 0)) * 31, 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        f20 f20Var = (f20) es4Var;
        f20Var.A = this.b;
        f20Var.B = this.c;
        f20Var.C = 1.0f;
        pw6 pw6Var = f20Var.D;
        pw6 pw6Var2 = this.d;
        if (!im3.n(pw6Var, pw6Var2)) {
            f20Var.D = pw6Var2;
            vn4.p0(f20Var).U();
        }
        yo1.H(f20Var);
    }
}
