package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/gg5;", "Lo/ls4;", "Lo/fg5;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class gg5 extends ls4 {
    public final m5 b;

    public gg5(m5 m5Var) {
        this.b = m5Var;
    }

    @Override // o.ls4
    public final es4 create() {
        fg5 fg5Var = new fg5();
        fg5Var.A = this.b;
        return fg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gg5) {
            return this.b == ((gg5) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        fg5 fg5Var = (fg5) es4Var;
        fg5Var.A = this.b;
        vn4.p0(fg5Var).U();
    }
}
