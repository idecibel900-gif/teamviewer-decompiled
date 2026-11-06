package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class e47 extends og7 implements hw2 {
    public h76 m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h47 f679o;
    public final /* synthetic */ float p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ dk6 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e47(h47 h47Var, float f, Function1 function1, dk6 dk6Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.f679o = h47Var;
        this.p = f;
        this.q = function1;
        this.r = dk6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new e47(this.f679o, this.p, this.q, this.r, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((e47) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [o.d47] */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        final h76 h76Var;
        Object objD;
        h47 h47Var;
        Object objB;
        byte b = this.n;
        final byte b2 = 0;
        final byte b3 = 1;
        final Function1 function1 = this.q;
        h47 h47Var2 = this.f679o;
        ne1 ne1Var = ne1.m;
        if (b == 0) {
            ct1.a0(obj);
            ei1 ei1Var = uf0.n;
            float f = this.p;
            xk0.k(ei1Var, 0.0f, f);
            if (Float.isNaN(0.0f)) {
                ni3.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            h76Var = new h76();
            float fSignum = Math.signum(f) * Math.abs(0.0f);
            h76Var.m = fSignum;
            function1.invoke(new Float(fSignum));
            float f2 = h76Var.m;
            ?? r4 = new Function1() { // from class: o.d47
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b4 = b2;
                    f88 f88Var = f88.a;
                    Function1 function2 = function1;
                    h76 h76Var2 = h76Var;
                    float fFloatValue = ((Float) obj2).floatValue();
                    switch (b4) {
                        case 0:
                            float f3 = h76Var2.m - fFloatValue;
                            h76Var2.m = f3;
                            function2.invoke(Float.valueOf(f3));
                            break;
                        default:
                            float f4 = h76Var2.m - fFloatValue;
                            h76Var2.m = f4;
                            function2.invoke(Float.valueOf(f4));
                            break;
                    }
                    return f88Var;
                }
            };
            this.m = h76Var;
            this.n = (byte) 1;
            h47 h47Var3 = h47Var2;
            objD = h47Var3.d(this.r, f2, this.p, r4, this);
            h47Var = h47Var3;
            if (objD != ne1Var) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                ct1.a0(obj);
                return obj;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        h76 h76Var2 = this.m;
        ct1.a0(obj);
        h76Var = h76Var2;
        h47Var = h47Var2;
        objD = obj;
        ko koVar = (ko) objD;
        iu iuVar = h47Var.a;
        float fFloatValue = ((Number) koVar.a()).floatValue();
        nf nfVar = (nf) iuVar.f1103o;
        float fJ = nfVar.j();
        uj1 uj1VarE = nfVar.e();
        Function1 function2 = (Function1) iuVar.p;
        y yVar = (y) iuVar.n;
        if (Float.isNaN(fJ)) {
            hk0.g("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(fFloatValue) > 0.0f;
        boolean z2 = z && fFloatValue > 0.0f;
        if (!z) {
            objB = uj1VarE.a(fJ);
            objB.getClass();
        } else if (Math.abs(fFloatValue) >= Math.abs(((Number) yVar.a()).floatValue())) {
            objB = uj1VarE.b(fJ, z2);
            objB.getClass();
        } else {
            objB = uj1VarE.b(fJ, false);
            objB.getClass();
            float f3 = uj1VarE.f(objB);
            Object objB2 = uj1VarE.b(fJ, true);
            objB2.getClass();
            float f4 = uj1VarE.f(objB2);
            float fAbs = Math.abs(((Number) function2.invoke(Float.valueOf(Math.abs(f3 - f4)))).floatValue());
            if (!z2) {
                f3 = f4;
            }
            boolean z3 = Math.abs(f3 - fJ) >= fAbs;
            if (z3) {
                if (z2) {
                    objB = objB2;
                }
            } else {
                if (z3) {
                    gk0.s();
                    return null;
                }
                if (!z2) {
                    objB = objB2;
                }
            }
        }
        if (!((Boolean) ((Function1) nfVar.b).invoke(objB)).booleanValue()) {
            objB = ((bg5) nfVar.e).getValue();
        }
        float f5 = nfVar.e().f(objB) - fJ;
        if (Float.isNaN(f5)) {
            ni3.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        h76Var.m = f5;
        ko koVarN = pm8.n(koVar, 0.0f, 0.0f, 30);
        jo joVar = h47Var.b;
        Function1 function3 = new Function1() { // from class: o.d47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                byte b4 = b3;
                f88 f88Var = f88.a;
                Function1 function4 = function1;
                h76 h76Var3 = h76Var;
                float fFloatValue2 = ((Float) obj2).floatValue();
                switch (b4) {
                    case 0:
                        float f6 = h76Var3.m - fFloatValue2;
                        h76Var3.m = f6;
                        function4.invoke(Float.valueOf(f6));
                        break;
                    default:
                        float f7 = h76Var3.m - fFloatValue2;
                        h76Var3.m = f7;
                        function4.invoke(Float.valueOf(f7));
                        break;
                }
                return f88Var;
            }
        };
        this.m = null;
        this.n = (byte) 2;
        Object objJ = l47.j(this.r, f5, f5, koVarN, joVar, function3, this);
        return objJ == ne1Var ? ne1Var : objJ;
    }
}
