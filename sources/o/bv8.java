package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bv8 implements wx8, d85, x75, s75 {
    public final /* synthetic */ byte m;
    public final Executor n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f461o;
    public final Object p;

    public bv8(Executor executor, s75 s75Var) {
        this.m = (byte) 0;
        this.f461o = new Object();
        this.n = executor;
        this.p = s75Var;
    }

    @Override // o.wx8
    public final void a(bo7 bo7Var) {
        switch (this.m) {
            case 0:
                if (((hy8) bo7Var).d) {
                    synchronized (this.f461o) {
                        break;
                    }
                    this.n.execute(new mt8((Object) this, (byte) 29));
                    return;
                }
                return;
            case 1:
                synchronized (this.f461o) {
                    break;
                }
                this.n.execute(new st8((wx8) this, bo7Var, (byte) 1));
                return;
            case 2:
                if (bo7Var.k() || ((hy8) bo7Var).d) {
                    return;
                }
                synchronized (this.f461o) {
                    break;
                }
                this.n.execute(new st8((wx8) this, bo7Var, (byte) 2));
                return;
            case 3:
                if (bo7Var.k()) {
                    synchronized (this.f461o) {
                        break;
                    }
                    this.n.execute(new st8((wx8) this, bo7Var, (byte) 4));
                    return;
                }
                return;
            default:
                this.n.execute(new st8((wx8) this, bo7Var, (byte) 6));
                return;
        }
    }

    @Override // o.s75
    public void onCanceled() {
        ((hy8) this.p).o();
    }

    @Override // o.x75
    public void onFailure(Exception exc) {
        ((hy8) this.p).n(exc);
    }

    @Override // o.d85
    public void onSuccess(Object obj) {
        ((hy8) this.p).m(obj);
    }

    public bv8(Executor executor, t75 t75Var) {
        this.m = (byte) 1;
        this.f461o = new Object();
        this.n = executor;
        this.p = t75Var;
    }

    public bv8(Executor executor, x75 x75Var) {
        this.m = (byte) 2;
        this.f461o = new Object();
        this.n = executor;
        this.p = x75Var;
    }

    public bv8(Executor executor, d85 d85Var) {
        this.m = (byte) 3;
        this.f461o = new Object();
        this.n = executor;
        this.p = d85Var;
    }

    public bv8(Executor executor, le7 le7Var, hy8 hy8Var) {
        this.m = (byte) 4;
        this.n = executor;
        this.f461o = le7Var;
        this.p = hy8Var;
    }
}
