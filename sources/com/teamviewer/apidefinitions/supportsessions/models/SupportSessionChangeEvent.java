package com.teamviewer.apidefinitions.supportsessions.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionChangeEvent;", "Lcom/teamviewer/apidefinitions/supportsessions/models/TeamViewerEvent;", "eventType", "", "sessioncode", "", "supportSession", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSession;", "<init>", "(Ljava/lang/String;ILcom/teamviewer/apidefinitions/supportsessions/models/SupportSession;)V", "getEventType", "()Ljava/lang/String;", "getSessioncode", "()I", "getSupportSession", "()Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSession;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportSessionChangeEvent implements TeamViewerEvent {
    private final String eventType;
    private final int sessioncode;
    private final SupportSession supportSession;

    public SupportSessionChangeEvent(@sp3(name = "eventType") String str, @sp3(name = "sessioncode") int i, @sp3(name = "supportSession") SupportSession supportSession) {
        str.getClass();
        this.eventType = str;
        this.sessioncode = i;
        this.supportSession = supportSession;
    }

    public static /* synthetic */ SupportSessionChangeEvent copy$default(SupportSessionChangeEvent supportSessionChangeEvent, String str, int i, SupportSession supportSession, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = supportSessionChangeEvent.eventType;
        }
        if ((i2 & 2) != 0) {
            i = supportSessionChangeEvent.sessioncode;
        }
        if ((i2 & 4) != 0) {
            supportSession = supportSessionChangeEvent.supportSession;
        }
        return supportSessionChangeEvent.copy(str, i, supportSession);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSessioncode() {
        return this.sessioncode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SupportSession getSupportSession() {
        return this.supportSession;
    }

    public final SupportSessionChangeEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "sessioncode") int sessioncode, @sp3(name = "supportSession") SupportSession supportSession) {
        eventType.getClass();
        return new SupportSessionChangeEvent(eventType, sessioncode, supportSession);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportSessionChangeEvent)) {
            return false;
        }
        SupportSessionChangeEvent supportSessionChangeEvent = (SupportSessionChangeEvent) other;
        return im3.n(this.eventType, supportSessionChangeEvent.eventType) && this.sessioncode == supportSessionChangeEvent.sessioncode && im3.n(this.supportSession, supportSessionChangeEvent.supportSession);
    }

    @Override // com.teamviewer.apidefinitions.supportsessions.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final int getSessioncode() {
        return this.sessioncode;
    }

    public final SupportSession getSupportSession() {
        return this.supportSession;
    }

    public int hashCode() {
        int iA = fx3.a(this.sessioncode, this.eventType.hashCode() * 31, 31);
        SupportSession supportSession = this.supportSession;
        return iA + (supportSession == null ? 0 : supportSession.hashCode());
    }

    public String toString() {
        return "SupportSessionChangeEvent(eventType=" + this.eventType + ", sessioncode=" + this.sessioncode + ", supportSession=" + this.supportSession + ")";
    }

    public /* synthetic */ SupportSessionChangeEvent(String str, int i, SupportSession supportSession, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : supportSession);
    }
}
