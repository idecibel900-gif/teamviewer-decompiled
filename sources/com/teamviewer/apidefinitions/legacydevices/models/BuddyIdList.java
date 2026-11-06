package com.teamviewer.apidefinitions.legacydevices.models;

import java.util.List;
import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/BuddyIdList;", "", "deviceIds", "", "", "<init>", "(Ljava/util/List;)V", "getDeviceIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BuddyIdList {
    private final List<Integer> deviceIds;

    public BuddyIdList(@sp3(name = "deviceIds") List<Integer> list) {
        list.getClass();
        this.deviceIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuddyIdList copy$default(BuddyIdList buddyIdList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = buddyIdList.deviceIds;
        }
        return buddyIdList.copy(list);
    }

    public final List<Integer> component1() {
        return this.deviceIds;
    }

    public final BuddyIdList copy(@sp3(name = "deviceIds") List<Integer> deviceIds) {
        deviceIds.getClass();
        return new BuddyIdList(deviceIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BuddyIdList) && im3.n(this.deviceIds, ((BuddyIdList) other).deviceIds);
    }

    public final List<Integer> getDeviceIds() {
        return this.deviceIds;
    }

    public int hashCode() {
        return this.deviceIds.hashCode();
    }

    public String toString() {
        return fx3.i("BuddyIdList(deviceIds=", this.deviceIds, ")");
    }
}
