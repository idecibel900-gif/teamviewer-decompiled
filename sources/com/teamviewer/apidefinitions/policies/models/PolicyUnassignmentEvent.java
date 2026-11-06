package com.teamviewer.apidefinitions.policies.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/policies/models/PolicyUnassignmentEvent;", "Lcom/teamviewer/apidefinitions/policies/models/TeamViewerEvent;", "eventType", "", "policyData", "Lcom/teamviewer/apidefinitions/policies/models/PolicyUnassignmentData;", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/policies/models/PolicyUnassignmentData;)V", "getEventType", "()Ljava/lang/String;", "getPolicyData", "()Lcom/teamviewer/apidefinitions/policies/models/PolicyUnassignmentData;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PolicyUnassignmentEvent implements TeamViewerEvent {
    private final String eventType;
    private final PolicyUnassignmentData policyData;

    public PolicyUnassignmentEvent(@sp3(name = "eventType") String str, @sp3(name = "policyData") PolicyUnassignmentData policyUnassignmentData) {
        str.getClass();
        policyUnassignmentData.getClass();
        this.eventType = str;
        this.policyData = policyUnassignmentData;
    }

    public static /* synthetic */ PolicyUnassignmentEvent copy$default(PolicyUnassignmentEvent policyUnassignmentEvent, String str, PolicyUnassignmentData policyUnassignmentData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = policyUnassignmentEvent.eventType;
        }
        if ((i & 2) != 0) {
            policyUnassignmentData = policyUnassignmentEvent.policyData;
        }
        return policyUnassignmentEvent.copy(str, policyUnassignmentData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PolicyUnassignmentData getPolicyData() {
        return this.policyData;
    }

    public final PolicyUnassignmentEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "policyData") PolicyUnassignmentData policyData) {
        eventType.getClass();
        policyData.getClass();
        return new PolicyUnassignmentEvent(eventType, policyData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolicyUnassignmentEvent)) {
            return false;
        }
        PolicyUnassignmentEvent policyUnassignmentEvent = (PolicyUnassignmentEvent) other;
        return im3.n(this.eventType, policyUnassignmentEvent.eventType) && im3.n(this.policyData, policyUnassignmentEvent.policyData);
    }

    @Override // com.teamviewer.apidefinitions.policies.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final PolicyUnassignmentData getPolicyData() {
        return this.policyData;
    }

    public int hashCode() {
        return this.policyData.hashCode() + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return "PolicyUnassignmentEvent(eventType=" + this.eventType + ", policyData=" + this.policyData + ")";
    }
}
