package com.teamviewer.remotecontrolviewmodellib.swig;

/* JADX INFO: loaded from: classes.dex */
public final class IRemoveWallpaperViewModel {
    public transient long a;
    public transient boolean b;

    public final synchronized void a() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    IRemoveWallpaperViewModelSWIGJNI.delete_IRemoveWallpaperViewModel(j);
                }
                this.a = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void finalize() {
        a();
    }
}
