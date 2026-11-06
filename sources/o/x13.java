package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x13 {
    public final List a;
    public final boolean b;
    public final boolean c;

    public x13(List list, boolean z, boolean z2) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x13)) {
            return false;
        }
        x13 x13Var = (x13) obj;
        return im3.n(this.a, x13Var.a) && this.b == x13Var.b && this.c == x13Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + to7.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagerSnapshot(items=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", canLoadMore=");
        return ua5.n(")", sb, this.c);
    }
}
