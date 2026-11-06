package com.teamviewer.apidefinitions.legacydevices.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J6\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceSearchRequest;", "", "searchTerm", "", "onlineStatus", "", "Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceOnlineStatus;", "limit", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "getSearchTerm", "()Ljava/lang/String;", "getOnlineStatus", "()Ljava/util/List;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceSearchRequest;", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceSearchRequest {
    private final Integer limit;
    private final List<DeviceOnlineStatus> onlineStatus;
    private final String searchTerm;

    public /* synthetic */ DeviceSearchRequest(String str, List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceSearchRequest copy$default(DeviceSearchRequest deviceSearchRequest, String str, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceSearchRequest.searchTerm;
        }
        if ((i & 2) != 0) {
            list = deviceSearchRequest.onlineStatus;
        }
        if ((i & 4) != 0) {
            num = deviceSearchRequest.limit;
        }
        return deviceSearchRequest.copy(str, list, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    public final List<DeviceOnlineStatus> component2() {
        return this.onlineStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    public final DeviceSearchRequest copy(@sp3(name = "searchTerm") String searchTerm, @sp3(name = "onlineStatus") List<? extends DeviceOnlineStatus> onlineStatus, @sp3(name = "limit") Integer limit) {
        searchTerm.getClass();
        return new DeviceSearchRequest(searchTerm, onlineStatus, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceSearchRequest)) {
            return false;
        }
        DeviceSearchRequest deviceSearchRequest = (DeviceSearchRequest) other;
        return im3.n(this.searchTerm, deviceSearchRequest.searchTerm) && im3.n(this.onlineStatus, deviceSearchRequest.onlineStatus) && im3.n(this.limit, deviceSearchRequest.limit);
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final List<DeviceOnlineStatus> getOnlineStatus() {
        return this.onlineStatus;
    }

    public final String getSearchTerm() {
        return this.searchTerm;
    }

    public int hashCode() {
        int iHashCode = this.searchTerm.hashCode() * 31;
        List<DeviceOnlineStatus> list = this.onlineStatus;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.limit;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "DeviceSearchRequest(searchTerm=" + this.searchTerm + ", onlineStatus=" + this.onlineStatus + ", limit=" + this.limit + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSearchRequest(@sp3(name = "searchTerm") String str, @sp3(name = "onlineStatus") List<? extends DeviceOnlineStatus> list, @sp3(name = "limit") Integer num) {
        str.getClass();
        this.searchTerm = str;
        this.onlineStatus = list;
        this.limit = num;
    }
}
