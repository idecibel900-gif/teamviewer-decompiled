package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hw7 {
    public final List a;
    public final String b;

    public hw7(List list, String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw7)) {
            return false;
        }
        hw7 hw7Var = (hw7) obj;
        return im3.n(this.a, hw7Var.a) && im3.n(this.b, hw7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Page(items=" + this.a + ", nextToken=" + this.b + ")";
    }
}
