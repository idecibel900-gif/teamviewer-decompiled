package com.teamviewer.remotecontrollib.swig.partnerlist;

/* JADX INFO: loaded from: classes.dex */
public final class PListComputerID {
    public transient long a;
    public transient boolean b;

    public PListComputerID(int i, long j) {
        this.b = true;
        this.a = j;
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        PListComputerIDSWIGJNI.delete_PListComputerID(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PListComputerID(long j) {
        this(0, PListComputerIDSWIGJNI.new_PListComputerID__SWIG_1(j));
    }
}
