package o;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/oj4;", "Lo/ls4;", "Lo/qj4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class oj4 extends ls4 {
    public final or b;
    public final tr7 c;
    public final xl5 d;

    public oj4(or orVar, tr7 tr7Var, xl5 xl5Var) {
        this.b = orVar;
        this.c = tr7Var;
        this.d = xl5Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new qj4(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + to7.f(e41.e(Float.NaN, e41.e(Float.NaN, fx3.c(to7.f(e41.e(Float.NaN, this.b.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        qj4 qj4Var = (qj4) es4Var;
        float f = qj4Var.C;
        long j = qj4Var.E;
        float f2 = qj4Var.F;
        boolean z = qj4Var.D;
        float f3 = qj4Var.G;
        boolean z2 = qj4Var.H;
        xl5 xl5Var = qj4Var.I;
        View view = qj4Var.J;
        in1 in1Var = qj4Var.K;
        qj4Var.A = this.b;
        qj4Var.C = Float.NaN;
        qj4Var.D = true;
        qj4Var.E = 9205357640488583168L;
        qj4Var.F = Float.NaN;
        qj4Var.G = Float.NaN;
        qj4Var.H = true;
        qj4Var.B = this.c;
        xl5 xl5Var2 = this.d;
        qj4Var.I = xl5Var2;
        View viewY = e8.y(qj4Var);
        in1 in1Var2 = vn4.p0(qj4Var).L;
        if (qj4Var.L != null) {
            np6 np6Var = rj4.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !xl5Var2.a()) || 9205357640488583168L != j || !w32.b(Float.NaN, f2) || !w32.b(Float.NaN, f3) || true != z || true != z2 || !xl5Var2.equals(xl5Var) || !viewY.equals(view) || !im3.n(in1Var2, in1Var)) {
                qj4Var.V0();
            }
        }
        qj4Var.W0();
    }
}
