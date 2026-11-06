package o;

import android.net.nsd.NsdManager$ServiceInfoCallback;
import android.net.nsd.NsdServiceInfo;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapper;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapperSWIGJNI;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ry4 implements NsdManager$ServiceInfoCallback {
    public final /* synthetic */ nf a;

    public ry4(nf nfVar) {
        this.a = nfVar;
    }

    public final void onServiceInfoCallbackRegistrationFailed(int i) {
        ye4.c("NSDDiscoveryAPI", "Service registration failed with error: " + i);
    }

    public final void onServiceInfoCallbackUnregistered() {
        ye4.a("NSDDiscoveryAPI", "Service info unregistered");
    }

    public final void onServiceLost() {
    }

    public final void onServiceUpdated(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        ye4.a("NSDDiscoveryAPI", "service updated service name " + nsdServiceInfo.getServiceName());
        if (nsdServiceInfo.getAttributes().containsKey("DyngateID") && nsdServiceInfo.getAttributes().containsKey("Token")) {
            Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
            attributes.getClass();
            Object objP = xm4.P("DyngateID", attributes);
            objP.getClass();
            String strF = bc7.F((byte[]) objP);
            Map<String, byte[]> attributes2 = nsdServiceInfo.getAttributes();
            attributes2.getClass();
            Object objP2 = xm4.P("Token", attributes2);
            objP2.getClass();
            String strF2 = bc7.F((byte[]) objP2);
            nf nfVar = this.a;
            nx3 nx3Var = (nx3) nfVar.i;
            if (nx3Var == null) {
                im3.e0("nsdDevicesChangedListener");
                throw null;
            }
            ((q15) nx3Var.n).r.put(strF, strF2);
            NSDDiscoveryWrapper nSDDiscoveryWrapper = (NSDDiscoveryWrapper) nfVar.b;
            NSDDiscoveryWrapperSWIGJNI.NSDDiscoveryWrapper_OnNodeResolved(nSDDiscoveryWrapper.a, nSDDiscoveryWrapper, false, strF, nsdServiceInfo.getServiceType(), ".local.", strF, strF2);
        }
    }
}
