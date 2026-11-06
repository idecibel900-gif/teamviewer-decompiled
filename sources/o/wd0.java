package o;

import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModelSWIGJNI;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class wd0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ xd0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd0(xd0 xd0Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = xd0Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        xd0 xd0Var = this.n;
        switch (b) {
            case 0:
                return new wd0(xd0Var, hc1Var, (byte) 0);
            default:
                return new wd0(xd0Var, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((wd0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((wd0) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        xd0 xd0Var = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                nc0 nc0Var = xd0Var.D;
                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel = xd0Var.C;
                iManagedDeviceV2ViewModel.getClass();
                DyngateID dyngateID = new DyngateID(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetDyngateID(iManagedDeviceV2ViewModel.a, iManagedDeviceV2ViewModel), true);
                nc0Var.getClass();
                ck3.j0(dyngateID, nc0Var.a);
                break;
            default:
                ct1.a0(obj);
                nc0 nc0Var2 = xd0Var.D;
                IManagedDeviceV2ViewModel iManagedDeviceV2ViewModel2 = xd0Var.C;
                iManagedDeviceV2ViewModel2.getClass();
                DyngateID dyngateID2 = new DyngateID(IManagedDeviceV2ViewModelSWIGJNI.IManagedDeviceV2ViewModel_GetDyngateID(iManagedDeviceV2ViewModel2.a, iManagedDeviceV2ViewModel2), true);
                nc0Var2.getClass();
                PListDyngateID pListDyngateID = new PListDyngateID(dyngateID2);
                String strPListDyngateID_GetAsString = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateID.a, pListDyngateID);
                ja3 ja3Var = nc0Var2.a;
                strPListDyngateID_GetAsString.getClass();
                ck3.Q(strPListDyngateID_GetAsString, ((l41) ja3Var).b(strPListDyngateID_GetAsString));
                break;
        }
        return f88Var;
    }
}
