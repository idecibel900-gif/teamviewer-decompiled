package o;

/* JADX INFO: loaded from: classes.dex */
public final class b80 {
    public final String a;
    public final String b;

    public b80(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b80)) {
            return false;
        }
        b80 b80Var = (b80) obj;
        return im3.n(this.a, b80Var.a) && this.b.equals(b80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return fx3.h("BluetoothHeadset(productName=", this.a, ", address=", this.b, ")");
    }
}
