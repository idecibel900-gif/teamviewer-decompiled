package o;

/* JADX INFO: loaded from: classes2.dex */
public final class vn extends yz3 implements hw2 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2330o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ bc2 q;
    public final /* synthetic */ hf2 r;
    public final /* synthetic */ String s;
    public final /* synthetic */ yy0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn(boolean z, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, String str, yy0 yy0Var, int i, byte b) {
        super(2);
        this.n = b;
        this.f2330o = z;
        this.p = fs4Var;
        this.q = bc2Var;
        this.r = hf2Var;
        this.s = str;
        this.t = yy0Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.n;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iY = yo1.Y(200065);
                vn4.G(this.f2330o, this.p, this.q, this.r, this.s, this.t, (ux2) obj, iY);
                break;
            default:
                ((Number) obj2).intValue();
                int iY2 = yo1.Y(1572871);
                vn4.I(this.f2330o, this.p, this.q, this.r, this.s, this.t, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }
}
