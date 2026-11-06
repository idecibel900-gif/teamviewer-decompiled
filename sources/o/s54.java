package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/s54;", "Lo/ls4;", "Lo/t54;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class s54 extends ls4 {
    public final cj b;
    public final j64 c;
    public final pr7 d;

    public s54(cj cjVar, j64 j64Var, pr7 pr7Var) {
        this.b = cjVar;
        this.c = j64Var;
        this.d = pr7Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new t54(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s54) {
            s54 s54Var = (s54) obj;
            return im3.n(this.b, s54Var.b) && this.c == s54Var.c && this.d == s54Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.b + ", legacyTextFieldState=" + this.c + ", textFieldSelectionManager=" + this.d + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        t54 t54Var = (t54) es4Var;
        if (t54Var.z) {
            t54Var.A.g();
            t54Var.A.k(t54Var);
        }
        cj cjVar = this.b;
        t54Var.A = cjVar;
        if (t54Var.z) {
            if (cjVar.a != null) {
                ni3.c("Expected textInputModifierNode to be null");
            }
            cjVar.a = t54Var;
        }
        t54Var.B = this.c;
        t54Var.C = this.d;
    }
}
