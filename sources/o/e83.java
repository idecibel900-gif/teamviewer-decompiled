package o;

import android.content.res.Resources;
import com.teamviewer.remotecontrolviewmodellib.swig.IToolbarClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.SessionWindowViewModelFactoryClientSWIGJNI;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e83 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f693o;

    public /* synthetic */ e83(int i, rr0 rr0Var) {
        this.m = (byte) 2;
        this.f693o = rr0Var;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        IToolbarClientViewModel iToolbarClientViewModel;
        switch (this.m) {
            case 0:
                i83 i83Var = (i83) this.f693o;
                int i = this.n;
                i83Var.w.getClass();
                synchronized (i83Var) {
                    i83Var.K.remove(Integer.valueOf(i));
                }
                return f88.a;
            case 1:
                int i2 = this.n;
                Resources resources = (Resources) this.f693o;
                long jPilotViewerViewModelFactoryNative_GetToolbarClientViewModel = SessionWindowViewModelFactoryClientSWIGJNI.PilotViewerViewModelFactoryNative_GetToolbarClientViewModel(i2);
                if (jPilotViewerViewModelFactoryNative_GetToolbarClientViewModel == 0) {
                    iToolbarClientViewModel = null;
                } else {
                    iToolbarClientViewModel = new IToolbarClientViewModel();
                    iToolbarClientViewModel.b = true;
                    iToolbarClientViewModel.a = jPilotViewerViewModelFactoryNative_GetToolbarClientViewModel;
                }
                iToolbarClientViewModel.getClass();
                return new cl5(iToolbarClientViewModel, resources);
            case 2:
                rr0 rr0Var = (rr0) this.f693o;
                return Integer.valueOf(((vs7) rr0Var.e).b.d(this.n));
            default:
                int i3 = this.n;
                yf5 yf5Var = (yf5) this.f693o;
                yf5Var.A(i3);
                int iZ = yf5Var.z();
                if (iZ == 0) {
                    IStatisticsHandler iStatisticsHandler = ga7.a;
                    ga7.a(ew6.OnRemoteTwoFactorAuthenticationSelected);
                } else if (iZ == 1) {
                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                    ga7.a(ew6.OnClassicTwoFactorAuthenticationSelected);
                }
                return f88.a;
        }
    }

    public /* synthetic */ e83(byte b, int i, Object obj) {
        this.m = b;
        this.n = i;
        this.f693o = obj;
    }

    public /* synthetic */ e83(i83 i83Var, int i, tc2 tc2Var) {
        this.m = (byte) 0;
        this.f693o = i83Var;
        this.n = i;
    }
}
