package com.teamviewer.apidefinitions.legacydevices.models;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/PolicyOperationProperty;", "", "operation", "Lcom/teamviewer/apidefinitions/legacydevices/models/UpdateOperation;", "policyId", "Ljava/util/UUID;", "<init>", "(Lcom/teamviewer/apidefinitions/legacydevices/models/UpdateOperation;Ljava/util/UUID;)V", "getOperation", "()Lcom/teamviewer/apidefinitions/legacydevices/models/UpdateOperation;", "getPolicyId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PolicyOperationProperty {
    private final UpdateOperation operation;
    private final UUID policyId;

    public PolicyOperationProperty(@sp3(name = "operation") UpdateOperation updateOperation, @sp3(name = "policyId") UUID uuid) {
        updateOperation.getClass();
        this.operation = updateOperation;
        this.policyId = uuid;
    }

    public static /* synthetic */ PolicyOperationProperty copy$default(PolicyOperationProperty policyOperationProperty, UpdateOperation updateOperation, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            updateOperation = policyOperationProperty.operation;
        }
        if ((i & 2) != 0) {
            uuid = policyOperationProperty.policyId;
        }
        return policyOperationProperty.copy(updateOperation, uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UpdateOperation getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getPolicyId() {
        return this.policyId;
    }

    public final PolicyOperationProperty copy(@sp3(name = "operation") UpdateOperation operation, @sp3(name = "policyId") UUID policyId) {
        operation.getClass();
        return new PolicyOperationProperty(operation, policyId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolicyOperationProperty)) {
            return false;
        }
        PolicyOperationProperty policyOperationProperty = (PolicyOperationProperty) other;
        return this.operation == policyOperationProperty.operation && im3.n(this.policyId, policyOperationProperty.policyId);
    }

    public final UpdateOperation getOperation() {
        return this.operation;
    }

    public final UUID getPolicyId() {
        return this.policyId;
    }

    public int hashCode() {
        int iHashCode = this.operation.hashCode() * 31;
        UUID uuid = this.policyId;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "PolicyOperationProperty(operation=" + this.operation + ", policyId=" + this.policyId + ")";
    }

    public /* synthetic */ PolicyOperationProperty(UpdateOperation updateOperation, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(updateOperation, (i & 2) != 0 ? null : uuid);
    }
}
