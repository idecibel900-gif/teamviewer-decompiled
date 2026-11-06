package o;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapper;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapperSWIGJNI;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class qy4 implements NsdManager.ResolveListener {
    public final /* synthetic */ nf a;

    public qy4(nf nfVar) {
        this.a = nfVar;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 34) {
            nf nfVar = this.a;
            NsdServiceInfo nsdServiceInfo = (NsdServiceInfo) ((ConcurrentLinkedQueue) ((kh7) nfVar.h).getValue()).poll();
            if (nsdServiceInfo == null) {
                ((AtomicBoolean) ((kh7) nfVar.g).getValue()).set(false);
                return;
            }
            NsdManager nsdManager = (NsdManager) nfVar.j;
            if (nsdManager != null) {
                nsdManager.resolveService(nsdServiceInfo, (qy4) ((kh7) nfVar.e).getValue());
            }
        }
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
        ye4.c("NSDDiscoveryAPI", "Resolve service has failed for " + nsdServiceInfo.getServiceName() + ", with error: " + i);
        a();
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        ye4.a("NSDDiscoveryAPI", "Resolve service success: " + nsdServiceInfo.getServiceName());
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
            String serviceType = nsdServiceInfo.getServiceType();
            serviceType.getClass();
            NSDDiscoveryWrapperSWIGJNI.NSDDiscoveryWrapper_OnNodeResolved(nSDDiscoveryWrapper.a, nSDDiscoveryWrapper, false, strF, serviceType.substring(1), ".local.", strF, strF2);
        }
        a();
    }
}
