package o;

/* JADX INFO: loaded from: classes2.dex */
public final class fo7 extends zn7 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f818o;

    public fo7(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f818o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f818o.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f818o;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(di1.r(runnable));
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
