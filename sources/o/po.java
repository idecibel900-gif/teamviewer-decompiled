package o;

/* JADX INFO: loaded from: classes.dex */
public final class po extends qo {
    public float a;
    public float b;
    public float c;
    public float d;

    public po(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // o.qo
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // o.qo
    public final int b() {
        return 4;
    }

    @Override // o.qo
    public final qo c() {
        return new po(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // o.qo
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // o.qo
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof po)) {
            return false;
        }
        po poVar = (po) obj;
        return poVar.a == this.a && poVar.b == this.b && poVar.c == this.c && poVar.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + e41.e(this.c, e41.e(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sbN = e41.n("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbN.append(f3);
        sbN.append(", v4 = ");
        sbN.append(f4);
        return sbN.toString();
    }
}
