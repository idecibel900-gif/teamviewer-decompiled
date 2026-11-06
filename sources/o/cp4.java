package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cp4 {
    public final String a;
    public final Map b;

    public cp4(String str, Map map) {
        this.a = str;
        this.b = uf0.z(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp4)) {
            return false;
        }
        cp4 cp4Var = (cp4) obj;
        return im3.n(this.a, cp4Var.a) && im3.n(this.b, cp4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ")";
    }
}
