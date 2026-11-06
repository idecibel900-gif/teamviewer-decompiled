package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceGroupInvitationTemplates;", "", "remotecontrol", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyInvitationTemplate;", "meeting", "<init>", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyInvitationTemplate;Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyInvitationTemplate;)V", "getRemotecontrol", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyInvitationTemplate;", "getMeeting", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PreferenceGroupInvitationTemplates {
    private final PreferencePropertyInvitationTemplate meeting;
    private final PreferencePropertyInvitationTemplate remotecontrol;

    public /* synthetic */ PreferenceGroupInvitationTemplates(PreferencePropertyInvitationTemplate preferencePropertyInvitationTemplate, PreferencePropertyInvitationTemplate preferencePropertyInvitationTemplate2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : preferencePropertyInvitationTemplate, (i & 2) != 0 ? null : preferencePropertyInvitationTemplate2);
    }

    public static /* synthetic */ PreferenceGroupInvitationTemplates copy$default(PreferenceGroupInvitationTemplates preferenceGroupInvitationTemplates, PreferencePropertyInvitationTemplate preferencePropertyInvitationTemplate, PreferencePropertyInvitationTemplate preferencePropertyInvitationTemplate2, int i, Object obj) {
        if ((i & 1) != 0) {
            preferencePropertyInvitationTemplate = preferenceGroupInvitationTemplates.remotecontrol;
        }
        if ((i & 2) != 0) {
            preferencePropertyInvitationTemplate2 = preferenceGroupInvitationTemplates.meeting;
        }
        return preferenceGroupInvitationTemplates.copy(preferencePropertyInvitationTemplate, preferencePropertyInvitationTemplate2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PreferencePropertyInvitationTemplate getRemotecontrol() {
        return this.remotecontrol;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PreferencePropertyInvitationTemplate getMeeting() {
        return this.meeting;
    }

    public final PreferenceGroupInvitationTemplates copy(@sp3(name = "remotecontrol") PreferencePropertyInvitationTemplate remotecontrol, @sp3(name = "meeting") PreferencePropertyInvitationTemplate meeting) {
        return new PreferenceGroupInvitationTemplates(remotecontrol, meeting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferenceGroupInvitationTemplates)) {
            return false;
        }
        PreferenceGroupInvitationTemplates preferenceGroupInvitationTemplates = (PreferenceGroupInvitationTemplates) other;
        return im3.n(this.remotecontrol, preferenceGroupInvitationTemplates.remotecontrol) && im3.n(this.meeting, preferenceGroupInvitationTemplates.meeting);
    }

    public final PreferencePropertyInvitationTemplate getMeeting() {
        return this.meeting;
    }

    public final PreferencePropertyInvitationTemplate getRemotecontrol() {
        return this.remotecontrol;
    }

    public int hashCode() {
        PreferencePropertyInvitationTemplate preferencePropertyInvitationTemplate = this.remotecontrol;
        int iHashCode = (preferencePropertyInvitationTemplate == null ? 0 : preferencePropertyInvitationTemplate.hashCode()) * 31;
        PreferencePropertyInvitationTemplate preferencePropertyInvitationTemplate2 = this.meeting;
        return iHashCode + (preferencePropertyInvitationTemplate2 != null ? preferencePropertyInvitationTemplate2.hashCode() : 0);
    }

    public String toString() {
        return "PreferenceGroupInvitationTemplates(remotecontrol=" + this.remotecontrol + ", meeting=" + this.meeting + ")";
    }

    public PreferenceGroupInvitationTemplates(@sp3(name = "remotecontrol") PreferencePropertyInvitationTemplate preferencePropertyInvitationTemplate, @sp3(name = "meeting") PreferencePropertyInvitationTemplate preferencePropertyInvitationTemplate2) {
        this.remotecontrol = preferencePropertyInvitationTemplate;
        this.meeting = preferencePropertyInvitationTemplate2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceGroupInvitationTemplates() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
