package com.teamviewer.apidefinitions.mobilewake.models;

import kotlin.Metadata;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/teamviewer/apidefinitions/mobilewake/models/MobileWakeRequest;", "", "teamviewerId", "", "<init>", "(J)V", "getTeamviewerId", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MobileWakeRequest {
    private final long teamviewerId;

    public MobileWakeRequest(@sp3(name = "teamviewerId") long j) {
        this.teamviewerId = j;
    }

    public static /* synthetic */ MobileWakeRequest copy$default(MobileWakeRequest mobileWakeRequest, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = mobileWakeRequest.teamviewerId;
        }
        return mobileWakeRequest.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTeamviewerId() {
        return this.teamviewerId;
    }

    public final MobileWakeRequest copy(@sp3(name = "teamviewerId") long teamviewerId) {
        return new MobileWakeRequest(teamviewerId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MobileWakeRequest) && this.teamviewerId == ((MobileWakeRequest) other).teamviewerId;
    }

    public final long getTeamviewerId() {
        return this.teamviewerId;
    }

    public int hashCode() {
        return Long.hashCode(this.teamviewerId);
    }

    public String toString() {
        return to7.j(this.teamviewerId, "MobileWakeRequest(teamviewerId=", ")");
    }
}
