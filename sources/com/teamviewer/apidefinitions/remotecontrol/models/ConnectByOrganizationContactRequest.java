package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByOrganizationContactRequest;", "", "accountId", "", "connectionMode", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByOrganizationContactMode;", "<init>", "(ILcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByOrganizationContactMode;)V", "getAccountId", "()I", "getConnectionMode", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByOrganizationContactMode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectByOrganizationContactRequest {
    private final int accountId;
    private final ConnectByOrganizationContactMode connectionMode;

    public ConnectByOrganizationContactRequest(@sp3(name = "accountId") int i, @sp3(name = "connectionMode") ConnectByOrganizationContactMode connectByOrganizationContactMode) {
        connectByOrganizationContactMode.getClass();
        this.accountId = i;
        this.connectionMode = connectByOrganizationContactMode;
    }

    public static /* synthetic */ ConnectByOrganizationContactRequest copy$default(ConnectByOrganizationContactRequest connectByOrganizationContactRequest, int i, ConnectByOrganizationContactMode connectByOrganizationContactMode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = connectByOrganizationContactRequest.accountId;
        }
        if ((i2 & 2) != 0) {
            connectByOrganizationContactMode = connectByOrganizationContactRequest.connectionMode;
        }
        return connectByOrganizationContactRequest.copy(i, connectByOrganizationContactMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConnectByOrganizationContactMode getConnectionMode() {
        return this.connectionMode;
    }

    public final ConnectByOrganizationContactRequest copy(@sp3(name = "accountId") int accountId, @sp3(name = "connectionMode") ConnectByOrganizationContactMode connectionMode) {
        connectionMode.getClass();
        return new ConnectByOrganizationContactRequest(accountId, connectionMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectByOrganizationContactRequest)) {
            return false;
        }
        ConnectByOrganizationContactRequest connectByOrganizationContactRequest = (ConnectByOrganizationContactRequest) other;
        return this.accountId == connectByOrganizationContactRequest.accountId && this.connectionMode == connectByOrganizationContactRequest.connectionMode;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final ConnectByOrganizationContactMode getConnectionMode() {
        return this.connectionMode;
    }

    public int hashCode() {
        return this.connectionMode.hashCode() + (Integer.hashCode(this.accountId) * 31);
    }

    public String toString() {
        return "ConnectByOrganizationContactRequest(accountId=" + this.accountId + ", connectionMode=" + this.connectionMode + ")";
    }
}
