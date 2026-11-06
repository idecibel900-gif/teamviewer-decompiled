package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import o.s33;

/* JADX INFO: loaded from: classes.dex */
public final class GroupMemberId {
    public transient long a;
    public transient boolean b;

    public GroupMemberId(s33 s33Var, long j) {
        this(GroupMemberIdSWIGJNI.new_GroupMemberId(s33Var.m, j));
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        GroupMemberIdSWIGJNI.delete_GroupMemberId(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public GroupMemberId(long j) {
        this.b = true;
        this.a = j;
    }
}
