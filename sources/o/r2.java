package o;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends og7 implements hw2 {
    public boolean m;
    public final /* synthetic */ sk6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f1883o;
    public final /* synthetic */ float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(sk6 sk6Var, float f, float f2, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = sk6Var;
        this.f1883o = f;
        this.p = f2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new r2(this.n, this.f1883o, this.p, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((r2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.m;
        if (!z) {
            ct1.a0(obj);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f1883o)) << 32) | (((long) Float.floatToRawIntBits(this.p)) & 4294967295L);
            this.m = true;
            Object objB = ok6.b(this.n.d0, jFloatToRawIntBits, this);
            ne1 ne1Var = ne1.m;
            if (objB == ne1Var) {
                return ne1Var;
            }
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
        }
        return f88.a;
    }
}
