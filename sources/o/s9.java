package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s9 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1993o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ pw2 s;
    public final /* synthetic */ pw2 t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ s9(String str, boolean z, boolean z2, String str2, boolean z3, Function1 function1, q57 q57Var, sq2 sq2Var, Function1 function2) {
        this.n = str;
        this.f1993o = z;
        this.p = z2;
        this.r = str2;
        this.q = z3;
        this.s = function1;
        this.u = q57Var;
        this.v = sq2Var;
        this.t = function2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.v;
        Object obj4 = this.u;
        pw2 pw2Var = this.t;
        pw2 pw2Var2 = this.s;
        Object obj5 = this.r;
        switch (b) {
            case 0:
                String str = (String) obj5;
                final Function1 function1 = (Function1) pw2Var2;
                final q57 q57Var = (q57) obj4;
                sq2 sq2Var = (sq2) obj3;
                Function1 function2 = (Function1) pw2Var;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    final String str2 = this.n;
                    Character chV = ub7.V(str2);
                    boolean z2 = chV != null && qf0.J(chV.charValue());
                    qf6 qf6Var = ((rn4) ux2Var.j(un4.a)).c.b;
                    final boolean z3 = this.f1993o;
                    boolean z4 = !z3;
                    boolean z5 = this.p;
                    yy0 yy0Var = new yy0(-822154590, true, new y9(z5, z2, str));
                    yx3 yx3Var = new yx3(0, 7, 119);
                    final boolean z6 = this.q;
                    boolean zG = ux2Var.g(z6) | ux2Var.g(z3) | ux2Var.f(function1) | ux2Var.f(str2) | ux2Var.f(q57Var);
                    Object objK = ux2Var.K();
                    aw awVar = e01.a;
                    if (zG || objK == awVar) {
                        z = z5;
                        objK = new Function1() { // from class: o.w9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                ((wx3) obj6).getClass();
                                if (z6 && !z3) {
                                    function1.invoke(str2);
                                    q57 q57Var2 = q57Var;
                                    if (q57Var2 != null) {
                                        ((zm1) q57Var2).a();
                                    }
                                    IStatisticsHandler iStatisticsHandler = ga7.a;
                                    ga7.a(f43.u);
                                }
                                return f88.a;
                            }
                        };
                        ux2Var.g0(objK);
                    } else {
                        z = z5;
                    }
                    xx3 xx3Var = new xx3((Function1) objK, 62);
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(uf0.n(androidx.compose.foundation.layout.b.c(cs4.b, 1.0f), sq2Var), "TVTA-devicesScreen-addGroupTextField");
                    boolean z7 = !z;
                    boolean zG2 = ux2Var.g(z3) | ux2Var.f(function2);
                    Object objK2 = ux2Var.K();
                    if (zG2 || objK2 == awVar) {
                        objK2 = new x9((byte) 0, (Object) function2, z3);
                        ux2Var.g0(objK2);
                    }
                    bt1.e(str2, (Function1) objK2, fs4VarA, z4, false, null, null, null, null, null, yy0Var, z7, null, yx3Var, xx3Var, true, 0, 0, qf6Var, null, ux2Var, 0, 12779520, 6049776);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                j51.f(this.n, this.f1993o, this.p, this.q, (Function0) obj5, (Function0) pw2Var2, (Function0) pw2Var, (Function0) obj4, (fs4) obj3, (ux2) obj, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ s9(String str, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fs4 fs4Var, int i) {
        this.n = str;
        this.f1993o = z;
        this.p = z2;
        this.q = z3;
        this.r = function0;
        this.s = function1;
        this.t = function2;
        this.u = function3;
        this.v = fs4Var;
    }
}
