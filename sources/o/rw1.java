package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rw1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ me1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ul1 f1961o;

    public /* synthetic */ rw1(me1 me1Var, ul1 ul1Var, byte b) {
        this.m = b;
        this.n = me1Var;
        this.f1961o = ul1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        ul1 ul1Var = this.f1961o;
        me1 me1Var = this.n;
        switch (b) {
            case 0:
                im3.R(me1Var, null, null, new bx1(ul1Var, null, (byte) 1), 3);
                break;
            case 1:
                im3.R(me1Var, null, null, new bx1(ul1Var, null, (byte) 2), 3);
                break;
            case 2:
                im3.R(me1Var, null, null, new bx1(ul1Var, null, (byte) 3), 3);
                break;
            case 3:
                im3.R(me1Var, null, null, new bx1(ul1Var, null, (byte) 5), 3);
                break;
            default:
                im3.R(me1Var, null, null, new bx1(ul1Var, null, (byte) 4), 3);
                break;
        }
        return f88Var;
    }
}
