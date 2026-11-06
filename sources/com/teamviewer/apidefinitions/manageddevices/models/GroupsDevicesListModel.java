package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/GroupsDevicesListModel;", "", "groupsList", "", "Ljava/util/UUID;", "paginationToken", "", "pageLimit", "", "teamviewerIDList", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getGroupsList", "()Ljava/util/List;", "getPaginationToken", "()Ljava/lang/String;", "getPageLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTeamviewerIDList", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/teamviewer/apidefinitions/manageddevices/models/GroupsDevicesListModel;", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupsDevicesListModel {
    private final List<UUID> groupsList;
    private final Integer pageLimit;
    private final String paginationToken;
    private final List<String> teamviewerIDList;

    public /* synthetic */ GroupsDevicesListModel(List list, String str, Integer num, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupsDevicesListModel copy$default(GroupsDevicesListModel groupsDevicesListModel, List list, String str, Integer num, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = groupsDevicesListModel.groupsList;
        }
        if ((i & 2) != 0) {
            str = groupsDevicesListModel.paginationToken;
        }
        if ((i & 4) != 0) {
            num = groupsDevicesListModel.pageLimit;
        }
        if ((i & 8) != 0) {
            list2 = groupsDevicesListModel.teamviewerIDList;
        }
        return groupsDevicesListModel.copy(list, str, num, list2);
    }

    public final List<UUID> component1() {
        return this.groupsList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaginationToken() {
        return this.paginationToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPageLimit() {
        return this.pageLimit;
    }

    public final List<String> component4() {
        return this.teamviewerIDList;
    }

    public final GroupsDevicesListModel copy(@sp3(name = "groupsList") List<UUID> groupsList, @sp3(name = "paginationToken") String paginationToken, @sp3(name = "pageLimit") Integer pageLimit, @sp3(name = "teamviewerIDList") List<String> teamviewerIDList) {
        return new GroupsDevicesListModel(groupsList, paginationToken, pageLimit, teamviewerIDList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupsDevicesListModel)) {
            return false;
        }
        GroupsDevicesListModel groupsDevicesListModel = (GroupsDevicesListModel) other;
        return im3.n(this.groupsList, groupsDevicesListModel.groupsList) && im3.n(this.paginationToken, groupsDevicesListModel.paginationToken) && im3.n(this.pageLimit, groupsDevicesListModel.pageLimit) && im3.n(this.teamviewerIDList, groupsDevicesListModel.teamviewerIDList);
    }

    public final List<UUID> getGroupsList() {
        return this.groupsList;
    }

    public final Integer getPageLimit() {
        return this.pageLimit;
    }

    public final String getPaginationToken() {
        return this.paginationToken;
    }

    public final List<String> getTeamviewerIDList() {
        return this.teamviewerIDList;
    }

    public int hashCode() {
        List<UUID> list = this.groupsList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.paginationToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.pageLimit;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list2 = this.teamviewerIDList;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "GroupsDevicesListModel(groupsList=" + this.groupsList + ", paginationToken=" + this.paginationToken + ", pageLimit=" + this.pageLimit + ", teamviewerIDList=" + this.teamviewerIDList + ")";
    }

    public GroupsDevicesListModel(@sp3(name = "groupsList") List<UUID> list, @sp3(name = "paginationToken") String str, @sp3(name = "pageLimit") Integer num, @sp3(name = "teamviewerIDList") List<String> list2) {
        this.groupsList = list;
        this.paginationToken = str;
        this.pageLimit = num;
        this.teamviewerIDList = list2;
    }

    public GroupsDevicesListModel() {
        this(null, null, null, null, 15, null);
    }
}
