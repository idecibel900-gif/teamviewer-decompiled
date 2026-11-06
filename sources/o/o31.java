package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.remotecontrolviewlib.activity.OnBoardingActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o31 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1624o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ o31(fs4 fs4Var, px4 px4Var, yy0 yy0Var, n40 n40Var, Function0 function0) {
        this.m = (byte) 8;
        this.n = fs4Var;
        this.f1624o = px4Var;
        this.p = yy0Var;
        this.q = n40Var;
        this.r = function0;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        byte b2 = 6;
        cs4 cs4Var = cs4.b;
        byte b3 = 2;
        f88 f88Var = f88.a;
        Object obj3 = this.n;
        Object obj4 = this.r;
        Object obj5 = this.q;
        Object obj6 = this.p;
        Object obj7 = this.f1624o;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                e8.d((a06) obj7, (p31) obj6, (i31) obj5, (xg8) obj4, (fs4) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ck3.c((ArrayList) obj7, (Function0) obj6, (Function1) obj5, (fs4) obj3, (xy6) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                vn4.P((fs4) obj3, (xy6) obj7, (Function1) obj6, (Function0) obj5, (a91) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                us1.e((i13) obj7, (Function1) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                xs1.e((fs4) obj3, (xy6) obj7, (Function1) obj6, (Function0) obj5, (m13) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ep1.d((String) obj7, (String) obj6, (hw2) obj5, (Function0) obj4, (fs4) obj3, (ux2) obj, yo1.Y(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                xo1.m((j74) obj7, (f74) obj6, (fs4) obj3, (k74) obj5, (nd5) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 7:
                q37 q37Var = (q37) obj6;
                OnBoardingActivity onBoardingActivity = (OnBoardingActivity) obj5;
                a06 a06Var = (a06) obj7;
                Function1 function1 = (Function1) obj4;
                Function0 function0 = (Function0) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = OnBoardingActivity.N;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    nv1.g(au8.s(cs4Var, ((rn4) ux2Var.j(un4.a)).a.p, kh.V), null, null, au8.O(-1872828826, new l21(q37Var, b3), ux2Var), null, 0, 0L, 0L, null, au8.O(-574830161, new q34(onBoardingActivity, a06Var, function1, function0, (byte) 4), ux2Var), ux2Var, 805309440, 502);
                }
                break;
            case 8:
                fs4 fs4Var = (fs4) obj3;
                px4 px4Var = (px4) obj7;
                yy0 yy0Var = (yy0) obj6;
                n40 n40Var = (n40) obj5;
                Function0 function2 = (Function0) obj4;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    Object objK = ux2Var2.K();
                    if (objK == e01.a) {
                        objK = new va(px4Var, (byte) 19);
                        ux2Var2.g0(objK);
                    }
                    fs4 fs4VarR0 = db8.r0(fs4Var, (Function1) objK);
                    do4 do4VarC = ua0.c(xz2.f2564o, true);
                    int iHashCode = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL = ux2Var2.l();
                    fs4 fs4VarS = uf0.s(ux2Var2, fs4VarR0);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(LayoutNode.e0);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var2);
                    o67.n(yj5VarL, d82.u, ux2Var2);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                    o67.l(ux2Var2);
                    o67.n(fs4VarS, d82.t, ux2Var2);
                    yy0Var.invoke(ux2Var2, 0);
                    n40Var.b(function2, ux2Var2, 6);
                    ux2Var2.p(true);
                }
                break;
            case ep1.b /* 9 */:
                ((Integer) obj2).getClass();
                bt1.h((String) obj7, (String) obj6, (Function0) obj5, (fs4) obj3, (xy6) obj4, (ux2) obj, yo1.Y(1));
                break;
            case ep1.c /* 10 */:
                ((Integer) obj2).getClass();
                ds1.x((fs4) obj3, (xy6) obj7, (Function1) obj6, (Function0) obj5, (rr6) obj4, (ux2) obj, yo1.Y(1));
                break;
            case 11:
                q37 q37Var2 = (q37) obj7;
                ud7 ud7Var = (ud7) obj6;
                px4 px4Var2 = (px4) obj5;
                Function1 function3 = (Function1) obj4;
                Function0 function4 = (Function0) obj3;
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ux2Var3.Q();
                } else {
                    nv1.g(au8.s(cs4Var, ((rn4) ux2Var3.j(un4.a)).a.p, kh.V), null, null, au8.O(-189575534, new l21(q37Var2, b2), ux2Var3), null, 0, 0L, 0L, null, au8.O(-970906213, new q34(ud7Var, px4Var2, function3, function4), ux2Var3), ux2Var3, 805309440, 502);
                }
                break;
            case ep1.d /* 12 */:
                ((Integer) obj2).getClass();
                i67.b((String) obj7, (List) obj6, (fs4) obj3, (Boolean) obj5, (String) obj4, (ux2) obj, yo1.Y(1));
                break;
            default:
                ((Integer) obj2).getClass();
                l47.a((String) obj7, (rv0) obj6, (xl1) obj5, (am1) obj4, (bm1) obj3, (ux2) obj, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ o31(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.m = b;
        this.f1624o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
        this.n = obj5;
    }

    public /* synthetic */ o31(Object obj, Object obj2, fs4 fs4Var, Object obj3, Object obj4, int i, byte b) {
        this.m = b;
        this.f1624o = obj;
        this.p = obj2;
        this.n = fs4Var;
        this.q = obj3;
        this.r = obj4;
    }

    public /* synthetic */ o31(Serializable serializable, Object obj, pw2 pw2Var, fs4 fs4Var, xy6 xy6Var, int i, byte b) {
        this.m = b;
        this.f1624o = serializable;
        this.p = obj;
        this.q = pw2Var;
        this.n = fs4Var;
        this.r = xy6Var;
    }

    public /* synthetic */ o31(fs4 fs4Var, xy6 xy6Var, Function1 function1, Function0 function0, Enum r5, int i, byte b) {
        this.m = b;
        this.n = fs4Var;
        this.f1624o = xy6Var;
        this.p = function1;
        this.q = function0;
        this.r = r5;
    }

    public /* synthetic */ o31(q37 q37Var, OnBoardingActivity onBoardingActivity, a06 a06Var, Function1 function1, Function0 function0) {
        this.m = (byte) 7;
        this.p = q37Var;
        this.q = onBoardingActivity;
        this.f1624o = a06Var;
        this.r = function1;
        this.n = function0;
    }

    public /* synthetic */ o31(q37 q37Var, ud7 ud7Var, px4 px4Var, Function1 function1, Function0 function0) {
        this.m = (byte) 11;
        this.f1624o = q37Var;
        this.p = ud7Var;
        this.q = px4Var;
        this.r = function1;
        this.n = function0;
    }
}
