package o;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class n10 extends ScanCallback {
    public final /* synthetic */ o10 a;

    public n10(o10 o10Var) {
        this.a = o10Var;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        ParcelUuid parcelUuid;
        UUID uuid;
        scanResult.getClass();
        super.onScanResult(i, scanResult);
        ScanRecord scanRecord = scanResult.getScanRecord();
        List<ParcelUuid> serviceUuids = scanRecord != null ? scanRecord.getServiceUuids() : null;
        if (serviceUuids == null || (parcelUuid = serviceUuids.get(0)) == null || (uuid = parcelUuid.getUuid()) == null) {
            return;
        }
        o10 o10Var = this.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) o10Var.c;
        String string = uuid.toString();
        string.getClass();
        if (ub7.Q(string, "df63b28c-ddaf-4145", false)) {
            if (!linkedHashMap.containsKey(o10.a(uuid))) {
                ar arVar = (ar) o10Var.b;
                if (arVar == null) {
                    im3.e0("registeredCallback");
                    throw null;
                }
                arVar.p(o10.a(uuid), false);
            }
            linkedHashMap.put(o10.a(uuid), 5);
        }
    }
}
