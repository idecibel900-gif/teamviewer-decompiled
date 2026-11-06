package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r13 {
    public final k33 a;
    public final List b;
    public final m13 c;

    public r13(k33 k33Var, List list, m13 m13Var) {
        m13Var.getClass();
        this.a = k33Var;
        this.b = list;
        this.c = m13Var;
    }

    public static r13 a(r13 r13Var, m13 m13Var) {
        k33 k33Var = r13Var.a;
        List list = r13Var.b;
        r13Var.getClass();
        m13Var.getClass();
        return new r13(k33Var, list, m13Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r13)) {
            return false;
        }
        r13 r13Var = (r13) obj;
        return im3.n(this.a, r13Var.a) && im3.n(this.b, r13Var.b) && this.c == r13Var.c;
    }

    public final int hashCode() {
        k33 k33Var = this.a;
        int iHashCode = (k33Var == null ? 0 : k33Var.hashCode()) * 31;
        List list = this.b;
        return this.c.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BrowseContext(groupId=" + this.a + ", groupIds=" + this.b + ", sortOrder=" + this.c + ")";
    }
}
