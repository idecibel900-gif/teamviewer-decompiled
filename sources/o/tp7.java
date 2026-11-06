package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/tp7;", "Lo/ls4;", "Lo/up7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class tp7 extends ls4 {
    public final lh7 b;
    public final jr7 c;
    public final kr7 d;
    public final kd1 e;

    public tp7(lh7 lh7Var, jr7 jr7Var, kr7 kr7Var, kd1 kd1Var) {
        this.b = lh7Var;
        this.c = jr7Var;
        this.d = kr7Var;
        this.e = kd1Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new up7(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp7)) {
            return false;
        }
        tp7 tp7Var = (tp7) obj;
        return this.b == tp7Var.b && this.c == tp7Var.c && this.d == tp7Var.d && this.e == tp7Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        up7 up7Var = (up7) es4Var;
        up7Var.C.n = null;
        lh7 lh7Var = this.b;
        up7Var.C = lh7Var;
        lh7Var.n = up7Var;
        lh7Var.f1364o = up7Var.z ? mz7.f1527o : mz7.n;
        up7Var.D = this.c;
        up7Var.E = this.d;
        up7Var.F = this.e;
    }
}
