package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h9 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f958o;

    public /* synthetic */ h9(Function0 function0, px4 px4Var, byte b) {
        this.m = b;
        this.n = function0;
        this.f958o = px4Var;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.f958o;
        Function0 function0 = this.n;
        switch (b) {
            case 0:
                ((Function1) px4Var.getValue()).invoke((d37) obj);
                function0.a();
                break;
            default:
                function0.a();
                ((Function1) px4Var.getValue()).invoke("QR_CODE_ASSIGNMENT_SUCCESS");
                break;
        }
        return f88Var;
    }
}
