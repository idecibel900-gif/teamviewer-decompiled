package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zq6 implements jw2 {
    public final /* synthetic */ List m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SupportSession f2728o;
    public final /* synthetic */ nr6 p;
    public final /* synthetic */ me1 q;
    public final /* synthetic */ w44 r;

    public zq6(List list, boolean z, SupportSession supportSession, nr6 nr6Var, me1 me1Var, w44 w44Var) {
        this.m = list;
        this.n = z;
        this.f2728o = supportSession;
        this.p = nr6Var;
        this.q = me1Var;
        this.r = w44Var;
    }

    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        w44 w44Var;
        me1 me1Var;
        SupportSession supportSession;
        w14 w14Var = (w14) obj;
        int iIntValue = ((Number) obj2).intValue();
        ux2 ux2Var = (ux2) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (ux2Var.f(w14Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ux2Var.d(iIntValue) ? 32 : 16;
        }
        if (ux2Var.N(i & 1, (i & 147) != 146)) {
            SupportSession supportSession2 = (SupportSession) this.m.get(iIntValue);
            ux2Var.W(-469950518);
            boolean z = this.n;
            boolean z2 = z && (supportSession = this.f2728o) != null && supportSession2.getSessioncode() == supportSession.getSessioncode();
            boolean zG = ux2Var.g(z);
            me1 me1Var2 = this.q;
            boolean zH = zG | ux2Var.h(me1Var2);
            w44 w44Var2 = this.r;
            boolean zF = zH | ux2Var.f(w44Var2);
            int i3 = (i & 112) ^ 48;
            boolean z3 = (i3 > 32 && ux2Var.d(iIntValue)) || (i & 48) == 32;
            nr6 nr6Var = this.p;
            boolean zH2 = zF | z3 | ux2Var.h(nr6Var);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (zH2 || objK == awVar) {
                i2 = i3;
                w44Var = w44Var2;
                me1Var = me1Var2;
                yq6 yq6Var = new yq6(this.n, this.q, nr6Var, this.r, iIntValue, (byte) 0);
                ux2Var.g0(yq6Var);
                objK = yq6Var;
            } else {
                me1Var = me1Var2;
                w44Var = w44Var2;
                i2 = i3;
            }
            Function1 function1 = (Function1) objK;
            boolean zH3 = ux2Var.h(me1Var) | ux2Var.g(z) | ux2Var.f(w44Var) | ((i2 > 32 && ux2Var.d(iIntValue)) || (i & 48) == 32) | ux2Var.h(nr6Var);
            Object objK2 = ux2Var.K();
            if (zH3 || objK2 == awVar) {
                objK2 = new yq6(this.n, this.q, nr6Var, this.r, iIntValue, (byte) 1);
                ux2Var.g0(objK2);
            }
            Function1 function2 = (Function1) objK2;
            Function0 function0 = nr6Var.a;
            Function1 function3 = nr6Var.b;
            Function1 function4 = nr6Var.d;
            Function1 function5 = nr6Var.e;
            Function1 function6 = nr6Var.f;
            Function1 function7 = nr6Var.g;
            Function1 function8 = nr6Var.h;
            Function1 function9 = nr6Var.i;
            Function1 function10 = nr6Var.k;
            Function1 function11 = nr6Var.l;
            hw2 hw2Var = nr6Var.m;
            function0.getClass();
            function3.getClass();
            function1.getClass();
            function4.getClass();
            function5.getClass();
            function6.getClass();
            function7.getClass();
            function8.getClass();
            function9.getClass();
            function2.getClass();
            function10.getClass();
            function11.getClass();
            hw2Var.getClass();
            wo1.s(supportSession2, this.n, new nr6(function0, function3, function1, function4, function5, function6, function7, function8, function9, function2, function10, function11, hw2Var), null, z2, ux2Var, 0, 8);
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        return f88.a;
    }
}
