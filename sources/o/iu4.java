package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iu4 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ kf0 n;

    public /* synthetic */ iu4(kf0 kf0Var, byte b) {
        this.m = b;
        this.n = kf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        kf0 kf0Var = this.n;
        switch (b) {
            case 0:
                return (ju4) jn0.a(kf0Var.l());
            default:
                return (s08) jn0.a(kf0Var.l());
        }
    }
}
