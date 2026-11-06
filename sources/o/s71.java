package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s71 implements iw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1989o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ s71(iq2 iq2Var, i81 i81Var, o71 o71Var, h71 h71Var, boolean z, boolean z2, Function1 function1, Function1 function2) {
        this.p = iq2Var;
        this.q = i81Var;
        this.r = o71Var;
        this.s = h71Var;
        this.n = z;
        this.f1989o = z2;
        this.t = function1;
        this.u = function2;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        byte b = this.m;
        f88 f88Var = f88.a;
        aw awVar = e01.a;
        Object obj4 = this.u;
        Object obj5 = this.t;
        Object obj6 = this.s;
        Object obj7 = this.r;
        Object obj8 = this.q;
        Object obj9 = this.p;
        switch (b) {
            case 0:
                iq2 iq2Var = (iq2) obj9;
                i81 i81Var = (i81) obj8;
                o71 o71Var = (o71) obj7;
                h71 h71Var = (h71) obj6;
                Function1 function1 = (Function1) obj5;
                Function1 function2 = (Function1) obj4;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xa0) obj).getClass();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zH = ux2Var.h(iq2Var);
                    Object objK = ux2Var.K();
                    if (zH || objK == awVar) {
                        objK = new h81(iq2Var, (byte) 0);
                        ux2Var.g0(objK);
                    }
                    cs4 cs4Var = cs4.b;
                    fs4 fs4VarB = ka0.B(qg7.a(cs4Var, f88Var, (PointerInputEventHandler) objK), 16.0f);
                    kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarB);
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
                    fs4 fs4VarF = ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7);
                    boolean z = this.n;
                    qf0.f(h71Var, z, fs4VarF, this.f1989o, ux2Var, 384);
                    if (z) {
                        ux2Var.W(-1701605213);
                        ka0.e(i81Var, function1, function2, null, ux2Var, 0);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(-1701312046);
                        int iOrdinal = h71Var.t.ordinal();
                        if (iOrdinal == 0) {
                            ux2Var.W(-1701248248);
                            qf0.m(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7), o71Var.a, o71Var.c, o71Var.d, ux2Var, 6);
                            qf0.l(6, o71Var.b, ux2Var, ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 8.0f, 7));
                            ux2Var.p(false);
                        } else if (iOrdinal == 1) {
                            ux2Var.W(-1700557072);
                            qf0.e(6, o71Var.a, o71Var.b, ux2Var, ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7));
                            ux2Var.p(false);
                        } else {
                            if (iOrdinal != 2) {
                                throw fx3.m(1884782101, ux2Var, false);
                            }
                            ux2Var.W(-1700188296);
                            qf0.d(6, o71Var.d, ux2Var, ka0.F(cs4Var, 10.0f, 0.0f, 10.0f, 16.0f, 2));
                            ux2Var.p(false);
                        }
                        qf0.i(h71Var, null, ux2Var, 0);
                        ux2Var.p(false);
                    }
                    ux2Var.p(true);
                    if (i81Var.i) {
                        ux2Var.W(-1668124988);
                        List list = i81Var.g;
                        if (i81Var.h) {
                            i = -1667962269;
                            i2 = R.string.select_contact_device_description_file_transfer;
                        } else {
                            i = -1667845399;
                            i2 = R.string.select_contact_device_description_connect;
                        }
                        io1.r(list, to7.m(ux2Var, i, i2, ux2Var, false), o71Var.h, o71Var.g, null, false, null, null, ux2Var, 0, 240);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(-1667587789);
                        ux2Var.p(false);
                    }
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            default:
                eg3 eg3Var = (eg3) obj9;
                a06 a06Var = (a06) obj8;
                dw6 dw6Var = (dw6) obj7;
                iv6 iv6Var = (iv6) obj6;
                me1 me1Var = (me1) obj5;
                ul1 ul1Var = (ul1) obj4;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xu7) obj).getClass();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zH2 = ux2Var2.h(me1Var) | ux2Var2.f(ul1Var);
                    Object objK2 = ux2Var2.K();
                    if (zH2 || objK2 == awVar) {
                        objK2 = new py5(me1Var, ul1Var, (byte) 13);
                        ux2Var2.g0(objK2);
                    }
                    wo1.u(eg3Var, this.n, a06Var, dw6Var, iv6Var, this.f1989o, (Function1) objK2, ux2Var2, 0);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
        }
    }

    public /* synthetic */ s71(eg3 eg3Var, boolean z, a06 a06Var, dw6 dw6Var, iv6 iv6Var, boolean z2, me1 me1Var, ul1 ul1Var) {
        this.p = eg3Var;
        this.n = z;
        this.q = a06Var;
        this.r = dw6Var;
        this.s = iv6Var;
        this.f1989o = z2;
        this.t = me1Var;
        this.u = ul1Var;
    }
}
