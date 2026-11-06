package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModelSWIGJNI;
import com.teamviewer.teamviewerlib.event.EventHub;

/* JADX INFO: loaded from: classes.dex */
public final class jf3 extends oe8 {
    public final IInAppPurchaseViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final yt2 f1160o;
    public final EventHub p;
    public final SharedPreferences q;
    public final yx6 r;
    public final r36 s;
    public final yx6 t;
    public final r36 u;
    public final yx6 v;
    public final r36 w;
    public final yx6 x;
    public final r36 y;
    public final bg5 z;

    public jf3(IInAppPurchaseViewModel iInAppPurchaseViewModel, yt2 yt2Var, EventHub eventHub, SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.n = iInAppPurchaseViewModel;
        this.f1160o = yt2Var;
        this.p = eventHub;
        this.q = sharedPreferences;
        yx6 yx6VarL = au8.l(0, 7, null);
        this.r = yx6VarL;
        this.s = new r36(yx6VarL);
        yx6 yx6VarL2 = au8.l(0, 7, null);
        this.t = yx6VarL2;
        this.u = new r36(yx6VarL2);
        yx6 yx6VarL3 = au8.l(0, 7, null);
        this.v = yx6VarL3;
        this.w = new r36(yx6VarL3);
        yx6 yx6VarL4 = au8.l(0, 7, null);
        this.x = yx6VarL4;
        this.y = new r36(yx6VarL4);
        this.z = h57.p(null);
    }

    @Override // o.oe8
    public final void U0() {
        this.n.a();
    }

    public final void V0() {
        IInAppPurchaseViewModel iInAppPurchaseViewModel = this.n;
        byte b = 0;
        if (!IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_IsAccountLoggedIn(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel)) {
            im3.R(e8.n(this), null, null, new if3(this, (hc1) null, b), 3);
            return;
        }
        gu0 gu0VarN = e8.n(this);
        gf3 gf3Var = new gf3(this, b);
        this.f1160o.G(gu0VarN, new hf3(this, b), gf3Var);
    }
}
