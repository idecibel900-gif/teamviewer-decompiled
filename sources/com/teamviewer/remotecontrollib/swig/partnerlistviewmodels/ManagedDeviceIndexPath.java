package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public final class ManagedDeviceIndexPath {
    public transient long a;
    public transient boolean b;

    public ManagedDeviceIndexPath(int i, long j) {
        long jNew_ManagedDeviceIndexPath = PLManagerDevicesDefinitionsSWIGJNI.new_ManagedDeviceIndexPath();
        this.b = true;
        this.a = jNew_ManagedDeviceIndexPath;
        PLManagerDevicesDefinitionsSWIGJNI.ManagedDeviceIndexPath_row_set(jNew_ManagedDeviceIndexPath, this, j);
        long j2 = this.a;
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw null;
        }
        PLManagerDevicesDefinitionsSWIGJNI.ManagedDeviceIndexPath_section_set(j2, this, i2);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        PLManagerDevicesDefinitionsSWIGJNI.delete_ManagedDeviceIndexPath(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
