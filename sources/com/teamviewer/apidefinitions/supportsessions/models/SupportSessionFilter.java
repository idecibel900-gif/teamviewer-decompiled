package com.teamviewer.apidefinitions.supportsessions.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003Je\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006#"}, d2 = {"Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionFilter;", "", "pageLimit", "", "pageNumber", "supportSessionTypes", "", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;", "supportSessionStates", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionState;", "assignedAccountIds", "groupIds", "<init>", "(IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPageLimit", "()I", "getPageNumber", "getSupportSessionTypes", "()Ljava/util/List;", "getSupportSessionStates", "getAssignedAccountIds", "getGroupIds", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportSessionFilter {
    private final List<Integer> assignedAccountIds;
    private final List<Integer> groupIds;
    private final int pageLimit;
    private final int pageNumber;
    private final List<SupportSessionState> supportSessionStates;
    private final List<SupportSessionType> supportSessionTypes;

    public /* synthetic */ SupportSessionFilter(int i, int i2, List list, List list2, List list3, List list4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? null : list2, (i3 & 16) != 0 ? null : list3, (i3 & 32) != 0 ? null : list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportSessionFilter copy$default(SupportSessionFilter supportSessionFilter, int i, int i2, List list, List list2, List list3, List list4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = supportSessionFilter.pageLimit;
        }
        if ((i3 & 2) != 0) {
            i2 = supportSessionFilter.pageNumber;
        }
        if ((i3 & 4) != 0) {
            list = supportSessionFilter.supportSessionTypes;
        }
        if ((i3 & 8) != 0) {
            list2 = supportSessionFilter.supportSessionStates;
        }
        if ((i3 & 16) != 0) {
            list3 = supportSessionFilter.assignedAccountIds;
        }
        if ((i3 & 32) != 0) {
            list4 = supportSessionFilter.groupIds;
        }
        List list5 = list3;
        List list6 = list4;
        return supportSessionFilter.copy(i, i2, list, list2, list5, list6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPageLimit() {
        return this.pageLimit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageNumber() {
        return this.pageNumber;
    }

    public final List<SupportSessionType> component3() {
        return this.supportSessionTypes;
    }

    public final List<SupportSessionState> component4() {
        return this.supportSessionStates;
    }

    public final List<Integer> component5() {
        return this.assignedAccountIds;
    }

    public final List<Integer> component6() {
        return this.groupIds;
    }

    public final SupportSessionFilter copy(@sp3(name = "pageLimit") int pageLimit, @sp3(name = "pageNumber") int pageNumber, @sp3(name = "supportSessionTypes") List<? extends SupportSessionType> supportSessionTypes, @sp3(name = "supportSessionStates") List<? extends SupportSessionState> supportSessionStates, @sp3(name = "assignedAccountIds") List<Integer> assignedAccountIds, @sp3(name = "groupIds") List<Integer> groupIds) {
        return new SupportSessionFilter(pageLimit, pageNumber, supportSessionTypes, supportSessionStates, assignedAccountIds, groupIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportSessionFilter)) {
            return false;
        }
        SupportSessionFilter supportSessionFilter = (SupportSessionFilter) other;
        return this.pageLimit == supportSessionFilter.pageLimit && this.pageNumber == supportSessionFilter.pageNumber && im3.n(this.supportSessionTypes, supportSessionFilter.supportSessionTypes) && im3.n(this.supportSessionStates, supportSessionFilter.supportSessionStates) && im3.n(this.assignedAccountIds, supportSessionFilter.assignedAccountIds) && im3.n(this.groupIds, supportSessionFilter.groupIds);
    }

    public final List<Integer> getAssignedAccountIds() {
        return this.assignedAccountIds;
    }

    public final List<Integer> getGroupIds() {
        return this.groupIds;
    }

    public final int getPageLimit() {
        return this.pageLimit;
    }

    public final int getPageNumber() {
        return this.pageNumber;
    }

    public final List<SupportSessionState> getSupportSessionStates() {
        return this.supportSessionStates;
    }

    public final List<SupportSessionType> getSupportSessionTypes() {
        return this.supportSessionTypes;
    }

    public int hashCode() {
        int iA = fx3.a(this.pageNumber, Integer.hashCode(this.pageLimit) * 31, 31);
        List<SupportSessionType> list = this.supportSessionTypes;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        List<SupportSessionState> list2 = this.supportSessionStates;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.assignedAccountIds;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.groupIds;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        int i = this.pageLimit;
        int i2 = this.pageNumber;
        List<SupportSessionType> list = this.supportSessionTypes;
        List<SupportSessionState> list2 = this.supportSessionStates;
        List<Integer> list3 = this.assignedAccountIds;
        List<Integer> list4 = this.groupIds;
        StringBuilder sbJ = fx3.j(i, i2, "SupportSessionFilter(pageLimit=", ", pageNumber=", ", supportSessionTypes=");
        sbJ.append(list);
        sbJ.append(", supportSessionStates=");
        sbJ.append(list2);
        sbJ.append(", assignedAccountIds=");
        sbJ.append(list3);
        sbJ.append(", groupIds=");
        sbJ.append(list4);
        sbJ.append(")");
        return sbJ.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SupportSessionFilter(@sp3(name = "pageLimit") int i, @sp3(name = "pageNumber") int i2, @sp3(name = "supportSessionTypes") List<? extends SupportSessionType> list, @sp3(name = "supportSessionStates") List<? extends SupportSessionState> list2, @sp3(name = "assignedAccountIds") List<Integer> list3, @sp3(name = "groupIds") List<Integer> list4) {
        this.pageLimit = i;
        this.pageNumber = i2;
        this.supportSessionTypes = list;
        this.supportSessionStates = list2;
        this.assignedAccountIds = list3;
        this.groupIds = list4;
    }
}
