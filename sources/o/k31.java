package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k31 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ kh4 n;

    public /* synthetic */ k31(kh4 kh4Var, byte b) {
        this.m = b;
        this.n = kh4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        float fFloatValue;
        byte b = this.m;
        kh4 kh4Var = this.n;
        switch (b) {
            case 0:
                fFloatValue = ((Number) kh4Var.getValue()).floatValue();
                break;
            case 1:
                fFloatValue = ((Number) kh4Var.getValue()).floatValue();
                break;
            default:
                fFloatValue = ((Number) kh4Var.getValue()).floatValue();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
