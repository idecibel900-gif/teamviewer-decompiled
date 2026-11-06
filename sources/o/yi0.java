package o;

/* JADX INFO: loaded from: classes2.dex */
public final class yi0 {
    public final ht2 a;
    public final sy4 b;

    static {
        ht2.j(a87.f);
    }

    public yi0(ht2 ht2Var, sy4 sy4Var) {
        ht2Var.getClass();
        this.a = ht2Var;
        this.b = sy4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi0)) {
            return false;
        }
        yi0 yi0Var = (yi0) obj;
        return this.a.equals(yi0Var.a) && this.b.equals(yi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 961);
    }

    public final String toString() {
        String strReplace = this.a.b().replace('.', '/');
        strReplace.getClass();
        return strReplace + "/" + this.b;
    }
}
