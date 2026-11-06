package o;

import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ao5 implements jw2 {
    public final /* synthetic */ List m;
    public final /* synthetic */ UUID n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f343o;

    public ao5(List list, UUID uuid, Function1 function1) {
        this.m = list;
        this.n = uuid;
        this.f343o = function1;
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
            wn5 wn5Var = (wn5) this.m.get(iIntValue);
            ux2Var.W(-224931167);
            String str = wn5Var.b;
            UUID uuid = wn5Var.a;
            boolean zN = im3.n(this.n, uuid);
            Function1 function1 = this.f343o;
            boolean zF = ux2Var.f(function1) | ux2Var.h(wn5Var);
            Object objK = ux2Var.K();
            if (zF || objK == e01.a) {
                objK = new e3((byte) 19, function1, wn5Var, false);
                ux2Var.g0(objK);
            }
            ct1.i(str, R.drawable.ic_policy, zN, (Function0) objK, androidx.compose.ui.platform.a.a(cs4.b, "TVTA-devicesScreen-deviceEditScreen-policySelector-policy-" + uuid), ux2Var, 0);
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        return f88.a;
    }
}
