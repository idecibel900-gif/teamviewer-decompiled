package o;

/* JADX INFO: loaded from: classes.dex */
public final class eh3 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public boolean i;

    public eh3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
    }

    public final String toString() {
        return "IndirectPointerInputChange(id=" + vs1.W(this.a) + ", uptimeMillis=" + this.b + ", position=" + t65.g(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + t65.g(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + this.i + ")";
    }
}
