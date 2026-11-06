package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ca0 implements ym2 {
    public final /* synthetic */ ee8 a;
    public final /* synthetic */ xy6 b;
    public final /* synthetic */ in1 c;
    public final /* synthetic */ h47 d;
    public final /* synthetic */ Function0 e;

    public ca0(ee8 ee8Var, xy6 xy6Var, in1 in1Var, h47 h47Var, Function0 function0) {
        this.a = ee8Var;
        this.b = xy6Var;
        this.c = in1Var;
        this.d = h47Var;
        this.e = function0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // o.ym2
    public final Object a(dk6 dk6Var, float f, hc1 hc1Var) {
        ba0 ba0Var;
        xy6 xy6Var = this.b;
        nf nfVar = xy6Var.g;
        if (hc1Var instanceof ba0) {
            ba0Var = (ba0) hc1Var;
            int i = ba0Var.f410o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ba0Var.f410o = i - Integer.MIN_VALUE;
            } else {
                ba0Var = new ba0(this, (jc1) hc1Var);
            }
        } else {
            ba0Var = new ba0(this, (jc1) hc1Var);
        }
        Object objA = ba0Var.m;
        int i2 = ba0Var.f410o;
        Function0 function0 = this.e;
        try {
            if (i2 == 0) {
                ct1.a0(objA);
                float fE = this.a.e();
                float fU = ct1.u(f, -fE, fE);
                if (fU > 0.0f) {
                    uj1 uj1VarE = nfVar.e();
                    yy6 yy6Var = yy6.m;
                    if (uj1VarE.c(yy6Var)) {
                        float fMax = Math.max(0.0f, nfVar.e().f(yy6Var) - nfVar.j());
                        float f2 = p90.e;
                        in1 in1Var = this.c;
                        float fD0 = in1Var.d0(f2);
                        if (fMax < fD0) {
                            float f3 = fMax / fD0;
                            fU *= f3 * f3;
                            float fD1 = in1Var.d0(p90.d);
                            if (f >= fD1) {
                                fU = Math.max(fU, fD1);
                            }
                        }
                    }
                }
                h47 h47Var = this.d;
                ba0Var.f410o = 1;
                objA = h47Var.a(dk6Var, fU, ba0Var);
                ne1 ne1Var = ne1.m;
                if (objA == ne1Var) {
                    return ne1Var;
                }
            } else {
                if (i2 != 1) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(objA);
            }
            float fFloatValue = ((Number) objA).floatValue();
            if (!xy6Var.e()) {
                function0.a();
            }
            return new Float(fFloatValue);
        } catch (Throwable th) {
            if (!xy6Var.e()) {
                function0.a();
            }
            throw th;
        }
    }
}
