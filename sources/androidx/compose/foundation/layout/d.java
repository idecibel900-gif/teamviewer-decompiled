package androidx.compose.foundation.layout;

import kotlin.Metadata;
import o.es4;
import o.hw2;
import o.ls4;
import o.qn8;
import o.r12;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d;", "Lo/ls4;", "Lo/qn8;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d extends ls4 {
    public final r12 b;
    public final hw2 c;
    public final Object d;

    public d(r12 r12Var, hw2 hw2Var, Object obj) {
        this.b = r12Var;
        this.c = hw2Var;
        this.d = obj;
    }

    @Override // o.ls4
    public final es4 create() {
        qn8 qn8Var = new qn8();
        qn8Var.A = this.b;
        qn8Var.B = this.c;
        return qn8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.b == dVar.b && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + to7.f(this.b.hashCode() * 31, 31, false);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        qn8 qn8Var = (qn8) es4Var;
        qn8Var.A = this.b;
        qn8Var.B = this.c;
    }
}
