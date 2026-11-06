package o;

import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntry;

/* JADX INFO: loaded from: classes.dex */
public final class t13 implements w13 {
    public final DeviceListEntry a;

    public t13(DeviceListEntry deviceListEntry) {
        this.a = deviceListEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t13) && im3.n(this.a, ((t13) obj).a);
    }

    public final int hashCode() {
        DeviceListEntry deviceListEntry = this.a;
        if (deviceListEntry == null) {
            return 0;
        }
        return deviceListEntry.hashCode();
    }

    public final String toString() {
        return "Current(entry=" + this.a + ")";
    }
}
