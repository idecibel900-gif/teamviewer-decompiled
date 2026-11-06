package com.teamviewer.apidefinitions.policies.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/teamviewer/apidefinitions/policies/models/PolicyAssignmentData;", "", "policyId", "Ljava/util/UUID;", "dyngateIds", "", "", "<init>", "(Ljava/util/UUID;Ljava/util/List;)V", "getPolicyId", "()Ljava/util/UUID;", "getDyngateIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PolicyAssignmentData {
    private final List<Long> dyngateIds;
    private final UUID policyId;

    public PolicyAssignmentData(@sp3(name = "policyId") UUID uuid, @sp3(name = "dyngateIds") List<Long> list) {
        uuid.getClass();
        list.getClass();
        this.policyId = uuid;
        this.dyngateIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PolicyAssignmentData copy$default(PolicyAssignmentData policyAssignmentData, UUID uuid, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = policyAssignmentData.policyId;
        }
        if ((i & 2) != 0) {
            list = policyAssignmentData.dyngateIds;
        }
        return policyAssignmentData.copy(uuid, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getPolicyId() {
        return this.policyId;
    }

    public final List<Long> component2() {
        return this.dyngateIds;
    }

    public final PolicyAssignmentData copy(@sp3(name = "policyId") UUID policyId, @sp3(name = "dyngateIds") List<Long> dyngateIds) {
        policyId.getClass();
        dyngateIds.getClass();
        return new PolicyAssignmentData(policyId, dyngateIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolicyAssignmentData)) {
            return false;
        }
        PolicyAssignmentData policyAssignmentData = (PolicyAssignmentData) other;
        return im3.n(this.policyId, policyAssignmentData.policyId) && im3.n(this.dyngateIds, policyAssignmentData.dyngateIds);
    }

    public final List<Long> getDyngateIds() {
        return this.dyngateIds;
    }

    public final UUID getPolicyId() {
        return this.policyId;
    }

    public int hashCode() {
        return this.dyngateIds.hashCode() + (this.policyId.hashCode() * 31);
    }

    public String toString() {
        return "PolicyAssignmentData(policyId=" + this.policyId + ", dyngateIds=" + this.dyngateIds + ")";
    }
}
