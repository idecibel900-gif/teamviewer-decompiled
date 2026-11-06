package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByIPAddressOrHostNameRequest;", "", "ipAddressOrHostName", "", "connectionMode", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByIPAddressOrHostNameMode;", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByIPAddressOrHostNameMode;)V", "getIpAddressOrHostName", "()Ljava/lang/String;", "getConnectionMode", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByIPAddressOrHostNameMode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectByIPAddressOrHostNameRequest {
    private final ConnectByIPAddressOrHostNameMode connectionMode;
    private final String ipAddressOrHostName;

    public ConnectByIPAddressOrHostNameRequest(@sp3(name = "ipAddressOrHostName") String str, @sp3(name = "connectionMode") ConnectByIPAddressOrHostNameMode connectByIPAddressOrHostNameMode) {
        str.getClass();
        connectByIPAddressOrHostNameMode.getClass();
        this.ipAddressOrHostName = str;
        this.connectionMode = connectByIPAddressOrHostNameMode;
    }

    public static /* synthetic */ ConnectByIPAddressOrHostNameRequest copy$default(ConnectByIPAddressOrHostNameRequest connectByIPAddressOrHostNameRequest, String str, ConnectByIPAddressOrHostNameMode connectByIPAddressOrHostNameMode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectByIPAddressOrHostNameRequest.ipAddressOrHostName;
        }
        if ((i & 2) != 0) {
            connectByIPAddressOrHostNameMode = connectByIPAddressOrHostNameRequest.connectionMode;
        }
        return connectByIPAddressOrHostNameRequest.copy(str, connectByIPAddressOrHostNameMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIpAddressOrHostName() {
        return this.ipAddressOrHostName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConnectByIPAddressOrHostNameMode getConnectionMode() {
        return this.connectionMode;
    }

    public final ConnectByIPAddressOrHostNameRequest copy(@sp3(name = "ipAddressOrHostName") String ipAddressOrHostName, @sp3(name = "connectionMode") ConnectByIPAddressOrHostNameMode connectionMode) {
        ipAddressOrHostName.getClass();
        connectionMode.getClass();
        return new ConnectByIPAddressOrHostNameRequest(ipAddressOrHostName, connectionMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectByIPAddressOrHostNameRequest)) {
            return false;
        }
        ConnectByIPAddressOrHostNameRequest connectByIPAddressOrHostNameRequest = (ConnectByIPAddressOrHostNameRequest) other;
        return im3.n(this.ipAddressOrHostName, connectByIPAddressOrHostNameRequest.ipAddressOrHostName) && this.connectionMode == connectByIPAddressOrHostNameRequest.connectionMode;
    }

    public final ConnectByIPAddressOrHostNameMode getConnectionMode() {
        return this.connectionMode;
    }

    public final String getIpAddressOrHostName() {
        return this.ipAddressOrHostName;
    }

    public int hashCode() {
        return this.connectionMode.hashCode() + (this.ipAddressOrHostName.hashCode() * 31);
    }

    public String toString() {
        return "ConnectByIPAddressOrHostNameRequest(ipAddressOrHostName=" + this.ipAddressOrHostName + ", connectionMode=" + this.connectionMode + ")";
    }
}
