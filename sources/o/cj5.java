package o;

/* JADX INFO: loaded from: classes.dex */
public final class cj5 {
    public final boolean a;
    public final lj5 b;

    public cj5(boolean z, lj5 lj5Var) {
        this.a = z;
        this.b = lj5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj5)) {
            return false;
        }
        cj5 cj5Var = (cj5) obj;
        return this.a == cj5Var.a && this.b == cj5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PermissionSetting(enabled=" + this.a + ", section=" + this.b + ")";
    }

    public /* synthetic */ cj5() {
        this(false, lj5.n);
    }
}
