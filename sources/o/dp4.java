package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dp4 {
    public final xd3 a;
    public final Map b;

    public dp4(xd3 xd3Var, Map map) {
        this.a = xd3Var;
        this.b = uf0.z(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp4)) {
            return false;
        }
        dp4 dp4Var = (dp4) obj;
        return im3.n(this.a, dp4Var.a) && im3.n(this.b, dp4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ")";
    }
}
