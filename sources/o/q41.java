package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q41 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1801o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ q41(String str, f95 f95Var, b41 b41Var, jz1 jz1Var, fs4 fs4Var, String str2, int i) {
        this.m = (byte) 0;
        this.n = str;
        this.q = f95Var;
        this.r = b41Var;
        this.s = jz1Var;
        this.p = fs4Var;
        this.f1801o = str2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.p;
        Object obj4 = this.s;
        Object obj5 = this.r;
        Object obj6 = this.q;
        Object obj7 = this.f1801o;
        Object obj8 = this.n;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                iq8.e((String) obj8, (f95) obj6, (b41) obj5, (jz1) obj4, (fs4) obj3, (String) obj7, (ux2) obj, yo1.Y(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ep1.c((String) obj8, (String) obj7, (hw2) obj6, (Function0) obj5, (xy6) obj4, (fs4) obj3, (ux2) obj, yo1.Y(196609));
                break;
            case 2:
                ((Integer) obj2).getClass();
                lv1.q((Function0) obj8, (a06) obj7, (Function1) obj6, (Function0) obj5, (fs4) obj3, (l85) obj4, (ux2) obj, yo1.Y(3073));
                break;
            case 3:
                ((Integer) obj2).getClass();
                io1.n((a06) obj8, (List) obj7, (Function0) obj6, (Function1) obj5, (fs4) obj3, (tx5) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                yo1.q((String) obj8, (String) obj7, (String) obj6, (Function0) obj5, (Function0) obj4, (fs4) obj3, (ux2) obj, yo1.Y(385));
                break;
            default:
                px4 px4Var = (px4) obj8;
                i97 i97Var = (i97) obj7;
                i97 i97Var2 = (i97) obj6;
                i97 i97Var3 = (i97) obj5;
                yy0 yy0Var = (yy0) obj4;
                i08 i08Var = (i08) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    Object objK = ux2Var.K();
                    aw awVar = e01.a;
                    if (objK == awVar) {
                        objK = new ts6(px4Var, (byte) 8);
                        ux2Var.g0(objK);
                    }
                    cs4 cs4Var = cs4.b;
                    fs4 fs4VarR0 = db8.r0(cs4Var, (Function1) objK);
                    y50 y50Var = xz2.f2564o;
                    do4 do4VarC = ua0.c(y50Var, false);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarR0);
                    yz0.c.getClass();
                    ux2Var.a0();
                    boolean z = ux2Var.S;
                    tg3 tg3Var = LayoutNode.e0;
                    if (z) {
                        ux2Var.k(tg3Var);
                    } else {
                        ux2Var.j0();
                    }
                    iz0 iz0Var = d82.v;
                    o67.n(do4VarC, iz0Var, ux2Var);
                    iz0 iz0Var2 = d82.u;
                    o67.n(yj5VarL, iz0Var2, ux2Var);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    iz0 iz0Var3 = d82.w;
                    o67.n(numValueOf, iz0Var3, ux2Var);
                    o67.l(ux2Var);
                    iz0 iz0Var4 = d82.t;
                    o67.n(fs4VarS, iz0Var4, ux2Var);
                    ux2Var.U(-1350495383, Integer.valueOf(((Number) i97Var3.getValue()).intValue()));
                    boolean zF = ux2Var.f(i97Var) | ux2Var.f(i97Var2);
                    Object objK2 = ux2Var.K();
                    if (zF || objK2 == awVar) {
                        objK2 = new l06(i97Var, i97Var2, (byte) 1);
                        ux2Var.g0(objK2);
                    }
                    fs4 fs4VarT = di1.t(cs4Var, (Function1) objK2);
                    do4 do4VarC2 = ua0.c(y50Var, false);
                    int iHashCode2 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL2 = ux2Var.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarT);
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(tg3Var);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC2, iz0Var, ux2Var);
                    o67.n(yj5VarL2, iz0Var2, ux2Var);
                    e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
                    o67.n(fs4VarS2, iz0Var4, ux2Var);
                    yy0Var.d(i08Var, ux2Var, 6);
                    ux2Var.p(true);
                    ux2Var.p(false);
                    ux2Var.p(true);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ q41(String str, String str2, Object obj, Function0 function0, Object obj2, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = str;
        this.f1801o = str2;
        this.q = obj;
        this.r = function0;
        this.s = obj2;
        this.p = fs4Var;
    }

    public /* synthetic */ q41(Object obj, Object obj2, pw2 pw2Var, pw2 pw2Var2, fs4 fs4Var, oe8 oe8Var, int i, byte b) {
        this.m = b;
        this.n = obj;
        this.f1801o = obj2;
        this.q = pw2Var;
        this.r = pw2Var2;
        this.p = fs4Var;
        this.s = oe8Var;
    }

    public /* synthetic */ q41(px4 px4Var, q18 q18Var, q18 q18Var2, i97 i97Var, yy0 yy0Var, i08 i08Var) {
        this.m = (byte) 5;
        this.n = px4Var;
        this.f1801o = q18Var;
        this.q = q18Var2;
        this.r = i97Var;
        this.s = yy0Var;
        this.p = i08Var;
    }
}
