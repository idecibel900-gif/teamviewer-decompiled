package com.teamviewer.apidefinitions.remotecontrol.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/CapabilitiesByKnownDeviceTeamViewerIdResponse;", "", "connectionModes", "", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByKnownDeviceMode;", "<init>", "(Ljava/util/List;)V", "getConnectionModes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CapabilitiesByKnownDeviceTeamViewerIdResponse {
    private final List<ConnectByKnownDeviceMode> connectionModes;

    public /* synthetic */ CapabilitiesByKnownDeviceTeamViewerIdResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CapabilitiesByKnownDeviceTeamViewerIdResponse copy$default(CapabilitiesByKnownDeviceTeamViewerIdResponse capabilitiesByKnownDeviceTeamViewerIdResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = capabilitiesByKnownDeviceTeamViewerIdResponse.connectionModes;
        }
        return capabilitiesByKnownDeviceTeamViewerIdResponse.copy(list);
    }

    public final List<ConnectByKnownDeviceMode> component1() {
        return this.connectionModes;
    }

    public final CapabilitiesByKnownDeviceTeamViewerIdResponse copy(@sp3(name = "connectionModes") List<? extends ConnectByKnownDeviceMode> connectionModes) {
        return new CapabilitiesByKnownDeviceTeamViewerIdResponse(connectionModes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CapabilitiesByKnownDeviceTeamViewerIdResponse) && im3.n(this.connectionModes, ((CapabilitiesByKnownDeviceTeamViewerIdResponse) other).connectionModes);
    }

    public final List<ConnectByKnownDeviceMode> getConnectionModes() {
        return this.connectionModes;
    }

    public int hashCode() {
        List<ConnectByKnownDeviceMode> list = this.connectionModes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return fx3.i("CapabilitiesByKnownDeviceTeamViewerIdResponse(connectionModes=", this.connectionModes, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CapabilitiesByKnownDeviceTeamViewerIdResponse(@sp3(name = "connectionModes") List<? extends ConnectByKnownDeviceMode> list) {
        this.connectionModes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CapabilitiesByKnownDeviceTeamViewerIdResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
