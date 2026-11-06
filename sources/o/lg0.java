package o;

/* JADX INFO: loaded from: classes.dex */
public final class lg0 {
    public final kg0 a;
    public final int b;
    public final int c;

    public lg0(kg0 kg0Var, int i, int i2) {
        this.a = kg0Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg0)) {
            return false;
        }
        lg0 lg0Var = (lg0) obj;
        return im3.n(this.a, lg0Var.a) && this.b == lg0Var.b && this.c == lg0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fx3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.a);
        sb.append(", indentationLevel=");
        sb.append(this.b);
        sb.append(", start=");
        return to7.l(sb, this.c, ")");
    }
}
