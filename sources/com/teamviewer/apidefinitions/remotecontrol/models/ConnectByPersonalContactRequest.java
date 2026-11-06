package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByPersonalContactRequest;", "", "contactId", "", "connectionMode", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByPersonalContactMode;", "<init>", "(ILcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByPersonalContactMode;)V", "getContactId", "()I", "getConnectionMode", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByPersonalContactMode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectByPersonalContactRequest {
    private final ConnectByPersonalContactMode connectionMode;
    private final int contactId;

    public ConnectByPersonalContactRequest(@sp3(name = "contactId") int i, @sp3(name = "connectionMode") ConnectByPersonalContactMode connectByPersonalContactMode) {
        connectByPersonalContactMode.getClass();
        this.contactId = i;
        this.connectionMode = connectByPersonalContactMode;
    }

    public static /* synthetic */ ConnectByPersonalContactRequest copy$default(ConnectByPersonalContactRequest connectByPersonalContactRequest, int i, ConnectByPersonalContactMode connectByPersonalContactMode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = connectByPersonalContactRequest.contactId;
        }
        if ((i2 & 2) != 0) {
            connectByPersonalContactMode = connectByPersonalContactRequest.connectionMode;
        }
        return connectByPersonalContactRequest.copy(i, connectByPersonalContactMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getContactId() {
        return this.contactId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConnectByPersonalContactMode getConnectionMode() {
        return this.connectionMode;
    }

    public final ConnectByPersonalContactRequest copy(@sp3(name = "contactId") int contactId, @sp3(name = "connectionMode") ConnectByPersonalContactMode connectionMode) {
        connectionMode.getClass();
        return new ConnectByPersonalContactRequest(contactId, connectionMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectByPersonalContactRequest)) {
            return false;
        }
        ConnectByPersonalContactRequest connectByPersonalContactRequest = (ConnectByPersonalContactRequest) other;
        return this.contactId == connectByPersonalContactRequest.contactId && this.connectionMode == connectByPersonalContactRequest.connectionMode;
    }

    public final ConnectByPersonalContactMode getConnectionMode() {
        return this.connectionMode;
    }

    public final int getContactId() {
        return this.contactId;
    }

    public int hashCode() {
        return this.connectionMode.hashCode() + (Integer.hashCode(this.contactId) * 31);
    }

    public String toString() {
        return "ConnectByPersonalContactRequest(contactId=" + this.contactId + ", connectionMode=" + this.connectionMode + ")";
    }
}
