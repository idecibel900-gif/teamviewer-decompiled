package o;

/* JADX INFO: loaded from: classes.dex */
public final class ej5 implements gj5 {
    public final boolean a;

    public ej5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ej5) && this.a == ((ej5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "Denied(shouldShowRationale=" + this.a + ')';
    }
}
