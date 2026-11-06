package o;

/* JADX INFO: loaded from: classes.dex */
public final class x61 extends y61 {
    public final int a;

    public x61(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x61) && this.a == ((x61) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fx3.f(this.a, "ConstraintsNotMet(reason=", ")");
    }
}
