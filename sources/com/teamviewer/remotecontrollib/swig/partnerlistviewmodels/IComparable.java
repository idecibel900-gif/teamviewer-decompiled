package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public abstract class IComparable {
    public transient long a;
    public transient boolean b = true;

    public IComparable(long j) {
        this.a = j;
    }

    public synchronized void a() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    IComparableSWIGJNI.delete_IComparable(j);
                }
                this.a = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
