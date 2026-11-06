package o;

/* JADX INFO: loaded from: classes.dex */
public final class vo7 {
    public final xo a;
    public xo b;
    public boolean c = false;
    public zu4 d = null;

    public vo7(xo xoVar, xo xoVar2) {
        this.a = xoVar;
        this.b = xoVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo7)) {
            return false;
        }
        vo7 vo7Var = (vo7) obj;
        return im3.n(this.a, vo7Var.a) && im3.n(this.b, vo7Var.b) && this.c == vo7Var.c && im3.n(this.d, vo7Var.d);
    }

    public final int hashCode() {
        int iF = to7.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        zu4 zu4Var = this.d;
        return iF + (zu4Var == null ? 0 : zu4Var.hashCode());
    }

    public final String toString() {
        xo xoVar = this.b;
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) xoVar) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}
