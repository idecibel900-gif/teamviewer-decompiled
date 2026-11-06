package o;

/* JADX INFO: loaded from: classes.dex */
public final class io6 {
    public final ho6 a;
    public final ho6 b;
    public final boolean c;

    public io6(ho6 ho6Var, ho6 ho6Var2, boolean z) {
        this.a = ho6Var;
        this.b = ho6Var2;
        this.c = z;
    }

    public static io6 a(io6 io6Var, ho6 ho6Var, ho6 ho6Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            ho6Var = io6Var.a;
        }
        if ((i & 2) != 0) {
            ho6Var2 = io6Var.b;
        }
        io6Var.getClass();
        return new io6(ho6Var, ho6Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io6)) {
            return false;
        }
        io6 io6Var = (io6) obj;
        return im3.n(this.a, io6Var.a) && im3.n(this.b, io6Var.b) && this.c == io6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return ua5.n(")", sb, this.c);
    }
}
