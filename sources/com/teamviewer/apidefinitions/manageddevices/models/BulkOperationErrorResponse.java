package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/BulkOperationErrorResponse;", "", "generalReason", "Lcom/teamviewer/apidefinitions/manageddevices/models/BulkOperationsError;", "failedItems", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/FailedBulkOperationItem;", "<init>", "(Lcom/teamviewer/apidefinitions/manageddevices/models/BulkOperationsError;Ljava/util/List;)V", "getGeneralReason", "()Lcom/teamviewer/apidefinitions/manageddevices/models/BulkOperationsError;", "getFailedItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BulkOperationErrorResponse {
    private final List<FailedBulkOperationItem> failedItems;
    private final BulkOperationsError generalReason;

    public BulkOperationErrorResponse(@sp3(name = "generalReason") BulkOperationsError bulkOperationsError, @sp3(name = "failedItems") List<FailedBulkOperationItem> list) {
        bulkOperationsError.getClass();
        this.generalReason = bulkOperationsError;
        this.failedItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BulkOperationErrorResponse copy$default(BulkOperationErrorResponse bulkOperationErrorResponse, BulkOperationsError bulkOperationsError, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bulkOperationsError = bulkOperationErrorResponse.generalReason;
        }
        if ((i & 2) != 0) {
            list = bulkOperationErrorResponse.failedItems;
        }
        return bulkOperationErrorResponse.copy(bulkOperationsError, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BulkOperationsError getGeneralReason() {
        return this.generalReason;
    }

    public final List<FailedBulkOperationItem> component2() {
        return this.failedItems;
    }

    public final BulkOperationErrorResponse copy(@sp3(name = "generalReason") BulkOperationsError generalReason, @sp3(name = "failedItems") List<FailedBulkOperationItem> failedItems) {
        generalReason.getClass();
        return new BulkOperationErrorResponse(generalReason, failedItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulkOperationErrorResponse)) {
            return false;
        }
        BulkOperationErrorResponse bulkOperationErrorResponse = (BulkOperationErrorResponse) other;
        return this.generalReason == bulkOperationErrorResponse.generalReason && im3.n(this.failedItems, bulkOperationErrorResponse.failedItems);
    }

    public final List<FailedBulkOperationItem> getFailedItems() {
        return this.failedItems;
    }

    public final BulkOperationsError getGeneralReason() {
        return this.generalReason;
    }

    public int hashCode() {
        int iHashCode = this.generalReason.hashCode() * 31;
        List<FailedBulkOperationItem> list = this.failedItems;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "BulkOperationErrorResponse(generalReason=" + this.generalReason + ", failedItems=" + this.failedItems + ")";
    }

    public /* synthetic */ BulkOperationErrorResponse(BulkOperationsError bulkOperationsError, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bulkOperationsError, (i & 2) != 0 ? null : list);
    }
}
