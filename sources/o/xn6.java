package o;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xn6 implements jw2 {
    public final /* synthetic */ ArrayList m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2539o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ Function1 q;

    public xn6(ArrayList arrayList, String str, boolean z, Function1 function1, Function1 function2) {
        this.m = arrayList;
        this.n = str;
        this.f2539o = z;
        this.p = function1;
        this.q = function2;
    }

    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
            z31 z31Var = (z31) this.m.get(iIntValue);
            ux2Var.W(555146382);
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4.b, this.n + "-device");
            Function1 function1 = this.p;
            boolean zF = ux2Var.f(function1);
            Function1 function2 = this.q;
            boolean zF2 = zF | ux2Var.f(function2) | ux2Var.f(z31Var);
            Object objK = ux2Var.K();
            if (zF2 || objK == e01.a) {
                objK = new yp1(function1, function2, z31Var, (byte) 3);
                ux2Var.g0(objK);
            }
            iq8.d(z31Var, fs4VarA, null, this.f2539o, false, (Function0) objK, ux2Var, 0, 20);
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        return f88.a;
    }
}
