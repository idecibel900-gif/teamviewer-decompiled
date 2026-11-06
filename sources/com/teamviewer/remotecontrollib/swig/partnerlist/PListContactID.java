package com.teamviewer.remotecontrollib.swig.partnerlist;

/* JADX INFO: loaded from: classes.dex */
public final class PListContactID {
    public transient long a;
    public transient boolean b;

    public PListContactID(long j) {
        long jNew_PListContactID__SWIG_1 = PListContactIDSWIGJNI.new_PListContactID__SWIG_1(j);
        this.b = true;
        this.a = jNew_PListContactID__SWIG_1;
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        PListContactIDSWIGJNI.delete_PListContactID(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
