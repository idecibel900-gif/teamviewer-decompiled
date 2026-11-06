package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModelSWIGJNI;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vk4 implements View.OnClickListener {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ qb3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xk4 f2322o;

    public /* synthetic */ vk4(qb3 qb3Var, xk4 xk4Var) {
        this.n = qb3Var;
        this.f2322o = xk4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.m;
        xk4 xk4Var = this.f2322o;
        qb3 qb3Var = this.n;
        switch (b) {
            case 0:
                LifecycleOwner lifecycleOwnerL = n67.l(xk4Var.G);
                if (lifecycleOwnerL != null) {
                    im3.R(us1.B(lifecycleOwnerL), null, null, new y0(qb3Var, null, (byte) 21), 3);
                }
                xk4Var.H.j();
                break;
            default:
                xd0 xd0Var = (xd0) qb3Var;
                nc0 nc0Var = xd0Var.D;
                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = xd0Var.C;
                nc0Var.getClass();
                iManagedDeviceV2ViewModel.getClass();
                IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_WakeOnLan(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel);
                xk4Var.H.j();
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(dh8.WakeUpFromDeviceList);
                break;
        }
    }

    public /* synthetic */ vk4(xk4 xk4Var, qb3 qb3Var) {
        this.f2322o = xk4Var;
        this.n = qb3Var;
    }
}
