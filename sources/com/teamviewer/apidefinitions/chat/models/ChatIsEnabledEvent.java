package com.teamviewer.apidefinitions.chat.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatIsEnabledEvent;", "Lcom/teamviewer/apidefinitions/chat/models/TeamViewerEvent;", "eventType", "", "isEnabled", "", "<init>", "(Ljava/lang/String;Z)V", "getEventType", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatIsEnabledEvent implements TeamViewerEvent {
    private final String eventType;
    private final boolean isEnabled;

    public ChatIsEnabledEvent(@sp3(name = "eventType") String str, @sp3(name = "isEnabled") boolean z) {
        str.getClass();
        this.eventType = str;
        this.isEnabled = z;
    }

    public static /* synthetic */ ChatIsEnabledEvent copy$default(ChatIsEnabledEvent chatIsEnabledEvent, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatIsEnabledEvent.eventType;
        }
        if ((i & 2) != 0) {
            z = chatIsEnabledEvent.isEnabled;
        }
        return chatIsEnabledEvent.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final ChatIsEnabledEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "isEnabled") boolean isEnabled) {
        eventType.getClass();
        return new ChatIsEnabledEvent(eventType, isEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatIsEnabledEvent)) {
            return false;
        }
        ChatIsEnabledEvent chatIsEnabledEvent = (ChatIsEnabledEvent) other;
        return im3.n(this.eventType, chatIsEnabledEvent.eventType) && this.isEnabled == chatIsEnabledEvent.isEnabled;
    }

    @Override // com.teamviewer.apidefinitions.chat.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEnabled) + (this.eventType.hashCode() * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "ChatIsEnabledEvent(eventType=" + this.eventType + ", isEnabled=" + this.isEnabled + ")";
    }
}
