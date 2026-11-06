package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import com.teamviewer.remotecontrollib.swig.INearbyDevicesViewModel;
import com.teamviewer.remotecontrollib.swig.INearbyDevicesViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapper;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q15 extends oe8 implements dc3 {
    public final INearbyDevicesViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o10 f1795o;
    public final NSDDiscoveryWrapper p;
    public final nf q;
    public final Map r;
    public CountDownTimer s;
    public final nw4 t;
    public final nw4 u;
    public final VoidSignalCallback v;

    public q15(INearbyDevicesViewModel iNearbyDevicesViewModel, o10 o10Var, NSDDiscoveryWrapper nSDDiscoveryWrapper, nf nfVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nSDDiscoveryWrapper.getClass();
        nfVar.getClass();
        this.n = iNearbyDevicesViewModel;
        this.f1795o = o10Var;
        this.p = nSDDiscoveryWrapper;
        this.q = nfVar;
        this.r = linkedHashMap;
        this.t = new nw4();
        this.u = new nw4(Boolean.FALSE);
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new vm3(this, (byte) 16));
        this.v = voidSignalCallback;
        nx3 nx3Var = new nx3(this, (byte) 25);
        INearbyDevicesViewModelSWIGJNI.INearbyDevicesViewModel_RegisterOnTreeChangedCallback(iNearbyDevicesViewModel.a, iNearbyDevicesViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        nfVar.i = nx3Var;
        o10Var.b = new ar(this, (byte) 18);
    }

    @Override // o.oe8
    public final void U0() {
        this.v.Disconnect();
        this.n.a();
    }

    public final String[] V0() {
        this.f1795o.getClass();
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            arrayList.add("android.permission.BLUETOOTH_CONNECT");
            arrayList.add("android.permission.BLUETOOTH_SCAN");
        } else if (29 > i || i >= 31) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        } else {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void W0() {
        BluetoothAdapter bluetoothAdapter;
        o10 o10Var = this.f1795o;
        BluetoothLeScanner bluetoothLeScanner = (BluetoothLeScanner) o10Var.h;
        if (o10Var.a || (bluetoothAdapter = (BluetoothAdapter) o10Var.g) == null || !bluetoothAdapter.isEnabled()) {
            return;
        }
        o10Var.a = true;
        ((LinkedHashMap) o10Var.c).clear();
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.startScan((ArrayList) o10Var.f, (ScanSettings) o10Var.e, (n10) o10Var.i);
        }
        ((Handler) ((kh7) o10Var.d).getValue()).post((mt8) o10Var.j);
    }
}
