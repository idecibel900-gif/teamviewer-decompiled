package o;

/* JADX INFO: loaded from: classes2.dex */
public final class qq0 extends jp3 implements pq0 {
    public final op3 q;

    public qq0(op3 op3Var) {
        this.q = op3Var;
    }

    @Override // o.pq0
    public final boolean b(Throwable th) {
        return l().v(th);
    }

    @Override // o.pq0
    public final bp3 getParent() {
        return l();
    }

    @Override // o.jp3
    public final boolean m() {
        return true;
    }

    @Override // o.jp3
    public final void n(Throwable th) {
        this.q.i(l());
    }
}
