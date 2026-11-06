package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a04 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f276o;

    public /* synthetic */ a04(Function0 function0, Function0 function1, byte b) {
        this.m = b;
        this.n = function0;
        this.f276o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.f276o;
        Function0 function1 = this.n;
        switch (b) {
            case 0:
                function1.a();
                function0.a();
                break;
            default:
                rp7 rp7Var = (rp7) obj;
                function1.a();
                if (function0 != null ? ((Boolean) function0.a()).booleanValue() : true) {
                    rp7Var.close();
                }
                break;
        }
        return f88Var;
    }
}
