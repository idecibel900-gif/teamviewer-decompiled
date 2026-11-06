package o;

/* JADX INFO: loaded from: classes.dex */
public final class tb7 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof tb7) {
            return this.a == ((tb7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fx3.f(this.a, "Strings(value=", ")");
    }
}
