package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Handler;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class o10 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;
    public Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public o10(RemoteControlApplication remoteControlApplication) {
        this.c = new LinkedHashMap();
        this.d = new kh7(new zq((byte) 14));
        kh7 kh7Var = new kh7(new m10(remoteControlApplication, (byte) 0));
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
        scanSettingsBuild.getClass();
        this.e = scanSettingsBuild;
        this.f = qf0.N(new ScanFilter.Builder().build());
        BluetoothAdapter adapter = ((BluetoothManager) kh7Var.getValue()).getAdapter();
        this.g = adapter;
        this.h = adapter != null ? adapter.getBluetoothLeScanner() : null;
        this.i = new n10(this);
        this.j = new mt8((Object) this, (byte) 3);
    }

    public static String a(UUID uuid) {
        String string = uuid.toString();
        string.getClass();
        int length = string.length();
        String strL = bc7.L(string.substring(length - (17 > length ? length : 17)), "-", "");
        while (strL.length() > 0 && strL.charAt(0) == '0') {
            strL = strL.substring(1);
        }
        qf0.s(16);
        return String.valueOf(Integer.parseInt(strL, 16));
    }

    public o10(mk0 mk0Var, zi1 zi1Var, Handler handler) {
        this.a = false;
        this.h = new Object();
        this.i = new qz(this, (byte) 1);
        this.j = new xc0((Object) this, (byte) 27);
        l47.t();
        this.b = mk0Var;
        this.e = zi1Var;
        this.f = handler;
    }
}
