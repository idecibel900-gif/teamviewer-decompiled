package o;

/* JADX INFO: loaded from: classes.dex */
public final class bg6 {
    public float a = 0.0f;
    public boolean b = true;
    public cf1 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg6)) {
            return false;
        }
        bg6 bg6Var = (bg6) obj;
        return Float.compare(this.a, bg6Var.a) == 0 && this.b == bg6Var.b && im3.n(this.c, bg6Var.c);
    }

    public final int hashCode() {
        int iF = to7.f(Float.hashCode(this.a) * 31, 31, this.b);
        cf1 cf1Var = this.c;
        return (iF + (cf1Var == null ? 0 : cf1Var.s0.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
