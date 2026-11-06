package o;

/* JADX INFO: loaded from: classes2.dex */
public final class w88 extends nc6 implements q67 {
    public final jo4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f2387o;

    public w88(jo4 jo4Var, long j) {
        this.n = jo4Var;
        this.f2387o = j;
    }

    @Override // o.nc6
    public final of0 E0() {
        return new w36(this);
    }

    @Override // o.nc6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.q67, o.v07
    public final ov7 i() {
        return ov7.d;
    }

    @Override // o.q67
    public final long i0(bf0 bf0Var, long j) {
        bf0Var.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // o.nc6
    public final long j() {
        return this.f2387o;
    }

    @Override // o.nc6
    public final jo4 q() {
        return this.n;
    }
}
