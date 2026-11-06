package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectBySessionCodeRequest;", "", "sessionCode", "", "connectionMode", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectBySessionCodeMode;", "<init>", "(ILcom/teamviewer/apidefinitions/remotecontrol/models/ConnectBySessionCodeMode;)V", "getSessionCode", "()I", "getConnectionMode", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectBySessionCodeMode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectBySessionCodeRequest {
    private final ConnectBySessionCodeMode connectionMode;
    private final int sessionCode;

    public ConnectBySessionCodeRequest(@sp3(name = "sessionCode") int i, @sp3(name = "connectionMode") ConnectBySessionCodeMode connectBySessionCodeMode) {
        connectBySessionCodeMode.getClass();
        this.sessionCode = i;
        this.connectionMode = connectBySessionCodeMode;
    }

    public static /* synthetic */ ConnectBySessionCodeRequest copy$default(ConnectBySessionCodeRequest connectBySessionCodeRequest, int i, ConnectBySessionCodeMode connectBySessionCodeMode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = connectBySessionCodeRequest.sessionCode;
        }
        if ((i2 & 2) != 0) {
            connectBySessionCodeMode = connectBySessionCodeRequest.connectionMode;
        }
        return connectBySessionCodeRequest.copy(i, connectBySessionCodeMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSessionCode() {
        return this.sessionCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConnectBySessionCodeMode getConnectionMode() {
        return this.connectionMode;
    }

    public final ConnectBySessionCodeRequest copy(@sp3(name = "sessionCode") int sessionCode, @sp3(name = "connectionMode") ConnectBySessionCodeMode connectionMode) {
        connectionMode.getClass();
        return new ConnectBySessionCodeRequest(sessionCode, connectionMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectBySessionCodeRequest)) {
            return false;
        }
        ConnectBySessionCodeRequest connectBySessionCodeRequest = (ConnectBySessionCodeRequest) other;
        return this.sessionCode == connectBySessionCodeRequest.sessionCode && this.connectionMode == connectBySessionCodeRequest.connectionMode;
    }

    public final ConnectBySessionCodeMode getConnectionMode() {
        return this.connectionMode;
    }

    public final int getSessionCode() {
        return this.sessionCode;
    }

    public int hashCode() {
        return this.connectionMode.hashCode() + (Integer.hashCode(this.sessionCode) * 31);
    }

    public String toString() {
        return "ConnectBySessionCodeRequest(sessionCode=" + this.sessionCode + ", connectionMode=" + this.connectionMode + ")";
    }
}
