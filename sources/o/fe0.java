package o;

import android.content.res.Resources;
import com.teamviewer.remotecontrollib.swig.IConnectivityStateViewModel;
import com.teamviewer.remotecontrollib.swig.IConnectivityStateViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public final class fe0 extends oe8 implements y93 {
    public final IConnectivityStateViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Resources f787o;
    public final nw4 p = new nw4();
    public final nw4 q = new nw4();
    public final VoidSignalCallback r;

    public fe0(IConnectivityStateViewModel iConnectivityStateViewModel, q7 q7Var, Resources resources) {
        this.n = iConnectivityStateViewModel;
        this.f787o = resources;
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y(this, (byte) 20));
        this.r = voidSignalCallback;
        IConnectivityStateViewModelSWIGJNI.IConnectivityStateViewModel_RegisterForChanges(iConnectivityStateViewModel.a, iConnectivityStateViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        V0();
    }

    @Override // o.oe8
    public final void U0() {
        this.r.Disconnect();
        this.n.a();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a A[LOOP:0: B:9:0x0021->B:22:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final void V0() {
        int length;
        int i;
        ka3 ka3Var;
        ka3 ka3Var2;
        IConnectivityStateViewModel iConnectivityStateViewModel = this.n;
        int iIConnectivityStateViewModel_GetState = IConnectivityStateViewModelSWIGJNI.IConnectivityStateViewModel_GetState(iConnectivityStateViewModel.a, iConnectivityStateViewModel);
        ka3 ka3Var3 = ka3.Connecting;
        ka3[] ka3VarArr = (ka3[]) ka3.class.getEnumConstants();
        if (iIConnectivityStateViewModel_GetState >= ka3VarArr.length || iIConnectivityStateViewModel_GetState < 0) {
            length = ka3VarArr.length;
            i = 0;
            while (true) {
                if (i < length) {
                    hk0.g(ua5.k(iIConnectivityStateViewModel_GetState, ka3.class, "No enum ", " with value "));
                    return;
                }
                ka3Var = ka3VarArr[i];
                if (ka3Var.m == iIConnectivityStateViewModel_GetState) {
                    ka3Var2 = ka3Var;
                    break;
                }
                i++;
            }
        } else {
            ka3Var2 = ka3VarArr[iIConnectivityStateViewModel_GetState];
            if (ka3Var2.m != iIConnectivityStateViewModel_GetState) {
                length = ka3VarArr.length;
                i = 0;
                while (true) {
                    if (i < length) {
                        hk0.g(ua5.k(iIConnectivityStateViewModel_GetState, ka3.class, "No enum ", " with value "));
                        return;
                    }
                    ka3Var = ka3VarArr[i];
                    if (ka3Var.m == iIConnectivityStateViewModel_GetState) {
                        ka3Var2 = ka3Var;
                        break;
                    }
                    i++;
                }
            }
        }
        this.p.setValue(Boolean.valueOf(ka3.Connecting == ka3Var2));
        this.q.setValue(Boolean.valueOf(ka3.Offline == ka3Var2));
    }
}
