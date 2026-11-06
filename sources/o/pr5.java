package o;

/* JADX INFO: loaded from: classes.dex */
public final class pr5 {
    public static final pr5 a = new pr5();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr5) && w32.b(Float.NaN, Float.NaN) && Float.compare(Float.NaN, Float.NaN) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(Float.NaN) + (Float.hashCode(Float.NaN) * 31);
    }

    public final String toString() {
        return fx3.g("PreferredSize(dp=", w32.c(Float.NaN), ", proportion=NaN)");
    }
}
