package o;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.journeyapps.barcodescanner.BarcodeView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ay5 implements iw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ BarcodeView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f375o;

    public /* synthetic */ ay5(BarcodeView barcodeView, boolean z, byte b) {
        this.m = b;
        this.n = barcodeView;
        this.f375o = z;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        String strM;
        String strM2;
        byte b = this.m;
        f88 f88Var = f88.a;
        tg3 tg3Var = LayoutNode.e0;
        boolean z = this.f375o;
        BarcodeView barcodeView = this.n;
        switch (b) {
            case 0:
                nd5 nd5Var = (nd5) obj;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                nd5Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ux2Var.f(nd5Var) ? 4 : 2;
                }
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ux2Var.Q();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.b.c;
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fillElement);
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
                    io1.b(barcodeView, fillElement, ux2Var, 48);
                    if (z) {
                        ux2Var.W(-959326066);
                        ux2Var.p(false);
                        strM = "";
                    } else {
                        strM = to7.m(ux2Var, 107599834, R.string.scan_qr_code_hint, ux2Var, false);
                    }
                    wo1.q(nd5Var, strM, null, ux2Var, iIntValue & 14);
                    ux2Var.p(true);
                }
                break;
            default:
                nd5 nd5Var2 = (nd5) obj;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                nd5Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ux2Var2.f(nd5Var2) ? 4 : 2;
                }
                int i = iIntValue2;
                if (!ux2Var2.N(i & 1, (i & 19) != 18)) {
                    ux2Var2.Q();
                } else {
                    FillElement fillElement2 = androidx.compose.foundation.layout.b.c;
                    do4 do4VarC2 = ua0.c(xz2.f2564o, false);
                    int iHashCode2 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL2 = ux2Var2.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var2, fillElement2);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(do4VarC2, d82.v, ux2Var2);
                    o67.n(yj5VarL2, d82.u, ux2Var2);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var2);
                    o67.l(ux2Var2);
                    o67.n(fs4VarS2, d82.t, ux2Var2);
                    boolean zH = ux2Var2.h(barcodeView);
                    Object objK = ux2Var2.K();
                    if (zH || objK == e01.a) {
                        objK = new xx5(barcodeView, (byte) 2);
                        ux2Var2.g0(objK);
                    }
                    di1.b((Function1) objK, fillElement2, null, ux2Var2, 48, 4);
                    if (z) {
                        ux2Var2.W(-1571776881);
                        ux2Var2.p(false);
                        strM2 = "";
                    } else {
                        strM2 = to7.m(ux2Var2, -1571893689, R.string.settings_twoFactorAuthentication_scanner_fallback, ux2Var2, false);
                    }
                    wo1.q(nd5Var2, strM2, null, ux2Var2, i & 14);
                    ux2Var2.p(true);
                }
                break;
        }
        return f88Var;
    }
}
