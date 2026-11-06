package o;

import android.view.View;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModelSWIGJNI;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk4 implements Function1 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ qb3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xk4 f2119o;

    public /* synthetic */ tk4(qb3 qb3Var, xk4 xk4Var) {
        this.n = qb3Var;
        this.f2119o = xk4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        xk4 xk4Var = this.f2119o;
        qb3 qb3Var = this.n;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                View view = xk4Var.O;
                if (!zBooleanValue) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                    view.setOnClickListener(new vk4(qb3Var, xk4Var));
                }
                break;
            default:
                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = ((p1) qb3Var).n;
                boolean zIManagedDeviceV2ViewModel_ShowConnect = IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_ShowConnect(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel);
                View view2 = xk4Var.N;
                if (!zIManagedDeviceV2ViewModel_ShowConnect) {
                    view2.setVisibility(8);
                } else {
                    view2.setVisibility(0);
                    view2.setOnClickListener(new vk4(xk4Var, qb3Var));
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ tk4(xk4 xk4Var, qb3 qb3Var) {
        this.f2119o = xk4Var;
        this.n = qb3Var;
    }
}
