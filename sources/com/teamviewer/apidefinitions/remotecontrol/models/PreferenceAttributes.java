package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributes;", "", "mode", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributeMode;", "modeReason", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributeModeReason;", "<init>", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributeMode;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributeModeReason;)V", "getMode", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributeMode;", "getModeReason", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributeModeReason;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PreferenceAttributes {
    private final PreferenceAttributeMode mode;
    private final PreferenceAttributeModeReason modeReason;

    public PreferenceAttributes(@sp3(name = "mode") PreferenceAttributeMode preferenceAttributeMode, @sp3(name = "modeReason") PreferenceAttributeModeReason preferenceAttributeModeReason) {
        preferenceAttributeMode.getClass();
        this.mode = preferenceAttributeMode;
        this.modeReason = preferenceAttributeModeReason;
    }

    public static /* synthetic */ PreferenceAttributes copy$default(PreferenceAttributes preferenceAttributes, PreferenceAttributeMode preferenceAttributeMode, PreferenceAttributeModeReason preferenceAttributeModeReason, int i, Object obj) {
        if ((i & 1) != 0) {
            preferenceAttributeMode = preferenceAttributes.mode;
        }
        if ((i & 2) != 0) {
            preferenceAttributeModeReason = preferenceAttributes.modeReason;
        }
        return preferenceAttributes.copy(preferenceAttributeMode, preferenceAttributeModeReason);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PreferenceAttributeMode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PreferenceAttributeModeReason getModeReason() {
        return this.modeReason;
    }

    public final PreferenceAttributes copy(@sp3(name = "mode") PreferenceAttributeMode mode, @sp3(name = "modeReason") PreferenceAttributeModeReason modeReason) {
        mode.getClass();
        return new PreferenceAttributes(mode, modeReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferenceAttributes)) {
            return false;
        }
        PreferenceAttributes preferenceAttributes = (PreferenceAttributes) other;
        return this.mode == preferenceAttributes.mode && this.modeReason == preferenceAttributes.modeReason;
    }

    public final PreferenceAttributeMode getMode() {
        return this.mode;
    }

    public final PreferenceAttributeModeReason getModeReason() {
        return this.modeReason;
    }

    public int hashCode() {
        int iHashCode = this.mode.hashCode() * 31;
        PreferenceAttributeModeReason preferenceAttributeModeReason = this.modeReason;
        return iHashCode + (preferenceAttributeModeReason == null ? 0 : preferenceAttributeModeReason.hashCode());
    }

    public String toString() {
        return "PreferenceAttributes(mode=" + this.mode + ", modeReason=" + this.modeReason + ")";
    }

    public /* synthetic */ PreferenceAttributes(PreferenceAttributeMode preferenceAttributeMode, PreferenceAttributeModeReason preferenceAttributeModeReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(preferenceAttributeMode, (i & 2) != 0 ? null : preferenceAttributeModeReason);
    }
}
