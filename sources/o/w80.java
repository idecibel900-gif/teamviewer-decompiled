package o;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w80 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2386o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Serializable q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ w80(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, byte b) {
        this.m = b;
        this.n = obj;
        this.f2386o = obj2;
        this.p = obj3;
        this.q = serializable;
        this.r = obj4;
        this.s = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Serializable serializable = this.q;
        Object obj4 = this.p;
        Object obj5 = this.f2386o;
        Object obj6 = this.n;
        switch (b) {
            case 0:
                lf6 lf6Var = (lf6) obj5;
                h76 h76Var = (h76) obj4;
                k76 k76Var = (k76) serializable;
                rj rjVar = (rj) obj3;
                sb0 sb0Var = (sb0) obj2;
                u52 u52Var = (u52) obj;
                uc7 uc7Var = (uc7) ((yc4) obj6).n;
                uc7Var.getClass();
                float fFloatValue = Float.valueOf(uc7Var.m).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                boolean z = 2.0f * fFloatValue > Math.min(Math.abs(lf6Var.b()), Math.abs(lf6Var.a()));
                if (h76Var.m != fFloatValue) {
                    rjVar.g();
                    rj.c(rjVar, lf6Var);
                    if (!z) {
                        rj rjVarA = tj.a();
                        rj.c(rjVarA, new lf6(lf6Var.a + fFloatValue, lf6Var.b + fFloatValue, lf6Var.c - fFloatValue, lf6Var.d - fFloatValue, xk0.H(fFloatValue, lf6Var.e), xk0.H(fFloatValue, lf6Var.f), xk0.H(fFloatValue, lf6Var.g), xk0.H(fFloatValue, lf6Var.h)));
                        rjVar.f(rjVar, rjVarA, 0);
                    }
                    k76Var.m = rjVar;
                    h76Var.m = fFloatValue;
                }
                Object obj7 = k76Var.m;
                obj7.getClass();
                u52.H0(u52Var, (rj) obj7, sb0Var, 0.0f, null, null, 60);
                break;
            default:
                jl5[] jl5VarArr = (jl5[]) obj6;
                List list = (List) obj5;
                fo4 fo4Var = (fo4) obj4;
                i76 i76Var = (i76) serializable;
                i76 i76Var2 = (i76) obj3;
                wa0 wa0Var = (wa0) obj2;
                il5 il5Var = (il5) obj;
                int length = jl5VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    jl5 jl5Var = jl5VarArr[i];
                    jl5Var.getClass();
                    ua0.d(il5Var, jl5Var, (zn4) list.get(i2), fo4Var.getLayoutDirection(), i76Var.m, i76Var2.m, wa0Var.a);
                    i++;
                    i2++;
                }
                break;
        }
        return f88Var;
    }
}
