package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/ViewSettings;", "", "remoteResolution", "Lcom/teamviewer/apidefinitions/contacts/models/RemoteResolution;", "window", "Lcom/teamviewer/apidefinitions/contacts/models/Window;", "scaling", "Lcom/teamviewer/apidefinitions/contacts/models/Scaling;", "quality", "Lcom/teamviewer/apidefinitions/contacts/models/Quality;", "initialScreen", "Lcom/teamviewer/apidefinitions/contacts/models/InitialScreen;", "<init>", "(Lcom/teamviewer/apidefinitions/contacts/models/RemoteResolution;Lcom/teamviewer/apidefinitions/contacts/models/Window;Lcom/teamviewer/apidefinitions/contacts/models/Scaling;Lcom/teamviewer/apidefinitions/contacts/models/Quality;Lcom/teamviewer/apidefinitions/contacts/models/InitialScreen;)V", "getRemoteResolution", "()Lcom/teamviewer/apidefinitions/contacts/models/RemoteResolution;", "getWindow", "()Lcom/teamviewer/apidefinitions/contacts/models/Window;", "getScaling", "()Lcom/teamviewer/apidefinitions/contacts/models/Scaling;", "getQuality", "()Lcom/teamviewer/apidefinitions/contacts/models/Quality;", "getInitialScreen", "()Lcom/teamviewer/apidefinitions/contacts/models/InitialScreen;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ViewSettings {
    private final InitialScreen initialScreen;
    private final Quality quality;
    private final RemoteResolution remoteResolution;
    private final Scaling scaling;
    private final Window window;

    public /* synthetic */ ViewSettings(RemoteResolution remoteResolution, Window window, Scaling scaling, Quality quality, InitialScreen initialScreen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RemoteResolution.Inherit : remoteResolution, (i & 2) != 0 ? Window.Inherit : window, (i & 4) != 0 ? Scaling.Inherit : scaling, (i & 8) != 0 ? Quality.Inherit : quality, (i & 16) != 0 ? InitialScreen.Inherit : initialScreen);
    }

    public static /* synthetic */ ViewSettings copy$default(ViewSettings viewSettings, RemoteResolution remoteResolution, Window window, Scaling scaling, Quality quality, InitialScreen initialScreen, int i, Object obj) {
        if ((i & 1) != 0) {
            remoteResolution = viewSettings.remoteResolution;
        }
        if ((i & 2) != 0) {
            window = viewSettings.window;
        }
        if ((i & 4) != 0) {
            scaling = viewSettings.scaling;
        }
        if ((i & 8) != 0) {
            quality = viewSettings.quality;
        }
        if ((i & 16) != 0) {
            initialScreen = viewSettings.initialScreen;
        }
        InitialScreen initialScreen2 = initialScreen;
        Scaling scaling2 = scaling;
        return viewSettings.copy(remoteResolution, window, scaling2, quality, initialScreen2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RemoteResolution getRemoteResolution() {
        return this.remoteResolution;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Window getWindow() {
        return this.window;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Scaling getScaling() {
        return this.scaling;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Quality getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InitialScreen getInitialScreen() {
        return this.initialScreen;
    }

    public final ViewSettings copy(@sp3(name = "remoteResolution") RemoteResolution remoteResolution, @sp3(name = "window") Window window, @sp3(name = "scaling") Scaling scaling, @sp3(name = "quality") Quality quality, @sp3(name = "initialScreen") InitialScreen initialScreen) {
        return new ViewSettings(remoteResolution, window, scaling, quality, initialScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewSettings)) {
            return false;
        }
        ViewSettings viewSettings = (ViewSettings) other;
        return this.remoteResolution == viewSettings.remoteResolution && this.window == viewSettings.window && this.scaling == viewSettings.scaling && this.quality == viewSettings.quality && this.initialScreen == viewSettings.initialScreen;
    }

    public final InitialScreen getInitialScreen() {
        return this.initialScreen;
    }

    public final Quality getQuality() {
        return this.quality;
    }

    public final RemoteResolution getRemoteResolution() {
        return this.remoteResolution;
    }

    public final Scaling getScaling() {
        return this.scaling;
    }

    public final Window getWindow() {
        return this.window;
    }

    public int hashCode() {
        RemoteResolution remoteResolution = this.remoteResolution;
        int iHashCode = (remoteResolution == null ? 0 : remoteResolution.hashCode()) * 31;
        Window window = this.window;
        int iHashCode2 = (iHashCode + (window == null ? 0 : window.hashCode())) * 31;
        Scaling scaling = this.scaling;
        int iHashCode3 = (iHashCode2 + (scaling == null ? 0 : scaling.hashCode())) * 31;
        Quality quality = this.quality;
        int iHashCode4 = (iHashCode3 + (quality == null ? 0 : quality.hashCode())) * 31;
        InitialScreen initialScreen = this.initialScreen;
        return iHashCode4 + (initialScreen != null ? initialScreen.hashCode() : 0);
    }

    public String toString() {
        return "ViewSettings(remoteResolution=" + this.remoteResolution + ", window=" + this.window + ", scaling=" + this.scaling + ", quality=" + this.quality + ", initialScreen=" + this.initialScreen + ")";
    }

    public ViewSettings(@sp3(name = "remoteResolution") RemoteResolution remoteResolution, @sp3(name = "window") Window window, @sp3(name = "scaling") Scaling scaling, @sp3(name = "quality") Quality quality, @sp3(name = "initialScreen") InitialScreen initialScreen) {
        this.remoteResolution = remoteResolution;
        this.window = window;
        this.scaling = scaling;
        this.quality = quality;
        this.initialScreen = initialScreen;
    }

    public ViewSettings() {
        this(null, null, null, null, null, 31, null);
    }
}
