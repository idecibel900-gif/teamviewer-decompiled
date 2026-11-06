package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStatePolicyProperty;", "", "operation", "Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;", "policyId", "Ljava/util/UUID;", "groupId", "<init>", "(Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;Ljava/util/UUID;Ljava/util/UUID;)V", "getOperation", "()Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;", "getPolicyId", "()Ljava/util/UUID;", "getGroupId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceStatePolicyProperty {
    private final UUID groupId;
    private final StateOperation operation;
    private final UUID policyId;

    public /* synthetic */ DeviceStatePolicyProperty(StateOperation stateOperation, UUID uuid, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateOperation, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : uuid2);
    }

    public static /* synthetic */ DeviceStatePolicyProperty copy$default(DeviceStatePolicyProperty deviceStatePolicyProperty, StateOperation stateOperation, UUID uuid, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            stateOperation = deviceStatePolicyProperty.operation;
        }
        if ((i & 2) != 0) {
            uuid = deviceStatePolicyProperty.policyId;
        }
        if ((i & 4) != 0) {
            uuid2 = deviceStatePolicyProperty.groupId;
        }
        return deviceStatePolicyProperty.copy(stateOperation, uuid, uuid2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StateOperation getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getPolicyId() {
        return this.policyId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UUID getGroupId() {
        return this.groupId;
    }

    public final DeviceStatePolicyProperty copy(@sp3(name = "operation") StateOperation operation, @sp3(name = "policyId") UUID policyId, @sp3(name = "groupId") UUID groupId) {
        operation.getClass();
        return new DeviceStatePolicyProperty(operation, policyId, groupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceStatePolicyProperty)) {
            return false;
        }
        DeviceStatePolicyProperty deviceStatePolicyProperty = (DeviceStatePolicyProperty) other;
        return this.operation == deviceStatePolicyProperty.operation && im3.n(this.policyId, deviceStatePolicyProperty.policyId) && im3.n(this.groupId, deviceStatePolicyProperty.groupId);
    }

    public final UUID getGroupId() {
        return this.groupId;
    }

    public final StateOperation getOperation() {
        return this.operation;
    }

    public final UUID getPolicyId() {
        return this.policyId;
    }

    public int hashCode() {
        int iHashCode = this.operation.hashCode() * 31;
        UUID uuid = this.policyId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.groupId;
        return iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0);
    }

    public String toString() {
        return "DeviceStatePolicyProperty(operation=" + this.operation + ", policyId=" + this.policyId + ", groupId=" + this.groupId + ")";
    }

    public DeviceStatePolicyProperty(@sp3(name = "operation") StateOperation stateOperation, @sp3(name = "policyId") UUID uuid, @sp3(name = "groupId") UUID uuid2) {
        stateOperation.getClass();
        this.operation = stateOperation;
        this.policyId = uuid;
        this.groupId = uuid2;
    }
}
