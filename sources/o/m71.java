package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m71 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f1443o;
    public final /* synthetic */ px4 p;

    public /* synthetic */ m71(px4 px4Var, px4 px4Var2, px4 px4Var3, byte b) {
        this.m = b;
        this.n = px4Var;
        this.f1443o = px4Var2;
        this.p = px4Var3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.p;
        px4 px4Var2 = this.f1443o;
        px4 px4Var3 = this.n;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!((Boolean) px4Var3.getValue()).booleanValue()) {
                    if (zBooleanValue) {
                        px4Var2.setValue("name");
                        px4Var.setValue(null);
                    } else if (im3.n((String) px4Var2.getValue(), "name")) {
                        px4Var.setValue("name");
                    }
                }
                return f88Var;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (!((Boolean) px4Var3.getValue()).booleanValue()) {
                    if (zBooleanValue2) {
                        px4Var2.setValue("description");
                        px4Var.setValue(null);
                    } else if (im3.n((String) px4Var2.getValue(), "description")) {
                        px4Var.setValue("description");
                    }
                }
                return f88Var;
            case 2:
                ((r22) obj).getClass();
                return new st1(px4Var3, px4Var2, px4Var, (byte) 0);
            default:
                ((r22) obj).getClass();
                return new st1(px4Var3, px4Var2, px4Var, (byte) 1);
        }
    }
}
