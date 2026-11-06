package com.teamviewer.apidefinitions.policies.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/teamviewer/apidefinitions/policies/models/TeamViewerPolicyEvent;", "Lcom/teamviewer/apidefinitions/policies/models/TeamViewerEvent;", "eventType", "", "operation", "Lcom/teamviewer/apidefinitions/policies/models/PolicyChangeOperation;", "policyData", "Lcom/teamviewer/apidefinitions/policies/models/PolicyData;", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/policies/models/PolicyChangeOperation;Lcom/teamviewer/apidefinitions/policies/models/PolicyData;)V", "getEventType", "()Ljava/lang/String;", "getOperation", "()Lcom/teamviewer/apidefinitions/policies/models/PolicyChangeOperation;", "getPolicyData", "()Lcom/teamviewer/apidefinitions/policies/models/PolicyData;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TeamViewerPolicyEvent implements TeamViewerEvent {
    private final String eventType;
    private final PolicyChangeOperation operation;
    private final PolicyData policyData;

    public TeamViewerPolicyEvent(@sp3(name = "eventType") String str, @sp3(name = "operation") PolicyChangeOperation policyChangeOperation, @sp3(name = "policyData") PolicyData policyData) {
        str.getClass();
        policyChangeOperation.getClass();
        policyData.getClass();
        this.eventType = str;
        this.operation = policyChangeOperation;
        this.policyData = policyData;
    }

    public static /* synthetic */ TeamViewerPolicyEvent copy$default(TeamViewerPolicyEvent teamViewerPolicyEvent, String str, PolicyChangeOperation policyChangeOperation, PolicyData policyData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teamViewerPolicyEvent.eventType;
        }
        if ((i & 2) != 0) {
            policyChangeOperation = teamViewerPolicyEvent.operation;
        }
        if ((i & 4) != 0) {
            policyData = teamViewerPolicyEvent.policyData;
        }
        return teamViewerPolicyEvent.copy(str, policyChangeOperation, policyData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PolicyChangeOperation getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PolicyData getPolicyData() {
        return this.policyData;
    }

    public final TeamViewerPolicyEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "operation") PolicyChangeOperation operation, @sp3(name = "policyData") PolicyData policyData) {
        eventType.getClass();
        operation.getClass();
        policyData.getClass();
        return new TeamViewerPolicyEvent(eventType, operation, policyData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamViewerPolicyEvent)) {
            return false;
        }
        TeamViewerPolicyEvent teamViewerPolicyEvent = (TeamViewerPolicyEvent) other;
        return im3.n(this.eventType, teamViewerPolicyEvent.eventType) && this.operation == teamViewerPolicyEvent.operation && im3.n(this.policyData, teamViewerPolicyEvent.policyData);
    }

    @Override // com.teamviewer.apidefinitions.policies.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final PolicyChangeOperation getOperation() {
        return this.operation;
    }

    public final PolicyData getPolicyData() {
        return this.policyData;
    }

    public int hashCode() {
        return this.policyData.hashCode() + ((this.operation.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "TeamViewerPolicyEvent(eventType=" + this.eventType + ", operation=" + this.operation + ", policyData=" + this.policyData + ")";
    }
}
