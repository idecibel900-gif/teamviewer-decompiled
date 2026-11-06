package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j67 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;

    public j67(String str, boolean z, boolean z2, List list, List list2) {
        list.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = list2;
    }

    public static j67 a(j67 j67Var, boolean z, List list) {
        String str = j67Var.a;
        List list2 = j67Var.d;
        list2.getClass();
        return new j67(str, false, z, list2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j67)) {
            return false;
        }
        j67 j67Var = (j67) obj;
        return this.a.equals(j67Var.a) && this.b == j67Var.b && this.c == j67Var.c && im3.n(this.d, j67Var.d) && this.e.equals(j67Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + to7.g(this.d, to7.f(to7.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "SolutionsScreenState(downloadUrl=" + this.a + ", isDynamicListLoading=" + this.b + ", isDynamicListAvailable=" + this.c + ", solutionsStaticList=" + this.d + ", solutionsDynamicList=" + this.e + ")";
    }
}
