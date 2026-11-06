package o;

/* JADX INFO: loaded from: classes.dex */
public final class oj6 {
    public final float a;
    public final float b;

    public oj6(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj6)) {
            return false;
        }
        oj6 oj6Var = (oj6) obj;
        return w32.b(this.a, oj6Var.a) && Float.compare(this.b, oj6Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ScreenSizeCategory(heightIndicator=" + w32.c(this.a) + ", lottiePercentage=" + this.b + ")";
    }
}
