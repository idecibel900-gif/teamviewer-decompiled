package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b5 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ i97 n;

    public /* synthetic */ b5(i97 i97Var, byte b) {
        this.m = b;
        this.n = i97Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        i97 i97Var = this.n;
        switch (b) {
            case 0:
                return ((d5) i97Var.getValue()).a;
            case 1:
                return Boolean.valueOf(((xv1) i97Var.getValue()).d);
            case 2:
                return Boolean.valueOf(((xv1) i97Var.getValue()).a || ((xv1) i97Var.getValue()).c);
            case 3:
                return h57.p((l67) i97Var.getValue());
            case 4:
                return Float.valueOf(((Number) i97Var.getValue()).floatValue());
            case 5:
                return Float.valueOf(((Number) i97Var.getValue()).floatValue());
            case 6:
                t65 t65Var = (t65) i97Var.getValue();
                long j = t65Var.a;
                return t65Var;
            case 7:
                no noVar = vo6.a;
                t65 t65Var2 = (t65) i97Var.getValue();
                long j2 = t65Var2.a;
                return t65Var2;
            case 8:
                return Float.valueOf(i97Var != null ? ((Number) i97Var.getValue()).floatValue() : 1.0f);
            case ep1.b /* 9 */:
                return Float.valueOf(i97Var != null ? ((Number) i97Var.getValue()).floatValue() : 0.0f);
            case ep1.c /* 10 */:
                return Float.valueOf(i97Var != null ? ((Number) i97Var.getValue()).floatValue() : 0.0f);
            case 11:
                return Boolean.valueOf((i97Var != null ? ((Number) i97Var.getValue()).floatValue() : 0.0f) > 0.0f);
            default:
                return Boolean.valueOf((i97Var != null ? ((Number) i97Var.getValue()).floatValue() : 0.0f) > 0.0f);
        }
    }
}
