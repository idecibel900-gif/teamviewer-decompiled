package o;

/* JADX INFO: loaded from: classes.dex */
public final class d04 {
    public static final d04 a;

    static {
        d04 d04Var = new d04();
        if (w32.a(0.0f, 0.0f) < 0 || w32.a(0.0f, 0.0f) < 0 || w32.a(0.0f, 0.0f) < 0 || w32.a(0.0f, 0.0f) < 0) {
            ji3.a("Layer outsets must be non-negative");
        }
        a = d04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d04) && w32.b(0.0f, 0.0f) && w32.b(0.0f, 0.0f) && w32.b(0.0f, 0.0f) && w32.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + e41.e(0.0f, e41.e(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        String strC = w32.c(0.0f);
        String strC2 = w32.c(0.0f);
        return e41.m(e41.o("LayerOutsets(left=", strC, ", top=", strC2, ", right="), w32.c(0.0f), ", bottom=", w32.c(0.0f), ")");
    }
}
