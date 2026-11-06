package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z8 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2678o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ z8(f33 f33Var, l33 l33Var, Function1 function1, px4 px4Var) {
        this.m = (byte) 8;
        this.n = f33Var;
        this.p = l33Var;
        this.q = function1;
        this.f2678o = px4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        byte b2 = 5;
        tg3 tg3Var = LayoutNode.e0;
        cs4 cs4Var = cs4.b;
        aw awVar = e01.a;
        final byte b3 = 1;
        f88 f88Var = f88.a;
        Object obj3 = this.q;
        Object obj4 = this.f2678o;
        Object obj5 = this.n;
        Object obj6 = this.p;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                pm8.j((l33) obj6, (o9) obj5, (n9) obj3, (fs4) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                pm8.d((o9) obj5, (Function0) obj6, (Function0) obj3, (fs4) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 2:
                fs4 fs4Var = (fs4) obj4;
                px4 px4Var = (px4) obj6;
                yy0 yy0Var = (yy0) obj5;
                n40 n40Var = (n40) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    Object objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = new va(px4Var, b2);
                        ux2Var.g0(objK);
                    }
                    fs4 fs4VarR0 = db8.r0(fs4Var, (Function1) objK);
                    do4 do4VarC = ua0.c(xz2.f2564o, true);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarR0);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(tg3Var);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    yy0Var.invoke(ux2Var, 0);
                    Object objK2 = ux2Var.K();
                    if (objK2 == awVar) {
                        objK2 = new la(px4Var, (byte) 3);
                        ux2Var.g0(objK2);
                    }
                    n40Var.b((Function0) objK2, ux2Var, 6);
                    ux2Var.p(true);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                db8.b((Function0) obj6, (Function0) obj5, (fs4) obj4, (xy6) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                qf0.m((fs4) obj4, (Function0) obj6, (Function0) obj5, (Function0) obj3, (ux2) obj, yo1.Y(7));
                break;
            case 5:
                ((Integer) obj2).getClass();
                hm3.d((List) obj6, (l71) obj5, (fs4) obj4, (Function1) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                vn4.S((List) obj6, (a91) obj5, (fs4) obj4, (Function1) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 7:
                ye5 ye5Var = (ye5) obj6;
                ov1 ov1Var = (ov1) obj5;
                nx1 nx1Var = (nx1) obj3;
                i97 i97Var = (i97) obj4;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    boolean z = ye5Var.a >= 2;
                    boolean zBooleanValue = ((Boolean) i97Var.getValue()).booleanValue();
                    boolean zH = ux2Var2.h(nx1Var);
                    Object objK3 = ux2Var2.K();
                    if (zH || objK3 == awVar) {
                        objK3 = new zz0(nx1Var, (byte) 15);
                        ux2Var2.g0(objK3);
                    }
                    Function0 function0 = (Function0) objK3;
                    Object objK4 = ux2Var2.K();
                    if (objK4 == awVar) {
                        objK4 = new h31((byte) 24);
                        ux2Var2.g0(objK4);
                    }
                    ox1.b(z, zBooleanValue, ov1Var, function0, cp6.a(cs4Var, false, (Function1) objK4), ux2Var2, 0);
                }
                break;
            case 8:
                final f33 f33Var = (f33) obj5;
                final l33 l33Var = (l33) obj6;
                Function1 function1 = (Function1) obj3;
                px4 px4Var2 = (px4) obj4;
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    boolean zH2 = ux2Var3.h(f33Var) | ux2Var3.h(l33Var);
                    Object objK5 = ux2Var3.K();
                    if (zH2 || objK5 == awVar) {
                        final Object[] objArr = null == true ? 1 : 0;
                        objK5 = new Function0() { // from class: o.p23
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b4 = objArr;
                                f88 f88Var2 = f88.a;
                                l33 l33Var2 = l33Var;
                                f33 f33Var2 = f33Var;
                                switch (b4) {
                                    case 0:
                                        l97 l97Var = (l97) f33Var2.u.f578o;
                                        String str = l33Var2.b;
                                        if (str == null) {
                                            str = "";
                                        }
                                        l97Var.l(null, new h13(l33Var2, str));
                                        break;
                                    default:
                                        im3.R(e8.n(f33Var2), null, null, new oa1(f33Var2, l33Var2, (hc1) null, (byte) 22), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var3.g0(objK5);
                    }
                    Function0 function2 = (Function0) objK5;
                    boolean zH3 = ux2Var3.h(f33Var) | ux2Var3.h(l33Var);
                    Object objK6 = ux2Var3.K();
                    if (zH3 || objK6 == awVar) {
                        objK6 = new Function0() { // from class: o.p23
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b4 = b3;
                                f88 f88Var2 = f88.a;
                                l33 l33Var2 = l33Var;
                                f33 f33Var2 = f33Var;
                                switch (b4) {
                                    case 0:
                                        l97 l97Var = (l97) f33Var2.u.f578o;
                                        String str = l33Var2.b;
                                        if (str == null) {
                                            str = "";
                                        }
                                        l97Var.l(null, new h13(l33Var2, str));
                                        break;
                                    default:
                                        im3.R(e8.n(f33Var2), null, null, new oa1(f33Var2, l33Var2, (hc1) null, (byte) 22), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var3.g0(objK6);
                    }
                    Function0 function3 = (Function0) objK6;
                    boolean zBooleanValue2 = ((Boolean) px4Var2.getValue()).booleanValue();
                    boolean zF = ux2Var3.f(function1);
                    Object objK7 = ux2Var3.K();
                    if (zF || objK7 == awVar) {
                        objK7 = new g70(function1, px4Var2, b2);
                        ux2Var3.g0(objK7);
                    }
                    vs1.d(function2, function3, zBooleanValue2, (Function1) objK7, null, new d13(40.0f, R.drawable.ic_top_bar_drop_down_menu, ((tf2) ux2Var3.j(vf2.a)).l), ux2Var3, 0, 16);
                }
                break;
            case ep1.b /* 9 */:
                ((Integer) obj2).getClass();
                xs1.s((List) obj6, (m13) obj5, (fs4) obj4, (Function1) obj3, (ux2) obj, yo1.Y(1));
                break;
            case ep1.c /* 10 */:
                ((Integer) obj2).getClass();
                vs1.f((Function0) obj6, (fs4) obj4, (x34) obj5, (n44) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                us1.g((List) obj6, (Function0) obj5, (fs4) obj4, (xy6) obj3, (ux2) obj, yo1.Y(1));
                break;
            case ep1.d /* 12 */:
                ((Integer) obj2).getClass();
                ct1.h((List) obj6, (UUID) obj5, (Function1) obj3, (fs4) obj4, (ux2) obj, yo1.Y(3073));
                break;
            case 13:
                ((Integer) obj2).getClass();
                lv1.f((kp5) obj6, (Function0) obj5, (Function0) obj3, (fs4) obj4, (ux2) obj, yo1.Y(9));
                break;
            case 14:
                ((Integer) obj2).getClass();
                io1.o((x46) obj6, (fs4) obj4, (Function0) obj5, (Function0) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ds1.y((List) obj6, (rr6) obj5, (fs4) obj4, (Function1) obj3, (ux2) obj, yo1.Y(1));
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((Integer) obj2).getClass();
                us1.l((Integer) obj6, (OffsetDateTime) obj5, (Clock) obj3, (Function0) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                xo1.w((Function1) obj6, (a06) obj5, (fs4) obj4, (hw6) obj3, (ux2) obj, yo1.Y(1));
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((Integer) obj2).getClass();
                f57.b((eg3) obj6, (fs4) obj4, (String) obj5, (dg3) obj3, (ux2) obj, yo1.Y(1));
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((Integer) obj2).getClass();
                y57.f((SupportSession) obj6, (fs4) obj4, (Function0) obj5, (Function1) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 20:
                Function0 function4 = (Function0) obj6;
                ol7 ol7Var = (ol7) obj5;
                String str = (String) obj3;
                String str2 = (String) obj4;
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else {
                    n67.c(function4, ol7Var.d, null, str, str2, ux2Var4, 0);
                }
                break;
            case 21:
                px4 px4Var3 = (px4) obj6;
                n37 n37Var = (n37) obj5;
                nd5 nd5Var = (nd5) obj3;
                hw2 hw2Var = (hw2) obj4;
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ux2Var5.Q();
                } else {
                    fs4 fs4VarD = j51.D(hm3.w(cs4Var, "Container"), new o43(new oq7(px4Var3, px4.class, "value", "getValue()Ljava/lang/Object;", 0), nd5Var, (byte) 19));
                    do4 do4VarC2 = ua0.c(xz2.f2564o, true);
                    int iHashCode2 = Long.hashCode(ux2Var5.T);
                    yj5 yj5VarL2 = ux2Var5.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var5, fs4VarD);
                    yz0.c.getClass();
                    ux2Var5.a0();
                    if (ux2Var5.S) {
                        ux2Var5.k(tg3Var);
                    } else {
                        ux2Var5.j0();
                    }
                    o67.n(do4VarC2, d82.v, ux2Var5);
                    o67.n(yj5VarL2, d82.u, ux2Var5);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var5);
                    o67.l(ux2Var5);
                    o67.n(fs4VarS2, d82.t, ux2Var5);
                    hw2Var.invoke(ux2Var5, 0);
                    ux2Var5.p(true);
                }
                break;
            case 22:
                iw2 iw2Var = (iw2) obj6;
                av7 av7Var = (av7) obj5;
                ou7 ou7Var = (ou7) obj3;
                cv7 cv7Var = (cv7) obj4;
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ux2Var6.Q();
                } else {
                    yu7 yu7Var = yu7.f2646o;
                    iw2Var.d(v67.q(yu7Var, av7Var, ou7Var.a(yu7Var), x67.q(cv7Var, yu7Var), ux2Var6), ux2Var6, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                x37.g(yo1.Y(1), (String) obj6, (String) obj3, (Function0) obj5, (ux2) obj, (fs4) obj4);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ z8(Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        this.m = b;
        this.p = obj;
        this.n = obj2;
        this.q = obj3;
        this.f2678o = obj4;
    }

    public /* synthetic */ z8(Object obj, Object obj2, fs4 fs4Var, Object obj3, int i, byte b) {
        this.m = b;
        this.p = obj;
        this.n = obj2;
        this.f2678o = fs4Var;
        this.q = obj3;
    }

    public /* synthetic */ z8(Object obj, fs4 fs4Var, Object obj2, Object obj3, int i, byte b) {
        this.m = b;
        this.p = obj;
        this.f2678o = fs4Var;
        this.n = obj2;
        this.q = obj3;
    }

    public /* synthetic */ z8(o9 o9Var, Function0 function0, Function0 function1, fs4 fs4Var, int i) {
        this.m = (byte) 1;
        this.n = o9Var;
        this.p = function0;
        this.q = function1;
        this.f2678o = fs4Var;
    }

    public /* synthetic */ z8(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.m = b;
        this.p = obj;
        this.n = obj2;
        this.q = obj3;
        this.f2678o = obj4;
    }

    public /* synthetic */ z8(fs4 fs4Var, Function0 function0, Function0 function1, Function0 function2, int i) {
        this.m = (byte) 4;
        this.f2678o = fs4Var;
        this.p = function0;
        this.n = function1;
        this.q = function2;
    }

    public /* synthetic */ z8(fs4 fs4Var, px4 px4Var, yy0 yy0Var, n40 n40Var) {
        this.m = (byte) 2;
        this.f2678o = fs4Var;
        this.p = px4Var;
        this.n = yy0Var;
        this.q = n40Var;
    }
}
