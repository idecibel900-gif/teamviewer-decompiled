package o;

/* JADX INFO: loaded from: classes.dex */
public final class h37 {
    public final nv1 a;
    public final k37 b;
    public final a47 c;

    public h37(nv1 nv1Var, k37 k37Var, a47 a47Var, int i) {
        a47Var = (i & 8) != 0 ? null : a47Var;
        this.a = nv1Var;
        this.b = k37Var;
        this.c = a47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h37)) {
            return false;
        }
        h37 h37Var = (h37) obj;
        return this.a.equals(h37Var.a) && this.b == h37Var.b && this.c == h37Var.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 961;
        a47 a47Var = this.c;
        return iHashCode + (a47Var == null ? 0 : a47Var.hashCode());
    }

    public final String toString() {
        return "SnackbarEventData(message=" + this.a + ", type=" + this.b + ", action=null, statisticEventType=" + this.c + ")";
    }
}
