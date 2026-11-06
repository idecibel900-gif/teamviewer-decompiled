package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J:\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByTeamViewerIdRequest;", "", "teamviewerId", "", "connectionMode", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByTeamViewerIdMode;", "promptForConfirmation", "", "thirdPartyFeature", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ThirdPartyFeature;", "<init>", "(JLcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByTeamViewerIdMode;Ljava/lang/Boolean;Lcom/teamviewer/apidefinitions/remotecontrol/models/ThirdPartyFeature;)V", "getTeamviewerId", "()J", "getConnectionMode", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByTeamViewerIdMode;", "getPromptForConfirmation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getThirdPartyFeature", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/ThirdPartyFeature;", "component1", "component2", "component3", "component4", "copy", "(JLcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByTeamViewerIdMode;Ljava/lang/Boolean;Lcom/teamviewer/apidefinitions/remotecontrol/models/ThirdPartyFeature;)Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByTeamViewerIdRequest;", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectByTeamViewerIdRequest {
    private final ConnectByTeamViewerIdMode connectionMode;
    private final Boolean promptForConfirmation;
    private final long teamviewerId;
    private final ThirdPartyFeature thirdPartyFeature;

    public ConnectByTeamViewerIdRequest(@sp3(name = "teamviewerId") long j, @sp3(name = "connectionMode") ConnectByTeamViewerIdMode connectByTeamViewerIdMode, @sp3(name = "promptForConfirmation") Boolean bool, @sp3(name = "thirdPartyFeature") ThirdPartyFeature thirdPartyFeature) {
        connectByTeamViewerIdMode.getClass();
        this.teamviewerId = j;
        this.connectionMode = connectByTeamViewerIdMode;
        this.promptForConfirmation = bool;
        this.thirdPartyFeature = thirdPartyFeature;
    }

    public static /* synthetic */ ConnectByTeamViewerIdRequest copy$default(ConnectByTeamViewerIdRequest connectByTeamViewerIdRequest, long j, ConnectByTeamViewerIdMode connectByTeamViewerIdMode, Boolean bool, ThirdPartyFeature thirdPartyFeature, int i, Object obj) {
        if ((i & 1) != 0) {
            j = connectByTeamViewerIdRequest.teamviewerId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            connectByTeamViewerIdMode = connectByTeamViewerIdRequest.connectionMode;
        }
        ConnectByTeamViewerIdMode connectByTeamViewerIdMode2 = connectByTeamViewerIdMode;
        if ((i & 4) != 0) {
            bool = connectByTeamViewerIdRequest.promptForConfirmation;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            thirdPartyFeature = connectByTeamViewerIdRequest.thirdPartyFeature;
        }
        return connectByTeamViewerIdRequest.copy(j2, connectByTeamViewerIdMode2, bool2, thirdPartyFeature);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTeamviewerId() {
        return this.teamviewerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConnectByTeamViewerIdMode getConnectionMode() {
        return this.connectionMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getPromptForConfirmation() {
        return this.promptForConfirmation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ThirdPartyFeature getThirdPartyFeature() {
        return this.thirdPartyFeature;
    }

    public final ConnectByTeamViewerIdRequest copy(@sp3(name = "teamviewerId") long teamviewerId, @sp3(name = "connectionMode") ConnectByTeamViewerIdMode connectionMode, @sp3(name = "promptForConfirmation") Boolean promptForConfirmation, @sp3(name = "thirdPartyFeature") ThirdPartyFeature thirdPartyFeature) {
        connectionMode.getClass();
        return new ConnectByTeamViewerIdRequest(teamviewerId, connectionMode, promptForConfirmation, thirdPartyFeature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectByTeamViewerIdRequest)) {
            return false;
        }
        ConnectByTeamViewerIdRequest connectByTeamViewerIdRequest = (ConnectByTeamViewerIdRequest) other;
        return this.teamviewerId == connectByTeamViewerIdRequest.teamviewerId && this.connectionMode == connectByTeamViewerIdRequest.connectionMode && im3.n(this.promptForConfirmation, connectByTeamViewerIdRequest.promptForConfirmation) && im3.n(this.thirdPartyFeature, connectByTeamViewerIdRequest.thirdPartyFeature);
    }

    public final ConnectByTeamViewerIdMode getConnectionMode() {
        return this.connectionMode;
    }

    public final Boolean getPromptForConfirmation() {
        return this.promptForConfirmation;
    }

    public final long getTeamviewerId() {
        return this.teamviewerId;
    }

    public final ThirdPartyFeature getThirdPartyFeature() {
        return this.thirdPartyFeature;
    }

    public int hashCode() {
        int iHashCode = (this.connectionMode.hashCode() + (Long.hashCode(this.teamviewerId) * 31)) * 31;
        Boolean bool = this.promptForConfirmation;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ThirdPartyFeature thirdPartyFeature = this.thirdPartyFeature;
        return iHashCode2 + (thirdPartyFeature != null ? thirdPartyFeature.hashCode() : 0);
    }

    public String toString() {
        return "ConnectByTeamViewerIdRequest(teamviewerId=" + this.teamviewerId + ", connectionMode=" + this.connectionMode + ", promptForConfirmation=" + this.promptForConfirmation + ", thirdPartyFeature=" + this.thirdPartyFeature + ")";
    }

    public /* synthetic */ ConnectByTeamViewerIdRequest(long j, ConnectByTeamViewerIdMode connectByTeamViewerIdMode, Boolean bool, ThirdPartyFeature thirdPartyFeature, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, connectByTeamViewerIdMode, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : thirdPartyFeature);
    }
}
