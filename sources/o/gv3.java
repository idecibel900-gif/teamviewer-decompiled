package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class gv3 implements Function0 {
    public final /* synthetic */ byte m;
    public final lv3 n;

    public /* synthetic */ gv3(lv3 lv3Var, byte b) {
        this.m = b;
        this.n = lv3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        lv3 lv3Var = this.n;
        switch (b) {
            case 0:
                return new jv3(lv3Var);
            default:
                return ct1.y(lv3Var.n);
        }
    }
}
