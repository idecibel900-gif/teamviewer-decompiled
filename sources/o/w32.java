package o;

/* JADX INFO: loaded from: classes.dex */
public final class w32 implements Comparable {
    public final float m;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.m, ((w32) obj).m);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w32) {
            return Float.compare(this.m, ((w32) obj).m) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.m);
    }

    public final String toString() {
        return c(this.m);
    }
}
