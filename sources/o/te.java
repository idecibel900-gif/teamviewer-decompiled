package o;

/* JADX INFO: loaded from: classes.dex */
public final class te implements cq4 {
    public final x50 a;
    public final x50 b;

    public te(x50 x50Var, x50 x50Var2) {
        this.a = x50Var;
        this.b = x50Var2;
    }

    @Override // o.cq4
    public final int a(zk3 zk3Var, long j, int i) {
        int iA = this.b.a(0, zk3Var.c());
        return zk3Var.b + iA + (-this.a.a(0, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        return this.a.equals(teVar.a) && this.b.equals(teVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ")";
    }
}
