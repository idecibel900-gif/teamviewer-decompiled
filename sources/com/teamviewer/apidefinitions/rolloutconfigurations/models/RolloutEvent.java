package com.teamviewer.apidefinitions.rolloutconfigurations.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutEvent;", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/TeamViewerEvent;", "eventType", "", "rolloutConfigId", "Ljava/util/UUID;", "rolloutConfig", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfiguration;", "notificationType", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutNotificationType;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfiguration;Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutNotificationType;)V", "getEventType", "()Ljava/lang/String;", "getRolloutConfigId", "()Ljava/util/UUID;", "getRolloutConfig", "()Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfiguration;", "getNotificationType", "()Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutNotificationType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RolloutEvent implements TeamViewerEvent {
    private final String eventType;
    private final RolloutNotificationType notificationType;
    private final RolloutConfiguration rolloutConfig;
    private final UUID rolloutConfigId;

    public RolloutEvent(@sp3(name = "eventType") String str, @sp3(name = "rolloutConfigId") UUID uuid, @sp3(name = "rolloutConfig") RolloutConfiguration rolloutConfiguration, @sp3(name = "notificationType") RolloutNotificationType rolloutNotificationType) {
        str.getClass();
        uuid.getClass();
        rolloutConfiguration.getClass();
        rolloutNotificationType.getClass();
        this.eventType = str;
        this.rolloutConfigId = uuid;
        this.rolloutConfig = rolloutConfiguration;
        this.notificationType = rolloutNotificationType;
    }

    public static /* synthetic */ RolloutEvent copy$default(RolloutEvent rolloutEvent, String str, UUID uuid, RolloutConfiguration rolloutConfiguration, RolloutNotificationType rolloutNotificationType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rolloutEvent.eventType;
        }
        if ((i & 2) != 0) {
            uuid = rolloutEvent.rolloutConfigId;
        }
        if ((i & 4) != 0) {
            rolloutConfiguration = rolloutEvent.rolloutConfig;
        }
        if ((i & 8) != 0) {
            rolloutNotificationType = rolloutEvent.notificationType;
        }
        return rolloutEvent.copy(str, uuid, rolloutConfiguration, rolloutNotificationType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getRolloutConfigId() {
        return this.rolloutConfigId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RolloutConfiguration getRolloutConfig() {
        return this.rolloutConfig;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RolloutNotificationType getNotificationType() {
        return this.notificationType;
    }

    public final RolloutEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "rolloutConfigId") UUID rolloutConfigId, @sp3(name = "rolloutConfig") RolloutConfiguration rolloutConfig, @sp3(name = "notificationType") RolloutNotificationType notificationType) {
        eventType.getClass();
        rolloutConfigId.getClass();
        rolloutConfig.getClass();
        notificationType.getClass();
        return new RolloutEvent(eventType, rolloutConfigId, rolloutConfig, notificationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RolloutEvent)) {
            return false;
        }
        RolloutEvent rolloutEvent = (RolloutEvent) other;
        return im3.n(this.eventType, rolloutEvent.eventType) && im3.n(this.rolloutConfigId, rolloutEvent.rolloutConfigId) && im3.n(this.rolloutConfig, rolloutEvent.rolloutConfig) && this.notificationType == rolloutEvent.notificationType;
    }

    @Override // com.teamviewer.apidefinitions.rolloutconfigurations.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final RolloutNotificationType getNotificationType() {
        return this.notificationType;
    }

    public final RolloutConfiguration getRolloutConfig() {
        return this.rolloutConfig;
    }

    public final UUID getRolloutConfigId() {
        return this.rolloutConfigId;
    }

    public int hashCode() {
        return this.notificationType.hashCode() + ((this.rolloutConfig.hashCode() + ua5.e(this.rolloutConfigId, this.eventType.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        return "RolloutEvent(eventType=" + this.eventType + ", rolloutConfigId=" + this.rolloutConfigId + ", rolloutConfig=" + this.rolloutConfig + ", notificationType=" + this.notificationType + ")";
    }
}
