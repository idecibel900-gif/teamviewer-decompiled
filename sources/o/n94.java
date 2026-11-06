package o;

/* JADX INFO: loaded from: classes.dex */
public final class n94 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof n94) {
            return this.a == ((n94) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        return i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
