package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public final class MachineListViewModel {
    public transient long a;
    public transient boolean b;

    public final MachineId a(long j) {
        long jMachineListViewModel_GetElement = MachineListViewModelSWIGJNI.MachineListViewModel_GetElement(this.a, this, j);
        if (jMachineListViewModel_GetElement == 0) {
            return null;
        }
        MachineId machineId = new MachineId();
        machineId.b = true;
        machineId.a = jMachineListViewModel_GetElement;
        return machineId;
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        MachineListViewModelSWIGJNI.delete_MachineListViewModel(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
