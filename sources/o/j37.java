package o;

/* JADX INFO: loaded from: classes.dex */
public final class j37 extends nv1 {
    public final int e;
    public final String f;

    public j37(int i, String str) {
        this.e = i;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j37)) {
            return false;
        }
        j37 j37Var = (j37) obj;
        return this.e == j37Var.e && im3.n(this.f, j37Var.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.e) * 31;
        String str = this.f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return e41.h("StringResWithArg(resId=", ", arg=", this.e, this.f, ")");
    }
}
