package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyLockRemoteComputer;", "", "attributes", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributes;", "value", "Lcom/teamviewer/apidefinitions/remotecontrol/models/LockRemoteComputerMode;", "<init>", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributes;Lcom/teamviewer/apidefinitions/remotecontrol/models/LockRemoteComputerMode;)V", "getAttributes", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributes;", "getValue", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/LockRemoteComputerMode;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PreferencePropertyLockRemoteComputer {
    private final PreferenceAttributes attributes;
    private final LockRemoteComputerMode value;

    public PreferencePropertyLockRemoteComputer(@sp3(name = "attributes") PreferenceAttributes preferenceAttributes, @sp3(name = "value") LockRemoteComputerMode lockRemoteComputerMode) {
        preferenceAttributes.getClass();
        lockRemoteComputerMode.getClass();
        this.attributes = preferenceAttributes;
        this.value = lockRemoteComputerMode;
    }

    public static /* synthetic */ PreferencePropertyLockRemoteComputer copy$default(PreferencePropertyLockRemoteComputer preferencePropertyLockRemoteComputer, PreferenceAttributes preferenceAttributes, LockRemoteComputerMode lockRemoteComputerMode, int i, Object obj) {
        if ((i & 1) != 0) {
            preferenceAttributes = preferencePropertyLockRemoteComputer.attributes;
        }
        if ((i & 2) != 0) {
            lockRemoteComputerMode = preferencePropertyLockRemoteComputer.value;
        }
        return preferencePropertyLockRemoteComputer.copy(preferenceAttributes, lockRemoteComputerMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PreferenceAttributes getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LockRemoteComputerMode getValue() {
        return this.value;
    }

    public final PreferencePropertyLockRemoteComputer copy(@sp3(name = "attributes") PreferenceAttributes attributes, @sp3(name = "value") LockRemoteComputerMode value) {
        attributes.getClass();
        value.getClass();
        return new PreferencePropertyLockRemoteComputer(attributes, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferencePropertyLockRemoteComputer)) {
            return false;
        }
        PreferencePropertyLockRemoteComputer preferencePropertyLockRemoteComputer = (PreferencePropertyLockRemoteComputer) other;
        return im3.n(this.attributes, preferencePropertyLockRemoteComputer.attributes) && this.value == preferencePropertyLockRemoteComputer.value;
    }

    public final PreferenceAttributes getAttributes() {
        return this.attributes;
    }

    public final LockRemoteComputerMode getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.attributes.hashCode() * 31);
    }

    public String toString() {
        return "PreferencePropertyLockRemoteComputer(attributes=" + this.attributes + ", value=" + this.value + ")";
    }
}
