package o;

/* JADX INFO: loaded from: classes.dex */
public final class p10 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public p10(m05 m05Var) {
        m05Var.getClass();
        float f = m05Var.c;
        float f2 = m05Var.d;
        float f3 = m05Var.b;
        int i = m05Var.a;
        long j = m05Var.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
