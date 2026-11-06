package com.teamviewer.apidefinitions.legacydevices.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/DeviceListResponse;", "", "items", "", "Lcom/teamviewer/apidefinitions/legacydevices/models/Device;", "nextPaginationToken", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getNextPaginationToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceListResponse {
    private final List<Device> items;
    private final String nextPaginationToken;

    public DeviceListResponse(@sp3(name = "items") List<Device> list, @sp3(name = "nextPaginationToken") String str) {
        list.getClass();
        this.items = list;
        this.nextPaginationToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceListResponse copy$default(DeviceListResponse deviceListResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deviceListResponse.items;
        }
        if ((i & 2) != 0) {
            str = deviceListResponse.nextPaginationToken;
        }
        return deviceListResponse.copy(list, str);
    }

    public final List<Device> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextPaginationToken() {
        return this.nextPaginationToken;
    }

    public final DeviceListResponse copy(@sp3(name = "items") List<Device> items, @sp3(name = "nextPaginationToken") String nextPaginationToken) {
        items.getClass();
        return new DeviceListResponse(items, nextPaginationToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceListResponse)) {
            return false;
        }
        DeviceListResponse deviceListResponse = (DeviceListResponse) other;
        return im3.n(this.items, deviceListResponse.items) && im3.n(this.nextPaginationToken, deviceListResponse.nextPaginationToken);
    }

    public final List<Device> getItems() {
        return this.items;
    }

    public final String getNextPaginationToken() {
        return this.nextPaginationToken;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.nextPaginationToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeviceListResponse(items=" + this.items + ", nextPaginationToken=" + this.nextPaginationToken + ")";
    }

    public /* synthetic */ DeviceListResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
