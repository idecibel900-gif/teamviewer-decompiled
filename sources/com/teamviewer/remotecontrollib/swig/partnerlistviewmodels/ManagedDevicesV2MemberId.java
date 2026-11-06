package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import o.yl4;

/* JADX INFO: loaded from: classes.dex */
public final class ManagedDevicesV2MemberId {
    public transient long a;
    public transient boolean b;

    public ManagedDevicesV2MemberId(yl4 yl4Var, String str) {
        this(ManagedDevicesV2MemberSWIGJNI.new_ManagedDevicesV2MemberId(yl4Var.m, str));
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        ManagedDevicesV2MemberSWIGJNI.delete_ManagedDevicesV2MemberId(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ManagedDevicesV2MemberId(long j) {
        this.b = true;
        this.a = j;
    }
}
