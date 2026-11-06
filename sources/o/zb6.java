package o;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zb6 {
    public final Set a;
    public final String b;

    public zb6(Set set, String str) {
        this.a = set;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb6)) {
            return false;
        }
        zb6 zb6Var = (zb6) obj;
        return this.a.equals(zb6Var.a) && this.b.equals(zb6Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(-1L) + fx3.c(to7.e(this.a.hashCode() * 31, 31, this.b), 31, -1L);
    }

    public final String toString() {
        return "ResourceItem(qualifiers=" + this.a + ", path=" + this.b + ", offset=-1, size=-1)";
    }
}
