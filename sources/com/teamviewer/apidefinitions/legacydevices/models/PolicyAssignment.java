package com.teamviewer.apidefinitions.legacydevices.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/PolicyAssignment;", "", "policyId", "Ljava/util/UUID;", "inheritFromGroup", "", "<init>", "(Ljava/util/UUID;Z)V", "getPolicyId", "()Ljava/util/UUID;", "getInheritFromGroup", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PolicyAssignment {
    private final boolean inheritFromGroup;
    private final UUID policyId;

    public PolicyAssignment(@sp3(name = "policyId") UUID uuid, @sp3(name = "inheritFromGroup") boolean z) {
        uuid.getClass();
        this.policyId = uuid;
        this.inheritFromGroup = z;
    }

    public static /* synthetic */ PolicyAssignment copy$default(PolicyAssignment policyAssignment, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = policyAssignment.policyId;
        }
        if ((i & 2) != 0) {
            z = policyAssignment.inheritFromGroup;
        }
        return policyAssignment.copy(uuid, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getPolicyId() {
        return this.policyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getInheritFromGroup() {
        return this.inheritFromGroup;
    }

    public final PolicyAssignment copy(@sp3(name = "policyId") UUID policyId, @sp3(name = "inheritFromGroup") boolean inheritFromGroup) {
        policyId.getClass();
        return new PolicyAssignment(policyId, inheritFromGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolicyAssignment)) {
            return false;
        }
        PolicyAssignment policyAssignment = (PolicyAssignment) other;
        return im3.n(this.policyId, policyAssignment.policyId) && this.inheritFromGroup == policyAssignment.inheritFromGroup;
    }

    public final boolean getInheritFromGroup() {
        return this.inheritFromGroup;
    }

    public final UUID getPolicyId() {
        return this.policyId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.inheritFromGroup) + (this.policyId.hashCode() * 31);
    }

    public String toString() {
        return "PolicyAssignment(policyId=" + this.policyId + ", inheritFromGroup=" + this.inheritFromGroup + ")";
    }
}
