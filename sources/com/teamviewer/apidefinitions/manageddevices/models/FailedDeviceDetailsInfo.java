package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/FailedDeviceDetailsInfo;", "", "managementId", "Ljava/util/UUID;", "errorMessage", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getManagementId", "()Ljava/util/UUID;", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FailedDeviceDetailsInfo {
    private final String errorMessage;
    private final UUID managementId;

    public FailedDeviceDetailsInfo(@sp3(name = "managementId") UUID uuid, @sp3(name = "errorMessage") String str) {
        uuid.getClass();
        str.getClass();
        this.managementId = uuid;
        this.errorMessage = str;
    }

    public static /* synthetic */ FailedDeviceDetailsInfo copy$default(FailedDeviceDetailsInfo failedDeviceDetailsInfo, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = failedDeviceDetailsInfo.managementId;
        }
        if ((i & 2) != 0) {
            str = failedDeviceDetailsInfo.errorMessage;
        }
        return failedDeviceDetailsInfo.copy(uuid, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getManagementId() {
        return this.managementId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final FailedDeviceDetailsInfo copy(@sp3(name = "managementId") UUID managementId, @sp3(name = "errorMessage") String errorMessage) {
        managementId.getClass();
        errorMessage.getClass();
        return new FailedDeviceDetailsInfo(managementId, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FailedDeviceDetailsInfo)) {
            return false;
        }
        FailedDeviceDetailsInfo failedDeviceDetailsInfo = (FailedDeviceDetailsInfo) other;
        return im3.n(this.managementId, failedDeviceDetailsInfo.managementId) && im3.n(this.errorMessage, failedDeviceDetailsInfo.errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final UUID getManagementId() {
        return this.managementId;
    }

    public int hashCode() {
        return this.errorMessage.hashCode() + (this.managementId.hashCode() * 31);
    }

    public String toString() {
        return "FailedDeviceDetailsInfo(managementId=" + this.managementId + ", errorMessage=" + this.errorMessage + ")";
    }
}
