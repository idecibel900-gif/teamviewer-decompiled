package o;

/* JADX INFO: loaded from: classes.dex */
public final class rh3 implements i97 {
    public Float m;
    public Float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bg5 f1923o;
    public wn7 p;
    public boolean q;
    public boolean r;
    public long s;
    public final /* synthetic */ th3 t;

    public rh3(th3 th3Var, Float f, Float f2, qh3 qh3Var) {
        yn1 yn1Var = vn4.j0;
        this.t = th3Var;
        this.m = f;
        this.n = f2;
        this.f1923o = h57.p(f);
        this.p = new wn7(qh3Var, yn1Var, this.m, this.n, null);
    }

    @Override // o.i97
    public final Object getValue() {
        return this.f1923o.getValue();
    }
}
