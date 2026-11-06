package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;

/* JADX INFO: loaded from: classes.dex */
public final class GroupListViewModel {
    public transient long a;
    public transient boolean b;

    public final PListGroupID a(int i) {
        return new PListGroupID(0, GroupListViewModelSWIGJNI.GroupListViewModel_GetElement(this.a, this, i));
    }

    public final synchronized void b() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    GroupListViewModelSWIGJNI.delete_GroupListViewModel(j);
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
