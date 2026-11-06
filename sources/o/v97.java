package o;

/* JADX INFO: loaded from: classes.dex */
public final class v97 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public v97(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public static v97 a(v97 v97Var, float f, float f2, float f3, float f4, float f5, int i) {
        if ((i & 1) != 0) {
            f = v97Var.a;
        }
        float f6 = f;
        if ((i & 2) != 0) {
            f2 = v97Var.b;
        }
        float f7 = f2;
        if ((i & 4) != 0) {
            f3 = v97Var.c;
        }
        float f8 = f3;
        if ((i & 8) != 0) {
            f4 = v97Var.d;
        }
        float f9 = f4;
        if ((i & 16) != 0) {
            f5 = v97Var.e;
        }
        return new v97(f6, f7, f8, f9, f5);
    }

    public final v97 b(float f, float f2) {
        return a(this, 0.0f, 0.0f, 0.0f, f, f2, 7);
    }

    public final v97 c(float f) {
        return a(this, f, f, f, 0.0f, 0.0f, 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v97)) {
            return false;
        }
        v97 v97Var = (v97) obj;
        return Float.compare(this.a, v97Var.a) == 0 && Float.compare(this.b, v97Var.b) == 0 && Float.compare(this.c, v97Var.c) == 0 && Float.compare(this.d, v97Var.d) == 0 && Float.compare(this.e, v97Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + e41.e(this.d, e41.e(this.c, e41.e(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = e41.n("StateZoom(zoom=", this.a, ", zoomX=", this.b, ", zoomY=");
        sbN.append(this.c);
        sbN.append(", panX=");
        sbN.append(this.d);
        sbN.append(", panY=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }

    public /* synthetic */ v97() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    }
}
