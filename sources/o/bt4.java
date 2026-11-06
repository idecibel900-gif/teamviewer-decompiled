package o;

import android.content.res.Resources;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoringOverviewEndpointListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoringOverviewEndpointListViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bt4 extends oe8 implements zd {
    public final oc0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dd f454o;
    public ArrayList p;
    public VoidSignalCallback q;

    public bt4(oc0 oc0Var, dd ddVar) {
        ddVar.getClass();
        this.n = oc0Var;
        this.f454o = ddVar;
        this.p = new ArrayList();
        O();
    }

    @Override // o.zd
    public final oq0 E0(int i) {
        ComputerDetailsViewModel computerDetailsViewModel = (ComputerDetailsViewModel) this.p.get(i);
        computerDetailsViewModel.getClass();
        PListComputerID pListComputerID = new PListComputerID(0, ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetID(computerDetailsViewModel.a, computerDetailsViewModel));
        long jPListComputerID_GetInternalID = PListComputerIDSWIGJNI.PListComputerID_GetInternalID(pListComputerID.a, pListComputerID);
        if (it1.c != null) {
            return ep3.k(jPListComputerID_GetInternalID, this.f454o);
        }
        im3.e0("viewFactory");
        throw null;
    }

    @Override // o.zd
    public final void M0() {
        VoidSignalCallback voidSignalCallback = this.q;
        if (voidSignalCallback != null) {
            voidSignalCallback.Disconnect();
        }
    }

    @Override // o.zd
    public final void O() {
        Function1 ek3Var;
        ArrayList arrayList;
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((ComputerDetailsViewModel) it.next()).b();
        }
        this.p.clear();
        int iOrdinal = this.f454o.ordinal();
        int i = 0;
        if (iOrdinal == 0) {
            ek3Var = new ek3((byte) 28);
        } else if (iOrdinal == 1) {
            ek3Var = new ek3((byte) 29);
        } else {
            if (iOrdinal != 2) {
                gk0.s();
                return;
            }
            ek3Var = new at4((byte) 0);
        }
        oc0 oc0Var = this.n;
        if (oc0Var != null) {
            IMonitoringOverviewEndpointListViewModel iMonitoringOverviewEndpointListViewModel = oc0Var.n;
            int iIMonitoringOverviewEndpointListViewModel_EndpointsCount = (int) IMonitoringOverviewEndpointListViewModelSWIGJNI.IMonitoringOverviewEndpointListViewModel_EndpointsCount(iMonitoringOverviewEndpointListViewModel.a, iMonitoringOverviewEndpointListViewModel);
            while (true) {
                arrayList = this.p;
                if (i >= iIMonitoringOverviewEndpointListViewModel_EndpointsCount) {
                    break;
                }
                long jIMonitoringOverviewEndpointListViewModel_GetEndpointViewModel = IMonitoringOverviewEndpointListViewModelSWIGJNI.IMonitoringOverviewEndpointListViewModel_GetEndpointViewModel(iMonitoringOverviewEndpointListViewModel.a, iMonitoringOverviewEndpointListViewModel, i);
                ComputerDetailsViewModel computerDetailsViewModel = jIMonitoringOverviewEndpointListViewModel_GetEndpointViewModel == 0 ? null : new ComputerDetailsViewModel(jIMonitoringOverviewEndpointListViewModel_GetEndpointViewModel);
                computerDetailsViewModel.getClass();
                arrayList.add(computerDetailsViewModel);
                i++;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Boolean) ek3Var.invoke(obj)).booleanValue()) {
                    arrayList2.add(obj);
                }
            }
            this.p = new ArrayList(arrayList2);
        }
    }

    @Override // o.zd
    public final void Q(Function0 function0) {
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(function0);
        this.q = voidSignalCallback;
        oc0 oc0Var = this.n;
        if (oc0Var != null) {
            IMonitoringOverviewEndpointListViewModel iMonitoringOverviewEndpointListViewModel = oc0Var.n;
            IMonitoringOverviewEndpointListViewModelSWIGJNI.IMonitoringOverviewEndpointListViewModel_RegisterForChanges(iMonitoringOverviewEndpointListViewModel.a, iMonitoringOverviewEndpointListViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        }
    }

    @Override // o.oe8
    public final void U0() {
        VoidSignalCallback voidSignalCallback = this.q;
        if (voidSignalCallback != null) {
            voidSignalCallback.Disconnect();
        }
    }

    @Override // o.zd
    public final eh7 getItem(int i) {
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            return null;
        }
        ComputerDetailsViewModel computerDetailsViewModel = (ComputerDetailsViewModel) this.p.get(i);
        computerDetailsViewModel.getClass();
        dd ddVar = this.f454o;
        ddVar.getClass();
        ja3 ja3Var = c36Var.h;
        xt6 xt6Var = c36Var.f;
        RemoteControlApplication remoteControlApplication = c36Var.a;
        kc0 kc0Var = new kc0(computerDetailsViewModel, new nc0(ja3Var, xt6Var, remoteControlApplication));
        Resources resources = remoteControlApplication.getResources();
        resources.getClass();
        return new j93(kc0Var, ddVar, resources);
    }

    @Override // o.zd
    public final int o() {
        return this.p.size();
    }
}
