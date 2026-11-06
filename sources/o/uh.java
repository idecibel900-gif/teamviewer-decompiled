package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2214o;
    public final /* synthetic */ Object p;

    public /* synthetic */ uh(long j, i68 i68Var, hw2 hw2Var, int i) {
        this.m = (byte) 2;
        this.n = j;
        this.f2214o = i68Var;
        this.p = hw2Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.p;
        Object obj4 = this.f2214o;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                yh.a((w65) obj4, (fs4) obj3, this.n, (ux2) obj, yo1.Y(1));
                break;
            case 1:
                nd5 nd5Var = (nd5) obj4;
                iw2 iw2Var = (iw2) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    lv1.x(this.n, ((rn4) ux2Var.j(un4.a)).b.m, au8.O(417635459, new c9((Object) nd5Var, (Object) iw2Var, (byte) 9), ux2Var), ux2Var, 384);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                pb4.c(this.n, (i68) obj4, (hw2) obj3, (ux2) obj, yo1.Y(49));
                break;
            case 3:
                o37 o37Var = (o37) obj4;
                String str = (String) obj3;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    ng0 ng0VarF = og0.f(this.n, ux2Var2);
                    boolean zF = ux2Var2.f(o37Var);
                    Object objK = ux2Var2.K();
                    if (zF || objK == e01.a) {
                        objK = new l37(o37Var, (byte) 2);
                        ux2Var2.g0(objK);
                    }
                    au8.p((Function0) objK, null, false, null, ng0VarF, null, au8.O(521110564, new t20(str, (byte) 4), ux2Var2), ux2Var2, 805306368, 494);
                }
                break;
            default:
                ot7 ot7Var = (ot7) obj4;
                hw2 hw2Var = (hw2) obj3;
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    m77.d(this.n, ot7Var, hw2Var, ux2Var3, 0);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ uh(long j, Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = j;
        this.f2214o = obj;
        this.p = obj2;
    }

    public /* synthetic */ uh(w65 w65Var, fs4 fs4Var, long j, int i) {
        this.m = (byte) 0;
        this.f2214o = w65Var;
        this.p = fs4Var;
        this.n = j;
    }
}
