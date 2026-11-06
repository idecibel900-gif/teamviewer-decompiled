package o;

/* JADX INFO: loaded from: classes.dex */
public final class rh7 {
    public final String a;
    public final int b;
    public final int c;

    public rh7(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh7)) {
            return false;
        }
        rh7 rh7Var = (rh7) obj;
        return im3.n(this.a, rh7Var.a) && this.b == rh7Var.b && this.c == rh7Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fx3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return to7.l(sb, this.c, ")");
    }
}
