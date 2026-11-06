package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.nativelivedatalib.swig.NativeLiveDataFloat;

/* JADX INFO: loaded from: classes.dex */
public final class IRemoteScreenInformationViewModel {
    public transient long a;
    public transient boolean b;

    public final NativeLiveDataFloat a() {
        return NativeLiveDataFloat.newInstance(IRemoteScreenInformationViewModelSWIGJNI.IRemoteScreenInformationViewModel_ServerScalingFactor(this.a, this), false);
    }

    public final synchronized void b() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    IRemoteScreenInformationViewModelSWIGJNI.delete_IRemoteScreenInformationViewModel(j);
                }
                this.a = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void finalize() {
        b();
    }
}
