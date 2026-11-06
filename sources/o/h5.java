package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h5 implements iw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f949o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ pw2 s;

    public /* synthetic */ h5(String str, String str2, ArrayList arrayList, Function1 function1, Function1 function2, boolean z) {
        this.n = str;
        this.q = str2;
        this.r = arrayList;
        this.f949o = z;
        this.p = function1;
        this.s = function2;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        aw awVar = e01.a;
        pw2 pw2Var = this.s;
        Object obj4 = this.r;
        Object obj5 = this.q;
        switch (b) {
            case 0:
                me1 me1Var = (me1) obj5;
                Function0 function0 = (Function0) obj4;
                Function0 function1 = (Function0) pw2Var;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var.Q();
                } else {
                    w50 w50Var = xz2.B;
                    cs4 cs4Var = cs4.b;
                    fs4 fs4VarD = ka0.D(o77.t(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), im3.W(ux2Var), me1Var), 16.0f, 0.0f, 2);
                    kw0 kw0VarA = iw0.a(iq8.c, w50Var, ux2Var, 48);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarD);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    String strZ = m77.z(R.string.tv_IDS_MSGBOX_ACCOUNTNOTLOGGEDIN_TITLE, ux2Var);
                    h72 h72Var = un4.a;
                    qs7.b(strZ, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.g, ux2Var, 0, 0, 131070);
                    lv1.k(ka0.F(cs4Var, 0.0f, 16.0f, 0.0f, 24.0f, 5), 0.0f, 0L, ux2Var, 6, 6);
                    qs7.b(m77.z(R.string.account_required_description, ux2Var), ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.k, ux2Var, 48, 0, 131068);
                    fs4 fs4VarF = ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    Function1 function2 = this.p;
                    boolean zF = ux2Var.f(function2) | ux2Var.f(function0);
                    Object objK = ux2Var.K();
                    if (zF || objK == awVar) {
                        objK = new j5((byte) 0, function0, function2);
                        ux2Var.g0(objK);
                    }
                    Function0 function3 = (Function0) objK;
                    boolean zF2 = ux2Var.f(function2) | ux2Var.f(function1);
                    Object objK2 = ux2Var.K();
                    if (zF2 || objK2 == awVar) {
                        objK2 = new j5((byte) 1, function1, function2);
                        ux2Var.g0(objK2);
                    }
                    uf0.e(this.f949o, function3, (Function0) objK2, this.n, fs4VarF, ux2Var, 24576);
                    ux2Var.p(true);
                }
                break;
            default:
                String str = (String) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Function1 function4 = (Function1) pw2Var;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    fs4 fs4VarC = ka0.C(androidx.compose.foundation.layout.b.c(cs4.b, 1.0f), 16.0f, 16.0f);
                    String str2 = this.n;
                    boolean zF3 = ux2Var2.f(str2) | ux2Var2.f(str) | ux2Var2.h(arrayList);
                    boolean z = this.f949o;
                    boolean zG = zF3 | ux2Var2.g(z);
                    Function1 function5 = this.p;
                    boolean zF4 = ux2Var2.f(function5) | zG | ux2Var2.f(function4);
                    Object objK3 = ux2Var2.K();
                    if (zF4 || objK3 == awVar) {
                        jd1 jd1Var = new jd1(str2, str, arrayList, function5, function4, z);
                        ux2Var2.g0(jd1Var);
                        objK3 = jd1Var;
                    }
                    yo1.i(6, 510, (Function1) objK3, null, null, null, null, ux2Var2, null, fs4VarC, null, false);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ h5(me1 me1Var, boolean z, Function1 function1, Function0 function0, Function0 function2, String str) {
        this.q = me1Var;
        this.f949o = z;
        this.p = function1;
        this.r = function0;
        this.s = function2;
        this.n = str;
    }
}
