package o;

/* JADX INFO: loaded from: classes.dex */
public final class hn1 {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hn1) && this.a == ((hn1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fx3.f(this.a, "DeltaCounter(count=", ")");
    }
}
