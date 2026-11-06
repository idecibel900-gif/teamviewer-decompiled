package o;

/* JADX INFO: loaded from: classes2.dex */
public final class bn3 extends jp3 {
    public static final /* synthetic */ long r = defpackage.a.a.objectFieldOffset(bn3.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;
    public final ew1 q;

    public bn3(ew1 ew1Var) {
        this.q = ew1Var;
    }

    @Override // o.jp3
    public final boolean m() {
        return true;
    }

    @Override // o.jp3
    public final void n(Throwable th) {
        if (defpackage.a.a.compareAndSwapInt(this, r, 0, 1)) {
            this.q.invoke(th);
        }
    }
}
