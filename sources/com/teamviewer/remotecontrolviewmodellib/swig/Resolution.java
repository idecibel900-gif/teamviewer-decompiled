package com.teamviewer.remotecontrolviewmodellib.swig;

/* JADX INFO: loaded from: classes.dex */
public final class Resolution {
    public transient long a;
    public transient boolean b;

    public Resolution(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Resolution)) {
            return false;
        }
        Resolution resolution = (Resolution) obj;
        return IChangeResolutionViewModelSWIGJNI.Resolution_Equal(this.a, this, resolution.a, resolution);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        IChangeResolutionViewModelSWIGJNI.delete_Resolution(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int hashCode() {
        return IChangeResolutionViewModelSWIGJNI.Resolution_id_get(this.a, this);
    }
}
