package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public final class IManagedDeviceV2FactoryContainer {
    public transient long a;
    public transient boolean b;

    public final PLManagerDevicesV2ViewModel a() {
        long jIManagedDeviceV2FactoryContainer_GetPLManagerDevicesV2ViewModel = IManagedDeviceV2FactoryContainerSWIGJNI.IManagedDeviceV2FactoryContainer_GetPLManagerDevicesV2ViewModel(this.a, this);
        if (jIManagedDeviceV2FactoryContainer_GetPLManagerDevicesV2ViewModel == 0) {
            return null;
        }
        PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = new PLManagerDevicesV2ViewModel();
        pLManagerDevicesV2ViewModel.b = true;
        pLManagerDevicesV2ViewModel.a = jIManagedDeviceV2FactoryContainer_GetPLManagerDevicesV2ViewModel;
        return pLManagerDevicesV2ViewModel;
    }

    public final PLManagerGroupsListV2ViewModel b() {
        long jIManagedDeviceV2FactoryContainer_GetPLManagerGroupsListV2ViewModel = IManagedDeviceV2FactoryContainerSWIGJNI.IManagedDeviceV2FactoryContainer_GetPLManagerGroupsListV2ViewModel(this.a, this);
        if (jIManagedDeviceV2FactoryContainer_GetPLManagerGroupsListV2ViewModel == 0) {
            return null;
        }
        PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = new PLManagerGroupsListV2ViewModel();
        pLManagerGroupsListV2ViewModel.b = true;
        pLManagerGroupsListV2ViewModel.a = jIManagedDeviceV2FactoryContainer_GetPLManagerGroupsListV2ViewModel;
        return pLManagerGroupsListV2ViewModel;
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        IManagedDeviceV2FactoryContainerSWIGJNI.delete_IManagedDeviceV2FactoryContainer(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
