package o;

/* JADX INFO: loaded from: classes.dex */
public final class oo extends qo {
    public float a;
    public float b;
    public float c;

    public oo(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // o.qo
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // o.qo
    public final int b() {
        return 3;
    }

    @Override // o.qo
    public final qo c() {
        return new oo(0.0f, 0.0f, 0.0f);
    }

    @Override // o.qo
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // o.qo
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oo)) {
            return false;
        }
        oo ooVar = (oo) obj;
        return ooVar.a == this.a && ooVar.b == this.b && ooVar.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + e41.e(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder sbN = e41.n("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbN.append(f3);
        return sbN.toString();
    }
}
