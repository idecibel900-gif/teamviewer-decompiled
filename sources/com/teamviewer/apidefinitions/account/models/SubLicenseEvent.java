package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/SubLicenseEvent;", "Lcom/teamviewer/apidefinitions/account/models/TeamViewerEvent;", "eventType", "", "operation", "Lcom/teamviewer/apidefinitions/account/models/SubLicenseOperation;", "payload", "Lcom/teamviewer/apidefinitions/account/models/TVSublicense;", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/account/models/SubLicenseOperation;Lcom/teamviewer/apidefinitions/account/models/TVSublicense;)V", "getEventType", "()Ljava/lang/String;", "getOperation", "()Lcom/teamviewer/apidefinitions/account/models/SubLicenseOperation;", "getPayload", "()Lcom/teamviewer/apidefinitions/account/models/TVSublicense;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SubLicenseEvent implements TeamViewerEvent {
    private final String eventType;
    private final SubLicenseOperation operation;
    private final TVSublicense payload;

    public /* synthetic */ SubLicenseEvent(String str, SubLicenseOperation subLicenseOperation, TVSublicense tVSublicense, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : subLicenseOperation, (i & 4) != 0 ? null : tVSublicense);
    }

    public static /* synthetic */ SubLicenseEvent copy$default(SubLicenseEvent subLicenseEvent, String str, SubLicenseOperation subLicenseOperation, TVSublicense tVSublicense, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subLicenseEvent.eventType;
        }
        if ((i & 2) != 0) {
            subLicenseOperation = subLicenseEvent.operation;
        }
        if ((i & 4) != 0) {
            tVSublicense = subLicenseEvent.payload;
        }
        return subLicenseEvent.copy(str, subLicenseOperation, tVSublicense);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SubLicenseOperation getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TVSublicense getPayload() {
        return this.payload;
    }

    public final SubLicenseEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "operation") SubLicenseOperation operation, @sp3(name = "payload") TVSublicense payload) {
        eventType.getClass();
        return new SubLicenseEvent(eventType, operation, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubLicenseEvent)) {
            return false;
        }
        SubLicenseEvent subLicenseEvent = (SubLicenseEvent) other;
        return im3.n(this.eventType, subLicenseEvent.eventType) && this.operation == subLicenseEvent.operation && im3.n(this.payload, subLicenseEvent.payload);
    }

    @Override // com.teamviewer.apidefinitions.account.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final SubLicenseOperation getOperation() {
        return this.operation;
    }

    public final TVSublicense getPayload() {
        return this.payload;
    }

    public int hashCode() {
        int iHashCode = this.eventType.hashCode() * 31;
        SubLicenseOperation subLicenseOperation = this.operation;
        int iHashCode2 = (iHashCode + (subLicenseOperation == null ? 0 : subLicenseOperation.hashCode())) * 31;
        TVSublicense tVSublicense = this.payload;
        return iHashCode2 + (tVSublicense != null ? tVSublicense.hashCode() : 0);
    }

    public String toString() {
        return "SubLicenseEvent(eventType=" + this.eventType + ", operation=" + this.operation + ", payload=" + this.payload + ")";
    }

    public SubLicenseEvent(@sp3(name = "eventType") String str, @sp3(name = "operation") SubLicenseOperation subLicenseOperation, @sp3(name = "payload") TVSublicense tVSublicense) {
        str.getClass();
        this.eventType = str;
        this.operation = subLicenseOperation;
        this.payload = tVSublicense;
    }
}
