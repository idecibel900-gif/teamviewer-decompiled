package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class wn5 {
    public final UUID a;
    public final String b;

    public wn5(UUID uuid, String str) {
        uuid.getClass();
        str.getClass();
        this.a = uuid;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn5)) {
            return false;
        }
        wn5 wn5Var = (wn5) obj;
        return im3.n(this.a, wn5Var.a) && im3.n(this.b, wn5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PolicyInfo(id=" + this.a + ", name=" + this.b + ")";
    }
}
