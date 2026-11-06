package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/ra0;", "Lo/ls4;", "Lo/sa0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ra0 extends ls4 {
    public final y50 b;
    public final boolean c;

    public ra0(y50 y50Var, boolean z) {
        this.b = y50Var;
        this.c = z;
    }

    @Override // o.ls4
    public final es4 create() {
        sa0 sa0Var = new sa0();
        sa0Var.A = this.b;
        sa0Var.B = this.c;
        return sa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ra0 ra0Var = obj instanceof ra0 ? (ra0) obj : null;
        return ra0Var != null && this.b.equals(ra0Var.b) && this.c == ra0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        sa0 sa0Var = (sa0) es4Var;
        sa0Var.A = this.b;
        sa0Var.B = this.c;
    }
}
