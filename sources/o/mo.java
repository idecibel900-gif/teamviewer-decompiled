package o;

/* JADX INFO: loaded from: classes.dex */
public final class mo extends qo {
    public float a;

    public mo(float f) {
        this.a = f;
    }

    @Override // o.qo
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // o.qo
    public final void d() {
        this.a = 0.0f;
    }

    @Override // o.qo
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mo) && ((mo) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
