package o;

/* JADX INFO: loaded from: classes.dex */
public final class co6 {
    public final float a;
    public final float b;

    public co6(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof co6)) {
            return false;
        }
        return w32.b(0.0f, 0.0f) && w32.b(0.0f, 0.0f) && w32.b(0.0f, 0.0f) && w32.b(this.a, ((co6) obj).a) && w32.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + e41.e(this.a, e41.e(0.0f, e41.e(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}
