package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferencePropertyInvitationTemplate;", "", "attributes", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributes;", "type", "Lcom/teamviewer/apidefinitions/remotecontrol/models/InvitationType;", "subject", "", "text", "<init>", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributes;Lcom/teamviewer/apidefinitions/remotecontrol/models/InvitationType;Ljava/lang/String;Ljava/lang/String;)V", "getAttributes", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceAttributes;", "getType", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/InvitationType;", "getSubject", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PreferencePropertyInvitationTemplate {
    private final PreferenceAttributes attributes;
    private final String subject;
    private final String text;
    private final InvitationType type;

    public PreferencePropertyInvitationTemplate(@sp3(name = "attributes") PreferenceAttributes preferenceAttributes, @sp3(name = "type") InvitationType invitationType, @sp3(name = "subject") String str, @sp3(name = "text") String str2) {
        preferenceAttributes.getClass();
        invitationType.getClass();
        str.getClass();
        str2.getClass();
        this.attributes = preferenceAttributes;
        this.type = invitationType;
        this.subject = str;
        this.text = str2;
    }

    public static /* synthetic */ PreferencePropertyInvitationTemplate copy$default(PreferencePropertyInvitationTemplate preferencePropertyInvitationTemplate, PreferenceAttributes preferenceAttributes, InvitationType invitationType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            preferenceAttributes = preferencePropertyInvitationTemplate.attributes;
        }
        if ((i & 2) != 0) {
            invitationType = preferencePropertyInvitationTemplate.type;
        }
        if ((i & 4) != 0) {
            str = preferencePropertyInvitationTemplate.subject;
        }
        if ((i & 8) != 0) {
            str2 = preferencePropertyInvitationTemplate.text;
        }
        return preferencePropertyInvitationTemplate.copy(preferenceAttributes, invitationType, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PreferenceAttributes getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InvitationType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final PreferencePropertyInvitationTemplate copy(@sp3(name = "attributes") PreferenceAttributes attributes, @sp3(name = "type") InvitationType type, @sp3(name = "subject") String subject, @sp3(name = "text") String text) {
        attributes.getClass();
        type.getClass();
        subject.getClass();
        text.getClass();
        return new PreferencePropertyInvitationTemplate(attributes, type, subject, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferencePropertyInvitationTemplate)) {
            return false;
        }
        PreferencePropertyInvitationTemplate preferencePropertyInvitationTemplate = (PreferencePropertyInvitationTemplate) other;
        return im3.n(this.attributes, preferencePropertyInvitationTemplate.attributes) && this.type == preferencePropertyInvitationTemplate.type && im3.n(this.subject, preferencePropertyInvitationTemplate.subject) && im3.n(this.text, preferencePropertyInvitationTemplate.text);
    }

    public final PreferenceAttributes getAttributes() {
        return this.attributes;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getText() {
        return this.text;
    }

    public final InvitationType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.text.hashCode() + to7.e((this.type.hashCode() + (this.attributes.hashCode() * 31)) * 31, 31, this.subject);
    }

    public String toString() {
        PreferenceAttributes preferenceAttributes = this.attributes;
        InvitationType invitationType = this.type;
        String str = this.subject;
        String str2 = this.text;
        StringBuilder sb = new StringBuilder("PreferencePropertyInvitationTemplate(attributes=");
        sb.append(preferenceAttributes);
        sb.append(", type=");
        sb.append(invitationType);
        sb.append(", subject=");
        return e41.m(sb, str, ", text=", str2, ")");
    }
}
