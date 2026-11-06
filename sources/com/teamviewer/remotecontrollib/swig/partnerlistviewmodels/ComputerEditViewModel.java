package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class ComputerEditViewModel {
    public transient long a;
    public transient boolean b;

    public final PListDyngateID a() {
        return new PListDyngateID(ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetDyngateID(this.a, this), true);
    }

    public final synchronized void b() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    ComputerEditViewModelSWIGJNI.delete_ComputerEditViewModel(j);
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
