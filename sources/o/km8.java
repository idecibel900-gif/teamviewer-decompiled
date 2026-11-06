package o;

/* JADX INFO: loaded from: classes.dex */
public final class km8 {
    public final String a;
    public final int b;

    public km8(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km8)) {
            return false;
        }
        km8 km8Var = (km8) obj;
        return im3.n(this.a, km8Var.a) && this.b == km8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ")";
    }
}
