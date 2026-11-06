package o;

/* JADX INFO: loaded from: classes2.dex */
public final class hu0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        return obj instanceof hu0;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "0.0..0.0";
    }
}
