package com.teamviewer.apidefinitions.policies.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/policies/models/DevicesPolicyResponse;", "", "assignments", "", "Lcom/teamviewer/apidefinitions/policies/models/PolicyAssignmentData;", "nextPaginationToken", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getAssignments", "()Ljava/util/List;", "getNextPaginationToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DevicesPolicyResponse {
    private final List<PolicyAssignmentData> assignments;
    private final String nextPaginationToken;

    public /* synthetic */ DevicesPolicyResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DevicesPolicyResponse copy$default(DevicesPolicyResponse devicesPolicyResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = devicesPolicyResponse.assignments;
        }
        if ((i & 2) != 0) {
            str = devicesPolicyResponse.nextPaginationToken;
        }
        return devicesPolicyResponse.copy(list, str);
    }

    public final List<PolicyAssignmentData> component1() {
        return this.assignments;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextPaginationToken() {
        return this.nextPaginationToken;
    }

    public final DevicesPolicyResponse copy(@sp3(name = "assignments") List<PolicyAssignmentData> assignments, @sp3(name = "nextPaginationToken") String nextPaginationToken) {
        return new DevicesPolicyResponse(assignments, nextPaginationToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevicesPolicyResponse)) {
            return false;
        }
        DevicesPolicyResponse devicesPolicyResponse = (DevicesPolicyResponse) other;
        return im3.n(this.assignments, devicesPolicyResponse.assignments) && im3.n(this.nextPaginationToken, devicesPolicyResponse.nextPaginationToken);
    }

    public final List<PolicyAssignmentData> getAssignments() {
        return this.assignments;
    }

    public final String getNextPaginationToken() {
        return this.nextPaginationToken;
    }

    public int hashCode() {
        List<PolicyAssignmentData> list = this.assignments;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextPaginationToken;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DevicesPolicyResponse(assignments=" + this.assignments + ", nextPaginationToken=" + this.nextPaginationToken + ")";
    }

    public DevicesPolicyResponse(@sp3(name = "assignments") List<PolicyAssignmentData> list, @sp3(name = "nextPaginationToken") String str) {
        this.assignments = list;
        this.nextPaginationToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DevicesPolicyResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
