package o;

/* JADX INFO: loaded from: classes.dex */
public final class l04 {
    public final int a;
    public final int b;
    public final boolean c;

    public l04(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l04)) {
            return false;
        }
        l04 l04Var = (l04) obj;
        return this.a == l04Var.a && this.b == l04Var.b && this.c == l04Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fx3.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ua5.n(")", fx3.j(this.a, this.b, "BidiRun(start=", ", end=", ", isRtl="), this.c);
    }
}
