package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByKnownDeviceTeamViewerIdRequest;", "", "teamviewerId", "", "connectionMode", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByKnownDeviceMode;", "thirdPartyFeature", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ThirdPartyFeature;", "<init>", "(JLcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByKnownDeviceMode;Lcom/teamviewer/apidefinitions/remotecontrol/models/ThirdPartyFeature;)V", "getTeamviewerId", "()J", "getConnectionMode", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByKnownDeviceMode;", "getThirdPartyFeature", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/ThirdPartyFeature;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectByKnownDeviceTeamViewerIdRequest {
    private final ConnectByKnownDeviceMode connectionMode;
    private final long teamviewerId;
    private final ThirdPartyFeature thirdPartyFeature;

    public ConnectByKnownDeviceTeamViewerIdRequest(@sp3(name = "teamviewerId") long j, @sp3(name = "connectionMode") ConnectByKnownDeviceMode connectByKnownDeviceMode, @sp3(name = "thirdPartyFeature") ThirdPartyFeature thirdPartyFeature) {
        connectByKnownDeviceMode.getClass();
        this.teamviewerId = j;
        this.connectionMode = connectByKnownDeviceMode;
        this.thirdPartyFeature = thirdPartyFeature;
    }

    public static /* synthetic */ ConnectByKnownDeviceTeamViewerIdRequest copy$default(ConnectByKnownDeviceTeamViewerIdRequest connectByKnownDeviceTeamViewerIdRequest, long j, ConnectByKnownDeviceMode connectByKnownDeviceMode, ThirdPartyFeature thirdPartyFeature, int i, Object obj) {
        if ((i & 1) != 0) {
            j = connectByKnownDeviceTeamViewerIdRequest.teamviewerId;
        }
        if ((i & 2) != 0) {
            connectByKnownDeviceMode = connectByKnownDeviceTeamViewerIdRequest.connectionMode;
        }
        if ((i & 4) != 0) {
            thirdPartyFeature = connectByKnownDeviceTeamViewerIdRequest.thirdPartyFeature;
        }
        return connectByKnownDeviceTeamViewerIdRequest.copy(j, connectByKnownDeviceMode, thirdPartyFeature);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTeamviewerId() {
        return this.teamviewerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConnectByKnownDeviceMode getConnectionMode() {
        return this.connectionMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ThirdPartyFeature getThirdPartyFeature() {
        return this.thirdPartyFeature;
    }

    public final ConnectByKnownDeviceTeamViewerIdRequest copy(@sp3(name = "teamviewerId") long teamviewerId, @sp3(name = "connectionMode") ConnectByKnownDeviceMode connectionMode, @sp3(name = "thirdPartyFeature") ThirdPartyFeature thirdPartyFeature) {
        connectionMode.getClass();
        return new ConnectByKnownDeviceTeamViewerIdRequest(teamviewerId, connectionMode, thirdPartyFeature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectByKnownDeviceTeamViewerIdRequest)) {
            return false;
        }
        ConnectByKnownDeviceTeamViewerIdRequest connectByKnownDeviceTeamViewerIdRequest = (ConnectByKnownDeviceTeamViewerIdRequest) other;
        return this.teamviewerId == connectByKnownDeviceTeamViewerIdRequest.teamviewerId && this.connectionMode == connectByKnownDeviceTeamViewerIdRequest.connectionMode && im3.n(this.thirdPartyFeature, connectByKnownDeviceTeamViewerIdRequest.thirdPartyFeature);
    }

    public final ConnectByKnownDeviceMode getConnectionMode() {
        return this.connectionMode;
    }

    public final long getTeamviewerId() {
        return this.teamviewerId;
    }

    public final ThirdPartyFeature getThirdPartyFeature() {
        return this.thirdPartyFeature;
    }

    public int hashCode() {
        int iHashCode = (this.connectionMode.hashCode() + (Long.hashCode(this.teamviewerId) * 31)) * 31;
        ThirdPartyFeature thirdPartyFeature = this.thirdPartyFeature;
        return iHashCode + (thirdPartyFeature == null ? 0 : thirdPartyFeature.hashCode());
    }

    public String toString() {
        return "ConnectByKnownDeviceTeamViewerIdRequest(teamviewerId=" + this.teamviewerId + ", connectionMode=" + this.connectionMode + ", thirdPartyFeature=" + this.thirdPartyFeature + ")";
    }

    public /* synthetic */ ConnectByKnownDeviceTeamViewerIdRequest(long j, ConnectByKnownDeviceMode connectByKnownDeviceMode, ThirdPartyFeature thirdPartyFeature, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, connectByKnownDeviceMode, (i & 4) != 0 ? null : thirdPartyFeature);
    }
}
