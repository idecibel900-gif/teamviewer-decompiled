package o;

/* JADX INFO: loaded from: classes.dex */
public final class dh3 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof dh3) {
            return this.a == ((dh3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fx3.f(this.a, "IndirectPointerEventPrimaryDirectionalMotionAxis(value=", ")");
    }
}
