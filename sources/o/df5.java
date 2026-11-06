package o;

/* JADX INFO: loaded from: classes.dex */
public final class df5 {
    public final qj a;
    public final int b;
    public final int c;

    public df5(qj qjVar, int i, int i2) {
        this.a = qjVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof df5) {
            df5 df5Var = (df5) obj;
            if (this.a == df5Var.a && this.b == df5Var.b && this.c == df5Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fx3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return to7.l(sb, this.c, ")");
    }
}
