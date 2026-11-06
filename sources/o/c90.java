package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/c90;", "Lo/ls4;", "Lo/b90;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c90 extends ls4 {
    public final float b;
    public final t57 c;
    public final pw6 d;

    public c90(float f, t57 t57Var, pw6 pw6Var) {
        this.b = f;
        this.c = t57Var;
        this.d = pw6Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new b90(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c90)) {
            return false;
        }
        c90 c90Var = (c90) obj;
        return w32.b(this.b, c90Var.b) && this.c.equals(c90Var.c) && im3.n(this.d, c90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + w32.c(this.b) + ", brush=" + this.c + ", shape=" + this.d + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        b90 b90Var = (b90) es4Var;
        float f = b90Var.D;
        gi0 gi0Var = b90Var.G;
        float f2 = this.b;
        if (!w32.b(f, f2)) {
            b90Var.D = f2;
            gi0Var.U0();
        }
        t57 t57Var = b90Var.E;
        t57 t57Var2 = this.c;
        if (!im3.n(t57Var, t57Var2)) {
            b90Var.E = t57Var2;
            gi0Var.U0();
        }
        pw6 pw6Var = b90Var.F;
        pw6 pw6Var2 = this.d;
        if (im3.n(pw6Var, pw6Var2)) {
            return;
        }
        b90Var.F = pw6Var2;
        gi0Var.U0();
        vn4.p0(b90Var).U();
    }
}
