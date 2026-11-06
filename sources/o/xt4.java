package o;

/* JADX INFO: loaded from: classes.dex */
public final class xt4 {
    public final long a;

    public /* synthetic */ xt4(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xt4) {
            return this.a == ((xt4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return to7.j(this.a, "IndirectPointerEventData(packedValue=", ")");
    }
}
