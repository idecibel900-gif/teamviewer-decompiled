package com.teamviewer.apidefinitions.policies.models;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/policies/models/PolicyUnassignmentData;", "", "dyngateId", "", "policyId", "Ljava/util/UUID;", "<init>", "(JLjava/util/UUID;)V", "getDyngateId", "()J", "getPolicyId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PolicyUnassignmentData {
    private final long dyngateId;
    private final UUID policyId;

    public /* synthetic */ PolicyUnassignmentData(long j, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : uuid);
    }

    public static /* synthetic */ PolicyUnassignmentData copy$default(PolicyUnassignmentData policyUnassignmentData, long j, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            j = policyUnassignmentData.dyngateId;
        }
        if ((i & 2) != 0) {
            uuid = policyUnassignmentData.policyId;
        }
        return policyUnassignmentData.copy(j, uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDyngateId() {
        return this.dyngateId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getPolicyId() {
        return this.policyId;
    }

    public final PolicyUnassignmentData copy(@sp3(name = "dyngateId") long dyngateId, @sp3(name = "policyId") UUID policyId) {
        return new PolicyUnassignmentData(dyngateId, policyId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolicyUnassignmentData)) {
            return false;
        }
        PolicyUnassignmentData policyUnassignmentData = (PolicyUnassignmentData) other;
        return this.dyngateId == policyUnassignmentData.dyngateId && im3.n(this.policyId, policyUnassignmentData.policyId);
    }

    public final long getDyngateId() {
        return this.dyngateId;
    }

    public final UUID getPolicyId() {
        return this.policyId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.dyngateId) * 31;
        UUID uuid = this.policyId;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "PolicyUnassignmentData(dyngateId=" + this.dyngateId + ", policyId=" + this.policyId + ")";
    }

    public PolicyUnassignmentData(@sp3(name = "dyngateId") long j, @sp3(name = "policyId") UUID uuid) {
        this.dyngateId = j;
        this.policyId = uuid;
    }
}
