package o;

import android.content.res.Resources;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedGroupV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedGroupV2ViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.StringSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class rk4 extends oe8 implements rb3 {
    public final nw4 A;
    public final nw4 B;
    public final nw4 C;
    public final StringSignalCallback D;
    public final qb3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ManagedGroupV2ViewModel f1927o;
    public final LicenseViewModel p;
    public final nw4 q;
    public final nw4 r;
    public final nw4 s;
    public final nw4 t;
    public final nw4 u;
    public final nw4 v;
    public final nw4 w;
    public final nw4 x;
    public final nw4 y;
    public final nw4 z;

    public rk4(qb3 qb3Var, ManagedGroupV2ViewModel managedGroupV2ViewModel, LicenseViewModel licenseViewModel, Resources resources) {
        String string;
        nw4 nw4Var;
        nw4 nw4Var2;
        nw4 nw4Var3;
        nw4 nw4Var4;
        nw4 nw4Var5;
        nw4 nw4Var6;
        nw4 nw4Var7;
        nw4 nw4Var8;
        nw4 nw4Var9;
        nw4 nw4Var10;
        nw4 nw4Var11;
        nw4 nw4Var12;
        this.n = qb3Var;
        this.f1927o = managedGroupV2ViewModel;
        this.p = licenseViewModel;
        this.q = (qb3Var == null || (nw4Var12 = ((p1) qb3Var).f1692o) == null) ? new nw4() : nw4Var12;
        this.r = (qb3Var == null || (nw4Var11 = ((p1) qb3Var).q) == null) ? new nw4() : nw4Var11;
        this.s = (qb3Var == null || (nw4Var10 = ((p1) qb3Var).f1692o) == null) ? new nw4() : nw4Var10;
        this.t = (qb3Var == null || (nw4Var9 = ((p1) qb3Var).s) == null) ? new nw4() : nw4Var9;
        this.u = (qb3Var == null || (nw4Var8 = ((p1) qb3Var).f1692o) == null) ? new nw4() : nw4Var8;
        this.v = (qb3Var == null || (nw4Var7 = ((p1) qb3Var).r) == null) ? new nw4() : nw4Var7;
        this.w = (qb3Var == null || (nw4Var6 = ((p1) qb3Var).u) == null) ? new nw4() : nw4Var6;
        this.x = (qb3Var == null || (nw4Var5 = ((p1) qb3Var).v) == null) ? new nw4() : nw4Var5;
        this.y = (qb3Var == null || (nw4Var4 = ((p1) qb3Var).w) == null) ? new nw4() : nw4Var4;
        this.z = (qb3Var == null || (nw4Var3 = ((p1) qb3Var).x) == null) ? new nw4() : nw4Var3;
        this.A = (qb3Var == null || (nw4Var2 = ((p1) qb3Var).y) == null) ? new nw4() : nw4Var2;
        this.B = (qb3Var == null || (nw4Var = ((p1) qb3Var).z) == null) ? new nw4() : nw4Var;
        if (managedGroupV2ViewModel == null || (string = ManagedGroupV2ViewModelSWIGJNI.ManagedGroupV2ViewModel_GetGroupName(managedGroupV2ViewModel.a, managedGroupV2ViewModel)) == null) {
            string = resources.getString(R.string.tv_managed_device_title);
            string.getClass();
        }
        this.C = new nw4(string);
        StringSignalCallback stringSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().stringSignalCallback(new fj3((Object) this, (byte) 10));
        this.D = stringSignalCallback;
        if (managedGroupV2ViewModel != null) {
            ManagedGroupV2ViewModelSWIGJNI.ManagedGroupV2ViewModel_RegisterForNameChanges(managedGroupV2ViewModel.a, managedGroupV2ViewModel, StringSignalCallback.getCPtr(stringSignalCallback), stringSignalCallback);
        }
    }

    @Override // o.oe8
    public final void U0() {
        this.D.Disconnect();
        ManagedGroupV2ViewModel managedGroupV2ViewModel = this.f1927o;
        if (managedGroupV2ViewModel != null) {
            managedGroupV2ViewModel.a();
        }
        this.p.a();
    }
}
