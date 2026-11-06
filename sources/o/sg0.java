package o;

/* JADX INFO: loaded from: classes.dex */
public final class sg0 {
    public final float a;

    public sg0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sg0)) {
            return false;
        }
        return w32.b(0.0f, 0.0f) && w32.b(0.0f, 0.0f) && w32.b(0.0f, 0.0f) && w32.b(this.a, ((sg0) obj).a) && w32.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + e41.e(this.a, e41.e(0.0f, e41.e(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}
