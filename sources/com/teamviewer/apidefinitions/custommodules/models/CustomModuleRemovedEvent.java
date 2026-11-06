package com.teamviewer.apidefinitions.custommodules.models;

import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleRemovedEvent;", "Lcom/teamviewer/apidefinitions/custommodules/models/TeamViewerEvent;", "eventType", "", "moduleId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getModuleId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomModuleRemovedEvent implements TeamViewerEvent {
    private final String eventType;
    private final String moduleId;

    public CustomModuleRemovedEvent(@sp3(name = "eventType") String str, @sp3(name = "moduleId") String str2) {
        str.getClass();
        str2.getClass();
        this.eventType = str;
        this.moduleId = str2;
    }

    public static /* synthetic */ CustomModuleRemovedEvent copy$default(CustomModuleRemovedEvent customModuleRemovedEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customModuleRemovedEvent.eventType;
        }
        if ((i & 2) != 0) {
            str2 = customModuleRemovedEvent.moduleId;
        }
        return customModuleRemovedEvent.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    public final CustomModuleRemovedEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "moduleId") String moduleId) {
        eventType.getClass();
        moduleId.getClass();
        return new CustomModuleRemovedEvent(eventType, moduleId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomModuleRemovedEvent)) {
            return false;
        }
        CustomModuleRemovedEvent customModuleRemovedEvent = (CustomModuleRemovedEvent) other;
        return im3.n(this.eventType, customModuleRemovedEvent.eventType) && im3.n(this.moduleId, customModuleRemovedEvent.moduleId);
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public final String getModuleId() {
        return this.moduleId;
    }

    public int hashCode() {
        return this.moduleId.hashCode() + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return fx3.h("CustomModuleRemovedEvent(eventType=", this.eventType, ", moduleId=", this.moduleId, ")");
    }
}
