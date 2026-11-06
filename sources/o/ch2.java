package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ch2 {
    public final boolean a;
    public final List b;

    public ch2(boolean z, List list) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch2)) {
            return false;
        }
        ch2 ch2Var = (ch2) obj;
        return this.a == ch2Var.a && im3.n(this.b, ch2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FabState(isVisible=" + this.a + ", actions=" + this.b + ")";
    }
}
