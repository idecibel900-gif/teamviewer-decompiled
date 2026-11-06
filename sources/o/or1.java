package o;

import com.teamviewer.remotecontrollib.swig.IAlarmsSumsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapper;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperVector;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class or1 extends oe8 implements sa3 {
    public final IAlarmsSumsViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ComputerDetailsViewModel f1669o;
    public IAlertViewModelWrapperVector p;
    public final nw4 q = new nw4();
    public final nw4 r = new nw4();
    public final nw4 s = new nw4();
    public final nw4 t;
    public final VoidSignalCallback u;
    public final VoidSignalCallback v;
    public final VoidSignalCallback w;

    public or1(IAlarmsSumsViewModel iAlarmsSumsViewModel, ComputerDetailsViewModel computerDetailsViewModel) {
        this.n = iAlarmsSumsViewModel;
        this.f1669o = computerDetailsViewModel;
        nw4 nw4Var = new nw4();
        this.t = nw4Var;
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        final byte b = 0;
        VoidSignalCallback voidSignalCallback = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.nr1
            public final /* synthetic */ or1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                f88 f88Var = f88.a;
                or1 or1Var = this.n;
                switch (b2) {
                    case 0:
                        or1Var.t.postValue(Boolean.TRUE);
                        break;
                    case 1:
                        or1Var.t.postValue(Boolean.FALSE);
                        break;
                    default:
                        or1Var.V0();
                        break;
                }
                return f88Var;
            }
        });
        this.u = voidSignalCallback;
        final byte b2 = 1;
        VoidSignalCallback voidSignalCallback2 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.nr1
            public final /* synthetic */ or1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                or1 or1Var = this.n;
                switch (b3) {
                    case 0:
                        or1Var.t.postValue(Boolean.TRUE);
                        break;
                    case 1:
                        or1Var.t.postValue(Boolean.FALSE);
                        break;
                    default:
                        or1Var.V0();
                        break;
                }
                return f88Var;
            }
        });
        this.v = voidSignalCallback2;
        final byte b3 = 2;
        VoidSignalCallback voidSignalCallback3 = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.nr1
            public final /* synthetic */ or1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                f88 f88Var = f88.a;
                or1 or1Var = this.n;
                switch (b4) {
                    case 0:
                        or1Var.t.postValue(Boolean.TRUE);
                        break;
                    case 1:
                        or1Var.t.postValue(Boolean.FALSE);
                        break;
                    default:
                        or1Var.V0();
                        break;
                }
                return f88Var;
            }
        });
        this.w = voidSignalCallback3;
        nw4Var.setValue(Boolean.valueOf(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsProMonitoring(computerDetailsViewModel.a, computerDetailsViewModel)));
        V0();
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForAlertsListChanged(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback3), voidSignalCallback3);
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForMonitoringInstallation(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForMonitoringUnInstallation(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
    }

    @Override // o.oe8
    public final void U0() {
        VoidSignalCallback voidSignalCallback = this.u;
        voidSignalCallback.Disconnect();
        VoidSignalCallback voidSignalCallback2 = this.v;
        voidSignalCallback2.Disconnect();
        voidSignalCallback.Disconnect();
        voidSignalCallback2.Disconnect();
        this.w.Disconnect();
        this.n.a();
        this.f1669o.b();
        IAlertViewModelWrapperVector iAlertViewModelWrapperVector = this.p;
        if (iAlertViewModelWrapperVector != null) {
            iAlertViewModelWrapperVector.a();
        }
    }

    public final void V0() {
        int size;
        ComputerDetailsViewModel computerDetailsViewModel = this.f1669o;
        this.t.postValue(Boolean.valueOf(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsProMonitoring(computerDetailsViewModel.a, computerDetailsViewModel)));
        IAlertViewModelWrapperVector iAlertViewModelWrapperVector = this.p;
        if (iAlertViewModelWrapperVector != null) {
            iAlertViewModelWrapperVector.a();
        }
        IAlertViewModelWrapperVector iAlertViewModelWrapperVectorA = computerDetailsViewModel.a();
        this.p = iAlertViewModelWrapperVectorA;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iAlertViewModelWrapperVectorA) {
            IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) obj;
            if (IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_IsAcknowledged(iAlertViewModelWrapper.a, iAlertViewModelWrapper)) {
                arrayList.add(obj);
            }
        }
        this.q.postValue(Integer.valueOf(arrayList.size()));
        IAlertViewModelWrapperVector iAlertViewModelWrapperVector2 = this.p;
        if (iAlertViewModelWrapperVector2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : iAlertViewModelWrapperVector2) {
                IAlertViewModelWrapper iAlertViewModelWrapper2 = (IAlertViewModelWrapper) obj2;
                if (!IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_IsAcknowledged(iAlertViewModelWrapper2.a, iAlertViewModelWrapper2)) {
                    arrayList2.add(obj2);
                }
            }
            size = arrayList2.size();
        } else {
            size = 0;
        }
        this.r.postValue(Integer.valueOf(size));
        IAlertViewModelWrapperVector iAlertViewModelWrapperVector3 = this.p;
        this.s.postValue(iAlertViewModelWrapperVector3 != null ? Integer.valueOf(ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_doSize(iAlertViewModelWrapperVector3.m, iAlertViewModelWrapperVector3)) : null);
    }
}
