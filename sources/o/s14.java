package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/s14;", "Lo/ls4;", "Lo/t14;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s14 extends ls4 {
    public final float b;
    public final boolean c;

    public s14(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    @Override // o.ls4
    public final es4 create() {
        t14 t14Var = new t14();
        t14Var.A = this.b;
        t14Var.B = this.c;
        return t14Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        s14 s14Var = obj instanceof s14 ? (s14) obj : null;
        return s14Var != null && this.b == s14Var.b && this.c == s14Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        t14 t14Var = (t14) es4Var;
        t14Var.A = this.b;
        t14Var.B = this.c;
    }
}
