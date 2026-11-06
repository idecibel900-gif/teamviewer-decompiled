package o;

/* JADX INFO: loaded from: classes.dex */
public final class gx {
    public final float a;

    public gx(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx) && Float.compare(this.a, ((gx) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AspectQuotient(aspectQuotient=" + this.a + ")";
    }
}
