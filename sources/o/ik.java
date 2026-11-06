package o;

/* JADX INFO: loaded from: classes.dex */
public final class ik {
    public boolean a;
    public long b;

    public long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }
}
