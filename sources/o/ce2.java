package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ce2 extends ee2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final gl0 f518o;
    public final /* synthetic */ ge2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce2(ge2 ge2Var, long j, gl0 gl0Var) {
        super(j);
        this.p = ge2Var;
        this.f518o = gl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f518o.D(this.p);
    }

    @Override // o.ee2
    public final String toString() {
        return super.toString() + this.f518o;
    }
}
