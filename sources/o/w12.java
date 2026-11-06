package o;

/* JADX INFO: loaded from: classes.dex */
public final class w12 implements AutoCloseable {
    public final v12 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y12 f2363o;

    public w12(y12 y12Var, v12 v12Var) {
        this.f2363o = y12Var;
        this.m = v12Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        y12 y12Var = this.f2363o;
        synchronized (y12Var.t) {
            v12 v12Var = this.m;
            int i = v12Var.h - 1;
            v12Var.h = i;
            if (i == 0 && v12Var.f) {
                y12Var.b0(v12Var);
            }
        }
    }
}
