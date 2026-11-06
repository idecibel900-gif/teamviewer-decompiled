package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/FilterPaginationModel;", "", "paginationToken", "", "pageLimit", "", "groupId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;ILjava/util/UUID;)V", "getPaginationToken", "()Ljava/lang/String;", "getPageLimit", "()I", "getGroupId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FilterPaginationModel {
    private final UUID groupId;
    private final int pageLimit;
    private final String paginationToken;

    public FilterPaginationModel(@sp3(name = "paginationToken") String str, @sp3(name = "pageLimit") int i, @sp3(name = "groupId") UUID uuid) {
        str.getClass();
        this.paginationToken = str;
        this.pageLimit = i;
        this.groupId = uuid;
    }

    public static /* synthetic */ FilterPaginationModel copy$default(FilterPaginationModel filterPaginationModel, String str, int i, UUID uuid, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = filterPaginationModel.paginationToken;
        }
        if ((i2 & 2) != 0) {
            i = filterPaginationModel.pageLimit;
        }
        if ((i2 & 4) != 0) {
            uuid = filterPaginationModel.groupId;
        }
        return filterPaginationModel.copy(str, i, uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaginationToken() {
        return this.paginationToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageLimit() {
        return this.pageLimit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UUID getGroupId() {
        return this.groupId;
    }

    public final FilterPaginationModel copy(@sp3(name = "paginationToken") String paginationToken, @sp3(name = "pageLimit") int pageLimit, @sp3(name = "groupId") UUID groupId) {
        paginationToken.getClass();
        return new FilterPaginationModel(paginationToken, pageLimit, groupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterPaginationModel)) {
            return false;
        }
        FilterPaginationModel filterPaginationModel = (FilterPaginationModel) other;
        return im3.n(this.paginationToken, filterPaginationModel.paginationToken) && this.pageLimit == filterPaginationModel.pageLimit && im3.n(this.groupId, filterPaginationModel.groupId);
    }

    public final UUID getGroupId() {
        return this.groupId;
    }

    public final int getPageLimit() {
        return this.pageLimit;
    }

    public final String getPaginationToken() {
        return this.paginationToken;
    }

    public int hashCode() {
        int iA = fx3.a(this.pageLimit, this.paginationToken.hashCode() * 31, 31);
        UUID uuid = this.groupId;
        return iA + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "FilterPaginationModel(paginationToken=" + this.paginationToken + ", pageLimit=" + this.pageLimit + ", groupId=" + this.groupId + ")";
    }

    public /* synthetic */ FilterPaginationModel(String str, int i, UUID uuid, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : uuid);
    }
}
