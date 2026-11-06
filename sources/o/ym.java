package o;

/* JADX INFO: loaded from: classes.dex */
public final class ym extends og7 implements hw2 {
    public byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kh4 f2621o;
    public final /* synthetic */ qh4 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ float s;
    public final /* synthetic */ px4 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(boolean z, kh4 kh4Var, qh4 qh4Var, int i, boolean z2, float f, px4 px4Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = z;
        this.f2621o = kh4Var;
        this.p = qh4Var;
        this.q = i;
        this.r = z2;
        this.s = f;
        this.t = px4Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new ym(this.n, this.f2621o, this.p, this.q, this.r, this.s, this.t, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((ym) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        kh4 kh4Var = this.f2621o;
        px4 px4Var = this.t;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        if (b == 0) {
            ct1.a0(obj);
            if (!((Boolean) px4Var.getValue()).booleanValue() && this.n) {
                this.m = (byte) 1;
                qh4 qh4Var = (qh4) kh4Var.u.getValue();
                if (kh4Var.q.getValue() != null) {
                    io.sentry.h2.f();
                    return null;
                }
                float fFloatValue = ((Number) kh4Var.r.getValue()).floatValue();
                float f = 0.0f;
                if ((fFloatValue < 0.0f && qh4Var == null) || (qh4Var != null && fFloatValue < 0.0f)) {
                    f = 1.0f;
                }
                float f2 = f;
                Object objA = iy4.a(kh4Var.z, new jh4(kh4Var, (qh4) kh4Var.u.getValue(), f2, !(f2 == ((Number) kh4Var.w.getValue()).floatValue()), null), this);
                if (objA != ne1Var) {
                    objA = f88Var;
                }
                if (objA != ne1Var) {
                    objA = f88Var;
                }
                if (objA != ne1Var) {
                }
            }
        }
        if (b != 1) {
            if (b == 2) {
                ct1.a0(obj);
                return f88Var;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        px4Var.setValue(Boolean.TRUE);
        float fFloatValue2 = ((Number) kh4Var.w.getValue()).floatValue();
        this.m = (byte) 2;
        Object objA2 = iy4.a(kh4Var.z, new gh4(kh4Var, kh4Var.a(), this.q, this.r, this.s, this.p, fFloatValue2, ph4.m, null), this);
        if (objA2 != ne1Var) {
            objA2 = f88Var;
        }
        return objA2 == ne1Var ? ne1Var : f88Var;
    }
}
