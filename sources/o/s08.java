package o;

/* JADX INFO: loaded from: classes.dex */
public final class s08 {
    public final long a;
    public final long b;
    public final boolean c;

    public s08(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final s08 a(s08 s08Var) {
        return new s08(t65.e(this.a, s08Var.a), Math.max(this.b, s08Var.b), this.c || s08Var.c);
    }
}
