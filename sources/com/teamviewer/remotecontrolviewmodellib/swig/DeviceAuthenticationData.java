package com.teamviewer.remotecontrolviewmodellib.swig;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceAuthenticationData {
    public transient long a;

    public final DyngateID a() {
        long jDeviceAuthenticationData_destinationDyngateId_get = DeviceAuthDataSWIGJNI.DeviceAuthenticationData_destinationDyngateId_get(this.a, this);
        if (jDeviceAuthenticationData_destinationDyngateId_get == 0) {
            return null;
        }
        return new DyngateID(jDeviceAuthenticationData_destinationDyngateId_get, false);
    }

    public final DyngateID b() {
        long jDeviceAuthenticationData_sourceDyngateId_get = DeviceAuthDataSWIGJNI.DeviceAuthenticationData_sourceDyngateId_get(this.a, this);
        if (jDeviceAuthenticationData_sourceDyngateId_get == 0) {
            return null;
        }
        return new DyngateID(jDeviceAuthenticationData_sourceDyngateId_get, false);
    }

    public final void finalize() {
        synchronized (this) {
            if (this.a != 0) {
                this.a = 0L;
            }
        }
    }
}
