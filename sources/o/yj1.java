package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class yj1 extends og7 implements hw2 {
    public h76 m;
    public ko n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2613o;
    public final /* synthetic */ float p;
    public final /* synthetic */ zj1 q;
    public final /* synthetic */ dk6 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj1(float f, zj1 zj1Var, dk6 dk6Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = f;
        this.q = zj1Var;
        this.r = dk6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new yj1(this.p, this.q, this.r, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((yj1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        float f;
        h76 h76Var;
        ko koVar;
        boolean z = this.f2613o;
        if (!z) {
            ct1.a0(obj);
            f = this.p;
            if (Math.abs(f) > 1.0f) {
                h76 h76Var2 = new h76();
                h76Var2.m = f;
                h76 h76Var3 = new h76();
                ko koVarB = pm8.b(0.0f, f, 28);
                try {
                    zj1 zj1Var = this.q;
                    ei1 ei1Var = zj1Var.a;
                    m5 m5Var = new m5(h76Var3, this.r, h76Var2, zj1Var);
                    this.m = h76Var2;
                    this.n = koVarB;
                    this.f2613o = true;
                    Object objE = i67.e(koVarB, ei1Var, false, m5Var, this);
                    ne1 ne1Var = ne1.m;
                    if (objE == ne1Var) {
                        return ne1Var;
                    }
                    h76Var = h76Var2;
                    f = h76Var.m;
                } catch (CancellationException unused) {
                    h76Var = h76Var2;
                    koVar = koVarB;
                    h76Var.m = ((Number) koVar.a()).floatValue();
                }
            }
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            koVar = this.n;
            h76Var = this.m;
            try {
                ct1.a0(obj);
            } catch (CancellationException unused2) {
                h76Var.m = ((Number) koVar.a()).floatValue();
            }
            f = h76Var.m;
        }
        return new Float(f);
    }
}
