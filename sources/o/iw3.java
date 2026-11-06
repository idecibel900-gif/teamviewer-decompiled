package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class iw3 implements Function0 {
    public final /* synthetic */ byte m;
    public final jw3 n;

    public /* synthetic */ iw3(jw3 jw3Var, byte b) {
        this.m = b;
        this.n = jw3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        jw3 jw3Var = this.n;
        switch (b) {
            case 0:
                eu5 getter = jw3Var.B().w().getGetter();
                return getter == null ? io1.J(jw3Var.B().w(), yl7.p) : getter;
            default:
                return io1.B(jw3Var, true);
        }
    }
}
