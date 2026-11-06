package o;

import android.os.Bundle;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListAlertID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListAlertIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapper;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperVector;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class br1 extends oe8 implements zd {
    public final kc0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f447o;
    public VoidSignalCallback p;
    public final Function1 q;

    public br1(kc0 kc0Var, long j, dd ddVar) {
        h31 h31Var;
        ddVar.getClass();
        this.n = kc0Var;
        this.f447o = j;
        int iOrdinal = ddVar.ordinal();
        if (iOrdinal == 0) {
            h31Var = new h31((byte) 17);
        } else if (iOrdinal == 1) {
            h31Var = new h31((byte) 18);
        } else {
            if (iOrdinal != 2) {
                gk0.s();
                throw null;
            }
            h31Var = new h31((byte) 19);
        }
        this.q = h31Var;
    }

    @Override // o.zd
    public final oq0 E0(int i) {
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        IAlertViewModelWrapperVector iAlertViewModelWrapperVectorA = this.n.n.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iAlertViewModelWrapperVectorA) {
            if (((Boolean) this.q.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) arrayList.get(i);
        iAlertViewModelWrapper.getClass();
        long jIAlertViewModelWrapper_GetID = IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_GetID(iAlertViewModelWrapper.a, iAlertViewModelWrapper);
        PListAlertID pListAlertID = new PListAlertID();
        pListAlertID.b = true;
        pListAlertID.a = jIAlertViewModelWrapper_GetID;
        String strPListAlertID_GetInternalID = PListAlertIDSWIGJNI.PListAlertID_GetInternalID(jIAlertViewModelWrapper_GetID, pListAlertID);
        strPListAlertID_GetInternalID.getClass();
        yq1 yq1Var = new yq1();
        Bundle bundle = new Bundle();
        bundle.putLong("memberId", this.f447o);
        bundle.putString("selectedAlertId", strPListAlertID_GetInternalID);
        yq1Var.u0(bundle);
        return yq1Var;
    }

    @Override // o.zd
    public final void M0() {
        VoidSignalCallback voidSignalCallback = this.p;
        if (voidSignalCallback != null) {
            voidSignalCallback.Disconnect();
        }
    }

    @Override // o.zd
    public final void O() {
    }

    @Override // o.zd
    public final void Q(Function0 function0) {
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(function0);
        this.p = voidSignalCallback;
        ComputerDetailsViewModel computerDetailsViewModel = this.n.n;
        ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForAlertsListChanged(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.oe8
    public final void U0() {
        VoidSignalCallback voidSignalCallback = this.p;
        if (voidSignalCallback != null) {
            voidSignalCallback.Disconnect();
        }
    }

    @Override // o.zd
    public final eh7 getItem(int i) {
        kc0 kc0Var = this.n;
        IAlertViewModelWrapperVector iAlertViewModelWrapperVectorA = kc0Var.n.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iAlertViewModelWrapperVectorA) {
            if (((Boolean) this.q.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        Object obj2 = arrayList.get(i);
        obj2.getClass();
        return new cj3(kc0Var, (IAlertViewModelWrapper) obj2, (byte) 9);
    }

    @Override // o.zd
    public final int o() {
        IAlertViewModelWrapperVector iAlertViewModelWrapperVectorA = this.n.n.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iAlertViewModelWrapperVectorA) {
            if (((Boolean) this.q.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }
}
