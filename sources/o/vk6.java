package o;

/* JADX INFO: loaded from: classes.dex */
public final class vk6 extends og7 implements hw2 {
    public yk6 m;
    public j76 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2323o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ yk6 r;
    public final /* synthetic */ j76 s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk6(yk6 yk6Var, j76 j76Var, long j, hc1 hc1Var) {
        super(2, hc1Var);
        this.r = yk6Var;
        this.s = j76Var;
        this.t = j;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        vk6 vk6Var = new vk6(this.r, this.s, this.t, hc1Var);
        vk6Var.q = obj;
        return vk6Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((vk6) create((wk6) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        yk6 yk6Var;
        j76 j76Var;
        yk6 yk6Var2;
        long j;
        boolean z = this.p;
        byte b = 2;
        gb5 gb5Var = gb5.n;
        if (!z) {
            ct1.a0(obj);
            wk6 wk6Var = (wk6) this.q;
            yk6Var = this.r;
            df dfVar = new df(yk6Var, wk6Var, b);
            ym2 ym2Var = yk6Var.c;
            j76 j76Var2 = this.s;
            long j2 = j76Var2.m;
            gb5 gb5Var2 = yk6Var.d;
            long j3 = this.t;
            float fE = yk6Var.e(gb5Var2 == gb5Var ? nc8.b(j3) : nc8.c(j3));
            this.q = yk6Var;
            this.m = yk6Var;
            this.n = j76Var2;
            this.f2323o = j2;
            this.p = true;
            obj = ym2Var.a(dfVar, fE, this);
            ne1 ne1Var = ne1.m;
            if (obj == ne1Var) {
                return ne1Var;
            }
            j76Var = j76Var2;
            yk6Var2 = yk6Var;
            j = j2;
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f2323o;
            j76Var = this.n;
            yk6Var = this.m;
            yk6Var2 = (yk6) this.q;
            ct1.a0(obj);
        }
        float fE2 = yk6Var2.e(((Number) obj).floatValue());
        j76Var.m = yk6Var.d == gb5Var ? nc8.a(j, fE2, 0.0f, 2) : nc8.a(j, 0.0f, fE2, 1);
        return f88.a;
    }
}
