package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/FailedBulkOperationItem;", "", "id", "Ljava/util/UUID;", "reason", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FailedBulkOperationItem {
    private final UUID id;
    private final String reason;

    public FailedBulkOperationItem(@sp3(name = "id") UUID uuid, @sp3(name = "reason") String str) {
        uuid.getClass();
        str.getClass();
        this.id = uuid;
        this.reason = str;
    }

    public static /* synthetic */ FailedBulkOperationItem copy$default(FailedBulkOperationItem failedBulkOperationItem, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = failedBulkOperationItem.id;
        }
        if ((i & 2) != 0) {
            str = failedBulkOperationItem.reason;
        }
        return failedBulkOperationItem.copy(uuid, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final FailedBulkOperationItem copy(@sp3(name = "id") UUID id, @sp3(name = "reason") String reason) {
        id.getClass();
        reason.getClass();
        return new FailedBulkOperationItem(id, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FailedBulkOperationItem)) {
            return false;
        }
        FailedBulkOperationItem failedBulkOperationItem = (FailedBulkOperationItem) other;
        return im3.n(this.id, failedBulkOperationItem.id) && im3.n(this.reason, failedBulkOperationItem.reason);
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return "FailedBulkOperationItem(id=" + this.id + ", reason=" + this.reason + ")";
    }
}
