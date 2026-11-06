package o;

import android.bluetooth.BluetoothAdapter;
import android.telephony.PhoneStateListener;
import com.teamviewer.remotecontrolviewlib.activity.PilotSessionActivity;

/* JADX INFO: loaded from: classes.dex */
public final class z70 extends PhoneStateListener {
    public final /* synthetic */ a80 a;
    public final /* synthetic */ PilotSessionActivity b;

    public z70(a80 a80Var, PilotSessionActivity pilotSessionActivity) {
        this.a = a80Var;
        this.b = pilotSessionActivity;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        str.getClass();
        if (i == 0) {
            a80 a80Var = this.a;
            BluetoothAdapter adapter = a80Var.p.getAdapter();
            if (adapter != null) {
                adapter.getProfileProxy(this.b, a80Var.u, 1);
            }
        }
    }
}
