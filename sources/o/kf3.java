package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kf3 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ tf3 n;

    public /* synthetic */ kf3(tf3 tf3Var, byte b) {
        this.m = b;
        this.n = tf3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        tf3 tf3Var = this.n;
        switch (b) {
            case 0:
                im3.R(e8.n(tf3Var), null, null, new sf3(tf3Var, null, (byte) 4), 3);
                break;
            case 1:
                bu7.MAIN.a(new pc0(tf3Var, (byte) 16));
                break;
            default:
                bu7.MAIN.a(new pc0(tf3Var, (byte) 16));
                break;
        }
        return f88Var;
    }
}
