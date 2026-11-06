package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fn3 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f815o;

    public /* synthetic */ fn3(px4 px4Var, px4 px4Var2, byte b) {
        this.m = b;
        this.n = px4Var;
        this.f815o = px4Var2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        int i;
        byte b = this.m;
        px4 px4Var = this.f815o;
        px4 px4Var2 = this.n;
        switch (b) {
            case 0:
                px4Var2.setValue(Boolean.FALSE);
                px4Var.setValue(null);
                return f88.a;
            default:
                if (px4Var2.getValue() == null || px4Var.getValue() == null) {
                    i = 0;
                } else {
                    Object value = px4Var2.getValue();
                    value.getClass();
                    long jA = ((i04) value).A(0L);
                    Object value2 = px4Var.getValue();
                    value2.getClass();
                    long j = ((t65) value2).a;
                    if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (jA >> 32))) {
                        i = Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jA & 4294967295L)) ? 1 : 3;
                    } else {
                        i = Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jA & 4294967295L)) ? 2 : 4;
                    }
                }
                return Integer.valueOf(i);
        }
    }
}
