package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/bb0;", "Lo/ls4;", "Lo/db0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class bb0 extends ls4 {
    public final rl b;

    public bb0(rl rlVar) {
        this.b = rlVar;
    }

    @Override // o.ls4
    public final es4 create() {
        return new db0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bb0) {
            return this.b == ((bb0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        db0 db0Var = (db0) es4Var;
        rl rlVar = this.b;
        db0Var.A = rlVar;
        if (db0Var.z) {
            rlVar.invoke(db0Var.B);
        }
    }
}
