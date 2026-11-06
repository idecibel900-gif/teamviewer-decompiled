package o;

/* JADX INFO: loaded from: classes.dex */
public final class wy1 {
    public final l33 a;
    public final h71 b;
    public final ns1 c;

    public wy1(l33 l33Var, h71 h71Var, ns1 ns1Var) {
        this.a = l33Var;
        this.b = h71Var;
        this.c = ns1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy1)) {
            return false;
        }
        wy1 wy1Var = (wy1) obj;
        return im3.n(this.a, wy1Var.a) && im3.n(this.b, wy1Var.b) && im3.n(this.c, wy1Var.c);
    }

    public final int hashCode() {
        l33 l33Var = this.a;
        int iHashCode = (l33Var == null ? 0 : l33Var.hashCode()) * 31;
        h71 h71Var = this.b;
        int iHashCode2 = (iHashCode + (h71Var == null ? 0 : h71Var.hashCode())) * 31;
        ns1 ns1Var = this.c;
        return iHashCode2 + (ns1Var != null ? ns1Var.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceTabStoredSelectionsState(storedGroup=" + this.a + ", storedContact=" + this.b + ", storedDeviceInfo=" + this.c + ")";
    }
}
