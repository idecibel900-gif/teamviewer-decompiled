package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import com.teamviewer.remotecontrolviewlib.activity.PilotSessionActivity;

/* JADX INFO: loaded from: classes.dex */
public final class a80 implements r93 {
    public final vk5 m;
    public final AudioManager n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TelephonyManager f307o;
    public final BluetoothManager p;
    public BluetoothHeadset q;
    public int r;
    public boolean s;
    public String t;
    public final y70 u;
    public z70 v;

    public a80(PilotSessionActivity pilotSessionActivity, vk5 vk5Var) {
        this.m = vk5Var;
        AudioManager audioManager = (AudioManager) pilotSessionActivity.getSystemService("audio");
        this.n = audioManager;
        Object systemService = pilotSessionActivity.getSystemService("phone");
        systemService.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        this.f307o = telephonyManager;
        Object systemService2 = pilotSessionActivity.getSystemService("bluetooth");
        systemService2.getClass();
        BluetoothManager bluetoothManager = (BluetoothManager) systemService2;
        this.p = bluetoothManager;
        this.t = "";
        y70 y70Var = new y70(this, (byte) 1);
        this.u = y70Var;
        this.v = new z70(this, pilotSessionActivity);
        ye4.a("BTAudioHelperInternalL", "isBluetoothScoOn: " + (audioManager != null ? Boolean.valueOf(audioManager.isBluetoothScoOn()) : null));
        if (telephonyManager.getSimState() == 5) {
            telephonyManager.listen(this.v, 32);
            return;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        if (adapter != null) {
            adapter.getProfileProxy(pilotSessionActivity, y70Var, 1);
        }
    }

    public final void a() {
        this.s = false;
        this.r = 0;
        AudioManager audioManager = this.n;
        if (audioManager != null) {
            try {
                audioManager.stopBluetoothSco();
            } catch (NullPointerException unused) {
                ye4.a("BTAudioHelperInternalL", "stopBluetooth() failed. no bluetooth device connected.");
            }
        } else {
            ye4.c("BTAudioHelperInternalL", "AudioManager not available");
        }
        this.m.a();
        my.a.setValue(Boolean.FALSE);
    }

    public final void b() {
        AudioManager audioManager = this.n;
        if (audioManager == null) {
            ye4.c("BTAudioHelperInternalL", "AudioManager not available");
            return;
        }
        try {
            ye4.a("BTAudioHelperInternalL", "Try to startBluetoothSco()");
            this.s = true;
            audioManager.startBluetoothSco();
            nw4 nw4Var = my.a;
            my.a.setValue(Boolean.TRUE);
        } catch (NullPointerException unused) {
            ye4.a("BTAudioHelperInternalL", "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }

    @Override // o.r93
    public final void d() {
        a();
        this.f307o.listen(this.v, 0);
        BluetoothAdapter adapter = this.p.getAdapter();
        if (adapter != null) {
            adapter.closeProfileProxy(1, this.q);
        }
        this.v = null;
        this.q = null;
        this.t = "";
    }

    @Override // o.r93
    public final void e(Intent intent) {
        String strValueOf;
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            AudioManager audioManager = this.n;
            if (iHashCode != -1692127708) {
                if (iHashCode == 545516589 && action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") && audioManager != null) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) bt1.C(intent, "android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
                    if (intExtra == 0) {
                        if (im3.n(bluetoothDevice != null ? bluetoothDevice.getAddress() : null, this.t)) {
                            a();
                            this.t = "";
                            return;
                        }
                        return;
                    }
                    if (intExtra == 2 && !audioManager.isBluetoothScoOn() && this.t.length() == 0) {
                        this.r = 0;
                        b();
                        String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
                        this.t = address != null ? address : "";
                        return;
                    }
                    return;
                }
                return;
            }
            if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                int intExtra2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                if (intExtra2 == 0) {
                    strValueOf = "DISCONNECTED";
                } else if (intExtra2 != 1) {
                    strValueOf = intExtra2 != 2 ? String.valueOf(intExtra2) : "CONNECTING";
                } else {
                    strValueOf = "CONNECTED";
                }
                ua5.v("Received ACTION_SCO_AUDIO_STATE_UPDATED scoAudioState:", strValueOf, "BTAudioHelperInternalL");
                if (intExtra2 != 0) {
                    if (intExtra2 != 1) {
                        return;
                    }
                    this.s = false;
                    return;
                }
                int i = this.r;
                boolean z = i < 20 ? this.s : false;
                this.s = z;
                if (!z) {
                    a();
                    return;
                }
                this.r = i + 1;
                if (this.t.length() > 0) {
                    if (audioManager != null) {
                        try {
                            audioManager.stopBluetoothSco();
                        } catch (NullPointerException unused) {
                            ye4.a("BTAudioHelperInternalL", "stopBluetooth() failed. no bluetooth device connected.");
                        }
                    } else {
                        ye4.c("BTAudioHelperInternalL", "AudioManager not available");
                    }
                    b();
                }
            }
        }
    }
}
