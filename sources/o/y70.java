package o;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y70 implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r93 b;

    public /* synthetic */ y70(r93 r93Var, byte b) {
        this.a = b;
        this.b = r93Var;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        byte b = this.a;
        r93 r93Var = this.b;
        switch (b) {
            case 0:
                yc4 yc4Var = (yc4) r93Var;
                bluetoothProfile.getClass();
                if (i == 1) {
                    BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
                    yc4Var.p = bluetoothHeadset;
                    List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
                    connectedDevices.getClass();
                    if (!connectedDevices.isEmpty()) {
                        yc4Var.X();
                    }
                }
                break;
            default:
                bluetoothProfile.getClass();
                ye4.a("BTAudioHelperInternalL", "onServiceConnected proxy.connectedDevices.size:" + bluetoothProfile.getConnectedDevices().size());
                if (i == 1) {
                    List<BluetoothDevice> connectedDevices2 = bluetoothProfile.getConnectedDevices();
                    connectedDevices2.getClass();
                    if (!connectedDevices2.isEmpty()) {
                        a80 a80Var = (a80) r93Var;
                        a80Var.q = (BluetoothHeadset) bluetoothProfile;
                        a80Var.b();
                    }
                }
                break;
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        byte b = this.a;
    }
}
