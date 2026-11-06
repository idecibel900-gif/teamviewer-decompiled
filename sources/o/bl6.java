package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bl6 {
    public final boolean a;
    public final List b;
    public final List c;

    public bl6(List list, List list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl6)) {
            return false;
        }
        bl6 bl6Var = (bl6) obj;
        return this.a == bl6Var.a && im3.n(this.b, bl6Var.b) && im3.n(this.c, bl6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + to7.g(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "SearchPreloadedData(isLoading=" + this.a + ", recentConnectionsList=" + this.b + ", groupsList=" + this.c + ")";
    }
}
