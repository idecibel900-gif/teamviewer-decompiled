package o;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Handler;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapper;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapperSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class oy4 implements NsdManager.DiscoveryListener {
    public final /* synthetic */ nf a;

    public oy4(nf nfVar) {
        this.a = nfVar;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String str) {
        str.getClass();
        this.a.k = py4.n;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String str) {
        str.getClass();
        this.a.k = py4.m;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        ye4.a("NSDDiscoveryAPI", "Service found, serviceName: " + nsdServiceInfo.getServiceName());
        if (im3.n(nsdServiceInfo.getServiceType(), "_teamviewer._tcp.")) {
            int i = Build.VERSION.SDK_INT;
            nf nfVar = this.a;
            if (i >= 34) {
                ry4 ry4Var = new ry4(nfVar);
                ((ArrayList) nfVar.f).add(ry4Var);
                NsdManager nsdManager = (NsdManager) nfVar.j;
                if (nsdManager != null) {
                    RemoteControlApplication remoteControlApplication = (RemoteControlApplication) nfVar.c;
                    nsdManager.registerServiceInfoCallback(nsdServiceInfo, i >= 28 ? dq.h(remoteControlApplication) : new fj(new Handler(remoteControlApplication.getMainLooper()), (byte) 3), ry4Var);
                    return;
                }
                return;
            }
            if (!((AtomicBoolean) ((kh7) nfVar.g).getValue()).compareAndSet(false, true)) {
                ((ConcurrentLinkedQueue) ((kh7) nfVar.h).getValue()).add(nsdServiceInfo);
                return;
            }
            NsdManager nsdManager2 = (NsdManager) nfVar.j;
            if (nsdManager2 != null) {
                nsdManager2.resolveService(nsdServiceInfo, (qy4) ((kh7) nfVar.e).getValue());
            }
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        ua5.v("Service lost, serviceName: ", nsdServiceInfo.getServiceName(), "NSDDiscoveryAPI");
        nf nfVar = this.a;
        NSDDiscoveryWrapper nSDDiscoveryWrapper = (NSDDiscoveryWrapper) nfVar.b;
        String serviceName = nsdServiceInfo.getServiceName();
        String serviceType = nsdServiceInfo.getServiceType();
        serviceType.getClass();
        NSDDiscoveryWrapperSWIGJNI.NSDDiscoveryWrapper_OnNodeResolved(nSDDiscoveryWrapper.a, nSDDiscoveryWrapper, true, serviceName, ub7.S(serviceType), ".local.", nsdServiceInfo.getServiceName(), "");
        Iterator it = ((ConcurrentLinkedQueue) ((kh7) nfVar.h).getValue()).iterator();
        it.getClass();
        while (it.hasNext()) {
            if (im3.n(((NsdServiceInfo) it.next()).getServiceName(), nsdServiceInfo.getServiceName())) {
                it.remove();
            }
        }
        nx3 nx3Var = (nx3) nfVar.i;
        if (nx3Var == null) {
            im3.e0("nsdDevicesChangedListener");
            throw null;
        }
        String serviceName2 = nsdServiceInfo.getServiceName();
        serviceName2.getClass();
        ((q15) nx3Var.n).r.remove(serviceName2);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String str, int i) {
        str.getClass();
        ye4.c("NSDDiscoveryAPI", "Start discovery has failed with error: " + i);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String str, int i) {
        str.getClass();
        ye4.c("NSDDiscoveryAPI", "Stop discovery has failed with error: " + i);
    }
}
