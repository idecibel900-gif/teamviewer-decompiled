package o;

/* JADX INFO: loaded from: classes2.dex */
public final class wn extends yz3 implements hw2 {
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f2431o;
    public final /* synthetic */ bc2 p;
    public final /* synthetic */ hf2 q;
    public final /* synthetic */ String r;
    public final /* synthetic */ yy0 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ byte u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wn(boolean z, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, String str, yy0 yy0Var, int i, int i2) {
        super(2);
        this.n = z;
        this.f2431o = fs4Var;
        this.p = bc2Var;
        this.q = hf2Var;
        this.r = str;
        this.s = yy0Var;
        this.t = i;
        this.u = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        vn4.H(this.n, this.f2431o, this.p, this.q, this.r, this.s, (ux2) obj, yo1.Y(this.t | 1), this.u);
        return f88.a;
    }
}
