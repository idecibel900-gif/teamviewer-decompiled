package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class od4 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1651o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ od4(Object obj, Object obj2, Function1 function1, Object obj3, Object obj4, Object obj5, byte b) {
        this.m = b;
        this.n = obj;
        this.f1651o = obj2;
        this.p = function1;
        this.q = obj3;
        this.r = obj4;
        this.s = obj5;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        tg3 tg3Var = LayoutNode.e0;
        aw awVar = e01.a;
        cs4 cs4Var = cs4.b;
        Function1 function1 = this.p;
        f88 f88Var = f88.a;
        Object obj4 = this.s;
        Object obj5 = this.r;
        Object obj6 = this.q;
        Object obj7 = this.f1651o;
        Object obj8 = this.n;
        switch (b) {
            case 0:
                List list = (List) obj8;
                String str = (String) obj7;
                Function1 function2 = (Function1) obj6;
                Function0 function0 = (Function0) obj5;
                xy6 xy6Var = (xy6) obj4;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ux2Var.Q();
                } else {
                    bw bwVar = iq8.c;
                    w50 w50Var = xz2.B;
                    fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    hk6 hk6VarW = im3.W(ux2Var);
                    Object objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = ck3.w(ux2Var);
                        ux2Var.g0(objK);
                    }
                    fs4 fs4VarT = o77.t(fs4VarC, hk6VarW, (me1) objK);
                    kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var, 54);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarT);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(tg3Var);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    qs7.b(m77.z(R.string.settings_lockApp, ux2Var), ka0.D(cs4Var, 16.0f, 0.0f, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(un4.a)).b.g, ux2Var, 48, 0, 131068);
                    lv1.k(ka0.E(cs4Var, 16.0f, 16.0f, 16.0f, 8.0f), 0.0f, 0L, ux2Var, 0, 6);
                    pd5 pd5VarI = ka0.i(2, 16.0f);
                    fs4 fs4VarD = ka0.D(cs4Var, 0.0f, 8.0f, 1);
                    boolean zF = ux2Var.f(function1);
                    Object objK2 = ux2Var.K();
                    if (zF || objK2 == awVar) {
                        objK2 = new jb(function1, (byte) 10);
                        ux2Var.g0(objK2);
                    }
                    vn4.R(list, str, fs4VarD, null, null, pd5VarI, (Function1) objK2, ux2Var, 196992, 24);
                    vn4.D(24576, str, function0, function2, ux2Var, ka0.D(cs4Var, 16.0f, 0.0f, 2), xy6Var);
                    ux2Var.p(true);
                }
                break;
            case 1:
                List list2 = (List) obj8;
                String str2 = (String) obj7;
                Function1 function3 = (Function1) obj6;
                Function0 function4 = (Function0) obj5;
                xy6 xy6Var2 = (xy6) obj4;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    bw bwVar2 = iq8.c;
                    w50 w50Var2 = xz2.B;
                    fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    hk6 hk6VarW2 = im3.W(ux2Var2);
                    Object objK3 = ux2Var2.K();
                    if (objK3 == awVar) {
                        objK3 = ck3.w(ux2Var2);
                        ux2Var2.g0(objK3);
                    }
                    fs4 fs4VarT2 = o77.t(fs4VarC2, hk6VarW2, (me1) objK3);
                    kw0 kw0VarA2 = iw0.a(bwVar2, w50Var2, ux2Var2, 54);
                    int iHashCode2 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL2 = ux2Var2.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarT2);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(kw0VarA2, d82.v, ux2Var2);
                    o67.n(yj5VarL2, d82.u, ux2Var2);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var2);
                    o67.l(ux2Var2);
                    o67.n(fs4VarS2, d82.t, ux2Var2);
                    vn4.T(48, m77.z(R.string.settings_lockDevice, ux2Var2), ux2Var2, ka0.D(cs4Var, 16.0f, 0.0f, 2));
                    lv1.k(ka0.E(cs4Var, 16.0f, 16.0f, 16.0f, 8.0f), 0.0f, 0L, ux2Var2, 0, 6);
                    pd5 pd5VarI2 = ka0.i(2, 16.0f);
                    fs4 fs4VarD2 = ka0.D(cs4Var, 0.0f, 8.0f, 1);
                    boolean zF2 = ux2Var2.f(function1);
                    Object objK4 = ux2Var2.K();
                    if (zF2 || objK4 == awVar) {
                        objK4 = new jb(function1, (byte) 11);
                        ux2Var2.g0(objK4);
                    }
                    vn4.R(list2, str2, fs4VarD2, null, null, pd5VarI2, (Function1) objK4, ux2Var2, 196992, 24);
                    vn4.D(24576, str2, function4, function3, ux2Var2, ka0.D(cs4Var, 16.0f, 0.0f, 2), xy6Var2);
                    ux2Var2.p(true);
                }
                break;
            case 2:
                List list3 = (List) obj8;
                String str3 = (String) obj7;
                Function1 function5 = (Function1) obj6;
                Function0 function6 = (Function0) obj5;
                xy6 xy6Var3 = (xy6) obj4;
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ux2Var3.Q();
                } else {
                    bw bwVar3 = iq8.c;
                    w50 w50Var3 = xz2.B;
                    fs4 fs4VarC3 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    hk6 hk6VarW3 = im3.W(ux2Var3);
                    Object objK5 = ux2Var3.K();
                    if (objK5 == awVar) {
                        objK5 = ck3.w(ux2Var3);
                        ux2Var3.g0(objK5);
                    }
                    fs4 fs4VarT3 = o77.t(fs4VarC3, hk6VarW3, (me1) objK5);
                    kw0 kw0VarA3 = iw0.a(bwVar3, w50Var3, ux2Var3, 54);
                    int iHashCode3 = Long.hashCode(ux2Var3.T);
                    yj5 yj5VarL3 = ux2Var3.l();
                    fs4 fs4VarS3 = uf0.s(ux2Var3, fs4VarT3);
                    yz0.c.getClass();
                    ux2Var3.a0();
                    if (ux2Var3.S) {
                        ux2Var3.k(tg3Var);
                    } else {
                        ux2Var3.j0();
                    }
                    o67.n(kw0VarA3, d82.v, ux2Var3);
                    o67.n(yj5VarL3, d82.u, ux2Var3);
                    o67.n(Integer.valueOf(iHashCode3), d82.w, ux2Var3);
                    o67.l(ux2Var3);
                    o67.n(fs4VarS3, d82.t, ux2Var3);
                    vn4.T(48, m77.z(R.string.settings_quality, ux2Var3), ux2Var3, ka0.D(cs4Var, 16.0f, 0.0f, 2));
                    lv1.k(ka0.E(cs4Var, 16.0f, 16.0f, 16.0f, 8.0f), 0.0f, 0L, ux2Var3, 0, 6);
                    pd5 pd5VarI3 = ka0.i(2, 16.0f);
                    fs4 fs4VarD3 = ka0.D(cs4Var, 0.0f, 8.0f, 1);
                    boolean zF3 = ux2Var3.f(function1);
                    Object objK6 = ux2Var3.K();
                    if (zF3 || objK6 == awVar) {
                        objK6 = new jb(function1, (byte) 12);
                        ux2Var3.g0(objK6);
                    }
                    vn4.R(list3, str3, fs4VarD3, null, null, pd5VarI3, (Function1) objK6, ux2Var3, 196992, 24);
                    vn4.D(24576, str3, function6, function5, ux2Var3, ka0.D(cs4Var, 16.0f, 0.0f, 2), xy6Var3);
                    ux2Var3.p(true);
                }
                break;
            default:
                hw6 hw6Var = (hw6) obj8;
                a06 a06Var = (a06) obj7;
                iv6 iv6Var = (iv6) obj6;
                i97 i97Var = (i97) obj5;
                i97 i97Var2 = (i97) obj4;
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((nd5) obj).getClass();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ux2Var4.Q();
                } else {
                    wo1.v(a06Var, this.p, (dw6) i97Var.getValue(), iv6Var, ((Boolean) hw6Var.C.getValue()).booleanValue(), (eg3) i97Var2.getValue(), null, ux2Var4, 0);
                }
                break;
        }
        return f88Var;
    }
}
