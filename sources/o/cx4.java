package o;

/* JADX INFO: loaded from: classes2.dex */
public final class cx4 extends rc6 implements hw2 {
    public ry2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public dx4 f563o;
    public long[] p;
    public int q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ dx4 t;
    public final /* synthetic */ ry2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx4(dx4 dx4Var, ry2 ry2Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.t = dx4Var;
        this.u = ry2Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        cx4 cx4Var = new cx4(this.t, this.u, hc1Var);
        cx4Var.s = obj;
        return cx4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((cx4) create((aq6) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        aq6 aq6Var;
        dx4 dx4Var;
        long[] jArr;
        int i;
        ry2 ry2Var;
        boolean z = this.r;
        if (!z) {
            ct1.a0(obj);
            aq6Var = (aq6) this.s;
            dx4Var = this.t;
            bx4 bx4Var = dx4Var.n;
            jArr = bx4Var.c;
            i = bx4Var.e;
            ry2Var = this.u;
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.q;
            jArr = this.p;
            dx4Var = this.f563o;
            ry2Var = this.n;
            aq6Var = (aq6) this.s;
            ct1.a0(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return f88.a;
        }
        int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
        ry2Var.n = i;
        Object obj2 = dx4Var.n.b[i];
        this.s = aq6Var;
        this.n = ry2Var;
        this.f563o = dx4Var;
        this.p = jArr;
        this.q = i2;
        this.r = true;
        aq6Var.b(obj2, this);
        return ne1.m;
    }
}
