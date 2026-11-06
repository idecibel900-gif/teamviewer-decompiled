package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gh4 extends og7 implements Function1 {
    public boolean m;
    public final /* synthetic */ kh4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f893o;
    public final /* synthetic */ int p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ float r;
    public final /* synthetic */ qh4 s;
    public final /* synthetic */ float t;
    public final /* synthetic */ ph4 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh4(kh4 kh4Var, int i, int i2, boolean z, float f, qh4 qh4Var, float f2, ph4 ph4Var, hc1 hc1Var) {
        super(1, hc1Var);
        this.n = kh4Var;
        this.f893o = i;
        this.p = i2;
        this.q = z;
        this.r = f;
        this.s = qh4Var;
        this.t = f2;
        this.u = ph4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f = this.t;
        ph4 ph4Var = this.u;
        return new gh4(this.n, this.f893o, this.p, this.q, this.r, this.s, f, ph4Var, (hc1) obj).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        de1 de1Var;
        boolean z = this.m;
        f88 f88Var = f88.a;
        kh4 kh4Var = this.n;
        try {
            if (!z) {
                ct1.a0(obj);
                kh4Var.d(this.f893o);
                bg5 bg5Var = kh4Var.f1266o;
                int i = this.p;
                bg5Var.setValue(Integer.valueOf(i));
                kh4Var.p.setValue(Boolean.valueOf(this.q));
                bg5 bg5Var2 = kh4Var.r;
                float f = this.r;
                bg5Var2.setValue(Float.valueOf(f));
                kh4Var.q.setValue(null);
                bg5 bg5Var3 = kh4Var.u;
                qh4 qh4Var = this.s;
                bg5Var3.setValue(qh4Var);
                kh4Var.g(this.t);
                kh4Var.s.setValue(Boolean.FALSE);
                kh4Var.x.setValue(Long.MIN_VALUE);
                if (qh4Var == null) {
                    kh4Var.f(false);
                    return f88Var;
                }
                if (Float.isInfinite(f)) {
                    kh4Var.g(((Number) kh4Var.y.getValue()).floatValue());
                    kh4Var.f(false);
                    kh4Var.d(i);
                    return f88Var;
                }
                kh4Var.f(true);
                int iOrdinal = this.u.ordinal();
                if (iOrdinal == 0) {
                    de1Var = ba2.m;
                } else {
                    if (iOrdinal != 1) {
                        throw new w35();
                    }
                    de1Var = q45.n;
                }
                fh4 fh4Var = new fh4(this.u, ds1.J(getContext()), this.p, this.f893o, this.n, null);
                this.m = true;
                Object objJ0 = im3.j0(de1Var, fh4Var, this);
                ne1 ne1Var = ne1.m;
                if (objJ0 == ne1Var) {
                    return ne1Var;
                }
            } else {
                if (!z) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
            }
            ds1.H(getContext());
            kh4Var.f(false);
            return f88Var;
        } catch (Throwable th) {
            kh4Var.f(false);
            throw th;
        }
    }
}
