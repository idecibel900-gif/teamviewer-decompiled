package o;

/* JADX INFO: loaded from: classes.dex */
public final class hj3 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof hj3) {
            return this.a == ((hj3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}
