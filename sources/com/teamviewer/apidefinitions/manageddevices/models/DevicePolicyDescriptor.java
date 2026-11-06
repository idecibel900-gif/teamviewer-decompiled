package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/DevicePolicyDescriptor;", "", "policyId", "Ljava/util/UUID;", "groupId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getPolicyId", "()Ljava/util/UUID;", "getGroupId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DevicePolicyDescriptor {
    private final UUID groupId;
    private final UUID policyId;

    public /* synthetic */ DevicePolicyDescriptor(UUID uuid, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : uuid2);
    }

    public static /* synthetic */ DevicePolicyDescriptor copy$default(DevicePolicyDescriptor devicePolicyDescriptor, UUID uuid, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = devicePolicyDescriptor.policyId;
        }
        if ((i & 2) != 0) {
            uuid2 = devicePolicyDescriptor.groupId;
        }
        return devicePolicyDescriptor.copy(uuid, uuid2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getPolicyId() {
        return this.policyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getGroupId() {
        return this.groupId;
    }

    public final DevicePolicyDescriptor copy(@sp3(name = "policyId") UUID policyId, @sp3(name = "groupId") UUID groupId) {
        return new DevicePolicyDescriptor(policyId, groupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevicePolicyDescriptor)) {
            return false;
        }
        DevicePolicyDescriptor devicePolicyDescriptor = (DevicePolicyDescriptor) other;
        return im3.n(this.policyId, devicePolicyDescriptor.policyId) && im3.n(this.groupId, devicePolicyDescriptor.groupId);
    }

    public final UUID getGroupId() {
        return this.groupId;
    }

    public final UUID getPolicyId() {
        return this.policyId;
    }

    public int hashCode() {
        UUID uuid = this.policyId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        UUID uuid2 = this.groupId;
        return iHashCode + (uuid2 != null ? uuid2.hashCode() : 0);
    }

    public String toString() {
        return "DevicePolicyDescriptor(policyId=" + this.policyId + ", groupId=" + this.groupId + ")";
    }

    public DevicePolicyDescriptor(@sp3(name = "policyId") UUID uuid, @sp3(name = "groupId") UUID uuid2) {
        this.policyId = uuid;
        this.groupId = uuid2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DevicePolicyDescriptor() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
