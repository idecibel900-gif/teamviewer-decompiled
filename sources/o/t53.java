package o;

/* JADX INFO: loaded from: classes.dex */
public final class t53 {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public t53(long j, long j2, float f, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = j4;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + t65.g(this.b) + ", scaleFactor=" + this.c + ", panOffset=" + t65.g(this.d) + ")";
    }
}
