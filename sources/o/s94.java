package o;

/* JADX INFO: loaded from: classes.dex */
public final class s94 implements hs2 {
    public final float a;

    public s94(float f) {
        this.a = f;
    }

    @Override // o.hs2
    public final float a(float f) {
        return f / this.a;
    }

    @Override // o.hs2
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s94) && Float.compare(this.a, ((s94) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ")";
    }
}
