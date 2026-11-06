package o;

/* JADX INFO: loaded from: classes.dex */
public final class wj3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public wj3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj3)) {
            return false;
        }
        wj3 wj3Var = (wj3) obj;
        return this.a == wj3Var.a && this.b == wj3Var.b && this.c == wj3Var.c && this.d == wj3Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbJ = fx3.j(this.a, this.b, "InsetsValues(left=", ", top=", ", right=");
        sbJ.append(this.c);
        sbJ.append(", bottom=");
        sbJ.append(this.d);
        sbJ.append(")");
        return sbJ.toString();
    }
}
