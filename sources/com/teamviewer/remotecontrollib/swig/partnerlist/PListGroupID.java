package com.teamviewer.remotecontrollib.swig.partnerlist;

/* JADX INFO: loaded from: classes.dex */
public final class PListGroupID {
    public transient long a;
    public transient boolean b;

    public PListGroupID(int i, long j) {
        this.b = true;
        this.a = j;
    }

    public static long a(PListGroupID pListGroupID) {
        if (pListGroupID == null) {
            return 0L;
        }
        return pListGroupID.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PListGroupID)) {
            return false;
        }
        PListGroupID pListGroupID = (PListGroupID) obj;
        return PListGroupIDSWIGJNI.PListGroupID_GetInternalID(this.a, this) == PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID.a, pListGroupID);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        PListGroupIDSWIGJNI.delete_PListGroupID(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int hashCode() {
        long jPListGroupID_GetInternalID = PListGroupIDSWIGJNI.PListGroupID_GetInternalID(this.a, this);
        return (int) (jPListGroupID_GetInternalID ^ (jPListGroupID_GetInternalID >>> 32));
    }

    public PListGroupID(long j) {
        this(0, PListGroupIDSWIGJNI.new_PListGroupID__SWIG_1(j));
    }
}
