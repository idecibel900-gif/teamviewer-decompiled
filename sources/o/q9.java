package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q9 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1810o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ q9(h71 h71Var, boolean z, fs4 fs4Var, boolean z2, int i) {
        this.p = h71Var;
        this.n = z;
        this.q = fs4Var;
        this.f1810o = z2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.q;
        Object obj4 = this.p;
        switch (b) {
            case 0:
                Function1 function1 = (Function1) obj4;
                String str = (String) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                byte b2 = 0;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    boolean z = this.n;
                    boolean z2 = this.f1810o;
                    boolean z3 = z && !z2;
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4.b, "TVTA-devicesScreen-addGroupAlertDialog-confirm");
                    boolean zF = ux2Var.f(function1) | ux2Var.f(str);
                    Object objK = ux2Var.K();
                    if (zF || objK == e01.a) {
                        objK = new u9(function1, str, (byte) 0);
                        ux2Var.g0(objK);
                    }
                    v67.d((Function0) objK, fs4VarA, null, z3, null, au8.O(-1482266565, new v9(b2, z2), ux2Var), ux2Var, 196656, 20);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qf0.f((h71) obj4, this.n, (fs4) obj3, this.f1810o, (ux2) obj, yo1.Y(385));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ q9(boolean z, boolean z2, Function1 function1, String str) {
        this.n = z;
        this.f1810o = z2;
        this.p = function1;
        this.q = str;
    }
}
