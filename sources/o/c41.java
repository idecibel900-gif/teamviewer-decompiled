package o;

/* JADX INFO: loaded from: classes.dex */
public final class c41 {
    public final es1 a;
    public final vl7 b;

    public c41(es1 es1Var, vl7 vl7Var) {
        vl7Var.getClass();
        this.a = es1Var;
        this.b = vl7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c41)) {
            return false;
        }
        c41 c41Var = (c41) obj;
        return this.a.equals(c41Var.a) && this.b == c41Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConnectableItemDisplayInfo(fallbackDeviceAvatarPresentation=" + this.a + ", statusIndicatorType=" + this.b + ")";
    }
}
