package o;

/* JADX INFO: loaded from: classes.dex */
public final class o37 {
    public final ul7 a;
    public final gl0 b;

    public o37(ul7 ul7Var, gl0 gl0Var) {
        this.a = ul7Var;
        this.b = gl0Var;
    }

    public final void a() {
        gl0 gl0Var = this.b;
        if (gl0Var.r() instanceof z45) {
            gl0Var.resumeWith(z37.m);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o37.class == obj.getClass()) {
            o37 o37Var = (o37) obj;
            return im3.n(this.a, o37Var.a) && this.b == o37Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
