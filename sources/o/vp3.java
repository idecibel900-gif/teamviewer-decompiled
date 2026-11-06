package o;

import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntryType;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public abstract class vp3 {
    public Object a(nr3 nr3Var) throws qq3, EOFException {
        nr3Var.getClass();
        String strZ = nr3Var.z();
        int i = wu1.a[ua5.B(nr3Var.c0())];
        if (i == 1) {
            String strR = nr3Var.r();
            DeviceListEntryType deviceListEntryTypeDecode = DeviceListEntryType.INSTANCE.decode(strR);
            if (deviceListEntryTypeDecode != null) {
                return deviceListEntryTypeDecode;
            }
            throw new gq3(to7.k("Unknown DeviceListEntryType '", strR, "' at path ", strZ));
        }
        if (i != 2) {
            if (i == 3) {
                nr3Var.J();
                return null;
            }
            gk0.o("Expected a DeviceListEntryType but was ", e41.v(nr3Var.c0()), " at path ", strZ);
            return null;
        }
        int iNextInt = nr3Var.nextInt();
        DeviceListEntryType deviceListEntryType = (DeviceListEntryType) lv0.p0(iNextInt, DeviceListEntryType.getEntries());
        if (deviceListEntryType != null) {
            return deviceListEntryType;
        }
        throw new gq3("Unknown DeviceListEntryType '" + iNextInt + "' at path " + strZ);
    }

    public final w55 b() {
        return this instanceof w55 ? (w55) this : new w55(this);
    }

    public void c(pr3 pr3Var, Object obj) {
        DeviceListEntryType deviceListEntryType = (DeviceListEntryType) obj;
        pr3Var.getClass();
        if (deviceListEntryType == null) {
            pr3Var.J();
        } else {
            pr3Var.l0(deviceListEntryType.getValue());
        }
    }
}
