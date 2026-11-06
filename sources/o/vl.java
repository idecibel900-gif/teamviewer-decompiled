package o;

/* JADX INFO: loaded from: classes.dex */
public final class vl extends og7 implements hw2 {
    public byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xl f2324o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(boolean z, xl xlVar, long j, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = z;
        this.f2324o = xlVar;
        this.p = j;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new vl(this.n, this.f2324o, this.p, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((vl) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        if (b == 0) {
            ct1.a0(obj);
            x15 x15Var = this.f2324o.m;
            ne1 ne1Var = ne1.m;
            if (this.n) {
                this.m = (byte) 2;
                Object objA = x15Var.a(this.p, 0L, this);
                if (objA != ne1Var) {
                    obj = objA;
                    long j = ((nc8) obj).a;
                }
            } else {
                this.m = (byte) 1;
                Object objA2 = x15Var.a(0L, this.p, this);
                if (objA2 != ne1Var) {
                    obj = objA2;
                    long j2 = ((nc8) obj).a;
                }
            }
            return ne1Var;
        }
        if (b == 1) {
            ct1.a0(obj);
            long j3 = ((nc8) obj).a;
        } else {
            if (b != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            long j4 = ((nc8) obj).a;
        }
        return f88.a;
    }
}
