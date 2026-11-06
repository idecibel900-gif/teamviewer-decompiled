package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class vp1 implements Function0 {
    public final /* synthetic */ byte m;
    public final Function0 n;

    public /* synthetic */ vp1(Function0 function0, byte b) {
        this.m = b;
        this.n = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        Function0 function0 = this.n;
        switch (b) {
            case 0:
                return lv0.T0((Iterable) function0.a());
            default:
                zo4 zo4Var = (zo4) function0.a();
                return zo4Var instanceof d54 ? ((d54) zo4Var).h() : zo4Var;
        }
    }
}
