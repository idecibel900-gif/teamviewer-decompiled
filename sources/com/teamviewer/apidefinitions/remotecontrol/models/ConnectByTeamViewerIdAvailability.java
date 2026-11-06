package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import o.fx3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByTeamViewerIdAvailability;", "", "remoteControlAllowed", "", "fileTransferAllowed", "remoteTerminalAllowed", "portForwardingAllowed", "vpnAllowed", "connectRunning", "<init>", "(ZZZZZZ)V", "getRemoteControlAllowed", "()Z", "getFileTransferAllowed", "getRemoteTerminalAllowed", "getPortForwardingAllowed", "getVpnAllowed", "getConnectRunning", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectByTeamViewerIdAvailability {
    private final boolean connectRunning;
    private final boolean fileTransferAllowed;
    private final boolean portForwardingAllowed;
    private final boolean remoteControlAllowed;
    private final boolean remoteTerminalAllowed;
    private final boolean vpnAllowed;

    public ConnectByTeamViewerIdAvailability(@sp3(name = "remoteControlAllowed") boolean z, @sp3(name = "fileTransferAllowed") boolean z2, @sp3(name = "remoteTerminalAllowed") boolean z3, @sp3(name = "portForwardingAllowed") boolean z4, @sp3(name = "vpnAllowed") boolean z5, @sp3(name = "connectRunning") boolean z6) {
        this.remoteControlAllowed = z;
        this.fileTransferAllowed = z2;
        this.remoteTerminalAllowed = z3;
        this.portForwardingAllowed = z4;
        this.vpnAllowed = z5;
        this.connectRunning = z6;
    }

    public static /* synthetic */ ConnectByTeamViewerIdAvailability copy$default(ConnectByTeamViewerIdAvailability connectByTeamViewerIdAvailability, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = connectByTeamViewerIdAvailability.remoteControlAllowed;
        }
        if ((i & 2) != 0) {
            z2 = connectByTeamViewerIdAvailability.fileTransferAllowed;
        }
        if ((i & 4) != 0) {
            z3 = connectByTeamViewerIdAvailability.remoteTerminalAllowed;
        }
        if ((i & 8) != 0) {
            z4 = connectByTeamViewerIdAvailability.portForwardingAllowed;
        }
        if ((i & 16) != 0) {
            z5 = connectByTeamViewerIdAvailability.vpnAllowed;
        }
        if ((i & 32) != 0) {
            z6 = connectByTeamViewerIdAvailability.connectRunning;
        }
        boolean z7 = z5;
        boolean z8 = z6;
        return connectByTeamViewerIdAvailability.copy(z, z2, z3, z4, z7, z8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRemoteControlAllowed() {
        return this.remoteControlAllowed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFileTransferAllowed() {
        return this.fileTransferAllowed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRemoteTerminalAllowed() {
        return this.remoteTerminalAllowed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getPortForwardingAllowed() {
        return this.portForwardingAllowed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getVpnAllowed() {
        return this.vpnAllowed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getConnectRunning() {
        return this.connectRunning;
    }

    public final ConnectByTeamViewerIdAvailability copy(@sp3(name = "remoteControlAllowed") boolean remoteControlAllowed, @sp3(name = "fileTransferAllowed") boolean fileTransferAllowed, @sp3(name = "remoteTerminalAllowed") boolean remoteTerminalAllowed, @sp3(name = "portForwardingAllowed") boolean portForwardingAllowed, @sp3(name = "vpnAllowed") boolean vpnAllowed, @sp3(name = "connectRunning") boolean connectRunning) {
        return new ConnectByTeamViewerIdAvailability(remoteControlAllowed, fileTransferAllowed, remoteTerminalAllowed, portForwardingAllowed, vpnAllowed, connectRunning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectByTeamViewerIdAvailability)) {
            return false;
        }
        ConnectByTeamViewerIdAvailability connectByTeamViewerIdAvailability = (ConnectByTeamViewerIdAvailability) other;
        return this.remoteControlAllowed == connectByTeamViewerIdAvailability.remoteControlAllowed && this.fileTransferAllowed == connectByTeamViewerIdAvailability.fileTransferAllowed && this.remoteTerminalAllowed == connectByTeamViewerIdAvailability.remoteTerminalAllowed && this.portForwardingAllowed == connectByTeamViewerIdAvailability.portForwardingAllowed && this.vpnAllowed == connectByTeamViewerIdAvailability.vpnAllowed && this.connectRunning == connectByTeamViewerIdAvailability.connectRunning;
    }

    public final boolean getConnectRunning() {
        return this.connectRunning;
    }

    public final boolean getFileTransferAllowed() {
        return this.fileTransferAllowed;
    }

    public final boolean getPortForwardingAllowed() {
        return this.portForwardingAllowed;
    }

    public final boolean getRemoteControlAllowed() {
        return this.remoteControlAllowed;
    }

    public final boolean getRemoteTerminalAllowed() {
        return this.remoteTerminalAllowed;
    }

    public final boolean getVpnAllowed() {
        return this.vpnAllowed;
    }

    public int hashCode() {
        return Boolean.hashCode(this.connectRunning) + to7.f(to7.f(to7.f(to7.f(Boolean.hashCode(this.remoteControlAllowed) * 31, 31, this.fileTransferAllowed), 31, this.remoteTerminalAllowed), 31, this.portForwardingAllowed), 31, this.vpnAllowed);
    }

    public String toString() {
        boolean z = this.remoteControlAllowed;
        boolean z2 = this.fileTransferAllowed;
        boolean z3 = this.remoteTerminalAllowed;
        boolean z4 = this.portForwardingAllowed;
        boolean z5 = this.vpnAllowed;
        boolean z6 = this.connectRunning;
        StringBuilder sb = new StringBuilder("ConnectByTeamViewerIdAvailability(remoteControlAllowed=");
        sb.append(z);
        sb.append(", fileTransferAllowed=");
        sb.append(z2);
        sb.append(", remoteTerminalAllowed=");
        fx3.s(sb, z3, ", portForwardingAllowed=", z4, ", vpnAllowed=");
        sb.append(z5);
        sb.append(", connectRunning=");
        sb.append(z6);
        sb.append(")");
        return sb.toString();
    }
}
