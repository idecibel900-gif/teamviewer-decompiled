package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bt8 implements wx8, d85, x75, s75 {
    public final /* synthetic */ byte m;
    public final Executor n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ic1 f456o;
    public final hy8 p;

    public /* synthetic */ bt8(Executor executor, ic1 ic1Var, hy8 hy8Var, byte b) {
        this.m = b;
        this.n = executor;
        this.f456o = ic1Var;
        this.p = hy8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wx8
    public final void a(bo7 bo7Var) {
        byte b = this.m;
        Executor executor = this.n;
        byte b2 = 0;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                executor.execute(new it8((byte) 29, this, bo7Var, objArr == true ? 1 : 0));
                break;
            default:
                executor.execute(new st8((wx8) this, bo7Var, b2));
                break;
        }
    }

    @Override // o.s75
    public void onCanceled() {
        this.p.o();
    }

    @Override // o.x75
    public void onFailure(Exception exc) {
        this.p.n(exc);
    }

    @Override // o.d85
    public void onSuccess(Object obj) {
        this.p.m(obj);
    }
}
