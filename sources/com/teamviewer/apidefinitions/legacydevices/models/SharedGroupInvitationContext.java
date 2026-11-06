package com.teamviewer.apidefinitions.legacydevices.models;

import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/SharedGroupInvitationContext;", "", "sharedGroupOwnerName", "", "sharedGroupName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSharedGroupOwnerName", "()Ljava/lang/String;", "getSharedGroupName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SharedGroupInvitationContext {
    private final String sharedGroupName;
    private final String sharedGroupOwnerName;

    public SharedGroupInvitationContext(@sp3(name = "sharedGroupOwnerName") String str, @sp3(name = "sharedGroupName") String str2) {
        str.getClass();
        str2.getClass();
        this.sharedGroupOwnerName = str;
        this.sharedGroupName = str2;
    }

    public static /* synthetic */ SharedGroupInvitationContext copy$default(SharedGroupInvitationContext sharedGroupInvitationContext, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedGroupInvitationContext.sharedGroupOwnerName;
        }
        if ((i & 2) != 0) {
            str2 = sharedGroupInvitationContext.sharedGroupName;
        }
        return sharedGroupInvitationContext.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSharedGroupOwnerName() {
        return this.sharedGroupOwnerName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSharedGroupName() {
        return this.sharedGroupName;
    }

    public final SharedGroupInvitationContext copy(@sp3(name = "sharedGroupOwnerName") String sharedGroupOwnerName, @sp3(name = "sharedGroupName") String sharedGroupName) {
        sharedGroupOwnerName.getClass();
        sharedGroupName.getClass();
        return new SharedGroupInvitationContext(sharedGroupOwnerName, sharedGroupName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedGroupInvitationContext)) {
            return false;
        }
        SharedGroupInvitationContext sharedGroupInvitationContext = (SharedGroupInvitationContext) other;
        return im3.n(this.sharedGroupOwnerName, sharedGroupInvitationContext.sharedGroupOwnerName) && im3.n(this.sharedGroupName, sharedGroupInvitationContext.sharedGroupName);
    }

    public final String getSharedGroupName() {
        return this.sharedGroupName;
    }

    public final String getSharedGroupOwnerName() {
        return this.sharedGroupOwnerName;
    }

    public int hashCode() {
        return this.sharedGroupName.hashCode() + (this.sharedGroupOwnerName.hashCode() * 31);
    }

    public String toString() {
        return fx3.h("SharedGroupInvitationContext(sharedGroupOwnerName=", this.sharedGroupOwnerName, ", sharedGroupName=", this.sharedGroupName, ")");
    }
}
