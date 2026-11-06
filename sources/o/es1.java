package o;

/* JADX INFO: loaded from: classes.dex */
public final class es1 {
    public final as1 a;
    public final fs1 b;

    public es1(as1 as1Var, fs1 fs1Var) {
        this.a = as1Var;
        this.b = fs1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es1)) {
            return false;
        }
        es1 es1Var = (es1) obj;
        return this.a == es1Var.a && this.b == es1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeviceAvatarPresentation(icon=" + this.a + ", status=" + this.b + ")";
    }
}
