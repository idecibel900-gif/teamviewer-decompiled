package com.teamviewer.apidefinitions.manageddevices.models;

import kotlin.Metadata;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/LocalDeviceChangedEvent;", "Lcom/teamviewer/apidefinitions/manageddevices/models/TeamViewerEvent;", "eventType", "", "<init>", "(Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalDeviceChangedEvent implements TeamViewerEvent {
    private final String eventType;

    public LocalDeviceChangedEvent(@sp3(name = "eventType") String str) {
        str.getClass();
        this.eventType = str;
    }

    @Override // com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }
}
