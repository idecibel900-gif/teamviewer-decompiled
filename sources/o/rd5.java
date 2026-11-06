package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rd5 {
    public final ArrayList a;
    public final boolean b;

    public rd5(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd5)) {
            return false;
        }
        rd5 rd5Var = (rd5) obj;
        return this.a.equals(rd5Var.a) && this.b == rd5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Page(items=" + this.a + ", isLastPage=" + this.b + ")";
    }
}
