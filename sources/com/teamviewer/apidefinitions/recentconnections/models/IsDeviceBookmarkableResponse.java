package com.teamviewer.apidefinitions.recentconnections.models;

import kotlin.Metadata;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/teamviewer/apidefinitions/recentconnections/models/IsDeviceBookmarkableResponse;", "", "isBookmarkable", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IsDeviceBookmarkableResponse {
    private final boolean isBookmarkable;

    public IsDeviceBookmarkableResponse(@sp3(name = "isBookmarkable") boolean z) {
        this.isBookmarkable = z;
    }

    public static /* synthetic */ IsDeviceBookmarkableResponse copy$default(IsDeviceBookmarkableResponse isDeviceBookmarkableResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = isDeviceBookmarkableResponse.isBookmarkable;
        }
        return isDeviceBookmarkableResponse.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsBookmarkable() {
        return this.isBookmarkable;
    }

    public final IsDeviceBookmarkableResponse copy(@sp3(name = "isBookmarkable") boolean isBookmarkable) {
        return new IsDeviceBookmarkableResponse(isBookmarkable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IsDeviceBookmarkableResponse) && this.isBookmarkable == ((IsDeviceBookmarkableResponse) other).isBookmarkable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isBookmarkable);
    }

    public final boolean isBookmarkable() {
        return this.isBookmarkable;
    }

    public String toString() {
        return "IsDeviceBookmarkableResponse(isBookmarkable=" + this.isBookmarkable + ")";
    }
}
