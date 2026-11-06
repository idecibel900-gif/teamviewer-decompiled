package o;

/* JADX INFO: loaded from: classes.dex */
public final class m05 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public m05(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m05.class == obj.getClass()) {
            m05 m05Var = (m05) obj;
            return this.c == m05Var.c && this.d == m05Var.d && this.b == m05Var.b && this.a == m05Var.a && this.e == m05Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + fx3.a(this.a, e41.e(this.b, e41.e(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
