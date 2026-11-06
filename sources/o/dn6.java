package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dn6 implements jw2 {
    public final /* synthetic */ List m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f638o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ iw2 q;
    public final /* synthetic */ String r;

    public dn6(List list, Function1 function1, Function1 function2, Function1 function3, iw2 iw2Var, String str) {
        this.m = list;
        this.n = function1;
        this.f638o = function2;
        this.p = function3;
        this.q = iw2Var;
        this.r = str;
    }

    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        yy0 yy0VarO;
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
            Object obj5 = this.m.get(iIntValue);
            ux2Var.W(47974402);
            String str = (String) this.n.invoke(obj5);
            boolean zBooleanValue = ((Boolean) this.f638o.invoke(obj5)).booleanValue();
            Function1 function1 = this.p;
            boolean zF = ux2Var.f(function1) | ux2Var.h(obj5);
            Object objK = ux2Var.K();
            if (zF || objK == e01.a) {
                objK = new cn6(function1, obj5, (byte) 0);
                ux2Var.g0(objK);
            }
            Function0 function0 = (Function0) objK;
            iw2 iw2Var = this.q;
            if (iw2Var == null) {
                ux2Var.W(48191710);
                ux2Var.p(false);
                yy0VarO = null;
            } else {
                ux2Var.W(48191711);
                yy0VarO = au8.O(-545365929, new go1(iw2Var, obj5, (byte) 1), ux2Var);
                ux2Var.p(false);
            }
            vt1.e(str, zBooleanValue, function0, yy0VarO, androidx.compose.ui.platform.a.a(cs4.b, this.r), ux2Var, 0);
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        return f88.a;
    }
}
