package o;

/* JADX INFO: loaded from: classes.dex */
public final class h40 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof h40) {
            return Float.compare(this.a, ((h40) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ")";
    }
}
