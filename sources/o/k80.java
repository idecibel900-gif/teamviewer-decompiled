package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k80 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    public /* synthetic */ k80(Function0 function0, byte b) {
        this.m = b;
        this.n = function0;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        Function0 function0 = this.n;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ga0.c(0, function0, ux2Var, null);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            case 1:
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((w14) obj).getClass();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strZ = m77.z(R.string.device_tab_device_details_bookmarked_sheet_title, ux2Var2);
                    h72 h72Var = un4.a;
                    ot7 ot7Var = ((rn4) ux2Var2.j(h72Var)).b.g;
                    cs4 cs4Var = cs4.b;
                    qs7.b(strZ, androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ot7Var, ux2Var2, 48, 0, 130044);
                    lv1.k(ka0.F(cs4Var, 0.0f, 16.0f, 0.0f, 8.0f, 5), 0.0f, 0L, ux2Var2, 6, 6);
                    qs7.b(m77.z(R.string.device_tab_device_details_bookmarked_sheet_text, ux2Var2), ka0.F(cs4Var, 16.0f, 0.0f, 16.0f, 16.0f, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var2, 48, 0, 131068);
                    m77.g(this.n, androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), null, false, null, null, uf0.f2206o, ux2Var2, 1572912, 60);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            case 2:
                ux2 ux2Var3 = (ux2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    qs1.r(0, function0, ux2Var3, null);
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
            case 3:
                ux2 ux2Var4 = (ux2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((w14) obj).getClass();
                if (ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String strZ2 = m77.z(R.string.device_tab_device_details_password_warning_sheet_title, ux2Var4);
                    h72 h72Var2 = un4.a;
                    ot7 ot7Var2 = ((rn4) ux2Var4.j(h72Var2)).b.g;
                    cs4 cs4Var2 = cs4.b;
                    qs7.b(strZ2, androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f), 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ot7Var2, ux2Var4, 48, 0, 130044);
                    lv1.k(ka0.F(cs4Var2, 0.0f, 16.0f, 0.0f, 8.0f, 5), 0.0f, 0L, ux2Var4, 6, 6);
                    qs7.b(m77.z(R.string.device_tab_device_details_password_warning_sheet_text, ux2Var4), ka0.F(cs4Var2, 16.0f, 0.0f, 16.0f, 16.0f, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var4.j(h72Var2)).b.k, ux2Var4, 48, 0, 131068);
                    m77.g(this.n, androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f), null, false, null, null, ck3.v, ux2Var4, 1572912, 60);
                } else {
                    ux2Var4.Q();
                }
                return f88Var;
            default:
                fo4 fo4Var = (fo4) obj;
                zn4 zn4Var = (zn4) obj2;
                r61 r61Var = (r61) obj3;
                float f = ((w32) function0.a()).m;
                jl5 jl5VarC = zn4Var.C(r61.b(r61Var.a, 0, 0, t61.f(w32.b(f, Float.NaN) ? 0 : fo4Var.q0(f), r61Var.a), 0, 11));
                return fo4Var.u(jl5VarC.m, jl5VarC.n, fa2.m, new v0(jl5VarC, (byte) 13));
        }
    }
}
