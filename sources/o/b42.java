package o;

/* JADX INFO: loaded from: classes.dex */
public final class b42 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b42) && w32.b(10.0f, 10.0f) && w32.b(40.0f, 40.0f) && w32.b(10.0f, 10.0f) && w32.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + e41.e(40.0f, e41.e(10.0f, e41.e(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strC = w32.c(10.0f);
        String strC2 = w32.c(40.0f);
        return e41.m(e41.o("DpTouchBoundsExpansion(start=", strC, ", top=", strC2, ", end="), w32.c(10.0f), ", bottom=", w32.c(40.0f), ", isLayoutDirectionAware=true)");
    }
}
