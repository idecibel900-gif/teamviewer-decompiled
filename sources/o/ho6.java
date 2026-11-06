package o;

/* JADX INFO: loaded from: classes.dex */
public final class ho6 {
    public final rb6 a;
    public final int b;
    public final long c;

    public ho6(rb6 rb6Var, int i, long j) {
        this.a = rb6Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho6)) {
            return false;
        }
        ho6 ho6Var = (ho6) obj;
        return this.a == ho6Var.a && this.b == ho6Var.b && this.c == ho6Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + fx3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return e41.k(sb, this.c, ")");
    }
}
