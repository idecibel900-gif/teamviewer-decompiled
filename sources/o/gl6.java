package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gl6 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    public gl6(List list, List list2, List list3, List list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl6)) {
            return false;
        }
        gl6 gl6Var = (gl6) obj;
        return im3.n(this.a, gl6Var.a) && im3.n(this.b, gl6Var.b) && im3.n(this.c, gl6Var.c) && im3.n(this.d, gl6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + to7.g(this.c, to7.g(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SearchResultLists(recents=" + this.a + ", devices=" + this.b + ", contacts=" + this.c + ", groups=" + this.d + ")";
    }
}
