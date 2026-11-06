package o;

/* JADX INFO: loaded from: classes2.dex */
public final class de2 extends ee2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f613o;

    public de2(Runnable runnable, long j) {
        super(j);
        this.f613o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f613o.run();
    }

    @Override // o.ee2
    public final String toString() {
        return super.toString() + this.f613o;
    }
}
