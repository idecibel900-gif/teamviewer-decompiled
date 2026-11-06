package o;

/* JADX INFO: loaded from: classes.dex */
public final class yj implements gn5 {
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public yj(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((yj) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return fx3.f(this.b, "AndroidPointerIcon(type=", ")");
    }
}
