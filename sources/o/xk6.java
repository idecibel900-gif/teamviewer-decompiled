package o;

/* JADX INFO: loaded from: classes.dex */
public final class xk6 extends og7 implements hw2 {
    public long m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ long f2527o;
    public final /* synthetic */ yk6 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk6(yk6 yk6Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = yk6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        xk6 xk6Var = new xk6(this.p, hc1Var);
        xk6Var.f2527o = ((nc8) obj).a;
        return xk6Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((nc8) obj).a;
        xk6 xk6Var = new xk6(this.p, (hc1) obj2);
        xk6Var.f2527o = j;
        return xk6Var.invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        byte b = this.n;
        yk6 yk6Var = this.p;
        ne1 ne1Var = ne1.m;
        if (b == 0) {
            ct1.a0(obj);
            j = this.f2527o;
            x15 x15Var = yk6Var.f;
            this.f2527o = j;
            this.n = (byte) 1;
            obj = x15Var.b(j, this);
            if (obj != ne1Var) {
            }
            return ne1Var;
        }
        if (b == 1) {
            j = this.f2527o;
            ct1.a0(obj);
        } else {
            if (b == 2) {
                j2 = this.m;
                j = this.f2527o;
                ct1.a0(obj);
                j3 = ((nc8) obj).a;
                x15 x15Var2 = yk6Var.f;
                long jD = nc8.d(j2, j3);
                this.f2527o = j;
                this.m = j3;
                this.n = (byte) 3;
                obj = x15Var2.a(jD, j3, this);
                if (obj != ne1Var) {
                    j4 = j;
                    j5 = j3;
                }
                return ne1Var;
            }
            if (b != 3) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.m;
            j4 = this.f2527o;
            ct1.a0(obj);
        }
        return new nc8(nc8.d(j4, nc8.d(j5, ((nc8) obj).a)));
        long jD2 = nc8.d(j, ((nc8) obj).a);
        this.f2527o = j;
        this.m = jD2;
        this.n = (byte) 2;
        obj = yk6Var.a(jD2, this);
        if (obj != ne1Var) {
            j2 = jD2;
            j3 = ((nc8) obj).a;
            x15 x15Var3 = yk6Var.f;
            long jD3 = nc8.d(j2, j3);
            this.f2527o = j;
            this.m = j3;
            this.n = (byte) 3;
            obj = x15Var3.a(jD3, j3, this);
            if (obj != ne1Var) {
                j4 = j;
                j5 = j3;
                return new nc8(nc8.d(j4, nc8.d(j5, ((nc8) obj).a)));
            }
        }
        return ne1Var;
    }
}
