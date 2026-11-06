package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÕ\u0001\u0010?\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020FHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001a¨\u0006G"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceGroupRemoteControl;", "", "automaticallyMinimizeLocalTVPanel", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;", "autoStartRecording", "blackScreenForIncomingConnections", "enableDragAndDrop", "enableLocalInputForIncomingConnections", "endSessionHotKey", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyInt32;", "lockRemoteComputer", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyLockRemoteComputer;", "openConnectionsInTabs", "playComputerSoundsAndMusic", "quality", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyQuality;", "recordPartnersVideoAndVoip", "removeRemoteWallpaper", "saveWindowSizeAndPosition", "sendKeyCombinations", "showRemoteCursor", "synchronizeClipboard", "showScamProtection", "<init>", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyInt32;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyLockRemoteComputer;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyQuality;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;)V", "getAutomaticallyMinimizeLocalTVPanel", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyBool;", "getAutoStartRecording", "getBlackScreenForIncomingConnections", "getEnableDragAndDrop", "getEnableLocalInputForIncomingConnections", "getEndSessionHotKey", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyInt32;", "getLockRemoteComputer", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyLockRemoteComputer;", "getOpenConnectionsInTabs", "getPlayComputerSoundsAndMusic", "getQuality", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyQuality;", "getRecordPartnersVideoAndVoip", "getRemoveRemoteWallpaper", "getSaveWindowSizeAndPosition", "getSendKeyCombinations", "getShowRemoteCursor", "getSynchronizeClipboard", "getShowScamProtection", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PreferenceGroupRemoteControl {
    private final PreferencePropertyBool autoStartRecording;
    private final PreferencePropertyBool automaticallyMinimizeLocalTVPanel;
    private final PreferencePropertyBool blackScreenForIncomingConnections;
    private final PreferencePropertyBool enableDragAndDrop;
    private final PreferencePropertyBool enableLocalInputForIncomingConnections;
    private final PreferencePropertyInt32 endSessionHotKey;
    private final PreferencePropertyLockRemoteComputer lockRemoteComputer;
    private final PreferencePropertyBool openConnectionsInTabs;
    private final PreferencePropertyBool playComputerSoundsAndMusic;
    private final PreferencePropertyQuality quality;
    private final PreferencePropertyBool recordPartnersVideoAndVoip;
    private final PreferencePropertyBool removeRemoteWallpaper;
    private final PreferencePropertyBool saveWindowSizeAndPosition;
    private final PreferencePropertyBool sendKeyCombinations;
    private final PreferencePropertyBool showRemoteCursor;
    private final PreferencePropertyBool showScamProtection;
    private final PreferencePropertyBool synchronizeClipboard;

    public /* synthetic */ PreferenceGroupRemoteControl(PreferencePropertyBool preferencePropertyBool, PreferencePropertyBool preferencePropertyBool2, PreferencePropertyBool preferencePropertyBool3, PreferencePropertyBool preferencePropertyBool4, PreferencePropertyBool preferencePropertyBool5, PreferencePropertyInt32 preferencePropertyInt32, PreferencePropertyLockRemoteComputer preferencePropertyLockRemoteComputer, PreferencePropertyBool preferencePropertyBool6, PreferencePropertyBool preferencePropertyBool7, PreferencePropertyQuality preferencePropertyQuality, PreferencePropertyBool preferencePropertyBool8, PreferencePropertyBool preferencePropertyBool9, PreferencePropertyBool preferencePropertyBool10, PreferencePropertyBool preferencePropertyBool11, PreferencePropertyBool preferencePropertyBool12, PreferencePropertyBool preferencePropertyBool13, PreferencePropertyBool preferencePropertyBool14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : preferencePropertyBool, (i & 2) != 0 ? null : preferencePropertyBool2, (i & 4) != 0 ? null : preferencePropertyBool3, (i & 8) != 0 ? null : preferencePropertyBool4, (i & 16) != 0 ? null : preferencePropertyBool5, (i & 32) != 0 ? null : preferencePropertyInt32, (i & 64) != 0 ? null : preferencePropertyLockRemoteComputer, (i & 128) != 0 ? null : preferencePropertyBool6, (i & 256) != 0 ? null : preferencePropertyBool7, (i & 512) != 0 ? null : preferencePropertyQuality, (i & 1024) != 0 ? null : preferencePropertyBool8, (i & 2048) != 0 ? null : preferencePropertyBool9, (i & 4096) != 0 ? null : preferencePropertyBool10, (i & 8192) != 0 ? null : preferencePropertyBool11, (i & 16384) != 0 ? null : preferencePropertyBool12, (i & 32768) != 0 ? null : preferencePropertyBool13, (i & 65536) != 0 ? null : preferencePropertyBool14);
    }

    public static /* synthetic */ PreferenceGroupRemoteControl copy$default(PreferenceGroupRemoteControl preferenceGroupRemoteControl, PreferencePropertyBool preferencePropertyBool, PreferencePropertyBool preferencePropertyBool2, PreferencePropertyBool preferencePropertyBool3, PreferencePropertyBool preferencePropertyBool4, PreferencePropertyBool preferencePropertyBool5, PreferencePropertyInt32 preferencePropertyInt32, PreferencePropertyLockRemoteComputer preferencePropertyLockRemoteComputer, PreferencePropertyBool preferencePropertyBool6, PreferencePropertyBool preferencePropertyBool7, PreferencePropertyQuality preferencePropertyQuality, PreferencePropertyBool preferencePropertyBool8, PreferencePropertyBool preferencePropertyBool9, PreferencePropertyBool preferencePropertyBool10, PreferencePropertyBool preferencePropertyBool11, PreferencePropertyBool preferencePropertyBool12, PreferencePropertyBool preferencePropertyBool13, PreferencePropertyBool preferencePropertyBool14, int i, Object obj) {
        PreferencePropertyBool preferencePropertyBool15;
        PreferencePropertyBool preferencePropertyBool16;
        PreferencePropertyBool preferencePropertyBool17 = (i & 1) != 0 ? preferenceGroupRemoteControl.automaticallyMinimizeLocalTVPanel : preferencePropertyBool;
        PreferencePropertyBool preferencePropertyBool18 = (i & 2) != 0 ? preferenceGroupRemoteControl.autoStartRecording : preferencePropertyBool2;
        PreferencePropertyBool preferencePropertyBool19 = (i & 4) != 0 ? preferenceGroupRemoteControl.blackScreenForIncomingConnections : preferencePropertyBool3;
        PreferencePropertyBool preferencePropertyBool20 = (i & 8) != 0 ? preferenceGroupRemoteControl.enableDragAndDrop : preferencePropertyBool4;
        PreferencePropertyBool preferencePropertyBool21 = (i & 16) != 0 ? preferenceGroupRemoteControl.enableLocalInputForIncomingConnections : preferencePropertyBool5;
        PreferencePropertyInt32 preferencePropertyInt33 = (i & 32) != 0 ? preferenceGroupRemoteControl.endSessionHotKey : preferencePropertyInt32;
        PreferencePropertyLockRemoteComputer preferencePropertyLockRemoteComputer2 = (i & 64) != 0 ? preferenceGroupRemoteControl.lockRemoteComputer : preferencePropertyLockRemoteComputer;
        PreferencePropertyBool preferencePropertyBool22 = (i & 128) != 0 ? preferenceGroupRemoteControl.openConnectionsInTabs : preferencePropertyBool6;
        PreferencePropertyBool preferencePropertyBool23 = (i & 256) != 0 ? preferenceGroupRemoteControl.playComputerSoundsAndMusic : preferencePropertyBool7;
        PreferencePropertyQuality preferencePropertyQuality2 = (i & 512) != 0 ? preferenceGroupRemoteControl.quality : preferencePropertyQuality;
        PreferencePropertyBool preferencePropertyBool24 = (i & 1024) != 0 ? preferenceGroupRemoteControl.recordPartnersVideoAndVoip : preferencePropertyBool8;
        PreferencePropertyBool preferencePropertyBool25 = (i & 2048) != 0 ? preferenceGroupRemoteControl.removeRemoteWallpaper : preferencePropertyBool9;
        PreferencePropertyBool preferencePropertyBool26 = (i & 4096) != 0 ? preferenceGroupRemoteControl.saveWindowSizeAndPosition : preferencePropertyBool10;
        PreferencePropertyBool preferencePropertyBool27 = (i & 8192) != 0 ? preferenceGroupRemoteControl.sendKeyCombinations : preferencePropertyBool11;
        PreferencePropertyBool preferencePropertyBool28 = preferencePropertyBool17;
        PreferencePropertyBool preferencePropertyBool29 = (i & 16384) != 0 ? preferenceGroupRemoteControl.showRemoteCursor : preferencePropertyBool12;
        PreferencePropertyBool preferencePropertyBool30 = (i & 32768) != 0 ? preferenceGroupRemoteControl.synchronizeClipboard : preferencePropertyBool13;
        if ((i & 65536) != 0) {
            preferencePropertyBool16 = preferencePropertyBool30;
            preferencePropertyBool15 = preferenceGroupRemoteControl.showScamProtection;
        } else {
            preferencePropertyBool15 = preferencePropertyBool14;
            preferencePropertyBool16 = preferencePropertyBool30;
        }
        return preferenceGroupRemoteControl.copy(preferencePropertyBool28, preferencePropertyBool18, preferencePropertyBool19, preferencePropertyBool20, preferencePropertyBool21, preferencePropertyInt33, preferencePropertyLockRemoteComputer2, preferencePropertyBool22, preferencePropertyBool23, preferencePropertyQuality2, preferencePropertyBool24, preferencePropertyBool25, preferencePropertyBool26, preferencePropertyBool27, preferencePropertyBool29, preferencePropertyBool16, preferencePropertyBool15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PreferencePropertyBool getAutomaticallyMinimizeLocalTVPanel() {
        return this.automaticallyMinimizeLocalTVPanel;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PreferencePropertyQuality getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final PreferencePropertyBool getRecordPartnersVideoAndVoip() {
        return this.recordPartnersVideoAndVoip;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final PreferencePropertyBool getRemoveRemoteWallpaper() {
        return this.removeRemoteWallpaper;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final PreferencePropertyBool getSaveWindowSizeAndPosition() {
        return this.saveWindowSizeAndPosition;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final PreferencePropertyBool getSendKeyCombinations() {
        return this.sendKeyCombinations;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final PreferencePropertyBool getShowRemoteCursor() {
        return this.showRemoteCursor;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final PreferencePropertyBool getSynchronizeClipboard() {
        return this.synchronizeClipboard;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final PreferencePropertyBool getShowScamProtection() {
        return this.showScamProtection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PreferencePropertyBool getAutoStartRecording() {
        return this.autoStartRecording;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PreferencePropertyBool getBlackScreenForIncomingConnections() {
        return this.blackScreenForIncomingConnections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PreferencePropertyBool getEnableDragAndDrop() {
        return this.enableDragAndDrop;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PreferencePropertyBool getEnableLocalInputForIncomingConnections() {
        return this.enableLocalInputForIncomingConnections;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PreferencePropertyInt32 getEndSessionHotKey() {
        return this.endSessionHotKey;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PreferencePropertyLockRemoteComputer getLockRemoteComputer() {
        return this.lockRemoteComputer;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PreferencePropertyBool getOpenConnectionsInTabs() {
        return this.openConnectionsInTabs;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PreferencePropertyBool getPlayComputerSoundsAndMusic() {
        return this.playComputerSoundsAndMusic;
    }

    public final PreferenceGroupRemoteControl copy(@sp3(name = "automaticallyMinimizeLocalTVPanel") PreferencePropertyBool automaticallyMinimizeLocalTVPanel, @sp3(name = "autoStartRecording") PreferencePropertyBool autoStartRecording, @sp3(name = "blackScreenForIncomingConnections") PreferencePropertyBool blackScreenForIncomingConnections, @sp3(name = "enableDragAndDrop") PreferencePropertyBool enableDragAndDrop, @sp3(name = "enableLocalInputForIncomingConnections") PreferencePropertyBool enableLocalInputForIncomingConnections, @sp3(name = "endSessionHotKey") PreferencePropertyInt32 endSessionHotKey, @sp3(name = "lockRemoteComputer") PreferencePropertyLockRemoteComputer lockRemoteComputer, @sp3(name = "openConnectionsInTabs") PreferencePropertyBool openConnectionsInTabs, @sp3(name = "playComputerSoundsAndMusic") PreferencePropertyBool playComputerSoundsAndMusic, @sp3(name = "quality") PreferencePropertyQuality quality, @sp3(name = "recordPartnersVideoAndVoip") PreferencePropertyBool recordPartnersVideoAndVoip, @sp3(name = "removeRemoteWallpaper") PreferencePropertyBool removeRemoteWallpaper, @sp3(name = "saveWindowSizeAndPosition") PreferencePropertyBool saveWindowSizeAndPosition, @sp3(name = "sendKeyCombinations") PreferencePropertyBool sendKeyCombinations, @sp3(name = "showRemoteCursor") PreferencePropertyBool showRemoteCursor, @sp3(name = "synchronizeClipboard") PreferencePropertyBool synchronizeClipboard, @sp3(name = "showScamProtection") PreferencePropertyBool showScamProtection) {
        return new PreferenceGroupRemoteControl(automaticallyMinimizeLocalTVPanel, autoStartRecording, blackScreenForIncomingConnections, enableDragAndDrop, enableLocalInputForIncomingConnections, endSessionHotKey, lockRemoteComputer, openConnectionsInTabs, playComputerSoundsAndMusic, quality, recordPartnersVideoAndVoip, removeRemoteWallpaper, saveWindowSizeAndPosition, sendKeyCombinations, showRemoteCursor, synchronizeClipboard, showScamProtection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferenceGroupRemoteControl)) {
            return false;
        }
        PreferenceGroupRemoteControl preferenceGroupRemoteControl = (PreferenceGroupRemoteControl) other;
        return im3.n(this.automaticallyMinimizeLocalTVPanel, preferenceGroupRemoteControl.automaticallyMinimizeLocalTVPanel) && im3.n(this.autoStartRecording, preferenceGroupRemoteControl.autoStartRecording) && im3.n(this.blackScreenForIncomingConnections, preferenceGroupRemoteControl.blackScreenForIncomingConnections) && im3.n(this.enableDragAndDrop, preferenceGroupRemoteControl.enableDragAndDrop) && im3.n(this.enableLocalInputForIncomingConnections, preferenceGroupRemoteControl.enableLocalInputForIncomingConnections) && im3.n(this.endSessionHotKey, preferenceGroupRemoteControl.endSessionHotKey) && im3.n(this.lockRemoteComputer, preferenceGroupRemoteControl.lockRemoteComputer) && im3.n(this.openConnectionsInTabs, preferenceGroupRemoteControl.openConnectionsInTabs) && im3.n(this.playComputerSoundsAndMusic, preferenceGroupRemoteControl.playComputerSoundsAndMusic) && im3.n(this.quality, preferenceGroupRemoteControl.quality) && im3.n(this.recordPartnersVideoAndVoip, preferenceGroupRemoteControl.recordPartnersVideoAndVoip) && im3.n(this.removeRemoteWallpaper, preferenceGroupRemoteControl.removeRemoteWallpaper) && im3.n(this.saveWindowSizeAndPosition, preferenceGroupRemoteControl.saveWindowSizeAndPosition) && im3.n(this.sendKeyCombinations, preferenceGroupRemoteControl.sendKeyCombinations) && im3.n(this.showRemoteCursor, preferenceGroupRemoteControl.showRemoteCursor) && im3.n(this.synchronizeClipboard, preferenceGroupRemoteControl.synchronizeClipboard) && im3.n(this.showScamProtection, preferenceGroupRemoteControl.showScamProtection);
    }

    public final PreferencePropertyBool getAutoStartRecording() {
        return this.autoStartRecording;
    }

    public final PreferencePropertyBool getAutomaticallyMinimizeLocalTVPanel() {
        return this.automaticallyMinimizeLocalTVPanel;
    }

    public final PreferencePropertyBool getBlackScreenForIncomingConnections() {
        return this.blackScreenForIncomingConnections;
    }

    public final PreferencePropertyBool getEnableDragAndDrop() {
        return this.enableDragAndDrop;
    }

    public final PreferencePropertyBool getEnableLocalInputForIncomingConnections() {
        return this.enableLocalInputForIncomingConnections;
    }

    public final PreferencePropertyInt32 getEndSessionHotKey() {
        return this.endSessionHotKey;
    }

    public final PreferencePropertyLockRemoteComputer getLockRemoteComputer() {
        return this.lockRemoteComputer;
    }

    public final PreferencePropertyBool getOpenConnectionsInTabs() {
        return this.openConnectionsInTabs;
    }

    public final PreferencePropertyBool getPlayComputerSoundsAndMusic() {
        return this.playComputerSoundsAndMusic;
    }

    public final PreferencePropertyQuality getQuality() {
        return this.quality;
    }

    public final PreferencePropertyBool getRecordPartnersVideoAndVoip() {
        return this.recordPartnersVideoAndVoip;
    }

    public final PreferencePropertyBool getRemoveRemoteWallpaper() {
        return this.removeRemoteWallpaper;
    }

    public final PreferencePropertyBool getSaveWindowSizeAndPosition() {
        return this.saveWindowSizeAndPosition;
    }

    public final PreferencePropertyBool getSendKeyCombinations() {
        return this.sendKeyCombinations;
    }

    public final PreferencePropertyBool getShowRemoteCursor() {
        return this.showRemoteCursor;
    }

    public final PreferencePropertyBool getShowScamProtection() {
        return this.showScamProtection;
    }

    public final PreferencePropertyBool getSynchronizeClipboard() {
        return this.synchronizeClipboard;
    }

    public int hashCode() {
        PreferencePropertyBool preferencePropertyBool = this.automaticallyMinimizeLocalTVPanel;
        int iHashCode = (preferencePropertyBool == null ? 0 : preferencePropertyBool.hashCode()) * 31;
        PreferencePropertyBool preferencePropertyBool2 = this.autoStartRecording;
        int iHashCode2 = (iHashCode + (preferencePropertyBool2 == null ? 0 : preferencePropertyBool2.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool3 = this.blackScreenForIncomingConnections;
        int iHashCode3 = (iHashCode2 + (preferencePropertyBool3 == null ? 0 : preferencePropertyBool3.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool4 = this.enableDragAndDrop;
        int iHashCode4 = (iHashCode3 + (preferencePropertyBool4 == null ? 0 : preferencePropertyBool4.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool5 = this.enableLocalInputForIncomingConnections;
        int iHashCode5 = (iHashCode4 + (preferencePropertyBool5 == null ? 0 : preferencePropertyBool5.hashCode())) * 31;
        PreferencePropertyInt32 preferencePropertyInt32 = this.endSessionHotKey;
        int iHashCode6 = (iHashCode5 + (preferencePropertyInt32 == null ? 0 : preferencePropertyInt32.hashCode())) * 31;
        PreferencePropertyLockRemoteComputer preferencePropertyLockRemoteComputer = this.lockRemoteComputer;
        int iHashCode7 = (iHashCode6 + (preferencePropertyLockRemoteComputer == null ? 0 : preferencePropertyLockRemoteComputer.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool6 = this.openConnectionsInTabs;
        int iHashCode8 = (iHashCode7 + (preferencePropertyBool6 == null ? 0 : preferencePropertyBool6.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool7 = this.playComputerSoundsAndMusic;
        int iHashCode9 = (iHashCode8 + (preferencePropertyBool7 == null ? 0 : preferencePropertyBool7.hashCode())) * 31;
        PreferencePropertyQuality preferencePropertyQuality = this.quality;
        int iHashCode10 = (iHashCode9 + (preferencePropertyQuality == null ? 0 : preferencePropertyQuality.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool8 = this.recordPartnersVideoAndVoip;
        int iHashCode11 = (iHashCode10 + (preferencePropertyBool8 == null ? 0 : preferencePropertyBool8.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool9 = this.removeRemoteWallpaper;
        int iHashCode12 = (iHashCode11 + (preferencePropertyBool9 == null ? 0 : preferencePropertyBool9.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool10 = this.saveWindowSizeAndPosition;
        int iHashCode13 = (iHashCode12 + (preferencePropertyBool10 == null ? 0 : preferencePropertyBool10.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool11 = this.sendKeyCombinations;
        int iHashCode14 = (iHashCode13 + (preferencePropertyBool11 == null ? 0 : preferencePropertyBool11.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool12 = this.showRemoteCursor;
        int iHashCode15 = (iHashCode14 + (preferencePropertyBool12 == null ? 0 : preferencePropertyBool12.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool13 = this.synchronizeClipboard;
        int iHashCode16 = (iHashCode15 + (preferencePropertyBool13 == null ? 0 : preferencePropertyBool13.hashCode())) * 31;
        PreferencePropertyBool preferencePropertyBool14 = this.showScamProtection;
        return iHashCode16 + (preferencePropertyBool14 != null ? preferencePropertyBool14.hashCode() : 0);
    }

    public String toString() {
        return "PreferenceGroupRemoteControl(automaticallyMinimizeLocalTVPanel=" + this.automaticallyMinimizeLocalTVPanel + ", autoStartRecording=" + this.autoStartRecording + ", blackScreenForIncomingConnections=" + this.blackScreenForIncomingConnections + ", enableDragAndDrop=" + this.enableDragAndDrop + ", enableLocalInputForIncomingConnections=" + this.enableLocalInputForIncomingConnections + ", endSessionHotKey=" + this.endSessionHotKey + ", lockRemoteComputer=" + this.lockRemoteComputer + ", openConnectionsInTabs=" + this.openConnectionsInTabs + ", playComputerSoundsAndMusic=" + this.playComputerSoundsAndMusic + ", quality=" + this.quality + ", recordPartnersVideoAndVoip=" + this.recordPartnersVideoAndVoip + ", removeRemoteWallpaper=" + this.removeRemoteWallpaper + ", saveWindowSizeAndPosition=" + this.saveWindowSizeAndPosition + ", sendKeyCombinations=" + this.sendKeyCombinations + ", showRemoteCursor=" + this.showRemoteCursor + ", synchronizeClipboard=" + this.synchronizeClipboard + ", showScamProtection=" + this.showScamProtection + ")";
    }

    public PreferenceGroupRemoteControl(@sp3(name = "automaticallyMinimizeLocalTVPanel") PreferencePropertyBool preferencePropertyBool, @sp3(name = "autoStartRecording") PreferencePropertyBool preferencePropertyBool2, @sp3(name = "blackScreenForIncomingConnections") PreferencePropertyBool preferencePropertyBool3, @sp3(name = "enableDragAndDrop") PreferencePropertyBool preferencePropertyBool4, @sp3(name = "enableLocalInputForIncomingConnections") PreferencePropertyBool preferencePropertyBool5, @sp3(name = "endSessionHotKey") PreferencePropertyInt32 preferencePropertyInt32, @sp3(name = "lockRemoteComputer") PreferencePropertyLockRemoteComputer preferencePropertyLockRemoteComputer, @sp3(name = "openConnectionsInTabs") PreferencePropertyBool preferencePropertyBool6, @sp3(name = "playComputerSoundsAndMusic") PreferencePropertyBool preferencePropertyBool7, @sp3(name = "quality") PreferencePropertyQuality preferencePropertyQuality, @sp3(name = "recordPartnersVideoAndVoip") PreferencePropertyBool preferencePropertyBool8, @sp3(name = "removeRemoteWallpaper") PreferencePropertyBool preferencePropertyBool9, @sp3(name = "saveWindowSizeAndPosition") PreferencePropertyBool preferencePropertyBool10, @sp3(name = "sendKeyCombinations") PreferencePropertyBool preferencePropertyBool11, @sp3(name = "showRemoteCursor") PreferencePropertyBool preferencePropertyBool12, @sp3(name = "synchronizeClipboard") PreferencePropertyBool preferencePropertyBool13, @sp3(name = "showScamProtection") PreferencePropertyBool preferencePropertyBool14) {
        this.automaticallyMinimizeLocalTVPanel = preferencePropertyBool;
        this.autoStartRecording = preferencePropertyBool2;
        this.blackScreenForIncomingConnections = preferencePropertyBool3;
        this.enableDragAndDrop = preferencePropertyBool4;
        this.enableLocalInputForIncomingConnections = preferencePropertyBool5;
        this.endSessionHotKey = preferencePropertyInt32;
        this.lockRemoteComputer = preferencePropertyLockRemoteComputer;
        this.openConnectionsInTabs = preferencePropertyBool6;
        this.playComputerSoundsAndMusic = preferencePropertyBool7;
        this.quality = preferencePropertyQuality;
        this.recordPartnersVideoAndVoip = preferencePropertyBool8;
        this.removeRemoteWallpaper = preferencePropertyBool9;
        this.saveWindowSizeAndPosition = preferencePropertyBool10;
        this.sendKeyCombinations = preferencePropertyBool11;
        this.showRemoteCursor = preferencePropertyBool12;
        this.synchronizeClipboard = preferencePropertyBool13;
        this.showScamProtection = preferencePropertyBool14;
    }

    public PreferenceGroupRemoteControl() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }
}
