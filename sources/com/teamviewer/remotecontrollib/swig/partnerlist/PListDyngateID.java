package com.teamviewer.remotecontrollib.swig.partnerlist;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class PListDyngateID {
    public transient long a;
    public transient boolean b;

    public PListDyngateID(DyngateID dyngateID) {
        this(PListDyngateIDSWIGJNI.new_PListDyngateID__SWIG_1(DyngateID.getCPtr(dyngateID), dyngateID), true);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        PListDyngateIDSWIGJNI.delete_PListDyngateID(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PListDyngateID(long j, boolean z) {
        this.b = z;
        this.a = j;
    }
}
