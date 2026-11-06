package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ot1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f1675o;

    public /* synthetic */ ot1(Function0 function0, px4 px4Var, byte b) {
        this.m = b;
        this.n = function0;
        this.f1675o = px4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.f1675o;
        Function0 function0 = this.n;
        switch (b) {
            case 0:
                px4Var.setValue(null);
                function0.a();
                break;
            case 1:
                px4Var.setValue(Boolean.FALSE);
                function0.a();
                break;
            case 2:
                px4Var.setValue(Boolean.FALSE);
                function0.a();
                break;
            case 3:
                px4Var.setValue(Boolean.FALSE);
                function0.a();
                break;
            case 4:
                px4Var.setValue(Boolean.FALSE);
                function0.a();
                break;
            case 5:
                if (((ih8) px4Var.getValue()) == null) {
                    px4Var.setValue(ih8.m);
                    function0.a();
                }
                break;
            case 6:
                if (((ih8) px4Var.getValue()) == null) {
                    px4Var.setValue(ih8.n);
                    function0.a();
                }
                break;
            case 7:
                if (((gf4) px4Var.getValue()) == null) {
                    px4Var.setValue(gf4.m);
                    function0.a();
                }
                break;
            case 8:
                if (((gf4) px4Var.getValue()) == null) {
                    px4Var.setValue(gf4.n);
                    function0.a();
                }
                break;
            case ep1.b /* 9 */:
                if (((hf4) px4Var.getValue()) == null) {
                    px4Var.setValue(hf4.m);
                    function0.a();
                }
                break;
            default:
                if (((hf4) px4Var.getValue()) == null) {
                    px4Var.setValue(hf4.n);
                    function0.a();
                }
                break;
        }
        return f88Var;
    }
}
