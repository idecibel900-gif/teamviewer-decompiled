package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/ActionSettings;", "", "authentication", "Lcom/teamviewer/apidefinitions/contacts/models/Authentication;", "remoteInput", "Lcom/teamviewer/apidefinitions/contacts/models/RemoteInput;", "<init>", "(Lcom/teamviewer/apidefinitions/contacts/models/Authentication;Lcom/teamviewer/apidefinitions/contacts/models/RemoteInput;)V", "getAuthentication", "()Lcom/teamviewer/apidefinitions/contacts/models/Authentication;", "getRemoteInput", "()Lcom/teamviewer/apidefinitions/contacts/models/RemoteInput;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActionSettings {
    private final Authentication authentication;
    private final RemoteInput remoteInput;

    public /* synthetic */ ActionSettings(Authentication authentication, RemoteInput remoteInput, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Authentication.Inherit : authentication, (i & 2) != 0 ? RemoteInput.Inherit : remoteInput);
    }

    public static /* synthetic */ ActionSettings copy$default(ActionSettings actionSettings, Authentication authentication, RemoteInput remoteInput, int i, Object obj) {
        if ((i & 1) != 0) {
            authentication = actionSettings.authentication;
        }
        if ((i & 2) != 0) {
            remoteInput = actionSettings.remoteInput;
        }
        return actionSettings.copy(authentication, remoteInput);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Authentication getAuthentication() {
        return this.authentication;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RemoteInput getRemoteInput() {
        return this.remoteInput;
    }

    public final ActionSettings copy(@sp3(name = "authentication") Authentication authentication, @sp3(name = "remoteInput") RemoteInput remoteInput) {
        return new ActionSettings(authentication, remoteInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionSettings)) {
            return false;
        }
        ActionSettings actionSettings = (ActionSettings) other;
        return this.authentication == actionSettings.authentication && this.remoteInput == actionSettings.remoteInput;
    }

    public final Authentication getAuthentication() {
        return this.authentication;
    }

    public final RemoteInput getRemoteInput() {
        return this.remoteInput;
    }

    public int hashCode() {
        Authentication authentication = this.authentication;
        int iHashCode = (authentication == null ? 0 : authentication.hashCode()) * 31;
        RemoteInput remoteInput = this.remoteInput;
        return iHashCode + (remoteInput != null ? remoteInput.hashCode() : 0);
    }

    public String toString() {
        return "ActionSettings(authentication=" + this.authentication + ", remoteInput=" + this.remoteInput + ")";
    }

    public ActionSettings(@sp3(name = "authentication") Authentication authentication, @sp3(name = "remoteInput") RemoteInput remoteInput) {
        this.authentication = authentication;
        this.remoteInput = remoteInput;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionSettings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
