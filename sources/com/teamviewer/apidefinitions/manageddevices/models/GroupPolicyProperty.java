package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyProperty;", "", "policyId", "Ljava/util/UUID;", "operation", "Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;", "<init>", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;)V", "getPolicyId", "()Ljava/util/UUID;", "getOperation", "()Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupPolicyProperty {
    private final StateOperation operation;
    private final UUID policyId;

    public GroupPolicyProperty(@sp3(name = "policyId") UUID uuid, @sp3(name = "operation") StateOperation stateOperation) {
        uuid.getClass();
        stateOperation.getClass();
        this.policyId = uuid;
        this.operation = stateOperation;
    }

    public static /* synthetic */ GroupPolicyProperty copy$default(GroupPolicyProperty groupPolicyProperty, UUID uuid, StateOperation stateOperation, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = groupPolicyProperty.policyId;
        }
        if ((i & 2) != 0) {
            stateOperation = groupPolicyProperty.operation;
        }
        return groupPolicyProperty.copy(uuid, stateOperation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getPolicyId() {
        return this.policyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StateOperation getOperation() {
        return this.operation;
    }

    public final GroupPolicyProperty copy(@sp3(name = "policyId") UUID policyId, @sp3(name = "operation") StateOperation operation) {
        policyId.getClass();
        operation.getClass();
        return new GroupPolicyProperty(policyId, operation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupPolicyProperty)) {
            return false;
        }
        GroupPolicyProperty groupPolicyProperty = (GroupPolicyProperty) other;
        return im3.n(this.policyId, groupPolicyProperty.policyId) && this.operation == groupPolicyProperty.operation;
    }

    public final StateOperation getOperation() {
        return this.operation;
    }

    public final UUID getPolicyId() {
        return this.policyId;
    }

    public int hashCode() {
        return this.operation.hashCode() + (this.policyId.hashCode() * 31);
    }

    public String toString() {
        return "GroupPolicyProperty(policyId=" + this.policyId + ", operation=" + this.operation + ")";
    }
}
