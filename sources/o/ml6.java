package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ml6 {
    public final List a;
    public final List b;
    public final List c;

    public ml6(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml6)) {
            return false;
        }
        ml6 ml6Var = (ml6) obj;
        return im3.n(this.a, ml6Var.a) && im3.n(this.b, ml6Var.b) && im3.n(this.c, ml6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + to7.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SearchResults(contacts=" + this.a + ", managedDevices=" + this.b + ", legacyDevices=" + this.c + ")";
    }
}
