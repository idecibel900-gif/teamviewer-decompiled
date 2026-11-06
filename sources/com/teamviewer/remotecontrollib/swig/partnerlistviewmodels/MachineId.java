package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class MachineId {
    public transient long a;
    public transient boolean b;

    public final PListDyngateID a() {
        long jMachineId_dyngateId_get = MachineIdSWIGJNI.MachineId_dyngateId_get(this.a, this);
        if (jMachineId_dyngateId_get == 0) {
            return null;
        }
        return new PListDyngateID(jMachineId_dyngateId_get, false);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        MachineIdSWIGJNI.delete_MachineId(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
